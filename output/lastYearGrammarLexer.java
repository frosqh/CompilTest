// $ANTLR null /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g 2018-01-26 16:23:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lastYearGrammarLexer extends Lexer {
	public static final int EOF=-1;
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
	public static final int BOOLOPER=4;
	public static final int COMMENT=5;
	public static final int ClassStat=6;
	public static final int DoExpr=7;
	public static final int DoStat=8;
	public static final int EndStat=9;
	public static final int FiStat=10;
	public static final int ForStat=11;
	public static final int IDF=12;
	public static final int IDFMAJ=13;
	public static final int INT=14;
	public static final int INTTYPE=15;
	public static final int IfStat=16;
	public static final int InStat=17;
	public static final int InheritStat=18;
	public static final int Inner=19;
	public static final int MethodStat=20;
	public static final int NewStat=21;
	public static final int ReadStat=22;
	public static final int ReturnStat=23;
	public static final int STRING=24;
	public static final int STRINGTYPE=25;
	public static final int SuperStat=26;
	public static final int ThenStat=27;
	public static final int ThisStat=28;
	public static final int VarStat=29;
	public static final int Void=30;
	public static final int WS=31;
	public static final int WriteStat=32;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public lastYearGrammarLexer() {} 
	public lastYearGrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public lastYearGrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g"; }

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:2:7: ( '(' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:2:9: '('
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:3:7: ( ')' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:3:9: ')'
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:4:7: ( '*' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:4:9: '*'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:5:7: ( '+' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:5:9: '+'
			{
			match('+'); 
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
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:6:7: ( ',' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:6:9: ','
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:7:7: ( '-' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:7:9: '-'
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:8:7: ( '.' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:8:9: '.'
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:9:7: ( '..' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:9:9: '..'
			{
			match(".."); 

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
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:10:7: ( '/' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:10:9: '/'
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:11:7: ( ':' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:11:9: ':'
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:12:7: ( ':=' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:12:9: ':='
			{
			match(":="); 

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
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:13:7: ( ';' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:13:9: ';'
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:14:7: ( '=' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:14:9: '='
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:15:7: ( 'else' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:15:9: 'else'
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:16:7: ( '{' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:16:9: '{'
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
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:17:7: ( '}' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:17:9: '}'
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
	// $ANTLR end "T__48"

	// $ANTLR start "InheritStat"
	public final void mInheritStat() throws RecognitionException {
		try {
			int _type = InheritStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:25:15: ( 'inherit' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:25:17: 'inherit'
			{
			match("inherit"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "InheritStat"

	// $ANTLR start "ClassStat"
	public final void mClassStat() throws RecognitionException {
		try {
			int _type = ClassStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:28:13: ( 'class' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:28:15: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ClassStat"

	// $ANTLR start "VarStat"
	public final void mVarStat() throws RecognitionException {
		try {
			int _type = VarStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:37:11: ( 'var' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:37:13: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VarStat"

	// $ANTLR start "MethodStat"
	public final void mMethodStat() throws RecognitionException {
		try {
			int _type = MethodStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:53:14: ( 'method' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:53:16: 'method'
			{
			match("method"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MethodStat"

	// $ANTLR start "IfStat"
	public final void mIfStat() throws RecognitionException {
		try {
			int _type = IfStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:68:10: ( 'if' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:68:12: 'if'
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
	// $ANTLR end "IfStat"

	// $ANTLR start "ThenStat"
	public final void mThenStat() throws RecognitionException {
		try {
			int _type = ThenStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:70:12: ( 'then' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:70:14: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ThenStat"

	// $ANTLR start "FiStat"
	public final void mFiStat() throws RecognitionException {
		try {
			int _type = FiStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:72:10: ( 'fi' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:72:12: 'fi'
			{
			match("fi"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FiStat"

	// $ANTLR start "ForStat"
	public final void mForStat() throws RecognitionException {
		try {
			int _type = ForStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:74:11: ( 'for' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:74:13: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ForStat"

	// $ANTLR start "InStat"
	public final void mInStat() throws RecognitionException {
		try {
			int _type = InStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:76:10: ( 'in' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:76:12: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "InStat"

	// $ANTLR start "DoStat"
	public final void mDoStat() throws RecognitionException {
		try {
			int _type = DoStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:79:10: ( 'do' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:79:12: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DoStat"

	// $ANTLR start "EndStat"
	public final void mEndStat() throws RecognitionException {
		try {
			int _type = EndStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:82:11: ( 'end' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:82:13: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EndStat"

	// $ANTLR start "WriteStat"
	public final void mWriteStat() throws RecognitionException {
		try {
			int _type = WriteStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:87:13: ( 'write' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:87:15: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WriteStat"

	// $ANTLR start "ReadStat"
	public final void mReadStat() throws RecognitionException {
		try {
			int _type = ReadStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:92:12: ( 'read' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:92:14: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ReadStat"

	// $ANTLR start "ReturnStat"
	public final void mReturnStat() throws RecognitionException {
		try {
			int _type = ReturnStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:97:14: ( 'return' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:97:16: 'return'
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
	// $ANTLR end "ReturnStat"

	// $ANTLR start "ThisStat"
	public final void mThisStat() throws RecognitionException {
		try {
			int _type = ThisStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:134:12: ( 'this' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:134:14: 'this'
			{
			match("this"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ThisStat"

	// $ANTLR start "SuperStat"
	public final void mSuperStat() throws RecognitionException {
		try {
			int _type = SuperStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:136:13: ( 'super' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:136:15: 'super'
			{
			match("super"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SuperStat"

	// $ANTLR start "NewStat"
	public final void mNewStat() throws RecognitionException {
		try {
			int _type = NewStat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:138:11: ( 'new' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:138:13: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NewStat"

	// $ANTLR start "BOOLOPER"
	public final void mBOOLOPER() throws RecognitionException {
		try {
			int _type = BOOLOPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:143:12: ( '<' | '<=' | '>' | '>=' | '==' | '!=' )
			int alt1=6;
			switch ( input.LA(1) ) {
			case '<':
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='=') ) {
					alt1=2;
				}

				else {
					alt1=1;
				}

				}
				break;
			case '>':
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2=='=') ) {
					alt1=4;
				}

				else {
					alt1=3;
				}

				}
				break;
			case '=':
				{
				alt1=5;
				}
				break;
			case '!':
				{
				alt1=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:143:14: '<'
					{
					match('<'); 
					}
					break;
				case 2 :
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:143:20: '<='
					{
					match("<="); 

					}
					break;
				case 3 :
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:143:27: '>'
					{
					match('>'); 
					}
					break;
				case 4 :
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:143:33: '>='
					{
					match(">="); 

					}
					break;
				case 5 :
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:143:40: '=='
					{
					match("=="); 

					}
					break;
				case 6 :
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:143:47: '!='
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
	// $ANTLR end "BOOLOPER"

	// $ANTLR start "INTTYPE"
	public final void mINTTYPE() throws RecognitionException {
		try {
			int _type = INTTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:145:18: ( 'int' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:145:20: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTTYPE"

	// $ANTLR start "STRINGTYPE"
	public final void mSTRINGTYPE() throws RecognitionException {
		try {
			int _type = STRINGTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:148:18: ( 'String' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:148:20: 'String'
			{
			match("String"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGTYPE"

	// $ANTLR start "IDFMAJ"
	public final void mIDFMAJ() throws RecognitionException {
		try {
			int _type = IDFMAJ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:151:10: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:151:12: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:151:23: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:
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
					break loop2;
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
	// $ANTLR end "IDFMAJ"

	// $ANTLR start "IDF"
	public final void mIDF() throws RecognitionException {
		try {
			int _type = IDF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:152:9: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:152:11: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:152:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:
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
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:155:8: ( ( '0' .. '9' )+ )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:155:10: ( '0' .. '9' )+
			{
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:155:10: ( '0' .. '9' )+
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
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:
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
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:159:3: ( '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:159:3: '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:159:7: (~ ( '\\r' | '\\n' | '\"' ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:
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
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:162:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:162:13: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:162:18: ( options {greedy=false; } : . )*
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
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:162:46: .
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:164:8: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:164:10: ( ' ' | '\\t' | '\\r' | '\\n' )
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
		// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:8: ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | InheritStat | ClassStat | VarStat | MethodStat | IfStat | ThenStat | FiStat | ForStat | InStat | DoStat | EndStat | WriteStat | ReadStat | ReturnStat | ThisStat | SuperStat | NewStat | BOOLOPER | INTTYPE | STRINGTYPE | IDFMAJ | IDF | INT | STRING | COMMENT | WS )
		int alt7=42;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:10: T__33
				{
				mT__33(); 

				}
				break;
			case 2 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:16: T__34
				{
				mT__34(); 

				}
				break;
			case 3 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:22: T__35
				{
				mT__35(); 

				}
				break;
			case 4 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:28: T__36
				{
				mT__36(); 

				}
				break;
			case 5 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:34: T__37
				{
				mT__37(); 

				}
				break;
			case 6 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:40: T__38
				{
				mT__38(); 

				}
				break;
			case 7 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:46: T__39
				{
				mT__39(); 

				}
				break;
			case 8 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:52: T__40
				{
				mT__40(); 

				}
				break;
			case 9 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:58: T__41
				{
				mT__41(); 

				}
				break;
			case 10 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:64: T__42
				{
				mT__42(); 

				}
				break;
			case 11 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:70: T__43
				{
				mT__43(); 

				}
				break;
			case 12 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:76: T__44
				{
				mT__44(); 

				}
				break;
			case 13 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:82: T__45
				{
				mT__45(); 

				}
				break;
			case 14 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:88: T__46
				{
				mT__46(); 

				}
				break;
			case 15 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:94: T__47
				{
				mT__47(); 

				}
				break;
			case 16 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:100: T__48
				{
				mT__48(); 

				}
				break;
			case 17 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:106: InheritStat
				{
				mInheritStat(); 

				}
				break;
			case 18 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:118: ClassStat
				{
				mClassStat(); 

				}
				break;
			case 19 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:128: VarStat
				{
				mVarStat(); 

				}
				break;
			case 20 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:136: MethodStat
				{
				mMethodStat(); 

				}
				break;
			case 21 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:147: IfStat
				{
				mIfStat(); 

				}
				break;
			case 22 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:154: ThenStat
				{
				mThenStat(); 

				}
				break;
			case 23 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:163: FiStat
				{
				mFiStat(); 

				}
				break;
			case 24 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:170: ForStat
				{
				mForStat(); 

				}
				break;
			case 25 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:178: InStat
				{
				mInStat(); 

				}
				break;
			case 26 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:185: DoStat
				{
				mDoStat(); 

				}
				break;
			case 27 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:192: EndStat
				{
				mEndStat(); 

				}
				break;
			case 28 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:200: WriteStat
				{
				mWriteStat(); 

				}
				break;
			case 29 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:210: ReadStat
				{
				mReadStat(); 

				}
				break;
			case 30 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:219: ReturnStat
				{
				mReturnStat(); 

				}
				break;
			case 31 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:230: ThisStat
				{
				mThisStat(); 

				}
				break;
			case 32 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:239: SuperStat
				{
				mSuperStat(); 

				}
				break;
			case 33 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:249: NewStat
				{
				mNewStat(); 

				}
				break;
			case 34 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:257: BOOLOPER
				{
				mBOOLOPER(); 

				}
				break;
			case 35 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:266: INTTYPE
				{
				mINTTYPE(); 

				}
				break;
			case 36 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:274: STRINGTYPE
				{
				mSTRINGTYPE(); 

				}
				break;
			case 37 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:285: IDFMAJ
				{
				mIDFMAJ(); 

				}
				break;
			case 38 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:292: IDF
				{
				mIDF(); 

				}
				break;
			case 39 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:296: INT
				{
				mINT(); 

				}
				break;
			case 40 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:300: STRING
				{
				mSTRING(); 

				}
				break;
			case 41 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:307: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 42 :
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:1:315: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\7\uffff\1\42\1\44\1\46\1\uffff\1\47\1\35\2\uffff\13\35\1\uffff\1\34\14"+
		"\uffff\2\35\1\74\1\75\4\35\1\103\1\35\1\105\4\35\1\34\1\35\1\115\1\35"+
		"\1\117\2\uffff\1\35\1\121\3\35\1\uffff\1\125\1\uffff\4\35\1\132\1\34\1"+
		"\134\1\uffff\1\35\1\uffff\1\35\1\uffff\1\35\1\140\1\141\1\uffff\1\35\1"+
		"\143\2\35\1\uffff\1\34\1\uffff\1\35\1\150\1\35\2\uffff\1\152\1\uffff\1"+
		"\35\1\154\1\34\1\35\1\uffff\1\157\1\uffff\1\160\1\uffff\1\161\1\162\4"+
		"\uffff";
	static final String DFA7_eofS =
		"\163\uffff";
	static final String DFA7_minS =
		"\1\11\6\uffff\1\56\1\52\1\75\1\uffff\1\75\1\154\2\uffff\1\146\1\154\1"+
		"\141\1\145\1\150\1\151\1\157\1\162\1\145\1\165\1\145\1\uffff\1\164\14"+
		"\uffff\1\163\1\144\2\60\1\141\1\162\1\164\1\145\1\60\1\162\1\60\1\151"+
		"\1\141\1\160\1\167\1\162\1\145\1\60\1\145\1\60\2\uffff\1\163\1\60\1\150"+
		"\1\156\1\163\1\uffff\1\60\1\uffff\1\164\1\144\1\165\1\145\1\60\1\151\1"+
		"\60\1\uffff\1\162\1\uffff\1\163\1\uffff\1\157\2\60\1\uffff\1\145\1\60"+
		"\2\162\1\uffff\1\156\1\uffff\1\151\1\60\1\144\2\uffff\1\60\1\uffff\1\156"+
		"\1\60\1\147\1\164\1\uffff\1\60\1\uffff\1\60\1\uffff\2\60\4\uffff";
	static final String DFA7_maxS =
		"\1\175\6\uffff\1\56\1\52\1\75\1\uffff\1\75\1\156\2\uffff\1\156\1\154\1"+
		"\141\1\145\1\150\2\157\1\162\1\145\1\165\1\145\1\uffff\1\164\14\uffff"+
		"\1\163\1\144\2\172\1\141\1\162\1\164\1\151\1\172\1\162\1\172\1\151\1\164"+
		"\1\160\1\167\1\162\1\145\1\172\1\145\1\172\2\uffff\1\163\1\172\1\150\1"+
		"\156\1\163\1\uffff\1\172\1\uffff\1\164\1\144\1\165\1\145\1\172\1\151\1"+
		"\172\1\uffff\1\162\1\uffff\1\163\1\uffff\1\157\2\172\1\uffff\1\145\1\172"+
		"\2\162\1\uffff\1\156\1\uffff\1\151\1\172\1\144\2\uffff\1\172\1\uffff\1"+
		"\156\1\172\1\147\1\164\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\4\uffff";
	static final String DFA7_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff\1\14\2\uffff\1\17\1\20\13\uffff"+
		"\1\42\1\uffff\1\45\1\46\1\47\1\50\1\52\1\10\1\7\1\51\1\11\1\13\1\12\1"+
		"\15\24\uffff\1\31\1\25\5\uffff\1\27\1\uffff\1\32\7\uffff\1\33\1\uffff"+
		"\1\43\1\uffff\1\23\3\uffff\1\30\4\uffff\1\41\1\uffff\1\16\3\uffff\1\26"+
		"\1\37\1\uffff\1\35\4\uffff\1\22\1\uffff\1\34\1\uffff\1\40\2\uffff\1\24"+
		"\1\36\1\44\1\21";
	static final String DFA7_specialS =
		"\163\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\40\2\uffff\1\40\22\uffff\1\40\1\32\1\37\5\uffff\1\1\1\2\1\3\1\4\1"+
			"\5\1\6\1\7\1\10\12\36\1\11\1\12\1\32\1\13\1\32\2\uffff\22\34\1\33\7\34"+
			"\6\uffff\2\35\1\20\1\25\1\14\1\24\2\35\1\17\3\35\1\22\1\31\3\35\1\27"+
			"\1\30\1\23\1\35\1\21\1\26\3\35\1\15\1\uffff\1\16",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\41",
			"\1\43",
			"\1\45",
			"",
			"\1\32",
			"\1\50\1\uffff\1\51",
			"",
			"",
			"\1\53\7\uffff\1\52",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60\5\uffff\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"",
			"\1\67",
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
			"",
			"",
			"\1\70",
			"\1\71",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\7\35\1\72\13\35\1\73\6\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101\3\uffff\1\102",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\104",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\106",
			"\1\107\22\uffff\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\116",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"",
			"\1\120",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\122",
			"\1\123",
			"\1\124",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\133",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\1\135",
			"",
			"\1\136",
			"",
			"\1\137",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\1\142",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\144",
			"\1\145",
			"",
			"\1\146",
			"",
			"\1\147",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\151",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\1\153",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\155",
			"\1\156",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"",
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | InheritStat | ClassStat | VarStat | MethodStat | IfStat | ThenStat | FiStat | ForStat | InStat | DoStat | EndStat | WriteStat | ReadStat | ReturnStat | ThisStat | SuperStat | NewStat | BOOLOPER | INTTYPE | STRINGTYPE | IDFMAJ | IDF | INT | STRING | COMMENT | WS );";
		}
	}

}
