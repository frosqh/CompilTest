// $ANTLR null /home/frosqh/workspace/CompilTest/newGrammar.g 2018-03-06 11:11:50

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDSUB", "ANDBOOL", "ATTRIBUTE", 
		"BLOCK", "BOOL", "CALLFUN", "COMMENT", "DIV", "EPERLU", "EQUAL", "IDF", 
		"IF", "INT", "MAIN", "NEW", "NEXT", "OPBOOLEQ", "ORBOOL", "PREV", "STAR", 
		"STRING", "UNAIRE", "VEC", "WS", "'('", "')'", "','", "'-'", "'->'", "'.'", 
		"':'", "';'", "'['", "']'", "'break'", "'else'", "'fn'", "'len'", "'let'", 
		"'loop'", "'mut'", "'print'", "'return'", "'struct'", "'vec'", "'while'", 
		"'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "decl", "binExpr5", "starExpr", "declFun", "bigExpr", "moinsExpr", 
		"fichier", "bigbinExpr1", "binExpr3", "dotIDF", "binExpr6", "bigbinExpr2", 
		"binExpr4", "bigatom", "block", "vectExpr", "bigvectExpr", "binExpr1", 
		"bigbinExpr5", "axiom", "atom", "bigdotExpr", "callFun", "binExpr2", "ifExpr", 
		"declStruct", "args", "bigbinExpr4", "type", "expr", "bigbinExpr3", "newStruc", 
		"dotExpr", "instruct", "unExpr", "bigunExpr", "bigbinExpr6"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false
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
	@Override public String getGrammarFileName() { return "/home/frosqh/workspace/CompilTest/newGrammar.g"; }


	boolean mainFound = false;


	public static class axiom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "axiom"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:20:1: axiom : fichier EOF -> fichier ;
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
		dbg.location(20, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:20:7: ( fichier EOF -> fichier )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:20:9: fichier EOF
			{
			dbg.location(20,9);
			pushFollow(FOLLOW_fichier_in_axiom78);
			fichier1=fichier();
			state._fsp--;

			stream_fichier.add(fichier1.getTree());dbg.location(20,17);
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_axiom80);  
			stream_EOF.add(EOF2);
			dbg.location(20,21);
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
			// 20:93: -> fichier
			{
				dbg.location(20,96);
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
		dbg.location(21, 0);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:23:1: fichier : ( decl )* ;
	public final newGrammarParser.fichier_return fichier() throws RecognitionException {
		newGrammarParser.fichier_return retval = new newGrammarParser.fichier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope decl3 =null;


		try { dbg.enterRule(getGrammarFileName(), "fichier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:23:9: ( ( decl )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:23:11: ( decl )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(23,11);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:23:11: ( decl )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==40||LA1_0==47) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:23:11: decl
					{
					dbg.location(23,11);
					pushFollow(FOLLOW_decl_in_fichier96);
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
		dbg.location(24, 0);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:26:1: decl : ( declFun | declStruct );
	public final newGrammarParser.decl_return decl() throws RecognitionException {
		newGrammarParser.decl_return retval = new newGrammarParser.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope declFun4 =null;
		ParserRuleReturnScope declStruct5 =null;


		try { dbg.enterRule(getGrammarFileName(), "decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:26:6: ( declFun | declStruct )
			int alt2=2;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==40) ) {
				alt2=1;
			}
			else if ( (LA2_0==47) ) {
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

					// /home/frosqh/workspace/CompilTest/newGrammar.g:26:8: declFun
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(26,8);
					pushFollow(FOLLOW_declFun_in_decl107);
					declFun4=declFun();
					state._fsp--;

					adaptor.addChild(root_0, declFun4.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:27:3: declStruct
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(27,3);
					pushFollow(FOLLOW_declStruct_in_decl111);
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
		dbg.location(28, 0);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:30:1: declStruct : 'struct' IDF '{' ( args )? '}' -> ^( 'struct' IDF ( args )? ) ;
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
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");

		try { dbg.enterRule(getGrammarFileName(), "declStruct");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:30:12: ( 'struct' IDF '{' ( args )? '}' -> ^( 'struct' IDF ( args )? ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:30:14: 'struct' IDF '{' ( args )? '}'
			{
			dbg.location(30,14);
			string_literal6=(Token)match(input,47,FOLLOW_47_in_declStruct120);  
			stream_47.add(string_literal6);
			dbg.location(30,23);
			IDF7=(Token)match(input,IDF,FOLLOW_IDF_in_declStruct122);  
			stream_IDF.add(IDF7);
			dbg.location(30,27);
			char_literal8=(Token)match(input,50,FOLLOW_50_in_declStruct124);  
			stream_50.add(char_literal8);
			dbg.location(30,31);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:30:31: ( args )?
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

					// /home/frosqh/workspace/CompilTest/newGrammar.g:30:31: args
					{
					dbg.location(30,31);
					pushFollow(FOLLOW_args_in_declStruct126);
					args9=args();
					state._fsp--;

					stream_args.add(args9.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(30,37);
			char_literal10=(Token)match(input,51,FOLLOW_51_in_declStruct129);  
			stream_51.add(char_literal10);

			// AST REWRITE
			// elements: IDF, args, 47
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 30:41: -> ^( 'struct' IDF ( args )? )
			{
				dbg.location(30,44);
				// /home/frosqh/workspace/CompilTest/newGrammar.g:30:44: ^( 'struct' IDF ( args )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(30,46);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_47.nextNode(), root_1);
				dbg.location(30,55);
				adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(30,59);
				// /home/frosqh/workspace/CompilTest/newGrammar.g:30:59: ( args )?
				if ( stream_args.hasNext() ) {
					dbg.location(30,59);
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
		dbg.location(31, 0);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:33:1: args : IDF ':' type ( ',' IDF ':' type )* -> ( ^( IDF type ) )* ;
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
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "args");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:33:6: ( IDF ':' type ( ',' IDF ':' type )* -> ( ^( IDF type ) )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:33:8: IDF ':' type ( ',' IDF ':' type )*
			{
			dbg.location(33,8);
			IDF11=(Token)match(input,IDF,FOLLOW_IDF_in_args150);  
			stream_IDF.add(IDF11);
			dbg.location(33,12);
			char_literal12=(Token)match(input,34,FOLLOW_34_in_args152);  
			stream_34.add(char_literal12);
			dbg.location(33,16);
			pushFollow(FOLLOW_type_in_args154);
			type13=type();
			state._fsp--;

			stream_type.add(type13.getTree());dbg.location(33,21);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:33:21: ( ',' IDF ':' type )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==30) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:33:22: ',' IDF ':' type
					{
					dbg.location(33,22);
					char_literal14=(Token)match(input,30,FOLLOW_30_in_args157);  
					stream_30.add(char_literal14);
					dbg.location(33,26);
					IDF15=(Token)match(input,IDF,FOLLOW_IDF_in_args159);  
					stream_IDF.add(IDF15);
					dbg.location(33,30);
					char_literal16=(Token)match(input,34,FOLLOW_34_in_args161);  
					stream_34.add(char_literal16);
					dbg.location(33,34);
					pushFollow(FOLLOW_type_in_args163);
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
			// elements: type, IDF
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 33:41: -> ( ^( IDF type ) )*
			{
				dbg.location(33,44);
				// /home/frosqh/workspace/CompilTest/newGrammar.g:33:44: ( ^( IDF type ) )*
				while ( stream_type.hasNext()||stream_IDF.hasNext() ) {
					dbg.location(33,45);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:33:45: ^( IDF type )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					dbg.location(33,47);
					root_1 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_1);
					dbg.location(33,51);
					adaptor.addChild(root_1, stream_type.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_type.reset();
				stream_IDF.reset();

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
		dbg.location(34, 0);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:36:1: declFun : 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF args ( ^( '->' type ) )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) ) ;
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
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_MAIN=new RewriteRuleTokenStream(adaptor,"token MAIN");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "declFun");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(36, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:36:9: ( 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF args ( ^( '->' type ) )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:36:11: 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF args ( ^( '->' type ) )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) )
			{
			dbg.location(36,11);
			string_literal18=(Token)match(input,40,FOLLOW_40_in_declFun185);  
			stream_40.add(string_literal18);
			dbg.location(36,16);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:36:16: ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF args ( ^( '->' type ) )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) )
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

					// /home/frosqh/workspace/CompilTest/newGrammar.g:36:17: IDF '(' ( args )? ')' ( '->' type )? block
					{
					dbg.location(36,17);
					IDF19=(Token)match(input,IDF,FOLLOW_IDF_in_declFun188);  
					stream_IDF.add(IDF19);
					dbg.location(36,21);
					char_literal20=(Token)match(input,28,FOLLOW_28_in_declFun190);  
					stream_28.add(char_literal20);
					dbg.location(36,25);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:36:25: ( args )?
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

							// /home/frosqh/workspace/CompilTest/newGrammar.g:36:25: args
							{
							dbg.location(36,25);
							pushFollow(FOLLOW_args_in_declFun192);
							args21=args();
							state._fsp--;

							stream_args.add(args21.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(5);}
					dbg.location(36,31);
					char_literal22=(Token)match(input,29,FOLLOW_29_in_declFun195);  
					stream_29.add(char_literal22);
					dbg.location(36,35);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:36:35: ( '->' type )?
					int alt6=2;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					int LA6_0 = input.LA(1);
					if ( (LA6_0==32) ) {
						alt6=1;
					}
					} finally {dbg.exitDecision(6);}

					switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:36:36: '->' type
							{
							dbg.location(36,36);
							string_literal23=(Token)match(input,32,FOLLOW_32_in_declFun198);  
							stream_32.add(string_literal23);
							dbg.location(36,41);
							pushFollow(FOLLOW_type_in_declFun200);
							type24=type();
							state._fsp--;

							stream_type.add(type24.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(6);}
					dbg.location(36,48);
					pushFollow(FOLLOW_block_in_declFun204);
					block25=block();
					state._fsp--;

					stream_block.add(block25.getTree());
					// AST REWRITE
					// elements: args, block, type, 40, IDF, 32
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 36:54: -> ^( 'fn' IDF args ( ^( '->' type ) )? block )
					{
						dbg.location(36,57);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:36:57: ^( 'fn' IDF args ( ^( '->' type ) )? block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(36,59);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_40.nextNode(), root_1);
						dbg.location(36,64);
						adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(36,68);
						adaptor.addChild(root_1, stream_args.nextTree());dbg.location(36,73);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:36:73: ( ^( '->' type ) )?
						if ( stream_type.hasNext()||stream_32.hasNext() ) {
							dbg.location(36,73);
							// /home/frosqh/workspace/CompilTest/newGrammar.g:36:73: ^( '->' type )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							dbg.location(36,75);
							root_2 = (CommonTree)adaptor.becomeRoot(stream_32.nextNode(), root_2);
							dbg.location(36,80);
							adaptor.addChild(root_2, stream_type.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_type.reset();
						stream_32.reset();
						dbg.location(36,87);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:37:4: MAIN '(' ')' block
					{
					dbg.location(37,4);
					mainFound = true;dbg.location(37,23);
					MAIN26=(Token)match(input,MAIN,FOLLOW_MAIN_in_declFun229);  
					stream_MAIN.add(MAIN26);
					dbg.location(37,28);
					char_literal27=(Token)match(input,28,FOLLOW_28_in_declFun231);  
					stream_28.add(char_literal27);
					dbg.location(37,32);
					char_literal28=(Token)match(input,29,FOLLOW_29_in_declFun233);  
					stream_29.add(char_literal28);
					dbg.location(37,36);
					pushFollow(FOLLOW_block_in_declFun235);
					block29=block();
					state._fsp--;

					stream_block.add(block29.getTree());
					// AST REWRITE
					// elements: MAIN, 40, block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 37:42: -> ^( 'fn' MAIN block )
					{
						dbg.location(37,45);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:37:45: ^( 'fn' MAIN block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(37,47);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_40.nextNode(), root_1);
						dbg.location(37,52);
						adaptor.addChild(root_1, stream_MAIN.nextNode());dbg.location(37,57);
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
		dbg.location(38, 0);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:40:1: type : ( IDF | 'vec' ( '<' type '>' ) -> ^( 'vec' type ) | '&' type -> ^( '&' type ) );
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
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_PREV=new RewriteRuleTokenStream(adaptor,"token PREV");
		RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
		RewriteRuleTokenStream stream_EPERLU=new RewriteRuleTokenStream(adaptor,"token EPERLU");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:40:6: ( IDF | 'vec' ( '<' type '>' ) -> ^( 'vec' type ) | '&' type -> ^( '&' type ) )
			int alt8=3;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case IDF:
				{
				alt8=1;
				}
				break;
			case 48:
				{
				alt8=2;
				}
				break;
			case EPERLU:
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

					// /home/frosqh/workspace/CompilTest/newGrammar.g:40:8: IDF
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(40,8);
					IDF30=(Token)match(input,IDF,FOLLOW_IDF_in_type255); 
					IDF30_tree = (CommonTree)adaptor.create(IDF30);
					adaptor.addChild(root_0, IDF30_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:41:4: 'vec' ( '<' type '>' )
					{
					dbg.location(41,4);
					string_literal31=(Token)match(input,48,FOLLOW_48_in_type260);  
					stream_48.add(string_literal31);
					dbg.location(41,10);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:41:10: ( '<' type '>' )
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:41:11: '<' type '>'
					{
					dbg.location(41,11);
					char_literal32=(Token)match(input,PREV,FOLLOW_PREV_in_type263);  
					stream_PREV.add(char_literal32);
					dbg.location(41,15);
					pushFollow(FOLLOW_type_in_type265);
					type33=type();
					state._fsp--;

					stream_type.add(type33.getTree());dbg.location(41,20);
					char_literal34=(Token)match(input,NEXT,FOLLOW_NEXT_in_type267);  
					stream_NEXT.add(char_literal34);

					}

					// AST REWRITE
					// elements: 48, type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 41:25: -> ^( 'vec' type )
					{
						dbg.location(41,28);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:41:28: ^( 'vec' type )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(41,30);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_48.nextNode(), root_1);
						dbg.location(41,36);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:42:3: '&' type
					{
					dbg.location(42,3);
					char_literal35=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_type281);  
					stream_EPERLU.add(char_literal35);
					dbg.location(42,7);
					pushFollow(FOLLOW_type_in_type283);
					type36=type();
					state._fsp--;

					stream_type.add(type36.getTree());
					// AST REWRITE
					// elements: type, EPERLU
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 42:12: -> ^( '&' type )
					{
						dbg.location(42,15);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:42:15: ^( '&' type )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(42,17);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_EPERLU.nextNode(), root_1);
						dbg.location(42,21);
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
		dbg.location(43, 0);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:45:1: block : '{' ( instruct )* '}' -> ^( BLOCK ( instruct )* ) ;
	public final newGrammarParser.block_return block() throws RecognitionException {
		newGrammarParser.block_return retval = new newGrammarParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal37=null;
		Token char_literal39=null;
		ParserRuleReturnScope instruct38 =null;

		CommonTree char_literal37_tree=null;
		CommonTree char_literal39_tree=null;
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_instruct=new RewriteRuleSubtreeStream(adaptor,"rule instruct");

		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:45:7: ( '{' ( instruct )* '}' -> ^( BLOCK ( instruct )* ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:45:9: '{' ( instruct )* '}'
			{
			dbg.location(45,9);
			char_literal37=(Token)match(input,50,FOLLOW_50_in_block300);  
			stream_50.add(char_literal37);
			dbg.location(45,13);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:45:13: ( instruct )*
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( (LA9_0==BOOL||LA9_0==EPERLU||(LA9_0 >= IDF && LA9_0 <= INT)||LA9_0==STAR||LA9_0==UNAIRE||LA9_0==28||LA9_0==31||LA9_0==35||LA9_0==38||(LA9_0 >= 42 && LA9_0 <= 43)||(LA9_0 >= 45 && LA9_0 <= 46)||(LA9_0 >= 48 && LA9_0 <= 50)) ) {
					alt9=1;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:45:13: instruct
					{
					dbg.location(45,13);
					pushFollow(FOLLOW_instruct_in_block302);
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
			dbg.location(45,23);
			char_literal39=(Token)match(input,51,FOLLOW_51_in_block305);  
			stream_51.add(char_literal39);

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
			// 45:26: -> ^( BLOCK ( instruct )* )
			{
				dbg.location(45,29);
				// /home/frosqh/workspace/CompilTest/newGrammar.g:45:29: ^( BLOCK ( instruct )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(45,31);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				dbg.location(45,37);
				// /home/frosqh/workspace/CompilTest/newGrammar.g:45:37: ( instruct )*
				while ( stream_instruct.hasNext() ) {
					dbg.location(45,37);
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
		dbg.location(46, 0);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:49:1: callFun : '(' expr ( ',' expr )* ')' -> ( expr )* ;
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
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "callFun");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:49:9: ( '(' expr ( ',' expr )* ')' -> ( expr )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:49:11: '(' expr ( ',' expr )* ')'
			{
			dbg.location(49,11);
			char_literal40=(Token)match(input,28,FOLLOW_28_in_callFun324);  
			stream_28.add(char_literal40);
			dbg.location(49,15);
			pushFollow(FOLLOW_expr_in_callFun326);
			expr41=expr();
			state._fsp--;

			stream_expr.add(expr41.getTree());dbg.location(49,20);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:49:20: ( ',' expr )*
			try { dbg.enterSubRule(10);

			loop10:
			while (true) {
				int alt10=2;
				try { dbg.enterDecision(10, decisionCanBacktrack[10]);

				int LA10_0 = input.LA(1);
				if ( (LA10_0==30) ) {
					alt10=1;
				}

				} finally {dbg.exitDecision(10);}

				switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:49:21: ',' expr
					{
					dbg.location(49,21);
					char_literal42=(Token)match(input,30,FOLLOW_30_in_callFun329);  
					stream_30.add(char_literal42);
					dbg.location(49,25);
					pushFollow(FOLLOW_expr_in_callFun331);
					expr43=expr();
					state._fsp--;

					stream_expr.add(expr43.getTree());
					}
					break;

				default :
					break loop10;
				}
			}
			} finally {dbg.exitSubRule(10);}
			dbg.location(49,32);
			char_literal44=(Token)match(input,29,FOLLOW_29_in_callFun335);  
			stream_29.add(char_literal44);

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
			// 49:36: -> ( expr )*
			{
				dbg.location(49,39);
				// /home/frosqh/workspace/CompilTest/newGrammar.g:49:39: ( expr )*
				while ( stream_expr.hasNext() ) {
					dbg.location(49,39);
					adaptor.addChild(root_0, stream_expr.nextTree());
				}
				stream_expr.reset();

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
		dbg.location(49, 43);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:51:1: newStruc : '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}' -> ^( NEW ( ^( IDF bigExpr ) )* ) ;
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
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");

		try { dbg.enterRule(getGrammarFileName(), "newStruc");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:51:10: ( '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}' -> ^( NEW ( ^( IDF bigExpr ) )* ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:51:12: '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}'
			{
			dbg.location(51,12);
			char_literal45=(Token)match(input,50,FOLLOW_50_in_newStruc348);  
			stream_50.add(char_literal45);
			dbg.location(51,16);
			IDF46=(Token)match(input,IDF,FOLLOW_IDF_in_newStruc350);  
			stream_IDF.add(IDF46);
			dbg.location(51,20);
			char_literal47=(Token)match(input,34,FOLLOW_34_in_newStruc352);  
			stream_34.add(char_literal47);
			dbg.location(51,24);
			pushFollow(FOLLOW_bigExpr_in_newStruc354);
			bigExpr48=bigExpr();
			state._fsp--;

			stream_bigExpr.add(bigExpr48.getTree());dbg.location(51,32);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:51:32: ( ',' IDF ':' bigExpr )*
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==30) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:51:33: ',' IDF ':' bigExpr
					{
					dbg.location(51,33);
					char_literal49=(Token)match(input,30,FOLLOW_30_in_newStruc357);  
					stream_30.add(char_literal49);
					dbg.location(51,37);
					IDF50=(Token)match(input,IDF,FOLLOW_IDF_in_newStruc359);  
					stream_IDF.add(IDF50);
					dbg.location(51,41);
					char_literal51=(Token)match(input,34,FOLLOW_34_in_newStruc361);  
					stream_34.add(char_literal51);
					dbg.location(51,45);
					pushFollow(FOLLOW_bigExpr_in_newStruc363);
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
			dbg.location(51,55);
			char_literal53=(Token)match(input,51,FOLLOW_51_in_newStruc367);  
			stream_51.add(char_literal53);

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
			// 51:59: -> ^( NEW ( ^( IDF bigExpr ) )* )
			{
				dbg.location(51,62);
				// /home/frosqh/workspace/CompilTest/newGrammar.g:51:62: ^( NEW ( ^( IDF bigExpr ) )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(51,64);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);
				dbg.location(51,68);
				// /home/frosqh/workspace/CompilTest/newGrammar.g:51:68: ( ^( IDF bigExpr ) )*
				while ( stream_IDF.hasNext()||stream_bigExpr.hasNext() ) {
					dbg.location(51,68);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:51:68: ^( IDF bigExpr )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					dbg.location(51,70);
					root_2 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_2);
					dbg.location(51,74);
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
		dbg.location(51, 83);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:53:1: instruct : ( expr ';' -> expr | ';' ->| 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';' -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) ) | 'while' expr block -> ^( 'while' expr block ) | 'return' ( expr )? ';' -> ^( 'return' ( expr )? ) | 'loop' block -> ^( 'loop' block ) | 'break' ';' -> 'break' | ifExpr );
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
		Token char_literal64=null;
		Token string_literal65=null;
		Token string_literal68=null;
		Token char_literal70=null;
		Token string_literal71=null;
		Token string_literal73=null;
		Token char_literal74=null;
		ParserRuleReturnScope expr54 =null;
		ParserRuleReturnScope dotIDF59 =null;
		ParserRuleReturnScope type61 =null;
		ParserRuleReturnScope bigExpr63 =null;
		ParserRuleReturnScope expr66 =null;
		ParserRuleReturnScope block67 =null;
		ParserRuleReturnScope expr69 =null;
		ParserRuleReturnScope block72 =null;
		ParserRuleReturnScope ifExpr75 =null;

		CommonTree char_literal55_tree=null;
		CommonTree char_literal56_tree=null;
		CommonTree string_literal57_tree=null;
		CommonTree string_literal58_tree=null;
		CommonTree char_literal60_tree=null;
		CommonTree char_literal62_tree=null;
		CommonTree char_literal64_tree=null;
		CommonTree string_literal65_tree=null;
		CommonTree string_literal68_tree=null;
		CommonTree char_literal70_tree=null;
		CommonTree string_literal71_tree=null;
		CommonTree string_literal73_tree=null;
		CommonTree char_literal74_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_dotIDF=new RewriteRuleSubtreeStream(adaptor,"rule dotIDF");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "instruct");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(53, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:53:10: ( expr ';' -> expr | ';' ->| 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';' -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) ) | 'while' expr block -> ^( 'while' expr block ) | 'return' ( expr )? ';' -> ^( 'return' ( expr )? ) | 'loop' block -> ^( 'loop' block ) | 'break' ';' -> 'break' | ifExpr )
			int alt15=8;
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			switch ( input.LA(1) ) {
			case BOOL:
			case EPERLU:
			case IDF:
			case INT:
			case STAR:
			case UNAIRE:
			case 28:
			case 31:
			case 45:
			case 48:
			case 50:
				{
				alt15=1;
				}
				break;
			case 35:
				{
				alt15=2;
				}
				break;
			case 42:
				{
				alt15=3;
				}
				break;
			case 49:
				{
				alt15=4;
				}
				break;
			case 46:
				{
				alt15=5;
				}
				break;
			case 43:
				{
				alt15=6;
				}
				break;
			case 38:
				{
				alt15=7;
				}
				break;
			case IF:
				{
				alt15=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:54:3: expr ';'
					{
					dbg.location(54,3);
					pushFollow(FOLLOW_expr_in_instruct391);
					expr54=expr();
					state._fsp--;

					stream_expr.add(expr54.getTree());dbg.location(54,8);
					char_literal55=(Token)match(input,35,FOLLOW_35_in_instruct393);  
					stream_35.add(char_literal55);

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
					// 54:12: -> expr
					{
						dbg.location(54,15);
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:55:3: ';'
					{
					dbg.location(55,3);
					char_literal56=(Token)match(input,35,FOLLOW_35_in_instruct401);  
					stream_35.add(char_literal56);

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
					// 55:7: ->
					{
						dbg.location(56,0);
						root_0 = null;
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:56:3: 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';'
					{
					dbg.location(56,3);
					string_literal57=(Token)match(input,42,FOLLOW_42_in_instruct407);  
					stream_42.add(string_literal57);
					dbg.location(56,9);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:56:9: ( 'mut' )?
					int alt12=2;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					int LA12_0 = input.LA(1);
					if ( (LA12_0==44) ) {
						alt12=1;
					}
					} finally {dbg.exitDecision(12);}

					switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:56:9: 'mut'
							{
							dbg.location(56,9);
							string_literal58=(Token)match(input,44,FOLLOW_44_in_instruct409);  
							stream_44.add(string_literal58);

							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(56,16);
					pushFollow(FOLLOW_dotIDF_in_instruct412);
					dotIDF59=dotIDF();
					state._fsp--;

					stream_dotIDF.add(dotIDF59.getTree());dbg.location(56,23);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:56:23: ( ':' type )?
					int alt13=2;
					try { dbg.enterSubRule(13);
					try { dbg.enterDecision(13, decisionCanBacktrack[13]);

					int LA13_0 = input.LA(1);
					if ( (LA13_0==34) ) {
						alt13=1;
					}
					} finally {dbg.exitDecision(13);}

					switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:56:24: ':' type
							{
							dbg.location(56,24);
							char_literal60=(Token)match(input,34,FOLLOW_34_in_instruct415);  
							stream_34.add(char_literal60);
							dbg.location(56,28);
							pushFollow(FOLLOW_type_in_instruct417);
							type61=type();
							state._fsp--;

							stream_type.add(type61.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(56,35);
					char_literal62=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_instruct421);  
					stream_EQUAL.add(char_literal62);
					dbg.location(56,39);
					pushFollow(FOLLOW_bigExpr_in_instruct423);
					bigExpr63=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr63.getTree());dbg.location(56,47);
					char_literal64=(Token)match(input,35,FOLLOW_35_in_instruct425);  
					stream_35.add(char_literal64);

					// AST REWRITE
					// elements: 42, dotIDF, 44, EQUAL, bigExpr, type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 56:51: -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) )
					{
						dbg.location(56,54);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:56:54: ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(56,56);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_42.nextNode(), root_1);
						dbg.location(56,62);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:56:62: ( 'mut' )?
						if ( stream_44.hasNext() ) {
							dbg.location(56,62);
							adaptor.addChild(root_1, stream_44.nextNode());
						}
						stream_44.reset();
						dbg.location(56,69);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:56:69: ( type )?
						if ( stream_type.hasNext() ) {
							dbg.location(56,70);
							adaptor.addChild(root_1, stream_type.nextTree());
						}
						stream_type.reset();
						dbg.location(56,77);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:56:77: ^( '=' dotIDF bigExpr )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(56,79);
						root_2 = (CommonTree)adaptor.becomeRoot(stream_EQUAL.nextNode(), root_2);
						dbg.location(56,83);
						adaptor.addChild(root_2, stream_dotIDF.nextTree());dbg.location(56,90);
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

					// /home/frosqh/workspace/CompilTest/newGrammar.g:57:3: 'while' expr block
					{
					dbg.location(57,3);
					string_literal65=(Token)match(input,49,FOLLOW_49_in_instruct452);  
					stream_49.add(string_literal65);
					dbg.location(57,11);
					pushFollow(FOLLOW_expr_in_instruct454);
					expr66=expr();
					state._fsp--;

					stream_expr.add(expr66.getTree());dbg.location(57,16);
					pushFollow(FOLLOW_block_in_instruct456);
					block67=block();
					state._fsp--;

					stream_block.add(block67.getTree());
					// AST REWRITE
					// elements: block, expr, 49
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 57:22: -> ^( 'while' expr block )
					{
						dbg.location(57,25);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:57:25: ^( 'while' expr block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(57,27);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_49.nextNode(), root_1);
						dbg.location(57,35);
						adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(57,40);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:58:3: 'return' ( expr )? ';'
					{
					dbg.location(58,3);
					string_literal68=(Token)match(input,46,FOLLOW_46_in_instruct470);  
					stream_46.add(string_literal68);
					dbg.location(58,12);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:58:12: ( expr )?
					int alt14=2;
					try { dbg.enterSubRule(14);
					try { dbg.enterDecision(14, decisionCanBacktrack[14]);

					int LA14_0 = input.LA(1);
					if ( (LA14_0==BOOL||LA14_0==EPERLU||LA14_0==IDF||LA14_0==INT||LA14_0==STAR||LA14_0==UNAIRE||LA14_0==28||LA14_0==31||LA14_0==45||LA14_0==48||LA14_0==50) ) {
						alt14=1;
					}
					} finally {dbg.exitDecision(14);}

					switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:58:12: expr
							{
							dbg.location(58,12);
							pushFollow(FOLLOW_expr_in_instruct472);
							expr69=expr();
							state._fsp--;

							stream_expr.add(expr69.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(58,18);
					char_literal70=(Token)match(input,35,FOLLOW_35_in_instruct475);  
					stream_35.add(char_literal70);

					// AST REWRITE
					// elements: 46, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 58:22: -> ^( 'return' ( expr )? )
					{
						dbg.location(58,25);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:58:25: ^( 'return' ( expr )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(58,27);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_46.nextNode(), root_1);
						dbg.location(58,36);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:58:36: ( expr )?
						if ( stream_expr.hasNext() ) {
							dbg.location(58,36);
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

					// /home/frosqh/workspace/CompilTest/newGrammar.g:59:3: 'loop' block
					{
					dbg.location(59,3);
					string_literal71=(Token)match(input,43,FOLLOW_43_in_instruct488);  
					stream_43.add(string_literal71);
					dbg.location(59,10);
					pushFollow(FOLLOW_block_in_instruct490);
					block72=block();
					state._fsp--;

					stream_block.add(block72.getTree());
					// AST REWRITE
					// elements: 43, block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 59:16: -> ^( 'loop' block )
					{
						dbg.location(59,19);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:59:19: ^( 'loop' block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(59,21);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_43.nextNode(), root_1);
						dbg.location(59,28);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:60:3: 'break' ';'
					{
					dbg.location(60,3);
					string_literal73=(Token)match(input,38,FOLLOW_38_in_instruct502);  
					stream_38.add(string_literal73);
					dbg.location(60,11);
					char_literal74=(Token)match(input,35,FOLLOW_35_in_instruct504);  
					stream_35.add(char_literal74);

					// AST REWRITE
					// elements: 38
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 60:15: -> 'break'
					{
						dbg.location(60,18);
						adaptor.addChild(root_0, stream_38.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:61:3: ifExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(61,3);
					pushFollow(FOLLOW_ifExpr_in_instruct512);
					ifExpr75=ifExpr();
					state._fsp--;

					adaptor.addChild(root_0, ifExpr75.getTree());

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
		dbg.location(62, 0);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:64:1: dotIDF : IDF ( '.' ^ IDF )? ;
	public final newGrammarParser.dotIDF_return dotIDF() throws RecognitionException {
		newGrammarParser.dotIDF_return retval = new newGrammarParser.dotIDF_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDF76=null;
		Token char_literal77=null;
		Token IDF78=null;

		CommonTree IDF76_tree=null;
		CommonTree char_literal77_tree=null;
		CommonTree IDF78_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "dotIDF");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:64:9: ( IDF ( '.' ^ IDF )? )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:65:1: IDF ( '.' ^ IDF )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(65,1);
			IDF76=(Token)match(input,IDF,FOLLOW_IDF_in_dotIDF523); 
			IDF76_tree = (CommonTree)adaptor.create(IDF76);
			adaptor.addChild(root_0, IDF76_tree);
			dbg.location(65,5);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:65:5: ( '.' ^ IDF )?
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==33) ) {
				alt16=1;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:65:6: '.' ^ IDF
					{
					dbg.location(65,9);
					char_literal77=(Token)match(input,33,FOLLOW_33_in_dotIDF526); 
					char_literal77_tree = (CommonTree)adaptor.create(char_literal77);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal77_tree, root_0);
					dbg.location(65,11);
					IDF78=(Token)match(input,IDF,FOLLOW_IDF_in_dotIDF529); 
					IDF78_tree = (CommonTree)adaptor.create(IDF78);
					adaptor.addChild(root_0, IDF78_tree);

					}
					break;

			}
			} finally {dbg.exitSubRule(16);}

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
		dbg.location(65, 15);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:67:1: ifExpr : 'if' expr block ( 'else' block )? -> ^( 'if' expr block ( ^( 'else' block ) )? ) ;
	public final newGrammarParser.ifExpr_return ifExpr() throws RecognitionException {
		newGrammarParser.ifExpr_return retval = new newGrammarParser.ifExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal79=null;
		Token string_literal82=null;
		ParserRuleReturnScope expr80 =null;
		ParserRuleReturnScope block81 =null;
		ParserRuleReturnScope block83 =null;

		CommonTree string_literal79_tree=null;
		CommonTree string_literal82_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try { dbg.enterRule(getGrammarFileName(), "ifExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(67, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:67:8: ( 'if' expr block ( 'else' block )? -> ^( 'if' expr block ( ^( 'else' block ) )? ) )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:67:10: 'if' expr block ( 'else' block )?
			{
			dbg.location(67,10);
			string_literal79=(Token)match(input,IF,FOLLOW_IF_in_ifExpr539);  
			stream_IF.add(string_literal79);
			dbg.location(67,15);
			pushFollow(FOLLOW_expr_in_ifExpr541);
			expr80=expr();
			state._fsp--;

			stream_expr.add(expr80.getTree());dbg.location(67,20);
			pushFollow(FOLLOW_block_in_ifExpr543);
			block81=block();
			state._fsp--;

			stream_block.add(block81.getTree());dbg.location(67,26);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:67:26: ( 'else' block )?
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==39) ) {
				alt17=1;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:67:27: 'else' block
					{
					dbg.location(67,27);
					string_literal82=(Token)match(input,39,FOLLOW_39_in_ifExpr546);  
					stream_39.add(string_literal82);
					dbg.location(67,34);
					pushFollow(FOLLOW_block_in_ifExpr548);
					block83=block();
					state._fsp--;

					stream_block.add(block83.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(17);}

			// AST REWRITE
			// elements: 39, expr, block, IF, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 67:43: -> ^( 'if' expr block ( ^( 'else' block ) )? )
			{
				dbg.location(67,46);
				// /home/frosqh/workspace/CompilTest/newGrammar.g:67:46: ^( 'if' expr block ( ^( 'else' block ) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(67,48);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				dbg.location(67,53);
				adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(67,58);
				adaptor.addChild(root_1, stream_block.nextTree());dbg.location(67,64);
				// /home/frosqh/workspace/CompilTest/newGrammar.g:67:64: ( ^( 'else' block ) )?
				if ( stream_39.hasNext()||stream_block.hasNext() ) {
					dbg.location(67,64);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:67:64: ^( 'else' block )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					dbg.location(67,66);
					root_2 = (CommonTree)adaptor.becomeRoot(stream_39.nextNode(), root_2);
					dbg.location(67,73);
					adaptor.addChild(root_2, stream_block.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_39.reset();
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
		dbg.location(67, 80);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "ifExpr"


	public static class binExpr1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr1"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:69:1: binExpr1 : binExpr2 ( EQUAL ^ binExpr2 )* ;
	public final newGrammarParser.binExpr1_return binExpr1() throws RecognitionException {
		newGrammarParser.binExpr1_return retval = new newGrammarParser.binExpr1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL85=null;
		ParserRuleReturnScope binExpr284 =null;
		ParserRuleReturnScope binExpr286 =null;

		CommonTree EQUAL85_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "binExpr1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:69:10: ( binExpr2 ( EQUAL ^ binExpr2 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:69:12: binExpr2 ( EQUAL ^ binExpr2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(69,12);
			pushFollow(FOLLOW_binExpr2_in_binExpr1576);
			binExpr284=binExpr2();
			state._fsp--;

			adaptor.addChild(root_0, binExpr284.getTree());
			dbg.location(69,21);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:69:21: ( EQUAL ^ binExpr2 )*
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( (LA18_0==EQUAL) ) {
					alt18=1;
				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:69:22: EQUAL ^ binExpr2
					{
					dbg.location(69,27);
					EQUAL85=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_binExpr1579); 
					EQUAL85_tree = (CommonTree)adaptor.create(EQUAL85);
					root_0 = (CommonTree)adaptor.becomeRoot(EQUAL85_tree, root_0);
					dbg.location(69,29);
					pushFollow(FOLLOW_binExpr2_in_binExpr1582);
					binExpr286=binExpr2();
					state._fsp--;

					adaptor.addChild(root_0, binExpr286.getTree());

					}
					break;

				default :
					break loop18;
				}
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
		dbg.location(69, 38);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "binExpr1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "binExpr1"


	public static class binExpr2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr2"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:71:1: binExpr2 : binExpr3 ( ORBOOL ^ binExpr3 )* ;
	public final newGrammarParser.binExpr2_return binExpr2() throws RecognitionException {
		newGrammarParser.binExpr2_return retval = new newGrammarParser.binExpr2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ORBOOL88=null;
		ParserRuleReturnScope binExpr387 =null;
		ParserRuleReturnScope binExpr389 =null;

		CommonTree ORBOOL88_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "binExpr2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:71:10: ( binExpr3 ( ORBOOL ^ binExpr3 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:71:12: binExpr3 ( ORBOOL ^ binExpr3 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(71,12);
			pushFollow(FOLLOW_binExpr3_in_binExpr2593);
			binExpr387=binExpr3();
			state._fsp--;

			adaptor.addChild(root_0, binExpr387.getTree());
			dbg.location(71,20);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:71:20: ( ORBOOL ^ binExpr3 )*
			try { dbg.enterSubRule(19);

			loop19:
			while (true) {
				int alt19=2;
				try { dbg.enterDecision(19, decisionCanBacktrack[19]);

				int LA19_0 = input.LA(1);
				if ( (LA19_0==ORBOOL) ) {
					alt19=1;
				}

				} finally {dbg.exitDecision(19);}

				switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:71:21: ORBOOL ^ binExpr3
					{
					dbg.location(71,27);
					ORBOOL88=(Token)match(input,ORBOOL,FOLLOW_ORBOOL_in_binExpr2595); 
					ORBOOL88_tree = (CommonTree)adaptor.create(ORBOOL88);
					root_0 = (CommonTree)adaptor.becomeRoot(ORBOOL88_tree, root_0);
					dbg.location(71,29);
					pushFollow(FOLLOW_binExpr3_in_binExpr2598);
					binExpr389=binExpr3();
					state._fsp--;

					adaptor.addChild(root_0, binExpr389.getTree());

					}
					break;

				default :
					break loop19;
				}
			}
			} finally {dbg.exitSubRule(19);}

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
		dbg.location(71, 38);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "binExpr2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "binExpr2"


	public static class binExpr3_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr3"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:73:1: binExpr3 : binExpr4 ( ANDBOOL ^ binExpr4 )* ;
	public final newGrammarParser.binExpr3_return binExpr3() throws RecognitionException {
		newGrammarParser.binExpr3_return retval = new newGrammarParser.binExpr3_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANDBOOL91=null;
		ParserRuleReturnScope binExpr490 =null;
		ParserRuleReturnScope binExpr492 =null;

		CommonTree ANDBOOL91_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "binExpr3");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:73:10: ( binExpr4 ( ANDBOOL ^ binExpr4 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:73:12: binExpr4 ( ANDBOOL ^ binExpr4 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(73,12);
			pushFollow(FOLLOW_binExpr4_in_binExpr3609);
			binExpr490=binExpr4();
			state._fsp--;

			adaptor.addChild(root_0, binExpr490.getTree());
			dbg.location(73,20);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:73:20: ( ANDBOOL ^ binExpr4 )*
			try { dbg.enterSubRule(20);

			loop20:
			while (true) {
				int alt20=2;
				try { dbg.enterDecision(20, decisionCanBacktrack[20]);

				int LA20_0 = input.LA(1);
				if ( (LA20_0==ANDBOOL) ) {
					alt20=1;
				}

				} finally {dbg.exitDecision(20);}

				switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:73:21: ANDBOOL ^ binExpr4
					{
					dbg.location(73,28);
					ANDBOOL91=(Token)match(input,ANDBOOL,FOLLOW_ANDBOOL_in_binExpr3611); 
					ANDBOOL91_tree = (CommonTree)adaptor.create(ANDBOOL91);
					root_0 = (CommonTree)adaptor.becomeRoot(ANDBOOL91_tree, root_0);
					dbg.location(73,30);
					pushFollow(FOLLOW_binExpr4_in_binExpr3614);
					binExpr492=binExpr4();
					state._fsp--;

					adaptor.addChild(root_0, binExpr492.getTree());

					}
					break;

				default :
					break loop20;
				}
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
		dbg.location(73, 39);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "binExpr3");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "binExpr3"


	public static class binExpr4_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr4"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:75:1: binExpr4 : binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )* ;
	public final newGrammarParser.binExpr4_return binExpr4() throws RecognitionException {
		newGrammarParser.binExpr4_return retval = new newGrammarParser.binExpr4_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PREV94=null;
		Token OPBOOLEQ95=null;
		Token NEXT96=null;
		ParserRuleReturnScope binExpr593 =null;
		ParserRuleReturnScope binExpr597 =null;

		CommonTree PREV94_tree=null;
		CommonTree OPBOOLEQ95_tree=null;
		CommonTree NEXT96_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "binExpr4");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(75, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:75:10: ( binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:75:12: binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(75,12);
			pushFollow(FOLLOW_binExpr5_in_binExpr4625);
			binExpr593=binExpr5();
			state._fsp--;

			adaptor.addChild(root_0, binExpr593.getTree());
			dbg.location(75,20);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:75:20: ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )*
			try { dbg.enterSubRule(22);

			loop22:
			while (true) {
				int alt22=2;
				try { dbg.enterDecision(22, decisionCanBacktrack[22]);

				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= NEXT && LA22_0 <= OPBOOLEQ)||LA22_0==PREV) ) {
					alt22=1;
				}

				} finally {dbg.exitDecision(22);}

				switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:75:21: ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5
					{
					dbg.location(75,21);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:75:21: ( PREV ^| OPBOOLEQ ^| NEXT ^)
					int alt21=3;
					try { dbg.enterSubRule(21);
					try { dbg.enterDecision(21, decisionCanBacktrack[21]);

					switch ( input.LA(1) ) {
					case PREV:
						{
						alt21=1;
						}
						break;
					case OPBOOLEQ:
						{
						alt21=2;
						}
						break;
					case NEXT:
						{
						alt21=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(21);}

					switch (alt21) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:75:22: PREV ^
							{
							dbg.location(75,26);
							PREV94=(Token)match(input,PREV,FOLLOW_PREV_in_binExpr4628); 
							PREV94_tree = (CommonTree)adaptor.create(PREV94);
							root_0 = (CommonTree)adaptor.becomeRoot(PREV94_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:75:28: OPBOOLEQ ^
							{
							dbg.location(75,36);
							OPBOOLEQ95=(Token)match(input,OPBOOLEQ,FOLLOW_OPBOOLEQ_in_binExpr4631); 
							OPBOOLEQ95_tree = (CommonTree)adaptor.create(OPBOOLEQ95);
							root_0 = (CommonTree)adaptor.becomeRoot(OPBOOLEQ95_tree, root_0);

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:75:38: NEXT ^
							{
							dbg.location(75,42);
							NEXT96=(Token)match(input,NEXT,FOLLOW_NEXT_in_binExpr4634); 
							NEXT96_tree = (CommonTree)adaptor.create(NEXT96);
							root_0 = (CommonTree)adaptor.becomeRoot(NEXT96_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(21);}
					dbg.location(75,45);
					pushFollow(FOLLOW_binExpr5_in_binExpr4638);
					binExpr597=binExpr5();
					state._fsp--;

					adaptor.addChild(root_0, binExpr597.getTree());

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
		dbg.location(75, 54);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "binExpr4");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "binExpr4"


	public static class binExpr5_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr5"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:77:1: binExpr5 : binExpr6 ( ADDSUB ^ binExpr6 )* ;
	public final newGrammarParser.binExpr5_return binExpr5() throws RecognitionException {
		newGrammarParser.binExpr5_return retval = new newGrammarParser.binExpr5_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ADDSUB99=null;
		ParserRuleReturnScope binExpr698 =null;
		ParserRuleReturnScope binExpr6100 =null;

		CommonTree ADDSUB99_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "binExpr5");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(77, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:77:10: ( binExpr6 ( ADDSUB ^ binExpr6 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:77:12: binExpr6 ( ADDSUB ^ binExpr6 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(77,12);
			pushFollow(FOLLOW_binExpr6_in_binExpr5649);
			binExpr698=binExpr6();
			state._fsp--;

			adaptor.addChild(root_0, binExpr698.getTree());
			dbg.location(77,20);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:77:20: ( ADDSUB ^ binExpr6 )*
			try { dbg.enterSubRule(23);

			loop23:
			while (true) {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				int LA23_0 = input.LA(1);
				if ( (LA23_0==ADDSUB) ) {
					alt23=1;
				}

				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:77:21: ADDSUB ^ binExpr6
					{
					dbg.location(77,27);
					ADDSUB99=(Token)match(input,ADDSUB,FOLLOW_ADDSUB_in_binExpr5651); 
					ADDSUB99_tree = (CommonTree)adaptor.create(ADDSUB99);
					root_0 = (CommonTree)adaptor.becomeRoot(ADDSUB99_tree, root_0);
					dbg.location(77,29);
					pushFollow(FOLLOW_binExpr6_in_binExpr5654);
					binExpr6100=binExpr6();
					state._fsp--;

					adaptor.addChild(root_0, binExpr6100.getTree());

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
		dbg.location(77, 38);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "binExpr5");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "binExpr5"


	public static class binExpr6_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr6"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:79:1: binExpr6 : unExpr ( ( STAR ^| DIV ^) unExpr )* ;
	public final newGrammarParser.binExpr6_return binExpr6() throws RecognitionException {
		newGrammarParser.binExpr6_return retval = new newGrammarParser.binExpr6_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR102=null;
		Token DIV103=null;
		ParserRuleReturnScope unExpr101 =null;
		ParserRuleReturnScope unExpr104 =null;

		CommonTree STAR102_tree=null;
		CommonTree DIV103_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "binExpr6");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:79:10: ( unExpr ( ( STAR ^| DIV ^) unExpr )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:79:12: unExpr ( ( STAR ^| DIV ^) unExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(79,12);
			pushFollow(FOLLOW_unExpr_in_binExpr6665);
			unExpr101=unExpr();
			state._fsp--;

			adaptor.addChild(root_0, unExpr101.getTree());
			dbg.location(79,19);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:79:19: ( ( STAR ^| DIV ^) unExpr )*
			try { dbg.enterSubRule(25);

			loop25:
			while (true) {
				int alt25=2;
				try { dbg.enterDecision(25, decisionCanBacktrack[25]);

				int LA25_0 = input.LA(1);
				if ( (LA25_0==DIV||LA25_0==STAR) ) {
					alt25=1;
				}

				} finally {dbg.exitDecision(25);}

				switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:79:20: ( STAR ^| DIV ^) unExpr
					{
					dbg.location(79,20);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:79:20: ( STAR ^| DIV ^)
					int alt24=2;
					try { dbg.enterSubRule(24);
					try { dbg.enterDecision(24, decisionCanBacktrack[24]);

					int LA24_0 = input.LA(1);
					if ( (LA24_0==STAR) ) {
						alt24=1;
					}
					else if ( (LA24_0==DIV) ) {
						alt24=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(24);}

					switch (alt24) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:79:21: STAR ^
							{
							dbg.location(79,25);
							STAR102=(Token)match(input,STAR,FOLLOW_STAR_in_binExpr6669); 
							STAR102_tree = (CommonTree)adaptor.create(STAR102);
							root_0 = (CommonTree)adaptor.becomeRoot(STAR102_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:79:27: DIV ^
							{
							dbg.location(79,30);
							DIV103=(Token)match(input,DIV,FOLLOW_DIV_in_binExpr6672); 
							DIV103_tree = (CommonTree)adaptor.create(DIV103);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV103_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(24);}
					dbg.location(79,33);
					pushFollow(FOLLOW_unExpr_in_binExpr6676);
					unExpr104=unExpr();
					state._fsp--;

					adaptor.addChild(root_0, unExpr104.getTree());

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
		dbg.location(79, 40);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "binExpr6");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "binExpr6"


	public static class vectExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "vectExpr"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:81:1: vectExpr : starExpr ( '[' ^ expr ']' !)? ;
	public final newGrammarParser.vectExpr_return vectExpr() throws RecognitionException {
		newGrammarParser.vectExpr_return retval = new newGrammarParser.vectExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal106=null;
		Token char_literal108=null;
		ParserRuleReturnScope starExpr105 =null;
		ParserRuleReturnScope expr107 =null;

		CommonTree char_literal106_tree=null;
		CommonTree char_literal108_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "vectExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(81, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:81:10: ( starExpr ( '[' ^ expr ']' !)? )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:81:12: starExpr ( '[' ^ expr ']' !)?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(81,12);
			pushFollow(FOLLOW_starExpr_in_vectExpr687);
			starExpr105=starExpr();
			state._fsp--;

			adaptor.addChild(root_0, starExpr105.getTree());
			dbg.location(81,21);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:81:21: ( '[' ^ expr ']' !)?
			int alt26=2;
			try { dbg.enterSubRule(26);
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			int LA26_0 = input.LA(1);
			if ( (LA26_0==36) ) {
				alt26=1;
			}
			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:81:22: '[' ^ expr ']' !
					{
					dbg.location(81,25);
					char_literal106=(Token)match(input,36,FOLLOW_36_in_vectExpr690); 
					char_literal106_tree = (CommonTree)adaptor.create(char_literal106);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal106_tree, root_0);
					dbg.location(81,27);
					pushFollow(FOLLOW_expr_in_vectExpr693);
					expr107=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr107.getTree());
					dbg.location(81,35);
					char_literal108=(Token)match(input,37,FOLLOW_37_in_vectExpr695); 
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
		dbg.location(81, 37);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vectExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "vectExpr"


	public static class starExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "starExpr"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:83:1: starExpr : ( STAR ^)? moinsExpr ;
	public final newGrammarParser.starExpr_return starExpr() throws RecognitionException {
		newGrammarParser.starExpr_return retval = new newGrammarParser.starExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR109=null;
		ParserRuleReturnScope moinsExpr110 =null;

		CommonTree STAR109_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "starExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(83, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:84:2: ( ( STAR ^)? moinsExpr )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:84:5: ( STAR ^)? moinsExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(84,9);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:84:9: ( STAR ^)?
			int alt27=2;
			try { dbg.enterSubRule(27);
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			int LA27_0 = input.LA(1);
			if ( (LA27_0==STAR) ) {
				alt27=1;
			}
			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:84:9: STAR ^
					{
					dbg.location(84,9);
					STAR109=(Token)match(input,STAR,FOLLOW_STAR_in_starExpr709); 
					STAR109_tree = (CommonTree)adaptor.create(STAR109);
					root_0 = (CommonTree)adaptor.becomeRoot(STAR109_tree, root_0);

					}
					break;

			}
			} finally {dbg.exitSubRule(27);}
			dbg.location(84,12);
			pushFollow(FOLLOW_moinsExpr_in_starExpr713);
			moinsExpr110=moinsExpr();
			state._fsp--;

			adaptor.addChild(root_0, moinsExpr110.getTree());

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
		dbg.location(84, 20);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "starExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "starExpr"


	public static class moinsExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "moinsExpr"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:86:1: moinsExpr : ( '-' ^)? atom ;
	public final newGrammarParser.moinsExpr_return moinsExpr() throws RecognitionException {
		newGrammarParser.moinsExpr_return retval = new newGrammarParser.moinsExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal111=null;
		ParserRuleReturnScope atom112 =null;

		CommonTree char_literal111_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "moinsExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:87:2: ( ( '-' ^)? atom )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:87:5: ( '-' ^)? atom
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(87,8);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:87:8: ( '-' ^)?
			int alt28=2;
			try { dbg.enterSubRule(28);
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==31) ) {
				alt28=1;
			}
			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:87:8: '-' ^
					{
					dbg.location(87,8);
					char_literal111=(Token)match(input,31,FOLLOW_31_in_moinsExpr725); 
					char_literal111_tree = (CommonTree)adaptor.create(char_literal111);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal111_tree, root_0);

					}
					break;

			}
			} finally {dbg.exitSubRule(28);}
			dbg.location(87,10);
			pushFollow(FOLLOW_atom_in_moinsExpr728);
			atom112=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom112.getTree());

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
		dbg.location(87, 13);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "moinsExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "moinsExpr"


	public static class dotExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dotExpr"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:90:1: dotExpr : vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? ;
	public final newGrammarParser.dotExpr_return dotExpr() throws RecognitionException {
		newGrammarParser.dotExpr_return retval = new newGrammarParser.dotExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal114=null;
		Token IDF115=null;
		Token string_literal116=null;
		Token char_literal117=null;
		Token char_literal118=null;
		ParserRuleReturnScope vectExpr113 =null;

		CommonTree char_literal114_tree=null;
		CommonTree IDF115_tree=null;
		CommonTree string_literal116_tree=null;
		CommonTree char_literal117_tree=null;
		CommonTree char_literal118_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "dotExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(90, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:90:9: ( vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:90:11: vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(90,11);
			pushFollow(FOLLOW_vectExpr_in_dotExpr737);
			vectExpr113=vectExpr();
			state._fsp--;

			adaptor.addChild(root_0, vectExpr113.getTree());
			dbg.location(90,20);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:90:20: ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			int alt30=2;
			try { dbg.enterSubRule(30);
			try { dbg.enterDecision(30, decisionCanBacktrack[30]);

			int LA30_0 = input.LA(1);
			if ( (LA30_0==33) ) {
				alt30=1;
			}
			} finally {dbg.exitDecision(30);}

			switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:90:21: '.' ^ ( IDF | 'len' '(' ! ')' !)
					{
					dbg.location(90,24);
					char_literal114=(Token)match(input,33,FOLLOW_33_in_dotExpr740); 
					char_literal114_tree = (CommonTree)adaptor.create(char_literal114);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal114_tree, root_0);
					dbg.location(90,26);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:90:26: ( IDF | 'len' '(' ! ')' !)
					int alt29=2;
					try { dbg.enterSubRule(29);
					try { dbg.enterDecision(29, decisionCanBacktrack[29]);

					int LA29_0 = input.LA(1);
					if ( (LA29_0==IDF) ) {
						alt29=1;
					}
					else if ( (LA29_0==41) ) {
						alt29=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(29);}

					switch (alt29) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:90:27: IDF
							{
							dbg.location(90,27);
							IDF115=(Token)match(input,IDF,FOLLOW_IDF_in_dotExpr744); 
							IDF115_tree = (CommonTree)adaptor.create(IDF115);
							adaptor.addChild(root_0, IDF115_tree);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:90:33: 'len' '(' ! ')' !
							{
							dbg.location(90,33);
							string_literal116=(Token)match(input,41,FOLLOW_41_in_dotExpr748); 
							string_literal116_tree = (CommonTree)adaptor.create(string_literal116);
							adaptor.addChild(root_0, string_literal116_tree);
							dbg.location(90,42);
							char_literal117=(Token)match(input,28,FOLLOW_28_in_dotExpr750); dbg.location(90,46);
							char_literal118=(Token)match(input,29,FOLLOW_29_in_dotExpr752); 
							}
							break;

					}
					} finally {dbg.exitSubRule(29);}

					}
					break;

			}
			} finally {dbg.exitSubRule(30);}

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
		dbg.location(90, 50);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:92:1: unExpr : ( UNAIRE ^| EPERLU ^)? dotExpr ;
	public final newGrammarParser.unExpr_return unExpr() throws RecognitionException {
		newGrammarParser.unExpr_return retval = new newGrammarParser.unExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAIRE119=null;
		Token EPERLU120=null;
		ParserRuleReturnScope dotExpr121 =null;

		CommonTree UNAIRE119_tree=null;
		CommonTree EPERLU120_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "unExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(92, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:92:8: ( ( UNAIRE ^| EPERLU ^)? dotExpr )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:92:10: ( UNAIRE ^| EPERLU ^)? dotExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(92,10);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:92:10: ( UNAIRE ^| EPERLU ^)?
			int alt31=3;
			try { dbg.enterSubRule(31);
			try { dbg.enterDecision(31, decisionCanBacktrack[31]);

			int LA31_0 = input.LA(1);
			if ( (LA31_0==UNAIRE) ) {
				alt31=1;
			}
			else if ( (LA31_0==EPERLU) ) {
				alt31=2;
			}
			} finally {dbg.exitDecision(31);}

			switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:92:11: UNAIRE ^
					{
					dbg.location(92,17);
					UNAIRE119=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_unExpr766); 
					UNAIRE119_tree = (CommonTree)adaptor.create(UNAIRE119);
					root_0 = (CommonTree)adaptor.becomeRoot(UNAIRE119_tree, root_0);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:92:19: EPERLU ^
					{
					dbg.location(92,25);
					EPERLU120=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_unExpr769); 
					EPERLU120_tree = (CommonTree)adaptor.create(EPERLU120);
					root_0 = (CommonTree)adaptor.becomeRoot(EPERLU120_tree, root_0);

					}
					break;

			}
			} finally {dbg.exitSubRule(31);}
			dbg.location(92,29);
			pushFollow(FOLLOW_dotExpr_in_unExpr774);
			dotExpr121=dotExpr();
			state._fsp--;

			adaptor.addChild(root_0, dotExpr121.getTree());

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
		dbg.location(92, 35);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:94:1: atom : ( INT | BOOL | IDF ^ ( ( callFun ) )? | '(' expr ')' -> expr );
	public final newGrammarParser.atom_return atom() throws RecognitionException {
		newGrammarParser.atom_return retval = new newGrammarParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT122=null;
		Token BOOL123=null;
		Token IDF124=null;
		Token char_literal126=null;
		Token char_literal128=null;
		ParserRuleReturnScope callFun125 =null;
		ParserRuleReturnScope expr127 =null;

		CommonTree INT122_tree=null;
		CommonTree BOOL123_tree=null;
		CommonTree IDF124_tree=null;
		CommonTree char_literal126_tree=null;
		CommonTree char_literal128_tree=null;
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(94, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:94:6: ( INT | BOOL | IDF ^ ( ( callFun ) )? | '(' expr ')' -> expr )
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
			case 28:
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

					// /home/frosqh/workspace/CompilTest/newGrammar.g:94:8: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(94,8);
					INT122=(Token)match(input,INT,FOLLOW_INT_in_atom782); 
					INT122_tree = (CommonTree)adaptor.create(INT122);
					adaptor.addChild(root_0, INT122_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:95:3: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(95,3);
					BOOL123=(Token)match(input,BOOL,FOLLOW_BOOL_in_atom785); 
					BOOL123_tree = (CommonTree)adaptor.create(BOOL123);
					adaptor.addChild(root_0, BOOL123_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:96:4: IDF ^ ( ( callFun ) )?
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(96,7);
					IDF124=(Token)match(input,IDF,FOLLOW_IDF_in_atom790); 
					IDF124_tree = (CommonTree)adaptor.create(IDF124);
					root_0 = (CommonTree)adaptor.becomeRoot(IDF124_tree, root_0);
					dbg.location(96,9);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:96:9: ( ( callFun ) )?
					int alt32=2;
					try { dbg.enterSubRule(32);
					try { dbg.enterDecision(32, decisionCanBacktrack[32]);

					int LA32_0 = input.LA(1);
					if ( (LA32_0==28) ) {
						alt32=1;
					}
					} finally {dbg.exitDecision(32);}

					switch (alt32) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:96:10: ( callFun )
							{
							dbg.location(96,10);
							// /home/frosqh/workspace/CompilTest/newGrammar.g:96:10: ( callFun )
							dbg.enterAlt(1);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:96:11: callFun
							{
							dbg.location(96,11);
							pushFollow(FOLLOW_callFun_in_atom795);
							callFun125=callFun();
							state._fsp--;

							adaptor.addChild(root_0, callFun125.getTree());

							}

							}
							break;

					}
					} finally {dbg.exitSubRule(32);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:97:3: '(' expr ')'
					{
					dbg.location(97,3);
					char_literal126=(Token)match(input,28,FOLLOW_28_in_atom801);  
					stream_28.add(char_literal126);
					dbg.location(97,6);
					pushFollow(FOLLOW_expr_in_atom802);
					expr127=expr();
					state._fsp--;

					stream_expr.add(expr127.getTree());dbg.location(97,10);
					char_literal128=(Token)match(input,29,FOLLOW_29_in_atom803);  
					stream_29.add(char_literal128);

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
					// 97:13: -> expr
					{
						dbg.location(97,16);
						adaptor.addChild(root_0, stream_expr.nextTree());
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
		dbg.location(97, 19);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:99:1: expr : ( 'vec' '!' '[' expr ']' -> ^( 'vec' expr ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block | binExpr1 );
	public final newGrammarParser.expr_return expr() throws RecognitionException {
		newGrammarParser.expr_return retval = new newGrammarParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal129=null;
		Token char_literal130=null;
		Token char_literal131=null;
		Token char_literal133=null;
		Token string_literal134=null;
		Token char_literal135=null;
		Token char_literal136=null;
		Token char_literal138=null;
		ParserRuleReturnScope expr132 =null;
		ParserRuleReturnScope expr137 =null;
		ParserRuleReturnScope block139 =null;
		ParserRuleReturnScope binExpr1140 =null;

		CommonTree string_literal129_tree=null;
		CommonTree char_literal130_tree=null;
		CommonTree char_literal131_tree=null;
		CommonTree char_literal133_tree=null;
		CommonTree string_literal134_tree=null;
		CommonTree char_literal135_tree=null;
		CommonTree char_literal136_tree=null;
		CommonTree char_literal138_tree=null;
		RewriteRuleTokenStream stream_UNAIRE=new RewriteRuleTokenStream(adaptor,"token UNAIRE");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(99, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:99:6: ( 'vec' '!' '[' expr ']' -> ^( 'vec' expr ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block | binExpr1 )
			int alt34=4;
			try { dbg.enterDecision(34, decisionCanBacktrack[34]);

			switch ( input.LA(1) ) {
			case 48:
				{
				alt34=1;
				}
				break;
			case 45:
				{
				alt34=2;
				}
				break;
			case 50:
				{
				alt34=3;
				}
				break;
			case BOOL:
			case EPERLU:
			case IDF:
			case INT:
			case STAR:
			case UNAIRE:
			case 28:
			case 31:
				{
				alt34=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(34);}

			switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:99:8: 'vec' '!' '[' expr ']'
					{
					dbg.location(99,8);
					string_literal129=(Token)match(input,48,FOLLOW_48_in_expr815);  
					stream_48.add(string_literal129);
					dbg.location(99,14);
					char_literal130=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_expr817);  
					stream_UNAIRE.add(char_literal130);
					dbg.location(99,18);
					char_literal131=(Token)match(input,36,FOLLOW_36_in_expr819);  
					stream_36.add(char_literal131);
					dbg.location(99,22);
					pushFollow(FOLLOW_expr_in_expr821);
					expr132=expr();
					state._fsp--;

					stream_expr.add(expr132.getTree());dbg.location(99,27);
					char_literal133=(Token)match(input,37,FOLLOW_37_in_expr823);  
					stream_37.add(char_literal133);

					// AST REWRITE
					// elements: expr, 48
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 99:31: -> ^( 'vec' expr )
					{
						dbg.location(99,34);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:99:34: ^( 'vec' expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(99,36);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_48.nextNode(), root_1);
						dbg.location(99,42);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:100:3: 'print' '!' '(' expr ')'
					{
					dbg.location(100,3);
					string_literal134=(Token)match(input,45,FOLLOW_45_in_expr835);  
					stream_45.add(string_literal134);
					dbg.location(100,11);
					char_literal135=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_expr837);  
					stream_UNAIRE.add(char_literal135);
					dbg.location(100,15);
					char_literal136=(Token)match(input,28,FOLLOW_28_in_expr839);  
					stream_28.add(char_literal136);
					dbg.location(100,19);
					pushFollow(FOLLOW_expr_in_expr841);
					expr137=expr();
					state._fsp--;

					stream_expr.add(expr137.getTree());dbg.location(100,24);
					char_literal138=(Token)match(input,29,FOLLOW_29_in_expr843);  
					stream_29.add(char_literal138);

					// AST REWRITE
					// elements: 45, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 100:28: -> ^( 'print' expr )
					{
						dbg.location(100,31);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:100:31: ^( 'print' expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(100,33);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_45.nextNode(), root_1);
						dbg.location(100,41);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:101:3: block
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(101,3);
					pushFollow(FOLLOW_block_in_expr854);
					block139=block();
					state._fsp--;

					adaptor.addChild(root_0, block139.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:102:3: binExpr1
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(102,3);
					pushFollow(FOLLOW_binExpr1_in_expr858);
					binExpr1140=binExpr1();
					state._fsp--;

					adaptor.addChild(root_0, binExpr1140.getTree());

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
		dbg.location(102, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expr"


	public static class bigbinExpr1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr1"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:105:1: bigbinExpr1 : bigbinExpr2 ( EQUAL ^ bigbinExpr2 )* ;
	public final newGrammarParser.bigbinExpr1_return bigbinExpr1() throws RecognitionException {
		newGrammarParser.bigbinExpr1_return retval = new newGrammarParser.bigbinExpr1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL142=null;
		ParserRuleReturnScope bigbinExpr2141 =null;
		ParserRuleReturnScope bigbinExpr2143 =null;

		CommonTree EQUAL142_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(105, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:105:13: ( bigbinExpr2 ( EQUAL ^ bigbinExpr2 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:105:15: bigbinExpr2 ( EQUAL ^ bigbinExpr2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(105,15);
			pushFollow(FOLLOW_bigbinExpr2_in_bigbinExpr1867);
			bigbinExpr2141=bigbinExpr2();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr2141.getTree());
			dbg.location(105,27);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:105:27: ( EQUAL ^ bigbinExpr2 )*
			try { dbg.enterSubRule(35);

			loop35:
			while (true) {
				int alt35=2;
				try { dbg.enterDecision(35, decisionCanBacktrack[35]);

				int LA35_0 = input.LA(1);
				if ( (LA35_0==EQUAL) ) {
					alt35=1;
				}

				} finally {dbg.exitDecision(35);}

				switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:105:28: EQUAL ^ bigbinExpr2
					{
					dbg.location(105,33);
					EQUAL142=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_bigbinExpr1870); 
					EQUAL142_tree = (CommonTree)adaptor.create(EQUAL142);
					root_0 = (CommonTree)adaptor.becomeRoot(EQUAL142_tree, root_0);
					dbg.location(105,35);
					pushFollow(FOLLOW_bigbinExpr2_in_bigbinExpr1873);
					bigbinExpr2143=bigbinExpr2();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr2143.getTree());

					}
					break;

				default :
					break loop35;
				}
			}
			} finally {dbg.exitSubRule(35);}

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
		dbg.location(105, 47);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigbinExpr1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigbinExpr1"


	public static class bigbinExpr2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr2"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:107:1: bigbinExpr2 : bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )* ;
	public final newGrammarParser.bigbinExpr2_return bigbinExpr2() throws RecognitionException {
		newGrammarParser.bigbinExpr2_return retval = new newGrammarParser.bigbinExpr2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ORBOOL145=null;
		ParserRuleReturnScope bigbinExpr3144 =null;
		ParserRuleReturnScope bigbinExpr3146 =null;

		CommonTree ORBOOL145_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(107, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:107:13: ( bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:107:15: bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(107,15);
			pushFollow(FOLLOW_bigbinExpr3_in_bigbinExpr2884);
			bigbinExpr3144=bigbinExpr3();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr3144.getTree());
			dbg.location(107,26);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:107:26: ( ORBOOL ^ bigbinExpr3 )*
			try { dbg.enterSubRule(36);

			loop36:
			while (true) {
				int alt36=2;
				try { dbg.enterDecision(36, decisionCanBacktrack[36]);

				int LA36_0 = input.LA(1);
				if ( (LA36_0==ORBOOL) ) {
					alt36=1;
				}

				} finally {dbg.exitDecision(36);}

				switch (alt36) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:107:27: ORBOOL ^ bigbinExpr3
					{
					dbg.location(107,33);
					ORBOOL145=(Token)match(input,ORBOOL,FOLLOW_ORBOOL_in_bigbinExpr2886); 
					ORBOOL145_tree = (CommonTree)adaptor.create(ORBOOL145);
					root_0 = (CommonTree)adaptor.becomeRoot(ORBOOL145_tree, root_0);
					dbg.location(107,35);
					pushFollow(FOLLOW_bigbinExpr3_in_bigbinExpr2889);
					bigbinExpr3146=bigbinExpr3();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr3146.getTree());

					}
					break;

				default :
					break loop36;
				}
			}
			} finally {dbg.exitSubRule(36);}

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
		dbg.location(107, 47);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigbinExpr2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigbinExpr2"


	public static class bigbinExpr3_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr3"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:109:1: bigbinExpr3 : bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )* ;
	public final newGrammarParser.bigbinExpr3_return bigbinExpr3() throws RecognitionException {
		newGrammarParser.bigbinExpr3_return retval = new newGrammarParser.bigbinExpr3_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANDBOOL148=null;
		ParserRuleReturnScope bigbinExpr4147 =null;
		ParserRuleReturnScope bigbinExpr4149 =null;

		CommonTree ANDBOOL148_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr3");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(109, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:109:13: ( bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:109:15: bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(109,15);
			pushFollow(FOLLOW_bigbinExpr4_in_bigbinExpr3900);
			bigbinExpr4147=bigbinExpr4();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr4147.getTree());
			dbg.location(109,26);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:109:26: ( ANDBOOL ^ bigbinExpr4 )*
			try { dbg.enterSubRule(37);

			loop37:
			while (true) {
				int alt37=2;
				try { dbg.enterDecision(37, decisionCanBacktrack[37]);

				int LA37_0 = input.LA(1);
				if ( (LA37_0==ANDBOOL) ) {
					alt37=1;
				}

				} finally {dbg.exitDecision(37);}

				switch (alt37) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:109:27: ANDBOOL ^ bigbinExpr4
					{
					dbg.location(109,34);
					ANDBOOL148=(Token)match(input,ANDBOOL,FOLLOW_ANDBOOL_in_bigbinExpr3902); 
					ANDBOOL148_tree = (CommonTree)adaptor.create(ANDBOOL148);
					root_0 = (CommonTree)adaptor.becomeRoot(ANDBOOL148_tree, root_0);
					dbg.location(109,36);
					pushFollow(FOLLOW_bigbinExpr4_in_bigbinExpr3905);
					bigbinExpr4149=bigbinExpr4();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr4149.getTree());

					}
					break;

				default :
					break loop37;
				}
			}
			} finally {dbg.exitSubRule(37);}

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
		dbg.location(109, 48);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigbinExpr3");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigbinExpr3"


	public static class bigbinExpr4_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr4"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:111:1: bigbinExpr4 : bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )* ;
	public final newGrammarParser.bigbinExpr4_return bigbinExpr4() throws RecognitionException {
		newGrammarParser.bigbinExpr4_return retval = new newGrammarParser.bigbinExpr4_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PREV151=null;
		Token OPBOOLEQ152=null;
		Token NEXT153=null;
		ParserRuleReturnScope bigbinExpr5150 =null;
		ParserRuleReturnScope bigbinExpr5154 =null;

		CommonTree PREV151_tree=null;
		CommonTree OPBOOLEQ152_tree=null;
		CommonTree NEXT153_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr4");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(111, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:111:13: ( bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:111:15: bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(111,15);
			pushFollow(FOLLOW_bigbinExpr5_in_bigbinExpr4916);
			bigbinExpr5150=bigbinExpr5();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr5150.getTree());
			dbg.location(111,26);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:111:26: ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )*
			try { dbg.enterSubRule(39);

			loop39:
			while (true) {
				int alt39=2;
				try { dbg.enterDecision(39, decisionCanBacktrack[39]);

				int LA39_0 = input.LA(1);
				if ( ((LA39_0 >= NEXT && LA39_0 <= OPBOOLEQ)||LA39_0==PREV) ) {
					alt39=1;
				}

				} finally {dbg.exitDecision(39);}

				switch (alt39) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:111:27: ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5
					{
					dbg.location(111,27);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:111:27: ( PREV ^| OPBOOLEQ ^| NEXT ^)
					int alt38=3;
					try { dbg.enterSubRule(38);
					try { dbg.enterDecision(38, decisionCanBacktrack[38]);

					switch ( input.LA(1) ) {
					case PREV:
						{
						alt38=1;
						}
						break;
					case OPBOOLEQ:
						{
						alt38=2;
						}
						break;
					case NEXT:
						{
						alt38=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 38, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(38);}

					switch (alt38) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:111:28: PREV ^
							{
							dbg.location(111,32);
							PREV151=(Token)match(input,PREV,FOLLOW_PREV_in_bigbinExpr4919); 
							PREV151_tree = (CommonTree)adaptor.create(PREV151);
							root_0 = (CommonTree)adaptor.becomeRoot(PREV151_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:111:34: OPBOOLEQ ^
							{
							dbg.location(111,42);
							OPBOOLEQ152=(Token)match(input,OPBOOLEQ,FOLLOW_OPBOOLEQ_in_bigbinExpr4922); 
							OPBOOLEQ152_tree = (CommonTree)adaptor.create(OPBOOLEQ152);
							root_0 = (CommonTree)adaptor.becomeRoot(OPBOOLEQ152_tree, root_0);

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:111:44: NEXT ^
							{
							dbg.location(111,48);
							NEXT153=(Token)match(input,NEXT,FOLLOW_NEXT_in_bigbinExpr4925); 
							NEXT153_tree = (CommonTree)adaptor.create(NEXT153);
							root_0 = (CommonTree)adaptor.becomeRoot(NEXT153_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(38);}
					dbg.location(111,51);
					pushFollow(FOLLOW_bigbinExpr5_in_bigbinExpr4929);
					bigbinExpr5154=bigbinExpr5();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr5154.getTree());

					}
					break;

				default :
					break loop39;
				}
			}
			} finally {dbg.exitSubRule(39);}

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
		dbg.location(111, 63);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigbinExpr4");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigbinExpr4"


	public static class bigbinExpr5_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr5"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:113:1: bigbinExpr5 : bigbinExpr6 ( ADDSUB ^ bigbinExpr6 )* ;
	public final newGrammarParser.bigbinExpr5_return bigbinExpr5() throws RecognitionException {
		newGrammarParser.bigbinExpr5_return retval = new newGrammarParser.bigbinExpr5_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ADDSUB156=null;
		ParserRuleReturnScope bigbinExpr6155 =null;
		ParserRuleReturnScope bigbinExpr6157 =null;

		CommonTree ADDSUB156_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr5");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(113, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:113:13: ( bigbinExpr6 ( ADDSUB ^ bigbinExpr6 )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:113:15: bigbinExpr6 ( ADDSUB ^ bigbinExpr6 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(113,15);
			pushFollow(FOLLOW_bigbinExpr6_in_bigbinExpr5940);
			bigbinExpr6155=bigbinExpr6();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr6155.getTree());
			dbg.location(113,26);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:113:26: ( ADDSUB ^ bigbinExpr6 )*
			try { dbg.enterSubRule(40);

			loop40:
			while (true) {
				int alt40=2;
				try { dbg.enterDecision(40, decisionCanBacktrack[40]);

				int LA40_0 = input.LA(1);
				if ( (LA40_0==ADDSUB) ) {
					alt40=1;
				}

				} finally {dbg.exitDecision(40);}

				switch (alt40) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:113:27: ADDSUB ^ bigbinExpr6
					{
					dbg.location(113,33);
					ADDSUB156=(Token)match(input,ADDSUB,FOLLOW_ADDSUB_in_bigbinExpr5942); 
					ADDSUB156_tree = (CommonTree)adaptor.create(ADDSUB156);
					root_0 = (CommonTree)adaptor.becomeRoot(ADDSUB156_tree, root_0);
					dbg.location(113,35);
					pushFollow(FOLLOW_bigbinExpr6_in_bigbinExpr5945);
					bigbinExpr6157=bigbinExpr6();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr6157.getTree());

					}
					break;

				default :
					break loop40;
				}
			}
			} finally {dbg.exitSubRule(40);}

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
		dbg.location(113, 47);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigbinExpr5");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigbinExpr5"


	public static class bigbinExpr6_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr6"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:115:1: bigbinExpr6 : bigunExpr ( ( STAR ^| DIV ^) bigunExpr )* ;
	public final newGrammarParser.bigbinExpr6_return bigbinExpr6() throws RecognitionException {
		newGrammarParser.bigbinExpr6_return retval = new newGrammarParser.bigbinExpr6_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR159=null;
		Token DIV160=null;
		ParserRuleReturnScope bigunExpr158 =null;
		ParserRuleReturnScope bigunExpr161 =null;

		CommonTree STAR159_tree=null;
		CommonTree DIV160_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigbinExpr6");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(115, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:115:13: ( bigunExpr ( ( STAR ^| DIV ^) bigunExpr )* )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:115:15: bigunExpr ( ( STAR ^| DIV ^) bigunExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(115,15);
			pushFollow(FOLLOW_bigunExpr_in_bigbinExpr6956);
			bigunExpr158=bigunExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigunExpr158.getTree());
			dbg.location(115,25);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:115:25: ( ( STAR ^| DIV ^) bigunExpr )*
			try { dbg.enterSubRule(42);

			loop42:
			while (true) {
				int alt42=2;
				try { dbg.enterDecision(42, decisionCanBacktrack[42]);

				int LA42_0 = input.LA(1);
				if ( (LA42_0==DIV||LA42_0==STAR) ) {
					alt42=1;
				}

				} finally {dbg.exitDecision(42);}

				switch (alt42) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:115:26: ( STAR ^| DIV ^) bigunExpr
					{
					dbg.location(115,26);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:115:26: ( STAR ^| DIV ^)
					int alt41=2;
					try { dbg.enterSubRule(41);
					try { dbg.enterDecision(41, decisionCanBacktrack[41]);

					int LA41_0 = input.LA(1);
					if ( (LA41_0==STAR) ) {
						alt41=1;
					}
					else if ( (LA41_0==DIV) ) {
						alt41=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 41, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(41);}

					switch (alt41) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:115:27: STAR ^
							{
							dbg.location(115,31);
							STAR159=(Token)match(input,STAR,FOLLOW_STAR_in_bigbinExpr6960); 
							STAR159_tree = (CommonTree)adaptor.create(STAR159);
							root_0 = (CommonTree)adaptor.becomeRoot(STAR159_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:115:33: DIV ^
							{
							dbg.location(115,36);
							DIV160=(Token)match(input,DIV,FOLLOW_DIV_in_bigbinExpr6963); 
							DIV160_tree = (CommonTree)adaptor.create(DIV160);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV160_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(41);}
					dbg.location(115,39);
					pushFollow(FOLLOW_bigunExpr_in_bigbinExpr6967);
					bigunExpr161=bigunExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigunExpr161.getTree());

					}
					break;

				default :
					break loop42;
				}
			}
			} finally {dbg.exitSubRule(42);}

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
		dbg.location(115, 49);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bigbinExpr6");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bigbinExpr6"


	public static class bigvectExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigvectExpr"
	// /home/frosqh/workspace/CompilTest/newGrammar.g:117:1: bigvectExpr : bigatom ( '[' bigExpr ']' )? ;
	public final newGrammarParser.bigvectExpr_return bigvectExpr() throws RecognitionException {
		newGrammarParser.bigvectExpr_return retval = new newGrammarParser.bigvectExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal163=null;
		Token char_literal165=null;
		ParserRuleReturnScope bigatom162 =null;
		ParserRuleReturnScope bigExpr164 =null;

		CommonTree char_literal163_tree=null;
		CommonTree char_literal165_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigvectExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(117, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:117:13: ( bigatom ( '[' bigExpr ']' )? )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:117:15: bigatom ( '[' bigExpr ']' )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(117,15);
			pushFollow(FOLLOW_bigatom_in_bigvectExpr978);
			bigatom162=bigatom();
			state._fsp--;

			adaptor.addChild(root_0, bigatom162.getTree());
			dbg.location(117,23);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:117:23: ( '[' bigExpr ']' )?
			int alt43=2;
			try { dbg.enterSubRule(43);
			try { dbg.enterDecision(43, decisionCanBacktrack[43]);

			int LA43_0 = input.LA(1);
			if ( (LA43_0==36) ) {
				alt43=1;
			}
			} finally {dbg.exitDecision(43);}

			switch (alt43) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:117:24: '[' bigExpr ']'
					{
					dbg.location(117,24);
					char_literal163=(Token)match(input,36,FOLLOW_36_in_bigvectExpr981); 
					char_literal163_tree = (CommonTree)adaptor.create(char_literal163);
					adaptor.addChild(root_0, char_literal163_tree);
					dbg.location(117,28);
					pushFollow(FOLLOW_bigExpr_in_bigvectExpr983);
					bigExpr164=bigExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigExpr164.getTree());
					dbg.location(117,36);
					char_literal165=(Token)match(input,37,FOLLOW_37_in_bigvectExpr985); 
					char_literal165_tree = (CommonTree)adaptor.create(char_literal165);
					adaptor.addChild(root_0, char_literal165_tree);

					}
					break;

			}
			} finally {dbg.exitSubRule(43);}

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
		dbg.location(117, 40);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:119:1: bigdotExpr : bigvectExpr ( '.' ^ ( IDF | 'len' '(' ')' ) )? ;
	public final newGrammarParser.bigdotExpr_return bigdotExpr() throws RecognitionException {
		newGrammarParser.bigdotExpr_return retval = new newGrammarParser.bigdotExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal167=null;
		Token IDF168=null;
		Token string_literal169=null;
		Token char_literal170=null;
		Token char_literal171=null;
		ParserRuleReturnScope bigvectExpr166 =null;

		CommonTree char_literal167_tree=null;
		CommonTree IDF168_tree=null;
		CommonTree string_literal169_tree=null;
		CommonTree char_literal170_tree=null;
		CommonTree char_literal171_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigdotExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(119, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:119:12: ( bigvectExpr ( '.' ^ ( IDF | 'len' '(' ')' ) )? )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:119:14: bigvectExpr ( '.' ^ ( IDF | 'len' '(' ')' ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(119,14);
			pushFollow(FOLLOW_bigvectExpr_in_bigdotExpr995);
			bigvectExpr166=bigvectExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigvectExpr166.getTree());
			dbg.location(119,26);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:119:26: ( '.' ^ ( IDF | 'len' '(' ')' ) )?
			int alt45=2;
			try { dbg.enterSubRule(45);
			try { dbg.enterDecision(45, decisionCanBacktrack[45]);

			int LA45_0 = input.LA(1);
			if ( (LA45_0==33) ) {
				alt45=1;
			}
			} finally {dbg.exitDecision(45);}

			switch (alt45) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:119:27: '.' ^ ( IDF | 'len' '(' ')' )
					{
					dbg.location(119,30);
					char_literal167=(Token)match(input,33,FOLLOW_33_in_bigdotExpr998); 
					char_literal167_tree = (CommonTree)adaptor.create(char_literal167);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal167_tree, root_0);
					dbg.location(119,32);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:119:32: ( IDF | 'len' '(' ')' )
					int alt44=2;
					try { dbg.enterSubRule(44);
					try { dbg.enterDecision(44, decisionCanBacktrack[44]);

					int LA44_0 = input.LA(1);
					if ( (LA44_0==IDF) ) {
						alt44=1;
					}
					else if ( (LA44_0==41) ) {
						alt44=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 44, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(44);}

					switch (alt44) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:119:33: IDF
							{
							dbg.location(119,33);
							IDF168=(Token)match(input,IDF,FOLLOW_IDF_in_bigdotExpr1002); 
							IDF168_tree = (CommonTree)adaptor.create(IDF168);
							adaptor.addChild(root_0, IDF168_tree);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:119:39: 'len' '(' ')'
							{
							dbg.location(119,39);
							string_literal169=(Token)match(input,41,FOLLOW_41_in_bigdotExpr1006); 
							string_literal169_tree = (CommonTree)adaptor.create(string_literal169);
							adaptor.addChild(root_0, string_literal169_tree);
							dbg.location(119,45);
							char_literal170=(Token)match(input,28,FOLLOW_28_in_bigdotExpr1008); 
							char_literal170_tree = (CommonTree)adaptor.create(char_literal170);
							adaptor.addChild(root_0, char_literal170_tree);
							dbg.location(119,48);
							char_literal171=(Token)match(input,29,FOLLOW_29_in_bigdotExpr1009); 
							char_literal171_tree = (CommonTree)adaptor.create(char_literal171);
							adaptor.addChild(root_0, char_literal171_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(44);}

					}
					break;

			}
			} finally {dbg.exitSubRule(45);}

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
		dbg.location(119, 53);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:121:1: bigunExpr : ( UNAIRE ^)? bigdotExpr ;
	public final newGrammarParser.bigunExpr_return bigunExpr() throws RecognitionException {
		newGrammarParser.bigunExpr_return retval = new newGrammarParser.bigunExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAIRE172=null;
		ParserRuleReturnScope bigdotExpr173 =null;

		CommonTree UNAIRE172_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bigunExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(121, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:121:11: ( ( UNAIRE ^)? bigdotExpr )
			dbg.enterAlt(1);

			// /home/frosqh/workspace/CompilTest/newGrammar.g:121:13: ( UNAIRE ^)? bigdotExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(121,19);
			// /home/frosqh/workspace/CompilTest/newGrammar.g:121:19: ( UNAIRE ^)?
			int alt46=2;
			try { dbg.enterSubRule(46);
			try { dbg.enterDecision(46, decisionCanBacktrack[46]);

			int LA46_0 = input.LA(1);
			if ( (LA46_0==UNAIRE) ) {
				alt46=1;
			}
			} finally {dbg.exitDecision(46);}

			switch (alt46) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:121:19: UNAIRE ^
					{
					dbg.location(121,19);
					UNAIRE172=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigunExpr1020); 
					UNAIRE172_tree = (CommonTree)adaptor.create(UNAIRE172);
					root_0 = (CommonTree)adaptor.becomeRoot(UNAIRE172_tree, root_0);

					}
					break;

			}
			} finally {dbg.exitSubRule(46);}
			dbg.location(121,22);
			pushFollow(FOLLOW_bigdotExpr_in_bigunExpr1024);
			bigdotExpr173=bigdotExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigdotExpr173.getTree());

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
		dbg.location(121, 31);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:123:1: bigExpr : ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block | bigbinExpr1 );
	public final newGrammarParser.bigExpr_return bigExpr() throws RecognitionException {
		newGrammarParser.bigExpr_return retval = new newGrammarParser.bigExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal174=null;
		Token char_literal175=null;
		Token char_literal176=null;
		Token char_literal178=null;
		Token char_literal180=null;
		Token string_literal181=null;
		Token char_literal182=null;
		Token char_literal183=null;
		Token char_literal185=null;
		ParserRuleReturnScope expr177 =null;
		ParserRuleReturnScope expr179 =null;
		ParserRuleReturnScope expr184 =null;
		ParserRuleReturnScope block186 =null;
		ParserRuleReturnScope bigbinExpr1187 =null;

		CommonTree string_literal174_tree=null;
		CommonTree char_literal175_tree=null;
		CommonTree char_literal176_tree=null;
		CommonTree char_literal178_tree=null;
		CommonTree char_literal180_tree=null;
		CommonTree string_literal181_tree=null;
		CommonTree char_literal182_tree=null;
		CommonTree char_literal183_tree=null;
		CommonTree char_literal185_tree=null;
		RewriteRuleTokenStream stream_UNAIRE=new RewriteRuleTokenStream(adaptor,"token UNAIRE");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "bigExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(123, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:124:3: ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | block | bigbinExpr1 )
			int alt48=4;
			try { dbg.enterDecision(48, decisionCanBacktrack[48]);

			switch ( input.LA(1) ) {
			case 48:
				{
				alt48=1;
				}
				break;
			case 45:
				{
				alt48=2;
				}
				break;
			case 50:
				{
				alt48=3;
				}
				break;
			case BOOL:
			case IDF:
			case INT:
			case UNAIRE:
			case 28:
				{
				alt48=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(48);}

			switch (alt48) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:124:3: 'vec' '!' '[' expr ( ',' expr )* ']'
					{
					dbg.location(124,3);
					string_literal174=(Token)match(input,48,FOLLOW_48_in_bigExpr1033);  
					stream_48.add(string_literal174);
					dbg.location(124,9);
					char_literal175=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigExpr1035);  
					stream_UNAIRE.add(char_literal175);
					dbg.location(124,13);
					char_literal176=(Token)match(input,36,FOLLOW_36_in_bigExpr1037);  
					stream_36.add(char_literal176);
					dbg.location(124,17);
					pushFollow(FOLLOW_expr_in_bigExpr1039);
					expr177=expr();
					state._fsp--;

					stream_expr.add(expr177.getTree());dbg.location(124,22);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:124:22: ( ',' expr )*
					try { dbg.enterSubRule(47);

					loop47:
					while (true) {
						int alt47=2;
						try { dbg.enterDecision(47, decisionCanBacktrack[47]);

						int LA47_0 = input.LA(1);
						if ( (LA47_0==30) ) {
							alt47=1;
						}

						} finally {dbg.exitDecision(47);}

						switch (alt47) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:124:23: ',' expr
							{
							dbg.location(124,23);
							char_literal178=(Token)match(input,30,FOLLOW_30_in_bigExpr1042);  
							stream_30.add(char_literal178);
							dbg.location(124,27);
							pushFollow(FOLLOW_expr_in_bigExpr1044);
							expr179=expr();
							state._fsp--;

							stream_expr.add(expr179.getTree());
							}
							break;

						default :
							break loop47;
						}
					}
					} finally {dbg.exitSubRule(47);}
					dbg.location(124,33);
					char_literal180=(Token)match(input,37,FOLLOW_37_in_bigExpr1047);  
					stream_37.add(char_literal180);

					// AST REWRITE
					// elements: 48, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 124:37: -> ^( 'vec' ( expr )* )
					{
						dbg.location(124,40);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:124:40: ^( 'vec' ( expr )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(124,42);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_48.nextNode(), root_1);
						dbg.location(124,48);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:124:48: ( expr )*
						while ( stream_expr.hasNext() ) {
							dbg.location(124,48);
							adaptor.addChild(root_1, stream_expr.nextTree());
						}
						stream_expr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:125:3: 'print' '!' '(' expr ')'
					{
					dbg.location(125,3);
					string_literal181=(Token)match(input,45,FOLLOW_45_in_bigExpr1060);  
					stream_45.add(string_literal181);
					dbg.location(125,11);
					char_literal182=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigExpr1062);  
					stream_UNAIRE.add(char_literal182);
					dbg.location(125,15);
					char_literal183=(Token)match(input,28,FOLLOW_28_in_bigExpr1064);  
					stream_28.add(char_literal183);
					dbg.location(125,19);
					pushFollow(FOLLOW_expr_in_bigExpr1066);
					expr184=expr();
					state._fsp--;

					stream_expr.add(expr184.getTree());dbg.location(125,24);
					char_literal185=(Token)match(input,29,FOLLOW_29_in_bigExpr1068);  
					stream_29.add(char_literal185);

					// AST REWRITE
					// elements: expr, 45
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 125:28: -> ^( 'print' expr )
					{
						dbg.location(125,31);
						// /home/frosqh/workspace/CompilTest/newGrammar.g:125:31: ^( 'print' expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(125,33);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_45.nextNode(), root_1);
						dbg.location(125,41);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:126:3: block
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(126,3);
					pushFollow(FOLLOW_block_in_bigExpr1079);
					block186=block();
					state._fsp--;

					adaptor.addChild(root_0, block186.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:127:3: bigbinExpr1
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(127,3);
					pushFollow(FOLLOW_bigbinExpr1_in_bigExpr1083);
					bigbinExpr1187=bigbinExpr1();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr1187.getTree());

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
		dbg.location(127, 13);

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
	// /home/frosqh/workspace/CompilTest/newGrammar.g:129:1: bigatom : ( INT | BOOL | IDF ^ ( newStruc | callFun )? | '(' bigExpr ')' -> bigExpr );
	public final newGrammarParser.bigatom_return bigatom() throws RecognitionException {
		newGrammarParser.bigatom_return retval = new newGrammarParser.bigatom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT188=null;
		Token BOOL189=null;
		Token IDF190=null;
		Token char_literal193=null;
		Token char_literal195=null;
		ParserRuleReturnScope newStruc191 =null;
		ParserRuleReturnScope callFun192 =null;
		ParserRuleReturnScope bigExpr194 =null;

		CommonTree INT188_tree=null;
		CommonTree BOOL189_tree=null;
		CommonTree IDF190_tree=null;
		CommonTree char_literal193_tree=null;
		CommonTree char_literal195_tree=null;
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");

		try { dbg.enterRule(getGrammarFileName(), "bigatom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(129, 0);

		try {
			// /home/frosqh/workspace/CompilTest/newGrammar.g:129:9: ( INT | BOOL | IDF ^ ( newStruc | callFun )? | '(' bigExpr ')' -> bigExpr )
			int alt50=4;
			try { dbg.enterDecision(50, decisionCanBacktrack[50]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt50=1;
				}
				break;
			case BOOL:
				{
				alt50=2;
				}
				break;
			case IDF:
				{
				alt50=3;
				}
				break;
			case 28:
				{
				alt50=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(50);}

			switch (alt50) {
				case 1 :
					dbg.enterAlt(1);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:129:11: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(129,11);
					INT188=(Token)match(input,INT,FOLLOW_INT_in_bigatom1091); 
					INT188_tree = (CommonTree)adaptor.create(INT188);
					adaptor.addChild(root_0, INT188_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:130:3: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(130,3);
					BOOL189=(Token)match(input,BOOL,FOLLOW_BOOL_in_bigatom1094); 
					BOOL189_tree = (CommonTree)adaptor.create(BOOL189);
					adaptor.addChild(root_0, BOOL189_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:131:4: IDF ^ ( newStruc | callFun )?
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(131,7);
					IDF190=(Token)match(input,IDF,FOLLOW_IDF_in_bigatom1099); 
					IDF190_tree = (CommonTree)adaptor.create(IDF190);
					root_0 = (CommonTree)adaptor.becomeRoot(IDF190_tree, root_0);
					dbg.location(131,9);
					// /home/frosqh/workspace/CompilTest/newGrammar.g:131:9: ( newStruc | callFun )?
					int alt49=3;
					try { dbg.enterSubRule(49);
					try { dbg.enterDecision(49, decisionCanBacktrack[49]);

					int LA49_0 = input.LA(1);
					if ( (LA49_0==50) ) {
						alt49=1;
					}
					else if ( (LA49_0==28) ) {
						alt49=2;
					}
					} finally {dbg.exitDecision(49);}

					switch (alt49) {
						case 1 :
							dbg.enterAlt(1);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:131:10: newStruc
							{
							dbg.location(131,10);
							pushFollow(FOLLOW_newStruc_in_bigatom1103);
							newStruc191=newStruc();
							state._fsp--;

							adaptor.addChild(root_0, newStruc191.getTree());

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/frosqh/workspace/CompilTest/newGrammar.g:131:19: callFun
							{
							dbg.location(131,19);
							pushFollow(FOLLOW_callFun_in_bigatom1105);
							callFun192=callFun();
							state._fsp--;

							adaptor.addChild(root_0, callFun192.getTree());

							}
							break;

					}
					} finally {dbg.exitSubRule(49);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/frosqh/workspace/CompilTest/newGrammar.g:132:3: '(' bigExpr ')'
					{
					dbg.location(132,3);
					char_literal193=(Token)match(input,28,FOLLOW_28_in_bigatom1110);  
					stream_28.add(char_literal193);
					dbg.location(132,6);
					pushFollow(FOLLOW_bigExpr_in_bigatom1111);
					bigExpr194=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr194.getTree());dbg.location(132,13);
					char_literal195=(Token)match(input,29,FOLLOW_29_in_bigatom1112);  
					stream_29.add(char_literal195);

					// AST REWRITE
					// elements: bigExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 132:17: -> bigExpr
					{
						dbg.location(132,20);
						adaptor.addChild(root_0, stream_bigExpr.nextTree());
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
		dbg.location(132, 26);

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



	public static final BitSet FOLLOW_fichier_in_axiom78 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_axiom80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_fichier96 = new BitSet(new long[]{0x0000810000000002L});
	public static final BitSet FOLLOW_declFun_in_decl107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declStruct_in_decl111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_declStruct120 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDF_in_declStruct122 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_declStruct124 = new BitSet(new long[]{0x0008000000004000L});
	public static final BitSet FOLLOW_args_in_declStruct126 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_declStruct129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_args150 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_args152 = new BitSet(new long[]{0x0001000000005000L});
	public static final BitSet FOLLOW_type_in_args154 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_args157 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDF_in_args159 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_args161 = new BitSet(new long[]{0x0001000000005000L});
	public static final BitSet FOLLOW_type_in_args163 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_40_in_declFun185 = new BitSet(new long[]{0x0000000000024000L});
	public static final BitSet FOLLOW_IDF_in_declFun188 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_declFun190 = new BitSet(new long[]{0x0000000020004000L});
	public static final BitSet FOLLOW_args_in_declFun192 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declFun195 = new BitSet(new long[]{0x0004000100000000L});
	public static final BitSet FOLLOW_32_in_declFun198 = new BitSet(new long[]{0x0001000000005000L});
	public static final BitSet FOLLOW_type_in_declFun200 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_declFun204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIN_in_declFun229 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_declFun231 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declFun233 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_declFun235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_type255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_type260 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_PREV_in_type263 = new BitSet(new long[]{0x0001000000005000L});
	public static final BitSet FOLLOW_type_in_type265 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NEXT_in_type267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EPERLU_in_type281 = new BitSet(new long[]{0x0001000000005000L});
	public static final BitSet FOLLOW_type_in_type283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_block300 = new BitSet(new long[]{0x000F6C489281D100L});
	public static final BitSet FOLLOW_instruct_in_block302 = new BitSet(new long[]{0x000F6C489281D100L});
	public static final BitSet FOLLOW_51_in_block305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_callFun324 = new BitSet(new long[]{0x0005200092815100L});
	public static final BitSet FOLLOW_expr_in_callFun326 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_30_in_callFun329 = new BitSet(new long[]{0x0005200092815100L});
	public static final BitSet FOLLOW_expr_in_callFun331 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_29_in_callFun335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_newStruc348 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDF_in_newStruc350 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_newStruc352 = new BitSet(new long[]{0x0005200012014100L});
	public static final BitSet FOLLOW_bigExpr_in_newStruc354 = new BitSet(new long[]{0x0008000040000000L});
	public static final BitSet FOLLOW_30_in_newStruc357 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDF_in_newStruc359 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_newStruc361 = new BitSet(new long[]{0x0005200012014100L});
	public static final BitSet FOLLOW_bigExpr_in_newStruc363 = new BitSet(new long[]{0x0008000040000000L});
	public static final BitSet FOLLOW_51_in_newStruc367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_instruct391 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_instruct393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_instruct401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_instruct407 = new BitSet(new long[]{0x0000100000004000L});
	public static final BitSet FOLLOW_44_in_instruct409 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_dotIDF_in_instruct412 = new BitSet(new long[]{0x0000000400002000L});
	public static final BitSet FOLLOW_34_in_instruct415 = new BitSet(new long[]{0x0001000000005000L});
	public static final BitSet FOLLOW_type_in_instruct417 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_instruct421 = new BitSet(new long[]{0x0005200012014100L});
	public static final BitSet FOLLOW_bigExpr_in_instruct423 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_instruct425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_instruct452 = new BitSet(new long[]{0x0005200092815100L});
	public static final BitSet FOLLOW_expr_in_instruct454 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_instruct456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_instruct470 = new BitSet(new long[]{0x0005200892815100L});
	public static final BitSet FOLLOW_expr_in_instruct472 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_instruct475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_instruct488 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_instruct490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_instruct502 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_instruct504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpr_in_instruct512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_dotIDF523 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_dotIDF526 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDF_in_dotIDF529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifExpr539 = new BitSet(new long[]{0x0005200092815100L});
	public static final BitSet FOLLOW_expr_in_ifExpr541 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_ifExpr543 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_ifExpr546 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_ifExpr548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binExpr2_in_binExpr1576 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_EQUAL_in_binExpr1579 = new BitSet(new long[]{0x0000000092815100L});
	public static final BitSet FOLLOW_binExpr2_in_binExpr1582 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_binExpr3_in_binExpr2593 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_ORBOOL_in_binExpr2595 = new BitSet(new long[]{0x0000000092815100L});
	public static final BitSet FOLLOW_binExpr3_in_binExpr2598 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_binExpr4_in_binExpr3609 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ANDBOOL_in_binExpr3611 = new BitSet(new long[]{0x0000000092815100L});
	public static final BitSet FOLLOW_binExpr4_in_binExpr3614 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_binExpr5_in_binExpr4625 = new BitSet(new long[]{0x0000000000580002L});
	public static final BitSet FOLLOW_PREV_in_binExpr4628 = new BitSet(new long[]{0x0000000092815100L});
	public static final BitSet FOLLOW_OPBOOLEQ_in_binExpr4631 = new BitSet(new long[]{0x0000000092815100L});
	public static final BitSet FOLLOW_NEXT_in_binExpr4634 = new BitSet(new long[]{0x0000000092815100L});
	public static final BitSet FOLLOW_binExpr5_in_binExpr4638 = new BitSet(new long[]{0x0000000000580002L});
	public static final BitSet FOLLOW_binExpr6_in_binExpr5649 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDSUB_in_binExpr5651 = new BitSet(new long[]{0x0000000092815100L});
	public static final BitSet FOLLOW_binExpr6_in_binExpr5654 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_unExpr_in_binExpr6665 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_STAR_in_binExpr6669 = new BitSet(new long[]{0x0000000092815100L});
	public static final BitSet FOLLOW_DIV_in_binExpr6672 = new BitSet(new long[]{0x0000000092815100L});
	public static final BitSet FOLLOW_unExpr_in_binExpr6676 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_starExpr_in_vectExpr687 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_vectExpr690 = new BitSet(new long[]{0x0005200092815100L});
	public static final BitSet FOLLOW_expr_in_vectExpr693 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_vectExpr695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_starExpr709 = new BitSet(new long[]{0x0000000090014100L});
	public static final BitSet FOLLOW_moinsExpr_in_starExpr713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_moinsExpr725 = new BitSet(new long[]{0x0000000010014100L});
	public static final BitSet FOLLOW_atom_in_moinsExpr728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vectExpr_in_dotExpr737 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_dotExpr740 = new BitSet(new long[]{0x0000020000004000L});
	public static final BitSet FOLLOW_IDF_in_dotExpr744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_dotExpr748 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_dotExpr750 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_dotExpr752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAIRE_in_unExpr766 = new BitSet(new long[]{0x0000000090814100L});
	public static final BitSet FOLLOW_EPERLU_in_unExpr769 = new BitSet(new long[]{0x0000000090814100L});
	public static final BitSet FOLLOW_dotExpr_in_unExpr774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_atom785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_atom790 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_callFun_in_atom795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_atom801 = new BitSet(new long[]{0x0005200092815100L});
	public static final BitSet FOLLOW_expr_in_atom802 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_atom803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_expr815 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_UNAIRE_in_expr817 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_expr819 = new BitSet(new long[]{0x0005200092815100L});
	public static final BitSet FOLLOW_expr_in_expr821 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_expr823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_expr835 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_UNAIRE_in_expr837 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_expr839 = new BitSet(new long[]{0x0005200092815100L});
	public static final BitSet FOLLOW_expr_in_expr841 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_expr843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_expr854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binExpr1_in_expr858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigbinExpr2_in_bigbinExpr1867 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_EQUAL_in_bigbinExpr1870 = new BitSet(new long[]{0x0000000012014100L});
	public static final BitSet FOLLOW_bigbinExpr2_in_bigbinExpr1873 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_bigbinExpr3_in_bigbinExpr2884 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_ORBOOL_in_bigbinExpr2886 = new BitSet(new long[]{0x0000000012014100L});
	public static final BitSet FOLLOW_bigbinExpr3_in_bigbinExpr2889 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_bigbinExpr4_in_bigbinExpr3900 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ANDBOOL_in_bigbinExpr3902 = new BitSet(new long[]{0x0000000012014100L});
	public static final BitSet FOLLOW_bigbinExpr4_in_bigbinExpr3905 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_bigbinExpr5_in_bigbinExpr4916 = new BitSet(new long[]{0x0000000000580002L});
	public static final BitSet FOLLOW_PREV_in_bigbinExpr4919 = new BitSet(new long[]{0x0000000012014100L});
	public static final BitSet FOLLOW_OPBOOLEQ_in_bigbinExpr4922 = new BitSet(new long[]{0x0000000012014100L});
	public static final BitSet FOLLOW_NEXT_in_bigbinExpr4925 = new BitSet(new long[]{0x0000000012014100L});
	public static final BitSet FOLLOW_bigbinExpr5_in_bigbinExpr4929 = new BitSet(new long[]{0x0000000000580002L});
	public static final BitSet FOLLOW_bigbinExpr6_in_bigbinExpr5940 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDSUB_in_bigbinExpr5942 = new BitSet(new long[]{0x0000000012014100L});
	public static final BitSet FOLLOW_bigbinExpr6_in_bigbinExpr5945 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_bigunExpr_in_bigbinExpr6956 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_STAR_in_bigbinExpr6960 = new BitSet(new long[]{0x0000000012014100L});
	public static final BitSet FOLLOW_DIV_in_bigbinExpr6963 = new BitSet(new long[]{0x0000000012014100L});
	public static final BitSet FOLLOW_bigunExpr_in_bigbinExpr6967 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_bigatom_in_bigvectExpr978 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_bigvectExpr981 = new BitSet(new long[]{0x0005200012014100L});
	public static final BitSet FOLLOW_bigExpr_in_bigvectExpr983 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_bigvectExpr985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigvectExpr_in_bigdotExpr995 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_bigdotExpr998 = new BitSet(new long[]{0x0000020000004000L});
	public static final BitSet FOLLOW_IDF_in_bigdotExpr1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_bigdotExpr1006 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_bigdotExpr1008 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_bigdotExpr1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAIRE_in_bigunExpr1020 = new BitSet(new long[]{0x0000000010014100L});
	public static final BitSet FOLLOW_bigdotExpr_in_bigunExpr1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_bigExpr1033 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_UNAIRE_in_bigExpr1035 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_bigExpr1037 = new BitSet(new long[]{0x0005200092815100L});
	public static final BitSet FOLLOW_expr_in_bigExpr1039 = new BitSet(new long[]{0x0000002040000000L});
	public static final BitSet FOLLOW_30_in_bigExpr1042 = new BitSet(new long[]{0x0005200092815100L});
	public static final BitSet FOLLOW_expr_in_bigExpr1044 = new BitSet(new long[]{0x0000002040000000L});
	public static final BitSet FOLLOW_37_in_bigExpr1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_bigExpr1060 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_UNAIRE_in_bigExpr1062 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_bigExpr1064 = new BitSet(new long[]{0x0005200092815100L});
	public static final BitSet FOLLOW_expr_in_bigExpr1066 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_bigExpr1068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_bigExpr1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigbinExpr1_in_bigExpr1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_bigatom1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_bigatom1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_bigatom1099 = new BitSet(new long[]{0x0004000010000002L});
	public static final BitSet FOLLOW_newStruc_in_bigatom1103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callFun_in_bigatom1105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_bigatom1110 = new BitSet(new long[]{0x0005200012014100L});
	public static final BitSet FOLLOW_bigExpr_in_bigatom1111 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_bigatom1112 = new BitSet(new long[]{0x0000000000000002L});
}
