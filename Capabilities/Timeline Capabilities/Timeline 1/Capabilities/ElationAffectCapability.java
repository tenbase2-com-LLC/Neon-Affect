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
public capability ElationAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextElationPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.VERBAL> ExuberantExclamationsElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.VERBAL> HighlyTalkativeAndExpressivePlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.VERBAL> HummingWhistlingSingingElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.VERBAL> LaughingPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.VERBAL> PositiveAffirmationElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.VERBAL> ScreamingShoutingPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.VERBAL> SharingGoodNewsElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.VERBAL> SpeechlessnessPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.VERBAL> TalkingOverOneAnotherPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.VERBAL> VerbalizingAccomplishmentElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.NONVERBAL> CloseEyesDeepBreathElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.NONVERBAL> DeepBreathsPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.NONVERBAL> EyesWideAndGlowingPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.NONVERBAL> FistPumpElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.NONVERBAL> FlushedFaceElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.NONVERBAL> HandClappingElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.NONVERBAL> HuggingElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.NONVERBAL> JoyfulTearsElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.NONVERBAL> SmileGrinCannotBeContainedPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.NONVERBAL> TriumphantArmRaisingElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.ACTION> CaptureMemoryElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.ACTION> GoalAccomplishmentReflectionElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.ACTION> HeightenedCreativityElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.ACTION> IncreasedGenerosityElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.ACTION> InvincibilityElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.ACTION> NotCaringWhatOthersThinkPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.ACTION> SpontaneityElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.ACTION> SpreadJoyElationPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.ACTION> TooExcitedToThinkStraightPlan;
    #uses BehaviorPlan<AffectEnum.ELATION, AffectEnum.ACTION> WantingFeelingToLastElationPlan;

}

