/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import aos.jack.util.thread.Semaphore;

/**
 * 
 */
public capability TimidAffectCapability extends Capability {
    #uses plan AgreeingQuicklyTimidPlan;
    #uses plan ApologizingTimidPlan;
    #uses plan ArmsCrossedTimidPlan;
    #uses plan AskPermissionTimidPlan;
    #uses plan AvoidingAttentionTimidPlan;
    #uses plan AvoidingEyeContactTimidPlan;
    #uses plan AvoidingNewExperiencesTimidPlan;
    #uses plan BadPostureTimidPlan;
    #uses plan BlushingTimidPlan;
    #uses plan DownplayOwnOpinionsPlan;
    #uses plan FidgetingTimidPlan;
    #uses plan GivingUpEasilyTimidPlan;
    #uses plan HesitationSpeechTimidPlan;
    #uses plan HesitationTimidPlan;
    #uses plan LimitedSelfExpressionPlan;
    #uses plan LoweringHeadTimidPlan;
    #uses plan NegativeThinkingTimidPlan;
    #uses plan OverthinkingSocialSituationsTimidPlan;
    #uses plan PreferringFamiliarityTimidPlan;
    #uses plan SecondGuessingTimidPlan;
    #uses plan SeekingReassuranceTimidPlan;
    #uses plan SmilingTimidPlan;
    #uses plan SpeakSoflyTimidPlan;
    #uses plan UseOfUncertainPhrasesPlan;
    #uses plan UsingQualifiersTimidPlan;
    #uses plan SetPlanContextTimidPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
