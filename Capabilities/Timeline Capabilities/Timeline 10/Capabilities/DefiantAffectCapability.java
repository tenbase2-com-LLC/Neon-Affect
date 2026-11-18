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
public capability DefiantAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDefiantPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.VERBAL> AngryDefiantPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.VERBAL> HavingLastWordPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.VERBAL> HostileTonePlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.VERBAL> MakingThreatsPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.VERBAL> NeverBackingDownPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.VERBAL> NotForgivingPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.VERBAL> ReactingWithoutThinkingPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.VERBAL> RefusingToApologizePlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.VERBAL> SarcasmDefiantPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.VERBAL> SayingNoDefiantPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.NONVERBAL> ArmsCrossedDefiantPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.NONVERBAL> ChallengingStarePlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.NONVERBAL> DeepBreathDefiantPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.NONVERBAL> GiveBirdPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.NONVERBAL> HandsOnHipsDefiantPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.NONVERBAL> MakeFistPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.NONVERBAL> NotBreakingEyeContactPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.NONVERBAL> RestlessnessDefiantPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.NONVERBAL> StrongPostureDefiantPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.NONVERBAL> WideStancePlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.ACTION> ConfusionDefiantPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.ACTION> NegativeBehaviorPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.ACTION> PushingBoundariesDefiantPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.ACTION> RebelliousDefiantPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.ACTION> RefusingToCompromiseDefiantPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.ACTION> RefusingToObeyPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.ACTION> RejectingObligationsDefiantPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.ACTION> ResistanceToCompromiseDefiantPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.ACTION> SteadfastnessDefiantPlan;
    #uses BehaviorPlan<AffectEnum.DEFIANT, AffectEnum.ACTION> UnforgivingDefiantPlan;

}

