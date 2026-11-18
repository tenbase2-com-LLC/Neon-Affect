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
public capability DefeatedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDefeatedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.VERBAL> AcknowledgingMistakesPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.VERBAL> AdmittingDefeatePlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.VERBAL> ApologizingDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.VERBAL> AskForHelpDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.VERBAL> ConcedingArgumentPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.VERBAL> ExpressingDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.VERBAL> ExpressingHopelessnessPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.VERBAL> SelfNegativeTalkPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.VERBAL> TakingBlamePlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.VERBAL> UnemotionallyAgreeDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.NONVERBAL> AvoidingEyeContactDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.NONVERBAL> BadPostureDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.NONVERBAL> BitingLipDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.NONVERBAL> DeepSighDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.NONVERBAL> FidgetingDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.NONVERBAL> FrownDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.NONVERBAL> HeavyBreathingDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.NONVERBAL> LoweringHeadDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.NONVERBAL> ShakingHeadDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.NONVERBAL> TearingUpDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.ACTION> AvoidingChallengesDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.ACTION> DisengagingFromGoalsDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.ACTION> GiveUpGoalDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.ACTION> LackOfInitiativePlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.ACTION> LetOthersControlPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.ACTION> NeglectingEverythingElseDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.ACTION> NotFollowingThroughPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.ACTION> ProcrastinateDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.ACTION> SeekingComfortDefeatedPlan;
    #uses BehaviorPlan<AffectEnum.DEFEATED, AffectEnum.ACTION> WithdrawingFromOthersDefeatedPlan;

}

