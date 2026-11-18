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
public capability OnenessAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextOnenessPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.VERBAL> DescribingSensationsOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.VERBAL> EngagingPhilosophicalDiscussionsOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.VERBAL> ExpressingGratitudeOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.VERBAL> MeaningfullConversationOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.VERBAL> SharingFeelingsOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.VERBAL> SpeechlessLessArticulateOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.VERBAL> UnhurriedSpeechOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.VERBAL> UsingInclusiveLanguageOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.VERBAL> VerbaliszingJoyOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.VERBAL> WhisperDramaticallyOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.NONVERBAL> CeasingAllMovementOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.NONVERBAL> CloseEyesDeepBreathOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.NONVERBAL> EyeContactOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.NONVERBAL> HalfClosedEyesOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.NONVERBAL> HuggingOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.NONVERBAL> ImitationBodyLanguageOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.NONVERBAL> JoyfulTearsOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.NONVERBAL> OpenBodyPostureOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.NONVERBAL> ShouldersDroppingOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.NONVERBAL> SlowEvenBreathsOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.ACTION> ConcernsWorriesFallingAwayOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.ACTION> ContemplatingOnesPlaceOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.ACTION> CoordinatingActionsOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.ACTION> DeepThinkingOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.ACTION> IncreasedEmpathyCompassionAltruismOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.ACTION> IncreasedGenerosityOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.ACTION> LosingTrackOfTimeOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.ACTION> NotCaringWhatOthersThinkOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.ACTION> SenseOfConnectionOnenessPlan;
    #uses BehaviorPlan<AffectEnum.ONENESS, AffectEnum.ACTION> SocialBondingOnenessPlan;

}

