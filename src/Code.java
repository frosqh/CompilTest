import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class Code {

    private String[] op = {"+", "-", "*", ">", "<", "<=", "==", ">=", "!="};
    private Scope sc;
    private String code;
    private String outputFile;
    private TDS tds;
    private int forCount = 0;
    private int ifCount = 0;
    private int elseCount = 0;
    private int innerCount = 0;

    public Code(String toSave, TDS tds, Scope sc2) {  //Initialisation
        sc = sc2;
        code = "EXIT_EXC EQU 64\n\n";
        code += "READ_EXC EQU 65\n\n";
        code += "WRITE_EXC EQU 66\n\n";
        code += "STACK_ADRS EQU 0X1000\n\n";
        code += "LOAD_ADRS EQU 0XF000\n\n";
        code += "ORG LOAD_ADRS\n\n";
        //code += "LDW R15, #STACK_ADRS \n\n";
        code += "start debut\n\n";
        code += "\ndebut\n\n";
        outputFile = toSave;
        this.tds = tds;
    }

    public boolean save() throws Exception { //Finalisation + sauvegarde du code
        File out = new File(outputFile);
        //System.out.println(code);
        code += "TRP #EXIT_EXC\n\n"
                + "LDW R14, #EXIT_EXC\n\n"
                + "TRP R14\n\n";
        code += "JEA @debut\n\n" +
                "LDW R14, #debut\n\n" +
                "JEA (R14)\n\n";
        BufferedWriter s;
        try {
            s = new BufferedWriter(new FileWriter(out));
        } catch (IOException e) {
            throw new Exception("You can't write on file" + outputFile);
        }
        s.write(code);
        s.close();
        return true;
    }

    public boolean generate(CommonTree t) throws Exception { //Launch function
        if (t.getText() != null) { //If leaf, generate
            code += generbis(t);
        } else { //Else, parse
            java.util.List<BaseTree> l = (List<BaseTree>) t.getChildren();
            if (l != null) {
                for (BaseTree t2 : l) {
                    code += generbis(t2);
                }
            }
        }
        return true;
    }

    private String generbis(BaseTree t2) throws Exception {
        String code = "";
        if (t2.getText().equals("DoExpr")) { //Do -> Operation or Procedure
            String co = generateOperation((BaseTree) t2.getChild(0));
            code += co;
        } else {
            if (t2.getText().equals("write")) { //Write -> Operation or Procedure
                String co = generateOperation((BaseTree) t2.getChild(0));
                co += "TRP R0\n\n"; //To test/complete, works partially
                code += co;
            } else {
                if (t2.getText().equals(":=")) { //Affectation
                    String var = generAffect(t2);
                    code += var;
                } else {
                    if (t2.getText().equals("for")) { //For
                        String forCode = generateFor(t2);
                        code += forCode;
                    } else {
                        if (t2.getText().equals("if")) { //If
                            String ifCode = generateIf(t2);
                            code += ifCode;
                        } else {
                            if (t2.getText().equals("Inner")) { //InnerBlock

                                int ic = innerCount; //Scope position
                                innerCount++;

                                ArrayList<Scope> l = sc.getInnerScopeList(); //get TDS

                                for (Scope s : l) { //get CurrentScope
                                    //System.out.println("Parcours  : " + s.getName());
                                    if (s.getName().equals("Inner" + ic)) {
                                        sc = s;
                                    }
                                }

                                List<BaseTree> l2 = (List<BaseTree>) t2.getChildren(); //parse Block
                                for (BaseTree t : l2) {
                                    code += generbis(t);
                                }
                            }
                        }
                    }
                }
            }
        }
        return code;
    }

    private String generAffect(BaseTree t) throws Exception { //Affectation (format "x := op")
        String code = "";
        Tree t1 = t.getChild(0); //x
        Tree t2 = t.getChild(1); //op

        String ope = generateOperation((BaseTree) t2); //Calcul de op
        int deplacement = getDeplacement(t1.getText()); //Récupération du déplacement de x (dans la TDS)
        String var = "STW R0, (R13)-" + deplacement + "\n\n";
        code += ope;
        code += var;
        return code;

    }

    private int getDeplacement(String text) throws Exception {
        ArrayList<String> l = sc.find(text);
        return Integer.valueOf(l.get(2));
    }

    public String generateOperation(BaseTree t2) throws Exception {
        if (!Arrays.asList(op).contains(t2.getText())) { //Si ce n'est pas une opération
            return generateValue(t2);
        } else {
            switch (t2.getText()) {
                case "+":
                    return generateAdd(t2);
                case "-":
                    return generateSub(t2);
                case "*":
                    return generateMul(t2);
                case ">":
                    return generateG(t2);
                case "<":
                    return generateL(t2);
                case ">=":
                    return generateGeq(t2);
                case "<=":
                    return generateLeq(t2);
                case "==":
                    return generateEq(t2);
                case "!=":
                    return generateDiff(t2);
                default:
                    throw new Exception("Opération non gérée !");
            }

        }
    }

    public String generateDiff(BaseTree t2) throws Exception { //!equal (format "op1-op2")
        BaseTree leftSide = (BaseTree) t2.getChild(0); //op1
        BaseTree rightSide = (BaseTree) t2.getChild(1); //op2
        String code1 = generateOperation(leftSide); //Calcul de op1
        String code = code1 + "stw R0, (R15)+\n\n";
        String code2 = generateOperation(rightSide); //Calcul de op2
        code += code2;
        code += "ldw R1, -(R15)\n\n" + "CMP R1, R0\n\n";
        return code;
    }

    public String generateG(BaseTree t2) throws Exception { //Same as diff
        BaseTree leftSide = (BaseTree) t2.getChild(0);
        BaseTree rightSide = (BaseTree) t2.getChild(1);
        String code1 = generateOperation(leftSide);
        String code = code1 + "stw R0, (R15)+\n\n";
        String code2 = generateOperation(rightSide);
        code += code2;
        code += "ldw R1, -(R15)\n\n" + "CMP R1, R0\n\n";
        return code;
    }

    public String generateGeq(BaseTree t2) throws Exception { //Same as diff
        BaseTree leftSide = (BaseTree) t2.getChild(0);
        BaseTree rightSide = (BaseTree) t2.getChild(1);
        String code1 = generateOperation(leftSide);
        String code = code1 + "stw R0, (R15)+\n\n";
        String code2 = generateOperation(rightSide);
        code += code2;
        code += "ldw R1, -(R15)\n\n" + "CMP R1, R0\n\n";
        return code;
    }

    public String generateEq(BaseTree t2) throws Exception { //Still the same x)
        BaseTree leftSide = (BaseTree) t2.getChild(0);
        BaseTree rightSide = (BaseTree) t2.getChild(1);
        String code1 = generateOperation(leftSide);
        String code = code1 + "stw R0, (R15)+\n\n";
        String code2 = generateOperation(rightSide);
        code += code2;
        code += "ldw R1, -(R15)\n\n" + "CMP R1, R0\n\n";
        return code;
    }

    public String generateLeq(BaseTree t2) throws Exception { //Still the same
        BaseTree leftSide = (BaseTree) t2.getChild(0);
        BaseTree rightSide = (BaseTree) t2.getChild(1);
        String code1 = generateOperation(leftSide);
        String code = code1 + "stw R0, (R15)+\n\n";
        String code2 = generateOperation(rightSide);
        code += code2;
        code += "ldw R1, -(R15)\n\n" + "CMP R1, R0\n\n";
        return code;
    }

    public String generateL(BaseTree t2) throws Exception { //Still the same
        BaseTree leftSide = (BaseTree) t2.getChild(0);
        BaseTree rightSide = (BaseTree) t2.getChild(1);
        String code1 = generateOperation(leftSide);
        String code = code1 + "stw R0, (R15)+\n\n";
        String code2 = generateOperation(rightSide);
        code += code2;
        code += "ldw R1, -(R15)\n\n" + "CMP R1, R0\n\n";
        return code;
    }

    public String generateAdd(BaseTree t2) throws Exception { //Addition > (format "op1+op2")
        BaseTree leftSide = (BaseTree) t2.getChild(0); //op1
        BaseTree rightSide = (BaseTree) t2.getChild(1); //op2
        String code1 = generateOperation(leftSide); //Calcul de op1
        String code = code1 + "stw R0, (R15)+\n\n";
        String code2 = generateOperation(rightSide); //Calcul de op2
        code += code2;
        code += "ldw R1, -(R15)\n\n" + "add R1, R0, R0\n\n";
        return code;
    }

    public String generateSub(BaseTree t2) throws Exception { //Substraction > (format "op1-op2")
        BaseTree leftSide = (BaseTree) t2.getChild(0); //op1
        BaseTree rightSide = (BaseTree) t2.getChild(1); //op2
        if (rightSide == null) { //Soustraction unaire (si op2 = null, i.e format "-op1")
            String code1 = generateOperation(leftSide); //Calcul de op1
            String code2 = "LDW R2, #-1\n\n";
            return code1 + code2 + "MUL R0,R2,R0 \n\n";
        } else {
            String code1 = generateOperation(leftSide); //Calcul de op1
            String code = code1 + "stw R0, (R15)+\n\n";
            String code2 = generateOperation(rightSide); //Calcul de op2
            code += code2;
            code += "ldw R1, -(R15)\n\n" + "sub R1, R0, R0\n\n";
            return code;
        }
    }

    public String generateFor(BaseTree t2) throws NumberFormatException, Exception { //For
        String code = ""; //Init
        BaseTree in = (BaseTree) t2.getChild(0);
        BaseTree doo = (BaseTree) t2.getChild(1);
        ArrayList<Scope> l = sc.getInnerScopeList();
        forCount++;
        int fc = forCount;
        for (Scope s : l) { //Get currentScope
            if (s.getName().equals("for" + fc)) {
                sc = s;
            }
        }
        int deplacementVar = Integer.valueOf(sc.find(in.getChild(0).getText()).get(2));
        int deplacementBorneSup = Integer.valueOf(sc.find("bornefor" + fc).get(2));
        //TODO A modifier si l'on veut pouvoir gérer des expressions dans les for
        int borneInf = Integer.valueOf(in.getChild(1).getText());
        int borneSup = Integer.valueOf(in.getChild(2).getText());
        code += "LDW R0, #" + borneSup + "\n\n";
        code += "STW R0, (R13)-" + deplacementBorneSup + "\n\n";
        code += "LDW R0, #" + borneInf + "\n\n";
        code += "STW R0, (R13)-" + deplacementVar + "\n\n";
        code += "for" + fc + "\n\n";
        code += "LDW R0, (R13)-" + deplacementVar + "\n\n";
        code += "LDW R1, (R13)-" + deplacementBorneSup + "\n\n";
        code += "CMP R0, R1 \n\n";
        code += "JGT #endfor" + fc + "-$-2\n\n";
        java.util.List<BaseTree> l2 = (List<BaseTree>) doo.getChildren();
        for (BaseTree t : l2) {
            code += generbis(t);
        }
        code += "LDW R0, (R13)-" + deplacementVar + "\n\n";
        code += "ADI R0, R0, #1\n\n";
        code += "STW R0, (R13)-" + deplacementVar + "\n\n";
        code += "JMP #for" + fc + "-$-2\n\n";
        code += "endfor" + fc + "\n\n";
        sc = sc.getAncestor();
        return code;

    }

    public String generateMul(BaseTree t2) throws Exception {
        BaseTree leftSide = (BaseTree) t2.getChild(0);
        BaseTree rightSide = (BaseTree) t2.getChild(1);
        String code1 = generateOperation(leftSide);
        String code = code1 + "stw R0, (R15)+\n\n";
        String code2 = generateOperation(rightSide);
        code += code2;
        code += "ldw R1, -(R15)\n\n" + "mul R1, R0, R0\n\n";
        return code;
    }

    public String generateValue(BaseTree t2) throws Exception {
        String s = t2.getText();
        if (isInteger(s)) {
            return "ldw R0, #" + Integer.parseInt(s) + "\n\n";
        } else {
            if (t2.getChildCount() != 0) {  //méhodes
                return "Non géré";
            } else {
                ArrayList<String> l = sc.find(t2.getText());
                return "LDW R0, (R13)-" + l.get(2) + "\n\n";
            }
        }
    }
	
	/*public String generateWite(BaseTree t2) throws Exception{
		String code1 = generateOperation((BaseTree) t2.getChild(0));
		String code = code1;
		code += "TRP R0\n\n";
		return code;
	}*/

    public static boolean isInteger(String s) {
        return isInteger(s, 10);
    }

    public static boolean isInteger(String s, int in) {
        if (s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                if (s.length() == 1) return false;
                else continue;
            }
            if (Character.digit(s.charAt(i), in) < 0) return false;
        }
        return true;
    }

    public String generateIf(BaseTree t2) throws Exception {
        String code = "";
        Tree bool = t2.getChild(0);
        BaseTree then = (BaseTree) t2.getChild(1);
        code += generateOperation((BaseTree) bool);
        ifCount++;
        int ic = ifCount;
        String jump = "";
        switch (bool.getText()) {
            case ">":
                jump = "JLE ";
                break;
            case ">=":
                jump = "JLW ";
                break;
            case "<":
                jump = "JGE ";
                break;
            case "<=":
                jump = "JGT ";
                break;
            case "==":
                jump = "JNE ";
                break;
            case "!=":
                jump = "JEQ ";
                break;
        }
        String labelif = "if" + ic;

        code += jump + "#" + labelif + "-$-2\n\n";

        List<BaseTree> l2 = (List<BaseTree>) then.getChildren();

        for (BaseTree t : l2) {
            code += generbis(t);
        }

        if (t2.getChildCount() > 2) {
            code += "JMP #else" + ic + "-$-2\n\n";
            code += labelif + "\n\n";
            BaseTree elseT = (BaseTree) t2.getChild(2);
            List<BaseTree> l3 = (List<BaseTree>) elseT.getChildren();

            for (BaseTree t : l3) {
                code += generbis(t);
            }
            code += "else" + ic + "\n\n";
        } else {
            code += labelif + "\n\n";
        }
        return code;
    }
}