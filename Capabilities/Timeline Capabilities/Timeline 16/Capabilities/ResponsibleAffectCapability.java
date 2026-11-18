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
public capability ResponsibleAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextResponsiblePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.VERBAL> AcknowledgingMistakesResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.VERBAL> ArticulatingGoalsPlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.VERBAL> AskQuestionsResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.VERBAL> ClearCommunicationPlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.VERBAL> ExpressingCommitmentPlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.VERBAL> GivingConstructiveFeedbackPlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.VERBAL> MeasuredResponsesResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.VERBAL> OfferingToHelpResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.VERBAL> ProvidingUpdatesPlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.VERBAL> SharingInformationPlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.NONVERBAL> CalmExteriorResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.NONVERBAL> ConfidentPostureResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.NONVERBAL> FluidMovementResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.NONVERBAL> FocusedExpressionPlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.NONVERBAL> ListeningIntentlyResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.NONVERBAL> MaintainEyeContactRepsonsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.NONVERBAL> NoddingResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.NONVERBAL> NoddingWhileListeningResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.NONVERBAL> PunctualityPlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.NONVERBAL> SupportivePresenceResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.ACTION> AnticipatingNeedsResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.ACTION> ContinuousLearningPlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.ACTION> CriticalThinkingPlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.ACTION> DecisionMakingResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.ACTION> FollowingThroughPlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.ACTION> PrioritizingResponsibilitiesResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.ACTION> ProblemSolvingResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.ACTION> ResourcefulnesResponsiblePlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.ACTION> SelfReflectionPlan;
    #uses BehaviorPlan<AffectEnum.RESPONSIBLE, AffectEnum.ACTION> SettingRealisticDeadlinesPlan;

}

