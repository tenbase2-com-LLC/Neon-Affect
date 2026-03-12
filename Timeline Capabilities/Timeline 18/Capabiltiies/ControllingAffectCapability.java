/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
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
public capability ControllingAffectCapability extends Capability {
    #uses plan ArmsCrossedControllingPlan;
    #uses plan AskQuestionsControllingPlan;
    #uses plan ClenchedJawControllingPlan;
    #uses plan CriticizingPlan;
    #uses plan DemandingUpdatesPlan;
    #uses plan DismissiveRemarksPlan;
    #uses plan FrowningControllingPlan;
    #uses plan GivingOrdersControllingPlan;
    #uses plan HeadShakingControllingPlan;
    #uses plan ImposingRulesPlan;
    #uses plan InterruptingControllingPlan;
    #uses plan LoomingOverOthersPlan;
    #uses plan ManipulatingCircumstancesPlan;
    #uses plan MonitoringOthersPlan;
    #uses plan OverplanningEventsPlan;
    #uses plan OverridingOthersPlan;
    #uses plan OverseeingDetailsPlan;
    #uses plan PassiveAggressiveCommentsPlan;
    #uses plan RestrictingChoicesPlan;
    #uses plan SpeakingOverOthersPlan;
    #uses plan StaringControllingPlan;
    #uses plan StiffPostureControllingPlan;
    #uses plan UsingGuiltyPhrasesPlan;
    #uses plan WithholdingInformationControllingPlan;
    #uses plan SetPlanContextControllingPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
