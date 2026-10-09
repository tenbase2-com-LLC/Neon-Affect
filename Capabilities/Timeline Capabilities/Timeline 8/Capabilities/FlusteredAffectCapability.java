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
public capability FlusteredAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextFlusteredPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.VERBAL> ApologizingFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.VERBAL> DeflectingPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.VERBAL> InarticulateFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.VERBAL> LaughingFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.VERBAL> RequestTimeToThinkFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.VERBAL> SecondGuessingPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.VERBAL> SelfReassurancePlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.VERBAL> SpeakingQuicklyFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.VERBAL> StutteringFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.VERBAL> UpsetTonePlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.NONVERBAL> BlinkingRapidlyPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.NONVERBAL> ClearThroatFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.NONVERBAL> FidgetingFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.NONVERBAL> FlushedFaceFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.NONVERBAL> HeadShakingFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.NONVERBAL> LoseEyeContactPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.NONVERBAL> NervousSmileFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.NONVERBAL> QuickMoevementsFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.NONVERBAL> SharpIntakePlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.NONVERBAL> SmoothingClothesFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.ACTION> AllowSomeoneElsePlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.ACTION> BecomingBusyFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.ACTION> CalmingDownFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.ACTION> ClumsinessFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.ACTION> DivertingAttentionPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.ACTION> HeightedAwarenessPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.ACTION> JumbledThoughtsFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.ACTION> MindRacingFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.ACTION> SeekingReassuranceFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.FLUSTERED, AffectEnum.ACTION> TimeSlowedPlan;

}

