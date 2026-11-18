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
public capability PatienceAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextPatiencePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.VERBAL> AskingQuestionsPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.VERBAL> CalmingSpeechPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.VERBAL> DetailedExplanationsPlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.VERBAL> GiveComplementsPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.VERBAL> GiveEncouragementPlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.VERBAL> NotInterruptingPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.VERBAL> RestatingPointsPlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.VERBAL> SpeakingDeliberatelyPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.VERBAL> UnhurriedSpeechPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.VERBAL> WelcomingQuestionsPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.NONVERBAL> DeepBreathsPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.NONVERBAL> DistancingOneselfPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.NONVERBAL> EyeContactPatiencePlam;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.NONVERBAL> FaceNeutralPlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.NONVERBAL> LeanInPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.NONVERBAL> ListeningIntentlyPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.NONVERBAL> NoddingSlowlyPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.NONVERBAL> RelaxedPosturePatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.NONVERBAL> StillnessPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.NONVERBAL> WaitingToFinishPlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.ACTION> BeingMoreTolerantPatientPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.ACTION> CelebratingMilestonesPlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.ACTION> GiveTimeToFinishSpeakingPlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.ACTION> GivingSpacePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.ACTION> InvestingTimeInTasksPlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.ACTION> ListeningNoJudgementPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.ACTION> ObservingBeforeReactingPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.ACTION> PauseToExaminePatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.ACTION> PerseveringPatiencePlan;
    #uses BehaviorPlan<AffectEnum.PATIENCE, AffectEnum.ACTION> ProvidingSupportPlan;

}

