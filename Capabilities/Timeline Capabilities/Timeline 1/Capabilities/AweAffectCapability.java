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
public capability AweAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAwePlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.VERBAL> DescribingDetailsAwePlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.VERBAL> DescribingSensationsAwePlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.VERBAL> ExpressingWondermentAwePlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.VERBAL> GaspAwePlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.VERBAL> InabilityFindWordsAwePlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.VERBAL> SayingWowAwePlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.VERBAL> SpeakingSoftly;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.VERBAL> SpeechlessLessArticulatePlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.VERBAL> UnhurriedSpeechAwePlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.VERBAL> WhisperDramaticallyAwePlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.NONVERBAL> CeasingAllMovementPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.NONVERBAL> DeepBreathAwePlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.NONVERBAL> ForgettingToBlinkPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.NONVERBAL> HeightenedSensesPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.NONVERBAL> MouthOpenAwePlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.NONVERBAL> MovingCarefullyPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.NONVERBAL> RemainingStillPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.NONVERBAL> ShouldersDroppingPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.NONVERBAL> SlowingReleasingDeepBreathPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.NONVERBAL> StaringPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.ACTION> AwakendCuriosityPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.ACTION> ConcernsWorriesFallingAwayPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.ACTION> ContemplatingOnesPlaceAwePlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.ACTION> DesireToGetCloserPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.ACTION> ForgetMiddleOfDoingPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.ACTION> IncreasedGenerosityCompassionPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.ACTION> MoreWillingToHelpOthersPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.ACTION> NoticingLittleThingsPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.ACTION> SenseOfConnectionPlan;
    #uses BehaviorPlan<AffectEnum.AWE, AffectEnum.ACTION> WantingNewExperiencesPlan;

}

