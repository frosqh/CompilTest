// $ANTLR 3.5.2 Grammar.g 2017-03-27 11:32:58

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class GrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLOPER", "COMMENT", "ClassStat", 
		"DoExpr", "DoStat", "EndStat", "FiStat", "ForStat", "IDF", "IDFMAJ", "INT", 
		"INTTYPE", "IfStat", "InStat", "InheritStat", "Inner", "MethodStat", "NewStat", 
		"ReadStat", "ReturnStat", "STRING", "STRINGTYPE", "SuperStat", "ThenStat", 
		"ThisStat", "VarStat", "WS", "WriteStat", "'('", "')'", "'*'", "'+'", 
		"','", "'-'", "'.'", "'..'", "'/'", "':'", "':='", "';'", "'='", "'else'", 
		"'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int WS=30;
	public static final int WriteStat=31;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return GrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Grammar.g"; }


	public static class p_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "p"
	// Grammar.g:15:1: p : pROGRAM EOF -> pROGRAM ;
	public final GrammarParser.p_return p() throws RecognitionException {
		GrammarParser.p_return retval = new GrammarParser.p_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope pROGRAM1 =null;

		CommonTree EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_pROGRAM=new RewriteRuleSubtreeStream(adaptor,"rule pROGRAM");

		try {
			// Grammar.g:15:5: ( pROGRAM EOF -> pROGRAM )
			// Grammar.g:15:7: pROGRAM EOF
			{
			pushFollow(FOLLOW_pROGRAM_in_p76);
			pROGRAM1=pROGRAM();
			state._fsp--;

			stream_pROGRAM.add(pROGRAM1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_p78);  
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
			// 15:19: -> pROGRAM
			{
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
		return retval;
	}
	// $ANTLR end "p"


	public static class pROGRAM_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "pROGRAM"
	// Grammar.g:18:1: pROGRAM : ( cLASS_DECL )* ( vAR_DECL )* ( iNSTRUCTION )+ ;
	public final GrammarParser.pROGRAM_return pROGRAM() throws RecognitionException {
		GrammarParser.pROGRAM_return retval = new GrammarParser.pROGRAM_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope cLASS_DECL3 =null;
		ParserRuleReturnScope vAR_DECL4 =null;
		ParserRuleReturnScope iNSTRUCTION5 =null;


		try {
			// Grammar.g:18:11: ( ( cLASS_DECL )* ( vAR_DECL )* ( iNSTRUCTION )+ )
			// Grammar.g:18:13: ( cLASS_DECL )* ( vAR_DECL )* ( iNSTRUCTION )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:18:13: ( cLASS_DECL )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ClassStat) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Grammar.g:18:13: cLASS_DECL
					{
					pushFollow(FOLLOW_cLASS_DECL_in_pROGRAM96);
					cLASS_DECL3=cLASS_DECL();
					state._fsp--;

					adaptor.addChild(root_0, cLASS_DECL3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			// Grammar.g:18:25: ( vAR_DECL )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==VarStat) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Grammar.g:18:25: vAR_DECL
					{
					pushFollow(FOLLOW_vAR_DECL_in_pROGRAM99);
					vAR_DECL4=vAR_DECL();
					state._fsp--;

					adaptor.addChild(root_0, vAR_DECL4.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			// Grammar.g:18:35: ( iNSTRUCTION )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==DoStat||(LA3_0 >= ForStat && LA3_0 <= IDF)||LA3_0==IfStat||(LA3_0 >= ReadStat && LA3_0 <= ReturnStat)||LA3_0==WriteStat||LA3_0==46) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Grammar.g:18:35: iNSTRUCTION
					{
					pushFollow(FOLLOW_iNSTRUCTION_in_pROGRAM102);
					iNSTRUCTION5=iNSTRUCTION();
					state._fsp--;

					adaptor.addChild(root_0, iNSTRUCTION5.getTree());

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
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
		return retval;
	}
	// $ANTLR end "pROGRAM"


	public static class cLASS_DECL_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cLASS_DECL"
	// Grammar.g:21:1: cLASS_DECL : ( ClassStat IDFMAJ ( InheritStat IDFMAJ )? '=' ) '(' cLASS_ITEM_DECL ')' -> ^( ClassStat IDFMAJ ( ^( InheritStat IDFMAJ ) )? ( cLASS_ITEM_DECL )? ) ;
	public final GrammarParser.cLASS_DECL_return cLASS_DECL() throws RecognitionException {
		GrammarParser.cLASS_DECL_return retval = new GrammarParser.cLASS_DECL_return();
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
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_ClassStat=new RewriteRuleTokenStream(adaptor,"token ClassStat");
		RewriteRuleTokenStream stream_InheritStat=new RewriteRuleTokenStream(adaptor,"token InheritStat");
		RewriteRuleTokenStream stream_IDFMAJ=new RewriteRuleTokenStream(adaptor,"token IDFMAJ");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_cLASS_ITEM_DECL=new RewriteRuleSubtreeStream(adaptor,"rule cLASS_ITEM_DECL");

		try {
			// Grammar.g:21:14: ( ( ClassStat IDFMAJ ( InheritStat IDFMAJ )? '=' ) '(' cLASS_ITEM_DECL ')' -> ^( ClassStat IDFMAJ ( ^( InheritStat IDFMAJ ) )? ( cLASS_ITEM_DECL )? ) )
			// Grammar.g:21:16: ( ClassStat IDFMAJ ( InheritStat IDFMAJ )? '=' ) '(' cLASS_ITEM_DECL ')'
			{
			// Grammar.g:21:16: ( ClassStat IDFMAJ ( InheritStat IDFMAJ )? '=' )
			// Grammar.g:21:17: ClassStat IDFMAJ ( InheritStat IDFMAJ )? '='
			{
			ClassStat6=(Token)match(input,ClassStat,FOLLOW_ClassStat_in_cLASS_DECL118);  
			stream_ClassStat.add(ClassStat6);

			IDFMAJ7=(Token)match(input,IDFMAJ,FOLLOW_IDFMAJ_in_cLASS_DECL120);  
			stream_IDFMAJ.add(IDFMAJ7);

			// Grammar.g:21:34: ( InheritStat IDFMAJ )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==InheritStat) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Grammar.g:21:35: InheritStat IDFMAJ
					{
					InheritStat8=(Token)match(input,InheritStat,FOLLOW_InheritStat_in_cLASS_DECL123);  
					stream_InheritStat.add(InheritStat8);

					IDFMAJ9=(Token)match(input,IDFMAJ,FOLLOW_IDFMAJ_in_cLASS_DECL125);  
					stream_IDFMAJ.add(IDFMAJ9);

					}
					break;

			}

			char_literal10=(Token)match(input,44,FOLLOW_44_in_cLASS_DECL129);  
			stream_44.add(char_literal10);

			}

			char_literal11=(Token)match(input,32,FOLLOW_32_in_cLASS_DECL132);  
			stream_32.add(char_literal11);

			pushFollow(FOLLOW_cLASS_ITEM_DECL_in_cLASS_DECL134);
			cLASS_ITEM_DECL12=cLASS_ITEM_DECL();
			state._fsp--;

			stream_cLASS_ITEM_DECL.add(cLASS_ITEM_DECL12.getTree());
			char_literal13=(Token)match(input,33,FOLLOW_33_in_cLASS_DECL136);  
			stream_33.add(char_literal13);

			// AST REWRITE
			// elements: cLASS_ITEM_DECL, IDFMAJ, ClassStat, InheritStat, IDFMAJ
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 21:85: -> ^( ClassStat IDFMAJ ( ^( InheritStat IDFMAJ ) )? ( cLASS_ITEM_DECL )? )
			{
				// Grammar.g:21:88: ^( ClassStat IDFMAJ ( ^( InheritStat IDFMAJ ) )? ( cLASS_ITEM_DECL )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ClassStat.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDFMAJ.nextNode());
				// Grammar.g:21:107: ( ^( InheritStat IDFMAJ ) )?
				if ( stream_IDFMAJ.hasNext()||stream_InheritStat.hasNext() ) {
					// Grammar.g:21:107: ^( InheritStat IDFMAJ )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot(stream_InheritStat.nextNode(), root_2);
					adaptor.addChild(root_2, stream_IDFMAJ.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_IDFMAJ.reset();
				stream_InheritStat.reset();

				// Grammar.g:21:130: ( cLASS_ITEM_DECL )?
				if ( stream_cLASS_ITEM_DECL.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "cLASS_DECL"


	public static class cLASS_ITEM_DECL_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cLASS_ITEM_DECL"
	// Grammar.g:30:1: cLASS_ITEM_DECL : ( vAR_DECL )* ( mETHOD_DECL )* ;
	public final GrammarParser.cLASS_ITEM_DECL_return cLASS_ITEM_DECL() throws RecognitionException {
		GrammarParser.cLASS_ITEM_DECL_return retval = new GrammarParser.cLASS_ITEM_DECL_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope vAR_DECL14 =null;
		ParserRuleReturnScope mETHOD_DECL15 =null;


		try {
			// Grammar.g:30:18: ( ( vAR_DECL )* ( mETHOD_DECL )* )
			// Grammar.g:30:20: ( vAR_DECL )* ( mETHOD_DECL )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:30:20: ( vAR_DECL )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==VarStat) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Grammar.g:30:20: vAR_DECL
					{
					pushFollow(FOLLOW_vAR_DECL_in_cLASS_ITEM_DECL200);
					vAR_DECL14=vAR_DECL();
					state._fsp--;

					adaptor.addChild(root_0, vAR_DECL14.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			// Grammar.g:30:30: ( mETHOD_DECL )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==MethodStat) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Grammar.g:30:30: mETHOD_DECL
					{
					pushFollow(FOLLOW_mETHOD_DECL_in_cLASS_ITEM_DECL203);
					mETHOD_DECL15=mETHOD_DECL();
					state._fsp--;

					adaptor.addChild(root_0, mETHOD_DECL15.getTree());

					}
					break;

				default :
					break loop6;
				}
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
		return retval;
	}
	// $ANTLR end "cLASS_ITEM_DECL"


	public static class vAR_DECL_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "vAR_DECL"
	// Grammar.g:33:1: vAR_DECL : VarStat IDF ':' tYPE ';' -> ^( VarStat IDF tYPE ) ;
	public final GrammarParser.vAR_DECL_return vAR_DECL() throws RecognitionException {
		GrammarParser.vAR_DECL_return retval = new GrammarParser.vAR_DECL_return();
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
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_tYPE=new RewriteRuleSubtreeStream(adaptor,"rule tYPE");

		try {
			// Grammar.g:33:12: ( VarStat IDF ':' tYPE ';' -> ^( VarStat IDF tYPE ) )
			// Grammar.g:33:14: VarStat IDF ':' tYPE ';'
			{
			VarStat16=(Token)match(input,VarStat,FOLLOW_VarStat_in_vAR_DECL219);  
			stream_VarStat.add(VarStat16);

			IDF17=(Token)match(input,IDF,FOLLOW_IDF_in_vAR_DECL221);  
			stream_IDF.add(IDF17);

			char_literal18=(Token)match(input,41,FOLLOW_41_in_vAR_DECL223);  
			stream_41.add(char_literal18);

			pushFollow(FOLLOW_tYPE_in_vAR_DECL225);
			tYPE19=tYPE();
			state._fsp--;

			stream_tYPE.add(tYPE19.getTree());
			char_literal20=(Token)match(input,43,FOLLOW_43_in_vAR_DECL227);  
			stream_43.add(char_literal20);

			// AST REWRITE
			// elements: tYPE, VarStat, IDF
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 33:39: -> ^( VarStat IDF tYPE )
			{
				// Grammar.g:33:42: ^( VarStat IDF tYPE )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_VarStat.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDF.nextNode());
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
		return retval;
	}
	// $ANTLR end "vAR_DECL"


	public static class tYPE_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tYPE"
	// Grammar.g:40:1: tYPE : ( INTTYPE | STRINGTYPE | IDFMAJ );
	public final GrammarParser.tYPE_return tYPE() throws RecognitionException {
		GrammarParser.tYPE_return retval = new GrammarParser.tYPE_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set21=null;

		CommonTree set21_tree=null;

		try {
			// Grammar.g:40:9: ( INTTYPE | STRINGTYPE | IDFMAJ )
			// Grammar.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set21=input.LT(1);
			if ( input.LA(1)==IDFMAJ||input.LA(1)==INTTYPE||input.LA(1)==STRINGTYPE ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set21));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
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
		return retval;
	}
	// $ANTLR end "tYPE"


	public static class mETHOD_DECL_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mETHOD_DECL"
	// Grammar.g:45:1: mETHOD_DECL : MethodStat IDF '(' ( mETHOD_ARGS )* ')' ( ':' tYPE )? '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}' ';' -> ^( MethodStat ^( IDF ( mETHOD_ARGS )* ( tYPE )? ) ( vAR_DECL )* ( iNSTRUCTION )+ ) ;
	public final GrammarParser.mETHOD_DECL_return mETHOD_DECL() throws RecognitionException {
		GrammarParser.mETHOD_DECL_return retval = new GrammarParser.mETHOD_DECL_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MethodStat22=null;
		Token IDF23=null;
		Token char_literal24=null;
		Token char_literal26=null;
		Token char_literal27=null;
		Token char_literal29=null;
		Token char_literal32=null;
		Token char_literal33=null;
		ParserRuleReturnScope mETHOD_ARGS25 =null;
		ParserRuleReturnScope tYPE28 =null;
		ParserRuleReturnScope vAR_DECL30 =null;
		ParserRuleReturnScope iNSTRUCTION31 =null;

		CommonTree MethodStat22_tree=null;
		CommonTree IDF23_tree=null;
		CommonTree char_literal24_tree=null;
		CommonTree char_literal26_tree=null;
		CommonTree char_literal27_tree=null;
		CommonTree char_literal29_tree=null;
		CommonTree char_literal32_tree=null;
		CommonTree char_literal33_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_MethodStat=new RewriteRuleTokenStream(adaptor,"token MethodStat");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_vAR_DECL=new RewriteRuleSubtreeStream(adaptor,"rule vAR_DECL");
		RewriteRuleSubtreeStream stream_mETHOD_ARGS=new RewriteRuleSubtreeStream(adaptor,"rule mETHOD_ARGS");
		RewriteRuleSubtreeStream stream_tYPE=new RewriteRuleSubtreeStream(adaptor,"rule tYPE");
		RewriteRuleSubtreeStream stream_iNSTRUCTION=new RewriteRuleSubtreeStream(adaptor,"rule iNSTRUCTION");

		try {
			// Grammar.g:45:14: ( MethodStat IDF '(' ( mETHOD_ARGS )* ')' ( ':' tYPE )? '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}' ';' -> ^( MethodStat ^( IDF ( mETHOD_ARGS )* ( tYPE )? ) ( vAR_DECL )* ( iNSTRUCTION )+ ) )
			// Grammar.g:45:16: MethodStat IDF '(' ( mETHOD_ARGS )* ')' ( ':' tYPE )? '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}' ';'
			{
			MethodStat22=(Token)match(input,MethodStat,FOLLOW_MethodStat_in_mETHOD_DECL306);  
			stream_MethodStat.add(MethodStat22);

			IDF23=(Token)match(input,IDF,FOLLOW_IDF_in_mETHOD_DECL308);  
			stream_IDF.add(IDF23);

			char_literal24=(Token)match(input,32,FOLLOW_32_in_mETHOD_DECL310);  
			stream_32.add(char_literal24);

			// Grammar.g:45:35: ( mETHOD_ARGS )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==IDF) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Grammar.g:45:35: mETHOD_ARGS
					{
					pushFollow(FOLLOW_mETHOD_ARGS_in_mETHOD_DECL312);
					mETHOD_ARGS25=mETHOD_ARGS();
					state._fsp--;

					stream_mETHOD_ARGS.add(mETHOD_ARGS25.getTree());
					}
					break;

				default :
					break loop7;
				}
			}

			char_literal26=(Token)match(input,33,FOLLOW_33_in_mETHOD_DECL315);  
			stream_33.add(char_literal26);

			// Grammar.g:45:52: ( ':' tYPE )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==41) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Grammar.g:45:53: ':' tYPE
					{
					char_literal27=(Token)match(input,41,FOLLOW_41_in_mETHOD_DECL318);  
					stream_41.add(char_literal27);

					pushFollow(FOLLOW_tYPE_in_mETHOD_DECL320);
					tYPE28=tYPE();
					state._fsp--;

					stream_tYPE.add(tYPE28.getTree());
					}
					break;

			}

			char_literal29=(Token)match(input,46,FOLLOW_46_in_mETHOD_DECL324);  
			stream_46.add(char_literal29);

			// Grammar.g:45:68: ( vAR_DECL )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==VarStat) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Grammar.g:45:68: vAR_DECL
					{
					pushFollow(FOLLOW_vAR_DECL_in_mETHOD_DECL326);
					vAR_DECL30=vAR_DECL();
					state._fsp--;

					stream_vAR_DECL.add(vAR_DECL30.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			// Grammar.g:45:78: ( iNSTRUCTION )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==DoStat||(LA10_0 >= ForStat && LA10_0 <= IDF)||LA10_0==IfStat||(LA10_0 >= ReadStat && LA10_0 <= ReturnStat)||LA10_0==WriteStat||LA10_0==46) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Grammar.g:45:78: iNSTRUCTION
					{
					pushFollow(FOLLOW_iNSTRUCTION_in_mETHOD_DECL329);
					iNSTRUCTION31=iNSTRUCTION();
					state._fsp--;

					stream_iNSTRUCTION.add(iNSTRUCTION31.getTree());
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			char_literal32=(Token)match(input,47,FOLLOW_47_in_mETHOD_DECL332);  
			stream_47.add(char_literal32);

			char_literal33=(Token)match(input,43,FOLLOW_43_in_mETHOD_DECL334);  
			stream_43.add(char_literal33);

			// AST REWRITE
			// elements: vAR_DECL, IDF, mETHOD_ARGS, MethodStat, iNSTRUCTION, tYPE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 45:99: -> ^( MethodStat ^( IDF ( mETHOD_ARGS )* ( tYPE )? ) ( vAR_DECL )* ( iNSTRUCTION )+ )
			{
				// Grammar.g:45:102: ^( MethodStat ^( IDF ( mETHOD_ARGS )* ( tYPE )? ) ( vAR_DECL )* ( iNSTRUCTION )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_MethodStat.nextNode(), root_1);
				// Grammar.g:45:115: ^( IDF ( mETHOD_ARGS )* ( tYPE )? )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_2);
				// Grammar.g:45:121: ( mETHOD_ARGS )*
				while ( stream_mETHOD_ARGS.hasNext() ) {
					adaptor.addChild(root_2, stream_mETHOD_ARGS.nextTree());
				}
				stream_mETHOD_ARGS.reset();

				// Grammar.g:45:134: ( tYPE )?
				if ( stream_tYPE.hasNext() ) {
					adaptor.addChild(root_2, stream_tYPE.nextTree());
				}
				stream_tYPE.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Grammar.g:45:141: ( vAR_DECL )*
				while ( stream_vAR_DECL.hasNext() ) {
					adaptor.addChild(root_1, stream_vAR_DECL.nextTree());
				}
				stream_vAR_DECL.reset();

				if ( !(stream_iNSTRUCTION.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_iNSTRUCTION.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "mETHOD_DECL"


	public static class mETHOD_ARGS_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mETHOD_ARGS"
	// Grammar.g:52:1: mETHOD_ARGS : IDF ':' tYPE ( ',' IDF ':' tYPE )* -> ( ^( IDF tYPE ) )* ;
	public final GrammarParser.mETHOD_ARGS_return mETHOD_ARGS() throws RecognitionException {
		GrammarParser.mETHOD_ARGS_return retval = new GrammarParser.mETHOD_ARGS_return();
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
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_tYPE=new RewriteRuleSubtreeStream(adaptor,"rule tYPE");

		try {
			// Grammar.g:52:14: ( IDF ':' tYPE ( ',' IDF ':' tYPE )* -> ( ^( IDF tYPE ) )* )
			// Grammar.g:52:16: IDF ':' tYPE ( ',' IDF ':' tYPE )*
			{
			IDF34=(Token)match(input,IDF,FOLLOW_IDF_in_mETHOD_ARGS390);  
			stream_IDF.add(IDF34);

			char_literal35=(Token)match(input,41,FOLLOW_41_in_mETHOD_ARGS392);  
			stream_41.add(char_literal35);

			pushFollow(FOLLOW_tYPE_in_mETHOD_ARGS394);
			tYPE36=tYPE();
			state._fsp--;

			stream_tYPE.add(tYPE36.getTree());
			// Grammar.g:52:29: ( ',' IDF ':' tYPE )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==36) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// Grammar.g:52:30: ',' IDF ':' tYPE
					{
					char_literal37=(Token)match(input,36,FOLLOW_36_in_mETHOD_ARGS397);  
					stream_36.add(char_literal37);

					IDF38=(Token)match(input,IDF,FOLLOW_IDF_in_mETHOD_ARGS399);  
					stream_IDF.add(IDF38);

					char_literal39=(Token)match(input,41,FOLLOW_41_in_mETHOD_ARGS401);  
					stream_41.add(char_literal39);

					pushFollow(FOLLOW_tYPE_in_mETHOD_ARGS403);
					tYPE40=tYPE();
					state._fsp--;

					stream_tYPE.add(tYPE40.getTree());
					}
					break;

				default :
					break loop11;
				}
			}

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
			// 52:49: -> ( ^( IDF tYPE ) )*
			{
				// Grammar.g:52:52: ( ^( IDF tYPE ) )*
				while ( stream_IDF.hasNext()||stream_tYPE.hasNext() ) {
					// Grammar.g:52:52: ^( IDF tYPE )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					root_1 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_1);
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
		return retval;
	}
	// $ANTLR end "mETHOD_ARGS"


	public static class iNSTRUCTION_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "iNSTRUCTION"
	// Grammar.g:55:1: iNSTRUCTION : ( IDF ':=' ( eXPRESSION ) ';' -> ^( ':=' IDF eXPRESSION ) | IfStat eXPRESSION ThenStat iNSTRUCTION ( 'else' iNSTRUCTION )? FiStat -> ^( IfStat eXPRESSION ^( ThenStat iNSTRUCTION ) ( ^( 'else' iNSTRUCTION ) )? ) | ForStat IDF InStat eXPRESSION '..' eXPRESSION DoStat ( iNSTRUCTION )+ EndStat -> ^( ForStat ^( InStat IDF eXPRESSION eXPRESSION ) ^( DoStat ( iNSTRUCTION )+ ) ) | '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}' -> ^( Inner ( vAR_DECL )* ( iNSTRUCTION )* ) | DoStat eXPRESSION ';' -> ^( DoExpr eXPRESSION ) | pRINT | rEAD | rETURN2 );
	public final GrammarParser.iNSTRUCTION_return iNSTRUCTION() throws RecognitionException {
		GrammarParser.iNSTRUCTION_return retval = new GrammarParser.iNSTRUCTION_return();
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
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_EndStat=new RewriteRuleTokenStream(adaptor,"token EndStat");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_IfStat=new RewriteRuleTokenStream(adaptor,"token IfStat");
		RewriteRuleTokenStream stream_ThenStat=new RewriteRuleTokenStream(adaptor,"token ThenStat");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_ForStat=new RewriteRuleTokenStream(adaptor,"token ForStat");
		RewriteRuleTokenStream stream_DoStat=new RewriteRuleTokenStream(adaptor,"token DoStat");
		RewriteRuleTokenStream stream_FiStat=new RewriteRuleTokenStream(adaptor,"token FiStat");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_InStat=new RewriteRuleTokenStream(adaptor,"token InStat");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_vAR_DECL=new RewriteRuleSubtreeStream(adaptor,"rule vAR_DECL");
		RewriteRuleSubtreeStream stream_eXPRESSION=new RewriteRuleSubtreeStream(adaptor,"rule eXPRESSION");
		RewriteRuleSubtreeStream stream_iNSTRUCTION=new RewriteRuleSubtreeStream(adaptor,"rule iNSTRUCTION");

		try {
			// Grammar.g:55:15: ( IDF ':=' ( eXPRESSION ) ';' -> ^( ':=' IDF eXPRESSION ) | IfStat eXPRESSION ThenStat iNSTRUCTION ( 'else' iNSTRUCTION )? FiStat -> ^( IfStat eXPRESSION ^( ThenStat iNSTRUCTION ) ( ^( 'else' iNSTRUCTION ) )? ) | ForStat IDF InStat eXPRESSION '..' eXPRESSION DoStat ( iNSTRUCTION )+ EndStat -> ^( ForStat ^( InStat IDF eXPRESSION eXPRESSION ) ^( DoStat ( iNSTRUCTION )+ ) ) | '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}' -> ^( Inner ( vAR_DECL )* ( iNSTRUCTION )* ) | DoStat eXPRESSION ';' -> ^( DoExpr eXPRESSION ) | pRINT | rEAD | rETURN2 )
			int alt16=8;
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
			case 46:
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
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// Grammar.g:55:17: IDF ':=' ( eXPRESSION ) ';'
					{
					IDF41=(Token)match(input,IDF,FOLLOW_IDF_in_iNSTRUCTION431);  
					stream_IDF.add(IDF41);

					string_literal42=(Token)match(input,42,FOLLOW_42_in_iNSTRUCTION433);  
					stream_42.add(string_literal42);

					// Grammar.g:55:26: ( eXPRESSION )
					// Grammar.g:55:27: eXPRESSION
					{
					pushFollow(FOLLOW_eXPRESSION_in_iNSTRUCTION436);
					eXPRESSION43=eXPRESSION();
					state._fsp--;

					stream_eXPRESSION.add(eXPRESSION43.getTree());
					}

					char_literal44=(Token)match(input,43,FOLLOW_43_in_iNSTRUCTION439);  
					stream_43.add(char_literal44);

					// AST REWRITE
					// elements: eXPRESSION, 42, IDF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 55:43: -> ^( ':=' IDF eXPRESSION )
					{
						// Grammar.g:55:46: ^( ':=' IDF eXPRESSION )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_42.nextNode(), root_1);
						adaptor.addChild(root_1, stream_IDF.nextNode());
						adaptor.addChild(root_1, stream_eXPRESSION.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:56:6: IfStat eXPRESSION ThenStat iNSTRUCTION ( 'else' iNSTRUCTION )? FiStat
					{
					IfStat45=(Token)match(input,IfStat,FOLLOW_IfStat_in_iNSTRUCTION456);  
					stream_IfStat.add(IfStat45);

					pushFollow(FOLLOW_eXPRESSION_in_iNSTRUCTION458);
					eXPRESSION46=eXPRESSION();
					state._fsp--;

					stream_eXPRESSION.add(eXPRESSION46.getTree());
					ThenStat47=(Token)match(input,ThenStat,FOLLOW_ThenStat_in_iNSTRUCTION460);  
					stream_ThenStat.add(ThenStat47);

					pushFollow(FOLLOW_iNSTRUCTION_in_iNSTRUCTION462);
					iNSTRUCTION48=iNSTRUCTION();
					state._fsp--;

					stream_iNSTRUCTION.add(iNSTRUCTION48.getTree());
					// Grammar.g:56:45: ( 'else' iNSTRUCTION )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==45) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// Grammar.g:56:46: 'else' iNSTRUCTION
							{
							string_literal49=(Token)match(input,45,FOLLOW_45_in_iNSTRUCTION465);  
							stream_45.add(string_literal49);

							pushFollow(FOLLOW_iNSTRUCTION_in_iNSTRUCTION467);
							iNSTRUCTION50=iNSTRUCTION();
							state._fsp--;

							stream_iNSTRUCTION.add(iNSTRUCTION50.getTree());
							}
							break;

					}

					FiStat51=(Token)match(input,FiStat,FOLLOW_FiStat_in_iNSTRUCTION471);  
					stream_FiStat.add(FiStat51);

					// AST REWRITE
					// elements: IfStat, iNSTRUCTION, eXPRESSION, ThenStat, 45, iNSTRUCTION
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 56:74: -> ^( IfStat eXPRESSION ^( ThenStat iNSTRUCTION ) ( ^( 'else' iNSTRUCTION ) )? )
					{
						// Grammar.g:56:77: ^( IfStat eXPRESSION ^( ThenStat iNSTRUCTION ) ( ^( 'else' iNSTRUCTION ) )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_IfStat.nextNode(), root_1);
						adaptor.addChild(root_1, stream_eXPRESSION.nextTree());
						// Grammar.g:56:97: ^( ThenStat iNSTRUCTION )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_ThenStat.nextNode(), root_2);
						adaptor.addChild(root_2, stream_iNSTRUCTION.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// Grammar.g:56:121: ( ^( 'else' iNSTRUCTION ) )?
						if ( stream_45.hasNext()||stream_iNSTRUCTION.hasNext() ) {
							// Grammar.g:56:121: ^( 'else' iNSTRUCTION )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot(stream_45.nextNode(), root_2);
							adaptor.addChild(root_2, stream_iNSTRUCTION.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_45.reset();
						stream_iNSTRUCTION.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Grammar.g:57:6: ForStat IDF InStat eXPRESSION '..' eXPRESSION DoStat ( iNSTRUCTION )+ EndStat
					{
					ForStat52=(Token)match(input,ForStat,FOLLOW_ForStat_in_iNSTRUCTION499);  
					stream_ForStat.add(ForStat52);

					IDF53=(Token)match(input,IDF,FOLLOW_IDF_in_iNSTRUCTION501);  
					stream_IDF.add(IDF53);

					InStat54=(Token)match(input,InStat,FOLLOW_InStat_in_iNSTRUCTION503);  
					stream_InStat.add(InStat54);

					pushFollow(FOLLOW_eXPRESSION_in_iNSTRUCTION505);
					eXPRESSION55=eXPRESSION();
					state._fsp--;

					stream_eXPRESSION.add(eXPRESSION55.getTree());
					string_literal56=(Token)match(input,39,FOLLOW_39_in_iNSTRUCTION507);  
					stream_39.add(string_literal56);

					pushFollow(FOLLOW_eXPRESSION_in_iNSTRUCTION509);
					eXPRESSION57=eXPRESSION();
					state._fsp--;

					stream_eXPRESSION.add(eXPRESSION57.getTree());
					DoStat58=(Token)match(input,DoStat,FOLLOW_DoStat_in_iNSTRUCTION511);  
					stream_DoStat.add(DoStat58);

					// Grammar.g:57:59: ( iNSTRUCTION )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==DoStat||(LA13_0 >= ForStat && LA13_0 <= IDF)||LA13_0==IfStat||(LA13_0 >= ReadStat && LA13_0 <= ReturnStat)||LA13_0==WriteStat||LA13_0==46) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// Grammar.g:57:59: iNSTRUCTION
							{
							pushFollow(FOLLOW_iNSTRUCTION_in_iNSTRUCTION513);
							iNSTRUCTION59=iNSTRUCTION();
							state._fsp--;

							stream_iNSTRUCTION.add(iNSTRUCTION59.getTree());
							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					EndStat60=(Token)match(input,EndStat,FOLLOW_EndStat_in_iNSTRUCTION516);  
					stream_EndStat.add(EndStat60);

					// AST REWRITE
					// elements: iNSTRUCTION, ForStat, eXPRESSION, IDF, eXPRESSION, InStat, DoStat
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 57:80: -> ^( ForStat ^( InStat IDF eXPRESSION eXPRESSION ) ^( DoStat ( iNSTRUCTION )+ ) )
					{
						// Grammar.g:57:83: ^( ForStat ^( InStat IDF eXPRESSION eXPRESSION ) ^( DoStat ( iNSTRUCTION )+ ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_ForStat.nextNode(), root_1);
						// Grammar.g:57:93: ^( InStat IDF eXPRESSION eXPRESSION )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_InStat.nextNode(), root_2);
						adaptor.addChild(root_2, stream_IDF.nextNode());
						adaptor.addChild(root_2, stream_eXPRESSION.nextTree());
						adaptor.addChild(root_2, stream_eXPRESSION.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// Grammar.g:57:129: ^( DoStat ( iNSTRUCTION )+ )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_DoStat.nextNode(), root_2);
						if ( !(stream_iNSTRUCTION.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_iNSTRUCTION.hasNext() ) {
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
					// Grammar.g:58:6: '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}'
					{
					char_literal61=(Token)match(input,46,FOLLOW_46_in_iNSTRUCTION546);  
					stream_46.add(char_literal61);

					// Grammar.g:58:10: ( vAR_DECL )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==VarStat) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// Grammar.g:58:10: vAR_DECL
							{
							pushFollow(FOLLOW_vAR_DECL_in_iNSTRUCTION548);
							vAR_DECL62=vAR_DECL();
							state._fsp--;

							stream_vAR_DECL.add(vAR_DECL62.getTree());
							}
							break;

						default :
							break loop14;
						}
					}

					// Grammar.g:58:20: ( iNSTRUCTION )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==DoStat||(LA15_0 >= ForStat && LA15_0 <= IDF)||LA15_0==IfStat||(LA15_0 >= ReadStat && LA15_0 <= ReturnStat)||LA15_0==WriteStat||LA15_0==46) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// Grammar.g:58:20: iNSTRUCTION
							{
							pushFollow(FOLLOW_iNSTRUCTION_in_iNSTRUCTION551);
							iNSTRUCTION63=iNSTRUCTION();
							state._fsp--;

							stream_iNSTRUCTION.add(iNSTRUCTION63.getTree());
							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					char_literal64=(Token)match(input,47,FOLLOW_47_in_iNSTRUCTION554);  
					stream_47.add(char_literal64);

					// AST REWRITE
					// elements: vAR_DECL, iNSTRUCTION
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 58:37: -> ^( Inner ( vAR_DECL )* ( iNSTRUCTION )* )
					{
						// Grammar.g:58:40: ^( Inner ( vAR_DECL )* ( iNSTRUCTION )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Inner, "Inner"), root_1);
						// Grammar.g:58:48: ( vAR_DECL )*
						while ( stream_vAR_DECL.hasNext() ) {
							adaptor.addChild(root_1, stream_vAR_DECL.nextTree());
						}
						stream_vAR_DECL.reset();

						// Grammar.g:58:58: ( iNSTRUCTION )*
						while ( stream_iNSTRUCTION.hasNext() ) {
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
					// Grammar.g:59:6: DoStat eXPRESSION ';'
					{
					DoStat65=(Token)match(input,DoStat,FOLLOW_DoStat_in_iNSTRUCTION573);  
					stream_DoStat.add(DoStat65);

					pushFollow(FOLLOW_eXPRESSION_in_iNSTRUCTION575);
					eXPRESSION66=eXPRESSION();
					state._fsp--;

					stream_eXPRESSION.add(eXPRESSION66.getTree());
					char_literal67=(Token)match(input,43,FOLLOW_43_in_iNSTRUCTION576);  
					stream_43.add(char_literal67);

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
					// 59:27: -> ^( DoExpr eXPRESSION )
					{
						// Grammar.g:59:30: ^( DoExpr eXPRESSION )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DoExpr, "DoExpr"), root_1);
						adaptor.addChild(root_1, stream_eXPRESSION.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// Grammar.g:60:6: pRINT
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_pRINT_in_iNSTRUCTION591);
					pRINT68=pRINT();
					state._fsp--;

					adaptor.addChild(root_0, pRINT68.getTree());

					}
					break;
				case 7 :
					// Grammar.g:61:6: rEAD
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rEAD_in_iNSTRUCTION598);
					rEAD69=rEAD();
					state._fsp--;

					adaptor.addChild(root_0, rEAD69.getTree());

					}
					break;
				case 8 :
					// Grammar.g:62:6: rETURN2
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rETURN2_in_iNSTRUCTION605);
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
		return retval;
	}
	// $ANTLR end "iNSTRUCTION"


	public static class pRINT_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "pRINT"
	// Grammar.g:81:1: pRINT : WriteStat ^ eXPRESSION ';' !;
	public final GrammarParser.pRINT_return pRINT() throws RecognitionException {
		GrammarParser.pRINT_return retval = new GrammarParser.pRINT_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token WriteStat71=null;
		Token char_literal73=null;
		ParserRuleReturnScope eXPRESSION72 =null;

		CommonTree WriteStat71_tree=null;
		CommonTree char_literal73_tree=null;

		try {
			// Grammar.g:81:9: ( WriteStat ^ eXPRESSION ';' !)
			// Grammar.g:81:11: WriteStat ^ eXPRESSION ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			WriteStat71=(Token)match(input,WriteStat,FOLLOW_WriteStat_in_pRINT721); 
			WriteStat71_tree = (CommonTree)adaptor.create(WriteStat71);
			root_0 = (CommonTree)adaptor.becomeRoot(WriteStat71_tree, root_0);

			pushFollow(FOLLOW_eXPRESSION_in_pRINT724);
			eXPRESSION72=eXPRESSION();
			state._fsp--;

			adaptor.addChild(root_0, eXPRESSION72.getTree());

			char_literal73=(Token)match(input,43,FOLLOW_43_in_pRINT726); 
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
		return retval;
	}
	// $ANTLR end "pRINT"


	public static class rEAD_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rEAD"
	// Grammar.g:86:1: rEAD : ReadStat ^ IDF ';' !;
	public final GrammarParser.rEAD_return rEAD() throws RecognitionException {
		GrammarParser.rEAD_return retval = new GrammarParser.rEAD_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ReadStat74=null;
		Token IDF75=null;
		Token char_literal76=null;

		CommonTree ReadStat74_tree=null;
		CommonTree IDF75_tree=null;
		CommonTree char_literal76_tree=null;

		try {
			// Grammar.g:86:8: ( ReadStat ^ IDF ';' !)
			// Grammar.g:86:10: ReadStat ^ IDF ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			ReadStat74=(Token)match(input,ReadStat,FOLLOW_ReadStat_in_rEAD755); 
			ReadStat74_tree = (CommonTree)adaptor.create(ReadStat74);
			root_0 = (CommonTree)adaptor.becomeRoot(ReadStat74_tree, root_0);

			IDF75=(Token)match(input,IDF,FOLLOW_IDF_in_rEAD758); 
			IDF75_tree = (CommonTree)adaptor.create(IDF75);
			adaptor.addChild(root_0, IDF75_tree);

			char_literal76=(Token)match(input,43,FOLLOW_43_in_rEAD760); 
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
		return retval;
	}
	// $ANTLR end "rEAD"


	public static class rETURN2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rETURN2"
	// Grammar.g:90:1: rETURN2 : ReturnStat ^ '(' ! eXPRESSION ')' ! ';' !;
	public final GrammarParser.rETURN2_return rETURN2() throws RecognitionException {
		GrammarParser.rETURN2_return retval = new GrammarParser.rETURN2_return();
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

		try {
			// Grammar.g:90:11: ( ReturnStat ^ '(' ! eXPRESSION ')' ! ';' !)
			// Grammar.g:90:13: ReturnStat ^ '(' ! eXPRESSION ')' ! ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			ReturnStat77=(Token)match(input,ReturnStat,FOLLOW_ReturnStat_in_rETURN2787); 
			ReturnStat77_tree = (CommonTree)adaptor.create(ReturnStat77);
			root_0 = (CommonTree)adaptor.becomeRoot(ReturnStat77_tree, root_0);

			char_literal78=(Token)match(input,32,FOLLOW_32_in_rETURN2790); 
			pushFollow(FOLLOW_eXPRESSION_in_rETURN2793);
			eXPRESSION79=eXPRESSION();
			state._fsp--;

			adaptor.addChild(root_0, eXPRESSION79.getTree());

			char_literal80=(Token)match(input,33,FOLLOW_33_in_rETURN2795); 
			char_literal81=(Token)match(input,43,FOLLOW_43_in_rETURN2798); 
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
		return retval;
	}
	// $ANTLR end "rETURN2"


	public static class aTOM_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aTOM"
	// Grammar.g:96:1: aTOM : ( INT | STRING | '(' ! eXPRESSION ')' !| eXPRESSION2 );
	public final GrammarParser.aTOM_return aTOM() throws RecognitionException {
		GrammarParser.aTOM_return retval = new GrammarParser.aTOM_return();
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

		try {
			// Grammar.g:96:9: ( INT | STRING | '(' ! eXPRESSION ')' !| eXPRESSION2 )
			int alt17=4;
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
			case 32:
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
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// Grammar.g:96:11: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT82=(Token)match(input,INT,FOLLOW_INT_in_aTOM831); 
					INT82_tree = (CommonTree)adaptor.create(INT82);
					adaptor.addChild(root_0, INT82_tree);

					}
					break;
				case 2 :
					// Grammar.g:97:6: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING83=(Token)match(input,STRING,FOLLOW_STRING_in_aTOM838); 
					STRING83_tree = (CommonTree)adaptor.create(STRING83);
					adaptor.addChild(root_0, STRING83_tree);

					}
					break;
				case 3 :
					// Grammar.g:98:6: '(' ! eXPRESSION ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal84=(Token)match(input,32,FOLLOW_32_in_aTOM845); 
					pushFollow(FOLLOW_eXPRESSION_in_aTOM848);
					eXPRESSION85=eXPRESSION();
					state._fsp--;

					adaptor.addChild(root_0, eXPRESSION85.getTree());

					char_literal86=(Token)match(input,33,FOLLOW_33_in_aTOM850); 
					}
					break;
				case 4 :
					// Grammar.g:99:5: eXPRESSION2
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_eXPRESSION2_in_aTOM857);
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
		return retval;
	}
	// $ANTLR end "aTOM"


	public static class aTOMBIS_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aTOMBIS"
	// Grammar.g:102:1: aTOMBIS : ( ThisStat | IDF | SuperStat | NewStat ^ IDFMAJ );
	public final GrammarParser.aTOMBIS_return aTOMBIS() throws RecognitionException {
		GrammarParser.aTOMBIS_return retval = new GrammarParser.aTOMBIS_return();
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

		try {
			// Grammar.g:102:11: ( ThisStat | IDF | SuperStat | NewStat ^ IDFMAJ )
			int alt18=4;
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
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// Grammar.g:102:13: ThisStat
					{
					root_0 = (CommonTree)adaptor.nil();


					ThisStat88=(Token)match(input,ThisStat,FOLLOW_ThisStat_in_aTOMBIS874); 
					ThisStat88_tree = (CommonTree)adaptor.create(ThisStat88);
					adaptor.addChild(root_0, ThisStat88_tree);

					}
					break;
				case 2 :
					// Grammar.g:103:5: IDF
					{
					root_0 = (CommonTree)adaptor.nil();


					IDF89=(Token)match(input,IDF,FOLLOW_IDF_in_aTOMBIS880); 
					IDF89_tree = (CommonTree)adaptor.create(IDF89);
					adaptor.addChild(root_0, IDF89_tree);

					}
					break;
				case 3 :
					// Grammar.g:104:5: SuperStat
					{
					root_0 = (CommonTree)adaptor.nil();


					SuperStat90=(Token)match(input,SuperStat,FOLLOW_SuperStat_in_aTOMBIS886); 
					SuperStat90_tree = (CommonTree)adaptor.create(SuperStat90);
					adaptor.addChild(root_0, SuperStat90_tree);

					}
					break;
				case 4 :
					// Grammar.g:105:5: NewStat ^ IDFMAJ
					{
					root_0 = (CommonTree)adaptor.nil();


					NewStat91=(Token)match(input,NewStat,FOLLOW_NewStat_in_aTOMBIS892); 
					NewStat91_tree = (CommonTree)adaptor.create(NewStat91);
					root_0 = (CommonTree)adaptor.becomeRoot(NewStat91_tree, root_0);

					IDFMAJ92=(Token)match(input,IDFMAJ,FOLLOW_IDFMAJ_in_aTOMBIS895); 
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
		return retval;
	}
	// $ANTLR end "aTOMBIS"


	public static class bOOLEXPR_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bOOLEXPR"
	// Grammar.g:109:1: bOOLEXPR : ( mOINEXPR | nOTMOINSEXPR ) ( BOOLOPER ^ ( mOINEXPR | nOTMOINSEXPR ) )* ;
	public final GrammarParser.bOOLEXPR_return bOOLEXPR() throws RecognitionException {
		GrammarParser.bOOLEXPR_return retval = new GrammarParser.bOOLEXPR_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BOOLOPER95=null;
		ParserRuleReturnScope mOINEXPR93 =null;
		ParserRuleReturnScope nOTMOINSEXPR94 =null;
		ParserRuleReturnScope mOINEXPR96 =null;
		ParserRuleReturnScope nOTMOINSEXPR97 =null;

		CommonTree BOOLOPER95_tree=null;

		try {
			// Grammar.g:109:12: ( ( mOINEXPR | nOTMOINSEXPR ) ( BOOLOPER ^ ( mOINEXPR | nOTMOINSEXPR ) )* )
			// Grammar.g:109:14: ( mOINEXPR | nOTMOINSEXPR ) ( BOOLOPER ^ ( mOINEXPR | nOTMOINSEXPR ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:109:14: ( mOINEXPR | nOTMOINSEXPR )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==37) ) {
				alt19=1;
			}
			else if ( (LA19_0==IDF||LA19_0==INT||LA19_0==NewStat||LA19_0==STRING||LA19_0==SuperStat||LA19_0==ThisStat||LA19_0==32) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// Grammar.g:109:15: mOINEXPR
					{
					pushFollow(FOLLOW_mOINEXPR_in_bOOLEXPR914);
					mOINEXPR93=mOINEXPR();
					state._fsp--;

					adaptor.addChild(root_0, mOINEXPR93.getTree());

					}
					break;
				case 2 :
					// Grammar.g:109:24: nOTMOINSEXPR
					{
					pushFollow(FOLLOW_nOTMOINSEXPR_in_bOOLEXPR916);
					nOTMOINSEXPR94=nOTMOINSEXPR();
					state._fsp--;

					adaptor.addChild(root_0, nOTMOINSEXPR94.getTree());

					}
					break;

			}

			// Grammar.g:109:38: ( BOOLOPER ^ ( mOINEXPR | nOTMOINSEXPR ) )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==BOOLOPER) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// Grammar.g:109:39: BOOLOPER ^ ( mOINEXPR | nOTMOINSEXPR )
					{
					BOOLOPER95=(Token)match(input,BOOLOPER,FOLLOW_BOOLOPER_in_bOOLEXPR920); 
					BOOLOPER95_tree = (CommonTree)adaptor.create(BOOLOPER95);
					root_0 = (CommonTree)adaptor.becomeRoot(BOOLOPER95_tree, root_0);

					// Grammar.g:109:49: ( mOINEXPR | nOTMOINSEXPR )
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==37) ) {
						alt20=1;
					}
					else if ( (LA20_0==IDF||LA20_0==INT||LA20_0==NewStat||LA20_0==STRING||LA20_0==SuperStat||LA20_0==ThisStat||LA20_0==32) ) {
						alt20=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}

					switch (alt20) {
						case 1 :
							// Grammar.g:109:50: mOINEXPR
							{
							pushFollow(FOLLOW_mOINEXPR_in_bOOLEXPR924);
							mOINEXPR96=mOINEXPR();
							state._fsp--;

							adaptor.addChild(root_0, mOINEXPR96.getTree());

							}
							break;
						case 2 :
							// Grammar.g:109:59: nOTMOINSEXPR
							{
							pushFollow(FOLLOW_nOTMOINSEXPR_in_bOOLEXPR926);
							nOTMOINSEXPR97=nOTMOINSEXPR();
							state._fsp--;

							adaptor.addChild(root_0, nOTMOINSEXPR97.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop21;
				}
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
		return retval;
	}
	// $ANTLR end "bOOLEXPR"


	public static class mULTEXPR_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mULTEXPR"
	// Grammar.g:112:1: mULTEXPR : bOOLEXPR ( ( '*' | '/' ) ^ bOOLEXPR )* ;
	public final GrammarParser.mULTEXPR_return mULTEXPR() throws RecognitionException {
		GrammarParser.mULTEXPR_return retval = new GrammarParser.mULTEXPR_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set99=null;
		ParserRuleReturnScope bOOLEXPR98 =null;
		ParserRuleReturnScope bOOLEXPR100 =null;

		CommonTree set99_tree=null;

		try {
			// Grammar.g:112:12: ( bOOLEXPR ( ( '*' | '/' ) ^ bOOLEXPR )* )
			// Grammar.g:112:14: bOOLEXPR ( ( '*' | '/' ) ^ bOOLEXPR )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bOOLEXPR_in_mULTEXPR943);
			bOOLEXPR98=bOOLEXPR();
			state._fsp--;

			adaptor.addChild(root_0, bOOLEXPR98.getTree());

			// Grammar.g:112:23: ( ( '*' | '/' ) ^ bOOLEXPR )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==34||LA22_0==40) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// Grammar.g:112:24: ( '*' | '/' ) ^ bOOLEXPR
					{
					set99=input.LT(1);
					set99=input.LT(1);
					if ( input.LA(1)==34||input.LA(1)==40 ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set99), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_bOOLEXPR_in_mULTEXPR953);
					bOOLEXPR100=bOOLEXPR();
					state._fsp--;

					adaptor.addChild(root_0, bOOLEXPR100.getTree());

					}
					break;

				default :
					break loop22;
				}
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
		return retval;
	}
	// $ANTLR end "mULTEXPR"


	public static class aDDEXPR_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aDDEXPR"
	// Grammar.g:115:1: aDDEXPR : mULTEXPR ( ( '+' | '-' ) ^ mULTEXPR )* ;
	public final GrammarParser.aDDEXPR_return aDDEXPR() throws RecognitionException {
		GrammarParser.aDDEXPR_return retval = new GrammarParser.aDDEXPR_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set102=null;
		ParserRuleReturnScope mULTEXPR101 =null;
		ParserRuleReturnScope mULTEXPR103 =null;

		CommonTree set102_tree=null;

		try {
			// Grammar.g:115:11: ( mULTEXPR ( ( '+' | '-' ) ^ mULTEXPR )* )
			// Grammar.g:115:13: mULTEXPR ( ( '+' | '-' ) ^ mULTEXPR )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_mULTEXPR_in_aDDEXPR969);
			mULTEXPR101=mULTEXPR();
			state._fsp--;

			adaptor.addChild(root_0, mULTEXPR101.getTree());

			// Grammar.g:115:22: ( ( '+' | '-' ) ^ mULTEXPR )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==35||LA23_0==37) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// Grammar.g:115:23: ( '+' | '-' ) ^ mULTEXPR
					{
					set102=input.LT(1);
					set102=input.LT(1);
					if ( input.LA(1)==35||input.LA(1)==37 ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set102), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mULTEXPR_in_aDDEXPR979);
					mULTEXPR103=mULTEXPR();
					state._fsp--;

					adaptor.addChild(root_0, mULTEXPR103.getTree());

					}
					break;

				default :
					break loop23;
				}
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
		return retval;
	}
	// $ANTLR end "aDDEXPR"


	public static class mOINEXPR_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mOINEXPR"
	// Grammar.g:118:1: mOINEXPR : '-' aTOM -> ^( '-' aTOM ) ;
	public final GrammarParser.mOINEXPR_return mOINEXPR() throws RecognitionException {
		GrammarParser.mOINEXPR_return retval = new GrammarParser.mOINEXPR_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal104=null;
		ParserRuleReturnScope aTOM105 =null;

		CommonTree char_literal104_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_aTOM=new RewriteRuleSubtreeStream(adaptor,"rule aTOM");

		try {
			// Grammar.g:118:11: ( '-' aTOM -> ^( '-' aTOM ) )
			// Grammar.g:118:13: '-' aTOM
			{
			char_literal104=(Token)match(input,37,FOLLOW_37_in_mOINEXPR994);  
			stream_37.add(char_literal104);

			pushFollow(FOLLOW_aTOM_in_mOINEXPR996);
			aTOM105=aTOM();
			state._fsp--;

			stream_aTOM.add(aTOM105.getTree());
			// AST REWRITE
			// elements: aTOM, 37
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 118:21: -> ^( '-' aTOM )
			{
				// Grammar.g:118:24: ^( '-' aTOM )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_37.nextNode(), root_1);
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
		return retval;
	}
	// $ANTLR end "mOINEXPR"


	public static class nOTMOINSEXPR_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nOTMOINSEXPR"
	// Grammar.g:120:1: nOTMOINSEXPR : aTOM ;
	public final GrammarParser.nOTMOINSEXPR_return nOTMOINSEXPR() throws RecognitionException {
		GrammarParser.nOTMOINSEXPR_return retval = new GrammarParser.nOTMOINSEXPR_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope aTOM106 =null;


		try {
			// Grammar.g:120:16: ( aTOM )
			// Grammar.g:120:18: aTOM
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_aTOM_in_nOTMOINSEXPR1013);
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
		return retval;
	}
	// $ANTLR end "nOTMOINSEXPR"


	public static class eXPRESSION_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "eXPRESSION"
	// Grammar.g:122:1: eXPRESSION : aDDEXPR ;
	public final GrammarParser.eXPRESSION_return eXPRESSION() throws RecognitionException {
		GrammarParser.eXPRESSION_return retval = new GrammarParser.eXPRESSION_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope aDDEXPR107 =null;


		try {
			// Grammar.g:122:15: ( aDDEXPR )
			// Grammar.g:122:17: aDDEXPR
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_aDDEXPR_in_eXPRESSION1024);
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
		return retval;
	}
	// $ANTLR end "eXPRESSION"


	public static class eXPRESSION2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "eXPRESSION2"
	// Grammar.g:125:1: eXPRESSION2 : aTOMBIS ^ ( sUITE )* ;
	public final GrammarParser.eXPRESSION2_return eXPRESSION2() throws RecognitionException {
		GrammarParser.eXPRESSION2_return retval = new GrammarParser.eXPRESSION2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope aTOMBIS108 =null;
		ParserRuleReturnScope sUITE109 =null;


		try {
			// Grammar.g:125:15: ( aTOMBIS ^ ( sUITE )* )
			// Grammar.g:125:17: aTOMBIS ^ ( sUITE )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_aTOMBIS_in_eXPRESSION21038);
			aTOMBIS108=aTOMBIS();
			state._fsp--;

			root_0 = (CommonTree)adaptor.becomeRoot(aTOMBIS108.getTree(), root_0);
			// Grammar.g:125:26: ( sUITE )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==38) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// Grammar.g:125:26: sUITE
					{
					pushFollow(FOLLOW_sUITE_in_eXPRESSION21041);
					sUITE109=sUITE();
					state._fsp--;

					adaptor.addChild(root_0, sUITE109.getTree());

					}
					break;

				default :
					break loop24;
				}
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
		return retval;
	}
	// $ANTLR end "eXPRESSION2"


	public static class sUITE_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sUITE"
	// Grammar.g:127:1: sUITE : ( '.' ! IDF ^ '(' ! ( eXPRESSION ( ',' ! eXPRESSION )* )? ')' !) ;
	public final GrammarParser.sUITE_return sUITE() throws RecognitionException {
		GrammarParser.sUITE_return retval = new GrammarParser.sUITE_return();
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

		try {
			// Grammar.g:127:10: ( ( '.' ! IDF ^ '(' ! ( eXPRESSION ( ',' ! eXPRESSION )* )? ')' !) )
			// Grammar.g:127:12: ( '.' ! IDF ^ '(' ! ( eXPRESSION ( ',' ! eXPRESSION )* )? ')' !)
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:127:12: ( '.' ! IDF ^ '(' ! ( eXPRESSION ( ',' ! eXPRESSION )* )? ')' !)
			// Grammar.g:127:13: '.' ! IDF ^ '(' ! ( eXPRESSION ( ',' ! eXPRESSION )* )? ')' !
			{
			char_literal110=(Token)match(input,38,FOLLOW_38_in_sUITE1054); 
			IDF111=(Token)match(input,IDF,FOLLOW_IDF_in_sUITE1057); 
			IDF111_tree = (CommonTree)adaptor.create(IDF111);
			root_0 = (CommonTree)adaptor.becomeRoot(IDF111_tree, root_0);

			char_literal112=(Token)match(input,32,FOLLOW_32_in_sUITE1060); 
			// Grammar.g:127:28: ( eXPRESSION ( ',' ! eXPRESSION )* )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==IDF||LA26_0==INT||LA26_0==NewStat||LA26_0==STRING||LA26_0==SuperStat||LA26_0==ThisStat||LA26_0==32||LA26_0==37) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// Grammar.g:127:29: eXPRESSION ( ',' ! eXPRESSION )*
					{
					pushFollow(FOLLOW_eXPRESSION_in_sUITE1064);
					eXPRESSION113=eXPRESSION();
					state._fsp--;

					adaptor.addChild(root_0, eXPRESSION113.getTree());

					// Grammar.g:127:40: ( ',' ! eXPRESSION )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==36) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// Grammar.g:127:41: ',' ! eXPRESSION
							{
							char_literal114=(Token)match(input,36,FOLLOW_36_in_sUITE1067); 
							pushFollow(FOLLOW_eXPRESSION_in_sUITE1070);
							eXPRESSION115=eXPRESSION();
							state._fsp--;

							adaptor.addChild(root_0, eXPRESSION115.getTree());

							}
							break;

						default :
							break loop25;
						}
					}

					}
					break;

			}

			char_literal116=(Token)match(input,33,FOLLOW_33_in_sUITE1076); 
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
		return retval;
	}
	// $ANTLR end "sUITE"

	// Delegated rules



	public static final BitSet FOLLOW_pROGRAM_in_p76 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_p78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cLASS_DECL_in_pROGRAM96 = new BitSet(new long[]{0x00004000A0C11940L});
	public static final BitSet FOLLOW_vAR_DECL_in_pROGRAM99 = new BitSet(new long[]{0x00004000A0C11900L});
	public static final BitSet FOLLOW_iNSTRUCTION_in_pROGRAM102 = new BitSet(new long[]{0x0000400080C11902L});
	public static final BitSet FOLLOW_ClassStat_in_cLASS_DECL118 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_IDFMAJ_in_cLASS_DECL120 = new BitSet(new long[]{0x0000100000040000L});
	public static final BitSet FOLLOW_InheritStat_in_cLASS_DECL123 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_IDFMAJ_in_cLASS_DECL125 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_cLASS_DECL129 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_cLASS_DECL132 = new BitSet(new long[]{0x0000000220100000L});
	public static final BitSet FOLLOW_cLASS_ITEM_DECL_in_cLASS_DECL134 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_cLASS_DECL136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vAR_DECL_in_cLASS_ITEM_DECL200 = new BitSet(new long[]{0x0000000020100002L});
	public static final BitSet FOLLOW_mETHOD_DECL_in_cLASS_ITEM_DECL203 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_VarStat_in_vAR_DECL219 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDF_in_vAR_DECL221 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_vAR_DECL223 = new BitSet(new long[]{0x000000000200A000L});
	public static final BitSet FOLLOW_tYPE_in_vAR_DECL225 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_vAR_DECL227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MethodStat_in_mETHOD_DECL306 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDF_in_mETHOD_DECL308 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_mETHOD_DECL310 = new BitSet(new long[]{0x0000000200001000L});
	public static final BitSet FOLLOW_mETHOD_ARGS_in_mETHOD_DECL312 = new BitSet(new long[]{0x0000000200001000L});
	public static final BitSet FOLLOW_33_in_mETHOD_DECL315 = new BitSet(new long[]{0x0000420000000000L});
	public static final BitSet FOLLOW_41_in_mETHOD_DECL318 = new BitSet(new long[]{0x000000000200A000L});
	public static final BitSet FOLLOW_tYPE_in_mETHOD_DECL320 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_mETHOD_DECL324 = new BitSet(new long[]{0x00004000A0C11900L});
	public static final BitSet FOLLOW_vAR_DECL_in_mETHOD_DECL326 = new BitSet(new long[]{0x00004000A0C11900L});
	public static final BitSet FOLLOW_iNSTRUCTION_in_mETHOD_DECL329 = new BitSet(new long[]{0x0000C00080C11900L});
	public static final BitSet FOLLOW_47_in_mETHOD_DECL332 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_mETHOD_DECL334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_mETHOD_ARGS390 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_mETHOD_ARGS392 = new BitSet(new long[]{0x000000000200A000L});
	public static final BitSet FOLLOW_tYPE_in_mETHOD_ARGS394 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_mETHOD_ARGS397 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDF_in_mETHOD_ARGS399 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_mETHOD_ARGS401 = new BitSet(new long[]{0x000000000200A000L});
	public static final BitSet FOLLOW_tYPE_in_mETHOD_ARGS403 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_IDF_in_iNSTRUCTION431 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_iNSTRUCTION433 = new BitSet(new long[]{0x0000002115205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_iNSTRUCTION436 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_iNSTRUCTION439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IfStat_in_iNSTRUCTION456 = new BitSet(new long[]{0x0000002115205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_iNSTRUCTION458 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_ThenStat_in_iNSTRUCTION460 = new BitSet(new long[]{0x0000400080C11900L});
	public static final BitSet FOLLOW_iNSTRUCTION_in_iNSTRUCTION462 = new BitSet(new long[]{0x0000200000000400L});
	public static final BitSet FOLLOW_45_in_iNSTRUCTION465 = new BitSet(new long[]{0x0000400080C11900L});
	public static final BitSet FOLLOW_iNSTRUCTION_in_iNSTRUCTION467 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_FiStat_in_iNSTRUCTION471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ForStat_in_iNSTRUCTION499 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDF_in_iNSTRUCTION501 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_InStat_in_iNSTRUCTION503 = new BitSet(new long[]{0x0000002115205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_iNSTRUCTION505 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_iNSTRUCTION507 = new BitSet(new long[]{0x0000002115205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_iNSTRUCTION509 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DoStat_in_iNSTRUCTION511 = new BitSet(new long[]{0x0000400080C11900L});
	public static final BitSet FOLLOW_iNSTRUCTION_in_iNSTRUCTION513 = new BitSet(new long[]{0x0000400080C11B00L});
	public static final BitSet FOLLOW_EndStat_in_iNSTRUCTION516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_iNSTRUCTION546 = new BitSet(new long[]{0x00004000A0C11900L});
	public static final BitSet FOLLOW_vAR_DECL_in_iNSTRUCTION548 = new BitSet(new long[]{0x00004000A0C11900L});
	public static final BitSet FOLLOW_iNSTRUCTION_in_iNSTRUCTION551 = new BitSet(new long[]{0x0000C00080C11900L});
	public static final BitSet FOLLOW_47_in_iNSTRUCTION554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DoStat_in_iNSTRUCTION573 = new BitSet(new long[]{0x0000002115205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_iNSTRUCTION575 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_iNSTRUCTION576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pRINT_in_iNSTRUCTION591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rEAD_in_iNSTRUCTION598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rETURN2_in_iNSTRUCTION605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WriteStat_in_pRINT721 = new BitSet(new long[]{0x0000002115205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_pRINT724 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_pRINT726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ReadStat_in_rEAD755 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDF_in_rEAD758 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_rEAD760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ReturnStat_in_rETURN2787 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_rETURN2790 = new BitSet(new long[]{0x0000002115205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_rETURN2793 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_rETURN2795 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_rETURN2798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_aTOM831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_aTOM838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_aTOM845 = new BitSet(new long[]{0x0000002115205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_aTOM848 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_aTOM850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_eXPRESSION2_in_aTOM857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ThisStat_in_aTOMBIS874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_aTOMBIS880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SuperStat_in_aTOMBIS886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NewStat_in_aTOMBIS892 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_IDFMAJ_in_aTOMBIS895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mOINEXPR_in_bOOLEXPR914 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_nOTMOINSEXPR_in_bOOLEXPR916 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_BOOLOPER_in_bOOLEXPR920 = new BitSet(new long[]{0x0000002115205000L});
	public static final BitSet FOLLOW_mOINEXPR_in_bOOLEXPR924 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_nOTMOINSEXPR_in_bOOLEXPR926 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_bOOLEXPR_in_mULTEXPR943 = new BitSet(new long[]{0x0000010400000002L});
	public static final BitSet FOLLOW_set_in_mULTEXPR946 = new BitSet(new long[]{0x0000002115205000L});
	public static final BitSet FOLLOW_bOOLEXPR_in_mULTEXPR953 = new BitSet(new long[]{0x0000010400000002L});
	public static final BitSet FOLLOW_mULTEXPR_in_aDDEXPR969 = new BitSet(new long[]{0x0000002800000002L});
	public static final BitSet FOLLOW_set_in_aDDEXPR972 = new BitSet(new long[]{0x0000002115205000L});
	public static final BitSet FOLLOW_mULTEXPR_in_aDDEXPR979 = new BitSet(new long[]{0x0000002800000002L});
	public static final BitSet FOLLOW_37_in_mOINEXPR994 = new BitSet(new long[]{0x0000000115205000L});
	public static final BitSet FOLLOW_aTOM_in_mOINEXPR996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aTOM_in_nOTMOINSEXPR1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aDDEXPR_in_eXPRESSION1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aTOMBIS_in_eXPRESSION21038 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_sUITE_in_eXPRESSION21041 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_sUITE1054 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDF_in_sUITE1057 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_sUITE1060 = new BitSet(new long[]{0x0000002315205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_sUITE1064 = new BitSet(new long[]{0x0000001200000000L});
	public static final BitSet FOLLOW_36_in_sUITE1067 = new BitSet(new long[]{0x0000002115205000L});
	public static final BitSet FOLLOW_eXPRESSION_in_sUITE1070 = new BitSet(new long[]{0x0000001200000000L});
	public static final BitSet FOLLOW_33_in_sUITE1076 = new BitSet(new long[]{0x0000000000000002L});
}
