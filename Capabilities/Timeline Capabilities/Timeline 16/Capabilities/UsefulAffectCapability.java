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
public capability UsefulAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextUsefulPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.VERBAL> ArticulatingEfficienciesPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.VERBAL> AskQuestionsUsefulPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.VERBAL> CommunicatingResourcefulnessPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.VERBAL> ConstructiveFeedbackPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.VERBAL> EncouragingCollaborationPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.VERBAL> OfferingAdviceUsefulPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.VERBAL> OfferingToHelpUsefulPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.VERBAL> ProvideClearInstructionsPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.VERBAL> SharingInformationUsefulPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.VERBAL> VerbalProblemSolvingPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.NONVERBAL> CalmExteriorUsefulPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.NONVERBAL> DemonstrativeGesuresPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.NONVERBAL> EngagedFacialExpressionPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.NONVERBAL> FluidMovementUsefulPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.NONVERBAL> FocusedGazeUsefulPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.NONVERBAL> ListeningIntentlyUsefulPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.NONVERBAL> NodHeadFastUsefulPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.NONVERBAL> PreciseHandMovementsPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.NONVERBAL> SmilingUsefulPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.NONVERBAL> SupportivePresencePlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.ACTION> AnticipatingNeedsUsefulPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.ACTION> EfficiencyImprovementPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.ACTION> HelpfulnessUsefulPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.ACTION> ProblemSolvingUsefulPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.ACTION> ResourcefulnessUsefulPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.ACTION> SharingResourcesUsefulPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.ACTION> SkillApplicationPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.ACTION> SkillEnhancementPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.ACTION> StrategicPlanningPlan;
    #uses BehaviorPlan<AffectEnum.USEFUL, AffectEnum.ACTION> TimeManagementPlan;

}

