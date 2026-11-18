/*******************************************************************
 * Created by the JDE: Fri Oct 09 07:56:20 EDT 2026
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
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextRejectedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.VERBAL> AskingQuestionsRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.VERBAL> DefensiveResponsesPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.VERBAL> ExpressingDisapoointmentPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.VERBAL> SeekingReassureanceRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.VERBAL> SelfDeprecatingRemarksRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.VERBAL> SighRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.VERBAL> SpeakingSoftlyRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.VERBAL> StutteringRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.VERBAL> VoicingInsecuritiesPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.VERBAL> WithdrawFromConversationPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.NONVERBAL> ArmsCrossedRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.NONVERBAL> BadPostureRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.NONVERBAL> FacialExpressionsRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.NONVERBAL> FidgetingRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.NONVERBAL> LookAwayRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.NONVERBAL> LoweringHeadRejectedPlam;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.NONVERBAL> SlowBodyMovementsRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.NONVERBAL> StiffPostureRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.NONVERBAL> TearingUpRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.NONVERBAL> TremblingLipsRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.ACTION> DoubtingAbilitiesRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.ACTION> LossOfAppetitieRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.ACTION> LossOfMotivationPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.ACTION> NegativeSelfImageRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.ACTION> OveranalyzingTasksRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.ACTION> RuminatingPastFailuresRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.ACTION> SeekingApprovalRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.ACTION> SeekingComfortRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.ACTION> TryHarderRejectedPlan;
    #uses BehaviorPlan<AffectEnum.REJECTED, AffectEnum.ACTION> WantingToBeAloneRejectedPlan;

}

