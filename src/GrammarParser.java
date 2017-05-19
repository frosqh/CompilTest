// $ANTLR 3.3 Nov 30, 2010 12:50:56 Grammar.g 2017-05-19 01:46:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class GrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DoExpr", "Inner", "Void", "ClassStat", "IDFMAJ", "InheritStat", "VarStat", "IDF", "INTTYPE", "STRINGTYPE", "MethodStat", "IfStat", "ThenStat", "FiStat", "ForStat", "InStat", "DoStat", "EndStat", "WriteStat", "ReadStat", "ReturnStat", "INT", "STRING", "ThisStat", "SuperStat", "NewStat", "BOOLOPER", "COMMENT", "WS", "'='", "'('", "')'", "':'", "';'", "'{'", "'}'", "','", "':='", "'else'", "'..'", "'*'", "'/'", "'+'", "'-'", "'.'"
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
    public static final int DoExpr=4;
    public static final int Inner=5;
    public static final int Void=6;
    public static final int ClassStat=7;
    public static final int IDFMAJ=8;
    public static final int InheritStat=9;
    public static final int VarStat=10;
    public static final int IDF=11;
    public static final int INTTYPE=12;
    public static final int STRINGTYPE=13;
    public static final int MethodStat=14;
    public static final int IfStat=15;
    public static final int ThenStat=16;
    public static final int FiStat=17;
    public static final int ForStat=18;
    public static final int InStat=19;
    public static final int DoStat=20;
    public static final int EndStat=21;
    public static final int WriteStat=22;
    public static final int ReadStat=23;
    public static final int ReturnStat=24;
    public static final int INT=25;
    public static final int STRING=26;
    public static final int ThisStat=27;
    public static final int SuperStat=28;
    public static final int NewStat=29;
    public static final int BOOLOPER=30;
    public static final int COMMENT=31;
    public static final int WS=32;

    // delegates
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

    public String[] getTokenNames() { return GrammarParser.tokenNames; }
    public String getGrammarFileName() { return "Grammar.g"; }


    public static class p_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p"
    // Grammar.g:16:1: p : pROGRAM EOF -> pROGRAM ;
    public final GrammarParser.p_return p() throws RecognitionException {
        GrammarParser.p_return retval = new GrammarParser.p_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        GrammarParser.pROGRAM_return pROGRAM1 = null;


        CommonTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_pROGRAM=new RewriteRuleSubtreeStream(adaptor,"rule pROGRAM");
        try {
            // Grammar.g:16:5: ( pROGRAM EOF -> pROGRAM )
            // Grammar.g:16:7: pROGRAM EOF
            {
            pushFollow(FOLLOW_pROGRAM_in_p80);
            pROGRAM1=pROGRAM();

            state._fsp--;

            stream_pROGRAM.add(pROGRAM1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_p82);  
            stream_EOF.add(EOF2);



            // AST REWRITE
            // elements: pROGRAM
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 16:19: -> pROGRAM
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
        }
        return retval;
    }
    // $ANTLR end "p"

    public static class pROGRAM_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pROGRAM"
    // Grammar.g:19:1: pROGRAM : ( cLASS_DECL )* ( vAR_DECL )* ( iNSTRUCTION )+ ;
    public final GrammarParser.pROGRAM_return pROGRAM() throws RecognitionException {
        GrammarParser.pROGRAM_return retval = new GrammarParser.pROGRAM_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        GrammarParser.cLASS_DECL_return cLASS_DECL3 = null;

        GrammarParser.vAR_DECL_return vAR_DECL4 = null;

        GrammarParser.iNSTRUCTION_return iNSTRUCTION5 = null;



        try {
            // Grammar.g:19:11: ( ( cLASS_DECL )* ( vAR_DECL )* ( iNSTRUCTION )+ )
            // Grammar.g:19:13: ( cLASS_DECL )* ( vAR_DECL )* ( iNSTRUCTION )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // Grammar.g:19:13: ( cLASS_DECL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ClassStat) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Grammar.g:19:13: cLASS_DECL
            	    {
            	    pushFollow(FOLLOW_cLASS_DECL_in_pROGRAM100);
            	    cLASS_DECL3=cLASS_DECL();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cLASS_DECL3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // Grammar.g:19:25: ( vAR_DECL )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==VarStat) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Grammar.g:19:25: vAR_DECL
            	    {
            	    pushFollow(FOLLOW_vAR_DECL_in_pROGRAM103);
            	    vAR_DECL4=vAR_DECL();

            	    state._fsp--;

            	    adaptor.addChild(root_0, vAR_DECL4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // Grammar.g:19:35: ( iNSTRUCTION )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDF||LA3_0==IfStat||LA3_0==ForStat||LA3_0==DoStat||(LA3_0>=WriteStat && LA3_0<=ReturnStat)||LA3_0==38) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Grammar.g:19:35: iNSTRUCTION
            	    {
            	    pushFollow(FOLLOW_iNSTRUCTION_in_pROGRAM106);
            	    iNSTRUCTION5=iNSTRUCTION();

            	    state._fsp--;

            	    adaptor.addChild(root_0, iNSTRUCTION5.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "pROGRAM"

    public static class cLASS_DECL_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cLASS_DECL"
    // Grammar.g:22:1: cLASS_DECL : ( ClassStat IDFMAJ ( InheritStat IDFMAJ )? '=' ) '(' cLASS_ITEM_DECL ')' -> ^( ClassStat IDFMAJ ( ^( InheritStat IDFMAJ ) )? ( cLASS_ITEM_DECL )? ) ;
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
        GrammarParser.cLASS_ITEM_DECL_return cLASS_ITEM_DECL12 = null;


        CommonTree ClassStat6_tree=null;
        CommonTree IDFMAJ7_tree=null;
        CommonTree InheritStat8_tree=null;
        CommonTree IDFMAJ9_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree char_literal11_tree=null;
        CommonTree char_literal13_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_ClassStat=new RewriteRuleTokenStream(adaptor,"token ClassStat");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_InheritStat=new RewriteRuleTokenStream(adaptor,"token InheritStat");
        RewriteRuleTokenStream stream_IDFMAJ=new RewriteRuleTokenStream(adaptor,"token IDFMAJ");
        RewriteRuleSubtreeStream stream_cLASS_ITEM_DECL=new RewriteRuleSubtreeStream(adaptor,"rule cLASS_ITEM_DECL");
        try {
            // Grammar.g:22:14: ( ( ClassStat IDFMAJ ( InheritStat IDFMAJ )? '=' ) '(' cLASS_ITEM_DECL ')' -> ^( ClassStat IDFMAJ ( ^( InheritStat IDFMAJ ) )? ( cLASS_ITEM_DECL )? ) )
            // Grammar.g:22:16: ( ClassStat IDFMAJ ( InheritStat IDFMAJ )? '=' ) '(' cLASS_ITEM_DECL ')'
            {
            // Grammar.g:22:16: ( ClassStat IDFMAJ ( InheritStat IDFMAJ )? '=' )
            // Grammar.g:22:17: ClassStat IDFMAJ ( InheritStat IDFMAJ )? '='
            {
            ClassStat6=(Token)match(input,ClassStat,FOLLOW_ClassStat_in_cLASS_DECL122);  
            stream_ClassStat.add(ClassStat6);

            IDFMAJ7=(Token)match(input,IDFMAJ,FOLLOW_IDFMAJ_in_cLASS_DECL124);  
            stream_IDFMAJ.add(IDFMAJ7);

            // Grammar.g:22:34: ( InheritStat IDFMAJ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==InheritStat) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Grammar.g:22:35: InheritStat IDFMAJ
                    {
                    InheritStat8=(Token)match(input,InheritStat,FOLLOW_InheritStat_in_cLASS_DECL127);  
                    stream_InheritStat.add(InheritStat8);

                    IDFMAJ9=(Token)match(input,IDFMAJ,FOLLOW_IDFMAJ_in_cLASS_DECL129);  
                    stream_IDFMAJ.add(IDFMAJ9);


                    }
                    break;

            }

            char_literal10=(Token)match(input,33,FOLLOW_33_in_cLASS_DECL133);  
            stream_33.add(char_literal10);


            }

            char_literal11=(Token)match(input,34,FOLLOW_34_in_cLASS_DECL136);  
            stream_34.add(char_literal11);

            pushFollow(FOLLOW_cLASS_ITEM_DECL_in_cLASS_DECL138);
            cLASS_ITEM_DECL12=cLASS_ITEM_DECL();

            state._fsp--;

            stream_cLASS_ITEM_DECL.add(cLASS_ITEM_DECL12.getTree());
            char_literal13=(Token)match(input,35,FOLLOW_35_in_cLASS_DECL140);  
            stream_35.add(char_literal13);



            // AST REWRITE
            // elements: IDFMAJ, IDFMAJ, InheritStat, cLASS_ITEM_DECL, ClassStat
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 22:85: -> ^( ClassStat IDFMAJ ( ^( InheritStat IDFMAJ ) )? ( cLASS_ITEM_DECL )? )
            {
                // Grammar.g:22:88: ^( ClassStat IDFMAJ ( ^( InheritStat IDFMAJ ) )? ( cLASS_ITEM_DECL )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ClassStat.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDFMAJ.nextNode());
                // Grammar.g:22:107: ( ^( InheritStat IDFMAJ ) )?
                if ( stream_IDFMAJ.hasNext()||stream_InheritStat.hasNext() ) {
                    // Grammar.g:22:107: ^( InheritStat IDFMAJ )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(stream_InheritStat.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_IDFMAJ.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_IDFMAJ.reset();
                stream_InheritStat.reset();
                // Grammar.g:22:130: ( cLASS_ITEM_DECL )?
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
        }
        return retval;
    }
    // $ANTLR end "cLASS_DECL"

    public static class cLASS_ITEM_DECL_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cLASS_ITEM_DECL"
    // Grammar.g:31:1: cLASS_ITEM_DECL : ( vAR_DECL )* ( mETHOD_DECL )* ;
    public final GrammarParser.cLASS_ITEM_DECL_return cLASS_ITEM_DECL() throws RecognitionException {
        GrammarParser.cLASS_ITEM_DECL_return retval = new GrammarParser.cLASS_ITEM_DECL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        GrammarParser.vAR_DECL_return vAR_DECL14 = null;

        GrammarParser.mETHOD_DECL_return mETHOD_DECL15 = null;



        try {
            // Grammar.g:31:18: ( ( vAR_DECL )* ( mETHOD_DECL )* )
            // Grammar.g:31:20: ( vAR_DECL )* ( mETHOD_DECL )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // Grammar.g:31:20: ( vAR_DECL )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==VarStat) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Grammar.g:31:20: vAR_DECL
            	    {
            	    pushFollow(FOLLOW_vAR_DECL_in_cLASS_ITEM_DECL204);
            	    vAR_DECL14=vAR_DECL();

            	    state._fsp--;

            	    adaptor.addChild(root_0, vAR_DECL14.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // Grammar.g:31:30: ( mETHOD_DECL )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==MethodStat) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Grammar.g:31:30: mETHOD_DECL
            	    {
            	    pushFollow(FOLLOW_mETHOD_DECL_in_cLASS_ITEM_DECL207);
            	    mETHOD_DECL15=mETHOD_DECL();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mETHOD_DECL15.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "cLASS_ITEM_DECL"

    public static class vAR_DECL_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vAR_DECL"
    // Grammar.g:34:1: vAR_DECL : VarStat IDF ':' tYPE ';' -> ^( VarStat IDF tYPE ) ;
    public final GrammarParser.vAR_DECL_return vAR_DECL() throws RecognitionException {
        GrammarParser.vAR_DECL_return retval = new GrammarParser.vAR_DECL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VarStat16=null;
        Token IDF17=null;
        Token char_literal18=null;
        Token char_literal20=null;
        GrammarParser.tYPE_return tYPE19 = null;


        CommonTree VarStat16_tree=null;
        CommonTree IDF17_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree char_literal20_tree=null;
        RewriteRuleTokenStream stream_VarStat=new RewriteRuleTokenStream(adaptor,"token VarStat");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_tYPE=new RewriteRuleSubtreeStream(adaptor,"rule tYPE");
        try {
            // Grammar.g:34:12: ( VarStat IDF ':' tYPE ';' -> ^( VarStat IDF tYPE ) )
            // Grammar.g:34:14: VarStat IDF ':' tYPE ';'
            {
            VarStat16=(Token)match(input,VarStat,FOLLOW_VarStat_in_vAR_DECL223);  
            stream_VarStat.add(VarStat16);

            IDF17=(Token)match(input,IDF,FOLLOW_IDF_in_vAR_DECL225);  
            stream_IDF.add(IDF17);

            char_literal18=(Token)match(input,36,FOLLOW_36_in_vAR_DECL227);  
            stream_36.add(char_literal18);

            pushFollow(FOLLOW_tYPE_in_vAR_DECL229);
            tYPE19=tYPE();

            state._fsp--;

            stream_tYPE.add(tYPE19.getTree());
            char_literal20=(Token)match(input,37,FOLLOW_37_in_vAR_DECL231);  
            stream_37.add(char_literal20);



            // AST REWRITE
            // elements: tYPE, VarStat, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 34:39: -> ^( VarStat IDF tYPE )
            {
                // Grammar.g:34:42: ^( VarStat IDF tYPE )
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
        }
        return retval;
    }
    // $ANTLR end "vAR_DECL"

    public static class tYPE_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tYPE"
    // Grammar.g:41:1: tYPE : ( INTTYPE | STRINGTYPE | IDFMAJ );
    public final GrammarParser.tYPE_return tYPE() throws RecognitionException {
        GrammarParser.tYPE_return retval = new GrammarParser.tYPE_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set21=null;

        CommonTree set21_tree=null;

        try {
            // Grammar.g:41:9: ( INTTYPE | STRINGTYPE | IDFMAJ )
            // Grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set21=(Token)input.LT(1);
            if ( input.LA(1)==IDFMAJ||(input.LA(1)>=INTTYPE && input.LA(1)<=STRINGTYPE) ) {
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
        }
        return retval;
    }
    // $ANTLR end "tYPE"

    public static class mETHOD_DECL_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mETHOD_DECL"
    // Grammar.g:46:1: mETHOD_DECL : MethodStat IDF '(' ( mETHOD_ARGS )* ')' mETHOD_TYPE '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}' -> ^( MethodStat ^( IDF ( mETHOD_ARGS )* mETHOD_TYPE ) ( vAR_DECL )* ( iNSTRUCTION )+ ) ;
    public final GrammarParser.mETHOD_DECL_return mETHOD_DECL() throws RecognitionException {
        GrammarParser.mETHOD_DECL_return retval = new GrammarParser.mETHOD_DECL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MethodStat22=null;
        Token IDF23=null;
        Token char_literal24=null;
        Token char_literal26=null;
        Token char_literal28=null;
        Token char_literal31=null;
        GrammarParser.mETHOD_ARGS_return mETHOD_ARGS25 = null;

        GrammarParser.mETHOD_TYPE_return mETHOD_TYPE27 = null;

        GrammarParser.vAR_DECL_return vAR_DECL29 = null;

        GrammarParser.iNSTRUCTION_return iNSTRUCTION30 = null;


        CommonTree MethodStat22_tree=null;
        CommonTree IDF23_tree=null;
        CommonTree char_literal24_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree char_literal31_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_MethodStat=new RewriteRuleTokenStream(adaptor,"token MethodStat");
        RewriteRuleSubtreeStream stream_mETHOD_TYPE=new RewriteRuleSubtreeStream(adaptor,"rule mETHOD_TYPE");
        RewriteRuleSubtreeStream stream_vAR_DECL=new RewriteRuleSubtreeStream(adaptor,"rule vAR_DECL");
        RewriteRuleSubtreeStream stream_mETHOD_ARGS=new RewriteRuleSubtreeStream(adaptor,"rule mETHOD_ARGS");
        RewriteRuleSubtreeStream stream_iNSTRUCTION=new RewriteRuleSubtreeStream(adaptor,"rule iNSTRUCTION");
        try {
            // Grammar.g:46:14: ( MethodStat IDF '(' ( mETHOD_ARGS )* ')' mETHOD_TYPE '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}' -> ^( MethodStat ^( IDF ( mETHOD_ARGS )* mETHOD_TYPE ) ( vAR_DECL )* ( iNSTRUCTION )+ ) )
            // Grammar.g:46:16: MethodStat IDF '(' ( mETHOD_ARGS )* ')' mETHOD_TYPE '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}'
            {
            MethodStat22=(Token)match(input,MethodStat,FOLLOW_MethodStat_in_mETHOD_DECL310);  
            stream_MethodStat.add(MethodStat22);

            IDF23=(Token)match(input,IDF,FOLLOW_IDF_in_mETHOD_DECL312);  
            stream_IDF.add(IDF23);

            char_literal24=(Token)match(input,34,FOLLOW_34_in_mETHOD_DECL314);  
            stream_34.add(char_literal24);

            // Grammar.g:46:35: ( mETHOD_ARGS )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDF) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Grammar.g:46:35: mETHOD_ARGS
            	    {
            	    pushFollow(FOLLOW_mETHOD_ARGS_in_mETHOD_DECL316);
            	    mETHOD_ARGS25=mETHOD_ARGS();

            	    state._fsp--;

            	    stream_mETHOD_ARGS.add(mETHOD_ARGS25.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            char_literal26=(Token)match(input,35,FOLLOW_35_in_mETHOD_DECL319);  
            stream_35.add(char_literal26);

            pushFollow(FOLLOW_mETHOD_TYPE_in_mETHOD_DECL321);
            mETHOD_TYPE27=mETHOD_TYPE();

            state._fsp--;

            stream_mETHOD_TYPE.add(mETHOD_TYPE27.getTree());
            char_literal28=(Token)match(input,38,FOLLOW_38_in_mETHOD_DECL323);  
            stream_38.add(char_literal28);

            // Grammar.g:46:68: ( vAR_DECL )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==VarStat) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Grammar.g:46:68: vAR_DECL
            	    {
            	    pushFollow(FOLLOW_vAR_DECL_in_mETHOD_DECL325);
            	    vAR_DECL29=vAR_DECL();

            	    state._fsp--;

            	    stream_vAR_DECL.add(vAR_DECL29.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // Grammar.g:46:78: ( iNSTRUCTION )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==IDF||LA9_0==IfStat||LA9_0==ForStat||LA9_0==DoStat||(LA9_0>=WriteStat && LA9_0<=ReturnStat)||LA9_0==38) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Grammar.g:46:78: iNSTRUCTION
            	    {
            	    pushFollow(FOLLOW_iNSTRUCTION_in_mETHOD_DECL328);
            	    iNSTRUCTION30=iNSTRUCTION();

            	    state._fsp--;

            	    stream_iNSTRUCTION.add(iNSTRUCTION30.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            char_literal31=(Token)match(input,39,FOLLOW_39_in_mETHOD_DECL331);  
            stream_39.add(char_literal31);



            // AST REWRITE
            // elements: vAR_DECL, MethodStat, IDF, mETHOD_TYPE, mETHOD_ARGS, iNSTRUCTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 46:95: -> ^( MethodStat ^( IDF ( mETHOD_ARGS )* mETHOD_TYPE ) ( vAR_DECL )* ( iNSTRUCTION )+ )
            {
                // Grammar.g:46:98: ^( MethodStat ^( IDF ( mETHOD_ARGS )* mETHOD_TYPE ) ( vAR_DECL )* ( iNSTRUCTION )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_MethodStat.nextNode(), root_1);

                // Grammar.g:46:111: ^( IDF ( mETHOD_ARGS )* mETHOD_TYPE )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_2);

                // Grammar.g:46:117: ( mETHOD_ARGS )*
                while ( stream_mETHOD_ARGS.hasNext() ) {
                    adaptor.addChild(root_2, stream_mETHOD_ARGS.nextTree());

                }
                stream_mETHOD_ARGS.reset();
                adaptor.addChild(root_2, stream_mETHOD_TYPE.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // Grammar.g:46:143: ( vAR_DECL )*
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
        }
        return retval;
    }
    // $ANTLR end "mETHOD_DECL"

    public static class mETHOD_TYPE_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mETHOD_TYPE"
    // Grammar.g:49:1: mETHOD_TYPE : ( ( ':' tYPE ) -> tYPE | -> Void );
    public final GrammarParser.mETHOD_TYPE_return mETHOD_TYPE() throws RecognitionException {
        GrammarParser.mETHOD_TYPE_return retval = new GrammarParser.mETHOD_TYPE_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal32=null;
        GrammarParser.tYPE_return tYPE33 = null;


        CommonTree char_literal32_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_tYPE=new RewriteRuleSubtreeStream(adaptor,"rule tYPE");
        try {
            // Grammar.g:49:14: ( ( ':' tYPE ) -> tYPE | -> Void )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            else if ( (LA10_0==38) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // Grammar.g:49:16: ( ':' tYPE )
                    {
                    // Grammar.g:49:16: ( ':' tYPE )
                    // Grammar.g:49:17: ':' tYPE
                    {
                    char_literal32=(Token)match(input,36,FOLLOW_36_in_mETHOD_TYPE366);  
                    stream_36.add(char_literal32);

                    pushFollow(FOLLOW_tYPE_in_mETHOD_TYPE368);
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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 49:27: -> tYPE
                    {
                        adaptor.addChild(root_0, stream_tYPE.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Grammar.g:50:6: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 50:6: -> Void
                    {
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
        }
        return retval;
    }
    // $ANTLR end "mETHOD_TYPE"

    public static class mETHOD_ARGS_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mETHOD_ARGS"
    // Grammar.g:56:1: mETHOD_ARGS : IDF ':' tYPE ( ',' IDF ':' tYPE )* -> ( ^( IDF tYPE ) )* ;
    public final GrammarParser.mETHOD_ARGS_return mETHOD_ARGS() throws RecognitionException {
        GrammarParser.mETHOD_ARGS_return retval = new GrammarParser.mETHOD_ARGS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF34=null;
        Token char_literal35=null;
        Token char_literal37=null;
        Token IDF38=null;
        Token char_literal39=null;
        GrammarParser.tYPE_return tYPE36 = null;

        GrammarParser.tYPE_return tYPE40 = null;


        CommonTree IDF34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree IDF38_tree=null;
        CommonTree char_literal39_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_tYPE=new RewriteRuleSubtreeStream(adaptor,"rule tYPE");
        try {
            // Grammar.g:56:14: ( IDF ':' tYPE ( ',' IDF ':' tYPE )* -> ( ^( IDF tYPE ) )* )
            // Grammar.g:56:16: IDF ':' tYPE ( ',' IDF ':' tYPE )*
            {
            IDF34=(Token)match(input,IDF,FOLLOW_IDF_in_mETHOD_ARGS412);  
            stream_IDF.add(IDF34);

            char_literal35=(Token)match(input,36,FOLLOW_36_in_mETHOD_ARGS414);  
            stream_36.add(char_literal35);

            pushFollow(FOLLOW_tYPE_in_mETHOD_ARGS416);
            tYPE36=tYPE();

            state._fsp--;

            stream_tYPE.add(tYPE36.getTree());
            // Grammar.g:56:29: ( ',' IDF ':' tYPE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==40) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Grammar.g:56:30: ',' IDF ':' tYPE
            	    {
            	    char_literal37=(Token)match(input,40,FOLLOW_40_in_mETHOD_ARGS419);  
            	    stream_40.add(char_literal37);

            	    IDF38=(Token)match(input,IDF,FOLLOW_IDF_in_mETHOD_ARGS421);  
            	    stream_IDF.add(IDF38);

            	    char_literal39=(Token)match(input,36,FOLLOW_36_in_mETHOD_ARGS423);  
            	    stream_36.add(char_literal39);

            	    pushFollow(FOLLOW_tYPE_in_mETHOD_ARGS425);
            	    tYPE40=tYPE();

            	    state._fsp--;

            	    stream_tYPE.add(tYPE40.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: IDF, tYPE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 56:49: -> ( ^( IDF tYPE ) )*
            {
                // Grammar.g:56:52: ( ^( IDF tYPE ) )*
                while ( stream_IDF.hasNext()||stream_tYPE.hasNext() ) {
                    // Grammar.g:56:52: ^( IDF tYPE )
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
        }
        return retval;
    }
    // $ANTLR end "mETHOD_ARGS"

    public static class iNSTRUCTION_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iNSTRUCTION"
    // Grammar.g:59:1: iNSTRUCTION : ( IDF ':=' ( eXPRESSION ) ';' -> ^( ':=' IDF eXPRESSION ) | IfStat eXPRESSION ThenStat iNSTRUCTION ( 'else' iNSTRUCTION )? FiStat -> ^( IfStat eXPRESSION ^( ThenStat iNSTRUCTION ) ( ^( 'else' iNSTRUCTION ) )? ) | ForStat IDF InStat eXPRESSION '..' eXPRESSION DoStat ( iNSTRUCTION )+ EndStat -> ^( ForStat ^( InStat IDF eXPRESSION eXPRESSION ) ^( DoStat ( iNSTRUCTION )+ ) ) | '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}' -> ^( Inner ( vAR_DECL )* ( iNSTRUCTION )* ) | DoStat eXPRESSION ';' -> ^( DoExpr eXPRESSION ) | pRINT | rEAD | rETURN2 );
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
        GrammarParser.eXPRESSION_return eXPRESSION43 = null;

        GrammarParser.eXPRESSION_return eXPRESSION46 = null;

        GrammarParser.iNSTRUCTION_return iNSTRUCTION48 = null;

        GrammarParser.iNSTRUCTION_return iNSTRUCTION50 = null;

        GrammarParser.eXPRESSION_return eXPRESSION55 = null;

        GrammarParser.eXPRESSION_return eXPRESSION57 = null;

        GrammarParser.iNSTRUCTION_return iNSTRUCTION59 = null;

        GrammarParser.vAR_DECL_return vAR_DECL62 = null;

        GrammarParser.iNSTRUCTION_return iNSTRUCTION63 = null;

        GrammarParser.eXPRESSION_return eXPRESSION66 = null;

        GrammarParser.pRINT_return pRINT68 = null;

        GrammarParser.rEAD_return rEAD69 = null;

        GrammarParser.rETURN2_return rETURN270 = null;


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
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_EndStat=new RewriteRuleTokenStream(adaptor,"token EndStat");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_IfStat=new RewriteRuleTokenStream(adaptor,"token IfStat");
        RewriteRuleTokenStream stream_ThenStat=new RewriteRuleTokenStream(adaptor,"token ThenStat");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_ForStat=new RewriteRuleTokenStream(adaptor,"token ForStat");
        RewriteRuleTokenStream stream_DoStat=new RewriteRuleTokenStream(adaptor,"token DoStat");
        RewriteRuleTokenStream stream_FiStat=new RewriteRuleTokenStream(adaptor,"token FiStat");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_InStat=new RewriteRuleTokenStream(adaptor,"token InStat");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_vAR_DECL=new RewriteRuleSubtreeStream(adaptor,"rule vAR_DECL");
        RewriteRuleSubtreeStream stream_eXPRESSION=new RewriteRuleSubtreeStream(adaptor,"rule eXPRESSION");
        RewriteRuleSubtreeStream stream_iNSTRUCTION=new RewriteRuleSubtreeStream(adaptor,"rule iNSTRUCTION");
        try {
            // Grammar.g:59:15: ( IDF ':=' ( eXPRESSION ) ';' -> ^( ':=' IDF eXPRESSION ) | IfStat eXPRESSION ThenStat iNSTRUCTION ( 'else' iNSTRUCTION )? FiStat -> ^( IfStat eXPRESSION ^( ThenStat iNSTRUCTION ) ( ^( 'else' iNSTRUCTION ) )? ) | ForStat IDF InStat eXPRESSION '..' eXPRESSION DoStat ( iNSTRUCTION )+ EndStat -> ^( ForStat ^( InStat IDF eXPRESSION eXPRESSION ) ^( DoStat ( iNSTRUCTION )+ ) ) | '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}' -> ^( Inner ( vAR_DECL )* ( iNSTRUCTION )* ) | DoStat eXPRESSION ';' -> ^( DoExpr eXPRESSION ) | pRINT | rEAD | rETURN2 )
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
            case 38:
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
                    // Grammar.g:59:17: IDF ':=' ( eXPRESSION ) ';'
                    {
                    IDF41=(Token)match(input,IDF,FOLLOW_IDF_in_iNSTRUCTION453);  
                    stream_IDF.add(IDF41);

                    string_literal42=(Token)match(input,41,FOLLOW_41_in_iNSTRUCTION455);  
                    stream_41.add(string_literal42);

                    // Grammar.g:59:26: ( eXPRESSION )
                    // Grammar.g:59:27: eXPRESSION
                    {
                    pushFollow(FOLLOW_eXPRESSION_in_iNSTRUCTION458);
                    eXPRESSION43=eXPRESSION();

                    state._fsp--;

                    stream_eXPRESSION.add(eXPRESSION43.getTree());

                    }

                    char_literal44=(Token)match(input,37,FOLLOW_37_in_iNSTRUCTION461);  
                    stream_37.add(char_literal44);



                    // AST REWRITE
                    // elements: IDF, eXPRESSION, 41
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 59:43: -> ^( ':=' IDF eXPRESSION )
                    {
                        // Grammar.g:59:46: ^( ':=' IDF eXPRESSION )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_41.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_eXPRESSION.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Grammar.g:60:6: IfStat eXPRESSION ThenStat iNSTRUCTION ( 'else' iNSTRUCTION )? FiStat
                    {
                    IfStat45=(Token)match(input,IfStat,FOLLOW_IfStat_in_iNSTRUCTION478);  
                    stream_IfStat.add(IfStat45);

                    pushFollow(FOLLOW_eXPRESSION_in_iNSTRUCTION480);
                    eXPRESSION46=eXPRESSION();

                    state._fsp--;

                    stream_eXPRESSION.add(eXPRESSION46.getTree());
                    ThenStat47=(Token)match(input,ThenStat,FOLLOW_ThenStat_in_iNSTRUCTION482);  
                    stream_ThenStat.add(ThenStat47);

                    pushFollow(FOLLOW_iNSTRUCTION_in_iNSTRUCTION484);
                    iNSTRUCTION48=iNSTRUCTION();

                    state._fsp--;

                    stream_iNSTRUCTION.add(iNSTRUCTION48.getTree());
                    // Grammar.g:60:45: ( 'else' iNSTRUCTION )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==42) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // Grammar.g:60:46: 'else' iNSTRUCTION
                            {
                            string_literal49=(Token)match(input,42,FOLLOW_42_in_iNSTRUCTION487);  
                            stream_42.add(string_literal49);

                            pushFollow(FOLLOW_iNSTRUCTION_in_iNSTRUCTION489);
                            iNSTRUCTION50=iNSTRUCTION();

                            state._fsp--;

                            stream_iNSTRUCTION.add(iNSTRUCTION50.getTree());

                            }
                            break;

                    }

                    FiStat51=(Token)match(input,FiStat,FOLLOW_FiStat_in_iNSTRUCTION493);  
                    stream_FiStat.add(FiStat51);



                    // AST REWRITE
                    // elements: ThenStat, IfStat, 42, iNSTRUCTION, iNSTRUCTION, eXPRESSION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 60:74: -> ^( IfStat eXPRESSION ^( ThenStat iNSTRUCTION ) ( ^( 'else' iNSTRUCTION ) )? )
                    {
                        // Grammar.g:60:77: ^( IfStat eXPRESSION ^( ThenStat iNSTRUCTION ) ( ^( 'else' iNSTRUCTION ) )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IfStat.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_eXPRESSION.nextTree());
                        // Grammar.g:60:97: ^( ThenStat iNSTRUCTION )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ThenStat.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_iNSTRUCTION.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // Grammar.g:60:121: ( ^( 'else' iNSTRUCTION ) )?
                        if ( stream_42.hasNext()||stream_iNSTRUCTION.hasNext() ) {
                            // Grammar.g:60:121: ^( 'else' iNSTRUCTION )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_42.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_iNSTRUCTION.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_42.reset();
                        stream_iNSTRUCTION.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Grammar.g:61:6: ForStat IDF InStat eXPRESSION '..' eXPRESSION DoStat ( iNSTRUCTION )+ EndStat
                    {
                    ForStat52=(Token)match(input,ForStat,FOLLOW_ForStat_in_iNSTRUCTION521);  
                    stream_ForStat.add(ForStat52);

                    IDF53=(Token)match(input,IDF,FOLLOW_IDF_in_iNSTRUCTION523);  
                    stream_IDF.add(IDF53);

                    InStat54=(Token)match(input,InStat,FOLLOW_InStat_in_iNSTRUCTION525);  
                    stream_InStat.add(InStat54);

                    pushFollow(FOLLOW_eXPRESSION_in_iNSTRUCTION527);
                    eXPRESSION55=eXPRESSION();

                    state._fsp--;

                    stream_eXPRESSION.add(eXPRESSION55.getTree());
                    string_literal56=(Token)match(input,43,FOLLOW_43_in_iNSTRUCTION529);  
                    stream_43.add(string_literal56);

                    pushFollow(FOLLOW_eXPRESSION_in_iNSTRUCTION531);
                    eXPRESSION57=eXPRESSION();

                    state._fsp--;

                    stream_eXPRESSION.add(eXPRESSION57.getTree());
                    DoStat58=(Token)match(input,DoStat,FOLLOW_DoStat_in_iNSTRUCTION533);  
                    stream_DoStat.add(DoStat58);

                    // Grammar.g:61:59: ( iNSTRUCTION )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==IDF||LA13_0==IfStat||LA13_0==ForStat||LA13_0==DoStat||(LA13_0>=WriteStat && LA13_0<=ReturnStat)||LA13_0==38) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Grammar.g:61:59: iNSTRUCTION
                    	    {
                    	    pushFollow(FOLLOW_iNSTRUCTION_in_iNSTRUCTION535);
                    	    iNSTRUCTION59=iNSTRUCTION();

                    	    state._fsp--;

                    	    stream_iNSTRUCTION.add(iNSTRUCTION59.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    EndStat60=(Token)match(input,EndStat,FOLLOW_EndStat_in_iNSTRUCTION538);  
                    stream_EndStat.add(EndStat60);



                    // AST REWRITE
                    // elements: ForStat, InStat, eXPRESSION, DoStat, IDF, iNSTRUCTION, eXPRESSION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 61:80: -> ^( ForStat ^( InStat IDF eXPRESSION eXPRESSION ) ^( DoStat ( iNSTRUCTION )+ ) )
                    {
                        // Grammar.g:61:83: ^( ForStat ^( InStat IDF eXPRESSION eXPRESSION ) ^( DoStat ( iNSTRUCTION )+ ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ForStat.nextNode(), root_1);

                        // Grammar.g:61:93: ^( InStat IDF eXPRESSION eXPRESSION )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_InStat.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_IDF.nextNode());
                        adaptor.addChild(root_2, stream_eXPRESSION.nextTree());
                        adaptor.addChild(root_2, stream_eXPRESSION.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // Grammar.g:61:129: ^( DoStat ( iNSTRUCTION )+ )
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
                    // Grammar.g:62:6: '{' ( vAR_DECL )* ( iNSTRUCTION )+ '}'
                    {
                    char_literal61=(Token)match(input,38,FOLLOW_38_in_iNSTRUCTION568);  
                    stream_38.add(char_literal61);

                    // Grammar.g:62:10: ( vAR_DECL )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==VarStat) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Grammar.g:62:10: vAR_DECL
                    	    {
                    	    pushFollow(FOLLOW_vAR_DECL_in_iNSTRUCTION570);
                    	    vAR_DECL62=vAR_DECL();

                    	    state._fsp--;

                    	    stream_vAR_DECL.add(vAR_DECL62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // Grammar.g:62:20: ( iNSTRUCTION )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==IDF||LA15_0==IfStat||LA15_0==ForStat||LA15_0==DoStat||(LA15_0>=WriteStat && LA15_0<=ReturnStat)||LA15_0==38) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Grammar.g:62:20: iNSTRUCTION
                    	    {
                    	    pushFollow(FOLLOW_iNSTRUCTION_in_iNSTRUCTION573);
                    	    iNSTRUCTION63=iNSTRUCTION();

                    	    state._fsp--;

                    	    stream_iNSTRUCTION.add(iNSTRUCTION63.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    char_literal64=(Token)match(input,39,FOLLOW_39_in_iNSTRUCTION576);  
                    stream_39.add(char_literal64);



                    // AST REWRITE
                    // elements: vAR_DECL, iNSTRUCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 62:37: -> ^( Inner ( vAR_DECL )* ( iNSTRUCTION )* )
                    {
                        // Grammar.g:62:40: ^( Inner ( vAR_DECL )* ( iNSTRUCTION )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Inner, "Inner"), root_1);

                        // Grammar.g:62:48: ( vAR_DECL )*
                        while ( stream_vAR_DECL.hasNext() ) {
                            adaptor.addChild(root_1, stream_vAR_DECL.nextTree());

                        }
                        stream_vAR_DECL.reset();
                        // Grammar.g:62:58: ( iNSTRUCTION )*
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
                    // Grammar.g:63:6: DoStat eXPRESSION ';'
                    {
                    DoStat65=(Token)match(input,DoStat,FOLLOW_DoStat_in_iNSTRUCTION595);  
                    stream_DoStat.add(DoStat65);

                    pushFollow(FOLLOW_eXPRESSION_in_iNSTRUCTION597);
                    eXPRESSION66=eXPRESSION();

                    state._fsp--;

                    stream_eXPRESSION.add(eXPRESSION66.getTree());
                    char_literal67=(Token)match(input,37,FOLLOW_37_in_iNSTRUCTION598);  
                    stream_37.add(char_literal67);



                    // AST REWRITE
                    // elements: eXPRESSION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 63:27: -> ^( DoExpr eXPRESSION )
                    {
                        // Grammar.g:63:30: ^( DoExpr eXPRESSION )
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
                    // Grammar.g:64:6: pRINT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pRINT_in_iNSTRUCTION613);
                    pRINT68=pRINT();

                    state._fsp--;

                    adaptor.addChild(root_0, pRINT68.getTree());

                    }
                    break;
                case 7 :
                    // Grammar.g:65:6: rEAD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rEAD_in_iNSTRUCTION620);
                    rEAD69=rEAD();

                    state._fsp--;

                    adaptor.addChild(root_0, rEAD69.getTree());

                    }
                    break;
                case 8 :
                    // Grammar.g:66:6: rETURN2
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rETURN2_in_iNSTRUCTION627);
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
        }
        return retval;
    }
    // $ANTLR end "iNSTRUCTION"

    public static class pRINT_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pRINT"
    // Grammar.g:85:1: pRINT : WriteStat eXPRESSION ';' ;
    public final GrammarParser.pRINT_return pRINT() throws RecognitionException {
        GrammarParser.pRINT_return retval = new GrammarParser.pRINT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WriteStat71=null;
        Token char_literal73=null;
        GrammarParser.eXPRESSION_return eXPRESSION72 = null;


        CommonTree WriteStat71_tree=null;
        CommonTree char_literal73_tree=null;

        try {
            // Grammar.g:85:9: ( WriteStat eXPRESSION ';' )
            // Grammar.g:85:11: WriteStat eXPRESSION ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            WriteStat71=(Token)match(input,WriteStat,FOLLOW_WriteStat_in_pRINT743); 
            WriteStat71_tree = (CommonTree)adaptor.create(WriteStat71);
            root_0 = (CommonTree)adaptor.becomeRoot(WriteStat71_tree, root_0);

            pushFollow(FOLLOW_eXPRESSION_in_pRINT746);
            eXPRESSION72=eXPRESSION();

            state._fsp--;

            adaptor.addChild(root_0, eXPRESSION72.getTree());
            char_literal73=(Token)match(input,37,FOLLOW_37_in_pRINT748); 

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
        }
        return retval;
    }
    // $ANTLR end "pRINT"

    public static class rEAD_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rEAD"
    // Grammar.g:90:1: rEAD : ReadStat IDF ';' ;
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
            // Grammar.g:90:8: ( ReadStat IDF ';' )
            // Grammar.g:90:10: ReadStat IDF ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            ReadStat74=(Token)match(input,ReadStat,FOLLOW_ReadStat_in_rEAD777); 
            ReadStat74_tree = (CommonTree)adaptor.create(ReadStat74);
            root_0 = (CommonTree)adaptor.becomeRoot(ReadStat74_tree, root_0);

            IDF75=(Token)match(input,IDF,FOLLOW_IDF_in_rEAD780); 
            IDF75_tree = (CommonTree)adaptor.create(IDF75);
            adaptor.addChild(root_0, IDF75_tree);

            char_literal76=(Token)match(input,37,FOLLOW_37_in_rEAD782); 

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
        }
        return retval;
    }
    // $ANTLR end "rEAD"

    public static class rETURN2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rETURN2"
    // Grammar.g:94:1: rETURN2 : ReturnStat '(' eXPRESSION ')' ';' ;
    public final GrammarParser.rETURN2_return rETURN2() throws RecognitionException {
        GrammarParser.rETURN2_return retval = new GrammarParser.rETURN2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ReturnStat77=null;
        Token char_literal78=null;
        Token char_literal80=null;
        Token char_literal81=null;
        GrammarParser.eXPRESSION_return eXPRESSION79 = null;


        CommonTree ReturnStat77_tree=null;
        CommonTree char_literal78_tree=null;
        CommonTree char_literal80_tree=null;
        CommonTree char_literal81_tree=null;

        try {
            // Grammar.g:94:11: ( ReturnStat '(' eXPRESSION ')' ';' )
            // Grammar.g:94:13: ReturnStat '(' eXPRESSION ')' ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            ReturnStat77=(Token)match(input,ReturnStat,FOLLOW_ReturnStat_in_rETURN2809); 
            ReturnStat77_tree = (CommonTree)adaptor.create(ReturnStat77);
            root_0 = (CommonTree)adaptor.becomeRoot(ReturnStat77_tree, root_0);

            char_literal78=(Token)match(input,34,FOLLOW_34_in_rETURN2812); 
            pushFollow(FOLLOW_eXPRESSION_in_rETURN2815);
            eXPRESSION79=eXPRESSION();

            state._fsp--;

            adaptor.addChild(root_0, eXPRESSION79.getTree());
            char_literal80=(Token)match(input,35,FOLLOW_35_in_rETURN2817); 
            char_literal81=(Token)match(input,37,FOLLOW_37_in_rETURN2820); 

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
        }
        return retval;
    }
    // $ANTLR end "rETURN2"

    public static class aTOM_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aTOM"
    // Grammar.g:100:1: aTOM : ( INT | STRING | '(' eXPRESSION ')' | eXPRESSION2 );
    public final GrammarParser.aTOM_return aTOM() throws RecognitionException {
        GrammarParser.aTOM_return retval = new GrammarParser.aTOM_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT82=null;
        Token STRING83=null;
        Token char_literal84=null;
        Token char_literal86=null;
        GrammarParser.eXPRESSION_return eXPRESSION85 = null;

        GrammarParser.eXPRESSION2_return eXPRESSION287 = null;


        CommonTree INT82_tree=null;
        CommonTree STRING83_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree char_literal86_tree=null;

        try {
            // Grammar.g:100:9: ( INT | STRING | '(' eXPRESSION ')' | eXPRESSION2 )
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
            case 34:
                {
                alt17=3;
                }
                break;
            case IDF:
            case ThisStat:
            case SuperStat:
            case NewStat:
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
                    // Grammar.g:100:11: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT82=(Token)match(input,INT,FOLLOW_INT_in_aTOM853); 
                    INT82_tree = (CommonTree)adaptor.create(INT82);
                    adaptor.addChild(root_0, INT82_tree);


                    }
                    break;
                case 2 :
                    // Grammar.g:101:6: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING83=(Token)match(input,STRING,FOLLOW_STRING_in_aTOM860); 
                    STRING83_tree = (CommonTree)adaptor.create(STRING83);
                    adaptor.addChild(root_0, STRING83_tree);


                    }
                    break;
                case 3 :
                    // Grammar.g:102:6: '(' eXPRESSION ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal84=(Token)match(input,34,FOLLOW_34_in_aTOM867); 
                    pushFollow(FOLLOW_eXPRESSION_in_aTOM870);
                    eXPRESSION85=eXPRESSION();

                    state._fsp--;

                    adaptor.addChild(root_0, eXPRESSION85.getTree());
                    char_literal86=(Token)match(input,35,FOLLOW_35_in_aTOM872); 

                    }
                    break;
                case 4 :
                    // Grammar.g:103:5: eXPRESSION2
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_eXPRESSION2_in_aTOM879);
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
        }
        return retval;
    }
    // $ANTLR end "aTOM"

    public static class aTOMBIS_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aTOMBIS"
    // Grammar.g:106:1: aTOMBIS : ( ThisStat | IDF | SuperStat | NewStat IDFMAJ );
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
            // Grammar.g:106:11: ( ThisStat | IDF | SuperStat | NewStat IDFMAJ )
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
                    // Grammar.g:106:13: ThisStat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ThisStat88=(Token)match(input,ThisStat,FOLLOW_ThisStat_in_aTOMBIS896); 
                    ThisStat88_tree = (CommonTree)adaptor.create(ThisStat88);
                    adaptor.addChild(root_0, ThisStat88_tree);


                    }
                    break;
                case 2 :
                    // Grammar.g:107:5: IDF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDF89=(Token)match(input,IDF,FOLLOW_IDF_in_aTOMBIS902); 
                    IDF89_tree = (CommonTree)adaptor.create(IDF89);
                    adaptor.addChild(root_0, IDF89_tree);


                    }
                    break;
                case 3 :
                    // Grammar.g:108:5: SuperStat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SuperStat90=(Token)match(input,SuperStat,FOLLOW_SuperStat_in_aTOMBIS908); 
                    SuperStat90_tree = (CommonTree)adaptor.create(SuperStat90);
                    adaptor.addChild(root_0, SuperStat90_tree);


                    }
                    break;
                case 4 :
                    // Grammar.g:109:5: NewStat IDFMAJ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NewStat91=(Token)match(input,NewStat,FOLLOW_NewStat_in_aTOMBIS914); 
                    NewStat91_tree = (CommonTree)adaptor.create(NewStat91);
                    root_0 = (CommonTree)adaptor.becomeRoot(NewStat91_tree, root_0);

                    IDFMAJ92=(Token)match(input,IDFMAJ,FOLLOW_IDFMAJ_in_aTOMBIS917); 
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
        }
        return retval;
    }
    // $ANTLR end "aTOMBIS"

    public static class bOOLEXPR_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bOOLEXPR"
    // Grammar.g:113:1: bOOLEXPR : ( mOINEXPR | nOTMOINSEXPR ) ( BOOLOPER ( mOINEXPR | nOTMOINSEXPR ) )* ;
    public final GrammarParser.bOOLEXPR_return bOOLEXPR() throws RecognitionException {
        GrammarParser.bOOLEXPR_return retval = new GrammarParser.bOOLEXPR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BOOLOPER95=null;
        GrammarParser.mOINEXPR_return mOINEXPR93 = null;

        GrammarParser.nOTMOINSEXPR_return nOTMOINSEXPR94 = null;

        GrammarParser.mOINEXPR_return mOINEXPR96 = null;

        GrammarParser.nOTMOINSEXPR_return nOTMOINSEXPR97 = null;


        CommonTree BOOLOPER95_tree=null;

        try {
            // Grammar.g:113:12: ( ( mOINEXPR | nOTMOINSEXPR ) ( BOOLOPER ( mOINEXPR | nOTMOINSEXPR ) )* )
            // Grammar.g:113:14: ( mOINEXPR | nOTMOINSEXPR ) ( BOOLOPER ( mOINEXPR | nOTMOINSEXPR ) )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // Grammar.g:113:14: ( mOINEXPR | nOTMOINSEXPR )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                alt19=1;
            }
            else if ( (LA19_0==IDF||(LA19_0>=INT && LA19_0<=NewStat)||LA19_0==34) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // Grammar.g:113:15: mOINEXPR
                    {
                    pushFollow(FOLLOW_mOINEXPR_in_bOOLEXPR936);
                    mOINEXPR93=mOINEXPR();

                    state._fsp--;

                    adaptor.addChild(root_0, mOINEXPR93.getTree());

                    }
                    break;
                case 2 :
                    // Grammar.g:113:24: nOTMOINSEXPR
                    {
                    pushFollow(FOLLOW_nOTMOINSEXPR_in_bOOLEXPR938);
                    nOTMOINSEXPR94=nOTMOINSEXPR();

                    state._fsp--;

                    adaptor.addChild(root_0, nOTMOINSEXPR94.getTree());

                    }
                    break;

            }

            // Grammar.g:113:38: ( BOOLOPER ( mOINEXPR | nOTMOINSEXPR ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==BOOLOPER) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Grammar.g:113:39: BOOLOPER ( mOINEXPR | nOTMOINSEXPR )
            	    {
            	    BOOLOPER95=(Token)match(input,BOOLOPER,FOLLOW_BOOLOPER_in_bOOLEXPR942); 
            	    BOOLOPER95_tree = (CommonTree)adaptor.create(BOOLOPER95);
            	    root_0 = (CommonTree)adaptor.becomeRoot(BOOLOPER95_tree, root_0);

            	    // Grammar.g:113:49: ( mOINEXPR | nOTMOINSEXPR )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==47) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==IDF||(LA20_0>=INT && LA20_0<=NewStat)||LA20_0==34) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // Grammar.g:113:50: mOINEXPR
            	            {
            	            pushFollow(FOLLOW_mOINEXPR_in_bOOLEXPR946);
            	            mOINEXPR96=mOINEXPR();

            	            state._fsp--;

            	            adaptor.addChild(root_0, mOINEXPR96.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // Grammar.g:113:59: nOTMOINSEXPR
            	            {
            	            pushFollow(FOLLOW_nOTMOINSEXPR_in_bOOLEXPR948);
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
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "bOOLEXPR"

    public static class mULTEXPR_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mULTEXPR"
    // Grammar.g:116:1: mULTEXPR : bOOLEXPR ( ( '*' | '/' ) bOOLEXPR )* ;
    public final GrammarParser.mULTEXPR_return mULTEXPR() throws RecognitionException {
        GrammarParser.mULTEXPR_return retval = new GrammarParser.mULTEXPR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set99=null;
        GrammarParser.bOOLEXPR_return bOOLEXPR98 = null;

        GrammarParser.bOOLEXPR_return bOOLEXPR100 = null;


        CommonTree set99_tree=null;

        try {
            // Grammar.g:116:12: ( bOOLEXPR ( ( '*' | '/' ) bOOLEXPR )* )
            // Grammar.g:116:14: bOOLEXPR ( ( '*' | '/' ) bOOLEXPR )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bOOLEXPR_in_mULTEXPR965);
            bOOLEXPR98=bOOLEXPR();

            state._fsp--;

            adaptor.addChild(root_0, bOOLEXPR98.getTree());
            // Grammar.g:116:23: ( ( '*' | '/' ) bOOLEXPR )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=44 && LA22_0<=45)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Grammar.g:116:24: ( '*' | '/' ) bOOLEXPR
            	    {
            	    set99=(Token)input.LT(1);
            	    set99=(Token)input.LT(1);
            	    if ( (input.LA(1)>=44 && input.LA(1)<=45) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set99), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bOOLEXPR_in_mULTEXPR975);
            	    bOOLEXPR100=bOOLEXPR();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bOOLEXPR100.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "mULTEXPR"

    public static class aDDEXPR_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aDDEXPR"
    // Grammar.g:119:1: aDDEXPR : mULTEXPR ( ( '+' | '-' ) mULTEXPR )* ;
    public final GrammarParser.aDDEXPR_return aDDEXPR() throws RecognitionException {
        GrammarParser.aDDEXPR_return retval = new GrammarParser.aDDEXPR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set102=null;
        GrammarParser.mULTEXPR_return mULTEXPR101 = null;

        GrammarParser.mULTEXPR_return mULTEXPR103 = null;


        CommonTree set102_tree=null;

        try {
            // Grammar.g:119:11: ( mULTEXPR ( ( '+' | '-' ) mULTEXPR )* )
            // Grammar.g:119:13: mULTEXPR ( ( '+' | '-' ) mULTEXPR )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mULTEXPR_in_aDDEXPR991);
            mULTEXPR101=mULTEXPR();

            state._fsp--;

            adaptor.addChild(root_0, mULTEXPR101.getTree());
            // Grammar.g:119:22: ( ( '+' | '-' ) mULTEXPR )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=46 && LA23_0<=47)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Grammar.g:119:23: ( '+' | '-' ) mULTEXPR
            	    {
            	    set102=(Token)input.LT(1);
            	    set102=(Token)input.LT(1);
            	    if ( (input.LA(1)>=46 && input.LA(1)<=47) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set102), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mULTEXPR_in_aDDEXPR1001);
            	    mULTEXPR103=mULTEXPR();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mULTEXPR103.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "aDDEXPR"

    public static class mOINEXPR_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mOINEXPR"
    // Grammar.g:122:1: mOINEXPR : '-' aTOM -> ^( '-' aTOM ) ;
    public final GrammarParser.mOINEXPR_return mOINEXPR() throws RecognitionException {
        GrammarParser.mOINEXPR_return retval = new GrammarParser.mOINEXPR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal104=null;
        GrammarParser.aTOM_return aTOM105 = null;


        CommonTree char_literal104_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleSubtreeStream stream_aTOM=new RewriteRuleSubtreeStream(adaptor,"rule aTOM");
        try {
            // Grammar.g:122:11: ( '-' aTOM -> ^( '-' aTOM ) )
            // Grammar.g:122:13: '-' aTOM
            {
            char_literal104=(Token)match(input,47,FOLLOW_47_in_mOINEXPR1016);  
            stream_47.add(char_literal104);

            pushFollow(FOLLOW_aTOM_in_mOINEXPR1018);
            aTOM105=aTOM();

            state._fsp--;

            stream_aTOM.add(aTOM105.getTree());


            // AST REWRITE
            // elements: aTOM, 47
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 122:21: -> ^( '-' aTOM )
            {
                // Grammar.g:122:24: ^( '-' aTOM )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_47.nextNode(), root_1);

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
        }
        return retval;
    }
    // $ANTLR end "mOINEXPR"

    public static class nOTMOINSEXPR_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nOTMOINSEXPR"
    // Grammar.g:124:1: nOTMOINSEXPR : aTOM ;
    public final GrammarParser.nOTMOINSEXPR_return nOTMOINSEXPR() throws RecognitionException {
        GrammarParser.nOTMOINSEXPR_return retval = new GrammarParser.nOTMOINSEXPR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        GrammarParser.aTOM_return aTOM106 = null;



        try {
            // Grammar.g:124:16: ( aTOM )
            // Grammar.g:124:18: aTOM
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_aTOM_in_nOTMOINSEXPR1035);
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
        }
        return retval;
    }
    // $ANTLR end "nOTMOINSEXPR"

    public static class eXPRESSION_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eXPRESSION"
    // Grammar.g:126:1: eXPRESSION : aDDEXPR ;
    public final GrammarParser.eXPRESSION_return eXPRESSION() throws RecognitionException {
        GrammarParser.eXPRESSION_return retval = new GrammarParser.eXPRESSION_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        GrammarParser.aDDEXPR_return aDDEXPR107 = null;



        try {
            // Grammar.g:126:15: ( aDDEXPR )
            // Grammar.g:126:17: aDDEXPR
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_aDDEXPR_in_eXPRESSION1046);
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
        }
        return retval;
    }
    // $ANTLR end "eXPRESSION"

    public static class eXPRESSION2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eXPRESSION2"
    // Grammar.g:129:1: eXPRESSION2 : aTOMBIS ( sUITE )* ;
    public final GrammarParser.eXPRESSION2_return eXPRESSION2() throws RecognitionException {
        GrammarParser.eXPRESSION2_return retval = new GrammarParser.eXPRESSION2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        GrammarParser.aTOMBIS_return aTOMBIS108 = null;

        GrammarParser.sUITE_return sUITE109 = null;



        try {
            // Grammar.g:129:15: ( aTOMBIS ( sUITE )* )
            // Grammar.g:129:17: aTOMBIS ( sUITE )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_aTOMBIS_in_eXPRESSION21060);
            aTOMBIS108=aTOMBIS();

            state._fsp--;

            root_0 = (CommonTree)adaptor.becomeRoot(aTOMBIS108.getTree(), root_0);
            // Grammar.g:129:26: ( sUITE )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==48) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Grammar.g:129:26: sUITE
            	    {
            	    pushFollow(FOLLOW_sUITE_in_eXPRESSION21063);
            	    sUITE109=sUITE();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sUITE109.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "eXPRESSION2"

    public static class sUITE_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sUITE"
    // Grammar.g:131:1: sUITE : ( '.' IDF '(' ( eXPRESSION ( ',' eXPRESSION )* )? ')' ) ;
    public final GrammarParser.sUITE_return sUITE() throws RecognitionException {
        GrammarParser.sUITE_return retval = new GrammarParser.sUITE_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal110=null;
        Token IDF111=null;
        Token char_literal112=null;
        Token char_literal114=null;
        Token char_literal116=null;
        GrammarParser.eXPRESSION_return eXPRESSION113 = null;

        GrammarParser.eXPRESSION_return eXPRESSION115 = null;


        CommonTree char_literal110_tree=null;
        CommonTree IDF111_tree=null;
        CommonTree char_literal112_tree=null;
        CommonTree char_literal114_tree=null;
        CommonTree char_literal116_tree=null;

        try {
            // Grammar.g:131:10: ( ( '.' IDF '(' ( eXPRESSION ( ',' eXPRESSION )* )? ')' ) )
            // Grammar.g:131:12: ( '.' IDF '(' ( eXPRESSION ( ',' eXPRESSION )* )? ')' )
            {
            root_0 = (CommonTree)adaptor.nil();

            // Grammar.g:131:12: ( '.' IDF '(' ( eXPRESSION ( ',' eXPRESSION )* )? ')' )
            // Grammar.g:131:13: '.' IDF '(' ( eXPRESSION ( ',' eXPRESSION )* )? ')'
            {
            char_literal110=(Token)match(input,48,FOLLOW_48_in_sUITE1076); 
            IDF111=(Token)match(input,IDF,FOLLOW_IDF_in_sUITE1079); 
            IDF111_tree = (CommonTree)adaptor.create(IDF111);
            root_0 = (CommonTree)adaptor.becomeRoot(IDF111_tree, root_0);

            char_literal112=(Token)match(input,34,FOLLOW_34_in_sUITE1082); 
            // Grammar.g:131:28: ( eXPRESSION ( ',' eXPRESSION )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==IDF||(LA26_0>=INT && LA26_0<=NewStat)||LA26_0==34||LA26_0==47) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Grammar.g:131:29: eXPRESSION ( ',' eXPRESSION )*
                    {
                    pushFollow(FOLLOW_eXPRESSION_in_sUITE1086);
                    eXPRESSION113=eXPRESSION();

                    state._fsp--;

                    adaptor.addChild(root_0, eXPRESSION113.getTree());
                    // Grammar.g:131:40: ( ',' eXPRESSION )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==40) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // Grammar.g:131:41: ',' eXPRESSION
                    	    {
                    	    char_literal114=(Token)match(input,40,FOLLOW_40_in_sUITE1089); 
                    	    pushFollow(FOLLOW_eXPRESSION_in_sUITE1092);
                    	    eXPRESSION115=eXPRESSION();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, eXPRESSION115.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal116=(Token)match(input,35,FOLLOW_35_in_sUITE1098); 

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
        }
        return retval;
    }
    // $ANTLR end "sUITE"

    // Delegated rules


 

    public static final BitSet FOLLOW_pROGRAM_in_p80 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_p82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cLASS_DECL_in_pROGRAM100 = new BitSet(new long[]{0x0000004001D48C80L});
    public static final BitSet FOLLOW_vAR_DECL_in_pROGRAM103 = new BitSet(new long[]{0x0000004001D48C00L});
    public static final BitSet FOLLOW_iNSTRUCTION_in_pROGRAM106 = new BitSet(new long[]{0x0000004001D48C02L});
    public static final BitSet FOLLOW_ClassStat_in_cLASS_DECL122 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDFMAJ_in_cLASS_DECL124 = new BitSet(new long[]{0x0000000200000200L});
    public static final BitSet FOLLOW_InheritStat_in_cLASS_DECL127 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDFMAJ_in_cLASS_DECL129 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_cLASS_DECL133 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_cLASS_DECL136 = new BitSet(new long[]{0x0000000800004400L});
    public static final BitSet FOLLOW_cLASS_ITEM_DECL_in_cLASS_DECL138 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_cLASS_DECL140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vAR_DECL_in_cLASS_ITEM_DECL204 = new BitSet(new long[]{0x0000000000004402L});
    public static final BitSet FOLLOW_mETHOD_DECL_in_cLASS_ITEM_DECL207 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_VarStat_in_vAR_DECL223 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDF_in_vAR_DECL225 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_vAR_DECL227 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_tYPE_in_vAR_DECL229 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_vAR_DECL231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tYPE0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MethodStat_in_mETHOD_DECL310 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDF_in_mETHOD_DECL312 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_mETHOD_DECL314 = new BitSet(new long[]{0x0000000800000800L});
    public static final BitSet FOLLOW_mETHOD_ARGS_in_mETHOD_DECL316 = new BitSet(new long[]{0x0000000800000800L});
    public static final BitSet FOLLOW_35_in_mETHOD_DECL319 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_mETHOD_TYPE_in_mETHOD_DECL321 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_mETHOD_DECL323 = new BitSet(new long[]{0x0000004001D48C00L});
    public static final BitSet FOLLOW_vAR_DECL_in_mETHOD_DECL325 = new BitSet(new long[]{0x0000004001D48C00L});
    public static final BitSet FOLLOW_iNSTRUCTION_in_mETHOD_DECL328 = new BitSet(new long[]{0x000000C001D48C00L});
    public static final BitSet FOLLOW_39_in_mETHOD_DECL331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_mETHOD_TYPE366 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_tYPE_in_mETHOD_TYPE368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_mETHOD_ARGS412 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_mETHOD_ARGS414 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_tYPE_in_mETHOD_ARGS416 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_mETHOD_ARGS419 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDF_in_mETHOD_ARGS421 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_mETHOD_ARGS423 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_tYPE_in_mETHOD_ARGS425 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_IDF_in_iNSTRUCTION453 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_iNSTRUCTION455 = new BitSet(new long[]{0x000080043E000800L});
    public static final BitSet FOLLOW_eXPRESSION_in_iNSTRUCTION458 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_iNSTRUCTION461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IfStat_in_iNSTRUCTION478 = new BitSet(new long[]{0x000080043E000800L});
    public static final BitSet FOLLOW_eXPRESSION_in_iNSTRUCTION480 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ThenStat_in_iNSTRUCTION482 = new BitSet(new long[]{0x0000004001D48C00L});
    public static final BitSet FOLLOW_iNSTRUCTION_in_iNSTRUCTION484 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_42_in_iNSTRUCTION487 = new BitSet(new long[]{0x0000004001D48C00L});
    public static final BitSet FOLLOW_iNSTRUCTION_in_iNSTRUCTION489 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_FiStat_in_iNSTRUCTION493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ForStat_in_iNSTRUCTION521 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDF_in_iNSTRUCTION523 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_InStat_in_iNSTRUCTION525 = new BitSet(new long[]{0x000080043E000800L});
    public static final BitSet FOLLOW_eXPRESSION_in_iNSTRUCTION527 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_iNSTRUCTION529 = new BitSet(new long[]{0x000080043E000800L});
    public static final BitSet FOLLOW_eXPRESSION_in_iNSTRUCTION531 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DoStat_in_iNSTRUCTION533 = new BitSet(new long[]{0x0000004001D48C00L});
    public static final BitSet FOLLOW_iNSTRUCTION_in_iNSTRUCTION535 = new BitSet(new long[]{0x0000004001F48C00L});
    public static final BitSet FOLLOW_EndStat_in_iNSTRUCTION538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_iNSTRUCTION568 = new BitSet(new long[]{0x0000004001D48C00L});
    public static final BitSet FOLLOW_vAR_DECL_in_iNSTRUCTION570 = new BitSet(new long[]{0x0000004001D48C00L});
    public static final BitSet FOLLOW_iNSTRUCTION_in_iNSTRUCTION573 = new BitSet(new long[]{0x000000C001D48C00L});
    public static final BitSet FOLLOW_39_in_iNSTRUCTION576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoStat_in_iNSTRUCTION595 = new BitSet(new long[]{0x000080043E000800L});
    public static final BitSet FOLLOW_eXPRESSION_in_iNSTRUCTION597 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_iNSTRUCTION598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pRINT_in_iNSTRUCTION613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rEAD_in_iNSTRUCTION620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rETURN2_in_iNSTRUCTION627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WriteStat_in_pRINT743 = new BitSet(new long[]{0x000080043E000800L});
    public static final BitSet FOLLOW_eXPRESSION_in_pRINT746 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_pRINT748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ReadStat_in_rEAD777 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDF_in_rEAD780 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rEAD782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ReturnStat_in_rETURN2809 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rETURN2812 = new BitSet(new long[]{0x000080043E000800L});
    public static final BitSet FOLLOW_eXPRESSION_in_rETURN2815 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rETURN2817 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rETURN2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_aTOM853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_aTOM860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_aTOM867 = new BitSet(new long[]{0x000080043E000800L});
    public static final BitSet FOLLOW_eXPRESSION_in_aTOM870 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_aTOM872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eXPRESSION2_in_aTOM879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ThisStat_in_aTOMBIS896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_aTOMBIS902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SuperStat_in_aTOMBIS908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NewStat_in_aTOMBIS914 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDFMAJ_in_aTOMBIS917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mOINEXPR_in_bOOLEXPR936 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_nOTMOINSEXPR_in_bOOLEXPR938 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_BOOLOPER_in_bOOLEXPR942 = new BitSet(new long[]{0x000080043E000800L});
    public static final BitSet FOLLOW_mOINEXPR_in_bOOLEXPR946 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_nOTMOINSEXPR_in_bOOLEXPR948 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_bOOLEXPR_in_mULTEXPR965 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_set_in_mULTEXPR968 = new BitSet(new long[]{0x000080043E000800L});
    public static final BitSet FOLLOW_bOOLEXPR_in_mULTEXPR975 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_mULTEXPR_in_aDDEXPR991 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_set_in_aDDEXPR994 = new BitSet(new long[]{0x000080043E000800L});
    public static final BitSet FOLLOW_mULTEXPR_in_aDDEXPR1001 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_47_in_mOINEXPR1016 = new BitSet(new long[]{0x000080043E000800L});
    public static final BitSet FOLLOW_aTOM_in_mOINEXPR1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aTOM_in_nOTMOINSEXPR1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aDDEXPR_in_eXPRESSION1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aTOMBIS_in_eXPRESSION21060 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_sUITE_in_eXPRESSION21063 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_sUITE1076 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDF_in_sUITE1079 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_sUITE1082 = new BitSet(new long[]{0x0000800C3E000800L});
    public static final BitSet FOLLOW_eXPRESSION_in_sUITE1086 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_40_in_sUITE1089 = new BitSet(new long[]{0x000080043E000800L});
    public static final BitSet FOLLOW_eXPRESSION_in_sUITE1092 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_35_in_sUITE1098 = new BitSet(new long[]{0x0000000000000002L});

}