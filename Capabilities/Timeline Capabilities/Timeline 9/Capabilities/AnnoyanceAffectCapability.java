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
public capability AnnoyanceAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAnnoyancePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.VERBAL> ChallengeViewpointAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.VERBAL> ComplainPlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.VERBAL> MakingMentalComparisonsPlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.VERBAL> MutteringAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.VERBAL> NegativeLanguageAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.VERBAL> NotRespondingAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.VERBAL> SarcasmAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.VERBAL> SetTimeLimitAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.VERBAL> SharpToneAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.VERBAL> ShortResponsesPlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.NONVERBAL> ArmsCrossedAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.NONVERBAL> DeepBreathAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.NONVERBAL> FakeSmilePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.NONVERBAL> GrimaceAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.NONVERBAL> NoiseSensitivityAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.NONVERBAL> RedFaceAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.NONVERBAL> ShakeHeadAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.NONVERBAL> ShiftWeightPlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.NONVERBAL> SighAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.NONVERBAL> StiffPostureAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.ACTION> AssertivePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.ACTION> CloudedJudgementAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.ACTION> DisengageFromInteractionAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.ACTION> DivertNegativityAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.ACTION> EasilyFrustratedAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.ACTION> FaultFindingAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.ACTION> StrayingAttentionPlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.ACTION> UpsetBySmallSetbacksAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.ACTION> WishingShutupAnnoyancePlan;
    #uses BehaviorPlan<AffectEnum.ANNOYANCE, AffectEnum.ACTION> WithdrawingFromSituationAnnoyancePlan;

}

