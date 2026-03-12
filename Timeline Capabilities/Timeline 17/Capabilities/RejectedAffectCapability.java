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
public capability RejectedAffectCapability extends Capability {
    #uses plan ArmsCrossedRejectedPlan;
    #uses plan AskingQuestionsRejectedPlan;
    #uses plan BadPostureRejectedPlan;
    #uses plan DefensiveResponsesPlan;
    #uses plan ExpressingDisapoointmentPlan;
    #uses plan FacialExpressionsRejectedPlan;
    #uses plan FidgetingRejectedPlan;
    #uses plan LookAwayRejectedPlan;
    #uses plan LossOfAppetitieRejectedPlan;
    #uses plan LossOfMotivationPlan;
    #uses plan LoweringHeadRejectedPlam;
    #uses plan OveranalyzingTasksRejectedPlan;
    #uses plan RuminatingPastFailuresRejectedPlan;
    #uses plan SeekingReassureanceRejectedPlan;
    #uses plan SelfDeprecatingRemarksRejectedPlan;
    #uses plan SighRejectedPlan;
    #uses plan SlowBodyMovementsRejectedPlan;
    #uses plan SpeakingSoftlyRejectedPlan;
    #uses plan StutteringRejectedPlan;
    #uses plan TearingUpRejectedPlan;
    #uses plan VoicingInsecuritiesPlan;
    #uses plan WantingToBeAloneRejectedPlan;
    #uses plan WithdrawFromConversationPlan;
    #uses plan SetPlanContextRejectedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
