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
public capability ExcitedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextExcitedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.VERBAL> AskQuestionsExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.VERBAL> DetailedDescriptionsPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.VERBAL> FrequentExclamationsPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.VERBAL> HighPitchedVoiceExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.VERBAL> InterruptingExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.VERBAL> LaughingSuddenlyPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.VERBAL> RepetitiveSpeechExcitePlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.VERBAL> SpeakingLoudlyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.VERBAL> SpeakingQuicklyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.VERBAL> UsingVividLanguagePlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.NONVERBAL> EyesWideOpenExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.NONVERBAL> FidgetingExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.NONVERBAL> FlushedFaceExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.NONVERBAL> HandClappingExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.NONVERBAL> HandsClenchedExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.NONVERBAL> LeanInExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.NONVERBAL> NodHeadFastExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.NONVERBAL> RaiseEyebrowsExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.NONVERBAL> RapidBreathingExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.NONVERBAL> SmilingExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.ACTION> CreativityExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.ACTION> DecisionMakingExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.ACTION> DifficultySittingStillPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.ACTION> EagernessToPlanPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.ACTION> FocusedExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.ACTION> HeightenedAwarenessExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.ACTION> ImpatienceExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.ACTION> IntensifiedCuriosityPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.ACTION> OverestimatingAbilitiesExcitedPlan;
    #uses BehaviorPlan<AffectEnum.EXCITED, AffectEnum.ACTION> QuickToActionPlan;

}

