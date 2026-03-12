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
public capability DomineeringAffectCapability extends Capability {
    #uses plan BraggingDomineeringPlan;
    #uses plan CorrectingOthersPlan;
    #uses plan CriticizeDomineeringPlan;
    #uses plan CrossingArmsDomineeringPlan;
    #uses plan DelegatingTasksPlan;
    #uses plan DismissingOpinionsPlan;
    #uses plan DisregardingFeelingsPlan;
    #uses plan EnforcingRulesPlan;
    #uses plan GivingOrdersPlan;
    #uses plan IgnoringConsensusPlan;
    #uses plan InterruptSpeakOverDomineeringPlan;
    #uses plan InvadingPersonalSpaceDomineeringPlan;
    #uses plan MakingDecisionsForOthersPlan;
    #uses plan MakingDemandsDomineeringPlan;
    #uses plan MonopolizingConversationPlan;
    #uses plan PushingOwnAgendaPlan;
    #uses plan RaisingVoiceDomineeringPlan;
    #uses plan RefusingToCompromisePlan;
    #uses plan RollingEyesDomineeringPlan;
    #uses plan SighDomineeringPlan;
    #uses plan SpeakAggressiveTonePlan;
    #uses plan StaringDownDomineeringPlan;
    #uses plan TakingControlPlan;
    #uses plan TappingFootDomineeringPlan;
    #uses plan WithholdingInformationPlan;
    #uses plan SetPlanContextDomineeringPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
