// $ANTLR null /home/etudiants/raimondi3u/CompilTest/newGrammar.g 2018-01-26 17:37:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class newGrammarParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATTRIBUTE", "BINAIRE", "BLOCK", 
		"BOOL", "COMMENT", "IDF", "IF", "INT", "MAIN", "NEW", "STRING", "UNAIRE", 
		"VEC", "WS", "'&'", "'('", "')'", "','", "'->'", "'.'", "':'", "';'", 
		"'<'", "'='", "'>'", "'['", "']'", "'break'", "'else'", "'fn'", "'len'", 
		"'let'", "'loop'", "'mut'", "'print'", "'return'", "'struct'", "'vec'", 
		"'while'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "vectExpr", "type", "atom", "fichier", "bigdotExpr", "expr", 
		"declFun", "block", "args", "instruct", "decl", "declStruct", "newStruc", 
		"bigExpr", "bigvectExpr", "unExpr", "bigunExpr", "axiom", "dotIDF", "ifExpr", 
		"binExpr", "bigbinExpr", "callFun", "dotExpr", "bigatom"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public newGrammarParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public newGrammarParser(TokenStream input, int port, RecognizerSharedState state) {
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

	public newGrammarParser(TokenStream input, DebugEventListener dbg) {
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
	@Override public String[] getTokenNames() { return newGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/etudiants/raimondi3u/CompilTest/newGrammar.g"; }


	boolean mainFound = false;


	public static class axiom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "axiom"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:19:1: axiom : fichier EOF -> fichier ;
	public final newGrammarParser.axiom_return axiom() throws RecognitionException {
		newGrammarParser.axiom_return retval = new newGrammarParser.axiom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope fichier1 =null;

		CommonTree EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_fichier=new RewriteRuleSubtreeStream(adaptor,"rule fichier");

		try { dbg.enterRule(getGrammarFileName(), "axiom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:19:7: ( fichier EOF -> fichier )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:19:9: fichier EOF
			{
			dbg.location(19,9);
			pushFollow(FOLLOW_fichier_in_axiom74);
			fichier1=fichier();
			state._fsp--;

			stream_fichier.add(fichier1.getTree());dbg.location(19,17);
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_axiom76);  
			stream_EOF.add(EOF2);
			dbg.location(19,21);
			if (!mainFound){System.err.println("main not found");System.exit(1);}
			// AST REWRITE
			// elements: fichier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 19:93: -> fichier
			{
				dbg.location(19,96);
				adaptor.addChild(root_0, stream_fichier.nextTree());
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
		dbg.location(20, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "axiom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "axiom"


	public static class fichier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fichier"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:22:1: fichier : ( decl )* ;
	public final newGrammarParser.fichier_return fichier() throws RecognitionException {
		newGrammarParser.fichier_return retval = new newGrammarParser.fichier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope decl3 =null;


		try { dbg.enterRule(getGrammarFileName(), "fichier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(22, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:22:9: ( ( decl )* )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:22:11: ( decl )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(22,11);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:22:11: ( decl )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==33||LA1_0==40) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:22:11: decl
					{
					dbg.location(22,11);
					pushFollow(FOLLOW_decl_in_fichier92);
					decl3=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}

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
			dbg.exitRule(getGrammarFileName(), "fichier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "fichier"


	public static class decl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:25:1: decl : ( declFun | declStruct );
	public final newGrammarParser.decl_return decl() throws RecognitionException {
		newGrammarParser.decl_return retval = new newGrammarParser.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope declFun4 =null;
		ParserRuleReturnScope declStruct5 =null;


		try { dbg.enterRule(getGrammarFileName(), "decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(25, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:25:6: ( declFun | declStruct )
			int alt2=2;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==33) ) {
				alt2=1;
			}
			else if ( (LA2_0==40) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:25:8: declFun
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(25,8);
					pushFollow(FOLLOW_declFun_in_decl103);
					declFun4=declFun();
					state._fsp--;

					adaptor.addChild(root_0, declFun4.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:26:3: declStruct
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(26,3);
					pushFollow(FOLLOW_declStruct_in_decl107);
					declStruct5=declStruct();
					state._fsp--;

					adaptor.addChild(root_0, declStruct5.getTree());

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
		dbg.location(27, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "decl"


	public static class declStruct_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declStruct"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:29:1: declStruct : 'struct' IDF '{' ( args )? '}' -> ^( 'struct' IDF ( args )? ) ;
	public final newGrammarParser.declStruct_return declStruct() throws RecognitionException {
		newGrammarParser.declStruct_return retval = new newGrammarParser.declStruct_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal6=null;
		Token IDF7=null;
		Token char_literal8=null;
		Token char_literal10=null;
		ParserRuleReturnScope args9 =null;

		CommonTree string_literal6_tree=null;
		CommonTree IDF7_tree=null;
		CommonTree char_literal8_tree=null;
		CommonTree char_literal10_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");

		try { dbg.enterRule(getGrammarFileName(), "declStruct");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:29:12: ( 'struct' IDF '{' ( args )? '}' -> ^( 'struct' IDF ( args )? ) )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:29:14: 'struct' IDF '{' ( args )? '}'
			{
			dbg.location(29,14);
			string_literal6=(Token)match(input,40,FOLLOW_40_in_declStruct116);  
			stream_40.add(string_literal6);
			dbg.location(29,23);
			IDF7=(Token)match(input,IDF,FOLLOW_IDF_in_declStruct118);  
			stream_IDF.add(IDF7);
			dbg.location(29,27);
			char_literal8=(Token)match(input,43,FOLLOW_43_in_declStruct120);  
			stream_43.add(char_literal8);
			dbg.location(29,31);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:29:31: ( args )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==IDF) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:29:31: args
					{
					dbg.location(29,31);
					pushFollow(FOLLOW_args_in_declStruct122);
					args9=args();
					state._fsp--;

					stream_args.add(args9.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(29,37);
			char_literal10=(Token)match(input,44,FOLLOW_44_in_declStruct125);  
			stream_44.add(char_literal10);

			// AST REWRITE
			// elements: IDF, args, 40
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 29:41: -> ^( 'struct' IDF ( args )? )
			{
				dbg.location(29,44);
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:29:44: ^( 'struct' IDF ( args )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(29,46);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_40.nextNode(), root_1);
				dbg.location(29,55);
				adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(29,59);
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:29:59: ( args )?
				if ( stream_args.hasNext() ) {
					dbg.location(29,59);
					adaptor.addChild(root_1, stream_args.nextTree());
				}
				stream_args.reset();

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
		dbg.location(30, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declStruct");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "declStruct"


	public static class args_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "args"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:32:1: args : IDF ':' type ( ',' IDF ':' type )* -> ( ^( IDF type ) )* ;
	public final newGrammarParser.args_return args() throws RecognitionException {
		newGrammarParser.args_return retval = new newGrammarParser.args_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDF11=null;
		Token char_literal12=null;
		Token char_literal14=null;
		Token IDF15=null;
		Token char_literal16=null;
		ParserRuleReturnScope type13 =null;
		ParserRuleReturnScope type17 =null;

		CommonTree IDF11_tree=null;
		CommonTree char_literal12_tree=null;
		CommonTree char_literal14_tree=null;
		CommonTree IDF15_tree=null;
		CommonTree char_literal16_tree=null;
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "args");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(32, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:32:6: ( IDF ':' type ( ',' IDF ':' type )* -> ( ^( IDF type ) )* )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:32:8: IDF ':' type ( ',' IDF ':' type )*
			{
			dbg.location(32,8);
			IDF11=(Token)match(input,IDF,FOLLOW_IDF_in_args146);  
			stream_IDF.add(IDF11);
			dbg.location(32,12);
			char_literal12=(Token)match(input,24,FOLLOW_24_in_args148);  
			stream_24.add(char_literal12);
			dbg.location(32,16);
			pushFollow(FOLLOW_type_in_args150);
			type13=type();
			state._fsp--;

			stream_type.add(type13.getTree());dbg.location(32,21);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:32:21: ( ',' IDF ':' type )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==21) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:32:22: ',' IDF ':' type
					{
					dbg.location(32,22);
					char_literal14=(Token)match(input,21,FOLLOW_21_in_args153);  
					stream_21.add(char_literal14);
					dbg.location(32,26);
					IDF15=(Token)match(input,IDF,FOLLOW_IDF_in_args155);  
					stream_IDF.add(IDF15);
					dbg.location(32,30);
					char_literal16=(Token)match(input,24,FOLLOW_24_in_args157);  
					stream_24.add(char_literal16);
					dbg.location(32,34);
					pushFollow(FOLLOW_type_in_args159);
					type17=type();
					state._fsp--;

					stream_type.add(type17.getTree());
					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}

			// AST REWRITE
			// elements: IDF, type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 32:41: -> ( ^( IDF type ) )*
			{
				dbg.location(32,44);
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:32:44: ( ^( IDF type ) )*
				while ( stream_IDF.hasNext()||stream_type.hasNext() ) {
					dbg.location(32,45);
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:32:45: ^( IDF type )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					dbg.location(32,47);
					root_1 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_1);
					dbg.location(32,51);
					adaptor.addChild(root_1, stream_type.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_IDF.reset();
				stream_type.reset();

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
		dbg.location(33, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "args");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "args"


	public static class declFun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declFun"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:35:1: declFun : 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF args ^( '->' type ) block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) ) ;
	public final newGrammarParser.declFun_return declFun() throws RecognitionException {
		newGrammarParser.declFun_return retval = new newGrammarParser.declFun_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal18=null;
		Token IDF19=null;
		Token char_literal20=null;
		Token char_literal22=null;
		Token string_literal23=null;
		Token MAIN26=null;
		Token char_literal27=null;
		Token char_literal28=null;
		ParserRuleReturnScope args21 =null;
		ParserRuleReturnScope type24 =null;
		ParserRuleReturnScope block25 =null;
		ParserRuleReturnScope block29 =null;

		CommonTree string_literal18_tree=null;
		CommonTree IDF19_tree=null;
		CommonTree char_literal20_tree=null;
		CommonTree char_literal22_tree=null;
		CommonTree string_literal23_tree=null;
		CommonTree MAIN26_tree=null;
		CommonTree char_literal27_tree=null;
		CommonTree char_literal28_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_MAIN=new RewriteRuleTokenStream(adaptor,"token MAIN");
		RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
		RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "declFun");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(35, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:35:9: ( 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF args ^( '->' type ) block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) ) )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:35:11: 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF args ^( '->' type ) block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) )
			{
			dbg.location(35,11);
			string_literal18=(Token)match(input,33,FOLLOW_33_in_declFun181);  
			stream_33.add(string_literal18);
			dbg.location(35,16);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:35:16: ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF args ^( '->' type ) block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) )
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==IDF) ) {
				alt7=1;
			}
			else if ( (LA7_0==MAIN) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:35:17: IDF '(' ( args )? ')' ( '->' type )? block
					{
					dbg.location(35,17);
					IDF19=(Token)match(input,IDF,FOLLOW_IDF_in_declFun184);  
					stream_IDF.add(IDF19);
					dbg.location(35,21);
					char_literal20=(Token)match(input,19,FOLLOW_19_in_declFun186);  
					stream_19.add(char_literal20);
					dbg.location(35,25);
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:35:25: ( args )?
					int alt5=2;
					try { dbg.enterSubRule(5);
					try { dbg.enterDecision(5, decisionCanBacktrack[5]);

					int LA5_0 = input.LA(1);
					if ( (LA5_0==IDF) ) {
						alt5=1;
					}
					} finally {dbg.exitDecision(5);}

					switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:35:25: args
							{
							dbg.location(35,25);
							pushFollow(FOLLOW_args_in_declFun188);
							args21=args();
							state._fsp--;

							stream_args.add(args21.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(5);}
					dbg.location(35,31);
					char_literal22=(Token)match(input,20,FOLLOW_20_in_declFun191);  
					stream_20.add(char_literal22);
					dbg.location(35,35);
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:35:35: ( '->' type )?
					int alt6=2;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					int LA6_0 = input.LA(1);
					if ( (LA6_0==22) ) {
						alt6=1;
					}
					} finally {dbg.exitDecision(6);}

					switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:35:36: '->' type
							{
							dbg.location(35,36);
							string_literal23=(Token)match(input,22,FOLLOW_22_in_declFun194);  
							stream_22.add(string_literal23);
							dbg.location(35,41);
							pushFollow(FOLLOW_type_in_declFun196);
							type24=type();
							state._fsp--;

							stream_type.add(type24.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(6);}
					dbg.location(35,48);
					pushFollow(FOLLOW_block_in_declFun200);
					block25=block();
					state._fsp--;

					stream_block.add(block25.getTree());
					// AST REWRITE
					// elements: type, block, 33, 22, IDF, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 35:54: -> ^( 'fn' IDF args ^( '->' type ) block )
					{
						dbg.location(35,57);
						// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:35:57: ^( 'fn' IDF args ^( '->' type ) block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(35,59);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_33.nextNode(), root_1);
						dbg.location(35,64);
						adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(35,68);
						adaptor.addChild(root_1, stream_args.nextTree());dbg.location(35,73);
						// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:35:73: ^( '->' type )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(35,75);
						root_2 = (CommonTree)adaptor.becomeRoot(stream_22.nextNode(), root_2);
						dbg.location(35,80);
						adaptor.addChild(root_2, stream_type.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(35,86);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:36:4: MAIN '(' ')' block
					{
					dbg.location(36,4);
					mainFound = true;dbg.location(36,23);
					MAIN26=(Token)match(input,MAIN,FOLLOW_MAIN_in_declFun224);  
					stream_MAIN.add(MAIN26);
					dbg.location(36,28);
					char_literal27=(Token)match(input,19,FOLLOW_19_in_declFun226);  
					stream_19.add(char_literal27);
					dbg.location(36,32);
					char_literal28=(Token)match(input,20,FOLLOW_20_in_declFun228);  
					stream_20.add(char_literal28);
					dbg.location(36,36);
					pushFollow(FOLLOW_block_in_declFun230);
					block29=block();
					state._fsp--;

					stream_block.add(block29.getTree());
					// AST REWRITE
					// elements: 33, block, MAIN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 36:42: -> ^( 'fn' MAIN block )
					{
						dbg.location(36,45);
						// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:36:45: ^( 'fn' MAIN block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(36,47);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_33.nextNode(), root_1);
						dbg.location(36,52);
						adaptor.addChild(root_1, stream_MAIN.nextNode());dbg.location(36,57);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(7);}

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
		dbg.location(37, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declFun");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "declFun"


	public static class type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:39:1: type : ( IDF | 'vec' ( '<' type '>' ) -> ^( 'vec' type ) | '&' type -> ^( '&' type ) );
	public final newGrammarParser.type_return type() throws RecognitionException {
		newGrammarParser.type_return retval = new newGrammarParser.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDF30=null;
		Token string_literal31=null;
		Token char_literal32=null;
		Token char_literal34=null;
		Token char_literal35=null;
		ParserRuleReturnScope type33 =null;
		ParserRuleReturnScope type36 =null;

		CommonTree IDF30_tree=null;
		CommonTree string_literal31_tree=null;
		CommonTree char_literal32_tree=null;
		CommonTree char_literal34_tree=null;
		CommonTree char_literal35_tree=null;
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:39:6: ( IDF | 'vec' ( '<' type '>' ) -> ^( 'vec' type ) | '&' type -> ^( '&' type ) )
			int alt8=3;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case IDF:
				{
				alt8=1;
				}
				break;
			case 41:
				{
				alt8=2;
				}
				break;
			case 18:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:39:8: IDF
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(39,8);
					IDF30=(Token)match(input,IDF,FOLLOW_IDF_in_type250); 
					IDF30_tree = (CommonTree)adaptor.create(IDF30);
					adaptor.addChild(root_0, IDF30_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:40:4: 'vec' ( '<' type '>' )
					{
					dbg.location(40,4);
					string_literal31=(Token)match(input,41,FOLLOW_41_in_type255);  
					stream_41.add(string_literal31);
					dbg.location(40,10);
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:40:10: ( '<' type '>' )
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:40:11: '<' type '>'
					{
					dbg.location(40,11);
					char_literal32=(Token)match(input,26,FOLLOW_26_in_type258);  
					stream_26.add(char_literal32);
					dbg.location(40,15);
					pushFollow(FOLLOW_type_in_type260);
					type33=type();
					state._fsp--;

					stream_type.add(type33.getTree());dbg.location(40,20);
					char_literal34=(Token)match(input,28,FOLLOW_28_in_type262);  
					stream_28.add(char_literal34);

					}

					// AST REWRITE
					// elements: 41, type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 40:25: -> ^( 'vec' type )
					{
						dbg.location(40,28);
						// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:40:28: ^( 'vec' type )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(40,30);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_41.nextNode(), root_1);
						dbg.location(40,36);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:41:3: '&' type
					{
					dbg.location(41,3);
					char_literal35=(Token)match(input,18,FOLLOW_18_in_type276);  
					stream_18.add(char_literal35);
					dbg.location(41,7);
					pushFollow(FOLLOW_type_in_type278);
					type36=type();
					state._fsp--;

					stream_type.add(type36.getTree());
					// AST REWRITE
					// elements: 18, type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 41:12: -> ^( '&' type )
					{
						dbg.location(41,15);
						// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:41:15: ^( '&' type )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(41,17);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_18.nextNode(), root_1);
						dbg.location(41,21);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_0, root_1);
						}

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
		dbg.location(42, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "type"


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:44:1: block : '{' ( instruct )* '}' -> ^( BLOCK ( instruct )* ) ;
	public final newGrammarParser.block_return block() throws RecognitionException {
		newGrammarParser.block_return retval = new newGrammarParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal37=null;
		Token char_literal39=null;
		ParserRuleReturnScope instruct38 =null;

		CommonTree char_literal37_tree=null;
		CommonTree char_literal39_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_instruct=new RewriteRuleSubtreeStream(adaptor,"rule instruct");

		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:44:7: ( '{' ( instruct )* '}' -> ^( BLOCK ( instruct )* ) )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:44:9: '{' ( instruct )* '}'
			{
			dbg.location(44,9);
			char_literal37=(Token)match(input,43,FOLLOW_43_in_block295);  
			stream_43.add(char_literal37);
			dbg.location(44,13);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:44:13: ( instruct )*
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( (LA9_0==BOOL||(LA9_0 >= IDF && LA9_0 <= INT)||LA9_0==UNAIRE||LA9_0==19||LA9_0==25||LA9_0==31||(LA9_0 >= 35 && LA9_0 <= 36)||(LA9_0 >= 38 && LA9_0 <= 39)||(LA9_0 >= 41 && LA9_0 <= 43)) ) {
					alt9=1;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:44:13: instruct
					{
					dbg.location(44,13);
					pushFollow(FOLLOW_instruct_in_block297);
					instruct38=instruct();
					state._fsp--;

					stream_instruct.add(instruct38.getTree());
					}
					break;

				default :
					break loop9;
				}
			}
			} finally {dbg.exitSubRule(9);}
			dbg.location(44,23);
			char_literal39=(Token)match(input,44,FOLLOW_44_in_block300);  
			stream_44.add(char_literal39);

			// AST REWRITE
			// elements: instruct
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 44:26: -> ^( BLOCK ( instruct )* )
			{
				dbg.location(44,29);
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:44:29: ^( BLOCK ( instruct )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(44,31);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				dbg.location(44,37);
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:44:37: ( instruct )*
				while ( stream_instruct.hasNext() ) {
					dbg.location(44,37);
					adaptor.addChild(root_1, stream_instruct.nextTree());
				}
				stream_instruct.reset();

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
		dbg.location(45, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "block"


	public static class callFun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "callFun"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:48:1: callFun : '(' expr ( ',' expr )? ')' ;
	public final newGrammarParser.callFun_return callFun() throws RecognitionException {
		newGrammarParser.callFun_return retval = new newGrammarParser.callFun_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal40=null;
		Token char_literal42=null;
		Token char_literal44=null;
		ParserRuleReturnScope expr41 =null;
		ParserRuleReturnScope expr43 =null;

		CommonTree char_literal40_tree=null;
		CommonTree char_literal42_tree=null;
		CommonTree char_literal44_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "callFun");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:48:9: ( '(' expr ( ',' expr )? ')' )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:48:11: '(' expr ( ',' expr )? ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(48,11);
			char_literal40=(Token)match(input,19,FOLLOW_19_in_callFun319); 
			char_literal40_tree = (CommonTree)adaptor.create(char_literal40);
			adaptor.addChild(root_0, char_literal40_tree);
			dbg.location(48,15);
			pushFollow(FOLLOW_expr_in_callFun321);
			expr41=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr41.getTree());
			dbg.location(48,20);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:48:20: ( ',' expr )?
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==21) ) {
				alt10=1;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:48:21: ',' expr
					{
					dbg.location(48,21);
					char_literal42=(Token)match(input,21,FOLLOW_21_in_callFun324); 
					char_literal42_tree = (CommonTree)adaptor.create(char_literal42);
					adaptor.addChild(root_0, char_literal42_tree);
					dbg.location(48,25);
					pushFollow(FOLLOW_expr_in_callFun326);
					expr43=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr43.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(10);}
			dbg.location(48,32);
			char_literal44=(Token)match(input,20,FOLLOW_20_in_callFun330); 
			char_literal44_tree = (CommonTree)adaptor.create(char_literal44);
			adaptor.addChild(root_0, char_literal44_tree);

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
		dbg.location(48, 34);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "callFun");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "callFun"


	public static class newStruc_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "newStruc"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:50:1: newStruc : '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}' -> ^( NEW ( ^( IDF bigExpr ) )* ) ;
	public final newGrammarParser.newStruc_return newStruc() throws RecognitionException {
		newGrammarParser.newStruc_return retval = new newGrammarParser.newStruc_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal45=null;
		Token IDF46=null;
		Token char_literal47=null;
		Token char_literal49=null;
		Token IDF50=null;
		Token char_literal51=null;
		Token char_literal53=null;
		ParserRuleReturnScope bigExpr48 =null;
		ParserRuleReturnScope bigExpr52 =null;

		CommonTree char_literal45_tree=null;
		CommonTree IDF46_tree=null;
		CommonTree char_literal47_tree=null;
		CommonTree char_literal49_tree=null;
		CommonTree IDF50_tree=null;
		CommonTree char_literal51_tree=null;
		CommonTree char_literal53_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");

		try { dbg.enterRule(getGrammarFileName(), "newStruc");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(50, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:50:10: ( '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}' -> ^( NEW ( ^( IDF bigExpr ) )* ) )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:50:12: '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}'
			{
			dbg.location(50,12);
			char_literal45=(Token)match(input,43,FOLLOW_43_in_newStruc338);  
			stream_43.add(char_literal45);
			dbg.location(50,16);
			IDF46=(Token)match(input,IDF,FOLLOW_IDF_in_newStruc340);  
			stream_IDF.add(IDF46);
			dbg.location(50,20);
			char_literal47=(Token)match(input,24,FOLLOW_24_in_newStruc342);  
			stream_24.add(char_literal47);
			dbg.location(50,24);
			pushFollow(FOLLOW_bigExpr_in_newStruc344);
			bigExpr48=bigExpr();
			state._fsp--;

			stream_bigExpr.add(bigExpr48.getTree());dbg.location(50,32);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:50:32: ( ',' IDF ':' bigExpr )*
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==21) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:50:33: ',' IDF ':' bigExpr
					{
					dbg.location(50,33);
					char_literal49=(Token)match(input,21,FOLLOW_21_in_newStruc347);  
					stream_21.add(char_literal49);
					dbg.location(50,37);
					IDF50=(Token)match(input,IDF,FOLLOW_IDF_in_newStruc349);  
					stream_IDF.add(IDF50);
					dbg.location(50,41);
					char_literal51=(Token)match(input,24,FOLLOW_24_in_newStruc351);  
					stream_24.add(char_literal51);
					dbg.location(50,45);
					pushFollow(FOLLOW_bigExpr_in_newStruc353);
					bigExpr52=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr52.getTree());
					}
					break;

				default :
					break loop11;
				}
			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(50,55);
			char_literal53=(Token)match(input,44,FOLLOW_44_in_newStruc357);  
			stream_44.add(char_literal53);

			// AST REWRITE
			// elements: IDF, bigExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 50:59: -> ^( NEW ( ^( IDF bigExpr ) )* )
			{
				dbg.location(50,62);
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:50:62: ^( NEW ( ^( IDF bigExpr ) )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(50,64);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);
				dbg.location(50,68);
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:50:68: ( ^( IDF bigExpr ) )*
				while ( stream_IDF.hasNext()||stream_bigExpr.hasNext() ) {
					dbg.location(50,68);
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:50:68: ^( IDF bigExpr )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					dbg.location(50,70);
					root_2 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_2);
					dbg.location(50,74);
					adaptor.addChild(root_2, stream_bigExpr.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_IDF.reset();
				stream_bigExpr.reset();

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
		dbg.location(50, 83);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "newStruc");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "newStruc"


	public static class instruct_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instruct"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:55:1: instruct : ( expr ';' -> expr | ';' ->| 'let' ( 'mut' )? dotIDF '=' bigExpr ';' -> ^( 'let' ( 'mut' )? ^( '=' dotIDF bigExpr ) ) | 'while' expr block -> ^( 'while' expr block ) | 'return' ( expr )? ';' -> ^( 'return' ( expr )? ) | 'loop' block -> ^( 'loop' block ) | 'break' ';' -> 'break' | ifExpr );
	public final newGrammarParser.instruct_return instruct() throws RecognitionException {
		newGrammarParser.instruct_return retval = new newGrammarParser.instruct_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal55=null;
		Token char_literal56=null;
		Token string_literal57=null;
		Token string_literal58=null;
		Token char_literal60=null;
		Token char_literal62=null;
		Token string_literal63=null;
		Token string_literal66=null;
		Token char_literal68=null;
		Token string_literal69=null;
		Token string_literal71=null;
		Token char_literal72=null;
		ParserRuleReturnScope expr54 =null;
		ParserRuleReturnScope dotIDF59 =null;
		ParserRuleReturnScope bigExpr61 =null;
		ParserRuleReturnScope expr64 =null;
		ParserRuleReturnScope block65 =null;
		ParserRuleReturnScope expr67 =null;
		ParserRuleReturnScope block70 =null;
		ParserRuleReturnScope ifExpr73 =null;

		CommonTree char_literal55_tree=null;
		CommonTree char_literal56_tree=null;
		CommonTree string_literal57_tree=null;
		CommonTree string_literal58_tree=null;
		CommonTree char_literal60_tree=null;
		CommonTree char_literal62_tree=null;
		CommonTree string_literal63_tree=null;
		CommonTree string_literal66_tree=null;
		CommonTree char_literal68_tree=null;
		CommonTree string_literal69_tree=null;
		CommonTree string_literal71_tree=null;
		CommonTree char_literal72_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_dotIDF=new RewriteRuleSubtreeStream(adaptor,"rule dotIDF");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try { dbg.enterRule(getGrammarFileName(), "instruct");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(55, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:55:10: ( expr ';' -> expr | ';' ->| 'let' ( 'mut' )? dotIDF '=' bigExpr ';' -> ^( 'let' ( 'mut' )? ^( '=' dotIDF bigExpr ) ) | 'while' expr block -> ^( 'while' expr block ) | 'return' ( expr )? ';' -> ^( 'return' ( expr )? ) | 'loop' block -> ^( 'loop' block ) | 'break' ';' -> 'break' | ifExpr )
			int alt14=8;
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			switch ( input.LA(1) ) {
			case BOOL:
			case IDF:
			case INT:
			case UNAIRE:
			case 19:
			case 38:
			case 41:
			case 43:
				{
				alt14=1;
				}
				break;
			case 25:
				{
				alt14=2;
				}
				break;
			case 35:
				{
				alt14=3;
				}
				break;
			case 42:
				{
				alt14=4;
				}
				break;
			case 39:
				{
				alt14=5;
				}
				break;
			case 36:
				{
				alt14=6;
				}
				break;
			case 31:
				{
				alt14=7;
				}
				break;
			case IF:
				{
				alt14=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:56:1: expr ';'
					{
					dbg.location(56,1);
					pushFollow(FOLLOW_expr_in_instruct382);
					expr54=expr();
					state._fsp--;

					stream_expr.add(expr54.getTree());dbg.location(56,6);
					char_literal55=(Token)match(input,25,FOLLOW_25_in_instruct384);  
					stream_25.add(char_literal55);

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 56:10: -> expr
					{
						dbg.location(56,13);
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:57:3: ';'
					{
					dbg.location(57,3);
					char_literal56=(Token)match(input,25,FOLLOW_25_in_instruct392);  
					stream_25.add(char_literal56);

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
					// 57:7: ->
					{
						dbg.location(58,0);
						root_0 = null;
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:58:3: 'let' ( 'mut' )? dotIDF '=' bigExpr ';'
					{
					dbg.location(58,3);
					string_literal57=(Token)match(input,35,FOLLOW_35_in_instruct398);  
					stream_35.add(string_literal57);
					dbg.location(58,9);
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:58:9: ( 'mut' )?
					int alt12=2;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					int LA12_0 = input.LA(1);
					if ( (LA12_0==37) ) {
						alt12=1;
					}
					} finally {dbg.exitDecision(12);}

					switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:58:9: 'mut'
							{
							dbg.location(58,9);
							string_literal58=(Token)match(input,37,FOLLOW_37_in_instruct400);  
							stream_37.add(string_literal58);

							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(58,16);
					pushFollow(FOLLOW_dotIDF_in_instruct403);
					dotIDF59=dotIDF();
					state._fsp--;

					stream_dotIDF.add(dotIDF59.getTree());dbg.location(58,23);
					char_literal60=(Token)match(input,27,FOLLOW_27_in_instruct405);  
					stream_27.add(char_literal60);
					dbg.location(58,27);
					pushFollow(FOLLOW_bigExpr_in_instruct407);
					bigExpr61=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr61.getTree());dbg.location(58,35);
					char_literal62=(Token)match(input,25,FOLLOW_25_in_instruct409);  
					stream_25.add(char_literal62);

					// AST REWRITE
					// elements: 27, 35, bigExpr, 37, dotIDF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 58:39: -> ^( 'let' ( 'mut' )? ^( '=' dotIDF bigExpr ) )
					{
						dbg.location(58,42);
						// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:58:42: ^( 'let' ( 'mut' )? ^( '=' dotIDF bigExpr ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(58,44);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_35.nextNode(), root_1);
						dbg.location(58,50);
						// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:58:50: ( 'mut' )?
						if ( stream_37.hasNext() ) {
							dbg.location(58,50);
							adaptor.addChild(root_1, stream_37.nextNode());
						}
						stream_37.reset();
						dbg.location(58,57);
						// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:58:57: ^( '=' dotIDF bigExpr )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(58,59);
						root_2 = (CommonTree)adaptor.becomeRoot(stream_27.nextNode(), root_2);
						dbg.location(58,63);
						adaptor.addChild(root_2, stream_dotIDF.nextTree());dbg.location(58,70);
						adaptor.addChild(root_2, stream_bigExpr.nextTree());
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

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:59:3: 'while' expr block
					{
					dbg.location(59,3);
					string_literal63=(Token)match(input,42,FOLLOW_42_in_instruct431);  
					stream_42.add(string_literal63);
					dbg.location(59,11);
					pushFollow(FOLLOW_expr_in_instruct433);
					expr64=expr();
					state._fsp--;

					stream_expr.add(expr64.getTree());dbg.location(59,16);
					pushFollow(FOLLOW_block_in_instruct435);
					block65=block();
					state._fsp--;

					stream_block.add(block65.getTree());
					// AST REWRITE
					// elements: 42, expr, block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 59:22: -> ^( 'while' expr block )
					{
						dbg.location(59,25);
						// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:59:25: ^( 'while' expr block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(59,27);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_42.nextNode(), root_1);
						dbg.location(59,35);
						adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(59,40);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:60:3: 'return' ( expr )? ';'
					{
					dbg.location(60,3);
					string_literal66=(Token)match(input,39,FOLLOW_39_in_instruct449);  
					stream_39.add(string_literal66);
					dbg.location(60,12);
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:60:12: ( expr )?
					int alt13=2;
					try { dbg.enterSubRule(13);
					try { dbg.enterDecision(13, decisionCanBacktrack[13]);

					int LA13_0 = input.LA(1);
					if ( (LA13_0==BOOL||LA13_0==IDF||LA13_0==INT||LA13_0==UNAIRE||LA13_0==19||LA13_0==38||LA13_0==41||LA13_0==43) ) {
						alt13=1;
					}
					} finally {dbg.exitDecision(13);}

					switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:60:12: expr
							{
							dbg.location(60,12);
							pushFollow(FOLLOW_expr_in_instruct451);
							expr67=expr();
							state._fsp--;

							stream_expr.add(expr67.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(60,18);
					char_literal68=(Token)match(input,25,FOLLOW_25_in_instruct454);  
					stream_25.add(char_literal68);

					// AST REWRITE
					// elements: 39, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 60:22: -> ^( 'return' ( expr )? )
					{
						dbg.location(60,25);
						// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:60:25: ^( 'return' ( expr )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(60,27);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_39.nextNode(), root_1);
						dbg.location(60,36);
						// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:60:36: ( expr )?
						if ( stream_expr.hasNext() ) {
							dbg.location(60,36);
							adaptor.addChild(root_1, stream_expr.nextTree());
						}
						stream_expr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:61:3: 'loop' block
					{
					dbg.location(61,3);
					string_literal69=(Token)match(input,36,FOLLOW_36_in_instruct467);  
					stream_36.add(string_literal69);
					dbg.location(61,10);
					pushFollow(FOLLOW_block_in_instruct469);
					block70=block();
					state._fsp--;

					stream_block.add(block70.getTree());
					// AST REWRITE
					// elements: block, 36
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 61:16: -> ^( 'loop' block )
					{
						dbg.location(61,19);
						// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:61:19: ^( 'loop' block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(61,21);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_36.nextNode(), root_1);
						dbg.location(61,28);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:62:3: 'break' ';'
					{
					dbg.location(62,3);
					string_literal71=(Token)match(input,31,FOLLOW_31_in_instruct481);  
					stream_31.add(string_literal71);
					dbg.location(62,11);
					char_literal72=(Token)match(input,25,FOLLOW_25_in_instruct483);  
					stream_25.add(char_literal72);

					// AST REWRITE
					// elements: 31
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 62:15: -> 'break'
					{
						dbg.location(62,18);
						adaptor.addChild(root_0, stream_31.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:63:3: ifExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(63,3);
					pushFollow(FOLLOW_ifExpr_in_instruct491);
					ifExpr73=ifExpr();
					state._fsp--;

					adaptor.addChild(root_0, ifExpr73.getTree());

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
		dbg.location(64, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "instruct");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "instruct"


	public static class dotIDF_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dotIDF"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:66:1: dotIDF : IDF ( '.' ^ IDF )? ;
	public final newGrammarParser.dotIDF_return dotIDF() throws RecognitionException {
		newGrammarParser.dotIDF_return retval = new newGrammarParser.dotIDF_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDF74=null;
		Token char_literal75=null;
		Token IDF76=null;

		CommonTree IDF74_tree=null;
		CommonTree char_literal75_tree=null;
		CommonTree IDF76_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "dotIDF");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:66:9: ( IDF ( '.' ^ IDF )? )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:67:1: IDF ( '.' ^ IDF )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(67,1);
			IDF74=(Token)match(input,IDF,FOLLOW_IDF_in_dotIDF502); 
			IDF74_tree = (CommonTree)adaptor.create(IDF74);
			adaptor.addChild(root_0, IDF74_tree);
			dbg.location(67,5);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:67:5: ( '.' ^ IDF )?
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==23) ) {
				alt15=1;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:67:6: '.' ^ IDF
					{
					dbg.location(67,9);
					char_literal75=(Token)match(input,23,FOLLOW_23_in_dotIDF505); 
					char_literal75_tree = (CommonTree)adaptor.create(char_literal75);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal75_tree, root_0);
					dbg.location(67,11);
					IDF76=(Token)match(input,IDF,FOLLOW_IDF_in_dotIDF508); 
					IDF76_tree = (CommonTree)adaptor.create(IDF76);
					adaptor.addChild(root_0, IDF76_tree);

					}
					break;

			}
			} finally {dbg.exitSubRule(15);}

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
		dbg.location(67, 15);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dotIDF");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "dotIDF"


	public static class ifExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifExpr"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:69:1: ifExpr : 'if' expr block ( 'else' block )? -> ^( 'if' expr block ( ^( 'else' block ) )? ) ;
	public final newGrammarParser.ifExpr_return ifExpr() throws RecognitionException {
		newGrammarParser.ifExpr_return retval = new newGrammarParser.ifExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal77=null;
		Token string_literal80=null;
		ParserRuleReturnScope expr78 =null;
		ParserRuleReturnScope block79 =null;
		ParserRuleReturnScope block81 =null;

		CommonTree string_literal77_tree=null;
		CommonTree string_literal80_tree=null;
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try { dbg.enterRule(getGrammarFileName(), "ifExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:69:8: ( 'if' expr block ( 'else' block )? -> ^( 'if' expr block ( ^( 'else' block ) )? ) )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:69:10: 'if' expr block ( 'else' block )?
			{
			dbg.location(69,10);
			string_literal77=(Token)match(input,IF,FOLLOW_IF_in_ifExpr518);  
			stream_IF.add(string_literal77);
			dbg.location(69,15);
			pushFollow(FOLLOW_expr_in_ifExpr520);
			expr78=expr();
			state._fsp--;

			stream_expr.add(expr78.getTree());dbg.location(69,20);
			pushFollow(FOLLOW_block_in_ifExpr522);
			block79=block();
			state._fsp--;

			stream_block.add(block79.getTree());dbg.location(69,26);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:69:26: ( 'else' block )?
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==32) ) {
				alt16=1;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:69:27: 'else' block
					{
					dbg.location(69,27);
					string_literal80=(Token)match(input,32,FOLLOW_32_in_ifExpr525);  
					stream_32.add(string_literal80);
					dbg.location(69,34);
					pushFollow(FOLLOW_block_in_ifExpr527);
					block81=block();
					state._fsp--;

					stream_block.add(block81.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(16);}

			// AST REWRITE
			// elements: 32, IF, expr, block, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 69:43: -> ^( 'if' expr block ( ^( 'else' block ) )? )
			{
				dbg.location(69,46);
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:69:46: ^( 'if' expr block ( ^( 'else' block ) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(69,48);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				dbg.location(69,53);
				adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(69,58);
				adaptor.addChild(root_1, stream_block.nextTree());dbg.location(69,64);
				// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:69:64: ( ^( 'else' block ) )?
				if ( stream_32.hasNext()||stream_block.hasNext() ) {
					dbg.location(69,64);
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:69:64: ^( 'else' block )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					dbg.location(69,66);
					root_2 = (CommonTree)adaptor.becomeRoot(stream_32.nextNode(), root_2);
					dbg.location(69,73);
					adaptor.addChild(root_2, stream_block.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_32.reset();
				stream_block.reset();

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
		dbg.location(70, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "ifExpr"


	public static class binExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:72:1: binExpr : unExpr ( BINAIRE ^ unExpr )* ;
	public final newGrammarParser.binExpr_return binExpr() throws RecognitionException {
		newGrammarParser.binExpr_return retval = new newGrammarParser.binExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BINAIRE83=null;
		ParserRuleReturnScope unExpr82 =null;
		ParserRuleReturnScope unExpr84 =null;

		CommonTree BINAIRE83_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "binExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(72, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:72:9: ( unExpr ( BINAIRE ^ unExpr )* )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:72:11: unExpr ( BINAIRE ^ unExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(72,11);
			pushFollow(FOLLOW_unExpr_in_binExpr556);
			unExpr82=unExpr();
			state._fsp--;

			adaptor.addChild(root_0, unExpr82.getTree());
			dbg.location(72,18);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:72:18: ( BINAIRE ^ unExpr )*
			try { dbg.enterSubRule(17);

			loop17:
			while (true) {
				int alt17=2;
				try { dbg.enterDecision(17, decisionCanBacktrack[17]);

				int LA17_0 = input.LA(1);
				if ( (LA17_0==BINAIRE) ) {
					alt17=1;
				}

				} finally {dbg.exitDecision(17);}

				switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:72:19: BINAIRE ^ unExpr
					{
					dbg.location(72,26);
					BINAIRE83=(Token)match(input,BINAIRE,FOLLOW_BINAIRE_in_binExpr559); 
					BINAIRE83_tree = (CommonTree)adaptor.create(BINAIRE83);
					root_0 = (CommonTree)adaptor.becomeRoot(BINAIRE83_tree, root_0);
					dbg.location(72,28);
					pushFollow(FOLLOW_unExpr_in_binExpr562);
					unExpr84=unExpr();
					state._fsp--;

					adaptor.addChild(root_0, unExpr84.getTree());

					}
					break;

				default :
					break loop17;
				}
			}
			} finally {dbg.exitSubRule(17);}

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
		dbg.location(72, 35);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "binExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "binExpr"


	public static class vectExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "vectExpr"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:74:1: vectExpr : atom ( '[' expr ']' -> ^( VEC atom expr ) |) ;
	public final newGrammarParser.vectExpr_return vectExpr() throws RecognitionException {
		newGrammarParser.vectExpr_return retval = new newGrammarParser.vectExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal86=null;
		Token char_literal88=null;
		ParserRuleReturnScope atom85 =null;
		ParserRuleReturnScope expr87 =null;

		CommonTree char_literal86_tree=null;
		CommonTree char_literal88_tree=null;
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try { dbg.enterRule(getGrammarFileName(), "vectExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:74:10: ( atom ( '[' expr ']' -> ^( VEC atom expr ) |) )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:74:12: atom ( '[' expr ']' -> ^( VEC atom expr ) |)
			{
			dbg.location(74,12);
			pushFollow(FOLLOW_atom_in_vectExpr573);
			atom85=atom();
			state._fsp--;

			stream_atom.add(atom85.getTree());dbg.location(74,17);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:74:17: ( '[' expr ']' -> ^( VEC atom expr ) |)
			int alt18=2;
			try { dbg.enterSubRule(18);
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==29) ) {
				alt18=1;
			}
			else if ( (LA18_0==BINAIRE||(LA18_0 >= 20 && LA18_0 <= 21)||LA18_0==23||LA18_0==25||LA18_0==30||LA18_0==43) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:74:18: '[' expr ']'
					{
					dbg.location(74,18);
					char_literal86=(Token)match(input,29,FOLLOW_29_in_vectExpr576);  
					stream_29.add(char_literal86);
					dbg.location(74,22);
					pushFollow(FOLLOW_expr_in_vectExpr578);
					expr87=expr();
					state._fsp--;

					stream_expr.add(expr87.getTree());dbg.location(74,27);
					char_literal88=(Token)match(input,30,FOLLOW_30_in_vectExpr580);  
					stream_30.add(char_literal88);

					// AST REWRITE
					// elements: atom, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 74:31: -> ^( VEC atom expr )
					{
						dbg.location(74,33);
						// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:74:33: ^( VEC atom expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(74,35);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VEC, "VEC"), root_1);
						dbg.location(74,39);
						adaptor.addChild(root_1, stream_atom.nextTree());dbg.location(74,44);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:75:3: 
					{
					}
					break;

			}
			} finally {dbg.exitSubRule(18);}

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
		dbg.location(75, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vectExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "vectExpr"


	public static class dotExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dotExpr"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:78:1: dotExpr : vectExpr ( '.' ^ ( IDF | 'len' '(' ')' ) )? ;
	public final newGrammarParser.dotExpr_return dotExpr() throws RecognitionException {
		newGrammarParser.dotExpr_return retval = new newGrammarParser.dotExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal90=null;
		Token IDF91=null;
		Token string_literal92=null;
		Token char_literal93=null;
		Token char_literal94=null;
		ParserRuleReturnScope vectExpr89 =null;

		CommonTree char_literal90_tree=null;
		CommonTree IDF91_tree=null;
		CommonTree string_literal92_tree=null;
		CommonTree char_literal93_tree=null;
		CommonTree char_literal94_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "dotExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(78, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:78:9: ( vectExpr ( '.' ^ ( IDF | 'len' '(' ')' ) )? )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:78:11: vectExpr ( '.' ^ ( IDF | 'len' '(' ')' ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(78,11);
			pushFollow(FOLLOW_vectExpr_in_dotExpr602);
			vectExpr89=vectExpr();
			state._fsp--;

			adaptor.addChild(root_0, vectExpr89.getTree());
			dbg.location(78,20);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:78:20: ( '.' ^ ( IDF | 'len' '(' ')' ) )?
			int alt20=2;
			try { dbg.enterSubRule(20);
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			int LA20_0 = input.LA(1);
			if ( (LA20_0==23) ) {
				alt20=1;
			}
			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:78:21: '.' ^ ( IDF | 'len' '(' ')' )
					{
					dbg.location(78,24);
					char_literal90=(Token)match(input,23,FOLLOW_23_in_dotExpr605); 
					char_literal90_tree = (CommonTree)adaptor.create(char_literal90);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal90_tree, root_0);
					dbg.location(78,26);
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:78:26: ( IDF | 'len' '(' ')' )
					int alt19=2;
					try { dbg.enterSubRule(19);
					try { dbg.enterDecision(19, decisionCanBacktrack[19]);

					int LA19_0 = input.LA(1);
					if ( (LA19_0==IDF) ) {
						alt19=1;
					}
					else if ( (LA19_0==34) ) {
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

							// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:78:27: IDF
							{
							dbg.location(78,27);
							IDF91=(Token)match(input,IDF,FOLLOW_IDF_in_dotExpr609); 
							IDF91_tree = (CommonTree)adaptor.create(IDF91);
							adaptor.addChild(root_0, IDF91_tree);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:78:33: 'len' '(' ')'
							{
							dbg.location(78,33);
							string_literal92=(Token)match(input,34,FOLLOW_34_in_dotExpr613); 
							string_literal92_tree = (CommonTree)adaptor.create(string_literal92);
							adaptor.addChild(root_0, string_literal92_tree);
							dbg.location(78,39);
							char_literal93=(Token)match(input,19,FOLLOW_19_in_dotExpr615); 
							char_literal93_tree = (CommonTree)adaptor.create(char_literal93);
							adaptor.addChild(root_0, char_literal93_tree);
							dbg.location(78,42);
							char_literal94=(Token)match(input,20,FOLLOW_20_in_dotExpr616); 
							char_literal94_tree = (CommonTree)adaptor.create(char_literal94);
							adaptor.addChild(root_0, char_literal94_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(19);}

					}
					break;

			}
			} finally {dbg.exitSubRule(20);}

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
		dbg.location(78, 47);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dotExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "dotExpr"


	public static class unExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unExpr"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:80:1: unExpr : ( UNAIRE )? dotExpr ;
	public final newGrammarParser.unExpr_return unExpr() throws RecognitionException {
		newGrammarParser.unExpr_return retval = new newGrammarParser.unExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAIRE95=null;
		ParserRuleReturnScope dotExpr96 =null;

		CommonTree UNAIRE95_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "unExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:80:8: ( ( UNAIRE )? dotExpr )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:80:10: ( UNAIRE )? dotExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(80,10);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:80:10: ( UNAIRE )?
			int alt21=2;
			try { dbg.enterSubRule(21);
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			int LA21_0 = input.LA(1);
			if ( (LA21_0==UNAIRE) ) {
				alt21=1;
			}
			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:80:10: UNAIRE
					{
					dbg.location(80,10);
					UNAIRE95=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_unExpr628); 
					UNAIRE95_tree = (CommonTree)adaptor.create(UNAIRE95);
					adaptor.addChild(root_0, UNAIRE95_tree);

					}
					break;

			}
			} finally {dbg.exitSubRule(21);}
			dbg.location(80,18);
			pushFollow(FOLLOW_dotExpr_in_unExpr631);
			dotExpr96=dotExpr();
			state._fsp--;

			adaptor.addChild(root_0, dotExpr96.getTree());

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
		dbg.location(80, 24);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "unExpr"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:82:1: atom : ( INT | BOOL | IDF ( ( callFun ) )? | '(' expr ')' );
	public final newGrammarParser.atom_return atom() throws RecognitionException {
		newGrammarParser.atom_return retval = new newGrammarParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT97=null;
		Token BOOL98=null;
		Token IDF99=null;
		Token char_literal101=null;
		Token char_literal103=null;
		ParserRuleReturnScope callFun100 =null;
		ParserRuleReturnScope expr102 =null;

		CommonTree INT97_tree=null;
		CommonTree BOOL98_tree=null;
		CommonTree IDF99_tree=null;
		CommonTree char_literal101_tree=null;
		CommonTree char_literal103_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:82:6: ( INT | BOOL | IDF ( ( callFun ) )? | '(' expr ')' )
			int alt23=4;
			try { dbg.enterDecision(23, decisionCanBacktrack[23]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt23=1;
				}
				break;
			case BOOL:
				{
				alt23=2;
				}
				break;
			case IDF:
				{
				alt23=3;
				}
				break;
			case 19:
				{
				alt23=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(23);}

			switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:82:8: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(82,8);
					INT97=(Token)match(input,INT,FOLLOW_INT_in_atom639); 
					INT97_tree = (CommonTree)adaptor.create(INT97);
					adaptor.addChild(root_0, INT97_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:83:3: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(83,3);
					BOOL98=(Token)match(input,BOOL,FOLLOW_BOOL_in_atom642); 
					BOOL98_tree = (CommonTree)adaptor.create(BOOL98);
					adaptor.addChild(root_0, BOOL98_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:84:4: IDF ( ( callFun ) )?
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(84,4);
					IDF99=(Token)match(input,IDF,FOLLOW_IDF_in_atom647); 
					IDF99_tree = (CommonTree)adaptor.create(IDF99);
					adaptor.addChild(root_0, IDF99_tree);
					dbg.location(84,8);
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:84:8: ( ( callFun ) )?
					int alt22=2;
					try { dbg.enterSubRule(22);
					try { dbg.enterDecision(22, decisionCanBacktrack[22]);

					int LA22_0 = input.LA(1);
					if ( (LA22_0==19) ) {
						alt22=1;
					}
					} finally {dbg.exitDecision(22);}

					switch (alt22) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:84:9: ( callFun )
							{
							dbg.location(84,9);
							// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:84:9: ( callFun )
							dbg.enterAlt(1);

							// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:84:10: callFun
							{
							dbg.location(84,10);
							pushFollow(FOLLOW_callFun_in_atom651);
							callFun100=callFun();
							state._fsp--;

							adaptor.addChild(root_0, callFun100.getTree());

							}

							}
							break;

					}
					} finally {dbg.exitSubRule(22);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:85:3: '(' expr ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(85,3);
					char_literal101=(Token)match(input,19,FOLLOW_19_in_atom657); 
					char_literal101_tree = (CommonTree)adaptor.create(char_literal101);
					adaptor.addChild(root_0, char_literal101_tree);
					dbg.location(85,6);
					pushFollow(FOLLOW_expr_in_atom658);
					expr102=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr102.getTree());
					dbg.location(85,10);
					char_literal103=(Token)match(input,20,FOLLOW_20_in_atom659); 
					char_literal103_tree = (CommonTree)adaptor.create(char_literal103);
					adaptor.addChild(root_0, char_literal103_tree);

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
		dbg.location(85, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "atom"


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:87:1: expr : ( 'vec' '!' '[' expr ']' | 'print' '!' '(' expr ')' | block | binExpr );
	public final newGrammarParser.expr_return expr() throws RecognitionException {
		newGrammarParser.expr_return retval = new newGrammarParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal104=null;
		Token char_literal105=null;
		Token char_literal106=null;
		Token char_literal108=null;
		Token string_literal109=null;
		Token char_literal110=null;
		Token char_literal111=null;
		Token char_literal113=null;
		ParserRuleReturnScope expr107 =null;
		ParserRuleReturnScope expr112 =null;
		ParserRuleReturnScope block114 =null;
		ParserRuleReturnScope binExpr115 =null;

		CommonTree string_literal104_tree=null;
		CommonTree char_literal105_tree=null;
		CommonTree char_literal106_tree=null;
		CommonTree char_literal108_tree=null;
		CommonTree string_literal109_tree=null;
		CommonTree char_literal110_tree=null;
		CommonTree char_literal111_tree=null;
		CommonTree char_literal113_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(87, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:87:6: ( 'vec' '!' '[' expr ']' | 'print' '!' '(' expr ')' | block | binExpr )
			int alt24=4;
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			switch ( input.LA(1) ) {
			case 41:
				{
				alt24=1;
				}
				break;
			case 38:
				{
				alt24=2;
				}
				break;
			case 43:
				{
				alt24=3;
				}
				break;
			case BOOL:
			case IDF:
			case INT:
			case UNAIRE:
			case 19:
				{
				alt24=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:87:8: 'vec' '!' '[' expr ']'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(87,8);
					string_literal104=(Token)match(input,41,FOLLOW_41_in_expr667); 
					string_literal104_tree = (CommonTree)adaptor.create(string_literal104);
					adaptor.addChild(root_0, string_literal104_tree);
					dbg.location(87,14);
					char_literal105=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_expr669); 
					char_literal105_tree = (CommonTree)adaptor.create(char_literal105);
					adaptor.addChild(root_0, char_literal105_tree);
					dbg.location(87,18);
					char_literal106=(Token)match(input,29,FOLLOW_29_in_expr671); 
					char_literal106_tree = (CommonTree)adaptor.create(char_literal106);
					adaptor.addChild(root_0, char_literal106_tree);
					dbg.location(87,22);
					pushFollow(FOLLOW_expr_in_expr673);
					expr107=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr107.getTree());
					dbg.location(87,27);
					char_literal108=(Token)match(input,30,FOLLOW_30_in_expr675); 
					char_literal108_tree = (CommonTree)adaptor.create(char_literal108);
					adaptor.addChild(root_0, char_literal108_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:88:3: 'print' '!' '(' expr ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(88,3);
					string_literal109=(Token)match(input,38,FOLLOW_38_in_expr679); 
					string_literal109_tree = (CommonTree)adaptor.create(string_literal109);
					adaptor.addChild(root_0, string_literal109_tree);
					dbg.location(88,11);
					char_literal110=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_expr681); 
					char_literal110_tree = (CommonTree)adaptor.create(char_literal110);
					adaptor.addChild(root_0, char_literal110_tree);
					dbg.location(88,15);
					char_literal111=(Token)match(input,19,FOLLOW_19_in_expr683); 
					char_literal111_tree = (CommonTree)adaptor.create(char_literal111);
					adaptor.addChild(root_0, char_literal111_tree);
					dbg.location(88,19);
					pushFollow(FOLLOW_expr_in_expr685);
					expr112=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr112.getTree());
					dbg.location(88,24);
					char_literal113=(Token)match(input,20,FOLLOW_20_in_expr687); 
					char_literal113_tree = (CommonTree)adaptor.create(char_literal113);
					adaptor.addChild(root_0, char_literal113_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:89:3: block
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(89,3);
					pushFollow(FOLLOW_block_in_expr690);
					block114=block();
					state._fsp--;

					adaptor.addChild(root_0, block114.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:90:3: binExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(90,3);
					pushFollow(FOLLOW_binExpr_in_expr694);
					binExpr115=binExpr();
					state._fsp--;

					adaptor.addChild(root_0, binExpr115.getTree());

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
		dbg.location(90, 9);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expr"


	public static class bigbinExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:93:1: bigbinExpr : bigunExpr ( BINAIRE bigunExpr )* ;
	public final newGrammarParser.bigbinExpr_return bigbinExpr() throws RecognitionException {
		newGrammarParser.bigbinExpr_return retval = new newGrammarParser.bigbinExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BINAIRE117=null;
		ParserRuleReturnScope bigunExpr116 =null;
		ParserRuleReturnScope bigunExpr118 =null;

		CommonTree BINAIRE117_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(93, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:93:12: ( bigunExpr ( BINAIRE bigunExpr )* )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:93:14: bigunExpr ( BINAIRE bigunExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(93,14);
			pushFollow(FOLLOW_bigunExpr_in_bigbinExpr703);
			bigunExpr116=bigunExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigunExpr116.getTree());
			dbg.location(93,24);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:93:24: ( BINAIRE bigunExpr )*
			try { dbg.enterSubRule(25);

			loop25:
			while (true) {
				int alt25=2;
				try { dbg.enterDecision(25, decisionCanBacktrack[25]);

				int LA25_0 = input.LA(1);
				if ( (LA25_0==BINAIRE) ) {
					alt25=1;
				}

				} finally {dbg.exitDecision(25);}

				switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:93:25: BINAIRE bigunExpr
					{
					dbg.location(93,25);
					BINAIRE117=(Token)match(input,BINAIRE,FOLLOW_BINAIRE_in_bigbinExpr706); 
					BINAIRE117_tree = (CommonTree)adaptor.create(BINAIRE117);
					adaptor.addChild(root_0, BINAIRE117_tree);
					dbg.location(93,33);
					pushFollow(FOLLOW_bigunExpr_in_bigbinExpr708);
					bigunExpr118=bigunExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigunExpr118.getTree());

					}
					break;

				default :
					break loop25;
				}
			}
			} finally {dbg.exitSubRule(25);}

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
		dbg.location(93, 43);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigbinExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigbinExpr"


	public static class bigvectExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigvectExpr"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:95:1: bigvectExpr : bigatom ( '[' bigExpr ']' )? ;
	public final newGrammarParser.bigvectExpr_return bigvectExpr() throws RecognitionException {
		newGrammarParser.bigvectExpr_return retval = new newGrammarParser.bigvectExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal120=null;
		Token char_literal122=null;
		ParserRuleReturnScope bigatom119 =null;
		ParserRuleReturnScope bigExpr121 =null;

		CommonTree char_literal120_tree=null;
		CommonTree char_literal122_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigvectExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(95, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:95:13: ( bigatom ( '[' bigExpr ']' )? )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:95:15: bigatom ( '[' bigExpr ']' )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(95,15);
			pushFollow(FOLLOW_bigatom_in_bigvectExpr718);
			bigatom119=bigatom();
			state._fsp--;

			adaptor.addChild(root_0, bigatom119.getTree());
			dbg.location(95,23);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:95:23: ( '[' bigExpr ']' )?
			int alt26=2;
			try { dbg.enterSubRule(26);
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			int LA26_0 = input.LA(1);
			if ( (LA26_0==29) ) {
				alt26=1;
			}
			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:95:24: '[' bigExpr ']'
					{
					dbg.location(95,24);
					char_literal120=(Token)match(input,29,FOLLOW_29_in_bigvectExpr721); 
					char_literal120_tree = (CommonTree)adaptor.create(char_literal120);
					adaptor.addChild(root_0, char_literal120_tree);
					dbg.location(95,28);
					pushFollow(FOLLOW_bigExpr_in_bigvectExpr723);
					bigExpr121=bigExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigExpr121.getTree());
					dbg.location(95,36);
					char_literal122=(Token)match(input,30,FOLLOW_30_in_bigvectExpr725); 
					char_literal122_tree = (CommonTree)adaptor.create(char_literal122);
					adaptor.addChild(root_0, char_literal122_tree);

					}
					break;

			}
			} finally {dbg.exitSubRule(26);}

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
		dbg.location(95, 40);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigvectExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigvectExpr"


	public static class bigdotExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigdotExpr"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:97:1: bigdotExpr : bigvectExpr ( '.' ( IDF | 'len' '(' ')' ) )? ;
	public final newGrammarParser.bigdotExpr_return bigdotExpr() throws RecognitionException {
		newGrammarParser.bigdotExpr_return retval = new newGrammarParser.bigdotExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal124=null;
		Token IDF125=null;
		Token string_literal126=null;
		Token char_literal127=null;
		Token char_literal128=null;
		ParserRuleReturnScope bigvectExpr123 =null;

		CommonTree char_literal124_tree=null;
		CommonTree IDF125_tree=null;
		CommonTree string_literal126_tree=null;
		CommonTree char_literal127_tree=null;
		CommonTree char_literal128_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigdotExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(97, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:97:12: ( bigvectExpr ( '.' ( IDF | 'len' '(' ')' ) )? )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:97:14: bigvectExpr ( '.' ( IDF | 'len' '(' ')' ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(97,14);
			pushFollow(FOLLOW_bigvectExpr_in_bigdotExpr735);
			bigvectExpr123=bigvectExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigvectExpr123.getTree());
			dbg.location(97,26);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:97:26: ( '.' ( IDF | 'len' '(' ')' ) )?
			int alt28=2;
			try { dbg.enterSubRule(28);
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==23) ) {
				alt28=1;
			}
			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:97:27: '.' ( IDF | 'len' '(' ')' )
					{
					dbg.location(97,27);
					char_literal124=(Token)match(input,23,FOLLOW_23_in_bigdotExpr738); 
					char_literal124_tree = (CommonTree)adaptor.create(char_literal124);
					adaptor.addChild(root_0, char_literal124_tree);
					dbg.location(97,31);
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:97:31: ( IDF | 'len' '(' ')' )
					int alt27=2;
					try { dbg.enterSubRule(27);
					try { dbg.enterDecision(27, decisionCanBacktrack[27]);

					int LA27_0 = input.LA(1);
					if ( (LA27_0==IDF) ) {
						alt27=1;
					}
					else if ( (LA27_0==34) ) {
						alt27=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(27);}

					switch (alt27) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:97:32: IDF
							{
							dbg.location(97,32);
							IDF125=(Token)match(input,IDF,FOLLOW_IDF_in_bigdotExpr741); 
							IDF125_tree = (CommonTree)adaptor.create(IDF125);
							adaptor.addChild(root_0, IDF125_tree);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:97:38: 'len' '(' ')'
							{
							dbg.location(97,38);
							string_literal126=(Token)match(input,34,FOLLOW_34_in_bigdotExpr745); 
							string_literal126_tree = (CommonTree)adaptor.create(string_literal126);
							adaptor.addChild(root_0, string_literal126_tree);
							dbg.location(97,44);
							char_literal127=(Token)match(input,19,FOLLOW_19_in_bigdotExpr747); 
							char_literal127_tree = (CommonTree)adaptor.create(char_literal127);
							adaptor.addChild(root_0, char_literal127_tree);
							dbg.location(97,47);
							char_literal128=(Token)match(input,20,FOLLOW_20_in_bigdotExpr748); 
							char_literal128_tree = (CommonTree)adaptor.create(char_literal128);
							adaptor.addChild(root_0, char_literal128_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(27);}

					}
					break;

			}
			} finally {dbg.exitSubRule(28);}

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
		dbg.location(97, 52);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigdotExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigdotExpr"


	public static class bigunExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigunExpr"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:99:1: bigunExpr : ( UNAIRE )? bigdotExpr ;
	public final newGrammarParser.bigunExpr_return bigunExpr() throws RecognitionException {
		newGrammarParser.bigunExpr_return retval = new newGrammarParser.bigunExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAIRE129=null;
		ParserRuleReturnScope bigdotExpr130 =null;

		CommonTree UNAIRE129_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigunExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(99, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:99:11: ( ( UNAIRE )? bigdotExpr )
			dbg.enterAlt(1);

			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:99:13: ( UNAIRE )? bigdotExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(99,13);
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:99:13: ( UNAIRE )?
			int alt29=2;
			try { dbg.enterSubRule(29);
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

			int LA29_0 = input.LA(1);
			if ( (LA29_0==UNAIRE) ) {
				alt29=1;
			}
			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:99:13: UNAIRE
					{
					dbg.location(99,13);
					UNAIRE129=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigunExpr759); 
					UNAIRE129_tree = (CommonTree)adaptor.create(UNAIRE129);
					adaptor.addChild(root_0, UNAIRE129_tree);

					}
					break;

			}
			} finally {dbg.exitSubRule(29);}
			dbg.location(99,21);
			pushFollow(FOLLOW_bigdotExpr_in_bigunExpr762);
			bigdotExpr130=bigdotExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigdotExpr130.getTree());

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
		dbg.location(99, 30);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigunExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigunExpr"


	public static class bigExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigExpr"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:101:1: bigExpr : ( 'vec' '!' '[' expr ( ',' expr )* ']' | 'print' '!' '(' expr ')' | block | bigbinExpr );
	public final newGrammarParser.bigExpr_return bigExpr() throws RecognitionException {
		newGrammarParser.bigExpr_return retval = new newGrammarParser.bigExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal131=null;
		Token char_literal132=null;
		Token char_literal133=null;
		Token char_literal135=null;
		Token char_literal137=null;
		Token string_literal138=null;
		Token char_literal139=null;
		Token char_literal140=null;
		Token char_literal142=null;
		ParserRuleReturnScope expr134 =null;
		ParserRuleReturnScope expr136 =null;
		ParserRuleReturnScope expr141 =null;
		ParserRuleReturnScope block143 =null;
		ParserRuleReturnScope bigbinExpr144 =null;

		CommonTree string_literal131_tree=null;
		CommonTree char_literal132_tree=null;
		CommonTree char_literal133_tree=null;
		CommonTree char_literal135_tree=null;
		CommonTree char_literal137_tree=null;
		CommonTree string_literal138_tree=null;
		CommonTree char_literal139_tree=null;
		CommonTree char_literal140_tree=null;
		CommonTree char_literal142_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(101, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:102:3: ( 'vec' '!' '[' expr ( ',' expr )* ']' | 'print' '!' '(' expr ')' | block | bigbinExpr )
			int alt31=4;
			try { dbg.enterDecision(31, decisionCanBacktrack[31]);

			switch ( input.LA(1) ) {
			case 41:
				{
				alt31=1;
				}
				break;
			case 38:
				{
				alt31=2;
				}
				break;
			case 43:
				{
				alt31=3;
				}
				break;
			case BOOL:
			case IDF:
			case INT:
			case UNAIRE:
			case 19:
				{
				alt31=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(31);}

			switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:102:3: 'vec' '!' '[' expr ( ',' expr )* ']'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(102,3);
					string_literal131=(Token)match(input,41,FOLLOW_41_in_bigExpr771); 
					string_literal131_tree = (CommonTree)adaptor.create(string_literal131);
					adaptor.addChild(root_0, string_literal131_tree);
					dbg.location(102,9);
					char_literal132=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigExpr773); 
					char_literal132_tree = (CommonTree)adaptor.create(char_literal132);
					adaptor.addChild(root_0, char_literal132_tree);
					dbg.location(102,13);
					char_literal133=(Token)match(input,29,FOLLOW_29_in_bigExpr775); 
					char_literal133_tree = (CommonTree)adaptor.create(char_literal133);
					adaptor.addChild(root_0, char_literal133_tree);
					dbg.location(102,17);
					pushFollow(FOLLOW_expr_in_bigExpr777);
					expr134=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr134.getTree());
					dbg.location(102,22);
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:102:22: ( ',' expr )*
					try { dbg.enterSubRule(30);

					loop30:
					while (true) {
						int alt30=2;
						try { dbg.enterDecision(30, decisionCanBacktrack[30]);

						int LA30_0 = input.LA(1);
						if ( (LA30_0==21) ) {
							alt30=1;
						}

						} finally {dbg.exitDecision(30);}

						switch (alt30) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:102:23: ',' expr
							{
							dbg.location(102,23);
							char_literal135=(Token)match(input,21,FOLLOW_21_in_bigExpr780); 
							char_literal135_tree = (CommonTree)adaptor.create(char_literal135);
							adaptor.addChild(root_0, char_literal135_tree);
							dbg.location(102,27);
							pushFollow(FOLLOW_expr_in_bigExpr782);
							expr136=expr();
							state._fsp--;

							adaptor.addChild(root_0, expr136.getTree());

							}
							break;

						default :
							break loop30;
						}
					}
					} finally {dbg.exitSubRule(30);}
					dbg.location(102,33);
					char_literal137=(Token)match(input,30,FOLLOW_30_in_bigExpr785); 
					char_literal137_tree = (CommonTree)adaptor.create(char_literal137);
					adaptor.addChild(root_0, char_literal137_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:103:3: 'print' '!' '(' expr ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(103,3);
					string_literal138=(Token)match(input,38,FOLLOW_38_in_bigExpr789); 
					string_literal138_tree = (CommonTree)adaptor.create(string_literal138);
					adaptor.addChild(root_0, string_literal138_tree);
					dbg.location(103,11);
					char_literal139=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigExpr791); 
					char_literal139_tree = (CommonTree)adaptor.create(char_literal139);
					adaptor.addChild(root_0, char_literal139_tree);
					dbg.location(103,15);
					char_literal140=(Token)match(input,19,FOLLOW_19_in_bigExpr793); 
					char_literal140_tree = (CommonTree)adaptor.create(char_literal140);
					adaptor.addChild(root_0, char_literal140_tree);
					dbg.location(103,19);
					pushFollow(FOLLOW_expr_in_bigExpr795);
					expr141=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr141.getTree());
					dbg.location(103,24);
					char_literal142=(Token)match(input,20,FOLLOW_20_in_bigExpr797); 
					char_literal142_tree = (CommonTree)adaptor.create(char_literal142);
					adaptor.addChild(root_0, char_literal142_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:104:3: block
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(104,3);
					pushFollow(FOLLOW_block_in_bigExpr800);
					block143=block();
					state._fsp--;

					adaptor.addChild(root_0, block143.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:105:3: bigbinExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(105,3);
					pushFollow(FOLLOW_bigbinExpr_in_bigExpr804);
					bigbinExpr144=bigbinExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr144.getTree());

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
		dbg.location(105, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigExpr"


	public static class bigatom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigatom"
	// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:107:1: bigatom : ( INT | BOOL | IDF ( newStruc | callFun )? | '(' bigExpr ')' );
	public final newGrammarParser.bigatom_return bigatom() throws RecognitionException {
		newGrammarParser.bigatom_return retval = new newGrammarParser.bigatom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT145=null;
		Token BOOL146=null;
		Token IDF147=null;
		Token char_literal150=null;
		Token char_literal152=null;
		ParserRuleReturnScope newStruc148 =null;
		ParserRuleReturnScope callFun149 =null;
		ParserRuleReturnScope bigExpr151 =null;

		CommonTree INT145_tree=null;
		CommonTree BOOL146_tree=null;
		CommonTree IDF147_tree=null;
		CommonTree char_literal150_tree=null;
		CommonTree char_literal152_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigatom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(107, 0);

		try {
			// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:107:9: ( INT | BOOL | IDF ( newStruc | callFun )? | '(' bigExpr ')' )
			int alt33=4;
			try { dbg.enterDecision(33, decisionCanBacktrack[33]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt33=1;
				}
				break;
			case BOOL:
				{
				alt33=2;
				}
				break;
			case IDF:
				{
				alt33=3;
				}
				break;
			case 19:
				{
				alt33=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(33);}

			switch (alt33) {
				case 1 :
					dbg.enterAlt(1);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:107:11: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(107,11);
					INT145=(Token)match(input,INT,FOLLOW_INT_in_bigatom812); 
					INT145_tree = (CommonTree)adaptor.create(INT145);
					adaptor.addChild(root_0, INT145_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:108:3: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(108,3);
					BOOL146=(Token)match(input,BOOL,FOLLOW_BOOL_in_bigatom815); 
					BOOL146_tree = (CommonTree)adaptor.create(BOOL146);
					adaptor.addChild(root_0, BOOL146_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:109:4: IDF ( newStruc | callFun )?
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(109,4);
					IDF147=(Token)match(input,IDF,FOLLOW_IDF_in_bigatom820); 
					IDF147_tree = (CommonTree)adaptor.create(IDF147);
					adaptor.addChild(root_0, IDF147_tree);
					dbg.location(109,8);
					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:109:8: ( newStruc | callFun )?
					int alt32=3;
					try { dbg.enterSubRule(32);
					try { dbg.enterDecision(32, decisionCanBacktrack[32]);

					int LA32_0 = input.LA(1);
					if ( (LA32_0==43) ) {
						alt32=1;
					}
					else if ( (LA32_0==19) ) {
						alt32=2;
					}
					} finally {dbg.exitDecision(32);}

					switch (alt32) {
						case 1 :
							dbg.enterAlt(1);

							// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:109:9: newStruc
							{
							dbg.location(109,9);
							pushFollow(FOLLOW_newStruc_in_bigatom823);
							newStruc148=newStruc();
							state._fsp--;

							adaptor.addChild(root_0, newStruc148.getTree());

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:109:18: callFun
							{
							dbg.location(109,18);
							pushFollow(FOLLOW_callFun_in_bigatom825);
							callFun149=callFun();
							state._fsp--;

							adaptor.addChild(root_0, callFun149.getTree());

							}
							break;

					}
					} finally {dbg.exitSubRule(32);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/etudiants/raimondi3u/CompilTest/newGrammar.g:110:3: '(' bigExpr ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(110,3);
					char_literal150=(Token)match(input,19,FOLLOW_19_in_bigatom830); 
					char_literal150_tree = (CommonTree)adaptor.create(char_literal150);
					adaptor.addChild(root_0, char_literal150_tree);
					dbg.location(110,6);
					pushFollow(FOLLOW_bigExpr_in_bigatom831);
					bigExpr151=bigExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigExpr151.getTree());
					dbg.location(110,13);
					char_literal152=(Token)match(input,20,FOLLOW_20_in_bigatom832); 
					char_literal152_tree = (CommonTree)adaptor.create(char_literal152);
					adaptor.addChild(root_0, char_literal152_tree);

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
		dbg.location(110, 15);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigatom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigatom"

	// Delegated rules



	public static final BitSet FOLLOW_fichier_in_axiom74 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_axiom76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_fichier92 = new BitSet(new long[]{0x0000010200000002L});
	public static final BitSet FOLLOW_declFun_in_decl103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declStruct_in_decl107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_declStruct116 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDF_in_declStruct118 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_declStruct120 = new BitSet(new long[]{0x0000100000000200L});
	public static final BitSet FOLLOW_args_in_declStruct122 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_declStruct125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_args146 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_args148 = new BitSet(new long[]{0x0000020000040200L});
	public static final BitSet FOLLOW_type_in_args150 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_args153 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDF_in_args155 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_args157 = new BitSet(new long[]{0x0000020000040200L});
	public static final BitSet FOLLOW_type_in_args159 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_33_in_declFun181 = new BitSet(new long[]{0x0000000000001200L});
	public static final BitSet FOLLOW_IDF_in_declFun184 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_declFun186 = new BitSet(new long[]{0x0000000000100200L});
	public static final BitSet FOLLOW_args_in_declFun188 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_declFun191 = new BitSet(new long[]{0x0000080000400000L});
	public static final BitSet FOLLOW_22_in_declFun194 = new BitSet(new long[]{0x0000020000040200L});
	public static final BitSet FOLLOW_type_in_declFun196 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_block_in_declFun200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIN_in_declFun224 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_declFun226 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_declFun228 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_block_in_declFun230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_type250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_type255 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_type258 = new BitSet(new long[]{0x0000020000040200L});
	public static final BitSet FOLLOW_type_in_type260 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_type262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_type276 = new BitSet(new long[]{0x0000020000040200L});
	public static final BitSet FOLLOW_type_in_type278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_block295 = new BitSet(new long[]{0x00001ED882088E80L});
	public static final BitSet FOLLOW_instruct_in_block297 = new BitSet(new long[]{0x00001ED882088E80L});
	public static final BitSet FOLLOW_44_in_block300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_callFun319 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_expr_in_callFun321 = new BitSet(new long[]{0x0000000000300000L});
	public static final BitSet FOLLOW_21_in_callFun324 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_expr_in_callFun326 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_callFun330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_newStruc338 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDF_in_newStruc340 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_newStruc342 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_bigExpr_in_newStruc344 = new BitSet(new long[]{0x0000100000200000L});
	public static final BitSet FOLLOW_21_in_newStruc347 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDF_in_newStruc349 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_newStruc351 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_bigExpr_in_newStruc353 = new BitSet(new long[]{0x0000100000200000L});
	public static final BitSet FOLLOW_44_in_newStruc357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_instruct382 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_instruct384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_instruct392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_instruct398 = new BitSet(new long[]{0x0000002000000200L});
	public static final BitSet FOLLOW_37_in_instruct400 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_dotIDF_in_instruct403 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_instruct405 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_bigExpr_in_instruct407 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_instruct409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_instruct431 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_expr_in_instruct433 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_block_in_instruct435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_instruct449 = new BitSet(new long[]{0x00000A4002088A80L});
	public static final BitSet FOLLOW_expr_in_instruct451 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_instruct454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_instruct467 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_block_in_instruct469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_instruct481 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_instruct483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpr_in_instruct491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_dotIDF502 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_dotIDF505 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDF_in_dotIDF508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifExpr518 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_expr_in_ifExpr520 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_block_in_ifExpr522 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_ifExpr525 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_block_in_ifExpr527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unExpr_in_binExpr556 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BINAIRE_in_binExpr559 = new BitSet(new long[]{0x0000000000088A80L});
	public static final BitSet FOLLOW_unExpr_in_binExpr562 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_atom_in_vectExpr573 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_vectExpr576 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_expr_in_vectExpr578 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_vectExpr580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vectExpr_in_dotExpr602 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_dotExpr605 = new BitSet(new long[]{0x0000000400000200L});
	public static final BitSet FOLLOW_IDF_in_dotExpr609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_dotExpr613 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_dotExpr615 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_dotExpr616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAIRE_in_unExpr628 = new BitSet(new long[]{0x0000000000080A80L});
	public static final BitSet FOLLOW_dotExpr_in_unExpr631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_atom642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_atom647 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_callFun_in_atom651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_atom657 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_expr_in_atom658 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_atom659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_expr667 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_UNAIRE_in_expr669 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_expr671 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_expr_in_expr673 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_expr675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_expr679 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_UNAIRE_in_expr681 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_expr683 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_expr_in_expr685 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_expr687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_expr690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binExpr_in_expr694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigunExpr_in_bigbinExpr703 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BINAIRE_in_bigbinExpr706 = new BitSet(new long[]{0x0000000000088A80L});
	public static final BitSet FOLLOW_bigunExpr_in_bigbinExpr708 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_bigatom_in_bigvectExpr718 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_bigvectExpr721 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_bigExpr_in_bigvectExpr723 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_bigvectExpr725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigvectExpr_in_bigdotExpr735 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_bigdotExpr738 = new BitSet(new long[]{0x0000000400000200L});
	public static final BitSet FOLLOW_IDF_in_bigdotExpr741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_bigdotExpr745 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_bigdotExpr747 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_bigdotExpr748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAIRE_in_bigunExpr759 = new BitSet(new long[]{0x0000000000080A80L});
	public static final BitSet FOLLOW_bigdotExpr_in_bigunExpr762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_bigExpr771 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_UNAIRE_in_bigExpr773 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_bigExpr775 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_expr_in_bigExpr777 = new BitSet(new long[]{0x0000000040200000L});
	public static final BitSet FOLLOW_21_in_bigExpr780 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_expr_in_bigExpr782 = new BitSet(new long[]{0x0000000040200000L});
	public static final BitSet FOLLOW_30_in_bigExpr785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_bigExpr789 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_UNAIRE_in_bigExpr791 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_bigExpr793 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_expr_in_bigExpr795 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_bigExpr797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_bigExpr800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigbinExpr_in_bigExpr804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_bigatom812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_bigatom815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_bigatom820 = new BitSet(new long[]{0x0000080000080002L});
	public static final BitSet FOLLOW_newStruc_in_bigatom823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callFun_in_bigatom825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_bigatom830 = new BitSet(new long[]{0x00000A4000088A80L});
	public static final BitSet FOLLOW_bigExpr_in_bigatom831 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_bigatom832 = new BitSet(new long[]{0x0000000000000002L});
}
