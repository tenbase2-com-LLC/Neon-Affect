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
public capability PeacefulnessAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextPeacefulnessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.VERBAL> CalmingSpeechPeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.VERBAL> ForgivenessPeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.VERBAL> GratitudePeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.VERBAL> MeaningfullConversationPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.VERBAL> MeasuredResponsesPeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.VERBAL> ShareMomentPeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.VERBAL> SoftGentleVoicePeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.VERBAL> UnforcedLaughPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.VERBAL> UnhurriedSpeechPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.VERBAL> WhistlingHummingPeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.NONVERBAL> DeepBreathPeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.NONVERBAL> HalfClosedEyesPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.NONVERBAL> LeanBackPeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.NONVERBAL> NoddingPeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.NONVERBAL> OpenBodyPosturePeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.NONVERBAL> RelaxedPosturePeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.NONVERBAL> SighPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.NONVERBAL> SlowEvenBreathsPeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.NONVERBAL> SmilingPeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.NONVERBAL> SparklingEyesPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.ACTION> AvoidingMoodKillersPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.ACTION> BeingHonestPeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.ACTION> DeepThinkingPeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.ACTION> EnjoyingMomentPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.ACTION> IncludeSelfPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.ACTION> LettingThingsGoPeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.ACTION> ListeningToOthersPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.ACTION> MinimizingStressorsPeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.ACTION> PerformActsOfKindnessPeacefulnessPlan;
    #uses BehaviorPlan<AffectEnum.PEACEFULNESS, AffectEnum.ACTION> TakingThingsLightlyPeacefulnessPlan;

}

