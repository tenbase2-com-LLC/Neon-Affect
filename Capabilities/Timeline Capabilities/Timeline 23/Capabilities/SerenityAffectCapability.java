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
public capability SerenityAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextSerenityPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.VERBAL> CalmingSpeechSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.VERBAL> ForgivenessSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.VERBAL> GratitudeSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.VERBAL> MeaningfullConversationSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.VERBAL> MeasuredResponsesSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.VERBAL> SoftGentleVoiceSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.VERBAL> SpeakingDeliberatelySerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.VERBAL> UnforcedLaughSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.VERBAL> UnhurriedSpeechSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.VERBAL> WhistlingHummingSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.NONVERBAL> ControlledBreathingSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.NONVERBAL> FluidMovementSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.NONVERBAL> HalfClosedEyesSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.NONVERBAL> LeanBackSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.NONVERBAL> OpenBodyPostureSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.NONVERBAL> RelaxedPostureSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.NONVERBAL> SlowEvenBreathsSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.NONVERBAL> SmilingSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.NONVERBAL> SparklingEyesSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.NONVERBAL> StillnessSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.ACTION> AvoidingMoodKillersSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.ACTION> BeingHonestSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.ACTION> DeepThinkingSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.ACTION> EnjoyingMomentSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.ACTION> FocusingOnMomentSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.ACTION> LettingThingsGoSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.ACTION> ListeningToOthersSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.ACTION> MinimizingStressorsSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.ACTION> PerformActsOfKindnessSerenityPlan;
    #uses BehaviorPlan<AffectEnum.SERENITY, AffectEnum.ACTION> TakingThingsLightlySerenityPlan;

}

