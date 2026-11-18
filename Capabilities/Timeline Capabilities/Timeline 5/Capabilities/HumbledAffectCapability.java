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
public capability HumbledAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextHumbledPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.VERBAL> AcknowledgingMistakesHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.VERBAL> ApologizingHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.VERBAL> DownplayOwnOpinionsHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.VERBAL> ExpressingGratitudeHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.VERBAL> HumbleAcknowledgementsHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.VERBAL> LaughingHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.VERBAL> MakingExcusesPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.VERBAL> NotDefendingOneselfPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.VERBAL> QuietVoiceHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.VERBAL> SelfDeprecatingHumorHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.NONVERBAL> ArmsCrossedHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.NONVERBAL> ChokedUpPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.NONVERBAL> CoverFaceHandsHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.NONVERBAL> DuckHeadPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.NONVERBAL> ExhaleThroughNoseHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.NONVERBAL> GoingStillPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.NONVERBAL> HandsOnHipsPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.NONVERBAL> HoldingBackTearsPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.NONVERBAL> LowerChinPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.NONVERBAL> SlowNodPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.NONVERBAL> StayBackgrouindPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.NONVERBAL> WinceHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.ACTION> ArroganceHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.ACTION> DemonstratingHumilityHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.ACTION> DenialPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.ACTION> HatredHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.ACTION> MindRacingPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.ACTION> OverlyCriticalSelfPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.ACTION> RenewedDeterminismPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.ACTION> RiskAversionPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.ACTION> SelfReflectionHumbledPlan;
    #uses BehaviorPlan<AffectEnum.HUMBLED, AffectEnum.ACTION> TryHarderPlan;

}

