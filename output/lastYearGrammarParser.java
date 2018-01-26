// $ANTLR null /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g 2018-01-26 16:23:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class lastYearGrammarParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLOPER", "COMMENT", "ClassStat", 
		"DoExpr", "DoStat", "EndStat", "FiStat", "ForStat", "IDF", "IDFMAJ", "INT", 
		"INTTYPE", "IfStat", "InStat", "InheritStat", "Inner", "MethodStat", "NewStat", 
		"ReadStat", "ReturnStat", "STRING", "STRINGTYPE", "SuperStat", "ThenStat", 
		"ThisStat", "VarStat", "Void", "WS", "WriteStat", "'('", "')'", "'*'", 
		"'+'", "','", "'-'", "'.'", "'..'", "'/'", "':'", "':='", "';'", "'='", 
		"'else'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "mOINEXPR", "eXPRESSION2", "sUITE", "pROGRAM", "bOOLEXPR", 
		"nOTMOINSEXPR", "mETHOD_DECL", "iNSTRUCTION", "mETHOD_ARGS", "mULTEXPR", 
		"p", "mETHOD_TYPE", "vAR_DECL", "pRINT", "rETURN2", "aTOMBIS", "aDDEXPR", 
		"cLASS_DECL", "eXPRESSION", "rEAD", "cLASS_ITEM_DECL", "tYPE", "aTOM"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public lastYearGrammarParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public lastYearGrammarParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public lastYearGrammarParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return lastYearGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g"; }


	public static class p_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "p"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:16:1: p : pROGRAM EOF -> pROGRAM ;
	public final lastYearGrammarParser.p_return p() throws RecognitionException {
		lastYearGrammarParser.p_return retval = new lastYearGrammarParser.p_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope pROGRAM1 =null;

		CommonTree EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_pROGRAM=new RewriteRuleSubtreeStream(adaptor,"rule pROGRAM");

		try { dbg.enterRule(getGrammarFileName(), "p");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:16:5: ( pROGRAM EOF -> pROGRAM )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:16:7: pROGRAM EOF
			{
			dbg.location(16,7);
			pushFollow(FOLLOW_pROGRAM_in_p72);
			pROGRAM1=pROGRAM();
			state._fsp--;

			stream_pROGRAM.add(pROGRAM1.getTree());dbg.location(16,15);
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_p74);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: pROGRAM
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 16:19: -> pROGRAM
			{
				dbg.location(16,22);
				adaptor.addChild(root_0, stream_pROGRAM.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(17, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "p");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "p"


	public static class pROGRAM_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "pROGRAM"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:19:1: pROGRAM : ( cLASS_DECL )* ( vAR_DECL )* ( iNSTRUCTION )+ ;
	public final lastYearGrammarParser.pROGRAM_return pROGRAM() throws RecognitionException {
		lastYearGrammarParser.pROGRAM_return retval = new lastYearGrammarParser.pROGRAM_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope cLASS_DECL3 =null;
		ParserRuleReturnScope vAR_DECL4 =null;
		ParserRuleReturnScope iNSTRUCTION5 =null;


		try { dbg.enterRule(getGrammarFileName(), "pROGRAM");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:19:11: ( ( cLASS_DECL )* ( vAR_DECL )* ( iNSTRUCTION )+ )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:19:13: ( cLASS_DECL )* ( vAR_DECL )* ( iNSTRUCTION )+
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(19,13);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:19:13: ( cLASS_DECL )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==ClassStat) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:19:13: cLASS_DECL
					{
					dbg.location(19,13);
					pushFollow(FOLLOW_cLASS_DECL_in_pROGRAM89);
					cLASS_DECL3=cLASS_DECL();
					state._fsp--;

					adaptor.addChild(root_0, cLASS_DECL3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(19,25);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:19:25: ( vAR_DECL )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==VarStat) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:19:25: vAR_DECL
					{
					dbg.location(19,25);
					pushFollow(FOLLOW_vAR_DECL_in_pROGRAM92);
					vAR_DECL4=vAR_DECL();
					state._fsp--;

					adaptor.addChild(root_0, vAR_DECL4.getTree());

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(19,35);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:19:35: ( iNSTRUCTION )+
			int cnt3=0;
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==DoStat||(LA3_0 >= ForStat && LA3_0 <= IDF)||LA3_0==IfStat||(LA3_0 >= ReadStat && LA3_0 <= ReturnStat)||LA3_0==WriteStat||LA3_0==47) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:19:35: iNSTRUCTION
					{
					dbg.location(19,35);
					pushFollow(FOLLOW_iNSTRUCTION_in_pROGRAM95);
					iNSTRUCTION5=iNSTRUCTION();
					state._fsp--;

					adaptor.addChild(root_0, iNSTRUCTION5.getTree());

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt3++;
			}
			} finally {dbg.exitSubRule(3);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(20, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "pROGRAM");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "pROGRAM"


	public static class cLASS_DECL_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cLASS_DECL"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:22:1: cLASS_DECL : ( ClassStat IDFMAJ ( InheritStat IDFMAJ )? '=' ) '(' cLASS_ITEM_DECL ')' -> ^( ClassStat IDFMAJ ( ^( InheritStat IDFMAJ ) )? ( cLASS_ITEM_DECL )? ) ;
	public final lastYearGrammarParser.cLASS_DECL_return cLASS_DECL() throws RecognitionException {
		lastYearGrammarParser.cLASS_DECL_return retval = new lastYearGrammarParser.cLASS_DECL_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ClassStat6=null;
		Token IDFMAJ7=null;
		Token InheritStat8=null;
		Token IDFMAJ9=null;
		Token char_literal10=null;
		Token char_literal11=null;
		Token char_literal13=null;
		ParserRuleReturnScope cLASS_ITEM_DECL12 =null;

		CommonTree ClassStat6_tree=null;
		CommonTree IDFMAJ7_tree=null;
		CommonTree InheritStat8_tree=null;
		CommonTree IDFMAJ9_tree=null;
		CommonTree char_literal10_tree=null;
		CommonTree char_literal11_tree=null;
		CommonTree char_literal13_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_ClassStat=new RewriteRuleTokenStream(adaptor,"token ClassStat");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_InheritStat=new RewriteRuleTokenStream(adaptor,"token InheritStat");
		RewriteRuleTokenStream stream_IDFMAJ=new RewriteRuleTokenStream(adaptor,"token IDFMAJ");
		RewriteRuleSubtreeStream stream_cLASS_ITEM_DECL=new RewriteRuleSubtreeStream(adaptor,"rule cLASS_ITEM_DECL");

		try { dbg.enterRule(getGrammarFileName(), "cLASS_DECL");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(22, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:22:14: ( ( ClassStat IDFMAJ ( InheritStat IDFMAJ )? '=' ) '(' cLASS_ITEM_DECL ')' -> ^( ClassStat IDFMAJ ( ^( InheritStat IDFMAJ ) )? ( cLASS_ITEM_DECL )? ) )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:22:16: ( ClassStat IDFMAJ ( InheritStat IDFMAJ )? '=' ) '(' cLASS_ITEM_DECL ')'
			{
			dbg.location(22,16);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:22:16: ( ClassStat IDFMAJ ( InheritStat IDFMAJ )? '=' )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:22:17: ClassStat IDFMAJ ( InheritStat IDFMAJ )? '='
			{
			dbg.location(22,17);
			ClassStat6=(Token)match(input,ClassStat,FOLLOW_ClassStat_in_cLASS_DECL108);  
			stream_ClassStat.add(ClassStat6);
			dbg.location(22,27);
			IDFMAJ7=(Token)match(input,IDFMAJ,FOLLOW_IDFMAJ_in_cLASS_DECL110);  
			stream_IDFMAJ.add(IDFMAJ7);
			dbg.location(22,34);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:22:34: ( InheritStat IDFMAJ )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==InheritStat) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:22:35: InheritStat IDFMAJ
					{
					dbg.location(22,35);
					InheritStat8=(Token)match(input,InheritStat,FOLLOW_InheritStat_in_cLASS_DECL113);  
					stream_InheritStat.add(InheritStat8);
					dbg.location(22,47);
					IDFMAJ9=(Token)match(input,IDFMAJ,FOLLOW_IDFMAJ_in_cLASS_DECL115);  
					stream_IDFMAJ.add(IDFMAJ9);

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(22,56);
			char_literal10=(Token)match(input,45,FOLLOW_45_in_cLASS_DECL119);  
			stream_45.add(char_literal10);

			}
			dbg.location(22,61);
			char_literal11=(Token)match(input,33,FOLLOW_33_in_cLASS_DECL122);  
			stream_33.add(char_literal11);
			dbg.location(22,65);
			pushFollow(FOLLOW_cLASS_ITEM_DECL_in_cLASS_DECL124);
			cLASS_ITEM_DECL12=cLASS_ITEM_DECL();
			state._fsp--;

			stream_cLASS_ITEM_DECL.add(cLASS_ITEM_DECL12.getTree());dbg.location(22,81);
			char_literal13=(Token)match(input,34,FOLLOW_34_in_cLASS_DECL126);  
			stream_34.add(char_literal13);

			// AST REWRITE
			// elements: IDFMAJ, ClassStat, InheritStat, cLASS_ITEM_DECL, IDFMAJ
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 22:85: -> ^( ClassStat IDFMAJ ( ^( InheritStat IDFMAJ ) )? ( cLASS_ITEM_DECL )? )
			{
				dbg.location(22,88);
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:22:88: ^( ClassStat IDFMAJ ( ^( InheritStat IDFMAJ ) )? ( cLASS_ITEM_DECL )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(22,90);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ClassStat.nextNode(), root_1);
				dbg.location(22,100);
				adaptor.addChild(root_1, stream_IDFMAJ.nextNode());dbg.location(22,107);
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:22:107: ( ^( InheritStat IDFMAJ ) )?
				if ( stream_InheritStat.hasNext()||stream_IDFMAJ.hasNext() ) {
					dbg.location(22,107);
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:22:107: ^( InheritStat IDFMAJ )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					dbg.location(22,109);
					root_2 = (CommonTree)adaptor.becomeRoot(stream_InheritStat.nextNode(), root_2);
					dbg.location(22,121);
					adaptor.addChild(root_2, stream_IDFMAJ.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_InheritStat.reset();
				stream_IDFMAJ.reset();
				dbg.location(22,130);
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:22:130: ( cLASS_ITEM_DECL )?
				if ( stream_cLASS_ITEM_DECL.hasNext() ) {
					dbg.location(22,130);
					adaptor.addChild(root_1, stream_cLASS_ITEM_DECL.nextTree());
				}
				stream_cLASS_ITEM_DECL.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(23, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "cLASS_DECL");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "cLASS_DECL"


	public static class cLASS_ITEM_DECL_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cLASS_ITEM_DECL"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:31:1: cLASS_ITEM_DECL : ( vAR_DECL )* ( mETHOD_DECL )* ;
	public final lastYearGrammarParser.cLASS_ITEM_DECL_return cLASS_ITEM_DECL() throws RecognitionException {
		lastYearGrammarParser.cLASS_ITEM_DECL_return retval = new lastYearGrammarParser.cLASS_ITEM_DECL_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope vAR_DECL14 =null;
		ParserRuleReturnScope mETHOD_DECL15 =null;


		try { dbg.enterRule(getGrammarFileName(), "cLASS_ITEM_DECL");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:31:18: ( ( vAR_DECL )* ( mETHOD_DECL )* )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:31:20: ( vAR_DECL )* ( mETHOD_DECL )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(31,20);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:31:20: ( vAR_DECL )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==VarStat) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:31:20: vAR_DECL
					{
					dbg.location(31,20);
					pushFollow(FOLLOW_vAR_DECL_in_cLASS_ITEM_DECL179);
					vAR_DECL14=vAR_DECL();
					state._fsp--;

					adaptor.addChild(root_0, vAR_DECL14.getTree());

					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(31,30);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:31:30: ( mETHOD_DECL )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==MethodStat) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:31:30: mETHOD_DECL
					{
					dbg.location(31,30);
					pushFollow(FOLLOW_mETHOD_DECL_in_cLASS_ITEM_DECL182);
					mETHOD_DECL15=mETHOD_DECL();
					state._fsp--;

					adaptor.addChild(root_0, mETHOD_DECL15.getTree());

					}
					break;

				default :
					break loop6;
				}
			}
			} finally {dbg.exitSubRule(6);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(32, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "cLASS_ITEM_DECL");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "cLASS_ITEM_DECL"


	public static class vAR_DECL_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "vAR_DECL"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:34:1: vAR_DECL : VarStat IDF ':' tYPE ';' -> ^( VarStat IDF tYPE ) ;
	public final lastYearGrammarParser.vAR_DECL_return vAR_DECL() throws RecognitionException {
		lastYearGrammarParser.vAR_DECL_return retval = new lastYearGrammarParser.vAR_DECL_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token VarStat16=null;
		Token IDF17=null;
		Token char_literal18=null;
		Token char_literal20=null;
		ParserRuleReturnScope tYPE19 =null;

		CommonTree VarStat16_tree=null;
		CommonTree IDF17_tree=null;
		CommonTree char_literal18_tree=null;
		CommonTree char_literal20_tree=null;
		RewriteRuleTokenStream stream_VarStat=new RewriteRuleTokenStream(adaptor,"token VarStat");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_tYPE=new RewriteRuleSubtreeStream(adaptor,"rule tYPE");

		try { dbg.enterRule(getGrammarFileName(), "vAR_DECL");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:34:12: ( VarStat IDF ':' tYPE ';' -> ^( VarStat IDF tYPE ) )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:34:14: VarStat IDF ':' tYPE ';'
			{
			dbg.location(34,14);
			VarStat16=(Token)match(input,VarStat,FOLLOW_VarStat_in_vAR_DECL195);  
			stream_VarStat.add(VarStat16);
			dbg.location(34,22);
			IDF17=(Token)match(input,IDF,FOLLOW_IDF_in_vAR_DECL197);  
			stream_IDF.add(IDF17);
			dbg.location(34,26);
			char_literal18=(Token)match(input,42,FOLLOW_42_in_vAR_DECL199);  
			stream_42.add(char_literal18);
			dbg.location(34,30);
			pushFollow(FOLLOW_tYPE_in_vAR_DECL201);
			tYPE19=tYPE();
			state._fsp--;

			stream_tYPE.add(tYPE19.getTree());dbg.location(34,35);
			char_literal20=(Token)match(input,44,FOLLOW_44_in_vAR_DECL203);  
			stream_44.add(char_literal20);

			// AST REWRITE
			// elements: IDF, VarStat, tYPE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 34:39: -> ^( VarStat IDF tYPE )
			{
				dbg.location(34,42);
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:34:42: ^( VarStat IDF tYPE )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(34,44);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_VarStat.nextNode(), root_1);
				dbg.location(34,52);
				adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(34,56);
				adaptor.addChild(root_1, stream_tYPE.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(35, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vAR_DECL");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "vAR_DECL"


	public static class tYPE_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tYPE"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:41:1: tYPE : ( INTTYPE | STRINGTYPE | IDFMAJ );
	public final lastYearGrammarParser.tYPE_return tYPE() throws RecognitionException {
		lastYearGrammarParser.tYPE_return retval = new lastYearGrammarParser.tYPE_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set21=null;

		CommonTree set21_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "tYPE");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:41:9: ( INTTYPE | STRINGTYPE | IDFMAJ )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(41,9);
			set21=input.LT(1);
			if ( input.LA(1)==IDFMAJ||input.LA(1)==INTTYPE||input.LA(1)==STRINGTYPE ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set21));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(44, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "tYPE");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "tYPE"


	public static class mETHOD_DECL_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mETHOD_DECL"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:46:1: mETHOD_DECL : MethodStat IDF '(' ( mETHOD_ARGS )* ')' mETHOD_TYPE '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}' -> ^( MethodStat ^( IDF ( mETHOD_ARGS )* mETHOD_TYPE ) ( vAR_DECL )* ( iNSTRUCTION )+ ) ;
	public final lastYearGrammarParser.mETHOD_DECL_return mETHOD_DECL() throws RecognitionException {
		lastYearGrammarParser.mETHOD_DECL_return retval = new lastYearGrammarParser.mETHOD_DECL_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MethodStat22=null;
		Token IDF23=null;
		Token char_literal24=null;
		Token char_literal26=null;
		Token char_literal28=null;
		Token char_literal31=null;
		ParserRuleReturnScope mETHOD_ARGS25 =null;
		ParserRuleReturnScope mETHOD_TYPE27 =null;
		ParserRuleReturnScope vAR_DECL29 =null;
		ParserRuleReturnScope iNSTRUCTION30 =null;

		CommonTree MethodStat22_tree=null;
		CommonTree IDF23_tree=null;
		CommonTree char_literal24_tree=null;
		CommonTree char_literal26_tree=null;
		CommonTree char_literal28_tree=null;
		CommonTree char_literal31_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_MethodStat=new RewriteRuleTokenStream(adaptor,"token MethodStat");
		RewriteRuleSubtreeStream stream_mETHOD_TYPE=new RewriteRuleSubtreeStream(adaptor,"rule mETHOD_TYPE");
		RewriteRuleSubtreeStream stream_vAR_DECL=new RewriteRuleSubtreeStream(adaptor,"rule vAR_DECL");
		RewriteRuleSubtreeStream stream_mETHOD_ARGS=new RewriteRuleSubtreeStream(adaptor,"rule mETHOD_ARGS");
		RewriteRuleSubtreeStream stream_iNSTRUCTION=new RewriteRuleSubtreeStream(adaptor,"rule iNSTRUCTION");

		try { dbg.enterRule(getGrammarFileName(), "mETHOD_DECL");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(46, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:46:14: ( MethodStat IDF '(' ( mETHOD_ARGS )* ')' mETHOD_TYPE '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}' -> ^( MethodStat ^( IDF ( mETHOD_ARGS )* mETHOD_TYPE ) ( vAR_DECL )* ( iNSTRUCTION )+ ) )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:46:16: MethodStat IDF '(' ( mETHOD_ARGS )* ')' mETHOD_TYPE '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}'
			{
			dbg.location(46,16);
			MethodStat22=(Token)match(input,MethodStat,FOLLOW_MethodStat_in_mETHOD_DECL258);  
			stream_MethodStat.add(MethodStat22);
			dbg.location(46,27);
			IDF23=(Token)match(input,IDF,FOLLOW_IDF_in_mETHOD_DECL260);  
			stream_IDF.add(IDF23);
			dbg.location(46,31);
			char_literal24=(Token)match(input,33,FOLLOW_33_in_mETHOD_DECL262);  
			stream_33.add(char_literal24);
			dbg.location(46,35);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:46:35: ( mETHOD_ARGS )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==IDF) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:46:35: mETHOD_ARGS
					{
					dbg.location(46,35);
					pushFollow(FOLLOW_mETHOD_ARGS_in_mETHOD_DECL264);
					mETHOD_ARGS25=mETHOD_ARGS();
					state._fsp--;

					stream_mETHOD_ARGS.add(mETHOD_ARGS25.getTree());
					}
					break;

				default :
					break loop7;
				}
			}
			} finally {dbg.exitSubRule(7);}
			dbg.location(46,48);
			char_literal26=(Token)match(input,34,FOLLOW_34_in_mETHOD_DECL267);  
			stream_34.add(char_literal26);
			dbg.location(46,52);
			pushFollow(FOLLOW_mETHOD_TYPE_in_mETHOD_DECL269);
			mETHOD_TYPE27=mETHOD_TYPE();
			state._fsp--;

			stream_mETHOD_TYPE.add(mETHOD_TYPE27.getTree());dbg.location(46,64);
			char_literal28=(Token)match(input,47,FOLLOW_47_in_mETHOD_DECL271);  
			stream_47.add(char_literal28);
			dbg.location(46,68);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:46:68: ( vAR_DECL )*
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=2;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				int LA8_0 = input.LA(1);
				if ( (LA8_0==VarStat) ) {
					alt8=1;
				}

				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:46:68: vAR_DECL
					{
					dbg.location(46,68);
					pushFollow(FOLLOW_vAR_DECL_in_mETHOD_DECL273);
					vAR_DECL29=vAR_DECL();
					state._fsp--;

					stream_vAR_DECL.add(vAR_DECL29.getTree());
					}
					break;

				default :
					break loop8;
				}
			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(46,78);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:46:78: ( iNSTRUCTION )+
			int cnt9=0;
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( (LA9_0==DoStat||(LA9_0 >= ForStat && LA9_0 <= IDF)||LA9_0==IfStat||(LA9_0 >= ReadStat && LA9_0 <= ReturnStat)||LA9_0==WriteStat||LA9_0==47) ) {
					alt9=1;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:46:78: iNSTRUCTION
					{
					dbg.location(46,78);
					pushFollow(FOLLOW_iNSTRUCTION_in_mETHOD_DECL276);
					iNSTRUCTION30=iNSTRUCTION();
					state._fsp--;

					stream_iNSTRUCTION.add(iNSTRUCTION30.getTree());
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt9++;
			}
			} finally {dbg.exitSubRule(9);}
			dbg.location(46,91);
			char_literal31=(Token)match(input,48,FOLLOW_48_in_mETHOD_DECL279);  
			stream_48.add(char_literal31);

			// AST REWRITE
			// elements: vAR_DECL, mETHOD_TYPE, MethodStat, mETHOD_ARGS, IDF, iNSTRUCTION
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 46:95: -> ^( MethodStat ^( IDF ( mETHOD_ARGS )* mETHOD_TYPE ) ( vAR_DECL )* ( iNSTRUCTION )+ )
			{
				dbg.location(46,98);
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:46:98: ^( MethodStat ^( IDF ( mETHOD_ARGS )* mETHOD_TYPE ) ( vAR_DECL )* ( iNSTRUCTION )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(46,100);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_MethodStat.nextNode(), root_1);
				dbg.location(46,111);
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:46:111: ^( IDF ( mETHOD_ARGS )* mETHOD_TYPE )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				dbg.location(46,113);
				root_2 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_2);
				dbg.location(46,117);
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:46:117: ( mETHOD_ARGS )*
				while ( stream_mETHOD_ARGS.hasNext() ) {
					dbg.location(46,117);
					adaptor.addChild(root_2, stream_mETHOD_ARGS.nextTree());
				}
				stream_mETHOD_ARGS.reset();
				dbg.location(46,130);
				adaptor.addChild(root_2, stream_mETHOD_TYPE.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(46,143);
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:46:143: ( vAR_DECL )*
				while ( stream_vAR_DECL.hasNext() ) {
					dbg.location(46,143);
					adaptor.addChild(root_1, stream_vAR_DECL.nextTree());
				}
				stream_vAR_DECL.reset();
				dbg.location(46,153);
				if ( !(stream_iNSTRUCTION.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_iNSTRUCTION.hasNext() ) {
					dbg.location(46,153);
					adaptor.addChild(root_1, stream_iNSTRUCTION.nextTree());
				}
				stream_iNSTRUCTION.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(47, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mETHOD_DECL");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "mETHOD_DECL"


	public static class mETHOD_TYPE_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mETHOD_TYPE"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:49:1: mETHOD_TYPE : ( ( ':' tYPE ) -> tYPE | -> Void );
	public final lastYearGrammarParser.mETHOD_TYPE_return mETHOD_TYPE() throws RecognitionException {
		lastYearGrammarParser.mETHOD_TYPE_return retval = new lastYearGrammarParser.mETHOD_TYPE_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal32=null;
		ParserRuleReturnScope tYPE33 =null;

		CommonTree char_literal32_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_tYPE=new RewriteRuleSubtreeStream(adaptor,"rule tYPE");

		try { dbg.enterRule(getGrammarFileName(), "mETHOD_TYPE");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:49:14: ( ( ':' tYPE ) -> tYPE | -> Void )
			int alt10=2;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==42) ) {
				alt10=1;
			}
			else if ( (LA10_0==47) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:49:16: ( ':' tYPE )
					{
					dbg.location(49,16);
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:49:16: ( ':' tYPE )
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:49:17: ':' tYPE
					{
					dbg.location(49,17);
					char_literal32=(Token)match(input,42,FOLLOW_42_in_mETHOD_TYPE311);  
					stream_42.add(char_literal32);
					dbg.location(49,21);
					pushFollow(FOLLOW_tYPE_in_mETHOD_TYPE313);
					tYPE33=tYPE();
					state._fsp--;

					stream_tYPE.add(tYPE33.getTree());
					}

					// AST REWRITE
					// elements: tYPE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 49:27: -> tYPE
					{
						dbg.location(49,30);
						adaptor.addChild(root_0, stream_tYPE.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:50:3: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 50:3: -> Void
					{
						dbg.location(50,6);
						adaptor.addChild(root_0, (CommonTree)adaptor.create(Void, "Void"));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(50, 9);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mETHOD_TYPE");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "mETHOD_TYPE"


	public static class mETHOD_ARGS_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mETHOD_ARGS"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:56:1: mETHOD_ARGS : IDF ':' tYPE ( ',' IDF ':' tYPE )* -> ( ^( IDF tYPE ) )* ;
	public final lastYearGrammarParser.mETHOD_ARGS_return mETHOD_ARGS() throws RecognitionException {
		lastYearGrammarParser.mETHOD_ARGS_return retval = new lastYearGrammarParser.mETHOD_ARGS_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDF34=null;
		Token char_literal35=null;
		Token char_literal37=null;
		Token IDF38=null;
		Token char_literal39=null;
		ParserRuleReturnScope tYPE36 =null;
		ParserRuleReturnScope tYPE40 =null;

		CommonTree IDF34_tree=null;
		CommonTree char_literal35_tree=null;
		CommonTree char_literal37_tree=null;
		CommonTree IDF38_tree=null;
		CommonTree char_literal39_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_tYPE=new RewriteRuleSubtreeStream(adaptor,"rule tYPE");

		try { dbg.enterRule(getGrammarFileName(), "mETHOD_ARGS");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:56:14: ( IDF ':' tYPE ( ',' IDF ':' tYPE )* -> ( ^( IDF tYPE ) )* )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:56:16: IDF ':' tYPE ( ',' IDF ':' tYPE )*
			{
			dbg.location(56,16);
			IDF34=(Token)match(input,IDF,FOLLOW_IDF_in_mETHOD_ARGS345);  
			stream_IDF.add(IDF34);
			dbg.location(56,20);
			char_literal35=(Token)match(input,42,FOLLOW_42_in_mETHOD_ARGS347);  
			stream_42.add(char_literal35);
			dbg.location(56,24);
			pushFollow(FOLLOW_tYPE_in_mETHOD_ARGS349);
			tYPE36=tYPE();
			state._fsp--;

			stream_tYPE.add(tYPE36.getTree());dbg.location(56,29);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:56:29: ( ',' IDF ':' tYPE )*
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==37) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:56:30: ',' IDF ':' tYPE
					{
					dbg.location(56,30);
					char_literal37=(Token)match(input,37,FOLLOW_37_in_mETHOD_ARGS352);  
					stream_37.add(char_literal37);
					dbg.location(56,34);
					IDF38=(Token)match(input,IDF,FOLLOW_IDF_in_mETHOD_ARGS354);  
					stream_IDF.add(IDF38);
					dbg.location(56,38);
					char_literal39=(Token)match(input,42,FOLLOW_42_in_mETHOD_ARGS356);  
					stream_42.add(char_literal39);
					dbg.location(56,42);
					pushFollow(FOLLOW_tYPE_in_mETHOD_ARGS358);
					tYPE40=tYPE();
					state._fsp--;

					stream_tYPE.add(tYPE40.getTree());
					}
					break;

				default :
					break loop11;
				}
			}
			} finally {dbg.exitSubRule(11);}

			// AST REWRITE
			// elements: IDF, tYPE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 56:49: -> ( ^( IDF tYPE ) )*
			{
				dbg.location(56,52);
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:56:52: ( ^( IDF tYPE ) )*
				while ( stream_IDF.hasNext()||stream_tYPE.hasNext() ) {
					dbg.location(56,52);
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:56:52: ^( IDF tYPE )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					dbg.location(56,54);
					root_1 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_1);
					dbg.location(56,58);
					adaptor.addChild(root_1, stream_tYPE.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_IDF.reset();
				stream_tYPE.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(57, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mETHOD_ARGS");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "mETHOD_ARGS"


	public static class iNSTRUCTION_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "iNSTRUCTION"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:59:1: iNSTRUCTION : ( IDF ':=' ( eXPRESSION ) ';' -> ^( ':=' IDF eXPRESSION ) | IfStat eXPRESSION ThenStat iNSTRUCTION ( 'else' iNSTRUCTION )? FiStat -> ^( IfStat eXPRESSION ^( ThenStat iNSTRUCTION ) ( ^( 'else' iNSTRUCTION ) )? ) | ForStat IDF InStat eXPRESSION '..' eXPRESSION DoStat ( iNSTRUCTION )+ EndStat -> ^( ForStat ^( InStat IDF eXPRESSION eXPRESSION ) ^( DoStat ( iNSTRUCTION )+ ) ) | '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}' -> ^( Inner ( vAR_DECL )* ( iNSTRUCTION )* ) | DoStat eXPRESSION ';' -> ^( DoExpr eXPRESSION ) | pRINT | rEAD | rETURN2 );
	public final lastYearGrammarParser.iNSTRUCTION_return iNSTRUCTION() throws RecognitionException {
		lastYearGrammarParser.iNSTRUCTION_return retval = new lastYearGrammarParser.iNSTRUCTION_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDF41=null;
		Token string_literal42=null;
		Token char_literal44=null;
		Token IfStat45=null;
		Token ThenStat47=null;
		Token string_literal49=null;
		Token FiStat51=null;
		Token ForStat52=null;
		Token IDF53=null;
		Token InStat54=null;
		Token string_literal56=null;
		Token DoStat58=null;
		Token EndStat60=null;
		Token char_literal61=null;
		Token char_literal64=null;
		Token DoStat65=null;
		Token char_literal67=null;
		ParserRuleReturnScope eXPRESSION43 =null;
		ParserRuleReturnScope eXPRESSION46 =null;
		ParserRuleReturnScope iNSTRUCTION48 =null;
		ParserRuleReturnScope iNSTRUCTION50 =null;
		ParserRuleReturnScope eXPRESSION55 =null;
		ParserRuleReturnScope eXPRESSION57 =null;
		ParserRuleReturnScope iNSTRUCTION59 =null;
		ParserRuleReturnScope vAR_DECL62 =null;
		ParserRuleReturnScope iNSTRUCTION63 =null;
		ParserRuleReturnScope eXPRESSION66 =null;
		ParserRuleReturnScope pRINT68 =null;
		ParserRuleReturnScope rEAD69 =null;
		ParserRuleReturnScope rETURN270 =null;

		CommonTree IDF41_tree=null;
		CommonTree string_literal42_tree=null;
		CommonTree char_literal44_tree=null;
		CommonTree IfStat45_tree=null;
		CommonTree ThenStat47_tree=null;
		CommonTree string_literal49_tree=null;
		CommonTree FiStat51_tree=null;
		CommonTree ForStat52_tree=null;
		CommonTree IDF53_tree=null;
		CommonTree InStat54_tree=null;
		CommonTree string_literal56_tree=null;
		CommonTree DoStat58_tree=null;
		CommonTree EndStat60_tree=null;
		CommonTree char_literal61_tree=null;
		CommonTree char_literal64_tree=null;
		CommonTree DoStat65_tree=null;
		CommonTree char_literal67_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_EndStat=new RewriteRuleTokenStream(adaptor,"token EndStat");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_IfStat=new RewriteRuleTokenStream(adaptor,"token IfStat");
		RewriteRuleTokenStream stream_ThenStat=new RewriteRuleTokenStream(adaptor,"token ThenStat");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_ForStat=new RewriteRuleTokenStream(adaptor,"token ForStat");
		RewriteRuleTokenStream stream_DoStat=new RewriteRuleTokenStream(adaptor,"token DoStat");
		RewriteRuleTokenStream stream_FiStat=new RewriteRuleTokenStream(adaptor,"token FiStat");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_InStat=new RewriteRuleTokenStream(adaptor,"token InStat");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_vAR_DECL=new RewriteRuleSubtreeStream(adaptor,"rule vAR_DECL");
		RewriteRuleSubtreeStream stream_eXPRESSION=new RewriteRuleSubtreeStream(adaptor,"rule eXPRESSION");
		RewriteRuleSubtreeStream stream_iNSTRUCTION=new RewriteRuleSubtreeStream(adaptor,"rule iNSTRUCTION");

		try { dbg.enterRule(getGrammarFileName(), "iNSTRUCTION");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(59, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:59:15: ( IDF ':=' ( eXPRESSION ) ';' -> ^( ':=' IDF eXPRESSION ) | IfStat eXPRESSION ThenStat iNSTRUCTION ( 'else' iNSTRUCTION )? FiStat -> ^( IfStat eXPRESSION ^( ThenStat iNSTRUCTION ) ( ^( 'else' iNSTRUCTION ) )? ) | ForStat IDF InStat eXPRESSION '..' eXPRESSION DoStat ( iNSTRUCTION )+ EndStat -> ^( ForStat ^( InStat IDF eXPRESSION eXPRESSION ) ^( DoStat ( iNSTRUCTION )+ ) ) | '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}' -> ^( Inner ( vAR_DECL )* ( iNSTRUCTION )* ) | DoStat eXPRESSION ';' -> ^( DoExpr eXPRESSION ) | pRINT | rEAD | rETURN2 )
			int alt16=8;
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			switch ( input.LA(1) ) {
			case IDF:
				{
				alt16=1;
				}
				break;
			case IfStat:
				{
				alt16=2;
				}
				break;
			case ForStat:
				{
				alt16=3;
				}
				break;
			case 47:
				{
				alt16=4;
				}
				break;
			case DoStat:
				{
				alt16=5;
				}
				break;
			case WriteStat:
				{
				alt16=6;
				}
				break;
			case ReadStat:
				{
				alt16=7;
				}
				break;
			case ReturnStat:
				{
				alt16=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:59:17: IDF ':=' ( eXPRESSION ) ';'
					{
					dbg.location(59,17);
					IDF41=(Token)match(input,IDF,FOLLOW_IDF_in_iNSTRUCTION380);  
					stream_IDF.add(IDF41);
					dbg.location(59,21);
					string_literal42=(Token)match(input,43,FOLLOW_43_in_iNSTRUCTION382);  
					stream_43.add(string_literal42);
					dbg.location(59,26);
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:59:26: ( eXPRESSION )
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:59:27: eXPRESSION
					{
					dbg.location(59,27);
					pushFollow(FOLLOW_eXPRESSION_in_iNSTRUCTION385);
					eXPRESSION43=eXPRESSION();
					state._fsp--;

					stream_eXPRESSION.add(eXPRESSION43.getTree());
					}
					dbg.location(59,39);
					char_literal44=(Token)match(input,44,FOLLOW_44_in_iNSTRUCTION388);  
					stream_44.add(char_literal44);

					// AST REWRITE
					// elements: eXPRESSION, 43, IDF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 59:43: -> ^( ':=' IDF eXPRESSION )
					{
						dbg.location(59,46);
						// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:59:46: ^( ':=' IDF eXPRESSION )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(59,48);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_43.nextNode(), root_1);
						dbg.location(59,53);
						adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(59,57);
						adaptor.addChild(root_1, stream_eXPRESSION.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:60:3: IfStat eXPRESSION ThenStat iNSTRUCTION ( 'else' iNSTRUCTION )? FiStat
					{
					dbg.location(60,3);
					IfStat45=(Token)match(input,IfStat,FOLLOW_IfStat_in_iNSTRUCTION402);  
					stream_IfStat.add(IfStat45);
					dbg.location(60,10);
					pushFollow(FOLLOW_eXPRESSION_in_iNSTRUCTION404);
					eXPRESSION46=eXPRESSION();
					state._fsp--;

					stream_eXPRESSION.add(eXPRESSION46.getTree());dbg.location(60,21);
					ThenStat47=(Token)match(input,ThenStat,FOLLOW_ThenStat_in_iNSTRUCTION406);  
					stream_ThenStat.add(ThenStat47);
					dbg.location(60,30);
					pushFollow(FOLLOW_iNSTRUCTION_in_iNSTRUCTION408);
					iNSTRUCTION48=iNSTRUCTION();
					state._fsp--;

					stream_iNSTRUCTION.add(iNSTRUCTION48.getTree());dbg.location(60,42);
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:60:42: ( 'else' iNSTRUCTION )?
					int alt12=2;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					int LA12_0 = input.LA(1);
					if ( (LA12_0==46) ) {
						alt12=1;
					}
					} finally {dbg.exitDecision(12);}

					switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:60:43: 'else' iNSTRUCTION
							{
							dbg.location(60,43);
							string_literal49=(Token)match(input,46,FOLLOW_46_in_iNSTRUCTION411);  
							stream_46.add(string_literal49);
							dbg.location(60,50);
							pushFollow(FOLLOW_iNSTRUCTION_in_iNSTRUCTION413);
							iNSTRUCTION50=iNSTRUCTION();
							state._fsp--;

							stream_iNSTRUCTION.add(iNSTRUCTION50.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(60,64);
					FiStat51=(Token)match(input,FiStat,FOLLOW_FiStat_in_iNSTRUCTION417);  
					stream_FiStat.add(FiStat51);

					// AST REWRITE
					// elements: eXPRESSION, iNSTRUCTION, ThenStat, 46, IfStat, iNSTRUCTION
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 60:71: -> ^( IfStat eXPRESSION ^( ThenStat iNSTRUCTION ) ( ^( 'else' iNSTRUCTION ) )? )
					{
						dbg.location(60,74);
						// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:60:74: ^( IfStat eXPRESSION ^( ThenStat iNSTRUCTION ) ( ^( 'else' iNSTRUCTION ) )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(60,76);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_IfStat.nextNode(), root_1);
						dbg.location(60,83);
						adaptor.addChild(root_1, stream_eXPRESSION.nextTree());dbg.location(60,94);
						// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:60:94: ^( ThenStat iNSTRUCTION )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(60,96);
						root_2 = (CommonTree)adaptor.becomeRoot(stream_ThenStat.nextNode(), root_2);
						dbg.location(60,105);
						adaptor.addChild(root_2, stream_iNSTRUCTION.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(60,118);
						// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:60:118: ( ^( 'else' iNSTRUCTION ) )?
						if ( stream_iNSTRUCTION.hasNext()||stream_46.hasNext() ) {
							dbg.location(60,118);
							// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:60:118: ^( 'else' iNSTRUCTION )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							dbg.location(60,120);
							root_2 = (CommonTree)adaptor.becomeRoot(stream_46.nextNode(), root_2);
							dbg.location(60,127);
							adaptor.addChild(root_2, stream_iNSTRUCTION.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_iNSTRUCTION.reset();
						stream_46.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:61:3: ForStat IDF InStat eXPRESSION '..' eXPRESSION DoStat ( iNSTRUCTION )+ EndStat
					{
					dbg.location(61,3);
					ForStat52=(Token)match(input,ForStat,FOLLOW_ForStat_in_iNSTRUCTION442);  
					stream_ForStat.add(ForStat52);
					dbg.location(61,11);
					IDF53=(Token)match(input,IDF,FOLLOW_IDF_in_iNSTRUCTION444);  
					stream_IDF.add(IDF53);
					dbg.location(61,15);
					InStat54=(Token)match(input,InStat,FOLLOW_InStat_in_iNSTRUCTION446);  
					stream_InStat.add(InStat54);
					dbg.location(61,22);
					pushFollow(FOLLOW_eXPRESSION_in_iNSTRUCTION448);
					eXPRESSION55=eXPRESSION();
					state._fsp--;

					stream_eXPRESSION.add(eXPRESSION55.getTree());dbg.location(61,33);
					string_literal56=(Token)match(input,40,FOLLOW_40_in_iNSTRUCTION450);  
					stream_40.add(string_literal56);
					dbg.location(61,38);
					pushFollow(FOLLOW_eXPRESSION_in_iNSTRUCTION452);
					eXPRESSION57=eXPRESSION();
					state._fsp--;

					stream_eXPRESSION.add(eXPRESSION57.getTree());dbg.location(61,49);
					DoStat58=(Token)match(input,DoStat,FOLLOW_DoStat_in_iNSTRUCTION454);  
					stream_DoStat.add(DoStat58);
					dbg.location(61,56);
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:61:56: ( iNSTRUCTION )+
					int cnt13=0;
					try { dbg.enterSubRule(13);

					loop13:
					while (true) {
						int alt13=2;
						try { dbg.enterDecision(13, decisionCanBacktrack[13]);

						int LA13_0 = input.LA(1);
						if ( (LA13_0==DoStat||(LA13_0 >= ForStat && LA13_0 <= IDF)||LA13_0==IfStat||(LA13_0 >= ReadStat && LA13_0 <= ReturnStat)||LA13_0==WriteStat||LA13_0==47) ) {
							alt13=1;
						}

						} finally {dbg.exitDecision(13);}

						switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:61:56: iNSTRUCTION
							{
							dbg.location(61,56);
							pushFollow(FOLLOW_iNSTRUCTION_in_iNSTRUCTION456);
							iNSTRUCTION59=iNSTRUCTION();
							state._fsp--;

							stream_iNSTRUCTION.add(iNSTRUCTION59.getTree());
							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt13++;
					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(61,69);
					EndStat60=(Token)match(input,EndStat,FOLLOW_EndStat_in_iNSTRUCTION459);  
					stream_EndStat.add(EndStat60);

					// AST REWRITE
					// elements: DoStat, eXPRESSION, InStat, IDF, eXPRESSION, iNSTRUCTION, ForStat
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 61:77: -> ^( ForStat ^( InStat IDF eXPRESSION eXPRESSION ) ^( DoStat ( iNSTRUCTION )+ ) )
					{
						dbg.location(61,80);
						// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:61:80: ^( ForStat ^( InStat IDF eXPRESSION eXPRESSION ) ^( DoStat ( iNSTRUCTION )+ ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(61,82);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_ForStat.nextNode(), root_1);
						dbg.location(61,90);
						// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:61:90: ^( InStat IDF eXPRESSION eXPRESSION )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(61,92);
						root_2 = (CommonTree)adaptor.becomeRoot(stream_InStat.nextNode(), root_2);
						dbg.location(61,99);
						adaptor.addChild(root_2, stream_IDF.nextNode());dbg.location(61,103);
						adaptor.addChild(root_2, stream_eXPRESSION.nextTree());dbg.location(61,114);
						adaptor.addChild(root_2, stream_eXPRESSION.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(61,126);
						// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:61:126: ^( DoStat ( iNSTRUCTION )+ )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(61,128);
						root_2 = (CommonTree)adaptor.becomeRoot(stream_DoStat.nextNode(), root_2);
						dbg.location(61,135);
						if ( !(stream_iNSTRUCTION.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_iNSTRUCTION.hasNext() ) {
							dbg.location(61,135);
							adaptor.addChild(root_2, stream_iNSTRUCTION.nextTree());
						}
						stream_iNSTRUCTION.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:62:3: '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}'
					{
					dbg.location(62,3);
					char_literal61=(Token)match(input,47,FOLLOW_47_in_iNSTRUCTION486);  
					stream_47.add(char_literal61);
					dbg.location(62,7);
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:62:7: ( vAR_DECL )*
					try { dbg.enterSubRule(14);

					loop14:
					while (true) {
						int alt14=2;
						try { dbg.enterDecision(14, decisionCanBacktrack[14]);

						int LA14_0 = input.LA(1);
						if ( (LA14_0==VarStat) ) {
							alt14=1;
						}

						} finally {dbg.exitDecision(14);}

						switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:62:7: vAR_DECL
							{
							dbg.location(62,7);
							pushFollow(FOLLOW_vAR_DECL_in_iNSTRUCTION488);
							vAR_DECL62=vAR_DECL();
							state._fsp--;

							stream_vAR_DECL.add(vAR_DECL62.getTree());
							}
							break;

						default :
							break loop14;
						}
					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(62,17);
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:62:17: ( iNSTRUCTION )+
					int cnt15=0;
					try { dbg.enterSubRule(15);

					loop15:
					while (true) {
						int alt15=2;
						try { dbg.enterDecision(15, decisionCanBacktrack[15]);

						int LA15_0 = input.LA(1);
						if ( (LA15_0==DoStat||(LA15_0 >= ForStat && LA15_0 <= IDF)||LA15_0==IfStat||(LA15_0 >= ReadStat && LA15_0 <= ReturnStat)||LA15_0==WriteStat||LA15_0==47) ) {
							alt15=1;
						}

						} finally {dbg.exitDecision(15);}

						switch (alt15) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:62:17: iNSTRUCTION
							{
							dbg.location(62,17);
							pushFollow(FOLLOW_iNSTRUCTION_in_iNSTRUCTION491);
							iNSTRUCTION63=iNSTRUCTION();
							state._fsp--;

							stream_iNSTRUCTION.add(iNSTRUCTION63.getTree());
							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt15++;
					}
					} finally {dbg.exitSubRule(15);}
					dbg.location(62,30);
					char_literal64=(Token)match(input,48,FOLLOW_48_in_iNSTRUCTION494);  
					stream_48.add(char_literal64);

					// AST REWRITE
					// elements: iNSTRUCTION, vAR_DECL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 62:34: -> ^( Inner ( vAR_DECL )* ( iNSTRUCTION )* )
					{
						dbg.location(62,37);
						// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:62:37: ^( Inner ( vAR_DECL )* ( iNSTRUCTION )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(62,39);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Inner, "Inner"), root_1);
						dbg.location(62,45);
						// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:62:45: ( vAR_DECL )*
						while ( stream_vAR_DECL.hasNext() ) {
							dbg.location(62,45);
							adaptor.addChild(root_1, stream_vAR_DECL.nextTree());
						}
						stream_vAR_DECL.reset();
						dbg.location(62,55);
						// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:62:55: ( iNSTRUCTION )*
						while ( stream_iNSTRUCTION.hasNext() ) {
							dbg.location(62,55);
							adaptor.addChild(root_1, stream_iNSTRUCTION.nextTree());
						}
						stream_iNSTRUCTION.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:63:3: DoStat eXPRESSION ';'
					{
					dbg.location(63,3);
					DoStat65=(Token)match(input,DoStat,FOLLOW_DoStat_in_iNSTRUCTION510);  
					stream_DoStat.add(DoStat65);
					dbg.location(63,10);
					pushFollow(FOLLOW_eXPRESSION_in_iNSTRUCTION512);
					eXPRESSION66=eXPRESSION();
					state._fsp--;

					stream_eXPRESSION.add(eXPRESSION66.getTree());dbg.location(63,20);
					char_literal67=(Token)match(input,44,FOLLOW_44_in_iNSTRUCTION513);  
					stream_44.add(char_literal67);

					// AST REWRITE
					// elements: eXPRESSION
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 63:24: -> ^( DoExpr eXPRESSION )
					{
						dbg.location(63,27);
						// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:63:27: ^( DoExpr eXPRESSION )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(63,29);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DoExpr, "DoExpr"), root_1);
						dbg.location(63,36);
						adaptor.addChild(root_1, stream_eXPRESSION.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:64:3: pRINT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(64,3);
					pushFollow(FOLLOW_pRINT_in_iNSTRUCTION525);
					pRINT68=pRINT();
					state._fsp--;

					adaptor.addChild(root_0, pRINT68.getTree());

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:65:3: rEAD
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(65,3);
					pushFollow(FOLLOW_rEAD_in_iNSTRUCTION529);
					rEAD69=rEAD();
					state._fsp--;

					adaptor.addChild(root_0, rEAD69.getTree());

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:66:3: rETURN2
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(66,3);
					pushFollow(FOLLOW_rETURN2_in_iNSTRUCTION533);
					rETURN270=rETURN2();
					state._fsp--;

					adaptor.addChild(root_0, rETURN270.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(67, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iNSTRUCTION");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "iNSTRUCTION"


	public static class pRINT_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "pRINT"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:85:1: pRINT : WriteStat ^ eXPRESSION ';' !;
	public final lastYearGrammarParser.pRINT_return pRINT() throws RecognitionException {
		lastYearGrammarParser.pRINT_return retval = new lastYearGrammarParser.pRINT_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token WriteStat71=null;
		Token char_literal73=null;
		ParserRuleReturnScope eXPRESSION72 =null;

		CommonTree WriteStat71_tree=null;
		CommonTree char_literal73_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "pRINT");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(85, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:85:9: ( WriteStat ^ eXPRESSION ';' !)
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:85:11: WriteStat ^ eXPRESSION ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(85,20);
			WriteStat71=(Token)match(input,WriteStat,FOLLOW_WriteStat_in_pRINT616); 
			WriteStat71_tree = (CommonTree)adaptor.create(WriteStat71);
			root_0 = (CommonTree)adaptor.becomeRoot(WriteStat71_tree, root_0);
			dbg.location(85,22);
			pushFollow(FOLLOW_eXPRESSION_in_pRINT619);
			eXPRESSION72=eXPRESSION();
			state._fsp--;

			adaptor.addChild(root_0, eXPRESSION72.getTree());
			dbg.location(85,36);
			char_literal73=(Token)match(input,44,FOLLOW_44_in_pRINT621); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(86, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "pRINT");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "pRINT"


	public static class rEAD_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rEAD"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:90:1: rEAD : ReadStat ^ IDF ';' !;
	public final lastYearGrammarParser.rEAD_return rEAD() throws RecognitionException {
		lastYearGrammarParser.rEAD_return retval = new lastYearGrammarParser.rEAD_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ReadStat74=null;
		Token IDF75=null;
		Token char_literal76=null;

		CommonTree ReadStat74_tree=null;
		CommonTree IDF75_tree=null;
		CommonTree char_literal76_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "rEAD");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(90, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:90:8: ( ReadStat ^ IDF ';' !)
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:90:10: ReadStat ^ IDF ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(90,18);
			ReadStat74=(Token)match(input,ReadStat,FOLLOW_ReadStat_in_rEAD644); 
			ReadStat74_tree = (CommonTree)adaptor.create(ReadStat74);
			root_0 = (CommonTree)adaptor.becomeRoot(ReadStat74_tree, root_0);
			dbg.location(90,20);
			IDF75=(Token)match(input,IDF,FOLLOW_IDF_in_rEAD647); 
			IDF75_tree = (CommonTree)adaptor.create(IDF75);
			adaptor.addChild(root_0, IDF75_tree);
			dbg.location(90,27);
			char_literal76=(Token)match(input,44,FOLLOW_44_in_rEAD649); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(91, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rEAD");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "rEAD"


	public static class rETURN2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rETURN2"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:94:1: rETURN2 : ReturnStat ^ '(' ! eXPRESSION ')' ! ';' !;
	public final lastYearGrammarParser.rETURN2_return rETURN2() throws RecognitionException {
		lastYearGrammarParser.rETURN2_return retval = new lastYearGrammarParser.rETURN2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ReturnStat77=null;
		Token char_literal78=null;
		Token char_literal80=null;
		Token char_literal81=null;
		ParserRuleReturnScope eXPRESSION79 =null;

		CommonTree ReturnStat77_tree=null;
		CommonTree char_literal78_tree=null;
		CommonTree char_literal80_tree=null;
		CommonTree char_literal81_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "rETURN2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(94, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:94:11: ( ReturnStat ^ '(' ! eXPRESSION ')' ! ';' !)
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:94:13: ReturnStat ^ '(' ! eXPRESSION ')' ! ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(94,23);
			ReturnStat77=(Token)match(input,ReturnStat,FOLLOW_ReturnStat_in_rETURN2670); 
			ReturnStat77_tree = (CommonTree)adaptor.create(ReturnStat77);
			root_0 = (CommonTree)adaptor.becomeRoot(ReturnStat77_tree, root_0);
			dbg.location(94,28);
			char_literal78=(Token)match(input,33,FOLLOW_33_in_rETURN2673); dbg.location(94,30);
			pushFollow(FOLLOW_eXPRESSION_in_rETURN2676);
			eXPRESSION79=eXPRESSION();
			state._fsp--;

			adaptor.addChild(root_0, eXPRESSION79.getTree());
			dbg.location(94,44);
			char_literal80=(Token)match(input,34,FOLLOW_34_in_rETURN2678); dbg.location(94,49);
			char_literal81=(Token)match(input,44,FOLLOW_44_in_rETURN2681); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(95, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rETURN2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "rETURN2"


	public static class aTOM_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aTOM"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:100:1: aTOM : ( INT | STRING | '(' ! eXPRESSION ')' !| eXPRESSION2 );
	public final lastYearGrammarParser.aTOM_return aTOM() throws RecognitionException {
		lastYearGrammarParser.aTOM_return retval = new lastYearGrammarParser.aTOM_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT82=null;
		Token STRING83=null;
		Token char_literal84=null;
		Token char_literal86=null;
		ParserRuleReturnScope eXPRESSION85 =null;
		ParserRuleReturnScope eXPRESSION287 =null;

		CommonTree INT82_tree=null;
		CommonTree STRING83_tree=null;
		CommonTree char_literal84_tree=null;
		CommonTree char_literal86_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "aTOM");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:100:9: ( INT | STRING | '(' ! eXPRESSION ')' !| eXPRESSION2 )
			int alt17=4;
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt17=1;
				}
				break;
			case STRING:
				{
				alt17=2;
				}
				break;
			case 33:
				{
				alt17=3;
				}
				break;
			case IDF:
			case NewStat:
			case SuperStat:
			case ThisStat:
				{
				alt17=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:100:11: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(100,11);
					INT82=(Token)match(input,INT,FOLLOW_INT_in_aTOM705); 
					INT82_tree = (CommonTree)adaptor.create(INT82);
					adaptor.addChild(root_0, INT82_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:101:3: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(101,3);
					STRING83=(Token)match(input,STRING,FOLLOW_STRING_in_aTOM709); 
					STRING83_tree = (CommonTree)adaptor.create(STRING83);
					adaptor.addChild(root_0, STRING83_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:102:3: '(' ! eXPRESSION ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(102,6);
					char_literal84=(Token)match(input,33,FOLLOW_33_in_aTOM713); dbg.location(102,8);
					pushFollow(FOLLOW_eXPRESSION_in_aTOM716);
					eXPRESSION85=eXPRESSION();
					state._fsp--;

					adaptor.addChild(root_0, eXPRESSION85.getTree());
					dbg.location(102,22);
					char_literal86=(Token)match(input,34,FOLLOW_34_in_aTOM718); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:103:2: eXPRESSION2
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(103,2);
					pushFollow(FOLLOW_eXPRESSION2_in_aTOM722);
					eXPRESSION287=eXPRESSION2();
					state._fsp--;

					adaptor.addChild(root_0, eXPRESSION287.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(104, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "aTOM");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "aTOM"


	public static class aTOMBIS_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aTOMBIS"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:106:1: aTOMBIS : ( ThisStat | IDF | SuperStat | NewStat ^ IDFMAJ );
	public final lastYearGrammarParser.aTOMBIS_return aTOMBIS() throws RecognitionException {
		lastYearGrammarParser.aTOMBIS_return retval = new lastYearGrammarParser.aTOMBIS_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ThisStat88=null;
		Token IDF89=null;
		Token SuperStat90=null;
		Token NewStat91=null;
		Token IDFMAJ92=null;

		CommonTree ThisStat88_tree=null;
		CommonTree IDF89_tree=null;
		CommonTree SuperStat90_tree=null;
		CommonTree NewStat91_tree=null;
		CommonTree IDFMAJ92_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "aTOMBIS");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(106, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:106:11: ( ThisStat | IDF | SuperStat | NewStat ^ IDFMAJ )
			int alt18=4;
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			switch ( input.LA(1) ) {
			case ThisStat:
				{
				alt18=1;
				}
				break;
			case IDF:
				{
				alt18=2;
				}
				break;
			case SuperStat:
				{
				alt18=3;
				}
				break;
			case NewStat:
				{
				alt18=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:106:13: ThisStat
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(106,13);
					ThisStat88=(Token)match(input,ThisStat,FOLLOW_ThisStat_in_aTOMBIS733); 
					ThisStat88_tree = (CommonTree)adaptor.create(ThisStat88);
					adaptor.addChild(root_0, ThisStat88_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:107:2: IDF
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(107,2);
					IDF89=(Token)match(input,IDF,FOLLOW_IDF_in_aTOMBIS736); 
					IDF89_tree = (CommonTree)adaptor.create(IDF89);
					adaptor.addChild(root_0, IDF89_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:108:2: SuperStat
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(108,2);
					SuperStat90=(Token)match(input,SuperStat,FOLLOW_SuperStat_in_aTOMBIS739); 
					SuperStat90_tree = (CommonTree)adaptor.create(SuperStat90);
					adaptor.addChild(root_0, SuperStat90_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:109:2: NewStat ^ IDFMAJ
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(109,9);
					NewStat91=(Token)match(input,NewStat,FOLLOW_NewStat_in_aTOMBIS742); 
					NewStat91_tree = (CommonTree)adaptor.create(NewStat91);
					root_0 = (CommonTree)adaptor.becomeRoot(NewStat91_tree, root_0);
					dbg.location(109,11);
					IDFMAJ92=(Token)match(input,IDFMAJ,FOLLOW_IDFMAJ_in_aTOMBIS745); 
					IDFMAJ92_tree = (CommonTree)adaptor.create(IDFMAJ92);
					adaptor.addChild(root_0, IDFMAJ92_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(110, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "aTOMBIS");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "aTOMBIS"


	public static class bOOLEXPR_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bOOLEXPR"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:113:1: bOOLEXPR : ( mOINEXPR | nOTMOINSEXPR ) ( BOOLOPER ^ ( mOINEXPR | nOTMOINSEXPR ) )* ;
	public final lastYearGrammarParser.bOOLEXPR_return bOOLEXPR() throws RecognitionException {
		lastYearGrammarParser.bOOLEXPR_return retval = new lastYearGrammarParser.bOOLEXPR_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BOOLOPER95=null;
		ParserRuleReturnScope mOINEXPR93 =null;
		ParserRuleReturnScope nOTMOINSEXPR94 =null;
		ParserRuleReturnScope mOINEXPR96 =null;
		ParserRuleReturnScope nOTMOINSEXPR97 =null;

		CommonTree BOOLOPER95_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bOOLEXPR");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(113, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:113:12: ( ( mOINEXPR | nOTMOINSEXPR ) ( BOOLOPER ^ ( mOINEXPR | nOTMOINSEXPR ) )* )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:113:14: ( mOINEXPR | nOTMOINSEXPR ) ( BOOLOPER ^ ( mOINEXPR | nOTMOINSEXPR ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(113,14);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:113:14: ( mOINEXPR | nOTMOINSEXPR )
			int alt19=2;
			try { dbg.enterSubRule(19);
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==38) ) {
				alt19=1;
			}
			else if ( (LA19_0==IDF||LA19_0==INT||LA19_0==NewStat||LA19_0==STRING||LA19_0==SuperStat||LA19_0==ThisStat||LA19_0==33) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:113:15: mOINEXPR
					{
					dbg.location(113,15);
					pushFollow(FOLLOW_mOINEXPR_in_bOOLEXPR758);
					mOINEXPR93=mOINEXPR();
					state._fsp--;

					adaptor.addChild(root_0, mOINEXPR93.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:113:24: nOTMOINSEXPR
					{
					dbg.location(113,24);
					pushFollow(FOLLOW_nOTMOINSEXPR_in_bOOLEXPR760);
					nOTMOINSEXPR94=nOTMOINSEXPR();
					state._fsp--;

					adaptor.addChild(root_0, nOTMOINSEXPR94.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(19);}
			dbg.location(113,38);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:113:38: ( BOOLOPER ^ ( mOINEXPR | nOTMOINSEXPR ) )*
			try { dbg.enterSubRule(21);

			loop21:
			while (true) {
				int alt21=2;
				try { dbg.enterDecision(21, decisionCanBacktrack[21]);

				int LA21_0 = input.LA(1);
				if ( (LA21_0==BOOLOPER) ) {
					alt21=1;
				}

				} finally {dbg.exitDecision(21);}

				switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:113:39: BOOLOPER ^ ( mOINEXPR | nOTMOINSEXPR )
					{
					dbg.location(113,47);
					BOOLOPER95=(Token)match(input,BOOLOPER,FOLLOW_BOOLOPER_in_bOOLEXPR764); 
					BOOLOPER95_tree = (CommonTree)adaptor.create(BOOLOPER95);
					root_0 = (CommonTree)adaptor.becomeRoot(BOOLOPER95_tree, root_0);
					dbg.location(113,49);
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:113:49: ( mOINEXPR | nOTMOINSEXPR )
					int alt20=2;
					try { dbg.enterSubRule(20);
					try { dbg.enterDecision(20, decisionCanBacktrack[20]);

					int LA20_0 = input.LA(1);
					if ( (LA20_0==38) ) {
						alt20=1;
					}
					else if ( (LA20_0==IDF||LA20_0==INT||LA20_0==NewStat||LA20_0==STRING||LA20_0==SuperStat||LA20_0==ThisStat||LA20_0==33) ) {
						alt20=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(20);}

					switch (alt20) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:113:50: mOINEXPR
							{
							dbg.location(113,50);
							pushFollow(FOLLOW_mOINEXPR_in_bOOLEXPR768);
							mOINEXPR96=mOINEXPR();
							state._fsp--;

							adaptor.addChild(root_0, mOINEXPR96.getTree());

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:113:59: nOTMOINSEXPR
							{
							dbg.location(113,59);
							pushFollow(FOLLOW_nOTMOINSEXPR_in_bOOLEXPR770);
							nOTMOINSEXPR97=nOTMOINSEXPR();
							state._fsp--;

							adaptor.addChild(root_0, nOTMOINSEXPR97.getTree());

							}
							break;

					}
					} finally {dbg.exitSubRule(20);}

					}
					break;

				default :
					break loop21;
				}
			}
			} finally {dbg.exitSubRule(21);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(114, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bOOLEXPR");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bOOLEXPR"


	public static class mULTEXPR_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mULTEXPR"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:116:1: mULTEXPR : bOOLEXPR ( ( '*' | '/' ) ^ bOOLEXPR )* ;
	public final lastYearGrammarParser.mULTEXPR_return mULTEXPR() throws RecognitionException {
		lastYearGrammarParser.mULTEXPR_return retval = new lastYearGrammarParser.mULTEXPR_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set99=null;
		ParserRuleReturnScope bOOLEXPR98 =null;
		ParserRuleReturnScope bOOLEXPR100 =null;

		CommonTree set99_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "mULTEXPR");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(116, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:116:12: ( bOOLEXPR ( ( '*' | '/' ) ^ bOOLEXPR )* )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:116:14: bOOLEXPR ( ( '*' | '/' ) ^ bOOLEXPR )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(116,14);
			pushFollow(FOLLOW_bOOLEXPR_in_mULTEXPR784);
			bOOLEXPR98=bOOLEXPR();
			state._fsp--;

			adaptor.addChild(root_0, bOOLEXPR98.getTree());
			dbg.location(116,23);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:116:23: ( ( '*' | '/' ) ^ bOOLEXPR )*
			try { dbg.enterSubRule(22);

			loop22:
			while (true) {
				int alt22=2;
				try { dbg.enterDecision(22, decisionCanBacktrack[22]);

				int LA22_0 = input.LA(1);
				if ( (LA22_0==35||LA22_0==41) ) {
					alt22=1;
				}

				} finally {dbg.exitDecision(22);}

				switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:116:24: ( '*' | '/' ) ^ bOOLEXPR
					{
					dbg.location(116,33);
					set99=input.LT(1);
					set99=input.LT(1);
					if ( input.LA(1)==35||input.LA(1)==41 ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set99), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(116,35);
					pushFollow(FOLLOW_bOOLEXPR_in_mULTEXPR794);
					bOOLEXPR100=bOOLEXPR();
					state._fsp--;

					adaptor.addChild(root_0, bOOLEXPR100.getTree());

					}
					break;

				default :
					break loop22;
				}
			}
			} finally {dbg.exitSubRule(22);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(117, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mULTEXPR");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "mULTEXPR"


	public static class aDDEXPR_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aDDEXPR"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:119:1: aDDEXPR : mULTEXPR ( ( '+' | '-' ) ^ mULTEXPR )* ;
	public final lastYearGrammarParser.aDDEXPR_return aDDEXPR() throws RecognitionException {
		lastYearGrammarParser.aDDEXPR_return retval = new lastYearGrammarParser.aDDEXPR_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set102=null;
		ParserRuleReturnScope mULTEXPR101 =null;
		ParserRuleReturnScope mULTEXPR103 =null;

		CommonTree set102_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "aDDEXPR");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(119, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:119:11: ( mULTEXPR ( ( '+' | '-' ) ^ mULTEXPR )* )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:119:13: mULTEXPR ( ( '+' | '-' ) ^ mULTEXPR )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(119,13);
			pushFollow(FOLLOW_mULTEXPR_in_aDDEXPR807);
			mULTEXPR101=mULTEXPR();
			state._fsp--;

			adaptor.addChild(root_0, mULTEXPR101.getTree());
			dbg.location(119,22);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:119:22: ( ( '+' | '-' ) ^ mULTEXPR )*
			try { dbg.enterSubRule(23);

			loop23:
			while (true) {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				int LA23_0 = input.LA(1);
				if ( (LA23_0==36||LA23_0==38) ) {
					alt23=1;
				}

				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:119:23: ( '+' | '-' ) ^ mULTEXPR
					{
					dbg.location(119,32);
					set102=input.LT(1);
					set102=input.LT(1);
					if ( input.LA(1)==36||input.LA(1)==38 ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set102), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(119,34);
					pushFollow(FOLLOW_mULTEXPR_in_aDDEXPR817);
					mULTEXPR103=mULTEXPR();
					state._fsp--;

					adaptor.addChild(root_0, mULTEXPR103.getTree());

					}
					break;

				default :
					break loop23;
				}
			}
			} finally {dbg.exitSubRule(23);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(120, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "aDDEXPR");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "aDDEXPR"


	public static class mOINEXPR_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mOINEXPR"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:122:1: mOINEXPR : '-' aTOM -> ^( '-' aTOM ) ;
	public final lastYearGrammarParser.mOINEXPR_return mOINEXPR() throws RecognitionException {
		lastYearGrammarParser.mOINEXPR_return retval = new lastYearGrammarParser.mOINEXPR_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal104=null;
		ParserRuleReturnScope aTOM105 =null;

		CommonTree char_literal104_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_aTOM=new RewriteRuleSubtreeStream(adaptor,"rule aTOM");

		try { dbg.enterRule(getGrammarFileName(), "mOINEXPR");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(122, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:122:11: ( '-' aTOM -> ^( '-' aTOM ) )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:122:13: '-' aTOM
			{
			dbg.location(122,13);
			char_literal104=(Token)match(input,38,FOLLOW_38_in_mOINEXPR829);  
			stream_38.add(char_literal104);
			dbg.location(122,17);
			pushFollow(FOLLOW_aTOM_in_mOINEXPR831);
			aTOM105=aTOM();
			state._fsp--;

			stream_aTOM.add(aTOM105.getTree());
			// AST REWRITE
			// elements: 38, aTOM
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 122:21: -> ^( '-' aTOM )
			{
				dbg.location(122,24);
				// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:122:24: ^( '-' aTOM )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(122,26);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_38.nextNode(), root_1);
				dbg.location(122,30);
				adaptor.addChild(root_1, stream_aTOM.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(122, 34);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mOINEXPR");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "mOINEXPR"


	public static class nOTMOINSEXPR_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nOTMOINSEXPR"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:124:1: nOTMOINSEXPR : aTOM ;
	public final lastYearGrammarParser.nOTMOINSEXPR_return nOTMOINSEXPR() throws RecognitionException {
		lastYearGrammarParser.nOTMOINSEXPR_return retval = new lastYearGrammarParser.nOTMOINSEXPR_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope aTOM106 =null;


		try { dbg.enterRule(getGrammarFileName(), "nOTMOINSEXPR");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(124, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:124:16: ( aTOM )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:124:18: aTOM
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(124,18);
			pushFollow(FOLLOW_aTOM_in_nOTMOINSEXPR848);
			aTOM106=aTOM();
			state._fsp--;

			adaptor.addChild(root_0, aTOM106.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(124, 21);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "nOTMOINSEXPR");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "nOTMOINSEXPR"


	public static class eXPRESSION_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "eXPRESSION"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:126:1: eXPRESSION : aDDEXPR ;
	public final lastYearGrammarParser.eXPRESSION_return eXPRESSION() throws RecognitionException {
		lastYearGrammarParser.eXPRESSION_return retval = new lastYearGrammarParser.eXPRESSION_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope aDDEXPR107 =null;


		try { dbg.enterRule(getGrammarFileName(), "eXPRESSION");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(126, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:126:15: ( aDDEXPR )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:126:17: aDDEXPR
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(126,17);
			pushFollow(FOLLOW_aDDEXPR_in_eXPRESSION859);
			aDDEXPR107=aDDEXPR();
			state._fsp--;

			adaptor.addChild(root_0, aDDEXPR107.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(127, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "eXPRESSION");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "eXPRESSION"


	public static class eXPRESSION2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "eXPRESSION2"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:129:1: eXPRESSION2 : aTOMBIS ^ ( sUITE )* ;
	public final lastYearGrammarParser.eXPRESSION2_return eXPRESSION2() throws RecognitionException {
		lastYearGrammarParser.eXPRESSION2_return retval = new lastYearGrammarParser.eXPRESSION2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope aTOMBIS108 =null;
		ParserRuleReturnScope sUITE109 =null;


		try { dbg.enterRule(getGrammarFileName(), "eXPRESSION2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(129, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:129:15: ( aTOMBIS ^ ( sUITE )* )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:129:17: aTOMBIS ^ ( sUITE )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(129,24);
			pushFollow(FOLLOW_aTOMBIS_in_eXPRESSION2870);
			aTOMBIS108=aTOMBIS();
			state._fsp--;

			root_0 = (CommonTree)adaptor.becomeRoot(aTOMBIS108.getTree(), root_0);dbg.location(129,26);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:129:26: ( sUITE )*
			try { dbg.enterSubRule(24);

			loop24:
			while (true) {
				int alt24=2;
				try { dbg.enterDecision(24, decisionCanBacktrack[24]);

				int LA24_0 = input.LA(1);
				if ( (LA24_0==39) ) {
					alt24=1;
				}

				} finally {dbg.exitDecision(24);}

				switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:129:26: sUITE
					{
					dbg.location(129,26);
					pushFollow(FOLLOW_sUITE_in_eXPRESSION2873);
					sUITE109=sUITE();
					state._fsp--;

					adaptor.addChild(root_0, sUITE109.getTree());

					}
					break;

				default :
					break loop24;
				}
			}
			} finally {dbg.exitSubRule(24);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(129, 31);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "eXPRESSION2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "eXPRESSION2"


	public static class sUITE_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sUITE"
	// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:131:1: sUITE : ( '.' ! IDF ^ '(' ! ( eXPRESSION ( ',' ! eXPRESSION )* )? ')' !) ;
	public final lastYearGrammarParser.sUITE_return sUITE() throws RecognitionException {
		lastYearGrammarParser.sUITE_return retval = new lastYearGrammarParser.sUITE_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal110=null;
		Token IDF111=null;
		Token char_literal112=null;
		Token char_literal114=null;
		Token char_literal116=null;
		ParserRuleReturnScope eXPRESSION113 =null;
		ParserRuleReturnScope eXPRESSION115 =null;

		CommonTree char_literal110_tree=null;
		CommonTree IDF111_tree=null;
		CommonTree char_literal112_tree=null;
		CommonTree char_literal114_tree=null;
		CommonTree char_literal116_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "sUITE");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(131, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:131:10: ( ( '.' ! IDF ^ '(' ! ( eXPRESSION ( ',' ! eXPRESSION )* )? ')' !) )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:131:12: ( '.' ! IDF ^ '(' ! ( eXPRESSION ( ',' ! eXPRESSION )* )? ')' !)
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(131,12);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:131:12: ( '.' ! IDF ^ '(' ! ( eXPRESSION ( ',' ! eXPRESSION )* )? ')' !)
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:131:13: '.' ! IDF ^ '(' ! ( eXPRESSION ( ',' ! eXPRESSION )* )? ')' !
			{
			dbg.location(131,16);
			char_literal110=(Token)match(input,39,FOLLOW_39_in_sUITE886); dbg.location(131,21);
			IDF111=(Token)match(input,IDF,FOLLOW_IDF_in_sUITE889); 
			IDF111_tree = (CommonTree)adaptor.create(IDF111);
			root_0 = (CommonTree)adaptor.becomeRoot(IDF111_tree, root_0);
			dbg.location(131,26);
			char_literal112=(Token)match(input,33,FOLLOW_33_in_sUITE892); dbg.location(131,28);
			// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:131:28: ( eXPRESSION ( ',' ! eXPRESSION )* )?
			int alt26=2;
			try { dbg.enterSubRule(26);
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			int LA26_0 = input.LA(1);
			if ( (LA26_0==IDF||LA26_0==INT||LA26_0==NewStat||LA26_0==STRING||LA26_0==SuperStat||LA26_0==ThisStat||LA26_0==33||LA26_0==38) ) {
				alt26=1;
			}
			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:131:29: eXPRESSION ( ',' ! eXPRESSION )*
					{
					dbg.location(131,29);
					pushFollow(FOLLOW_eXPRESSION_in_sUITE896);
					eXPRESSION113=eXPRESSION();
					state._fsp--;

					adaptor.addChild(root_0, eXPRESSION113.getTree());
					dbg.location(131,40);
					// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:131:40: ( ',' ! eXPRESSION )*
					try { dbg.enterSubRule(25);

					loop25:
					while (true) {
						int alt25=2;
						try { dbg.enterDecision(25, decisionCanBacktrack[25]);

						int LA25_0 = input.LA(1);
						if ( (LA25_0==37) ) {
							alt25=1;
						}

						} finally {dbg.exitDecision(25);}

						switch (alt25) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/raimondi3u/CompilTest/lastYearGrammar.g:131:41: ',' ! eXPRESSION
							{
							dbg.location(131,44);
							char_literal114=(Token)match(input,37,FOLLOW_37_in_sUITE899); dbg.location(131,46);
							pushFollow(FOLLOW_eXPRESSION_in_sUITE902);
							eXPRESSION115=eXPRESSION();
							state._fsp--;

							adaptor.addChild(root_0, eXPRESSION115.getTree());

							}
							break;

						default :
							break loop25;
						}
					}
					} finally {dbg.exitSubRule(25);}

					}
					break;

			}
			} finally {dbg.exitSubRule(26);}
			dbg.location(131,64);
			char_literal116=(Token)match(input,34,FOLLOW_34_in_sUITE908); 
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(132, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "sUITE");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "sUITE"

	// Delegated rules



	public static final BitSet FOLLOW_pROGRAM_in_p72 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_p74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cLASS_DECL_in_pROGRAM89 = new BitSet(new long[]{0x0000800120C11940L});
	public static final BitSet FOLLOW_vAR_DECL_in_pROGRAM92 = new BitSet(new long[]{0x0000800120C11900L});
	public static final BitSet FOLLOW_iNSTRUCTION_in_pROGRAM95 = new BitSet(new long[]{0x0000800100C11902L});
	public static final BitSet FOLLOW_ClassStat_in_cLASS_DECL108 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_IDFMAJ_in_cLASS_DECL110 = new BitSet(new long[]{0x0000200000040000L});
	public static final BitSet FOLLOW_InheritStat_in_cLASS_DECL113 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_IDFMAJ_in_cLASS_DECL115 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_cLASS_DECL119 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_cLASS_DECL122 = new BitSet(new long[]{0x0000000420100000L});
	public static final BitSet FOLLOW_cLASS_ITEM_DECL_in_cLASS_DECL124 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_cLASS_DECL126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vAR_DECL_in_cLASS_ITEM_DECL179 = new BitSet(new long[]{0x0000000020100002L});
	public static final BitSet FOLLOW_mETHOD_DECL_in_cLASS_ITEM_DECL182 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_VarStat_in_vAR_DECL195 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDF_in_vAR_DECL197 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_vAR_DECL199 = new BitSet(new long[]{0x000000000200A000L});
	public static final BitSet FOLLOW_tYPE_in_vAR_DECL201 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_vAR_DECL203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MethodStat_in_mETHOD_DECL258 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDF_in_mETHOD_DECL260 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_mETHOD_DECL262 = new BitSet(new long[]{0x0000000400001000L});
	public static final BitSet FOLLOW_mETHOD_ARGS_in_mETHOD_DECL264 = new BitSet(new long[]{0x0000000400001000L});
	public static final BitSet FOLLOW_34_in_mETHOD_DECL267 = new BitSet(new long[]{0x0000840000000000L});
	public static final BitSet FOLLOW_mETHOD_TYPE_in_mETHOD_DECL269 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_mETHOD_DECL271 = new BitSet(new long[]{0x0000800120C11900L});
	public static final BitSet FOLLOW_vAR_DECL_in_mETHOD_DECL273 = new BitSet(new long[]{0x0000800120C11900L});
	public static final BitSet FOLLOW_iNSTRUCTION_in_mETHOD_DECL276 = new BitSet(new long[]{0x0001800100C11900L});
	public static final BitSet FOLLOW_48_in_mETHOD_DECL279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_mETHOD_TYPE311 = new BitSet(new long[]{0x000000000200A000L});
	public static final BitSet FOLLOW_tYPE_in_mETHOD_TYPE313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_mETHOD_ARGS345 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_mETHOD_ARGS347 = new BitSet(new long[]{0x000000000200A000L});
	public static final BitSet FOLLOW_tYPE_in_mETHOD_ARGS349 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_mETHOD_ARGS352 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDF_in_mETHOD_ARGS354 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_mETHOD_ARGS356 = new BitSet(new long[]{0x000000000200A000L});
	public static final BitSet FOLLOW_tYPE_in_mETHOD_ARGS358 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_IDF_in_iNSTRUCTION380 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_iNSTRUCTION382 = new BitSet(new long[]{0x0000004215205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_iNSTRUCTION385 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_iNSTRUCTION388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IfStat_in_iNSTRUCTION402 = new BitSet(new long[]{0x0000004215205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_iNSTRUCTION404 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_ThenStat_in_iNSTRUCTION406 = new BitSet(new long[]{0x0000800100C11900L});
	public static final BitSet FOLLOW_iNSTRUCTION_in_iNSTRUCTION408 = new BitSet(new long[]{0x0000400000000400L});
	public static final BitSet FOLLOW_46_in_iNSTRUCTION411 = new BitSet(new long[]{0x0000800100C11900L});
	public static final BitSet FOLLOW_iNSTRUCTION_in_iNSTRUCTION413 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_FiStat_in_iNSTRUCTION417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ForStat_in_iNSTRUCTION442 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDF_in_iNSTRUCTION444 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_InStat_in_iNSTRUCTION446 = new BitSet(new long[]{0x0000004215205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_iNSTRUCTION448 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_iNSTRUCTION450 = new BitSet(new long[]{0x0000004215205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_iNSTRUCTION452 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DoStat_in_iNSTRUCTION454 = new BitSet(new long[]{0x0000800100C11900L});
	public static final BitSet FOLLOW_iNSTRUCTION_in_iNSTRUCTION456 = new BitSet(new long[]{0x0000800100C11B00L});
	public static final BitSet FOLLOW_EndStat_in_iNSTRUCTION459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_iNSTRUCTION486 = new BitSet(new long[]{0x0000800120C11900L});
	public static final BitSet FOLLOW_vAR_DECL_in_iNSTRUCTION488 = new BitSet(new long[]{0x0000800120C11900L});
	public static final BitSet FOLLOW_iNSTRUCTION_in_iNSTRUCTION491 = new BitSet(new long[]{0x0001800100C11900L});
	public static final BitSet FOLLOW_48_in_iNSTRUCTION494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DoStat_in_iNSTRUCTION510 = new BitSet(new long[]{0x0000004215205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_iNSTRUCTION512 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_iNSTRUCTION513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pRINT_in_iNSTRUCTION525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rEAD_in_iNSTRUCTION529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rETURN2_in_iNSTRUCTION533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WriteStat_in_pRINT616 = new BitSet(new long[]{0x0000004215205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_pRINT619 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_pRINT621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ReadStat_in_rEAD644 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDF_in_rEAD647 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_rEAD649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ReturnStat_in_rETURN2670 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_rETURN2673 = new BitSet(new long[]{0x0000004215205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_rETURN2676 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_rETURN2678 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_rETURN2681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_aTOM705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_aTOM709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_aTOM713 = new BitSet(new long[]{0x0000004215205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_aTOM716 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_aTOM718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_eXPRESSION2_in_aTOM722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ThisStat_in_aTOMBIS733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_aTOMBIS736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SuperStat_in_aTOMBIS739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NewStat_in_aTOMBIS742 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_IDFMAJ_in_aTOMBIS745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mOINEXPR_in_bOOLEXPR758 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_nOTMOINSEXPR_in_bOOLEXPR760 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_BOOLOPER_in_bOOLEXPR764 = new BitSet(new long[]{0x0000004215205000L});
	public static final BitSet FOLLOW_mOINEXPR_in_bOOLEXPR768 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_nOTMOINSEXPR_in_bOOLEXPR770 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_bOOLEXPR_in_mULTEXPR784 = new BitSet(new long[]{0x0000020800000002L});
	public static final BitSet FOLLOW_set_in_mULTEXPR787 = new BitSet(new long[]{0x0000004215205000L});
	public static final BitSet FOLLOW_bOOLEXPR_in_mULTEXPR794 = new BitSet(new long[]{0x0000020800000002L});
	public static final BitSet FOLLOW_mULTEXPR_in_aDDEXPR807 = new BitSet(new long[]{0x0000005000000002L});
	public static final BitSet FOLLOW_set_in_aDDEXPR810 = new BitSet(new long[]{0x0000004215205000L});
	public static final BitSet FOLLOW_mULTEXPR_in_aDDEXPR817 = new BitSet(new long[]{0x0000005000000002L});
	public static final BitSet FOLLOW_38_in_mOINEXPR829 = new BitSet(new long[]{0x0000000215205000L});
	public static final BitSet FOLLOW_aTOM_in_mOINEXPR831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aTOM_in_nOTMOINSEXPR848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aDDEXPR_in_eXPRESSION859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aTOMBIS_in_eXPRESSION2870 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_sUITE_in_eXPRESSION2873 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_sUITE886 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDF_in_sUITE889 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_sUITE892 = new BitSet(new long[]{0x0000004615205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_sUITE896 = new BitSet(new long[]{0x0000002400000000L});
	public static final BitSet FOLLOW_37_in_sUITE899 = new BitSet(new long[]{0x0000004215205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_sUITE902 = new BitSet(new long[]{0x0000002400000000L});
	public static final BitSet FOLLOW_34_in_sUITE908 = new BitSet(new long[]{0x0000000000000002L});
}
