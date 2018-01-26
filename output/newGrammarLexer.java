// $ANTLR null /home/etudiants/raimondi3u/CompilTest/newGrammar.g 2018-01-26 17:37:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class newGrammarLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
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
	public static final int ATTRIBUTE=4;
	public static final int BINAIRE=5;
	public static final int BLOCK=6;
	public static final int BOOL=7;
	public static final int COMMENT=8;
	public static final int IDF=9;
	public static final int IF=10;
	public static final int INT=11;
	public static final int MAIN=12;
	public static final int NEW=13;
	public static final int STRING=14;
	public static final int UNAIRE=15;
	public static final int VEC=16;
	public static final int WS=17;

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
	@Override public String getGrammarFileName() { return "/home/etudiants/raimondi3u/CompilTest/newGrammar.g"; }

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:2:7: ( '&' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:2:9: '&'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:3:7: ( '(' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:3:9: '('
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:4:7: ( ')' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:4:9: ')'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:5:7: ( ',' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:5:9: ','
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:6:7: ( '->' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:6:9: '->'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:7:7: ( '.' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:7:9: '.'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:8:7: ( ':' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:8:9: ':'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:9:7: ( ';' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:9:9: ';'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:10:7: ( '<' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:10:9: '<'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:11:7: ( '=' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:11:9: '='
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:12:7: ( '>' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:12:9: '>'
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:13:7: ( '[' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:13:9: '['
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:14:7: ( ']' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:14:9: ']'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:15:7: ( 'break' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:15:9: 'break'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:16:7: ( 'else' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:16:9: 'else'
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:17:7: ( 'fn' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:17:9: 'fn'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:18:7: ( 'len' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:18:9: 'len'
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:19:7: ( 'let' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:19:9: 'let'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:20:7: ( 'loop' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:20:9: 'loop'
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:21:7: ( 'mut' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:21:9: 'mut'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:22:7: ( 'print' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:22:9: 'print'
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:23:7: ( 'return' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:23:9: 'return'
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:24:7: ( 'struct' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:24:9: 'struct'
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
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:25:7: ( 'vec' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:25:9: 'vec'
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:26:7: ( 'while' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:26:9: 'while'
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:27:7: ( '{' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:27:9: '{'
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:28:7: ( '}' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:28:9: '}'
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
	// $ANTLR end "T__44"

	// $ANTLR start "BINAIRE"
	public final void mBINAIRE() throws RecognitionException {
		try {
			int _type = BINAIRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:114:9: ( '+' | '-' | '*' | '/' | '&&' | '||' | '<' | '<=' | '>' | '>=' | '==' | '!=' )
			int alt1=12;
			switch ( input.LA(1) ) {
			case '+':
				{
				alt1=1;
				}
				break;
			case '-':
				{
				alt1=2;
				}
				break;
			case '*':
				{
				alt1=3;
				}
				break;
			case '/':
				{
				alt1=4;
				}
				break;
			case '&':
				{
				alt1=5;
				}
				break;
			case '|':
				{
				alt1=6;
				}
				break;
			case '<':
				{
				int LA1_7 = input.LA(2);
				if ( (LA1_7=='=') ) {
					alt1=8;
				}

				else {
					alt1=7;
				}

				}
				break;
			case '>':
				{
				int LA1_8 = input.LA(2);
				if ( (LA1_8=='=') ) {
					alt1=10;
				}

				else {
					alt1=9;
				}

				}
				break;
			case '=':
				{
				alt1=11;
				}
				break;
			case '!':
				{
				alt1=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:114:12: '+'
					{
					match('+'); 
					}
					break;
				case 2 :
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:114:18: '-'
					{
					match('-'); 
					}
					break;
				case 3 :
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:114:24: '*'
					{
					match('*'); 
					}
					break;
				case 4 :
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:114:30: '/'
					{
					match('/'); 
					}
					break;
				case 5 :
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:114:36: '&&'
					{
					match("&&"); 

					}
					break;
				case 6 :
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:114:43: '||'
					{
					match("||"); 

					}
					break;
				case 7 :
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:114:50: '<'
					{
					match('<'); 
					}
					break;
				case 8 :
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:114:56: '<='
					{
					match("<="); 

					}
					break;
				case 9 :
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:114:63: '>'
					{
					match('>'); 
					}
					break;
				case 10 :
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:114:69: '>='
					{
					match(">="); 

					}
					break;
				case 11 :
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:114:76: '=='
					{
					match("=="); 

					}
					break;
				case 12 :
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:114:83: '!='
					{
					match("!="); 

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
	// $ANTLR end "BINAIRE"

	// $ANTLR start "UNAIRE"
	public final void mUNAIRE() throws RecognitionException {
		try {
			int _type = UNAIRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:115:8: ( '!' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:115:11: '!'
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

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:117:5: ( 'if' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:117:8: 'if'
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
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:120:7: ( 'main' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:120:9: 'main'
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
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:123:7: ( 'true' | 'false' )
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
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:123:9: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:123:17: 'false'
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
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:126:8: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:126:10: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:126:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:
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
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:130:8: ( ( '0' .. '9' )+ )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:130:10: ( '0' .. '9' )+
			{
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:130:10: ( '0' .. '9' )+
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
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:
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
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:136:3: ( '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:136:3: '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:136:7: (~ ( '\\r' | '\\n' | '\"' ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:
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
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:139:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:139:13: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:139:18: ( options {greedy=false; } : . )*
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
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:139:46: .
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
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:141:11: ( '#' ( options {greedy=false; } : . )* ( '\\n' | '\\t' ) )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:141:13: '#' ( options {greedy=false; } : . )* ( '\\n' | '\\t' )
			{
			match('#'); 
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:141:17: ( options {greedy=false; } : . )*
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
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:141:45: .
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
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:143:8: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:143:10: ( ' ' | '\\t' | '\\r' | '\\n' )
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
		// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | BINAIRE | UNAIRE | IF | MAIN | BOOL | IDF | INT | STRING | COMMENT | ATTRIBUTE | WS )
		int alt8=38;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:10: T__18
				{
				mT__18(); 

				}
				break;
			case 2 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:16: T__19
				{
				mT__19(); 

				}
				break;
			case 3 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:22: T__20
				{
				mT__20(); 

				}
				break;
			case 4 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:28: T__21
				{
				mT__21(); 

				}
				break;
			case 5 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:34: T__22
				{
				mT__22(); 

				}
				break;
			case 6 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:40: T__23
				{
				mT__23(); 

				}
				break;
			case 7 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:46: T__24
				{
				mT__24(); 

				}
				break;
			case 8 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:52: T__25
				{
				mT__25(); 

				}
				break;
			case 9 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:58: T__26
				{
				mT__26(); 

				}
				break;
			case 10 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:64: T__27
				{
				mT__27(); 

				}
				break;
			case 11 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:70: T__28
				{
				mT__28(); 

				}
				break;
			case 12 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:76: T__29
				{
				mT__29(); 

				}
				break;
			case 13 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:82: T__30
				{
				mT__30(); 

				}
				break;
			case 14 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:88: T__31
				{
				mT__31(); 

				}
				break;
			case 15 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:94: T__32
				{
				mT__32(); 

				}
				break;
			case 16 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:100: T__33
				{
				mT__33(); 

				}
				break;
			case 17 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:106: T__34
				{
				mT__34(); 

				}
				break;
			case 18 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:112: T__35
				{
				mT__35(); 

				}
				break;
			case 19 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:118: T__36
				{
				mT__36(); 

				}
				break;
			case 20 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:124: T__37
				{
				mT__37(); 

				}
				break;
			case 21 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:130: T__38
				{
				mT__38(); 

				}
				break;
			case 22 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:136: T__39
				{
				mT__39(); 

				}
				break;
			case 23 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:142: T__40
				{
				mT__40(); 

				}
				break;
			case 24 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:148: T__41
				{
				mT__41(); 

				}
				break;
			case 25 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:154: T__42
				{
				mT__42(); 

				}
				break;
			case 26 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:160: T__43
				{
				mT__43(); 

				}
				break;
			case 27 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:166: T__44
				{
				mT__44(); 

				}
				break;
			case 28 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:172: BINAIRE
				{
				mBINAIRE(); 

				}
				break;
			case 29 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:180: UNAIRE
				{
				mUNAIRE(); 

				}
				break;
			case 30 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:187: IF
				{
				mIF(); 

				}
				break;
			case 31 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:190: MAIN
				{
				mMAIN(); 

				}
				break;
			case 32 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:195: BOOL
				{
				mBOOL(); 

				}
				break;
			case 33 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:200: IDF
				{
				mIDF(); 

				}
				break;
			case 34 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:204: INT
				{
				mINT(); 

				}
				break;
			case 35 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:208: STRING
				{
				mSTRING(); 

				}
				break;
			case 36 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:215: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 37 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:223: ATTRIBUTE
				{
				mATTRIBUTE(); 

				}
				break;
			case 38 :
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:1:233: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\1\uffff\1\44\3\uffff\1\32\3\uffff\1\46\1\47\1\50\2\uffff\12\37\3\uffff"+
		"\1\32\1\67\2\37\12\uffff\2\37\1\74\12\37\2\uffff\1\110\3\37\1\uffff\1"+
		"\37\1\115\1\116\1\37\1\120\4\37\1\125\1\37\1\uffff\2\37\1\131\1\37\2\uffff"+
		"\1\133\1\uffff\1\134\3\37\1\uffff\1\37\1\141\1\142\1\uffff\1\141\2\uffff"+
		"\1\143\2\37\1\146\3\uffff\1\147\1\150\3\uffff";
	static final String DFA8_eofS =
		"\151\uffff";
	static final String DFA8_minS =
		"\1\11\1\46\3\uffff\1\76\3\uffff\3\75\2\uffff\1\162\1\154\1\141\1\145\1"+
		"\141\1\162\1\145\1\164\1\145\1\150\3\uffff\1\52\1\75\1\146\1\162\12\uffff"+
		"\1\145\1\163\1\60\1\154\1\156\1\157\1\164\2\151\1\164\1\162\1\143\1\151"+
		"\2\uffff\1\60\1\165\1\141\1\145\1\uffff\1\163\2\60\1\160\1\60\2\156\2"+
		"\165\1\60\1\154\1\uffff\1\145\1\153\1\60\1\145\2\uffff\1\60\1\uffff\1"+
		"\60\1\164\1\162\1\143\1\uffff\1\145\2\60\1\uffff\1\60\2\uffff\1\60\1\156"+
		"\1\164\1\60\3\uffff\2\60\3\uffff";
	static final String DFA8_maxS =
		"\1\175\1\46\3\uffff\1\76\3\uffff\3\75\2\uffff\1\162\1\154\1\156\1\157"+
		"\1\165\1\162\1\145\1\164\1\145\1\150\3\uffff\1\52\1\75\1\146\1\162\12"+
		"\uffff\1\145\1\163\1\172\1\154\1\164\1\157\1\164\2\151\1\164\1\162\1\143"+
		"\1\151\2\uffff\1\172\1\165\1\141\1\145\1\uffff\1\163\2\172\1\160\1\172"+
		"\2\156\2\165\1\172\1\154\1\uffff\1\145\1\153\1\172\1\145\2\uffff\1\172"+
		"\1\uffff\1\172\1\164\1\162\1\143\1\uffff\1\145\2\172\1\uffff\1\172\2\uffff"+
		"\1\172\1\156\1\164\1\172\3\uffff\2\172\3\uffff";
	static final String DFA8_acceptS =
		"\2\uffff\1\2\1\3\1\4\1\uffff\1\6\1\7\1\10\3\uffff\1\14\1\15\12\uffff\1"+
		"\32\1\33\1\34\4\uffff\1\41\1\42\1\43\1\45\1\46\1\1\1\5\1\11\1\12\1\13"+
		"\15\uffff\1\44\1\35\4\uffff\1\20\13\uffff\1\36\4\uffff\1\21\1\22\1\uffff"+
		"\1\24\4\uffff\1\30\3\uffff\1\17\1\uffff\1\23\1\37\4\uffff\1\40\1\16\1"+
		"\25\2\uffff\1\31\1\26\1\27";
	static final String DFA8_specialS =
		"\151\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\43\2\uffff\1\43\22\uffff\1\43\1\34\1\41\1\42\2\uffff\1\1\1\uffff\1"+
			"\2\1\3\2\32\1\4\1\5\1\6\1\33\12\40\1\7\1\10\1\11\1\12\1\13\34\uffff\1"+
			"\14\1\uffff\1\15\3\uffff\1\37\1\16\2\37\1\17\1\20\2\37\1\35\2\37\1\21"+
			"\1\22\2\37\1\23\1\37\1\24\1\25\1\36\1\37\1\26\1\27\3\37\1\30\1\32\1\31",
			"\1\32",
			"",
			"",
			"",
			"\1\45",
			"",
			"",
			"",
			"\1\32",
			"\1\32",
			"\1\32",
			"",
			"",
			"\1\51",
			"\1\52",
			"\1\54\14\uffff\1\53",
			"\1\55\11\uffff\1\56",
			"\1\60\23\uffff\1\57",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"",
			"",
			"",
			"\1\66",
			"\1\32",
			"\1\70",
			"\1\71",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\72",
			"\1\73",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\75",
			"\1\76\5\uffff\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\111",
			"\1\112",
			"\1\113",
			"",
			"\1\114",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\117",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\126",
			"",
			"\1\127",
			"\1\130",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\132",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\135",
			"\1\136",
			"\1\137",
			"",
			"\1\140",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\144",
			"\1\145",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
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
			return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | BINAIRE | UNAIRE | IF | MAIN | BOOL | IDF | INT | STRING | COMMENT | ATTRIBUTE | WS );";
		}
	}

}
