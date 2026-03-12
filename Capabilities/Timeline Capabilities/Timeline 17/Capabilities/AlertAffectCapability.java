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
public capability AlertAffectCapability extends Capability {
    #uses plan AnticipatingNeedsAlertPlan;
    #uses plan AskQuestionsAlertPlan;
    #uses plan AwarenessSurrroundingsAlertPlan;
    #uses plan BlinkingInfrequentlyAlertPlan;
    #uses plan ClearArticulationPlan;
    #uses plan DetailedDiscussionPlan;
    #uses plan ExpressingReadinessPlan;
    #uses plan EyeContactAlertPlan;
    #uses plan EyesWideOpenAlertPlan;
    #uses plan FacialExpressionsAlertPlan;
    #uses plan FocusedAlertPlan;
    #uses plan ImprovedReactionTimePlan;
    #uses plan MultitaskingPlan;
    #uses plan OfferingObservationsPlan;
    #uses plan PreparingBestScenarioAlertPlan;
    #uses plan ProblemSolvingAlertPlan;
    #uses plan QuickDecisionsAlertPlan;
    #uses plan QuickHeadMovementsPlan;
    #uses plan QuickResponsesAlertPlan;
    #uses plan QuickThinkingAlertPlan;
    #uses plan RapidEyeMovementsPlan;
    #uses plan SharingInformationAlertPlan;
    #uses plan SpeakingWithEnergyPlan;
    #uses plan StrongPostureAlertPlan;
    #uses plan UsingPreciseLanguageAlertPlan;
    #uses plan VerbalUnderstandingPlan;
    #uses plan SetPlanContextAlertPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
