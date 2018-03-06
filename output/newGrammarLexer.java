// $ANTLR null /home/frosqh/workspace/CompilTest/newGrammar.g 2018-03-06 11:11:50

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class newGrammarLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int ADDSUB=4;
	public static final int ANDBOOL=5;
	public static final int ATTRIBUTE=6;
	public static final int BLOCK=7;
	public static final int BOOL=8;
	public static final int CALLFUN=9;
	public static final int COMMENT=10;
	public static final int DIV=11;
	public static final int EPERLU=12;
	public static final int EQUAL=13;
	public static final int IDF=14;
	public static final int IF=15;
	public static final int INT=16;
	public static final int MAIN=17;
	public static final int NEW=18;
	public static final int NEXT=19;
	public static final int OPBOOLEQ=20;
	public static final int ORBOOL=21;
	public static final int PREV=22;
	public static final int STAR=23;
	public static final int STRING=24;
	public static final int UNAIRE=25;
	public static final int VEC=26;
	public static final int WS=27;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public newGrammarLexer() {} 
	public newGrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public newGrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/frosqh/workspace/CompilTest/newGrammar.g"; }

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:2:7: ( '(' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:3:7: ( ')' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:4:7: ( ',' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:4:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:5:7: ( '-' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:5:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:6:7: ( '->' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:6:9: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:7:7: ( '.' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:7:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:8:7: ( ':' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:8:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:9:7: ( ';' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:9:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:10:7: ( '[' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:10:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:11:7: ( ']' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:11:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:12:7: ( 'break' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:12:9: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:13:7: ( 'else' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:13:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:14:7: ( 'fn' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:14:9: 'fn'
			{
			match("fn"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:15:7: ( 'len' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:15:9: 'len'
			{
			match("len"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:16:7: ( 'let' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:16:9: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:17:7: ( 'loop' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:17:9: 'loop'
			{
			match("loop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:18:7: ( 'mut' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:18:9: 'mut'
			{
			match("mut"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:19:7: ( 'print' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:19:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:20:7: ( 'return' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:20:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:21:7: ( 'struct' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:21:9: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:22:7: ( 'vec' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:22:9: 'vec'
			{
			match("vec"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:23:7: ( 'while' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:23:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:24:7: ( '{' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:24:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:25:7: ( '}' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:25:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:135:7: ( '=' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:135:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "ORBOOL"
	public final void mORBOOL() throws RecognitionException {
		try {
			int _type = ORBOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:137:8: ( '||' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:137:10: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ORBOOL"

	// $ANTLR start "ANDBOOL"
	public final void mANDBOOL() throws RecognitionException {
		try {
			int _type = ANDBOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:139:9: ( '&&' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:139:11: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANDBOOL"

	// $ANTLR start "PREV"
	public final void mPREV() throws RecognitionException {
		try {
			int _type = PREV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:141:7: ( '<' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:141:10: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PREV"

	// $ANTLR start "NEXT"
	public final void mNEXT() throws RecognitionException {
		try {
			int _type = NEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:142:7: ( '>' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:142:10: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEXT"

	// $ANTLR start "OPBOOLEQ"
	public final void mOPBOOLEQ() throws RecognitionException {
		try {
			int _type = OPBOOLEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:144:10: ( '==' | '!=' | '<=' | '>=' )
			int alt1=4;
			switch ( input.LA(1) ) {
			case '=':
				{
				alt1=1;
				}
				break;
			case '!':
				{
				alt1=2;
				}
				break;
			case '<':
				{
				alt1=3;
				}
				break;
			case '>':
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /home/frosqh/workspace/CompilTest/newGrammar.g:144:12: '=='
					{
					match("=="); 

					}
					break;
				case 2 :
					// /home/frosqh/workspace/CompilTest/newGrammar.g:144:17: '!='
					{
					match("!="); 

					}
					break;
				case 3 :
					// /home/frosqh/workspace/CompilTest/newGrammar.g:144:22: '<='
					{
					match("<="); 

					}
					break;
				case 4 :
					// /home/frosqh/workspace/CompilTest/newGrammar.g:144:27: '>='
					{
					match(">="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPBOOLEQ"

	// $ANTLR start "ADDSUB"
	public final void mADDSUB() throws RecognitionException {
		try {
			int _type = ADDSUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:146:8: ( '+' | '-' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDSUB"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:148:7: ( '*' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:148:10: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:150:5: ( '/' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:150:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "UNAIRE"
	public final void mUNAIRE() throws RecognitionException {
		try {
			int _type = UNAIRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:152:8: ( '!' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:152:11: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNAIRE"

	// $ANTLR start "EPERLU"
	public final void mEPERLU() throws RecognitionException {
		try {
			int _type = EPERLU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:154:9: ( '&' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:154:12: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EPERLU"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:156:5: ( 'if' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:156:8: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:159:7: ( 'main' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:159:9: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:162:7: ( 'true' | 'false' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='t') ) {
				alt2=1;
			}
			else if ( (LA2_0=='f') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/frosqh/workspace/CompilTest/newGrammar.g:162:9: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /home/frosqh/workspace/CompilTest/newGrammar.g:162:17: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "IDF"
	public final void mIDF() throws RecognitionException {
		try {
			int _type = IDF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:165:8: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:165:10: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/frosqh/workspace/CompilTest/newGrammar.g:165:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/frosqh/workspace/CompilTest/newGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDF"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:169:8: ( ( '0' .. '9' )+ )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:169:10: ( '0' .. '9' )+
			{
			// /home/frosqh/workspace/CompilTest/newGrammar.g:169:10: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/frosqh/workspace/CompilTest/newGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:175:3: ( '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:175:3: '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /home/frosqh/workspace/CompilTest/newGrammar.g:175:7: (~ ( '\\r' | '\\n' | '\"' ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/frosqh/workspace/CompilTest/newGrammar.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:178:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:178:13: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// /home/frosqh/workspace/CompilTest/newGrammar.g:178:18: ( options {greedy=false; } : . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='*') ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='/') ) {
						alt6=2;
					}
					else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
						alt6=1;
					}

				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/frosqh/workspace/CompilTest/newGrammar.g:178:46: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "ATTRIBUTE"
	public final void mATTRIBUTE() throws RecognitionException {
		try {
			int _type = ATTRIBUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:180:11: ( '#' ( options {greedy=false; } : . )* ( '\\n' | '\\t' ) )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:180:13: '#' ( options {greedy=false; } : . )* ( '\\n' | '\\t' )
			{
			match('#'); 
			// /home/frosqh/workspace/CompilTest/newGrammar.g:180:17: ( options {greedy=false; } : . )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')) ) {
					alt7=2;
				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\b')||(LA7_0 >= '\u000B' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/frosqh/workspace/CompilTest/newGrammar.g:180:45: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop7;
				}
			}

			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ATTRIBUTE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/frosqh/workspace/CompilTest/newGrammar.g:182:8: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/frosqh/workspace/CompilTest/newGrammar.g:182:10: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/frosqh/workspace/CompilTest/newGrammar.g:1:8: ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | EQUAL | ORBOOL | ANDBOOL | PREV | NEXT | OPBOOLEQ | ADDSUB | STAR | DIV | UNAIRE | EPERLU | IF | MAIN | BOOL | IDF | INT | STRING | COMMENT | ATTRIBUTE | WS )
		int alt8=44;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:10: T__28
				{
				mT__28(); 

				}
				break;
			case 2 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:16: T__29
				{
				mT__29(); 

				}
				break;
			case 3 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:22: T__30
				{
				mT__30(); 

				}
				break;
			case 4 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:28: T__31
				{
				mT__31(); 

				}
				break;
			case 5 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:34: T__32
				{
				mT__32(); 

				}
				break;
			case 6 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:40: T__33
				{
				mT__33(); 

				}
				break;
			case 7 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:46: T__34
				{
				mT__34(); 

				}
				break;
			case 8 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:52: T__35
				{
				mT__35(); 

				}
				break;
			case 9 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:58: T__36
				{
				mT__36(); 

				}
				break;
			case 10 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:64: T__37
				{
				mT__37(); 

				}
				break;
			case 11 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:70: T__38
				{
				mT__38(); 

				}
				break;
			case 12 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:76: T__39
				{
				mT__39(); 

				}
				break;
			case 13 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:82: T__40
				{
				mT__40(); 

				}
				break;
			case 14 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:88: T__41
				{
				mT__41(); 

				}
				break;
			case 15 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:94: T__42
				{
				mT__42(); 

				}
				break;
			case 16 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:100: T__43
				{
				mT__43(); 

				}
				break;
			case 17 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:106: T__44
				{
				mT__44(); 

				}
				break;
			case 18 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:112: T__45
				{
				mT__45(); 

				}
				break;
			case 19 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:118: T__46
				{
				mT__46(); 

				}
				break;
			case 20 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:124: T__47
				{
				mT__47(); 

				}
				break;
			case 21 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:130: T__48
				{
				mT__48(); 

				}
				break;
			case 22 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:136: T__49
				{
				mT__49(); 

				}
				break;
			case 23 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:142: T__50
				{
				mT__50(); 

				}
				break;
			case 24 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:148: T__51
				{
				mT__51(); 

				}
				break;
			case 25 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:154: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 26 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:160: ORBOOL
				{
				mORBOOL(); 

				}
				break;
			case 27 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:167: ANDBOOL
				{
				mANDBOOL(); 

				}
				break;
			case 28 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:175: PREV
				{
				mPREV(); 

				}
				break;
			case 29 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:180: NEXT
				{
				mNEXT(); 

				}
				break;
			case 30 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:185: OPBOOLEQ
				{
				mOPBOOLEQ(); 

				}
				break;
			case 31 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:194: ADDSUB
				{
				mADDSUB(); 

				}
				break;
			case 32 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:201: STAR
				{
				mSTAR(); 

				}
				break;
			case 33 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:206: DIV
				{
				mDIV(); 

				}
				break;
			case 34 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:210: UNAIRE
				{
				mUNAIRE(); 

				}
				break;
			case 35 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:217: EPERLU
				{
				mEPERLU(); 

				}
				break;
			case 36 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:224: IF
				{
				mIF(); 

				}
				break;
			case 37 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:227: MAIN
				{
				mMAIN(); 

				}
				break;
			case 38 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:232: BOOL
				{
				mBOOL(); 

				}
				break;
			case 39 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:237: IDF
				{
				mIDF(); 

				}
				break;
			case 40 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:241: INT
				{
				mINT(); 

				}
				break;
			case 41 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:245: STRING
				{
				mSTRING(); 

				}
				break;
			case 42 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:252: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 43 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:260: ATTRIBUTE
				{
				mATTRIBUTE(); 

				}
				break;
			case 44 :
				// /home/frosqh/workspace/CompilTest/newGrammar.g:1:270: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\4\uffff\1\47\5\uffff\12\41\2\uffff\1\66\1\uffff\1\70\1\71\1\72\1\73\2"+
		"\uffff\1\75\2\41\7\uffff\2\41\1\102\12\41\11\uffff\1\116\3\41\1\uffff"+
		"\1\41\1\123\1\124\1\41\1\126\4\41\1\133\1\41\1\uffff\2\41\1\137\1\41\2"+
		"\uffff\1\141\1\uffff\1\142\3\41\1\uffff\1\41\1\147\1\150\1\uffff\1\147"+
		"\2\uffff\1\151\2\41\1\154\3\uffff\1\155\1\156\3\uffff";
	static final String DFA8_eofS =
		"\157\uffff";
	static final String DFA8_minS =
		"\1\11\3\uffff\1\76\5\uffff\1\162\1\154\1\141\1\145\1\141\1\162\1\145\1"+
		"\164\1\145\1\150\2\uffff\1\75\1\uffff\1\46\3\75\2\uffff\1\52\1\146\1\162"+
		"\7\uffff\1\145\1\163\1\60\1\154\1\156\1\157\1\164\2\151\1\164\1\162\1"+
		"\143\1\151\11\uffff\1\60\1\165\1\141\1\145\1\uffff\1\163\2\60\1\160\1"+
		"\60\2\156\2\165\1\60\1\154\1\uffff\1\145\1\153\1\60\1\145\2\uffff\1\60"+
		"\1\uffff\1\60\1\164\1\162\1\143\1\uffff\1\145\2\60\1\uffff\1\60\2\uffff"+
		"\1\60\1\156\1\164\1\60\3\uffff\2\60\3\uffff";
	static final String DFA8_maxS =
		"\1\175\3\uffff\1\76\5\uffff\1\162\1\154\1\156\1\157\1\165\1\162\1\145"+
		"\1\164\1\145\1\150\2\uffff\1\75\1\uffff\1\46\3\75\2\uffff\1\52\1\146\1"+
		"\162\7\uffff\1\145\1\163\1\172\1\154\1\164\1\157\1\164\2\151\1\164\1\162"+
		"\1\143\1\151\11\uffff\1\172\1\165\1\141\1\145\1\uffff\1\163\2\172\1\160"+
		"\1\172\2\156\2\165\1\172\1\154\1\uffff\1\145\1\153\1\172\1\145\2\uffff"+
		"\1\172\1\uffff\1\172\1\164\1\162\1\143\1\uffff\1\145\2\172\1\uffff\1\172"+
		"\2\uffff\1\172\1\156\1\164\1\172\3\uffff\2\172\3\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\12\uffff\1\27\1\30"+
		"\1\uffff\1\32\4\uffff\1\37\1\40\3\uffff\1\47\1\50\1\51\1\53\1\54\1\5\1"+
		"\4\15\uffff\1\36\1\31\1\33\1\43\1\34\1\35\1\42\1\52\1\41\4\uffff\1\15"+
		"\13\uffff\1\44\4\uffff\1\16\1\17\1\uffff\1\21\4\uffff\1\25\3\uffff\1\14"+
		"\1\uffff\1\20\1\45\4\uffff\1\46\1\13\1\22\2\uffff\1\26\1\23\1\24";
	static final String DFA8_specialS =
		"\157\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\45\2\uffff\1\45\22\uffff\1\45\1\33\1\43\1\44\2\uffff\1\30\1\uffff"+
			"\1\1\1\2\1\35\1\34\1\3\1\4\1\5\1\36\12\42\1\6\1\7\1\31\1\26\1\32\34\uffff"+
			"\1\10\1\uffff\1\11\3\uffff\1\41\1\12\2\41\1\13\1\14\2\41\1\37\2\41\1"+
			"\15\1\16\2\41\1\17\1\41\1\20\1\21\1\40\1\41\1\22\1\23\3\41\1\24\1\27"+
			"\1\25",
			"",
			"",
			"",
			"\1\46",
			"",
			"",
			"",
			"",
			"",
			"\1\50",
			"\1\51",
			"\1\53\14\uffff\1\52",
			"\1\54\11\uffff\1\55",
			"\1\57\23\uffff\1\56",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"",
			"",
			"\1\65",
			"",
			"\1\67",
			"\1\65",
			"\1\65",
			"\1\65",
			"",
			"",
			"\1\74",
			"\1\76",
			"\1\77",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\100",
			"\1\101",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\103",
			"\1\104\5\uffff\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\117",
			"\1\120",
			"\1\121",
			"",
			"\1\122",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\125",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\134",
			"",
			"\1\135",
			"\1\136",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\140",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\143",
			"\1\144",
			"\1\145",
			"",
			"\1\146",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\152",
			"\1\153",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | EQUAL | ORBOOL | ANDBOOL | PREV | NEXT | OPBOOLEQ | ADDSUB | STAR | DIV | UNAIRE | EPERLU | IF | MAIN | BOOL | IDF | INT | STRING | COMMENT | ATTRIBUTE | WS );";
		}
	}

}
