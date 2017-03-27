import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import antlr.collections.List;
public class main2 {
	public static void main(String[] args) throws IOException, RecognitionException{
		CharStream input = null;
		if (args.length > 0){
			input = new ANTLRFileStream(args[0]);
		}
		else{
			input = new ANTLRInputStream(System.in);
		}
		
		GrammarLexer lex = new GrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lex);
		GrammarParser parser = new GrammarParser(tokens);
		GrammarParser.p_return r = parser.p();
		CommonTree t = r.tree;
		//System.out.println("tree="+((Tree)r.tree).toStringTree());
		TDS Tds = new TDS();
		parseTree(t, Tds, false);
		System.out.println(Tds);
		//System.out.println(((BaseTree) t.getChild(0).getChild(6).getChild(0)).getChildren());
	}

	private static void parseTree(CommonTree t, TDS Tds, boolean b) {
		// TODO Auto-generated method stub
		boolean hasChanged;
		//System.out.println("On est dans l'arbre : " + t.toStringTree());
		java.util.List<BaseTree> l = t.getChildren();
		//System.out.println(l);
		if (l != null){
			for (BaseTree AST : l){
				hasChanged = Tds.add(AST);
				parseTree((CommonTree) AST, Tds, hasChanged);
			}
		}
		if (b){
			Tds.goBack();
		}
	}
}
