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
public capability ExasperatedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextExasperatedPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.VERBAL> ComplainExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.VERBAL> MakeDemandsExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.VERBAL> MutteringExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.VERBAL> RaisingVoiceExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.VERBAL> RestatingPointsExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.VERBAL> SarcasmExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.VERBAL> SetTimeLimitExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.VERBAL> SharpToneExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.VERBAL> SighExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.VERBAL> SwearingFrustationExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.NONVERBAL> ClenchedTeethExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.NONVERBAL> DeepExhaleExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.NONVERBAL> ExhaleThroughNoseExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.NONVERBAL> LookingUpwardExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.NONVERBAL> MassagingTemplesExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.NONVERBAL> PurseLipsExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.NONVERBAL> RollingEyesExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.NONVERBAL> ShakeHeadExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.NONVERBAL> TappingFootExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.NONVERBAL> ThrowingHandsUpExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.ACTION> CloudedJudgementExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.ACTION> DemandingImmediateActionExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.ACTION> DisengageFromInteractionExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.ACTION> EasilyFrustratedExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.ACTION> GiveUpGoalExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.ACTION> PacingExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.ACTION> SnappingUnderPressureExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.ACTION> TakingControlExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.ACTION> WishingShutupExasperatedPlan;
    #uses BehaviorPlan<AffectEnum.EXASPERATED, AffectEnum.ACTION> WithdrawingFromSituationExasperatedPlan;

}

