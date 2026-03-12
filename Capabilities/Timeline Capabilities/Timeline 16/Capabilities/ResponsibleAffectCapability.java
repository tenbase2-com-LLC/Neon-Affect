/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
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
    #uses plan AcknowledgingMistakesResponsiblePlan;
    #uses plan AnticipatingNeedsResponsiblePlan;
    #uses plan ArticulatingGoalsPlan;
    #uses plan AskQuestionsResponsiblePlan;
    #uses plan CalmExteriorResponsiblePlan;
    #uses plan ClearCommunicationPlan;
    #uses plan ContinuousLearningPlan;
    #uses plan CriticalThinkingPlan;
    #uses plan DecisionMakingResponsiblePlan;
    #uses plan ExpressingCommitmentPlan;
    #uses plan FluidMovementResponsiblePlan;
    #uses plan FocusedExpressionPlan;
    #uses plan FollowingThroughPlan;
    #uses plan GivingConstructiveFeedbackPlan;
    #uses plan ListeningIntentlyResponsiblePlan;
    #uses plan MaintainEyeContactRepsonsiblePlan;
    #uses plan NoddingResponsiblePlan;
    #uses plan PrioritizingResponsibilitiesResponsiblePlan;
    #uses plan ProblemSolvingResponsiblePlan;
    #uses plan ProvidingUpdatesPlan;
    #uses plan PunctualityPlan;
    #uses plan ResourcefulnesResponsiblePlan;
    #uses plan SelfReflectionPlan;
    #uses plan SettingRealisticDeadlinesPlan;
    #uses plan SharingInformationPlan;
    #uses plan SetPlanContextResponsiblePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
