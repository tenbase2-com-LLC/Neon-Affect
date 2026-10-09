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
public capability LustAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextLustPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.VERBAL> ComplimentLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.VERBAL> ExpressingAttractionLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.VERBAL> FlirtingTalkLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.VERBAL> ImmediateResponseLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.VERBAL> LowVoiceLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.VERBAL> MakingPleasureSoundLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.VERBAL> NaughtInsinuationsLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.VERBAL> SpeakingToInciteLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.VERBAL> VerbalForeplayLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.VERBAL> WhisperDramaticallyLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.NONVERBAL> AnxiousPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.NONVERBAL> BitingLipLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.NONVERBAL> CarefulMovementsLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.NONVERBAL> GaspLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.NONVERBAL> LeanInLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.NONVERBAL> LickingLipsLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.NONVERBAL> OpenPosutreLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.NONVERBAL> RapidBreathingPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.NONVERBAL> StrongEyeContactLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.NONVERBAL> SuggestiveGazePlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.ACTION> ClosingDistanceLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.ACTION> ConfusionLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.ACTION> DanceSuggestivelyLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.ACTION> FantasizingLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.ACTION> FixatingThoughtsSubjectLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.ACTION> NeglectingOthersLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.ACTION> PlanningSeductionLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.ACTION> SensuousTouchLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.ACTION> SlowSensualSelfTouchLustPlan;
    #uses BehaviorPlan<AffectEnum.LUST, AffectEnum.ACTION> WildBehaviorPlan;

}

