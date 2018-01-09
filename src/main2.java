import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
public class main2 {
	
	public static int i;
	public static TDS Tds;
	public static int forCount = 0;
	public static int ifCount = 0;
	public static int elseCount = 0;
	public static int deplacementDynamique = 0;
	
	
	public static void main(String[] args) throws Exception{
		CharStream input;
		String output = "./code";
		if (args.length > 0){
			input = new ANTLRFileStream(args[0]);
			if (args.length > 1){
				output = args[1];
			}
		}
		else{
			input = new ANTLRInputStream(System.in);
		}
		
		GrammarLexer lex = new GrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lex);
		GrammarParser parser = new GrammarParser(tokens);
		GrammarParser.p_return r = parser.p();
		CommonTree t = r.tree;
		Tds = new TDS();
		parseTree(t, Tds, false);
		//System.out.println(Tds);
		generateCode(t, output, Tds.getScope());
		System.exit(0);
	}

	private static void generateCode(CommonTree t, String output, Scope sc) throws Exception {
		Code codeGen = new Code(output, sc);
		codeGen.generate(t);
		try {
			codeGen.save();
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
			e.printStackTrace();
			System.exit(-1);
		}
	}

	private static void parseTree(CommonTree t, TDS Tds, boolean b) {
		int hasChanged;
		//System.out.println("On est dans l'arbre : " + t.toStringTree());
		java.util.List<BaseTree> l = (List<BaseTree>) t.getChildren();
		//System.out.println(l);
		if (l != null){
			//i++;
			for (BaseTree AST : l){
				hasChanged = Tds.add(AST);
				/*
				 * Pour chaque arbre, on regarde si c'est un noeud type de l'AST
				 * Sinon, idf -> dans la TDS ?
				 */
				try {
					Tds.check(AST, t);
					if (hasChanged != 2){
						parseTree((CommonTree) AST, Tds, (hasChanged == 1) );
					}
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
					e.printStackTrace();
				}

			}
		}
		if (b){
			Tds.goBack();
		}
	}
}
