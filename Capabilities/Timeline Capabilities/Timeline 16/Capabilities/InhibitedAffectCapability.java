/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
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
public capability InhibitedAffectCapability extends Capability {
    #uses plan ApologizingInhibitedPlan;
    #uses plan ArmsCrossedInhibitedPlan;
    #uses plan AvoidingEyeContactInhibitedPlan;
    #uses plan AvoidingPersonalTopicsPlan;
    #uses plan BadPostureInhibitedPlan;
    #uses plan CuttingConversationShortPlan;
    #uses plan FidgetingInhibitedPlan;
    #uses plan HesitatiingToTakeInitiativePlan;
    #uses plan LoweringHeadInhibitedPlan;
    #uses plan MaintainPhysicalDistanceInhibitedPlan;
    #uses plan NegativeThinkingInhibitedPlan;
    #uses plan OverthinkingInhibitedPlan;
    #uses plan PerformingRoutinesPlan;
    #uses plan QuickResponsesImhibitedPlan;
    #uses plan ResistingNewTasksPlan;
    #uses plan SecondGuessingStatementsPlan;
    #uses plan SelfDoubtInhibitedPlan;
    #uses plan SpeakSoftlyInhibitedPlan;
    #uses plan StiffPostureImhibitedPlan;
    #uses plan StutteringInhibitedPlan;
    #uses plan UsingPassiveLanguagePlan;
    #uses plan UsingQualifiersPlan;
    #uses plan WantingToBeAloneInihibitedPlan;
    #uses plan SetPlanContextInhibitedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
