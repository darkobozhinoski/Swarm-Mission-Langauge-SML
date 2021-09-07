package be.uantwerpen.ansymo.missionspecification.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import be.uantwerpen.ansymo.missionspecification.services.MissionSpecificationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMissionSpecificationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_REAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'.'", "'Globally'", "'Before'", "'After'", "'Between'", "'and'", "'until'", "'it'", "'is'", "'always'", "'the'", "'case'", "'that'", "'holds'", "'never'", "'eventually'", "'at'", "'most'", "'times'", "'if'", "'then'", "'must'", "'have'", "'been'", "'has'", "'occurred'", "'beforehand'", "'in'", "'response'", "'todo'", "'also'", "'with'", "'as'", "'less'", "'than'", "'greater'", "'not'", "'a'", "'an'", "'task'", "'of'", "'team'", "'currently'", "'doing'", "'scheduled'", "'planned'", "'future'", "'finished'", "'performing'", "'on'", "'home'", "'area'", "'which'", "'visits'", "'will'", "'visit'", "'visited'", "'points'", "'initial'", "'position'", "'references'", "'true'", "'false'", "'-'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_REAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMissionSpecificationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMissionSpecificationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMissionSpecificationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMissionSpecification.g"; }



     	private MissionSpecificationGrammarAccess grammarAccess;

        public InternalMissionSpecificationParser(TokenStream input, MissionSpecificationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MissionSpecification";
       	}

       	@Override
       	protected MissionSpecificationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMissionSpecification"
    // InternalMissionSpecification.g:64:1: entryRuleMissionSpecification returns [EObject current=null] : iv_ruleMissionSpecification= ruleMissionSpecification EOF ;
    public final EObject entryRuleMissionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionSpecification = null;


        try {
            // InternalMissionSpecification.g:64:61: (iv_ruleMissionSpecification= ruleMissionSpecification EOF )
            // InternalMissionSpecification.g:65:2: iv_ruleMissionSpecification= ruleMissionSpecification EOF
            {
             newCompositeNode(grammarAccess.getMissionSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissionSpecification=ruleMissionSpecification();

            state._fsp--;

             current =iv_ruleMissionSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMissionSpecification"


    // $ANTLR start "ruleMissionSpecification"
    // InternalMissionSpecification.g:71:1: ruleMissionSpecification returns [EObject current=null] : ( (lv_properties_0_0= ruleProperty ) )+ ;
    public final EObject ruleMissionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_0_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:77:2: ( ( (lv_properties_0_0= ruleProperty ) )+ )
            // InternalMissionSpecification.g:78:2: ( (lv_properties_0_0= ruleProperty ) )+
            {
            // InternalMissionSpecification.g:78:2: ( (lv_properties_0_0= ruleProperty ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMissionSpecification.g:79:3: (lv_properties_0_0= ruleProperty )
            	    {
            	    // InternalMissionSpecification.g:79:3: (lv_properties_0_0= ruleProperty )
            	    // InternalMissionSpecification.g:80:4: lv_properties_0_0= ruleProperty
            	    {

            	    				newCompositeNode(grammarAccess.getMissionSpecificationAccess().getPropertiesPropertyParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_properties_0_0=ruleProperty();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMissionSpecificationRule());
            	    				}
            	    				add(
            	    					current,
            	    					"properties",
            	    					lv_properties_0_0,
            	    					"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Property");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMissionSpecification"


    // $ANTLR start "entryRuleProperty"
    // InternalMissionSpecification.g:100:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalMissionSpecification.g:100:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalMissionSpecification.g:101:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalMissionSpecification.g:107:1: ruleProperty returns [EObject current=null] : ( ( (lv_scope_0_0= ruleScope ) ) otherlv_1= ',' ( (lv_pattern_2_0= rulePattern ) ) (otherlv_3= '.' )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_scope_0_0 = null;

        EObject lv_pattern_2_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:113:2: ( ( ( (lv_scope_0_0= ruleScope ) ) otherlv_1= ',' ( (lv_pattern_2_0= rulePattern ) ) (otherlv_3= '.' )? ) )
            // InternalMissionSpecification.g:114:2: ( ( (lv_scope_0_0= ruleScope ) ) otherlv_1= ',' ( (lv_pattern_2_0= rulePattern ) ) (otherlv_3= '.' )? )
            {
            // InternalMissionSpecification.g:114:2: ( ( (lv_scope_0_0= ruleScope ) ) otherlv_1= ',' ( (lv_pattern_2_0= rulePattern ) ) (otherlv_3= '.' )? )
            // InternalMissionSpecification.g:115:3: ( (lv_scope_0_0= ruleScope ) ) otherlv_1= ',' ( (lv_pattern_2_0= rulePattern ) ) (otherlv_3= '.' )?
            {
            // InternalMissionSpecification.g:115:3: ( (lv_scope_0_0= ruleScope ) )
            // InternalMissionSpecification.g:116:4: (lv_scope_0_0= ruleScope )
            {
            // InternalMissionSpecification.g:116:4: (lv_scope_0_0= ruleScope )
            // InternalMissionSpecification.g:117:5: lv_scope_0_0= ruleScope
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getScopeScopeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_scope_0_0=ruleScope();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"scope",
            						lv_scope_0_0,
            						"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Scope");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getCommaKeyword_1());
            		
            // InternalMissionSpecification.g:138:3: ( (lv_pattern_2_0= rulePattern ) )
            // InternalMissionSpecification.g:139:4: (lv_pattern_2_0= rulePattern )
            {
            // InternalMissionSpecification.g:139:4: (lv_pattern_2_0= rulePattern )
            // InternalMissionSpecification.g:140:5: lv_pattern_2_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getPatternPatternParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_pattern_2_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_2_0,
            						"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMissionSpecification.g:157:3: (otherlv_3= '.' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMissionSpecification.g:158:4: otherlv_3= '.'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getFullStopKeyword_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleScope"
    // InternalMissionSpecification.g:167:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalMissionSpecification.g:167:46: (iv_ruleScope= ruleScope EOF )
            // InternalMissionSpecification.g:168:2: iv_ruleScope= ruleScope EOF
            {
             newCompositeNode(grammarAccess.getScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;

             current =iv_ruleScope; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalMissionSpecification.g:174:1: ruleScope returns [EObject current=null] : ( ( () otherlv_1= 'Globally' ) | ( () otherlv_3= 'Before' ( (lv_r_4_0= ruleProposition ) ) ) | ( () otherlv_6= 'After' ( (lv_q_7_0= ruleProposition ) ) ) | ( () otherlv_9= 'Between' ( (lv_q_10_0= ruleProposition ) ) otherlv_11= ',' otherlv_12= 'and' ( (lv_r_13_0= ruleProposition ) ) ) | ( () otherlv_15= 'After' ( (lv_q_16_0= ruleProposition ) ) otherlv_17= ',' otherlv_18= 'until' ( (lv_r_19_0= ruleProposition ) ) ) ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_r_4_0 = null;

        EObject lv_q_7_0 = null;

        EObject lv_q_10_0 = null;

        EObject lv_r_13_0 = null;

        EObject lv_q_16_0 = null;

        EObject lv_r_19_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:180:2: ( ( ( () otherlv_1= 'Globally' ) | ( () otherlv_3= 'Before' ( (lv_r_4_0= ruleProposition ) ) ) | ( () otherlv_6= 'After' ( (lv_q_7_0= ruleProposition ) ) ) | ( () otherlv_9= 'Between' ( (lv_q_10_0= ruleProposition ) ) otherlv_11= ',' otherlv_12= 'and' ( (lv_r_13_0= ruleProposition ) ) ) | ( () otherlv_15= 'After' ( (lv_q_16_0= ruleProposition ) ) otherlv_17= ',' otherlv_18= 'until' ( (lv_r_19_0= ruleProposition ) ) ) ) )
            // InternalMissionSpecification.g:181:2: ( ( () otherlv_1= 'Globally' ) | ( () otherlv_3= 'Before' ( (lv_r_4_0= ruleProposition ) ) ) | ( () otherlv_6= 'After' ( (lv_q_7_0= ruleProposition ) ) ) | ( () otherlv_9= 'Between' ( (lv_q_10_0= ruleProposition ) ) otherlv_11= ',' otherlv_12= 'and' ( (lv_r_13_0= ruleProposition ) ) ) | ( () otherlv_15= 'After' ( (lv_q_16_0= ruleProposition ) ) otherlv_17= ',' otherlv_18= 'until' ( (lv_r_19_0= ruleProposition ) ) ) )
            {
            // InternalMissionSpecification.g:181:2: ( ( () otherlv_1= 'Globally' ) | ( () otherlv_3= 'Before' ( (lv_r_4_0= ruleProposition ) ) ) | ( () otherlv_6= 'After' ( (lv_q_7_0= ruleProposition ) ) ) | ( () otherlv_9= 'Between' ( (lv_q_10_0= ruleProposition ) ) otherlv_11= ',' otherlv_12= 'and' ( (lv_r_13_0= ruleProposition ) ) ) | ( () otherlv_15= 'After' ( (lv_q_16_0= ruleProposition ) ) otherlv_17= ',' otherlv_18= 'until' ( (lv_r_19_0= ruleProposition ) ) ) )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMissionSpecification.g:182:3: ( () otherlv_1= 'Globally' )
                    {
                    // InternalMissionSpecification.g:182:3: ( () otherlv_1= 'Globally' )
                    // InternalMissionSpecification.g:183:4: () otherlv_1= 'Globally'
                    {
                    // InternalMissionSpecification.g:183:4: ()
                    // InternalMissionSpecification.g:184:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getGlobalScopeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getScopeAccess().getGloballyKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMissionSpecification.g:196:3: ( () otherlv_3= 'Before' ( (lv_r_4_0= ruleProposition ) ) )
                    {
                    // InternalMissionSpecification.g:196:3: ( () otherlv_3= 'Before' ( (lv_r_4_0= ruleProposition ) ) )
                    // InternalMissionSpecification.g:197:4: () otherlv_3= 'Before' ( (lv_r_4_0= ruleProposition ) )
                    {
                    // InternalMissionSpecification.g:197:4: ()
                    // InternalMissionSpecification.g:198:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getBeforeScopeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getScopeAccess().getBeforeKeyword_1_1());
                    			
                    // InternalMissionSpecification.g:208:4: ( (lv_r_4_0= ruleProposition ) )
                    // InternalMissionSpecification.g:209:5: (lv_r_4_0= ruleProposition )
                    {
                    // InternalMissionSpecification.g:209:5: (lv_r_4_0= ruleProposition )
                    // InternalMissionSpecification.g:210:6: lv_r_4_0= ruleProposition
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getRPropositionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_r_4_0=ruleProposition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"r",
                    							lv_r_4_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Proposition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMissionSpecification.g:229:3: ( () otherlv_6= 'After' ( (lv_q_7_0= ruleProposition ) ) )
                    {
                    // InternalMissionSpecification.g:229:3: ( () otherlv_6= 'After' ( (lv_q_7_0= ruleProposition ) ) )
                    // InternalMissionSpecification.g:230:4: () otherlv_6= 'After' ( (lv_q_7_0= ruleProposition ) )
                    {
                    // InternalMissionSpecification.g:230:4: ()
                    // InternalMissionSpecification.g:231:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getAfterScopeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getScopeAccess().getAfterKeyword_2_1());
                    			
                    // InternalMissionSpecification.g:241:4: ( (lv_q_7_0= ruleProposition ) )
                    // InternalMissionSpecification.g:242:5: (lv_q_7_0= ruleProposition )
                    {
                    // InternalMissionSpecification.g:242:5: (lv_q_7_0= ruleProposition )
                    // InternalMissionSpecification.g:243:6: lv_q_7_0= ruleProposition
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getQPropositionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_q_7_0=ruleProposition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"q",
                    							lv_q_7_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Proposition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMissionSpecification.g:262:3: ( () otherlv_9= 'Between' ( (lv_q_10_0= ruleProposition ) ) otherlv_11= ',' otherlv_12= 'and' ( (lv_r_13_0= ruleProposition ) ) )
                    {
                    // InternalMissionSpecification.g:262:3: ( () otherlv_9= 'Between' ( (lv_q_10_0= ruleProposition ) ) otherlv_11= ',' otherlv_12= 'and' ( (lv_r_13_0= ruleProposition ) ) )
                    // InternalMissionSpecification.g:263:4: () otherlv_9= 'Between' ( (lv_q_10_0= ruleProposition ) ) otherlv_11= ',' otherlv_12= 'and' ( (lv_r_13_0= ruleProposition ) )
                    {
                    // InternalMissionSpecification.g:263:4: ()
                    // InternalMissionSpecification.g:264:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getBetweenScopeAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getScopeAccess().getBetweenKeyword_3_1());
                    			
                    // InternalMissionSpecification.g:274:4: ( (lv_q_10_0= ruleProposition ) )
                    // InternalMissionSpecification.g:275:5: (lv_q_10_0= ruleProposition )
                    {
                    // InternalMissionSpecification.g:275:5: (lv_q_10_0= ruleProposition )
                    // InternalMissionSpecification.g:276:6: lv_q_10_0= ruleProposition
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getQPropositionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_q_10_0=ruleProposition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"q",
                    							lv_q_10_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Proposition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getScopeAccess().getCommaKeyword_3_3());
                    			
                    otherlv_12=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getScopeAccess().getAndKeyword_3_4());
                    			
                    // InternalMissionSpecification.g:301:4: ( (lv_r_13_0= ruleProposition ) )
                    // InternalMissionSpecification.g:302:5: (lv_r_13_0= ruleProposition )
                    {
                    // InternalMissionSpecification.g:302:5: (lv_r_13_0= ruleProposition )
                    // InternalMissionSpecification.g:303:6: lv_r_13_0= ruleProposition
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getRPropositionParserRuleCall_3_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_r_13_0=ruleProposition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"r",
                    							lv_r_13_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Proposition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMissionSpecification.g:322:3: ( () otherlv_15= 'After' ( (lv_q_16_0= ruleProposition ) ) otherlv_17= ',' otherlv_18= 'until' ( (lv_r_19_0= ruleProposition ) ) )
                    {
                    // InternalMissionSpecification.g:322:3: ( () otherlv_15= 'After' ( (lv_q_16_0= ruleProposition ) ) otherlv_17= ',' otherlv_18= 'until' ( (lv_r_19_0= ruleProposition ) ) )
                    // InternalMissionSpecification.g:323:4: () otherlv_15= 'After' ( (lv_q_16_0= ruleProposition ) ) otherlv_17= ',' otherlv_18= 'until' ( (lv_r_19_0= ruleProposition ) )
                    {
                    // InternalMissionSpecification.g:323:4: ()
                    // InternalMissionSpecification.g:324:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getAfterUntilScopeAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_15=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getScopeAccess().getAfterKeyword_4_1());
                    			
                    // InternalMissionSpecification.g:334:4: ( (lv_q_16_0= ruleProposition ) )
                    // InternalMissionSpecification.g:335:5: (lv_q_16_0= ruleProposition )
                    {
                    // InternalMissionSpecification.g:335:5: (lv_q_16_0= ruleProposition )
                    // InternalMissionSpecification.g:336:6: lv_q_16_0= ruleProposition
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getQPropositionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_q_16_0=ruleProposition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"q",
                    							lv_q_16_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Proposition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_17, grammarAccess.getScopeAccess().getCommaKeyword_4_3());
                    			
                    otherlv_18=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_18, grammarAccess.getScopeAccess().getUntilKeyword_4_4());
                    			
                    // InternalMissionSpecification.g:361:4: ( (lv_r_19_0= ruleProposition ) )
                    // InternalMissionSpecification.g:362:5: (lv_r_19_0= ruleProposition )
                    {
                    // InternalMissionSpecification.g:362:5: (lv_r_19_0= ruleProposition )
                    // InternalMissionSpecification.g:363:6: lv_r_19_0= ruleProposition
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getRPropositionParserRuleCall_4_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_r_19_0=ruleProposition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"r",
                    							lv_r_19_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Proposition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRulePattern"
    // InternalMissionSpecification.g:385:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalMissionSpecification.g:385:48: (iv_rulePattern= rulePattern EOF )
            // InternalMissionSpecification.g:386:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalMissionSpecification.g:392:1: rulePattern returns [EObject current=null] : (this_Occurence_0= ruleOccurence | this_Order_1= ruleOrder ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        EObject this_Occurence_0 = null;

        EObject this_Order_1 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:398:2: ( (this_Occurence_0= ruleOccurence | this_Order_1= ruleOrder ) )
            // InternalMissionSpecification.g:399:2: (this_Occurence_0= ruleOccurence | this_Order_1= ruleOrder )
            {
            // InternalMissionSpecification.g:399:2: (this_Occurence_0= ruleOccurence | this_Order_1= ruleOrder )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==20||LA4_0==42||(LA4_0>=50 && LA4_0<=51)) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMissionSpecification.g:400:3: this_Occurence_0= ruleOccurence
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getOccurenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Occurence_0=ruleOccurence();

                    state._fsp--;


                    			current = this_Occurence_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMissionSpecification.g:409:3: this_Order_1= ruleOrder
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getOrderParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Order_1=ruleOrder();

                    state._fsp--;


                    			current = this_Order_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleOccurence"
    // InternalMissionSpecification.g:421:1: entryRuleOccurence returns [EObject current=null] : iv_ruleOccurence= ruleOccurence EOF ;
    public final EObject entryRuleOccurence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurence = null;


        try {
            // InternalMissionSpecification.g:421:50: (iv_ruleOccurence= ruleOccurence EOF )
            // InternalMissionSpecification.g:422:2: iv_ruleOccurence= ruleOccurence EOF
            {
             newCompositeNode(grammarAccess.getOccurenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOccurence=ruleOccurence();

            state._fsp--;

             current =iv_ruleOccurence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOccurence"


    // $ANTLR start "ruleOccurence"
    // InternalMissionSpecification.g:428:1: ruleOccurence returns [EObject current=null] : (this_Universality_0= ruleUniversality | this_Absence_1= ruleAbsence | this_Existence_2= ruleExistence | this_BoundedExistence_3= ruleBoundedExistence ) ;
    public final EObject ruleOccurence() throws RecognitionException {
        EObject current = null;

        EObject this_Universality_0 = null;

        EObject this_Absence_1 = null;

        EObject this_Existence_2 = null;

        EObject this_BoundedExistence_3 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:434:2: ( (this_Universality_0= ruleUniversality | this_Absence_1= ruleAbsence | this_Existence_2= ruleExistence | this_BoundedExistence_3= ruleBoundedExistence ) )
            // InternalMissionSpecification.g:435:2: (this_Universality_0= ruleUniversality | this_Absence_1= ruleAbsence | this_Existence_2= ruleExistence | this_BoundedExistence_3= ruleBoundedExistence )
            {
            // InternalMissionSpecification.g:435:2: (this_Universality_0= ruleUniversality | this_Absence_1= ruleAbsence | this_Existence_2= ruleExistence | this_BoundedExistence_3= ruleBoundedExistence )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalMissionSpecification.g:436:3: this_Universality_0= ruleUniversality
                    {

                    			newCompositeNode(grammarAccess.getOccurenceAccess().getUniversalityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Universality_0=ruleUniversality();

                    state._fsp--;


                    			current = this_Universality_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMissionSpecification.g:445:3: this_Absence_1= ruleAbsence
                    {

                    			newCompositeNode(grammarAccess.getOccurenceAccess().getAbsenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Absence_1=ruleAbsence();

                    state._fsp--;


                    			current = this_Absence_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMissionSpecification.g:454:3: this_Existence_2= ruleExistence
                    {

                    			newCompositeNode(grammarAccess.getOccurenceAccess().getExistenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Existence_2=ruleExistence();

                    state._fsp--;


                    			current = this_Existence_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMissionSpecification.g:463:3: this_BoundedExistence_3= ruleBoundedExistence
                    {

                    			newCompositeNode(grammarAccess.getOccurenceAccess().getBoundedExistenceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoundedExistence_3=ruleBoundedExistence();

                    state._fsp--;


                    			current = this_BoundedExistence_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOccurence"


    // $ANTLR start "entryRuleUniversality"
    // InternalMissionSpecification.g:475:1: entryRuleUniversality returns [EObject current=null] : iv_ruleUniversality= ruleUniversality EOF ;
    public final EObject entryRuleUniversality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversality = null;


        try {
            // InternalMissionSpecification.g:475:53: (iv_ruleUniversality= ruleUniversality EOF )
            // InternalMissionSpecification.g:476:2: iv_ruleUniversality= ruleUniversality EOF
            {
             newCompositeNode(grammarAccess.getUniversalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUniversality=ruleUniversality();

            state._fsp--;

             current =iv_ruleUniversality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUniversality"


    // $ANTLR start "ruleUniversality"
    // InternalMissionSpecification.g:482:1: ruleUniversality returns [EObject current=null] : (otherlv_0= 'it' otherlv_1= 'is' otherlv_2= 'always' otherlv_3= 'the' otherlv_4= 'case' otherlv_5= 'that' ( (lv_p_6_0= ruleProposition ) ) (otherlv_7= 'holds' )? ) ;
    public final EObject ruleUniversality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_p_6_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:488:2: ( (otherlv_0= 'it' otherlv_1= 'is' otherlv_2= 'always' otherlv_3= 'the' otherlv_4= 'case' otherlv_5= 'that' ( (lv_p_6_0= ruleProposition ) ) (otherlv_7= 'holds' )? ) )
            // InternalMissionSpecification.g:489:2: (otherlv_0= 'it' otherlv_1= 'is' otherlv_2= 'always' otherlv_3= 'the' otherlv_4= 'case' otherlv_5= 'that' ( (lv_p_6_0= ruleProposition ) ) (otherlv_7= 'holds' )? )
            {
            // InternalMissionSpecification.g:489:2: (otherlv_0= 'it' otherlv_1= 'is' otherlv_2= 'always' otherlv_3= 'the' otherlv_4= 'case' otherlv_5= 'that' ( (lv_p_6_0= ruleProposition ) ) (otherlv_7= 'holds' )? )
            // InternalMissionSpecification.g:490:3: otherlv_0= 'it' otherlv_1= 'is' otherlv_2= 'always' otherlv_3= 'the' otherlv_4= 'case' otherlv_5= 'that' ( (lv_p_6_0= ruleProposition ) ) (otherlv_7= 'holds' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUniversalityAccess().getItKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getUniversalityAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getUniversalityAccess().getAlwaysKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getUniversalityAccess().getTheKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getUniversalityAccess().getCaseKeyword_4());
            		
            otherlv_5=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getUniversalityAccess().getThatKeyword_5());
            		
            // InternalMissionSpecification.g:514:3: ( (lv_p_6_0= ruleProposition ) )
            // InternalMissionSpecification.g:515:4: (lv_p_6_0= ruleProposition )
            {
            // InternalMissionSpecification.g:515:4: (lv_p_6_0= ruleProposition )
            // InternalMissionSpecification.g:516:5: lv_p_6_0= ruleProposition
            {

            					newCompositeNode(grammarAccess.getUniversalityAccess().getPPropositionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_p_6_0=ruleProposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniversalityRule());
            					}
            					set(
            						current,
            						"p",
            						lv_p_6_0,
            						"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Proposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMissionSpecification.g:533:3: (otherlv_7= 'holds' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMissionSpecification.g:534:4: otherlv_7= 'holds'
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getUniversalityAccess().getHoldsKeyword_7());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUniversality"


    // $ANTLR start "entryRuleAbsence"
    // InternalMissionSpecification.g:543:1: entryRuleAbsence returns [EObject current=null] : iv_ruleAbsence= ruleAbsence EOF ;
    public final EObject entryRuleAbsence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsence = null;


        try {
            // InternalMissionSpecification.g:543:48: (iv_ruleAbsence= ruleAbsence EOF )
            // InternalMissionSpecification.g:544:2: iv_ruleAbsence= ruleAbsence EOF
            {
             newCompositeNode(grammarAccess.getAbsenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbsence=ruleAbsence();

            state._fsp--;

             current =iv_ruleAbsence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbsence"


    // $ANTLR start "ruleAbsence"
    // InternalMissionSpecification.g:550:1: ruleAbsence returns [EObject current=null] : (otherlv_0= 'it' otherlv_1= 'is' otherlv_2= 'never' otherlv_3= 'the' otherlv_4= 'case' otherlv_5= 'that' ( (lv_p_6_0= ruleProposition ) ) (otherlv_7= 'holds' )? ) ;
    public final EObject ruleAbsence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_p_6_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:556:2: ( (otherlv_0= 'it' otherlv_1= 'is' otherlv_2= 'never' otherlv_3= 'the' otherlv_4= 'case' otherlv_5= 'that' ( (lv_p_6_0= ruleProposition ) ) (otherlv_7= 'holds' )? ) )
            // InternalMissionSpecification.g:557:2: (otherlv_0= 'it' otherlv_1= 'is' otherlv_2= 'never' otherlv_3= 'the' otherlv_4= 'case' otherlv_5= 'that' ( (lv_p_6_0= ruleProposition ) ) (otherlv_7= 'holds' )? )
            {
            // InternalMissionSpecification.g:557:2: (otherlv_0= 'it' otherlv_1= 'is' otherlv_2= 'never' otherlv_3= 'the' otherlv_4= 'case' otherlv_5= 'that' ( (lv_p_6_0= ruleProposition ) ) (otherlv_7= 'holds' )? )
            // InternalMissionSpecification.g:558:3: otherlv_0= 'it' otherlv_1= 'is' otherlv_2= 'never' otherlv_3= 'the' otherlv_4= 'case' otherlv_5= 'that' ( (lv_p_6_0= ruleProposition ) ) (otherlv_7= 'holds' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAbsenceAccess().getItKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getAbsenceAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAbsenceAccess().getNeverKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAbsenceAccess().getTheKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getAbsenceAccess().getCaseKeyword_4());
            		
            otherlv_5=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getAbsenceAccess().getThatKeyword_5());
            		
            // InternalMissionSpecification.g:582:3: ( (lv_p_6_0= ruleProposition ) )
            // InternalMissionSpecification.g:583:4: (lv_p_6_0= ruleProposition )
            {
            // InternalMissionSpecification.g:583:4: (lv_p_6_0= ruleProposition )
            // InternalMissionSpecification.g:584:5: lv_p_6_0= ruleProposition
            {

            					newCompositeNode(grammarAccess.getAbsenceAccess().getPPropositionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_p_6_0=ruleProposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsenceRule());
            					}
            					set(
            						current,
            						"p",
            						lv_p_6_0,
            						"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Proposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMissionSpecification.g:601:3: (otherlv_7= 'holds' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMissionSpecification.g:602:4: otherlv_7= 'holds'
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getAbsenceAccess().getHoldsKeyword_7());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbsence"


    // $ANTLR start "entryRuleExistence"
    // InternalMissionSpecification.g:611:1: entryRuleExistence returns [EObject current=null] : iv_ruleExistence= ruleExistence EOF ;
    public final EObject entryRuleExistence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistence = null;


        try {
            // InternalMissionSpecification.g:611:50: (iv_ruleExistence= ruleExistence EOF )
            // InternalMissionSpecification.g:612:2: iv_ruleExistence= ruleExistence EOF
            {
             newCompositeNode(grammarAccess.getExistenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistence=ruleExistence();

            state._fsp--;

             current =iv_ruleExistence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistence"


    // $ANTLR start "ruleExistence"
    // InternalMissionSpecification.g:618:1: ruleExistence returns [EObject current=null] : ( ( (lv_p_0_0= ruleProposition ) ) (otherlv_1= 'holds' )? otherlv_2= 'eventually' ) ;
    public final EObject ruleExistence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_p_0_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:624:2: ( ( ( (lv_p_0_0= ruleProposition ) ) (otherlv_1= 'holds' )? otherlv_2= 'eventually' ) )
            // InternalMissionSpecification.g:625:2: ( ( (lv_p_0_0= ruleProposition ) ) (otherlv_1= 'holds' )? otherlv_2= 'eventually' )
            {
            // InternalMissionSpecification.g:625:2: ( ( (lv_p_0_0= ruleProposition ) ) (otherlv_1= 'holds' )? otherlv_2= 'eventually' )
            // InternalMissionSpecification.g:626:3: ( (lv_p_0_0= ruleProposition ) ) (otherlv_1= 'holds' )? otherlv_2= 'eventually'
            {
            // InternalMissionSpecification.g:626:3: ( (lv_p_0_0= ruleProposition ) )
            // InternalMissionSpecification.g:627:4: (lv_p_0_0= ruleProposition )
            {
            // InternalMissionSpecification.g:627:4: (lv_p_0_0= ruleProposition )
            // InternalMissionSpecification.g:628:5: lv_p_0_0= ruleProposition
            {

            					newCompositeNode(grammarAccess.getExistenceAccess().getPPropositionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_p_0_0=ruleProposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistenceRule());
            					}
            					set(
            						current,
            						"p",
            						lv_p_0_0,
            						"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Proposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMissionSpecification.g:645:3: (otherlv_1= 'holds' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMissionSpecification.g:646:4: otherlv_1= 'holds'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getExistenceAccess().getHoldsKeyword_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExistenceAccess().getEventuallyKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistence"


    // $ANTLR start "entryRuleBoundedExistence"
    // InternalMissionSpecification.g:659:1: entryRuleBoundedExistence returns [EObject current=null] : iv_ruleBoundedExistence= ruleBoundedExistence EOF ;
    public final EObject entryRuleBoundedExistence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundedExistence = null;


        try {
            // InternalMissionSpecification.g:659:57: (iv_ruleBoundedExistence= ruleBoundedExistence EOF )
            // InternalMissionSpecification.g:660:2: iv_ruleBoundedExistence= ruleBoundedExistence EOF
            {
             newCompositeNode(grammarAccess.getBoundedExistenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundedExistence=ruleBoundedExistence();

            state._fsp--;

             current =iv_ruleBoundedExistence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoundedExistence"


    // $ANTLR start "ruleBoundedExistence"
    // InternalMissionSpecification.g:666:1: ruleBoundedExistence returns [EObject current=null] : ( ( (lv_p_0_0= ruleProposition ) ) (otherlv_1= 'holds' )? otherlv_2= 'at' otherlv_3= 'most' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= 'times' ) ;
    public final EObject ruleBoundedExistence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_n_4_0=null;
        Token otherlv_5=null;
        EObject lv_p_0_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:672:2: ( ( ( (lv_p_0_0= ruleProposition ) ) (otherlv_1= 'holds' )? otherlv_2= 'at' otherlv_3= 'most' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= 'times' ) )
            // InternalMissionSpecification.g:673:2: ( ( (lv_p_0_0= ruleProposition ) ) (otherlv_1= 'holds' )? otherlv_2= 'at' otherlv_3= 'most' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= 'times' )
            {
            // InternalMissionSpecification.g:673:2: ( ( (lv_p_0_0= ruleProposition ) ) (otherlv_1= 'holds' )? otherlv_2= 'at' otherlv_3= 'most' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= 'times' )
            // InternalMissionSpecification.g:674:3: ( (lv_p_0_0= ruleProposition ) ) (otherlv_1= 'holds' )? otherlv_2= 'at' otherlv_3= 'most' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= 'times'
            {
            // InternalMissionSpecification.g:674:3: ( (lv_p_0_0= ruleProposition ) )
            // InternalMissionSpecification.g:675:4: (lv_p_0_0= ruleProposition )
            {
            // InternalMissionSpecification.g:675:4: (lv_p_0_0= ruleProposition )
            // InternalMissionSpecification.g:676:5: lv_p_0_0= ruleProposition
            {

            					newCompositeNode(grammarAccess.getBoundedExistenceAccess().getPPropositionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_p_0_0=ruleProposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoundedExistenceRule());
            					}
            					set(
            						current,
            						"p",
            						lv_p_0_0,
            						"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Proposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMissionSpecification.g:693:3: (otherlv_1= 'holds' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMissionSpecification.g:694:4: otherlv_1= 'holds'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getBoundedExistenceAccess().getHoldsKeyword_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getBoundedExistenceAccess().getAtKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getBoundedExistenceAccess().getMostKeyword_3());
            		
            // InternalMissionSpecification.g:707:3: ( (lv_n_4_0= RULE_INT ) )
            // InternalMissionSpecification.g:708:4: (lv_n_4_0= RULE_INT )
            {
            // InternalMissionSpecification.g:708:4: (lv_n_4_0= RULE_INT )
            // InternalMissionSpecification.g:709:5: lv_n_4_0= RULE_INT
            {
            lv_n_4_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_n_4_0, grammarAccess.getBoundedExistenceAccess().getNINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoundedExistenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"n",
            						lv_n_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBoundedExistenceAccess().getTimesKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoundedExistence"


    // $ANTLR start "entryRuleOrder"
    // InternalMissionSpecification.g:733:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalMissionSpecification.g:733:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalMissionSpecification.g:734:2: iv_ruleOrder= ruleOrder EOF
            {
             newCompositeNode(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrder=ruleOrder();

            state._fsp--;

             current =iv_ruleOrder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalMissionSpecification.g:740:1: ruleOrder returns [EObject current=null] : (this_Precedence_0= rulePrecedence | this_Response_1= ruleResponse ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        EObject this_Precedence_0 = null;

        EObject this_Response_1 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:746:2: ( (this_Precedence_0= rulePrecedence | this_Response_1= ruleResponse ) )
            // InternalMissionSpecification.g:747:2: (this_Precedence_0= rulePrecedence | this_Response_1= ruleResponse )
            {
            // InternalMissionSpecification.g:747:2: (this_Precedence_0= rulePrecedence | this_Response_1= ruleResponse )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalMissionSpecification.g:748:3: this_Precedence_0= rulePrecedence
                    {

                    			newCompositeNode(grammarAccess.getOrderAccess().getPrecedenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Precedence_0=rulePrecedence();

                    state._fsp--;


                    			current = this_Precedence_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMissionSpecification.g:757:3: this_Response_1= ruleResponse
                    {

                    			newCompositeNode(grammarAccess.getOrderAccess().getResponseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Response_1=ruleResponse();

                    state._fsp--;


                    			current = this_Response_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRulePrecedence"
    // InternalMissionSpecification.g:769:1: entryRulePrecedence returns [EObject current=null] : iv_rulePrecedence= rulePrecedence EOF ;
    public final EObject entryRulePrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecedence = null;


        try {
            // InternalMissionSpecification.g:769:51: (iv_rulePrecedence= rulePrecedence EOF )
            // InternalMissionSpecification.g:770:2: iv_rulePrecedence= rulePrecedence EOF
            {
             newCompositeNode(grammarAccess.getPrecedenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrecedence=rulePrecedence();

            state._fsp--;

             current =iv_rulePrecedence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrecedence"


    // $ANTLR start "rulePrecedence"
    // InternalMissionSpecification.g:776:1: rulePrecedence returns [EObject current=null] : (otherlv_0= 'if' ( (lv_p_1_0= ruleProposition ) ) (otherlv_2= 'holds' )? otherlv_3= ',' otherlv_4= 'then' otherlv_5= 'it' otherlv_6= 'must' otherlv_7= 'have' otherlv_8= 'been' otherlv_9= 'the' otherlv_10= 'case' otherlv_11= 'that' ( (lv_s_12_0= ruleProposition ) ) (otherlv_13= 'has' otherlv_14= 'occurred' )? otherlv_15= 'beforehand' ) ;
    public final EObject rulePrecedence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_p_1_0 = null;

        EObject lv_s_12_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:782:2: ( (otherlv_0= 'if' ( (lv_p_1_0= ruleProposition ) ) (otherlv_2= 'holds' )? otherlv_3= ',' otherlv_4= 'then' otherlv_5= 'it' otherlv_6= 'must' otherlv_7= 'have' otherlv_8= 'been' otherlv_9= 'the' otherlv_10= 'case' otherlv_11= 'that' ( (lv_s_12_0= ruleProposition ) ) (otherlv_13= 'has' otherlv_14= 'occurred' )? otherlv_15= 'beforehand' ) )
            // InternalMissionSpecification.g:783:2: (otherlv_0= 'if' ( (lv_p_1_0= ruleProposition ) ) (otherlv_2= 'holds' )? otherlv_3= ',' otherlv_4= 'then' otherlv_5= 'it' otherlv_6= 'must' otherlv_7= 'have' otherlv_8= 'been' otherlv_9= 'the' otherlv_10= 'case' otherlv_11= 'that' ( (lv_s_12_0= ruleProposition ) ) (otherlv_13= 'has' otherlv_14= 'occurred' )? otherlv_15= 'beforehand' )
            {
            // InternalMissionSpecification.g:783:2: (otherlv_0= 'if' ( (lv_p_1_0= ruleProposition ) ) (otherlv_2= 'holds' )? otherlv_3= ',' otherlv_4= 'then' otherlv_5= 'it' otherlv_6= 'must' otherlv_7= 'have' otherlv_8= 'been' otherlv_9= 'the' otherlv_10= 'case' otherlv_11= 'that' ( (lv_s_12_0= ruleProposition ) ) (otherlv_13= 'has' otherlv_14= 'occurred' )? otherlv_15= 'beforehand' )
            // InternalMissionSpecification.g:784:3: otherlv_0= 'if' ( (lv_p_1_0= ruleProposition ) ) (otherlv_2= 'holds' )? otherlv_3= ',' otherlv_4= 'then' otherlv_5= 'it' otherlv_6= 'must' otherlv_7= 'have' otherlv_8= 'been' otherlv_9= 'the' otherlv_10= 'case' otherlv_11= 'that' ( (lv_s_12_0= ruleProposition ) ) (otherlv_13= 'has' otherlv_14= 'occurred' )? otherlv_15= 'beforehand'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPrecedenceAccess().getIfKeyword_0());
            		
            // InternalMissionSpecification.g:788:3: ( (lv_p_1_0= ruleProposition ) )
            // InternalMissionSpecification.g:789:4: (lv_p_1_0= ruleProposition )
            {
            // InternalMissionSpecification.g:789:4: (lv_p_1_0= ruleProposition )
            // InternalMissionSpecification.g:790:5: lv_p_1_0= ruleProposition
            {

            					newCompositeNode(grammarAccess.getPrecedenceAccess().getPPropositionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_p_1_0=ruleProposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrecedenceRule());
            					}
            					set(
            						current,
            						"p",
            						lv_p_1_0,
            						"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Proposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMissionSpecification.g:807:3: (otherlv_2= 'holds' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMissionSpecification.g:808:4: otherlv_2= 'holds'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrecedenceAccess().getHoldsKeyword_2());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getPrecedenceAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getPrecedenceAccess().getThenKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getPrecedenceAccess().getItKeyword_5());
            		
            otherlv_6=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getPrecedenceAccess().getMustKeyword_6());
            		
            otherlv_7=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_7, grammarAccess.getPrecedenceAccess().getHaveKeyword_7());
            		
            otherlv_8=(Token)match(input,36,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getPrecedenceAccess().getBeenKeyword_8());
            		
            otherlv_9=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getPrecedenceAccess().getTheKeyword_9());
            		
            otherlv_10=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getPrecedenceAccess().getCaseKeyword_10());
            		
            otherlv_11=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getPrecedenceAccess().getThatKeyword_11());
            		
            // InternalMissionSpecification.g:849:3: ( (lv_s_12_0= ruleProposition ) )
            // InternalMissionSpecification.g:850:4: (lv_s_12_0= ruleProposition )
            {
            // InternalMissionSpecification.g:850:4: (lv_s_12_0= ruleProposition )
            // InternalMissionSpecification.g:851:5: lv_s_12_0= ruleProposition
            {

            					newCompositeNode(grammarAccess.getPrecedenceAccess().getSPropositionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_30);
            lv_s_12_0=ruleProposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrecedenceRule());
            					}
            					set(
            						current,
            						"s",
            						lv_s_12_0,
            						"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Proposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMissionSpecification.g:868:3: (otherlv_13= 'has' otherlv_14= 'occurred' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMissionSpecification.g:869:4: otherlv_13= 'has' otherlv_14= 'occurred'
                    {
                    otherlv_13=(Token)match(input,37,FOLLOW_31); 

                    				newLeafNode(otherlv_13, grammarAccess.getPrecedenceAccess().getHasKeyword_13_0());
                    			
                    otherlv_14=(Token)match(input,38,FOLLOW_32); 

                    				newLeafNode(otherlv_14, grammarAccess.getPrecedenceAccess().getOccurredKeyword_13_1());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getPrecedenceAccess().getBeforehandKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrecedence"


    // $ANTLR start "entryRuleResponse"
    // InternalMissionSpecification.g:886:1: entryRuleResponse returns [EObject current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final EObject entryRuleResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponse = null;


        try {
            // InternalMissionSpecification.g:886:49: (iv_ruleResponse= ruleResponse EOF )
            // InternalMissionSpecification.g:887:2: iv_ruleResponse= ruleResponse EOF
            {
             newCompositeNode(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponse=ruleResponse();

            state._fsp--;

             current =iv_ruleResponse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalMissionSpecification.g:893:1: ruleResponse returns [EObject current=null] : (otherlv_0= 'if' ( (lv_p_1_0= ruleProposition ) ) (otherlv_2= 'has' otherlv_3= 'occurred' )? otherlv_4= ',' otherlv_5= 'then' otherlv_6= 'in' otherlv_7= 'response' ( (lv_s_8_0= ruleProposition ) ) (otherlv_9= 'eventually' otherlv_10= 'holds' )? ) ;
    public final EObject ruleResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_p_1_0 = null;

        EObject lv_s_8_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:899:2: ( (otherlv_0= 'if' ( (lv_p_1_0= ruleProposition ) ) (otherlv_2= 'has' otherlv_3= 'occurred' )? otherlv_4= ',' otherlv_5= 'then' otherlv_6= 'in' otherlv_7= 'response' ( (lv_s_8_0= ruleProposition ) ) (otherlv_9= 'eventually' otherlv_10= 'holds' )? ) )
            // InternalMissionSpecification.g:900:2: (otherlv_0= 'if' ( (lv_p_1_0= ruleProposition ) ) (otherlv_2= 'has' otherlv_3= 'occurred' )? otherlv_4= ',' otherlv_5= 'then' otherlv_6= 'in' otherlv_7= 'response' ( (lv_s_8_0= ruleProposition ) ) (otherlv_9= 'eventually' otherlv_10= 'holds' )? )
            {
            // InternalMissionSpecification.g:900:2: (otherlv_0= 'if' ( (lv_p_1_0= ruleProposition ) ) (otherlv_2= 'has' otherlv_3= 'occurred' )? otherlv_4= ',' otherlv_5= 'then' otherlv_6= 'in' otherlv_7= 'response' ( (lv_s_8_0= ruleProposition ) ) (otherlv_9= 'eventually' otherlv_10= 'holds' )? )
            // InternalMissionSpecification.g:901:3: otherlv_0= 'if' ( (lv_p_1_0= ruleProposition ) ) (otherlv_2= 'has' otherlv_3= 'occurred' )? otherlv_4= ',' otherlv_5= 'then' otherlv_6= 'in' otherlv_7= 'response' ( (lv_s_8_0= ruleProposition ) ) (otherlv_9= 'eventually' otherlv_10= 'holds' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getResponseAccess().getIfKeyword_0());
            		
            // InternalMissionSpecification.g:905:3: ( (lv_p_1_0= ruleProposition ) )
            // InternalMissionSpecification.g:906:4: (lv_p_1_0= ruleProposition )
            {
            // InternalMissionSpecification.g:906:4: (lv_p_1_0= ruleProposition )
            // InternalMissionSpecification.g:907:5: lv_p_1_0= ruleProposition
            {

            					newCompositeNode(grammarAccess.getResponseAccess().getPPropositionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_p_1_0=ruleProposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResponseRule());
            					}
            					set(
            						current,
            						"p",
            						lv_p_1_0,
            						"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Proposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMissionSpecification.g:924:3: (otherlv_2= 'has' otherlv_3= 'occurred' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMissionSpecification.g:925:4: otherlv_2= 'has' otherlv_3= 'occurred'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getResponseAccess().getHasKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getResponseAccess().getOccurredKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getResponseAccess().getCommaKeyword_3());
            		
            otherlv_5=(Token)match(input,33,FOLLOW_34); 

            			newLeafNode(otherlv_5, grammarAccess.getResponseAccess().getThenKeyword_4());
            		
            otherlv_6=(Token)match(input,40,FOLLOW_35); 

            			newLeafNode(otherlv_6, grammarAccess.getResponseAccess().getInKeyword_5());
            		
            otherlv_7=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getResponseAccess().getResponseKeyword_6());
            		
            // InternalMissionSpecification.g:950:3: ( (lv_s_8_0= ruleProposition ) )
            // InternalMissionSpecification.g:951:4: (lv_s_8_0= ruleProposition )
            {
            // InternalMissionSpecification.g:951:4: (lv_s_8_0= ruleProposition )
            // InternalMissionSpecification.g:952:5: lv_s_8_0= ruleProposition
            {

            					newCompositeNode(grammarAccess.getResponseAccess().getSPropositionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_36);
            lv_s_8_0=ruleProposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResponseRule());
            					}
            					set(
            						current,
            						"s",
            						lv_s_8_0,
            						"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Proposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMissionSpecification.g:969:3: (otherlv_9= 'eventually' otherlv_10= 'holds' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMissionSpecification.g:970:4: otherlv_9= 'eventually' otherlv_10= 'holds'
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_37); 

                    				newLeafNode(otherlv_9, grammarAccess.getResponseAccess().getEventuallyKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getResponseAccess().getHoldsKeyword_8_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleProposition"
    // InternalMissionSpecification.g:983:1: entryRuleProposition returns [EObject current=null] : iv_ruleProposition= ruleProposition EOF ;
    public final EObject entryRuleProposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposition = null;


        try {
            // InternalMissionSpecification.g:983:52: (iv_ruleProposition= ruleProposition EOF )
            // InternalMissionSpecification.g:984:2: iv_ruleProposition= ruleProposition EOF
            {
             newCompositeNode(grammarAccess.getPropositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProposition=ruleProposition();

            state._fsp--;

             current =iv_ruleProposition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProposition"


    // $ANTLR start "ruleProposition"
    // InternalMissionSpecification.g:990:1: ruleProposition returns [EObject current=null] : ( ( () otherlv_1= 'todo' ) | ( ( (lv_props_2_0= ruleAtomicProposition ) ) (otherlv_3= 'and' otherlv_4= 'also' ( (lv_props_5_0= ruleAtomicProposition ) ) )* ) ) ;
    public final EObject ruleProposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_props_2_0 = null;

        EObject lv_props_5_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:996:2: ( ( ( () otherlv_1= 'todo' ) | ( ( (lv_props_2_0= ruleAtomicProposition ) ) (otherlv_3= 'and' otherlv_4= 'also' ( (lv_props_5_0= ruleAtomicProposition ) ) )* ) ) )
            // InternalMissionSpecification.g:997:2: ( ( () otherlv_1= 'todo' ) | ( ( (lv_props_2_0= ruleAtomicProposition ) ) (otherlv_3= 'and' otherlv_4= 'also' ( (lv_props_5_0= ruleAtomicProposition ) ) )* ) )
            {
            // InternalMissionSpecification.g:997:2: ( ( () otherlv_1= 'todo' ) | ( ( (lv_props_2_0= ruleAtomicProposition ) ) (otherlv_3= 'and' otherlv_4= 'also' ( (lv_props_5_0= ruleAtomicProposition ) ) )* ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID||(LA16_0>=50 && LA16_0<=51)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMissionSpecification.g:998:3: ( () otherlv_1= 'todo' )
                    {
                    // InternalMissionSpecification.g:998:3: ( () otherlv_1= 'todo' )
                    // InternalMissionSpecification.g:999:4: () otherlv_1= 'todo'
                    {
                    // InternalMissionSpecification.g:999:4: ()
                    // InternalMissionSpecification.g:1000:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPropositionAccess().getMockPropositionAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPropositionAccess().getTodoKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMissionSpecification.g:1012:3: ( ( (lv_props_2_0= ruleAtomicProposition ) ) (otherlv_3= 'and' otherlv_4= 'also' ( (lv_props_5_0= ruleAtomicProposition ) ) )* )
                    {
                    // InternalMissionSpecification.g:1012:3: ( ( (lv_props_2_0= ruleAtomicProposition ) ) (otherlv_3= 'and' otherlv_4= 'also' ( (lv_props_5_0= ruleAtomicProposition ) ) )* )
                    // InternalMissionSpecification.g:1013:4: ( (lv_props_2_0= ruleAtomicProposition ) ) (otherlv_3= 'and' otherlv_4= 'also' ( (lv_props_5_0= ruleAtomicProposition ) ) )*
                    {
                    // InternalMissionSpecification.g:1013:4: ( (lv_props_2_0= ruleAtomicProposition ) )
                    // InternalMissionSpecification.g:1014:5: (lv_props_2_0= ruleAtomicProposition )
                    {
                    // InternalMissionSpecification.g:1014:5: (lv_props_2_0= ruleAtomicProposition )
                    // InternalMissionSpecification.g:1015:6: lv_props_2_0= ruleAtomicProposition
                    {

                    						newCompositeNode(grammarAccess.getPropositionAccess().getPropsAtomicPropositionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_props_2_0=ruleAtomicProposition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropositionRule());
                    						}
                    						add(
                    							current,
                    							"props",
                    							lv_props_2_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.AtomicProposition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMissionSpecification.g:1032:4: (otherlv_3= 'and' otherlv_4= 'also' ( (lv_props_5_0= ruleAtomicProposition ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==18) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMissionSpecification.g:1033:5: otherlv_3= 'and' otherlv_4= 'also' ( (lv_props_5_0= ruleAtomicProposition ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_39); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPropositionAccess().getAndKeyword_1_1_0());
                    	    				
                    	    otherlv_4=(Token)match(input,43,FOLLOW_7); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPropositionAccess().getAlsoKeyword_1_1_1());
                    	    				
                    	    // InternalMissionSpecification.g:1041:5: ( (lv_props_5_0= ruleAtomicProposition ) )
                    	    // InternalMissionSpecification.g:1042:6: (lv_props_5_0= ruleAtomicProposition )
                    	    {
                    	    // InternalMissionSpecification.g:1042:6: (lv_props_5_0= ruleAtomicProposition )
                    	    // InternalMissionSpecification.g:1043:7: lv_props_5_0= ruleAtomicProposition
                    	    {

                    	    							newCompositeNode(grammarAccess.getPropositionAccess().getPropsAtomicPropositionParserRuleCall_1_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_props_5_0=ruleAtomicProposition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPropositionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"props",
                    	    								lv_props_5_0,
                    	    								"be.uantwerpen.ansymo.missionspecification.MissionSpecification.AtomicProposition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProposition"


    // $ANTLR start "entryRuleAtomicProposition"
    // InternalMissionSpecification.g:1066:1: entryRuleAtomicProposition returns [EObject current=null] : iv_ruleAtomicProposition= ruleAtomicProposition EOF ;
    public final EObject entryRuleAtomicProposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicProposition = null;


        try {
            // InternalMissionSpecification.g:1066:58: (iv_ruleAtomicProposition= ruleAtomicProposition EOF )
            // InternalMissionSpecification.g:1067:2: iv_ruleAtomicProposition= ruleAtomicProposition EOF
            {
             newCompositeNode(grammarAccess.getAtomicPropositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicProposition=ruleAtomicProposition();

            state._fsp--;

             current =iv_ruleAtomicProposition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicProposition"


    // $ANTLR start "ruleAtomicProposition"
    // InternalMissionSpecification.g:1073:1: ruleAtomicProposition returns [EObject current=null] : ( ( (lv_inst_0_0= ruleInstance ) ) (otherlv_1= 'with' ( (lv_cond_2_0= ruleBooleanExpression ) ) (otherlv_3= 'and' ( (lv_cond_4_0= ruleBooleanExpression ) ) )* )? ( ( (lv_assoc_5_0= ruleAssociation ) ) ( (lv_inst2_6_0= ruleInstance ) ) (otherlv_7= 'with' ( (lv_cond2_8_0= ruleBooleanExpression ) ) (otherlv_9= 'and' ( (lv_cond2_10_0= ruleBooleanExpression ) ) )* )? )? ) ;
    public final EObject ruleAtomicProposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_inst_0_0 = null;

        EObject lv_cond_2_0 = null;

        EObject lv_cond_4_0 = null;

        EObject lv_assoc_5_0 = null;

        EObject lv_inst2_6_0 = null;

        EObject lv_cond2_8_0 = null;

        EObject lv_cond2_10_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:1079:2: ( ( ( (lv_inst_0_0= ruleInstance ) ) (otherlv_1= 'with' ( (lv_cond_2_0= ruleBooleanExpression ) ) (otherlv_3= 'and' ( (lv_cond_4_0= ruleBooleanExpression ) ) )* )? ( ( (lv_assoc_5_0= ruleAssociation ) ) ( (lv_inst2_6_0= ruleInstance ) ) (otherlv_7= 'with' ( (lv_cond2_8_0= ruleBooleanExpression ) ) (otherlv_9= 'and' ( (lv_cond2_10_0= ruleBooleanExpression ) ) )* )? )? ) )
            // InternalMissionSpecification.g:1080:2: ( ( (lv_inst_0_0= ruleInstance ) ) (otherlv_1= 'with' ( (lv_cond_2_0= ruleBooleanExpression ) ) (otherlv_3= 'and' ( (lv_cond_4_0= ruleBooleanExpression ) ) )* )? ( ( (lv_assoc_5_0= ruleAssociation ) ) ( (lv_inst2_6_0= ruleInstance ) ) (otherlv_7= 'with' ( (lv_cond2_8_0= ruleBooleanExpression ) ) (otherlv_9= 'and' ( (lv_cond2_10_0= ruleBooleanExpression ) ) )* )? )? )
            {
            // InternalMissionSpecification.g:1080:2: ( ( (lv_inst_0_0= ruleInstance ) ) (otherlv_1= 'with' ( (lv_cond_2_0= ruleBooleanExpression ) ) (otherlv_3= 'and' ( (lv_cond_4_0= ruleBooleanExpression ) ) )* )? ( ( (lv_assoc_5_0= ruleAssociation ) ) ( (lv_inst2_6_0= ruleInstance ) ) (otherlv_7= 'with' ( (lv_cond2_8_0= ruleBooleanExpression ) ) (otherlv_9= 'and' ( (lv_cond2_10_0= ruleBooleanExpression ) ) )* )? )? )
            // InternalMissionSpecification.g:1081:3: ( (lv_inst_0_0= ruleInstance ) ) (otherlv_1= 'with' ( (lv_cond_2_0= ruleBooleanExpression ) ) (otherlv_3= 'and' ( (lv_cond_4_0= ruleBooleanExpression ) ) )* )? ( ( (lv_assoc_5_0= ruleAssociation ) ) ( (lv_inst2_6_0= ruleInstance ) ) (otherlv_7= 'with' ( (lv_cond2_8_0= ruleBooleanExpression ) ) (otherlv_9= 'and' ( (lv_cond2_10_0= ruleBooleanExpression ) ) )* )? )?
            {
            // InternalMissionSpecification.g:1081:3: ( (lv_inst_0_0= ruleInstance ) )
            // InternalMissionSpecification.g:1082:4: (lv_inst_0_0= ruleInstance )
            {
            // InternalMissionSpecification.g:1082:4: (lv_inst_0_0= ruleInstance )
            // InternalMissionSpecification.g:1083:5: lv_inst_0_0= ruleInstance
            {

            					newCompositeNode(grammarAccess.getAtomicPropositionAccess().getInstInstanceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_inst_0_0=ruleInstance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicPropositionRule());
            					}
            					set(
            						current,
            						"inst",
            						lv_inst_0_0,
            						"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Instance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMissionSpecification.g:1100:3: (otherlv_1= 'with' ( (lv_cond_2_0= ruleBooleanExpression ) ) (otherlv_3= 'and' ( (lv_cond_4_0= ruleBooleanExpression ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_ID||LA18_1==49) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalMissionSpecification.g:1101:4: otherlv_1= 'with' ( (lv_cond_2_0= ruleBooleanExpression ) ) (otherlv_3= 'and' ( (lv_cond_4_0= ruleBooleanExpression ) ) )*
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_41); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtomicPropositionAccess().getWithKeyword_1_0());
                    			
                    // InternalMissionSpecification.g:1105:4: ( (lv_cond_2_0= ruleBooleanExpression ) )
                    // InternalMissionSpecification.g:1106:5: (lv_cond_2_0= ruleBooleanExpression )
                    {
                    // InternalMissionSpecification.g:1106:5: (lv_cond_2_0= ruleBooleanExpression )
                    // InternalMissionSpecification.g:1107:6: lv_cond_2_0= ruleBooleanExpression
                    {

                    						newCompositeNode(grammarAccess.getAtomicPropositionAccess().getCondBooleanExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_cond_2_0=ruleBooleanExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicPropositionRule());
                    						}
                    						add(
                    							current,
                    							"cond",
                    							lv_cond_2_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.BooleanExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMissionSpecification.g:1124:4: (otherlv_3= 'and' ( (lv_cond_4_0= ruleBooleanExpression ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==18) ) {
                            int LA17_2 = input.LA(2);

                            if ( (LA17_2==RULE_ID||LA17_2==49) ) {
                                alt17=1;
                            }


                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMissionSpecification.g:1125:5: otherlv_3= 'and' ( (lv_cond_4_0= ruleBooleanExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_41); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAtomicPropositionAccess().getAndKeyword_1_2_0());
                    	    				
                    	    // InternalMissionSpecification.g:1129:5: ( (lv_cond_4_0= ruleBooleanExpression ) )
                    	    // InternalMissionSpecification.g:1130:6: (lv_cond_4_0= ruleBooleanExpression )
                    	    {
                    	    // InternalMissionSpecification.g:1130:6: (lv_cond_4_0= ruleBooleanExpression )
                    	    // InternalMissionSpecification.g:1131:7: lv_cond_4_0= ruleBooleanExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getAtomicPropositionAccess().getCondBooleanExpressionParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
                    	    lv_cond_4_0=ruleBooleanExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAtomicPropositionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cond",
                    	    								lv_cond_4_0,
                    	    								"be.uantwerpen.ansymo.missionspecification.MissionSpecification.BooleanExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMissionSpecification.g:1150:3: ( ( (lv_assoc_5_0= ruleAssociation ) ) ( (lv_inst2_6_0= ruleInstance ) ) (otherlv_7= 'with' ( (lv_cond2_8_0= ruleBooleanExpression ) ) (otherlv_9= 'and' ( (lv_cond2_10_0= ruleBooleanExpression ) ) )* )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25||LA21_0==40||LA21_0==44||(LA21_0>=55 && LA21_0<=56)||(LA21_0>=61 && LA21_0<=62)||LA21_0==65) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMissionSpecification.g:1151:4: ( (lv_assoc_5_0= ruleAssociation ) ) ( (lv_inst2_6_0= ruleInstance ) ) (otherlv_7= 'with' ( (lv_cond2_8_0= ruleBooleanExpression ) ) (otherlv_9= 'and' ( (lv_cond2_10_0= ruleBooleanExpression ) ) )* )?
                    {
                    // InternalMissionSpecification.g:1151:4: ( (lv_assoc_5_0= ruleAssociation ) )
                    // InternalMissionSpecification.g:1152:5: (lv_assoc_5_0= ruleAssociation )
                    {
                    // InternalMissionSpecification.g:1152:5: (lv_assoc_5_0= ruleAssociation )
                    // InternalMissionSpecification.g:1153:6: lv_assoc_5_0= ruleAssociation
                    {

                    						newCompositeNode(grammarAccess.getAtomicPropositionAccess().getAssocAssociationParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_assoc_5_0=ruleAssociation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicPropositionRule());
                    						}
                    						set(
                    							current,
                    							"assoc",
                    							lv_assoc_5_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Association");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMissionSpecification.g:1170:4: ( (lv_inst2_6_0= ruleInstance ) )
                    // InternalMissionSpecification.g:1171:5: (lv_inst2_6_0= ruleInstance )
                    {
                    // InternalMissionSpecification.g:1171:5: (lv_inst2_6_0= ruleInstance )
                    // InternalMissionSpecification.g:1172:6: lv_inst2_6_0= ruleInstance
                    {

                    						newCompositeNode(grammarAccess.getAtomicPropositionAccess().getInst2InstanceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_inst2_6_0=ruleInstance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicPropositionRule());
                    						}
                    						set(
                    							current,
                    							"inst2",
                    							lv_inst2_6_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Instance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMissionSpecification.g:1189:4: (otherlv_7= 'with' ( (lv_cond2_8_0= ruleBooleanExpression ) ) (otherlv_9= 'and' ( (lv_cond2_10_0= ruleBooleanExpression ) ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==44) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalMissionSpecification.g:1190:5: otherlv_7= 'with' ( (lv_cond2_8_0= ruleBooleanExpression ) ) (otherlv_9= 'and' ( (lv_cond2_10_0= ruleBooleanExpression ) ) )*
                            {
                            otherlv_7=(Token)match(input,44,FOLLOW_41); 

                            					newLeafNode(otherlv_7, grammarAccess.getAtomicPropositionAccess().getWithKeyword_2_2_0());
                            				
                            // InternalMissionSpecification.g:1194:5: ( (lv_cond2_8_0= ruleBooleanExpression ) )
                            // InternalMissionSpecification.g:1195:6: (lv_cond2_8_0= ruleBooleanExpression )
                            {
                            // InternalMissionSpecification.g:1195:6: (lv_cond2_8_0= ruleBooleanExpression )
                            // InternalMissionSpecification.g:1196:7: lv_cond2_8_0= ruleBooleanExpression
                            {

                            							newCompositeNode(grammarAccess.getAtomicPropositionAccess().getCond2BooleanExpressionParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_38);
                            lv_cond2_8_0=ruleBooleanExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAtomicPropositionRule());
                            							}
                            							add(
                            								current,
                            								"cond2",
                            								lv_cond2_8_0,
                            								"be.uantwerpen.ansymo.missionspecification.MissionSpecification.BooleanExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMissionSpecification.g:1213:5: (otherlv_9= 'and' ( (lv_cond2_10_0= ruleBooleanExpression ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==18) ) {
                                    int LA19_1 = input.LA(2);

                                    if ( (LA19_1==RULE_ID||LA19_1==49) ) {
                                        alt19=1;
                                    }


                                }


                                switch (alt19) {
                            	case 1 :
                            	    // InternalMissionSpecification.g:1214:6: otherlv_9= 'and' ( (lv_cond2_10_0= ruleBooleanExpression ) )
                            	    {
                            	    otherlv_9=(Token)match(input,18,FOLLOW_41); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getAtomicPropositionAccess().getAndKeyword_2_2_2_0());
                            	    					
                            	    // InternalMissionSpecification.g:1218:6: ( (lv_cond2_10_0= ruleBooleanExpression ) )
                            	    // InternalMissionSpecification.g:1219:7: (lv_cond2_10_0= ruleBooleanExpression )
                            	    {
                            	    // InternalMissionSpecification.g:1219:7: (lv_cond2_10_0= ruleBooleanExpression )
                            	    // InternalMissionSpecification.g:1220:8: lv_cond2_10_0= ruleBooleanExpression
                            	    {

                            	    								newCompositeNode(grammarAccess.getAtomicPropositionAccess().getCond2BooleanExpressionParserRuleCall_2_2_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_38);
                            	    lv_cond2_10_0=ruleBooleanExpression();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getAtomicPropositionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"cond2",
                            	    									lv_cond2_10_0,
                            	    									"be.uantwerpen.ansymo.missionspecification.MissionSpecification.BooleanExpression");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicProposition"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalMissionSpecification.g:1244:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalMissionSpecification.g:1244:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalMissionSpecification.g:1245:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalMissionSpecification.g:1251:1: ruleBooleanExpression returns [EObject current=null] : (this_BinaryExpression_0= ruleBinaryExpression | this_UnaryExpression_1= ruleUnaryExpression | ( () ( (lv_attr_3_0= ruleAttribute ) ) ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;

        EObject this_UnaryExpression_1 = null;

        EObject lv_attr_3_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:1257:2: ( (this_BinaryExpression_0= ruleBinaryExpression | this_UnaryExpression_1= ruleUnaryExpression | ( () ( (lv_attr_3_0= ruleAttribute ) ) ) ) )
            // InternalMissionSpecification.g:1258:2: (this_BinaryExpression_0= ruleBinaryExpression | this_UnaryExpression_1= ruleUnaryExpression | ( () ( (lv_attr_3_0= ruleAttribute ) ) ) )
            {
            // InternalMissionSpecification.g:1258:2: (this_BinaryExpression_0= ruleBinaryExpression | this_UnaryExpression_1= ruleUnaryExpression | ( () ( (lv_attr_3_0= ruleAttribute ) ) ) )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( ((LA22_1>=45 && LA22_1<=46)||LA22_1==48) ) {
                    alt22=1;
                }
                else if ( (LA22_1==EOF||(LA22_1>=12 && LA22_1<=18)||(LA22_1>=25 && LA22_1<=26)||(LA22_1>=28 && LA22_1<=29)||LA22_1==37||(LA22_1>=39 && LA22_1<=40)||LA22_1==44||(LA22_1>=55 && LA22_1<=56)||(LA22_1>=61 && LA22_1<=62)||LA22_1==65) ) {
                    alt22=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA22_0==49) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMissionSpecification.g:1259:3: this_BinaryExpression_0= ruleBinaryExpression
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getBinaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryExpression_0=ruleBinaryExpression();

                    state._fsp--;


                    			current = this_BinaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMissionSpecification.g:1268:3: this_UnaryExpression_1= ruleUnaryExpression
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getUnaryExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnaryExpression_1=ruleUnaryExpression();

                    state._fsp--;


                    			current = this_UnaryExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMissionSpecification.g:1277:3: ( () ( (lv_attr_3_0= ruleAttribute ) ) )
                    {
                    // InternalMissionSpecification.g:1277:3: ( () ( (lv_attr_3_0= ruleAttribute ) ) )
                    // InternalMissionSpecification.g:1278:4: () ( (lv_attr_3_0= ruleAttribute ) )
                    {
                    // InternalMissionSpecification.g:1278:4: ()
                    // InternalMissionSpecification.g:1279:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBooleanExpressionAccess().getConditionAction_2_0(),
                    						current);
                    				

                    }

                    // InternalMissionSpecification.g:1285:4: ( (lv_attr_3_0= ruleAttribute ) )
                    // InternalMissionSpecification.g:1286:5: (lv_attr_3_0= ruleAttribute )
                    {
                    // InternalMissionSpecification.g:1286:5: (lv_attr_3_0= ruleAttribute )
                    // InternalMissionSpecification.g:1287:6: lv_attr_3_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getBooleanExpressionAccess().getAttrAttributeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_attr_3_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
                    						}
                    						set(
                    							current,
                    							"attr",
                    							lv_attr_3_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalMissionSpecification.g:1309:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalMissionSpecification.g:1309:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalMissionSpecification.g:1310:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryExpression=ruleBinaryExpression();

            state._fsp--;

             current =iv_ruleBinaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalMissionSpecification.g:1316:1: ruleBinaryExpression returns [EObject current=null] : ( ( () ( (lv_attr_1_0= ruleAttribute ) ) otherlv_2= 'as' ( (lv_val_3_0= ruleLiteral ) ) ) | ( () ( (lv_attr_5_0= ruleAttribute ) ) otherlv_6= 'less' otherlv_7= 'than' ( (lv_val_8_0= ruleLiteral ) ) ) | ( () ( (lv_attr_10_0= ruleAttribute ) ) otherlv_11= 'greater' otherlv_12= 'than' ( (lv_val_13_0= ruleLiteral ) ) ) ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_attr_1_0 = null;

        EObject lv_val_3_0 = null;

        EObject lv_attr_5_0 = null;

        EObject lv_val_8_0 = null;

        EObject lv_attr_10_0 = null;

        EObject lv_val_13_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:1322:2: ( ( ( () ( (lv_attr_1_0= ruleAttribute ) ) otherlv_2= 'as' ( (lv_val_3_0= ruleLiteral ) ) ) | ( () ( (lv_attr_5_0= ruleAttribute ) ) otherlv_6= 'less' otherlv_7= 'than' ( (lv_val_8_0= ruleLiteral ) ) ) | ( () ( (lv_attr_10_0= ruleAttribute ) ) otherlv_11= 'greater' otherlv_12= 'than' ( (lv_val_13_0= ruleLiteral ) ) ) ) )
            // InternalMissionSpecification.g:1323:2: ( ( () ( (lv_attr_1_0= ruleAttribute ) ) otherlv_2= 'as' ( (lv_val_3_0= ruleLiteral ) ) ) | ( () ( (lv_attr_5_0= ruleAttribute ) ) otherlv_6= 'less' otherlv_7= 'than' ( (lv_val_8_0= ruleLiteral ) ) ) | ( () ( (lv_attr_10_0= ruleAttribute ) ) otherlv_11= 'greater' otherlv_12= 'than' ( (lv_val_13_0= ruleLiteral ) ) ) )
            {
            // InternalMissionSpecification.g:1323:2: ( ( () ( (lv_attr_1_0= ruleAttribute ) ) otherlv_2= 'as' ( (lv_val_3_0= ruleLiteral ) ) ) | ( () ( (lv_attr_5_0= ruleAttribute ) ) otherlv_6= 'less' otherlv_7= 'than' ( (lv_val_8_0= ruleLiteral ) ) ) | ( () ( (lv_attr_10_0= ruleAttribute ) ) otherlv_11= 'greater' otherlv_12= 'than' ( (lv_val_13_0= ruleLiteral ) ) ) )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 45:
                    {
                    alt23=1;
                    }
                    break;
                case 48:
                    {
                    alt23=3;
                    }
                    break;
                case 46:
                    {
                    alt23=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMissionSpecification.g:1324:3: ( () ( (lv_attr_1_0= ruleAttribute ) ) otherlv_2= 'as' ( (lv_val_3_0= ruleLiteral ) ) )
                    {
                    // InternalMissionSpecification.g:1324:3: ( () ( (lv_attr_1_0= ruleAttribute ) ) otherlv_2= 'as' ( (lv_val_3_0= ruleLiteral ) ) )
                    // InternalMissionSpecification.g:1325:4: () ( (lv_attr_1_0= ruleAttribute ) ) otherlv_2= 'as' ( (lv_val_3_0= ruleLiteral ) )
                    {
                    // InternalMissionSpecification.g:1325:4: ()
                    // InternalMissionSpecification.g:1326:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBinaryExpressionAccess().getEqualsConditionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMissionSpecification.g:1332:4: ( (lv_attr_1_0= ruleAttribute ) )
                    // InternalMissionSpecification.g:1333:5: (lv_attr_1_0= ruleAttribute )
                    {
                    // InternalMissionSpecification.g:1333:5: (lv_attr_1_0= ruleAttribute )
                    // InternalMissionSpecification.g:1334:6: lv_attr_1_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getAttrAttributeParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_attr_1_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"attr",
                    							lv_attr_1_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,45,FOLLOW_45); 

                    				newLeafNode(otherlv_2, grammarAccess.getBinaryExpressionAccess().getAsKeyword_0_2());
                    			
                    // InternalMissionSpecification.g:1355:4: ( (lv_val_3_0= ruleLiteral ) )
                    // InternalMissionSpecification.g:1356:5: (lv_val_3_0= ruleLiteral )
                    {
                    // InternalMissionSpecification.g:1356:5: (lv_val_3_0= ruleLiteral )
                    // InternalMissionSpecification.g:1357:6: lv_val_3_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getValLiteralParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_val_3_0=ruleLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_3_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Literal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMissionSpecification.g:1376:3: ( () ( (lv_attr_5_0= ruleAttribute ) ) otherlv_6= 'less' otherlv_7= 'than' ( (lv_val_8_0= ruleLiteral ) ) )
                    {
                    // InternalMissionSpecification.g:1376:3: ( () ( (lv_attr_5_0= ruleAttribute ) ) otherlv_6= 'less' otherlv_7= 'than' ( (lv_val_8_0= ruleLiteral ) ) )
                    // InternalMissionSpecification.g:1377:4: () ( (lv_attr_5_0= ruleAttribute ) ) otherlv_6= 'less' otherlv_7= 'than' ( (lv_val_8_0= ruleLiteral ) )
                    {
                    // InternalMissionSpecification.g:1377:4: ()
                    // InternalMissionSpecification.g:1378:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBinaryExpressionAccess().getLessThanConditionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMissionSpecification.g:1384:4: ( (lv_attr_5_0= ruleAttribute ) )
                    // InternalMissionSpecification.g:1385:5: (lv_attr_5_0= ruleAttribute )
                    {
                    // InternalMissionSpecification.g:1385:5: (lv_attr_5_0= ruleAttribute )
                    // InternalMissionSpecification.g:1386:6: lv_attr_5_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getAttrAttributeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_attr_5_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"attr",
                    							lv_attr_5_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,46,FOLLOW_47); 

                    				newLeafNode(otherlv_6, grammarAccess.getBinaryExpressionAccess().getLessKeyword_1_2());
                    			
                    otherlv_7=(Token)match(input,47,FOLLOW_45); 

                    				newLeafNode(otherlv_7, grammarAccess.getBinaryExpressionAccess().getThanKeyword_1_3());
                    			
                    // InternalMissionSpecification.g:1411:4: ( (lv_val_8_0= ruleLiteral ) )
                    // InternalMissionSpecification.g:1412:5: (lv_val_8_0= ruleLiteral )
                    {
                    // InternalMissionSpecification.g:1412:5: (lv_val_8_0= ruleLiteral )
                    // InternalMissionSpecification.g:1413:6: lv_val_8_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getValLiteralParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_val_8_0=ruleLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_8_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Literal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMissionSpecification.g:1432:3: ( () ( (lv_attr_10_0= ruleAttribute ) ) otherlv_11= 'greater' otherlv_12= 'than' ( (lv_val_13_0= ruleLiteral ) ) )
                    {
                    // InternalMissionSpecification.g:1432:3: ( () ( (lv_attr_10_0= ruleAttribute ) ) otherlv_11= 'greater' otherlv_12= 'than' ( (lv_val_13_0= ruleLiteral ) ) )
                    // InternalMissionSpecification.g:1433:4: () ( (lv_attr_10_0= ruleAttribute ) ) otherlv_11= 'greater' otherlv_12= 'than' ( (lv_val_13_0= ruleLiteral ) )
                    {
                    // InternalMissionSpecification.g:1433:4: ()
                    // InternalMissionSpecification.g:1434:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBinaryExpressionAccess().getGreaterThanConditionAction_2_0(),
                    						current);
                    				

                    }

                    // InternalMissionSpecification.g:1440:4: ( (lv_attr_10_0= ruleAttribute ) )
                    // InternalMissionSpecification.g:1441:5: (lv_attr_10_0= ruleAttribute )
                    {
                    // InternalMissionSpecification.g:1441:5: (lv_attr_10_0= ruleAttribute )
                    // InternalMissionSpecification.g:1442:6: lv_attr_10_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getAttrAttributeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_attr_10_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"attr",
                    							lv_attr_10_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,48,FOLLOW_47); 

                    				newLeafNode(otherlv_11, grammarAccess.getBinaryExpressionAccess().getGreaterKeyword_2_2());
                    			
                    otherlv_12=(Token)match(input,47,FOLLOW_45); 

                    				newLeafNode(otherlv_12, grammarAccess.getBinaryExpressionAccess().getThanKeyword_2_3());
                    			
                    // InternalMissionSpecification.g:1467:4: ( (lv_val_13_0= ruleLiteral ) )
                    // InternalMissionSpecification.g:1468:5: (lv_val_13_0= ruleLiteral )
                    {
                    // InternalMissionSpecification.g:1468:5: (lv_val_13_0= ruleLiteral )
                    // InternalMissionSpecification.g:1469:6: lv_val_13_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getValLiteralParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_val_13_0=ruleLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_13_0,
                    							"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Literal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalMissionSpecification.g:1491:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalMissionSpecification.g:1491:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalMissionSpecification.g:1492:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalMissionSpecification.g:1498:1: ruleUnaryExpression returns [EObject current=null] : ( () otherlv_1= 'not' ( (lv_attr_2_0= ruleAttribute ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_attr_2_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:1504:2: ( ( () otherlv_1= 'not' ( (lv_attr_2_0= ruleAttribute ) ) ) )
            // InternalMissionSpecification.g:1505:2: ( () otherlv_1= 'not' ( (lv_attr_2_0= ruleAttribute ) ) )
            {
            // InternalMissionSpecification.g:1505:2: ( () otherlv_1= 'not' ( (lv_attr_2_0= ruleAttribute ) ) )
            // InternalMissionSpecification.g:1506:3: () otherlv_1= 'not' ( (lv_attr_2_0= ruleAttribute ) )
            {
            // InternalMissionSpecification.g:1506:3: ()
            // InternalMissionSpecification.g:1507:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnaryExpressionAccess().getNotConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getUnaryExpressionAccess().getNotKeyword_1());
            		
            // InternalMissionSpecification.g:1517:3: ( (lv_attr_2_0= ruleAttribute ) )
            // InternalMissionSpecification.g:1518:4: (lv_attr_2_0= ruleAttribute )
            {
            // InternalMissionSpecification.g:1518:4: (lv_attr_2_0= ruleAttribute )
            // InternalMissionSpecification.g:1519:5: lv_attr_2_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getAttrAttributeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_attr_2_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
            					}
            					set(
            						current,
            						"attr",
            						lv_attr_2_0,
            						"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleInstance"
    // InternalMissionSpecification.g:1540:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalMissionSpecification.g:1540:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalMissionSpecification.g:1541:2: iv_ruleInstance= ruleInstance EOF
            {
             newCompositeNode(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstance=ruleInstance();

            state._fsp--;

             current =iv_ruleInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // InternalMissionSpecification.g:1547:1: ruleInstance returns [EObject current=null] : (this_InstanceRef_0= ruleInstanceRef | this_InstanceDecl_1= ruleInstanceDecl ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        EObject this_InstanceRef_0 = null;

        EObject this_InstanceDecl_1 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:1553:2: ( (this_InstanceRef_0= ruleInstanceRef | this_InstanceDecl_1= ruleInstanceDecl ) )
            // InternalMissionSpecification.g:1554:2: (this_InstanceRef_0= ruleInstanceRef | this_InstanceDecl_1= ruleInstanceDecl )
            {
            // InternalMissionSpecification.g:1554:2: (this_InstanceRef_0= ruleInstanceRef | this_InstanceDecl_1= ruleInstanceDecl )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=50 && LA24_0<=51)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMissionSpecification.g:1555:3: this_InstanceRef_0= ruleInstanceRef
                    {

                    			newCompositeNode(grammarAccess.getInstanceAccess().getInstanceRefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstanceRef_0=ruleInstanceRef();

                    state._fsp--;


                    			current = this_InstanceRef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMissionSpecification.g:1564:3: this_InstanceDecl_1= ruleInstanceDecl
                    {

                    			newCompositeNode(grammarAccess.getInstanceAccess().getInstanceDeclParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstanceDecl_1=ruleInstanceDecl();

                    state._fsp--;


                    			current = this_InstanceDecl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleInstanceDecl"
    // InternalMissionSpecification.g:1576:1: entryRuleInstanceDecl returns [EObject current=null] : iv_ruleInstanceDecl= ruleInstanceDecl EOF ;
    public final EObject entryRuleInstanceDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceDecl = null;


        try {
            // InternalMissionSpecification.g:1576:53: (iv_ruleInstanceDecl= ruleInstanceDecl EOF )
            // InternalMissionSpecification.g:1577:2: iv_ruleInstanceDecl= ruleInstanceDecl EOF
            {
             newCompositeNode(grammarAccess.getInstanceDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceDecl=ruleInstanceDecl();

            state._fsp--;

             current =iv_ruleInstanceDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceDecl"


    // $ANTLR start "ruleInstanceDecl"
    // InternalMissionSpecification.g:1583:1: ruleInstanceDecl returns [EObject current=null] : ( (otherlv_0= 'a' | otherlv_1= 'an' ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) )? ) ;
    public final EObject ruleInstanceDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:1589:2: ( ( (otherlv_0= 'a' | otherlv_1= 'an' ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) )? ) )
            // InternalMissionSpecification.g:1590:2: ( (otherlv_0= 'a' | otherlv_1= 'an' ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) )? )
            {
            // InternalMissionSpecification.g:1590:2: ( (otherlv_0= 'a' | otherlv_1= 'an' ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) )? )
            // InternalMissionSpecification.g:1591:3: (otherlv_0= 'a' | otherlv_1= 'an' ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) )?
            {
            // InternalMissionSpecification.g:1591:3: (otherlv_0= 'a' | otherlv_1= 'an' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==50) ) {
                alt25=1;
            }
            else if ( (LA25_0==51) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMissionSpecification.g:1592:4: otherlv_0= 'a'
                    {
                    otherlv_0=(Token)match(input,50,FOLLOW_49); 

                    				newLeafNode(otherlv_0, grammarAccess.getInstanceDeclAccess().getAKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMissionSpecification.g:1597:4: otherlv_1= 'an'
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_49); 

                    				newLeafNode(otherlv_1, grammarAccess.getInstanceDeclAccess().getAnKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMissionSpecification.g:1602:3: ( (lv_type_2_0= ruleType ) )
            // InternalMissionSpecification.g:1603:4: (lv_type_2_0= ruleType )
            {
            // InternalMissionSpecification.g:1603:4: (lv_type_2_0= ruleType )
            // InternalMissionSpecification.g:1604:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getInstanceDeclAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_50);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstanceDeclRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"be.uantwerpen.ansymo.missionspecification.MissionSpecification.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMissionSpecification.g:1621:3: ( (lv_name_3_0= RULE_ID ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMissionSpecification.g:1622:4: (lv_name_3_0= RULE_ID )
                    {
                    // InternalMissionSpecification.g:1622:4: (lv_name_3_0= RULE_ID )
                    // InternalMissionSpecification.g:1623:5: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_3_0, grammarAccess.getInstanceDeclAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInstanceDeclRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceDecl"


    // $ANTLR start "entryRuleInstanceRef"
    // InternalMissionSpecification.g:1643:1: entryRuleInstanceRef returns [EObject current=null] : iv_ruleInstanceRef= ruleInstanceRef EOF ;
    public final EObject entryRuleInstanceRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceRef = null;


        try {
            // InternalMissionSpecification.g:1643:52: (iv_ruleInstanceRef= ruleInstanceRef EOF )
            // InternalMissionSpecification.g:1644:2: iv_ruleInstanceRef= ruleInstanceRef EOF
            {
             newCompositeNode(grammarAccess.getInstanceRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceRef=ruleInstanceRef();

            state._fsp--;

             current =iv_ruleInstanceRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceRef"


    // $ANTLR start "ruleInstanceRef"
    // InternalMissionSpecification.g:1650:1: ruleInstanceRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleInstanceRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMissionSpecification.g:1656:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMissionSpecification.g:1657:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMissionSpecification.g:1657:2: ( (otherlv_0= RULE_ID ) )
            // InternalMissionSpecification.g:1658:3: (otherlv_0= RULE_ID )
            {
            // InternalMissionSpecification.g:1658:3: (otherlv_0= RULE_ID )
            // InternalMissionSpecification.g:1659:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInstanceRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getInstanceRefAccess().getRefInstanceDeclCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceRef"


    // $ANTLR start "entryRuleAssociation"
    // InternalMissionSpecification.g:1673:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalMissionSpecification.g:1673:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalMissionSpecification.g:1674:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalMissionSpecification.g:1680:1: ruleAssociation returns [EObject current=null] : ( ( () otherlv_1= 'that' otherlv_2= 'is' otherlv_3= 'a' otherlv_4= 'task' otherlv_5= 'of' ) | ( () otherlv_7= 'that' otherlv_8= 'is' otherlv_9= 'a' otherlv_10= 'team' otherlv_11= 'of' ) | ( () otherlv_13= 'that' otherlv_14= 'is' otherlv_15= 'in' ) | ( () (otherlv_17= 'currently' )? otherlv_18= 'doing' ) | ( () otherlv_20= 'that' otherlv_21= 'has' otherlv_22= 'scheduled' ) | ( () otherlv_24= 'that' otherlv_25= 'has' otherlv_26= 'planned' otherlv_27= 'in' otherlv_28= 'the' otherlv_29= 'future' ) | ( () otherlv_31= 'that' otherlv_32= 'has' otherlv_33= 'finished' ) | ( () (otherlv_35= 'currently' )? otherlv_36= 'performing' ) | ( () (otherlv_38= 'currently' )? otherlv_39= 'in' ) | ( () (otherlv_41= 'currently' )? otherlv_42= 'on' ) | ( () otherlv_44= 'with' otherlv_45= 'as' otherlv_46= 'home' ) | ( () otherlv_48= 'with' otherlv_49= 'task' otherlv_50= 'area' ) | ( () otherlv_52= 'which' otherlv_53= 'visits' ) | ( () otherlv_55= 'which' otherlv_56= 'will' otherlv_57= 'visit' otherlv_58= 'in' otherlv_59= 'the' otherlv_60= 'future' ) | ( () otherlv_62= 'which' otherlv_63= 'has' otherlv_64= 'visited' ) | ( () otherlv_66= 'with' otherlv_67= 'points' ) | ( () otherlv_69= 'with' otherlv_70= 'initial' otherlv_71= 'position' ) | ( () otherlv_73= 'which' otherlv_74= 'references' ) ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token otherlv_62=null;
        Token otherlv_63=null;
        Token otherlv_64=null;
        Token otherlv_66=null;
        Token otherlv_67=null;
        Token otherlv_69=null;
        Token otherlv_70=null;
        Token otherlv_71=null;
        Token otherlv_73=null;
        Token otherlv_74=null;


        	enterRule();

        try {
            // InternalMissionSpecification.g:1686:2: ( ( ( () otherlv_1= 'that' otherlv_2= 'is' otherlv_3= 'a' otherlv_4= 'task' otherlv_5= 'of' ) | ( () otherlv_7= 'that' otherlv_8= 'is' otherlv_9= 'a' otherlv_10= 'team' otherlv_11= 'of' ) | ( () otherlv_13= 'that' otherlv_14= 'is' otherlv_15= 'in' ) | ( () (otherlv_17= 'currently' )? otherlv_18= 'doing' ) | ( () otherlv_20= 'that' otherlv_21= 'has' otherlv_22= 'scheduled' ) | ( () otherlv_24= 'that' otherlv_25= 'has' otherlv_26= 'planned' otherlv_27= 'in' otherlv_28= 'the' otherlv_29= 'future' ) | ( () otherlv_31= 'that' otherlv_32= 'has' otherlv_33= 'finished' ) | ( () (otherlv_35= 'currently' )? otherlv_36= 'performing' ) | ( () (otherlv_38= 'currently' )? otherlv_39= 'in' ) | ( () (otherlv_41= 'currently' )? otherlv_42= 'on' ) | ( () otherlv_44= 'with' otherlv_45= 'as' otherlv_46= 'home' ) | ( () otherlv_48= 'with' otherlv_49= 'task' otherlv_50= 'area' ) | ( () otherlv_52= 'which' otherlv_53= 'visits' ) | ( () otherlv_55= 'which' otherlv_56= 'will' otherlv_57= 'visit' otherlv_58= 'in' otherlv_59= 'the' otherlv_60= 'future' ) | ( () otherlv_62= 'which' otherlv_63= 'has' otherlv_64= 'visited' ) | ( () otherlv_66= 'with' otherlv_67= 'points' ) | ( () otherlv_69= 'with' otherlv_70= 'initial' otherlv_71= 'position' ) | ( () otherlv_73= 'which' otherlv_74= 'references' ) ) )
            // InternalMissionSpecification.g:1687:2: ( ( () otherlv_1= 'that' otherlv_2= 'is' otherlv_3= 'a' otherlv_4= 'task' otherlv_5= 'of' ) | ( () otherlv_7= 'that' otherlv_8= 'is' otherlv_9= 'a' otherlv_10= 'team' otherlv_11= 'of' ) | ( () otherlv_13= 'that' otherlv_14= 'is' otherlv_15= 'in' ) | ( () (otherlv_17= 'currently' )? otherlv_18= 'doing' ) | ( () otherlv_20= 'that' otherlv_21= 'has' otherlv_22= 'scheduled' ) | ( () otherlv_24= 'that' otherlv_25= 'has' otherlv_26= 'planned' otherlv_27= 'in' otherlv_28= 'the' otherlv_29= 'future' ) | ( () otherlv_31= 'that' otherlv_32= 'has' otherlv_33= 'finished' ) | ( () (otherlv_35= 'currently' )? otherlv_36= 'performing' ) | ( () (otherlv_38= 'currently' )? otherlv_39= 'in' ) | ( () (otherlv_41= 'currently' )? otherlv_42= 'on' ) | ( () otherlv_44= 'with' otherlv_45= 'as' otherlv_46= 'home' ) | ( () otherlv_48= 'with' otherlv_49= 'task' otherlv_50= 'area' ) | ( () otherlv_52= 'which' otherlv_53= 'visits' ) | ( () otherlv_55= 'which' otherlv_56= 'will' otherlv_57= 'visit' otherlv_58= 'in' otherlv_59= 'the' otherlv_60= 'future' ) | ( () otherlv_62= 'which' otherlv_63= 'has' otherlv_64= 'visited' ) | ( () otherlv_66= 'with' otherlv_67= 'points' ) | ( () otherlv_69= 'with' otherlv_70= 'initial' otherlv_71= 'position' ) | ( () otherlv_73= 'which' otherlv_74= 'references' ) )
            {
            // InternalMissionSpecification.g:1687:2: ( ( () otherlv_1= 'that' otherlv_2= 'is' otherlv_3= 'a' otherlv_4= 'task' otherlv_5= 'of' ) | ( () otherlv_7= 'that' otherlv_8= 'is' otherlv_9= 'a' otherlv_10= 'team' otherlv_11= 'of' ) | ( () otherlv_13= 'that' otherlv_14= 'is' otherlv_15= 'in' ) | ( () (otherlv_17= 'currently' )? otherlv_18= 'doing' ) | ( () otherlv_20= 'that' otherlv_21= 'has' otherlv_22= 'scheduled' ) | ( () otherlv_24= 'that' otherlv_25= 'has' otherlv_26= 'planned' otherlv_27= 'in' otherlv_28= 'the' otherlv_29= 'future' ) | ( () otherlv_31= 'that' otherlv_32= 'has' otherlv_33= 'finished' ) | ( () (otherlv_35= 'currently' )? otherlv_36= 'performing' ) | ( () (otherlv_38= 'currently' )? otherlv_39= 'in' ) | ( () (otherlv_41= 'currently' )? otherlv_42= 'on' ) | ( () otherlv_44= 'with' otherlv_45= 'as' otherlv_46= 'home' ) | ( () otherlv_48= 'with' otherlv_49= 'task' otherlv_50= 'area' ) | ( () otherlv_52= 'which' otherlv_53= 'visits' ) | ( () otherlv_55= 'which' otherlv_56= 'will' otherlv_57= 'visit' otherlv_58= 'in' otherlv_59= 'the' otherlv_60= 'future' ) | ( () otherlv_62= 'which' otherlv_63= 'has' otherlv_64= 'visited' ) | ( () otherlv_66= 'with' otherlv_67= 'points' ) | ( () otherlv_69= 'with' otherlv_70= 'initial' otherlv_71= 'position' ) | ( () otherlv_73= 'which' otherlv_74= 'references' ) )
            int alt31=18;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalMissionSpecification.g:1688:3: ( () otherlv_1= 'that' otherlv_2= 'is' otherlv_3= 'a' otherlv_4= 'task' otherlv_5= 'of' )
                    {
                    // InternalMissionSpecification.g:1688:3: ( () otherlv_1= 'that' otherlv_2= 'is' otherlv_3= 'a' otherlv_4= 'task' otherlv_5= 'of' )
                    // InternalMissionSpecification.g:1689:4: () otherlv_1= 'that' otherlv_2= 'is' otherlv_3= 'a' otherlv_4= 'task' otherlv_5= 'of'
                    {
                    // InternalMissionSpecification.g:1689:4: ()
                    // InternalMissionSpecification.g:1690:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getTasksAssociationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getThatKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,21,FOLLOW_51); 

                    				newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getIsKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,50,FOLLOW_52); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getAKeyword_0_3());
                    			
                    otherlv_4=(Token)match(input,52,FOLLOW_53); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getTaskKeyword_0_4());
                    			
                    otherlv_5=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getOfKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMissionSpecification.g:1718:3: ( () otherlv_7= 'that' otherlv_8= 'is' otherlv_9= 'a' otherlv_10= 'team' otherlv_11= 'of' )
                    {
                    // InternalMissionSpecification.g:1718:3: ( () otherlv_7= 'that' otherlv_8= 'is' otherlv_9= 'a' otherlv_10= 'team' otherlv_11= 'of' )
                    // InternalMissionSpecification.g:1719:4: () otherlv_7= 'that' otherlv_8= 'is' otherlv_9= 'a' otherlv_10= 'team' otherlv_11= 'of'
                    {
                    // InternalMissionSpecification.g:1719:4: ()
                    // InternalMissionSpecification.g:1720:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getTeamAssociationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getThatKeyword_1_1());
                    			
                    otherlv_8=(Token)match(input,21,FOLLOW_51); 

                    				newLeafNode(otherlv_8, grammarAccess.getAssociationAccess().getIsKeyword_1_2());
                    			
                    otherlv_9=(Token)match(input,50,FOLLOW_54); 

                    				newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getAKeyword_1_3());
                    			
                    otherlv_10=(Token)match(input,54,FOLLOW_53); 

                    				newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getTeamKeyword_1_4());
                    			
                    otherlv_11=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getAssociationAccess().getOfKeyword_1_5());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMissionSpecification.g:1748:3: ( () otherlv_13= 'that' otherlv_14= 'is' otherlv_15= 'in' )
                    {
                    // InternalMissionSpecification.g:1748:3: ( () otherlv_13= 'that' otherlv_14= 'is' otherlv_15= 'in' )
                    // InternalMissionSpecification.g:1749:4: () otherlv_13= 'that' otherlv_14= 'is' otherlv_15= 'in'
                    {
                    // InternalMissionSpecification.g:1749:4: ()
                    // InternalMissionSpecification.g:1750:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getRobotsAssociationAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_13=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getAssociationAccess().getThatKeyword_2_1());
                    			
                    otherlv_14=(Token)match(input,21,FOLLOW_34); 

                    				newLeafNode(otherlv_14, grammarAccess.getAssociationAccess().getIsKeyword_2_2());
                    			
                    otherlv_15=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getInKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMissionSpecification.g:1770:3: ( () (otherlv_17= 'currently' )? otherlv_18= 'doing' )
                    {
                    // InternalMissionSpecification.g:1770:3: ( () (otherlv_17= 'currently' )? otherlv_18= 'doing' )
                    // InternalMissionSpecification.g:1771:4: () (otherlv_17= 'currently' )? otherlv_18= 'doing'
                    {
                    // InternalMissionSpecification.g:1771:4: ()
                    // InternalMissionSpecification.g:1772:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getCurrentTaskAssociationAction_3_0(),
                    						current);
                    				

                    }

                    // InternalMissionSpecification.g:1778:4: (otherlv_17= 'currently' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==55) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalMissionSpecification.g:1779:5: otherlv_17= 'currently'
                            {
                            otherlv_17=(Token)match(input,55,FOLLOW_55); 

                            					newLeafNode(otherlv_17, grammarAccess.getAssociationAccess().getCurrentlyKeyword_3_1());
                            				

                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,56,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getAssociationAccess().getDoingKeyword_3_2());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMissionSpecification.g:1790:3: ( () otherlv_20= 'that' otherlv_21= 'has' otherlv_22= 'scheduled' )
                    {
                    // InternalMissionSpecification.g:1790:3: ( () otherlv_20= 'that' otherlv_21= 'has' otherlv_22= 'scheduled' )
                    // InternalMissionSpecification.g:1791:4: () otherlv_20= 'that' otherlv_21= 'has' otherlv_22= 'scheduled'
                    {
                    // InternalMissionSpecification.g:1791:4: ()
                    // InternalMissionSpecification.g:1792:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getCoveredTasksAssociationAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_20=(Token)match(input,25,FOLLOW_56); 

                    				newLeafNode(otherlv_20, grammarAccess.getAssociationAccess().getThatKeyword_4_1());
                    			
                    otherlv_21=(Token)match(input,37,FOLLOW_57); 

                    				newLeafNode(otherlv_21, grammarAccess.getAssociationAccess().getHasKeyword_4_2());
                    			
                    otherlv_22=(Token)match(input,57,FOLLOW_2); 

                    				newLeafNode(otherlv_22, grammarAccess.getAssociationAccess().getScheduledKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMissionSpecification.g:1812:3: ( () otherlv_24= 'that' otherlv_25= 'has' otherlv_26= 'planned' otherlv_27= 'in' otherlv_28= 'the' otherlv_29= 'future' )
                    {
                    // InternalMissionSpecification.g:1812:3: ( () otherlv_24= 'that' otherlv_25= 'has' otherlv_26= 'planned' otherlv_27= 'in' otherlv_28= 'the' otherlv_29= 'future' )
                    // InternalMissionSpecification.g:1813:4: () otherlv_24= 'that' otherlv_25= 'has' otherlv_26= 'planned' otherlv_27= 'in' otherlv_28= 'the' otherlv_29= 'future'
                    {
                    // InternalMissionSpecification.g:1813:4: ()
                    // InternalMissionSpecification.g:1814:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getTodoTasksAssociationAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_24=(Token)match(input,25,FOLLOW_56); 

                    				newLeafNode(otherlv_24, grammarAccess.getAssociationAccess().getThatKeyword_5_1());
                    			
                    otherlv_25=(Token)match(input,37,FOLLOW_58); 

                    				newLeafNode(otherlv_25, grammarAccess.getAssociationAccess().getHasKeyword_5_2());
                    			
                    otherlv_26=(Token)match(input,58,FOLLOW_34); 

                    				newLeafNode(otherlv_26, grammarAccess.getAssociationAccess().getPlannedKeyword_5_3());
                    			
                    otherlv_27=(Token)match(input,40,FOLLOW_12); 

                    				newLeafNode(otherlv_27, grammarAccess.getAssociationAccess().getInKeyword_5_4());
                    			
                    otherlv_28=(Token)match(input,23,FOLLOW_59); 

                    				newLeafNode(otherlv_28, grammarAccess.getAssociationAccess().getTheKeyword_5_5());
                    			
                    otherlv_29=(Token)match(input,59,FOLLOW_2); 

                    				newLeafNode(otherlv_29, grammarAccess.getAssociationAccess().getFutureKeyword_5_6());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMissionSpecification.g:1846:3: ( () otherlv_31= 'that' otherlv_32= 'has' otherlv_33= 'finished' )
                    {
                    // InternalMissionSpecification.g:1846:3: ( () otherlv_31= 'that' otherlv_32= 'has' otherlv_33= 'finished' )
                    // InternalMissionSpecification.g:1847:4: () otherlv_31= 'that' otherlv_32= 'has' otherlv_33= 'finished'
                    {
                    // InternalMissionSpecification.g:1847:4: ()
                    // InternalMissionSpecification.g:1848:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getFinishedTasksAssociationAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_31=(Token)match(input,25,FOLLOW_56); 

                    				newLeafNode(otherlv_31, grammarAccess.getAssociationAccess().getThatKeyword_6_1());
                    			
                    otherlv_32=(Token)match(input,37,FOLLOW_60); 

                    				newLeafNode(otherlv_32, grammarAccess.getAssociationAccess().getHasKeyword_6_2());
                    			
                    otherlv_33=(Token)match(input,60,FOLLOW_2); 

                    				newLeafNode(otherlv_33, grammarAccess.getAssociationAccess().getFinishedKeyword_6_3());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMissionSpecification.g:1868:3: ( () (otherlv_35= 'currently' )? otherlv_36= 'performing' )
                    {
                    // InternalMissionSpecification.g:1868:3: ( () (otherlv_35= 'currently' )? otherlv_36= 'performing' )
                    // InternalMissionSpecification.g:1869:4: () (otherlv_35= 'currently' )? otherlv_36= 'performing'
                    {
                    // InternalMissionSpecification.g:1869:4: ()
                    // InternalMissionSpecification.g:1870:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getPerformingActionAssociationAction_7_0(),
                    						current);
                    				

                    }

                    // InternalMissionSpecification.g:1876:4: (otherlv_35= 'currently' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==55) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalMissionSpecification.g:1877:5: otherlv_35= 'currently'
                            {
                            otherlv_35=(Token)match(input,55,FOLLOW_61); 

                            					newLeafNode(otherlv_35, grammarAccess.getAssociationAccess().getCurrentlyKeyword_7_1());
                            				

                            }
                            break;

                    }

                    otherlv_36=(Token)match(input,61,FOLLOW_2); 

                    				newLeafNode(otherlv_36, grammarAccess.getAssociationAccess().getPerformingKeyword_7_2());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMissionSpecification.g:1888:3: ( () (otherlv_38= 'currently' )? otherlv_39= 'in' )
                    {
                    // InternalMissionSpecification.g:1888:3: ( () (otherlv_38= 'currently' )? otherlv_39= 'in' )
                    // InternalMissionSpecification.g:1889:4: () (otherlv_38= 'currently' )? otherlv_39= 'in'
                    {
                    // InternalMissionSpecification.g:1889:4: ()
                    // InternalMissionSpecification.g:1890:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getInAssociationAction_8_0(),
                    						current);
                    				

                    }

                    // InternalMissionSpecification.g:1896:4: (otherlv_38= 'currently' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==55) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalMissionSpecification.g:1897:5: otherlv_38= 'currently'
                            {
                            otherlv_38=(Token)match(input,55,FOLLOW_34); 

                            					newLeafNode(otherlv_38, grammarAccess.getAssociationAccess().getCurrentlyKeyword_8_1());
                            				

                            }
                            break;

                    }

                    otherlv_39=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_39, grammarAccess.getAssociationAccess().getInKeyword_8_2());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMissionSpecification.g:1908:3: ( () (otherlv_41= 'currently' )? otherlv_42= 'on' )
                    {
                    // InternalMissionSpecification.g:1908:3: ( () (otherlv_41= 'currently' )? otherlv_42= 'on' )
                    // InternalMissionSpecification.g:1909:4: () (otherlv_41= 'currently' )? otherlv_42= 'on'
                    {
                    // InternalMissionSpecification.g:1909:4: ()
                    // InternalMissionSpecification.g:1910:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getCurrentPositionAssociationAction_9_0(),
                    						current);
                    				

                    }

                    // InternalMissionSpecification.g:1916:4: (otherlv_41= 'currently' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==55) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalMissionSpecification.g:1917:5: otherlv_41= 'currently'
                            {
                            otherlv_41=(Token)match(input,55,FOLLOW_62); 

                            					newLeafNode(otherlv_41, grammarAccess.getAssociationAccess().getCurrentlyKeyword_9_1());
                            				

                            }
                            break;

                    }

                    otherlv_42=(Token)match(input,62,FOLLOW_2); 

                    				newLeafNode(otherlv_42, grammarAccess.getAssociationAccess().getOnKeyword_9_2());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMissionSpecification.g:1928:3: ( () otherlv_44= 'with' otherlv_45= 'as' otherlv_46= 'home' )
                    {
                    // InternalMissionSpecification.g:1928:3: ( () otherlv_44= 'with' otherlv_45= 'as' otherlv_46= 'home' )
                    // InternalMissionSpecification.g:1929:4: () otherlv_44= 'with' otherlv_45= 'as' otherlv_46= 'home'
                    {
                    // InternalMissionSpecification.g:1929:4: ()
                    // InternalMissionSpecification.g:1930:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getHomeAssociationAction_10_0(),
                    						current);
                    				

                    }

                    otherlv_44=(Token)match(input,44,FOLLOW_44); 

                    				newLeafNode(otherlv_44, grammarAccess.getAssociationAccess().getWithKeyword_10_1());
                    			
                    otherlv_45=(Token)match(input,45,FOLLOW_63); 

                    				newLeafNode(otherlv_45, grammarAccess.getAssociationAccess().getAsKeyword_10_2());
                    			
                    otherlv_46=(Token)match(input,63,FOLLOW_2); 

                    				newLeafNode(otherlv_46, grammarAccess.getAssociationAccess().getHomeKeyword_10_3());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalMissionSpecification.g:1950:3: ( () otherlv_48= 'with' otherlv_49= 'task' otherlv_50= 'area' )
                    {
                    // InternalMissionSpecification.g:1950:3: ( () otherlv_48= 'with' otherlv_49= 'task' otherlv_50= 'area' )
                    // InternalMissionSpecification.g:1951:4: () otherlv_48= 'with' otherlv_49= 'task' otherlv_50= 'area'
                    {
                    // InternalMissionSpecification.g:1951:4: ()
                    // InternalMissionSpecification.g:1952:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getTaskAreaAssociationAction_11_0(),
                    						current);
                    				

                    }

                    otherlv_48=(Token)match(input,44,FOLLOW_52); 

                    				newLeafNode(otherlv_48, grammarAccess.getAssociationAccess().getWithKeyword_11_1());
                    			
                    otherlv_49=(Token)match(input,52,FOLLOW_64); 

                    				newLeafNode(otherlv_49, grammarAccess.getAssociationAccess().getTaskKeyword_11_2());
                    			
                    otherlv_50=(Token)match(input,64,FOLLOW_2); 

                    				newLeafNode(otherlv_50, grammarAccess.getAssociationAccess().getAreaKeyword_11_3());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalMissionSpecification.g:1972:3: ( () otherlv_52= 'which' otherlv_53= 'visits' )
                    {
                    // InternalMissionSpecification.g:1972:3: ( () otherlv_52= 'which' otherlv_53= 'visits' )
                    // InternalMissionSpecification.g:1973:4: () otherlv_52= 'which' otherlv_53= 'visits'
                    {
                    // InternalMissionSpecification.g:1973:4: ()
                    // InternalMissionSpecification.g:1974:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getCoveredPointsAssociationAction_12_0(),
                    						current);
                    				

                    }

                    otherlv_52=(Token)match(input,65,FOLLOW_65); 

                    				newLeafNode(otherlv_52, grammarAccess.getAssociationAccess().getWhichKeyword_12_1());
                    			
                    otherlv_53=(Token)match(input,66,FOLLOW_2); 

                    				newLeafNode(otherlv_53, grammarAccess.getAssociationAccess().getVisitsKeyword_12_2());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalMissionSpecification.g:1990:3: ( () otherlv_55= 'which' otherlv_56= 'will' otherlv_57= 'visit' otherlv_58= 'in' otherlv_59= 'the' otherlv_60= 'future' )
                    {
                    // InternalMissionSpecification.g:1990:3: ( () otherlv_55= 'which' otherlv_56= 'will' otherlv_57= 'visit' otherlv_58= 'in' otherlv_59= 'the' otherlv_60= 'future' )
                    // InternalMissionSpecification.g:1991:4: () otherlv_55= 'which' otherlv_56= 'will' otherlv_57= 'visit' otherlv_58= 'in' otherlv_59= 'the' otherlv_60= 'future'
                    {
                    // InternalMissionSpecification.g:1991:4: ()
                    // InternalMissionSpecification.g:1992:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getTodoPointsAssociationAction_13_0(),
                    						current);
                    				

                    }

                    otherlv_55=(Token)match(input,65,FOLLOW_66); 

                    				newLeafNode(otherlv_55, grammarAccess.getAssociationAccess().getWhichKeyword_13_1());
                    			
                    otherlv_56=(Token)match(input,67,FOLLOW_67); 

                    				newLeafNode(otherlv_56, grammarAccess.getAssociationAccess().getWillKeyword_13_2());
                    			
                    otherlv_57=(Token)match(input,68,FOLLOW_34); 

                    				newLeafNode(otherlv_57, grammarAccess.getAssociationAccess().getVisitKeyword_13_3());
                    			
                    otherlv_58=(Token)match(input,40,FOLLOW_12); 

                    				newLeafNode(otherlv_58, grammarAccess.getAssociationAccess().getInKeyword_13_4());
                    			
                    otherlv_59=(Token)match(input,23,FOLLOW_59); 

                    				newLeafNode(otherlv_59, grammarAccess.getAssociationAccess().getTheKeyword_13_5());
                    			
                    otherlv_60=(Token)match(input,59,FOLLOW_2); 

                    				newLeafNode(otherlv_60, grammarAccess.getAssociationAccess().getFutureKeyword_13_6());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalMissionSpecification.g:2024:3: ( () otherlv_62= 'which' otherlv_63= 'has' otherlv_64= 'visited' )
                    {
                    // InternalMissionSpecification.g:2024:3: ( () otherlv_62= 'which' otherlv_63= 'has' otherlv_64= 'visited' )
                    // InternalMissionSpecification.g:2025:4: () otherlv_62= 'which' otherlv_63= 'has' otherlv_64= 'visited'
                    {
                    // InternalMissionSpecification.g:2025:4: ()
                    // InternalMissionSpecification.g:2026:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getFinishedPointsAssociationAction_14_0(),
                    						current);
                    				

                    }

                    otherlv_62=(Token)match(input,65,FOLLOW_56); 

                    				newLeafNode(otherlv_62, grammarAccess.getAssociationAccess().getWhichKeyword_14_1());
                    			
                    otherlv_63=(Token)match(input,37,FOLLOW_68); 

                    				newLeafNode(otherlv_63, grammarAccess.getAssociationAccess().getHasKeyword_14_2());
                    			
                    otherlv_64=(Token)match(input,69,FOLLOW_2); 

                    				newLeafNode(otherlv_64, grammarAccess.getAssociationAccess().getVisitedKeyword_14_3());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalMissionSpecification.g:2046:3: ( () otherlv_66= 'with' otherlv_67= 'points' )
                    {
                    // InternalMissionSpecification.g:2046:3: ( () otherlv_66= 'with' otherlv_67= 'points' )
                    // InternalMissionSpecification.g:2047:4: () otherlv_66= 'with' otherlv_67= 'points'
                    {
                    // InternalMissionSpecification.g:2047:4: ()
                    // InternalMissionSpecification.g:2048:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getPointsAssociationAction_15_0(),
                    						current);
                    				

                    }

                    otherlv_66=(Token)match(input,44,FOLLOW_69); 

                    				newLeafNode(otherlv_66, grammarAccess.getAssociationAccess().getWithKeyword_15_1());
                    			
                    otherlv_67=(Token)match(input,70,FOLLOW_2); 

                    				newLeafNode(otherlv_67, grammarAccess.getAssociationAccess().getPointsKeyword_15_2());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalMissionSpecification.g:2064:3: ( () otherlv_69= 'with' otherlv_70= 'initial' otherlv_71= 'position' )
                    {
                    // InternalMissionSpecification.g:2064:3: ( () otherlv_69= 'with' otherlv_70= 'initial' otherlv_71= 'position' )
                    // InternalMissionSpecification.g:2065:4: () otherlv_69= 'with' otherlv_70= 'initial' otherlv_71= 'position'
                    {
                    // InternalMissionSpecification.g:2065:4: ()
                    // InternalMissionSpecification.g:2066:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getInitialPositionAssociationAction_16_0(),
                    						current);
                    				

                    }

                    otherlv_69=(Token)match(input,44,FOLLOW_70); 

                    				newLeafNode(otherlv_69, grammarAccess.getAssociationAccess().getWithKeyword_16_1());
                    			
                    otherlv_70=(Token)match(input,71,FOLLOW_71); 

                    				newLeafNode(otherlv_70, grammarAccess.getAssociationAccess().getInitialKeyword_16_2());
                    			
                    otherlv_71=(Token)match(input,72,FOLLOW_2); 

                    				newLeafNode(otherlv_71, grammarAccess.getAssociationAccess().getPositionKeyword_16_3());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalMissionSpecification.g:2086:3: ( () otherlv_73= 'which' otherlv_74= 'references' )
                    {
                    // InternalMissionSpecification.g:2086:3: ( () otherlv_73= 'which' otherlv_74= 'references' )
                    // InternalMissionSpecification.g:2087:4: () otherlv_73= 'which' otherlv_74= 'references'
                    {
                    // InternalMissionSpecification.g:2087:4: ()
                    // InternalMissionSpecification.g:2088:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAssociationAccess().getReferenceAssociationAction_17_0(),
                    						current);
                    				

                    }

                    otherlv_73=(Token)match(input,65,FOLLOW_72); 

                    				newLeafNode(otherlv_73, grammarAccess.getAssociationAccess().getWhichKeyword_17_1());
                    			
                    otherlv_74=(Token)match(input,73,FOLLOW_2); 

                    				newLeafNode(otherlv_74, grammarAccess.getAssociationAccess().getReferencesKeyword_17_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleType"
    // InternalMissionSpecification.g:2107:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMissionSpecification.g:2107:45: (iv_ruleType= ruleType EOF )
            // InternalMissionSpecification.g:2108:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMissionSpecification.g:2114:1: ruleType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMissionSpecification.g:2120:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMissionSpecification.g:2121:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMissionSpecification.g:2121:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMissionSpecification.g:2122:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMissionSpecification.g:2122:3: (lv_name_0_0= RULE_ID )
            // InternalMissionSpecification.g:2123:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleAttribute"
    // InternalMissionSpecification.g:2142:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMissionSpecification.g:2142:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMissionSpecification.g:2143:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMissionSpecification.g:2149:1: ruleAttribute returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMissionSpecification.g:2155:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMissionSpecification.g:2156:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMissionSpecification.g:2156:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMissionSpecification.g:2157:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMissionSpecification.g:2157:3: (lv_name_0_0= RULE_ID )
            // InternalMissionSpecification.g:2158:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAttributeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleLiteral"
    // InternalMissionSpecification.g:2177:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalMissionSpecification.g:2177:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalMissionSpecification.g:2178:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalMissionSpecification.g:2184:1: ruleLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BoolLiteral_3= ruleBoolLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_RealLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BoolLiteral_3 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:2190:2: ( (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BoolLiteral_3= ruleBoolLiteral ) )
            // InternalMissionSpecification.g:2191:2: (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BoolLiteral_3= ruleBoolLiteral )
            {
            // InternalMissionSpecification.g:2191:2: (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BoolLiteral_3= ruleBoolLiteral )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==RULE_INT) ) {
                    alt32=1;
                }
                else if ( (LA32_1==RULE_REAL) ) {
                    alt32=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt32=1;
                }
                break;
            case RULE_REAL:
                {
                alt32=2;
                }
                break;
            case RULE_STRING:
                {
                alt32=3;
                }
                break;
            case 74:
            case 75:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalMissionSpecification.g:2192:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMissionSpecification.g:2201:3: this_RealLiteral_1= ruleRealLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_1=ruleRealLiteral();

                    state._fsp--;


                    			current = this_RealLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMissionSpecification.g:2210:3: this_StringLiteral_2= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_2=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMissionSpecification.g:2219:3: this_BoolLiteral_3= ruleBoolLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolLiteral_3=ruleBoolLiteral();

                    state._fsp--;


                    			current = this_BoolLiteral_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalMissionSpecification.g:2231:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalMissionSpecification.g:2231:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalMissionSpecification.g:2232:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalMissionSpecification.g:2238:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleSignedInt ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:2244:2: ( ( (lv_value_0_0= ruleSignedInt ) ) )
            // InternalMissionSpecification.g:2245:2: ( (lv_value_0_0= ruleSignedInt ) )
            {
            // InternalMissionSpecification.g:2245:2: ( (lv_value_0_0= ruleSignedInt ) )
            // InternalMissionSpecification.g:2246:3: (lv_value_0_0= ruleSignedInt )
            {
            // InternalMissionSpecification.g:2246:3: (lv_value_0_0= ruleSignedInt )
            // InternalMissionSpecification.g:2247:4: lv_value_0_0= ruleSignedInt
            {

            				newCompositeNode(grammarAccess.getIntLiteralAccess().getValueSignedIntParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleSignedInt();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIntLiteralRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"be.uantwerpen.ansymo.missionspecification.MissionSpecification.SignedInt");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalMissionSpecification.g:2267:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalMissionSpecification.g:2267:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalMissionSpecification.g:2268:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;

             current =iv_ruleRealLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalMissionSpecification.g:2274:1: ruleRealLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleSignedReal ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMissionSpecification.g:2280:2: ( ( (lv_value_0_0= ruleSignedReal ) ) )
            // InternalMissionSpecification.g:2281:2: ( (lv_value_0_0= ruleSignedReal ) )
            {
            // InternalMissionSpecification.g:2281:2: ( (lv_value_0_0= ruleSignedReal ) )
            // InternalMissionSpecification.g:2282:3: (lv_value_0_0= ruleSignedReal )
            {
            // InternalMissionSpecification.g:2282:3: (lv_value_0_0= ruleSignedReal )
            // InternalMissionSpecification.g:2283:4: lv_value_0_0= ruleSignedReal
            {

            				newCompositeNode(grammarAccess.getRealLiteralAccess().getValueSignedRealParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleSignedReal();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealLiteralRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"be.uantwerpen.ansymo.missionspecification.MissionSpecification.SignedReal");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMissionSpecification.g:2303:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMissionSpecification.g:2303:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMissionSpecification.g:2304:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMissionSpecification.g:2310:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMissionSpecification.g:2316:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMissionSpecification.g:2317:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMissionSpecification.g:2317:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMissionSpecification.g:2318:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMissionSpecification.g:2318:3: (lv_value_0_0= RULE_STRING )
            // InternalMissionSpecification.g:2319:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBoolLiteral"
    // InternalMissionSpecification.g:2338:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // InternalMissionSpecification.g:2338:52: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalMissionSpecification.g:2339:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
             newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;

             current =iv_ruleBoolLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // InternalMissionSpecification.g:2345:1: ruleBoolLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalMissionSpecification.g:2351:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalMissionSpecification.g:2352:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalMissionSpecification.g:2352:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalMissionSpecification.g:2353:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalMissionSpecification.g:2353:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalMissionSpecification.g:2354:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalMissionSpecification.g:2354:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==74) ) {
                alt33=1;
            }
            else if ( (LA33_0==75) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalMissionSpecification.g:2355:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,74,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBoolLiteralAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolLiteralRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMissionSpecification.g:2366:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,75,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBoolLiteralAccess().getValueFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolLiteralRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleSignedInt"
    // InternalMissionSpecification.g:2382:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalMissionSpecification.g:2382:49: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalMissionSpecification.g:2383:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
             newCompositeNode(grammarAccess.getSignedIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;

             current =iv_ruleSignedInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // InternalMissionSpecification.g:2389:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMissionSpecification.g:2395:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMissionSpecification.g:2396:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMissionSpecification.g:2396:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMissionSpecification.g:2397:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMissionSpecification.g:2397:3: (kw= '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==76) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMissionSpecification.g:2398:4: kw= '-'
                    {
                    kw=(Token)match(input,76,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getSignedIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedInt"


    // $ANTLR start "entryRuleSignedReal"
    // InternalMissionSpecification.g:2415:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // InternalMissionSpecification.g:2415:50: (iv_ruleSignedReal= ruleSignedReal EOF )
            // InternalMissionSpecification.g:2416:2: iv_ruleSignedReal= ruleSignedReal EOF
            {
             newCompositeNode(grammarAccess.getSignedRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignedReal=ruleSignedReal();

            state._fsp--;

             current =iv_ruleSignedReal.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedReal"


    // $ANTLR start "ruleSignedReal"
    // InternalMissionSpecification.g:2422:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_REAL_1= RULE_REAL ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REAL_1=null;


        	enterRule();

        try {
            // InternalMissionSpecification.g:2428:2: ( ( (kw= '-' )? this_REAL_1= RULE_REAL ) )
            // InternalMissionSpecification.g:2429:2: ( (kw= '-' )? this_REAL_1= RULE_REAL )
            {
            // InternalMissionSpecification.g:2429:2: ( (kw= '-' )? this_REAL_1= RULE_REAL )
            // InternalMissionSpecification.g:2430:3: (kw= '-' )? this_REAL_1= RULE_REAL
            {
            // InternalMissionSpecification.g:2430:3: (kw= '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==76) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMissionSpecification.g:2431:4: kw= '-'
                    {
                    kw=(Token)match(input,76,FOLLOW_73); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_REAL_1=(Token)match(input,RULE_REAL,FOLLOW_2); 

            			current.merge(this_REAL_1);
            		

            			newLeafNode(this_REAL_1, grammarAccess.getSignedRealAccess().getREALTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedReal"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String dfa_1s = "\u0143\uffff";
    static final String dfa_2s = "\5\uffff\2\12\15\uffff\1\12\1\uffff\1\12\7\uffff\1\12\7\uffff\1\12\5\uffff\1\12\11\uffff\1\12\2\uffff\1\12\4\uffff\6\12\5\uffff\1\12\1\uffff\1\12\11\uffff\1\12\1\uffff\5\12\3\uffff\1\12\1\uffff\5\12\7\uffff\1\12\1\uffff\1\12\7\uffff\1\12\6\uffff\1\12\1\uffff\5\12\6\uffff\6\12\7\uffff\1\12\11\uffff\1\12\3\uffff\5\12\1\uffff\5\12\1\uffff\5\12\1\uffff\5\12\3\uffff\1\12\2\uffff\6\12\5\uffff\1\12\1\uffff\1\12\2\uffff\5\12\3\uffff\5\12\3\uffff\1\12\1\uffff\5\12\7\uffff\1\12\2\uffff\5\12\1\uffff\5\12\1\uffff\5\12\6\uffff\6\12\3\uffff\5\12\1\uffff\5\12\1\uffff\5\12\1\uffff\5\12\3\uffff\1\12\1\uffff\5\12\3\uffff\5\12\1\uffff\5\12";
    static final String dfa_3s = "\1\16\2\uffff\1\5\1\uffff\2\14\3\5\1\uffff\1\5\1\25\1\50\4\5\1\45\1\53\1\5\1\uffff\1\14\2\5\1\77\1\100\1\110\1\71\1\50\1\14\2\5\1\104\1\105\3\5\1\14\1\57\1\4\1\5\1\55\1\57\1\14\4\5\1\50\1\5\1\64\3\5\1\50\1\5\1\14\2\5\2\4\6\14\1\5\1\4\1\27\2\65\1\14\1\5\1\14\1\27\1\5\1\25\1\50\4\5\1\45\1\5\1\4\5\14\1\4\2\57\1\14\1\4\5\14\1\73\2\5\2\57\1\4\1\5\1\14\1\73\1\14\2\5\1\77\1\100\1\110\1\71\1\50\1\14\2\5\1\104\1\105\2\5\1\14\1\4\5\14\2\4\1\5\3\4\6\14\2\5\1\57\1\4\1\5\1\55\1\57\1\14\4\5\1\50\1\5\1\64\3\5\1\50\1\5\1\4\5\14\1\4\5\14\1\4\5\14\1\4\5\14\1\4\2\57\1\14\2\4\6\14\1\5\1\4\1\27\2\65\1\14\1\5\1\14\1\27\1\4\5\14\3\4\5\14\1\4\2\57\1\14\1\4\5\14\1\73\2\5\2\57\1\4\1\5\1\14\1\73\1\4\5\14\1\4\5\14\1\4\5\14\2\4\1\5\3\4\6\14\2\5\1\4\5\14\1\4\5\14\1\4\5\14\1\4\5\14\1\4\2\57\1\14\1\4\5\14\3\4\5\14\1\4\5\14";
    static final String dfa_4s = "\1\21\2\uffff\1\63\1\uffff\1\14\1\101\2\5\1\63\1\uffff\1\107\1\45\1\76\4\63\1\111\1\53\1\101\1\uffff\1\101\1\5\1\63\1\77\1\100\1\110\1\74\1\62\1\54\2\5\1\104\1\105\3\63\1\101\1\57\1\114\1\61\1\107\1\57\1\101\4\63\1\50\1\63\1\66\1\63\1\61\1\54\1\50\1\63\1\101\2\5\1\114\1\7\6\101\1\5\1\114\1\27\2\65\1\60\1\5\1\54\1\27\1\107\1\45\1\76\4\63\1\111\1\101\1\7\5\101\1\114\2\57\1\101\1\7\5\101\1\73\2\63\2\57\1\114\1\61\1\22\1\73\1\101\1\5\1\63\1\77\1\100\1\110\1\74\1\62\1\54\2\5\1\104\1\105\2\63\1\101\1\7\5\101\2\114\1\63\2\114\1\7\5\22\1\60\1\5\1\63\1\57\1\114\1\61\1\107\1\57\1\101\4\63\1\50\1\63\1\66\1\63\1\61\1\54\1\50\1\63\1\7\5\101\1\7\5\101\1\7\5\22\1\7\5\22\1\114\2\57\1\22\1\114\1\7\6\101\1\5\1\114\1\27\2\65\1\60\1\5\1\54\1\27\1\7\5\22\2\114\1\7\5\101\1\114\2\57\1\101\1\7\5\101\1\73\2\63\2\57\1\114\1\61\1\22\1\73\1\7\5\22\1\7\5\22\1\7\5\101\2\114\1\63\2\114\1\7\5\22\1\60\1\5\1\63\1\7\5\101\1\7\5\101\1\7\5\22\1\7\5\22\1\114\2\57\1\22\1\7\5\22\2\114\1\7\5\22\1\7\5\22";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\4\5\uffff\1\3\12\uffff\1\5\u012d\uffff";
    static final String dfa_6s = "\u0143\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4",
            "",
            "",
            "\1\6\44\uffff\1\5\7\uffff\1\7\1\10",
            "",
            "\1\11",
            "\1\11\5\uffff\1\23\6\uffff\1\14\16\uffff\1\20\3\uffff\1\13\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\24",
            "\1\24",
            "\1\12\15\uffff\1\25\1\12\13\uffff\1\12\11\uffff\1\12\7\uffff\2\12",
            "",
            "\1\26\47\uffff\1\31\3\uffff\1\27\2\uffff\1\32\21\uffff\1\30\1\33",
            "\1\35\17\uffff\1\34",
            "\1\20\17\uffff\1\16\4\uffff\1\17\1\21",
            "\1\36\54\uffff\1\37\1\40",
            "\1\36\54\uffff\1\37\1\40",
            "\1\36\54\uffff\1\37\1\40",
            "\1\36\54\uffff\1\37\1\40",
            "\1\42\34\uffff\1\43\1\41\5\uffff\1\44",
            "\1\45",
            "\1\46\6\uffff\1\11\5\uffff\1\23\6\uffff\1\14\16\uffff\1\20\3\uffff\1\13\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\1\50\1\47\1\uffff\1\53\6\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\54",
            "\1\36\54\uffff\1\37\1\40",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60\1\61\1\uffff\1\62",
            "\1\64\11\uffff\1\63",
            "\1\11\5\uffff\1\23\31\uffff\1\65",
            "\1\66",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\36\54\uffff\1\37\1\40",
            "\1\36\54\uffff\1\37\1\40",
            "\1\71\54\uffff\1\72\1\73",
            "\1\11\5\uffff\1\23\6\uffff\1\14\16\uffff\1\20\3\uffff\1\13\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\74",
            "\1\76\1\uffff\1\100\1\77\102\uffff\1\101\1\102\1\75",
            "\1\103\45\uffff\1\45\5\uffff\1\104",
            "\1\31\6\uffff\1\32\21\uffff\1\30\1\33",
            "\1\105",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\36\54\uffff\1\37\1\40",
            "\1\36\54\uffff\1\37\1\40",
            "\1\36\54\uffff\1\37\1\40",
            "\1\36\54\uffff\1\37\1\40",
            "\1\106",
            "\1\36\54\uffff\1\37\1\40",
            "\1\110\1\uffff\1\107",
            "\1\36\54\uffff\1\37\1\40",
            "\1\111\53\uffff\1\112",
            "\1\113\6\uffff\1\11\5\uffff\1\23\31\uffff\1\65",
            "\1\114",
            "\1\36\54\uffff\1\37\1\40",
            "\1\11\5\uffff\1\23\6\uffff\1\116\16\uffff\1\122\3\uffff\1\115\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\125",
            "\1\125",
            "\1\127\1\uffff\1\131\1\130\102\uffff\1\132\1\133\1\126",
            "\1\76\2\uffff\1\77",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\1\134\1\136\1\uffff\1\135\6\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\137",
            "\1\141\1\uffff\1\143\1\142\102\uffff\1\144\1\145\1\140",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\11\5\uffff\1\154\32\uffff\1\153\1\152\1\uffff\1\151",
            "\1\155",
            "\1\11\5\uffff\1\23\31\uffff\1\65",
            "\1\156",
            "\1\157\47\uffff\1\162\3\uffff\1\160\2\uffff\1\163\21\uffff\1\161\1\164",
            "\1\166\17\uffff\1\165",
            "\1\122\17\uffff\1\120\4\uffff\1\121\1\123",
            "\1\167\54\uffff\1\170\1\171",
            "\1\167\54\uffff\1\170\1\171",
            "\1\167\54\uffff\1\170\1\171",
            "\1\167\54\uffff\1\170\1\171",
            "\1\173\34\uffff\1\174\1\172\5\uffff\1\175",
            "\1\176\6\uffff\1\11\5\uffff\1\23\6\uffff\1\116\16\uffff\1\122\3\uffff\1\115\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\127\2\uffff\1\130",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\u0080\1\uffff\1\u0082\1\u0081\102\uffff\1\u0083\1\u0084\1\177",
            "\1\u0085",
            "\1\u0086",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\141\2\uffff\1\142",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\u0087",
            "\1\36\54\uffff\1\37\1\40",
            "\1\36\54\uffff\1\37\1\40",
            "\1\u0088",
            "\1\u0089",
            "\1\u008b\1\uffff\1\u008d\1\u008c\102\uffff\1\u008e\1\u008f\1\u008a",
            "\1\u0090\45\uffff\1\45\5\uffff\1\u0091",
            "\1\11\5\uffff\1\154",
            "\1\u0092",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\1\u0094\1\u0093\1\uffff\1\u0097\6\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0098",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c\1\u009d\1\uffff\1\u009e",
            "\1\u00a0\11\uffff\1\u009f",
            "\1\11\5\uffff\1\23\31\uffff\1\u00a1",
            "\1\u00a2",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\167\54\uffff\1\170\1\171",
            "\1\167\54\uffff\1\170\1\171",
            "\1\11\5\uffff\1\23\6\uffff\1\116\16\uffff\1\122\3\uffff\1\115\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0080\2\uffff\1\u0081",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\u00a6\1\uffff\1\u00a8\1\u00a7\102\uffff\1\u00a9\1\u00aa\1\u00a5",
            "\1\u00ac\1\uffff\1\u00ae\1\u00ad\102\uffff\1\u00af\1\u00b0\1\u00ab",
            "\1\36\54\uffff\1\37\1\40",
            "\1\u00b2\1\uffff\1\u00b4\1\u00b3\102\uffff\1\u00b5\1\u00b6\1\u00b1",
            "\1\u00b8\1\uffff\1\u00ba\1\u00b9\102\uffff\1\u00bb\1\u00bc\1\u00b7",
            "\1\u008b\2\uffff\1\u008c",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154\32\uffff\1\u00bd\1\u00bf\1\uffff\1\u00be",
            "\1\u00c0",
            "\1\36\54\uffff\1\37\1\40",
            "\1\u00c1",
            "\1\u00c3\1\uffff\1\u00c5\1\u00c4\102\uffff\1\u00c6\1\u00c7\1\u00c2",
            "\1\u00c8\45\uffff\1\45\5\uffff\1\u00c9",
            "\1\162\6\uffff\1\163\21\uffff\1\161\1\164",
            "\1\u00ca",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\167\54\uffff\1\170\1\171",
            "\1\167\54\uffff\1\170\1\171",
            "\1\167\54\uffff\1\170\1\171",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u00cb",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u00cd\1\uffff\1\u00cc",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u00ce\53\uffff\1\u00cf",
            "\1\u00d0\6\uffff\1\11\5\uffff\1\23\31\uffff\1\u00a1",
            "\1\u00d1",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u00a6\2\uffff\1\u00a7",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\u00ac\2\uffff\1\u00ad",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\11\5\uffff\1\51\6\uffff\1\14\16\uffff\1\20\3\uffff\1\52\12\uffff\1\15\1\16\4\uffff\1\17\1\21\2\uffff\1\22",
            "\1\u00b2\2\uffff\1\u00b3",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\u00b8\2\uffff\1\u00b9",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\u00d3\1\uffff\1\u00d5\1\u00d4\102\uffff\1\u00d6\1\u00d7\1\u00d2",
            "\1\u00d8",
            "\1\u00d9",
            "\1\11\5\uffff\1\154",
            "\1\u00db\1\uffff\1\u00dd\1\u00dc\102\uffff\1\u00de\1\u00df\1\u00da",
            "\1\u00c3\2\uffff\1\u00c4",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\1\u00e0\1\u00e2\1\uffff\1\u00e1\6\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u00e3",
            "\1\u00e5\1\uffff\1\u00e7\1\u00e6\102\uffff\1\u00e8\1\u00e9\1\u00e4",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\11\5\uffff\1\u00f0\32\uffff\1\u00ef\1\u00ee\1\uffff\1\u00ed",
            "\1\u00f1",
            "\1\11\5\uffff\1\23\31\uffff\1\u00a1",
            "\1\u00f2",
            "\1\u00d3\2\uffff\1\u00d4",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\u00f4\1\uffff\1\u00f6\1\u00f5\102\uffff\1\u00f7\1\u00f8\1\u00f3",
            "\1\u00fa\1\uffff\1\u00fc\1\u00fb\102\uffff\1\u00fd\1\u00fe\1\u00f9",
            "\1\u00db\2\uffff\1\u00dc",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0100\1\uffff\1\u0102\1\u0101\102\uffff\1\u0103\1\u0104\1\u00ff",
            "\1\u0105",
            "\1\u0106",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u00e5\2\uffff\1\u00e6",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0107",
            "\1\167\54\uffff\1\170\1\171",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u0108",
            "\1\u0109",
            "\1\u010b\1\uffff\1\u010d\1\u010c\102\uffff\1\u010e\1\u010f\1\u010a",
            "\1\u0110\45\uffff\1\45\5\uffff\1\u0111",
            "\1\11\5\uffff\1\u00f0",
            "\1\u0112",
            "\1\u00f4\2\uffff\1\u00f5",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\u00fa\2\uffff\1\u00fb",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\11\5\uffff\1\154",
            "\1\u0100\2\uffff\1\u0101",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0114\1\uffff\1\u0116\1\u0115\102\uffff\1\u0117\1\u0118\1\u0113",
            "\1\u011a\1\uffff\1\u011c\1\u011b\102\uffff\1\u011d\1\u011e\1\u0119",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u0120\1\uffff\1\u0122\1\u0121\102\uffff\1\u0123\1\u0124\1\u011f",
            "\1\u0126\1\uffff\1\u0128\1\u0127\102\uffff\1\u0129\1\u012a\1\u0125",
            "\1\u010b\2\uffff\1\u010c",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0\32\uffff\1\u012b\1\u012d\1\uffff\1\u012c",
            "\1\u012e",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u0114\2\uffff\1\u0115",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u011a\2\uffff\1\u011b",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\11\5\uffff\1\u0095\6\uffff\1\116\16\uffff\1\122\3\uffff\1\u0096\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0120\2\uffff\1\u0121",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\u0126\2\uffff\1\u0127",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\u0130\1\uffff\1\u0132\1\u0131\102\uffff\1\u0133\1\u0134\1\u012f",
            "\1\u0135",
            "\1\u0136",
            "\1\11\5\uffff\1\u00f0",
            "\1\u0130\2\uffff\1\u0131",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\u0138\1\uffff\1\u013a\1\u0139\102\uffff\1\u013b\1\u013c\1\u0137",
            "\1\u013e\1\uffff\1\u0140\1\u013f\102\uffff\1\u0141\1\u0142\1\u013d",
            "\1\u0138\2\uffff\1\u0139",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\u013e\2\uffff\1\u013f",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0",
            "\1\11\5\uffff\1\u00f0"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "181:2: ( ( () otherlv_1= 'Globally' ) | ( () otherlv_3= 'Before' ( (lv_r_4_0= ruleProposition ) ) ) | ( () otherlv_6= 'After' ( (lv_q_7_0= ruleProposition ) ) ) | ( () otherlv_9= 'Between' ( (lv_q_10_0= ruleProposition ) ) otherlv_11= ',' otherlv_12= 'and' ( (lv_r_13_0= ruleProposition ) ) ) | ( () otherlv_15= 'After' ( (lv_q_16_0= ruleProposition ) ) otherlv_17= ',' otherlv_18= 'until' ( (lv_r_19_0= ruleProposition ) ) ) )";
        }
    }
    static final String dfa_8s = "\1\5\1\25\1\32\1\22\2\5\1\26\1\34\2\uffff\1\5\1\25\1\50\4\5\1\45\1\53\1\5\2\uffff\1\77\1\100\1\110\1\22\2\5\1\50\1\71\1\22\3\5\1\104\1\5\1\105\1\5\1\22\4\5\1\55\1\57\1\4\1\57\1\22\1\64\2\5\1\50\3\5\1\50\1\5\1\22\2\5\1\22\1\5\2\4\5\22\1\4\2\65\1\27\1\22\1\5\1\22\1\27\1\5\1\25\1\50\4\5\1\45\1\5\1\57\1\4\1\57\1\22\1\4\5\22\1\4\5\22\2\5\1\73\1\5\1\57\1\4\1\57\1\22\1\73\1\77\1\100\1\110\1\22\2\5\1\50\1\71\1\22\3\5\1\104\1\5\1\105\1\22\2\4\5\22\1\4\1\5\1\22\1\5\2\4\5\22\1\4\5\5\1\55\1\57\1\4\1\57\1\22\1\64\2\5\1\50\3\5\1\50\1\5\1\4\5\22\1\4\5\22\1\57\1\4\1\57\1\22\1\4\5\22\1\4\6\22\1\5\2\4\5\22\1\4\2\65\1\27\1\22\1\5\1\22\1\27\2\4\5\22\1\4\1\57\1\4\1\57\1\22\1\4\5\22\1\4\5\22\2\5\1\73\1\5\1\57\1\4\1\57\1\22\1\73\1\4\5\22\1\4\5\22\2\4\5\22\1\4\1\5\1\22\1\5\2\4\5\22\1\4\1\5\1\4\5\22\1\4\5\22\1\57\1\4\1\57\1\22\1\4\5\22\1\4\5\22\2\4\5\22\2\4\5\22\1\4\5\22";
    static final String dfa_9s = "\1\63\1\25\1\35\1\101\2\5\1\33\1\35\2\uffff\1\107\1\45\1\76\4\63\1\111\1\53\1\101\2\uffff\1\77\1\100\1\110\1\101\1\5\1\63\1\62\1\74\1\54\2\5\1\63\1\104\1\63\1\105\1\63\1\101\3\63\1\61\1\107\1\57\1\114\1\57\1\101\1\66\2\63\1\50\1\63\1\61\1\54\1\50\1\63\1\101\2\5\1\101\1\5\1\114\1\7\5\101\1\114\2\65\1\27\1\60\1\5\1\54\1\27\1\107\1\45\1\76\4\63\1\111\1\101\1\57\1\114\1\57\1\101\1\7\5\101\1\7\5\101\2\63\1\73\1\61\1\57\1\114\1\57\1\35\1\73\1\77\1\100\1\110\1\101\1\5\1\63\1\62\1\74\1\54\2\5\1\63\1\104\1\63\1\105\1\101\1\114\1\7\5\101\1\114\1\63\1\60\1\5\1\114\1\7\5\35\1\114\4\63\1\61\1\107\1\57\1\114\1\57\1\101\1\66\2\63\1\50\1\63\1\61\1\54\1\50\1\63\1\7\5\101\1\7\5\101\1\57\1\114\1\57\1\35\1\7\5\35\1\7\5\35\1\101\1\5\1\114\1\7\5\101\1\114\2\65\1\27\1\60\1\5\1\54\1\27\1\114\1\7\5\35\1\114\1\57\1\114\1\57\1\101\1\7\5\101\1\7\5\101\2\63\1\73\1\61\1\57\1\114\1\57\1\35\1\73\1\7\5\35\1\7\5\35\1\114\1\7\5\101\1\114\1\63\1\60\1\5\1\114\1\7\5\35\1\114\1\63\1\7\5\101\1\7\5\101\1\57\1\114\1\57\1\35\1\7\5\35\1\7\5\35\1\114\1\7\5\35\1\114\1\7\5\35\1\7\5\35";
    static final String dfa_10s = "\10\uffff\1\3\1\4\12\uffff\1\2\1\1\u012d\uffff";
    static final String[] dfa_11s = {
            "\1\3\16\uffff\1\1\25\uffff\1\2\7\uffff\1\4\1\5",
            "\1\6",
            "\1\7\1\uffff\1\10\1\11",
            "\1\22\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\12\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\23",
            "\1\23",
            "\1\25\4\uffff\1\24",
            "\1\10\1\11",
            "",
            "",
            "\1\31\47\uffff\1\26\3\uffff\1\32\2\uffff\1\27\21\uffff\1\33\1\30",
            "\1\34\17\uffff\1\35",
            "\1\17\17\uffff\1\15\4\uffff\1\16\1\20",
            "\1\36\54\uffff\1\37\1\40",
            "\1\36\54\uffff\1\37\1\40",
            "\1\36\54\uffff\1\37\1\40",
            "\1\36\54\uffff\1\37\1\40",
            "\1\44\34\uffff\1\41\1\42\5\uffff\1\43",
            "\1\45",
            "\1\46\14\uffff\1\22\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\12\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\1\55\1\56\1\uffff\1\54\6\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\57",
            "\1\36\54\uffff\1\37\1\40",
            "\1\61\11\uffff\1\60",
            "\1\62\1\63\1\uffff\1\64",
            "\1\22\7\uffff\1\7\1\uffff\1\10\1\11\16\uffff\1\65",
            "\1\66",
            "\1\66",
            "\1\36\54\uffff\1\37\1\40",
            "\1\67",
            "\1\36\54\uffff\1\37\1\40",
            "\1\70",
            "\1\71\54\uffff\1\72\1\73",
            "\1\22\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\12\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\36\54\uffff\1\37\1\40",
            "\1\36\54\uffff\1\37\1\40",
            "\1\36\54\uffff\1\37\1\40",
            "\1\74\45\uffff\1\45\5\uffff\1\75",
            "\1\26\6\uffff\1\27\21\uffff\1\33\1\30",
            "\1\76",
            "\1\100\1\uffff\1\102\1\101\102\uffff\1\103\1\104\1\77",
            "\1\105",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\106\1\uffff\1\107",
            "\1\36\54\uffff\1\37\1\40",
            "\1\36\54\uffff\1\37\1\40",
            "\1\110",
            "\1\36\54\uffff\1\37\1\40",
            "\1\111\53\uffff\1\112",
            "\1\113\14\uffff\1\22\7\uffff\1\7\1\uffff\1\10\1\11\16\uffff\1\65",
            "\1\114",
            "\1\36\54\uffff\1\37\1\40",
            "\1\22\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\115\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\125",
            "\1\125",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\1\127\1\130\1\uffff\1\126\6\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\131",
            "\1\133\1\uffff\1\135\1\134\102\uffff\1\136\1\137\1\132",
            "\1\100\2\uffff\1\101",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\141\1\uffff\1\143\1\142\102\uffff\1\144\1\145\1\140",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11\17\uffff\1\153\1\154\1\uffff\1\152",
            "\1\155",
            "\1\22\7\uffff\1\7\1\uffff\1\10\1\11\16\uffff\1\65",
            "\1\156",
            "\1\162\47\uffff\1\157\3\uffff\1\163\2\uffff\1\160\21\uffff\1\164\1\161",
            "\1\165\17\uffff\1\166",
            "\1\122\17\uffff\1\120\4\uffff\1\121\1\123",
            "\1\167\54\uffff\1\170\1\171",
            "\1\167\54\uffff\1\170\1\171",
            "\1\167\54\uffff\1\170\1\171",
            "\1\167\54\uffff\1\170\1\171",
            "\1\175\34\uffff\1\172\1\173\5\uffff\1\174",
            "\1\176\14\uffff\1\22\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\115\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\177",
            "\1\u0081\1\uffff\1\u0083\1\u0082\102\uffff\1\u0084\1\u0085\1\u0080",
            "\1\u0086",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\133\2\uffff\1\134",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\141\2\uffff\1\142",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\36\54\uffff\1\37\1\40",
            "\1\36\54\uffff\1\37\1\40",
            "\1\u0087",
            "\1\u0088\45\uffff\1\45\5\uffff\1\u0089",
            "\1\u008a",
            "\1\u008c\1\uffff\1\u008e\1\u008d\102\uffff\1\u008f\1\u0090\1\u008b",
            "\1\u0091",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\1\u0099\1\u009a\1\uffff\1\u0098\6\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u009b",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u009d\11\uffff\1\u009c",
            "\1\u009e\1\u009f\1\uffff\1\u00a0",
            "\1\22\7\uffff\1\7\1\uffff\1\10\1\11\16\uffff\1\u00a1",
            "\1\u00a2",
            "\1\u00a2",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u00a3",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u00a4",
            "\1\22\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\115\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u00a6\1\uffff\1\u00a8\1\u00a7\102\uffff\1\u00a9\1\u00aa\1\u00a5",
            "\1\u0081\2\uffff\1\u0082",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\u00ac\1\uffff\1\u00ae\1\u00ad\102\uffff\1\u00af\1\u00b0\1\u00ab",
            "\1\36\54\uffff\1\37\1\40",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11\17\uffff\1\u00b2\1\u00b3\1\uffff\1\u00b1",
            "\1\u00b4",
            "\1\u00b6\1\uffff\1\u00b8\1\u00b7\102\uffff\1\u00b9\1\u00ba\1\u00b5",
            "\1\u008c\2\uffff\1\u008d",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00bc\1\uffff\1\u00be\1\u00bd\102\uffff\1\u00bf\1\u00c0\1\u00bb",
            "\1\36\54\uffff\1\37\1\40",
            "\1\167\54\uffff\1\170\1\171",
            "\1\167\54\uffff\1\170\1\171",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u00c1\45\uffff\1\45\5\uffff\1\u00c2",
            "\1\157\6\uffff\1\160\21\uffff\1\164\1\161",
            "\1\u00c3",
            "\1\u00c5\1\uffff\1\u00c7\1\u00c6\102\uffff\1\u00c8\1\u00c9\1\u00c4",
            "\1\u00ca",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u00cb\1\uffff\1\u00cc",
            "\1\167\54\uffff\1\170\1\171",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u00cd",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u00ce\53\uffff\1\u00cf",
            "\1\u00d0\14\uffff\1\22\7\uffff\1\7\1\uffff\1\10\1\11\16\uffff\1\u00a1",
            "\1\u00d1",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u00a6\2\uffff\1\u00a7",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\u00ac\2\uffff\1\u00ad",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\52\6\uffff\1\13\1\7\1\uffff\1\10\1\11\12\uffff\1\17\3\uffff\1\53\12\uffff\1\14\1\15\4\uffff\1\16\1\20\2\uffff\1\21",
            "\1\u00d2",
            "\1\u00d4\1\uffff\1\u00d6\1\u00d5\102\uffff\1\u00d7\1\u00d8\1\u00d3",
            "\1\u00d9",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00b6\2\uffff\1\u00b7",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00bc\2\uffff\1\u00bd",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\1\u00db\1\u00dc\1\uffff\1\u00da\6\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u00dd",
            "\1\u00df\1\uffff\1\u00e1\1\u00e0\102\uffff\1\u00e2\1\u00e3\1\u00de",
            "\1\u00c5\2\uffff\1\u00c6",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u00e5\1\uffff\1\u00e7\1\u00e6\102\uffff\1\u00e8\1\u00e9\1\u00e4",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11\17\uffff\1\u00ef\1\u00f0\1\uffff\1\u00ee",
            "\1\u00f1",
            "\1\22\7\uffff\1\7\1\uffff\1\10\1\11\16\uffff\1\u00a1",
            "\1\u00f2",
            "\1\u00f4\1\uffff\1\u00f6\1\u00f5\102\uffff\1\u00f7\1\u00f8\1\u00f3",
            "\1\u00d4\2\uffff\1\u00d5",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00fa\1\uffff\1\u00fc\1\u00fb\102\uffff\1\u00fd\1\u00fe\1\u00f9",
            "\1\u00ff",
            "\1\u0101\1\uffff\1\u0103\1\u0102\102\uffff\1\u0104\1\u0105\1\u0100",
            "\1\u0106",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u00df\2\uffff\1\u00e0",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u00e5\2\uffff\1\u00e6",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\167\54\uffff\1\170\1\171",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u0107",
            "\1\u0108\45\uffff\1\45\5\uffff\1\u0109",
            "\1\u010a",
            "\1\u010c\1\uffff\1\u010e\1\u010d\102\uffff\1\u010f\1\u0110\1\u010b",
            "\1\u0111",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u0112",
            "\1\u00f4\2\uffff\1\u00f5",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00fa\2\uffff\1\u00fb",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\151\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u0114\1\uffff\1\u0116\1\u0115\102\uffff\1\u0117\1\u0118\1\u0113",
            "\1\u0101\2\uffff\1\u0102",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u011a\1\uffff\1\u011c\1\u011b\102\uffff\1\u011d\1\u011e\1\u0119",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11\17\uffff\1\u0120\1\u0121\1\uffff\1\u011f",
            "\1\u0122",
            "\1\u0124\1\uffff\1\u0126\1\u0125\102\uffff\1\u0127\1\u0128\1\u0123",
            "\1\u010c\2\uffff\1\u010d",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u012a\1\uffff\1\u012c\1\u012b\102\uffff\1\u012d\1\u012e\1\u0129",
            "\1\167\54\uffff\1\170\1\171",
            "\1\u0114\2\uffff\1\u0115",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u011a\2\uffff\1\u011b",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u0096\6\uffff\1\116\1\7\1\uffff\1\10\1\11\12\uffff\1\122\3\uffff\1\u0097\12\uffff\1\117\1\120\4\uffff\1\121\1\123\2\uffff\1\124",
            "\1\u012f",
            "\1\u0131\1\uffff\1\u0133\1\u0132\102\uffff\1\u0134\1\u0135\1\u0130",
            "\1\u0136",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u0124\2\uffff\1\u0125",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u012a\2\uffff\1\u012b",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u0138\1\uffff\1\u013a\1\u0139\102\uffff\1\u013b\1\u013c\1\u0137",
            "\1\u0131\2\uffff\1\u0132",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u013e\1\uffff\1\u0140\1\u013f\102\uffff\1\u0141\1\u0142\1\u013d",
            "\1\u0138\2\uffff\1\u0139",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u013e\2\uffff\1\u013f",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11",
            "\1\u00ed\7\uffff\1\7\1\uffff\1\10\1\11"
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_6;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "435:2: (this_Universality_0= ruleUniversality | this_Absence_1= ruleAbsence | this_Existence_2= ruleExistence | this_BoundedExistence_3= ruleBoundedExistence )";
        }
    }
    static final String dfa_12s = "\u0141\uffff";
    static final String dfa_13s = "\1\40\1\5\2\14\2\5\1\uffff\1\41\1\uffff\1\5\1\25\1\50\4\5\1\45\1\53\1\5\1\24\1\77\1\100\1\110\1\14\2\5\1\50\1\71\1\14\4\5\1\105\1\104\1\5\1\14\3\5\1\4\1\5\1\55\2\57\1\14\1\64\3\5\1\50\3\5\1\50\1\14\2\5\1\4\6\14\1\5\2\4\2\65\1\27\1\14\1\5\1\14\1\27\1\5\1\25\1\50\4\5\1\45\1\5\2\57\1\4\1\14\1\4\5\14\1\4\5\14\2\5\1\73\1\4\1\5\2\57\1\14\1\73\1\77\1\100\1\110\1\14\2\5\1\50\1\71\1\14\4\5\1\105\1\104\1\14\3\4\5\14\1\5\1\4\6\14\1\5\2\4\4\5\1\4\1\5\1\55\2\57\1\14\1\64\3\5\1\50\3\5\1\50\1\4\5\14\1\4\5\14\2\57\1\4\1\14\1\4\5\14\1\4\5\14\1\4\6\14\1\5\2\4\2\65\1\27\1\14\1\5\1\14\1\27\3\4\5\14\2\57\1\4\1\14\1\4\5\14\1\4\5\14\2\5\1\73\1\4\1\5\2\57\1\14\1\73\1\4\5\14\1\4\5\14\3\4\5\14\1\5\1\4\6\14\1\5\2\4\1\5\1\4\5\14\1\4\5\14\2\57\1\4\1\14\1\4\5\14\1\4\5\14\3\4\5\14\1\4\5\14\1\4\5\14";
    static final String dfa_14s = "\1\40\1\63\1\45\1\101\2\5\1\uffff\1\41\1\uffff\1\107\1\45\1\76\4\63\1\111\1\53\1\101\1\50\1\77\1\100\1\110\1\101\1\5\1\63\1\62\1\74\1\54\2\5\2\63\1\105\1\104\1\63\1\101\3\63\1\114\1\61\1\107\2\57\1\101\1\66\3\63\1\50\1\61\1\54\1\63\1\50\1\101\2\5\1\7\6\101\1\5\2\114\2\65\1\27\1\60\1\5\1\54\1\27\1\107\1\45\1\76\4\63\1\111\1\101\2\57\1\114\1\101\1\7\5\101\1\7\5\101\2\63\1\73\1\114\1\61\2\57\1\45\1\73\1\77\1\100\1\110\1\101\1\5\1\63\1\62\1\74\1\54\2\5\2\63\1\105\1\104\1\101\2\114\1\7\5\101\1\63\1\7\5\45\1\60\1\5\2\114\4\63\1\114\1\61\1\107\2\57\1\101\1\66\3\63\1\50\1\61\1\54\1\63\1\50\1\7\5\101\1\7\5\101\2\57\1\114\1\45\1\7\5\45\1\7\5\45\1\7\6\101\1\5\2\114\2\65\1\27\1\60\1\5\1\54\1\27\2\114\1\7\5\45\2\57\1\114\1\101\1\7\5\101\1\7\5\101\2\63\1\73\1\114\1\61\2\57\1\45\1\73\1\7\5\45\1\7\5\45\2\114\1\7\5\101\1\63\1\7\5\45\1\60\1\5\2\114\1\63\1\7\5\101\1\7\5\101\2\57\1\114\1\45\1\7\5\45\1\7\5\45\2\114\1\7\5\45\1\7\5\45\1\7\5\45";
    static final String dfa_15s = "\6\uffff\1\1\1\uffff\1\2\u0138\uffff";
    static final String dfa_16s = "\u0141\uffff}>";
    static final String[] dfa_17s = {
            "\1\1",
            "\1\3\44\uffff\1\2\7\uffff\1\4\1\5",
            "\1\7\15\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\21\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\11\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\22",
            "\1\22",
            "",
            "\1\23",
            "",
            "\1\27\47\uffff\1\24\3\uffff\1\30\2\uffff\1\25\21\uffff\1\31\1\26",
            "\1\32\17\uffff\1\33",
            "\1\16\17\uffff\1\14\4\uffff\1\15\1\17",
            "\1\34\54\uffff\1\35\1\36",
            "\1\34\54\uffff\1\35\1\36",
            "\1\34\54\uffff\1\35\1\36",
            "\1\34\54\uffff\1\35\1\36",
            "\1\41\34\uffff\1\37\1\42\5\uffff\1\40",
            "\1\43",
            "\1\44\6\uffff\1\7\5\uffff\1\21\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\11\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\6\23\uffff\1\10",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\1\50\1\54\1\uffff\1\53\6\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\55",
            "\1\34\54\uffff\1\35\1\36",
            "\1\57\11\uffff\1\56",
            "\1\61\1\62\1\uffff\1\60",
            "\1\7\5\uffff\1\21\7\uffff\1\6\12\uffff\1\10\6\uffff\1\63",
            "\1\64",
            "\1\64",
            "\1\34\54\uffff\1\35\1\36",
            "\1\34\54\uffff\1\35\1\36",
            "\1\65",
            "\1\66",
            "\1\67\54\uffff\1\70\1\71",
            "\1\7\5\uffff\1\21\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\11\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\34\54\uffff\1\35\1\36",
            "\1\34\54\uffff\1\35\1\36",
            "\1\34\54\uffff\1\35\1\36",
            "\1\73\1\uffff\1\75\1\74\102\uffff\1\76\1\77\1\72",
            "\1\100\45\uffff\1\43\5\uffff\1\101",
            "\1\24\6\uffff\1\25\21\uffff\1\31\1\26",
            "\1\102",
            "\1\103",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\104\1\uffff\1\105",
            "\1\34\54\uffff\1\35\1\36",
            "\1\34\54\uffff\1\35\1\36",
            "\1\34\54\uffff\1\35\1\36",
            "\1\106",
            "\1\107\53\uffff\1\110",
            "\1\111\6\uffff\1\7\5\uffff\1\21\7\uffff\1\6\12\uffff\1\10\6\uffff\1\63",
            "\1\34\54\uffff\1\35\1\36",
            "\1\112",
            "\1\7\5\uffff\1\21\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\113\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\123",
            "\1\123",
            "\1\73\2\uffff\1\74",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\1\126\1\125\1\uffff\1\124\6\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\127",
            "\1\131\1\uffff\1\133\1\132\102\uffff\1\134\1\135\1\130",
            "\1\137\1\uffff\1\141\1\140\102\uffff\1\142\1\143\1\136",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10\7\uffff\1\147\1\152\1\uffff\1\151",
            "\1\153",
            "\1\7\5\uffff\1\21\7\uffff\1\6\12\uffff\1\10\6\uffff\1\63",
            "\1\154",
            "\1\160\47\uffff\1\155\3\uffff\1\161\2\uffff\1\156\21\uffff\1\162\1\157",
            "\1\163\17\uffff\1\164",
            "\1\120\17\uffff\1\116\4\uffff\1\117\1\121",
            "\1\165\54\uffff\1\166\1\167",
            "\1\165\54\uffff\1\166\1\167",
            "\1\165\54\uffff\1\166\1\167",
            "\1\165\54\uffff\1\166\1\167",
            "\1\172\34\uffff\1\170\1\173\5\uffff\1\171",
            "\1\174\6\uffff\1\7\5\uffff\1\21\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\113\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\175",
            "\1\176",
            "\1\u0080\1\uffff\1\u0082\1\u0081\102\uffff\1\u0083\1\u0084\1\177",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\131\2\uffff\1\132",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\137\2\uffff\1\140",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\34\54\uffff\1\35\1\36",
            "\1\34\54\uffff\1\35\1\36",
            "\1\u0085",
            "\1\u0087\1\uffff\1\u0089\1\u0088\102\uffff\1\u008a\1\u008b\1\u0086",
            "\1\u008c\45\uffff\1\43\5\uffff\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\1\u0094\1\u0098\1\uffff\1\u0097\6\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\u0099",
            "\1\165\54\uffff\1\166\1\167",
            "\1\u009b\11\uffff\1\u009a",
            "\1\u009d\1\u009e\1\uffff\1\u009c",
            "\1\7\5\uffff\1\21\7\uffff\1\6\12\uffff\1\10\6\uffff\1\u009f",
            "\1\u00a0",
            "\1\u00a0",
            "\1\165\54\uffff\1\166\1\167",
            "\1\165\54\uffff\1\166\1\167",
            "\1\u00a1",
            "\1\u00a2",
            "\1\7\5\uffff\1\21\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\113\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\u00a4\1\uffff\1\u00a6\1\u00a5\102\uffff\1\u00a7\1\u00a8\1\u00a3",
            "\1\u00aa\1\uffff\1\u00ac\1\u00ab\102\uffff\1\u00ad\1\u00ae\1\u00a9",
            "\1\u0080\2\uffff\1\u0081",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\34\54\uffff\1\35\1\36",
            "\1\u0087\2\uffff\1\u0088",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10\7\uffff\1\u00b1\1\u00b0\1\uffff\1\u00af",
            "\1\u00b2",
            "\1\u00b4\1\uffff\1\u00b6\1\u00b5\102\uffff\1\u00b7\1\u00b8\1\u00b3",
            "\1\u00ba\1\uffff\1\u00bc\1\u00bb\102\uffff\1\u00bd\1\u00be\1\u00b9",
            "\1\34\54\uffff\1\35\1\36",
            "\1\165\54\uffff\1\166\1\167",
            "\1\165\54\uffff\1\166\1\167",
            "\1\165\54\uffff\1\166\1\167",
            "\1\u00c0\1\uffff\1\u00c2\1\u00c1\102\uffff\1\u00c3\1\u00c4\1\u00bf",
            "\1\u00c5\45\uffff\1\43\5\uffff\1\u00c6",
            "\1\155\6\uffff\1\156\21\uffff\1\162\1\157",
            "\1\u00c7",
            "\1\u00c8",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\u00c9\1\uffff\1\u00ca",
            "\1\165\54\uffff\1\166\1\167",
            "\1\165\54\uffff\1\166\1\167",
            "\1\165\54\uffff\1\166\1\167",
            "\1\u00cb",
            "\1\u00cc\53\uffff\1\u00cd",
            "\1\u00ce\6\uffff\1\7\5\uffff\1\21\7\uffff\1\6\12\uffff\1\10\6\uffff\1\u009f",
            "\1\165\54\uffff\1\166\1\167",
            "\1\u00cf",
            "\1\u00a4\2\uffff\1\u00a5",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\u00aa\2\uffff\1\u00ab",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\7\5\uffff\1\51\6\uffff\1\12\1\6\12\uffff\1\10\2\uffff\1\16\3\uffff\1\52\12\uffff\1\13\1\14\4\uffff\1\15\1\17\2\uffff\1\20",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d3\1\uffff\1\u00d5\1\u00d4\102\uffff\1\u00d6\1\u00d7\1\u00d2",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\u00b4\2\uffff\1\u00b5",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\u00ba\2\uffff\1\u00bb",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\u00c0\2\uffff\1\u00c1",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\1\u00da\1\u00d9\1\uffff\1\u00d8\6\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\u00db",
            "\1\u00dd\1\uffff\1\u00df\1\u00de\102\uffff\1\u00e0\1\u00e1\1\u00dc",
            "\1\u00e3\1\uffff\1\u00e5\1\u00e4\102\uffff\1\u00e6\1\u00e7\1\u00e2",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10\7\uffff\1\u00eb\1\u00ee\1\uffff\1\u00ed",
            "\1\u00ef",
            "\1\7\5\uffff\1\21\7\uffff\1\6\12\uffff\1\10\6\uffff\1\u009f",
            "\1\u00f0",
            "\1\u00f2\1\uffff\1\u00f4\1\u00f3\102\uffff\1\u00f5\1\u00f6\1\u00f1",
            "\1\u00f8\1\uffff\1\u00fa\1\u00f9\102\uffff\1\u00fb\1\u00fc\1\u00f7",
            "\1\u00d3\2\uffff\1\u00d4",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u0100\1\uffff\1\u0102\1\u0101\102\uffff\1\u0103\1\u0104\1\u00ff",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\u00dd\2\uffff\1\u00de",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\u00e3\2\uffff\1\u00e4",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\165\54\uffff\1\166\1\167",
            "\1\165\54\uffff\1\166\1\167",
            "\1\u0105",
            "\1\u0107\1\uffff\1\u0109\1\u0108\102\uffff\1\u010a\1\u010b\1\u0106",
            "\1\u010c\45\uffff\1\43\5\uffff\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\u0110",
            "\1\u00f2\2\uffff\1\u00f3",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\u00f8\2\uffff\1\u00f9",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\150\7\uffff\1\6\12\uffff\1\10",
            "\1\u0112\1\uffff\1\u0114\1\u0113\102\uffff\1\u0115\1\u0116\1\u0111",
            "\1\u0118\1\uffff\1\u011a\1\u0119\102\uffff\1\u011b\1\u011c\1\u0117",
            "\1\u0100\2\uffff\1\u0101",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\165\54\uffff\1\166\1\167",
            "\1\u0107\2\uffff\1\u0108",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10\7\uffff\1\u011f\1\u011e\1\uffff\1\u011d",
            "\1\u0120",
            "\1\u0122\1\uffff\1\u0124\1\u0123\102\uffff\1\u0125\1\u0126\1\u0121",
            "\1\u0128\1\uffff\1\u012a\1\u0129\102\uffff\1\u012b\1\u012c\1\u0127",
            "\1\165\54\uffff\1\166\1\167",
            "\1\u0112\2\uffff\1\u0113",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\u0118\2\uffff\1\u0119",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\7\5\uffff\1\u0095\6\uffff\1\114\1\6\12\uffff\1\10\2\uffff\1\120\3\uffff\1\u0096\12\uffff\1\115\1\116\4\uffff\1\117\1\121\2\uffff\1\122",
            "\1\u012d",
            "\1\u012e",
            "\1\u0130\1\uffff\1\u0132\1\u0131\102\uffff\1\u0133\1\u0134\1\u012f",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\u0122\2\uffff\1\u0123",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\u0128\2\uffff\1\u0129",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\u0136\1\uffff\1\u0138\1\u0137\102\uffff\1\u0139\1\u013a\1\u0135",
            "\1\u013c\1\uffff\1\u013e\1\u013d\102\uffff\1\u013f\1\u0140\1\u013b",
            "\1\u0130\2\uffff\1\u0131",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\u0136\2\uffff\1\u0137",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\u013c\2\uffff\1\u013d",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10",
            "\1\7\5\uffff\1\u00ec\7\uffff\1\6\12\uffff\1\10"
    };

    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_12;
            this.eof = dfa_12;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_16;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "747:2: (this_Precedence_0= rulePrecedence | this_Response_1= ruleResponse )";
        }
    }
    static final String dfa_18s = "\32\uffff";
    static final String dfa_19s = "\1\31\1\25\1\50\4\uffff\1\55\1\45\1\50\1\71\10\uffff\1\64\6\uffff";
    static final String dfa_20s = "\1\101\1\45\1\76\4\uffff\1\107\1\111\1\62\1\74\10\uffff\1\66\6\uffff";
    static final String dfa_21s = "\3\uffff\1\4\1\10\1\11\1\12\4\uffff\1\20\1\13\1\14\1\21\1\17\1\16\1\15\1\22\1\uffff\1\3\1\7\1\5\1\6\1\2\1\1";
    static final String dfa_22s = "\32\uffff}>";
    static final String[] dfa_23s = {
            "\1\1\16\uffff\1\5\3\uffff\1\7\12\uffff\1\2\1\3\4\uffff\1\4\1\6\2\uffff\1\10",
            "\1\11\17\uffff\1\12",
            "\1\5\17\uffff\1\3\4\uffff\1\4\1\6",
            "",
            "",
            "",
            "",
            "\1\14\6\uffff\1\15\21\uffff\1\13\1\16",
            "\1\17\34\uffff\1\21\1\20\5\uffff\1\22",
            "\1\24\11\uffff\1\23",
            "\1\26\1\27\1\uffff\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31\1\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_18;
            this.eof = dfa_18;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "1687:2: ( ( () otherlv_1= 'that' otherlv_2= 'is' otherlv_3= 'a' otherlv_4= 'task' otherlv_5= 'of' ) | ( () otherlv_7= 'that' otherlv_8= 'is' otherlv_9= 'a' otherlv_10= 'team' otherlv_11= 'of' ) | ( () otherlv_13= 'that' otherlv_14= 'is' otherlv_15= 'in' ) | ( () (otherlv_17= 'currently' )? otherlv_18= 'doing' ) | ( () otherlv_20= 'that' otherlv_21= 'has' otherlv_22= 'scheduled' ) | ( () otherlv_24= 'that' otherlv_25= 'has' otherlv_26= 'planned' otherlv_27= 'in' otherlv_28= 'the' otherlv_29= 'future' ) | ( () otherlv_31= 'that' otherlv_32= 'has' otherlv_33= 'finished' ) | ( () (otherlv_35= 'currently' )? otherlv_36= 'performing' ) | ( () (otherlv_38= 'currently' )? otherlv_39= 'in' ) | ( () (otherlv_41= 'currently' )? otherlv_42= 'on' ) | ( () otherlv_44= 'with' otherlv_45= 'as' otherlv_46= 'home' ) | ( () otherlv_48= 'with' otherlv_49= 'task' otherlv_50= 'area' ) | ( () otherlv_52= 'which' otherlv_53= 'visits' ) | ( () otherlv_55= 'which' otherlv_56= 'will' otherlv_57= 'visit' otherlv_58= 'in' otherlv_59= 'the' otherlv_60= 'future' ) | ( () otherlv_62= 'which' otherlv_63= 'has' otherlv_64= 'visited' ) | ( () otherlv_66= 'with' otherlv_67= 'points' ) | ( () otherlv_69= 'with' otherlv_70= 'initial' otherlv_71= 'position' ) | ( () otherlv_73= 'which' otherlv_74= 'references' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000C040100100020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000C040000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x6180110002000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x6180110002040002L,0x0000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000000000000D0L,0x0000000000001C00L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000080L});

}