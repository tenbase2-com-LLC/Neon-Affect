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
public capability CapableAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextCapablePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.VERBAL> AnsweringQuestionsPlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.VERBAL> ConfidentVoiceCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.VERBAL> DetailedExplanationsCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.VERBAL> GivingEncouragementPlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.VERBAL> OfferingAdvicePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.VERBAL> OfferingToHelpCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.VERBAL> SharingExperienceCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.VERBAL> SpeakingDeliberatelyCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.VERBAL> ThoughtfulResponsesCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.VERBAL> VerbalProblemSolvingCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.NONVERBAL> CalmExteriorCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.NONVERBAL> ConfidentPosturePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.NONVERBAL> DemonstrativeGesuresCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.NONVERBAL> EyeContactCapabilePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.NONVERBAL> FluidMovementCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.NONVERBAL> ListeningIntentlyCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.NONVERBAL> MaintainComposurePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.NONVERBAL> NoddingCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.NONVERBAL> PreciseHandMovementsCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.NONVERBAL> SmilingSincerelyPlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.ACTION> AdaptabilityPlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.ACTION> AttentionToDetailPlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.ACTION> DecisionMakingPlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.ACTION> EfficientlyManagingTasksPlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.ACTION> OfferingToTeachSkillCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.ACTION> ProblemSolvingPlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.ACTION> QuickThinkingCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.ACTION> ResourcefulnessPlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.ACTION> SkillApplicationCapablePlan;
    #uses BehaviorPlan<AffectEnum.CAPABLE, AffectEnum.ACTION> TakingInitiativePlan;

}

