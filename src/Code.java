import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;

public class Code {
	
	private String[] op = {"+", "-", "*", ">", "<", "<=", "==", ">="};
	
	private String code;
	private String output;
	private TDS tds;
	
	public Code(String toSave, TDS tds){
		code = "EXIT_EXC EQU 64\n\n";
		code += "READ_EXC EQU 65\n\n";
		code += "WRITE_EXC EQU 66\n\n";
		code += "STACK_ADRS EQU 0X1000\n\n";
		code += "LOAD_ADRS EQU 0XF000\n\n";
		code += "ORG LOAD_ADRS\n\n";
		code += "start debut\n\n";
		code += "\ndebut\n\n";
		output = toSave;
		this.tds = tds;
	}
	
	public boolean save() throws Exception{
		File out = new File(output);
		System.out.println(code);
		code += "TRP #EXIT_EXC\n\n"
				+ "LDW R14, #EXIT_EXC\n\n"
				+ "TRP R14\n\n";
		code += "JEA @debut\n\n"+
				"LDW R14, #debut\n\n"+
				"JEA (R14)\n\n";
		BufferedWriter s;
		try {
			s = new BufferedWriter(new FileWriter(out)) ;
		} catch (IOException e) {
			throw new Exception("You can't write on file" + output);
		}
		s.write(code);
		s.close();
		return true;
	}
	
	public boolean generate(CommonTree t){
		if (t.getText() != null){
			code += generbis(t);
		}
		else{
			java.util.List<BaseTree> l = t.getChildren();
			
			if (l != null){
				for (BaseTree t2 : l){
					code += generbis(t2);
				}
			}	
		}
		
		
		
		
		
		
		return true;
	}
	
	private String generbis(BaseTree t2) {
		String code = "";
		System.out.println(t2.getText());
		if (t2.getText().equals("DoExpr")){
			String co= generateOperation((BaseTree) t2.getChild(0));
			code += co;
		}
		else {
			if (t2.getText().equals("write")){
			String co = generateOperation((BaseTree) t2.getChild(0));
			co += "TRP R0\n\n";
			code += co;
			}
		}
		return code;
	}

	public String generateOperation(BaseTree t2){;
		if (!Arrays.asList(op).contains(t2.getText())){
			return generateValue(t2);
		}
		else{
			switch (t2.getText()){
			case "+":
				return generateAdd(t2);
			case "-":
				return generateSub(t2);
			case "*":
				return generateMul(t2);
			default:
				return "OLOL pas géré";
			}
			
		}
	}
	
	public String generateAdd(BaseTree t2){
		BaseTree leftSide = (BaseTree) t2.getChild(0);
		BaseTree rightSide = (BaseTree) t2.getChild(1);
		String code1 = generateOperation(leftSide);
		String code = code1+"stw R0, (R15)+\n\n";
		String code2 = generateOperation(rightSide);
		code += code2;
		code += "ldw R1, -(R15)\n\n" + "add R1, R0, R0\n\n";
		return code;
	}
	
	public String generateSub(BaseTree t2){
		BaseTree leftSide = (BaseTree) t2.getChild(0);
		BaseTree rightSide = (BaseTree) t2.getChild(1);
		String code1 = generateOperation(leftSide);
		String code = code1+"stw R0, (R15)+\n\n";
		String code2 = generateOperation(rightSide);
		code += code2;
		code += "ldw R1, -(R15)\n\n" + "sub R1, R0, R0\n\n";
		return code;
	}
	
	public String generateFor(BaseTree t2){
		BaseTree in = (BaseTree) t2.getChild(0);
		BaseTree doo = (BaseTree) t2.getChild(1);
		return null;
	}
	
	public String generateMul(BaseTree t2){
		BaseTree leftSide = (BaseTree) t2.getChild(0);
		BaseTree rightSide = (BaseTree) t2.getChild(1);
		String code1 = generateOperation(leftSide);
		String code = code1+"stw R0, (R15)+\n\n";
		String code2 = generateOperation(rightSide);
		code += code2;
		code += "ldw R1, -(R15)\n\n" + "mul R1, R0, R0\n\n";
		return code;
	}
	
	public String generateValue(BaseTree t2){
		String s = t2.getText();
		if (isInteger(s)){
			return "ldw R0, #" + Integer.parseInt(s) + "\n\n";
		}
		else{
			if (t2.getChildCount() != 0){
				return "Non géré";
			}
			else{
				return null;
			}
		}
	}
	
	public String generateWite(BaseTree t2){
		String code1 = generateOperation((BaseTree) t2.getChild(0));
		String code = code1;
		code += "TRP R0\n\n";
		return code;
	}
	
	public static boolean isInteger(String s) {
	    return isInteger(s,10);
	}

	public static boolean isInteger(String s, int radix) {
	    if(s.isEmpty()) return false;
	    for(int i = 0; i < s.length(); i++) {
	        if(i == 0 && s.charAt(i) == '-') {
	            if(s.length() == 1) return false;
	            else continue;
	        }
	        if(Character.digit(s.charAt(i),radix) < 0) return false;
	    }
	    return true;
	}
}















