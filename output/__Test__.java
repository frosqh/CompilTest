import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        newGrammarLexer lex = new newGrammarLexer(new ANTLRFileStream("/home/frosqh/workspace/CompilTest/ex1", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        newGrammarParser g = new newGrammarParser(tokens, 49100, null);
        try {
            g.axiom();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}