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
public capability FearlessnessAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextFearlessnessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.VERBAL> AskPermissionPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.VERBAL> AskQuestionsFearlessnessPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.VERBAL> AssertiveStatementsFearlessnessPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.VERBAL> BeingDirectPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.VERBAL> CalmingSpeechPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.VERBAL> ConfidentVoiceFearlessnessPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.VERBAL> EvenSeriousTonePlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.VERBAL> ImpatienceFromSpeechPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.VERBAL> PositiveSelfTalkPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.VERBAL> ToThePointSpeechPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.NONVERBAL> AvoidingEyeContactFearlessnessPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.NONVERBAL> CalmExteriorPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.NONVERBAL> DeepBreathFearlessPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.NONVERBAL> GoodPostureFearlessnessPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.NONVERBAL> HeadHeldHighFearlessnessPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.NONVERBAL> LeanInFearlessnessPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.NONVERBAL> NoddingFearlessPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.NONVERBAL> RelaxedPostureFearlessnessPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.NONVERBAL> SmilingFearlessnessPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.NONVERBAL> StrongEyeContactFearlessnessPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.ACTION> AvoidingDistractionsPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.ACTION> HesitationFearlessnessPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.ACTION> ImaginingWorstCaseScenarioPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.ACTION> NoProcrastinationFearlessnessPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.ACTION> NoiseSensitivityFearlessnessPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.ACTION> ObservingBeforeReactingPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.ACTION> SelfSufficentPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.ACTION> TakingOnChallengesPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.ACTION> ThinkingLogicallyPlan;
    #uses BehaviorPlan<AffectEnum.FEARLESSNESS, AffectEnum.ACTION> TryNewThingsFearlessnessPlan;

}

