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
public capability UsefulAffectCapability extends Capability {
    #uses plan ArticulatingEfficienciesPlan;
    #uses plan AskQuestionsUsefulPlan;
    #uses plan CommunicatingResourcefulnessPlan;
    #uses plan ConstructiveFeedbackPlan;
    #uses plan DemonstrativeGesuresPlan;
    #uses plan EfficiencyImprovementPlan;
    #uses plan EncouragingCollaborationPlan;
    #uses plan EngagedFacialExpressionPlan;
    #uses plan FocusedGazeUsefulPlan;
    #uses plan ListeningIntentlyUsefulPlan;
    #uses plan NodHeadFastUsefulPlan;
    #uses plan OfferingAdviceUsefulPlan;
    #uses plan OfferingToHelpUsefulPlan;
    #uses plan PreciseHandMovementsPlan;
    #uses plan ProblemSolvingUsefulPlan;
    #uses plan ProvideClearInstructionsPlan;
    #uses plan ResourcefulnessUsefulPlan;
    #uses plan SharingInformationUsefulPlan;
    #uses plan SkillApplicationPlan;
    #uses plan SkillEnhancementPlan;
    #uses plan StrategicPlanningPlan;
    #uses plan SupportivePresencePlan;
    #uses plan TimeManagementPlan;
    #uses plan VerbalProblemSolvingPlan;
    #uses plan SetPlanContextUsefulPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
