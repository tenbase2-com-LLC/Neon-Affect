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
public capability CooperativeAffectCapability extends Capability {
    #uses plan AcknowledgingOthersCooperativePlan;
    #uses plan ActiveListeningResponsesPlan;
    #uses plan AnticipatingNeedsCooperativePlan;
    #uses plan AskForInputPlan;
    #uses plan BeingReceptiveToFeedbackPlan;
    #uses plan ClarifyMisunderstandingsPlan;
    #uses plan CompromisingSelfInterestsPlan;
    #uses plan ConformingPlan;
    #uses plan CoordinatingActionsPlan;
    #uses plan ExpressingAgreementPlan;
    #uses plan EyeContactCooperativePlan;
    #uses plan NoddingCooperativePlan;
    #uses plan OfferingEncouragementSupportCooperativePlan;
    #uses plan OfferingToHelpCooperativePlan;
    #uses plan OpenPostureCooperativePlan;
    #uses plan SeekingConsensusPlan;
    #uses plan SeekingWinningSolutionsPlan;
    #uses plan SharingInformationCooperativePlan;
    #uses plan SharingResourcesCooperativePlan;
    #uses plan SmilingCooperativePlan;
    #uses plan UsingInclusiveLanguageCooperativePlan;
    #uses plan VolunteeringPlan;
    #uses plan SetPlanContextCooperativePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
