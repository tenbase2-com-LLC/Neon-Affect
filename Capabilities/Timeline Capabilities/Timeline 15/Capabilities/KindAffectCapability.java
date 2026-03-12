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
public capability KindAffectCapability extends Capability {
    #uses plan AcknowledgingEffortKindPlan;
    #uses plan BeingGenerousPlan;
    #uses plan CalmExteriorKindPlan;
    #uses plan ConsideringOthersPerspectivesPlan;
    #uses plan ExpressingGratitudePlan;
    #uses plan ForgivenessKindPlan;
    #uses plan GivingComplementsKindPlan;
    #uses plan GivingPraiseKindPlan;
    #uses plan GivingThumbsUpKindPlan;
    #uses plan ListeningKindPlan;
    #uses plan NoddingKindPlan;
    #uses plan OfferingEncouragementPlan;
    #uses plan OfferingToHelpKindPlan;
    #uses plan PatientlyWaitingPlan;
    #uses plan PerformingActsOfKindnessKindPlan;
    #uses plan SharingPositiveFeedbackPlan;
    #uses plan ShowingConcernKindPlan;
    #uses plan ShowingEmpathyPlan;
    #uses plan SmilingKindPlan;
    #uses plan SpeakingGentlyKindPlan;
    #uses plan ThinkingPositivelyPlan;
    #uses plan UsingPoliteLanguagePlan;
    #uses plan SetPlanContextKindPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
