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
public capability MoodyAffectCapability extends Capability {
    #uses plan HighlyNegativePlan;
    #uses plan StaringDownPlan;
    #uses plan MisreadingSomethingSaidPlan;
    #uses plan RaisingVoicePlan;
    #uses plan InterruptingOthersPlan;
    #uses plan ExhaggeratedHuffPlan;
    #uses plan AngryOutburstPlan;
    #uses plan BeginningArgumentPlan;
    #uses plan SayingHurtfulThingsPlan;
    #uses plan RefusalToEngageConversationPlan;
    #uses plan TakingBigBreathsPlan;
    #uses plan SighingMoodyPlan;
    #uses plan DistractingOneselfPlan;
    #uses plan WithdrawingFromOthersPlan;
    #uses plan EasilyStartledPlan;
    #uses plan UpsetBySmallSetbacksPlan;
    #uses plan EasilyFrustratedPlan;
    #uses plan EasilyHurtByCommentsPlan;
    #uses plan InabilityToSeeSituationPlan;
    #uses plan InabilityToAdmitWrongdoingPlan;
    #uses plan ClammingUpPlan;
    #uses plan LettingOthersBeInChargePlan;
    #uses plan SetPlanContextMoodyPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();

}
