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
public capability CooperativeAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextCooperativePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.VERBAL> AcknowledgingOthersCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.VERBAL> ActiveListeningResponsesPlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.VERBAL> AskForInputPlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.VERBAL> ClarifyMisunderstandingsPlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.VERBAL> ExpressingAgreementPlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.VERBAL> OfferingEncouragementSupportCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.VERBAL> OfferingToHelpCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.VERBAL> SeekingConsensusPlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.VERBAL> SharingInformationCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.VERBAL> UsingInclusiveLanguageCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.NONVERBAL> DemonstrativeGesuresCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.NONVERBAL> EyeContactCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.NONVERBAL> GivingThumbsUpCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.NONVERBAL> LeaningInCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.NONVERBAL> ListeningIntentlyCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.NONVERBAL> NoddingCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.NONVERBAL> OpenPostureCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.NONVERBAL> PatientlyWaitingCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.NONVERBAL> RelaxedPostureCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.NONVERBAL> SmilingCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.ACTION> AnticipatingNeedsCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.ACTION> BeingFlexibleCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.ACTION> BeingReceptiveToFeedbackPlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.ACTION> CompromisingSelfInterestsPlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.ACTION> ConformingPlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.ACTION> CoordinatingActionsPlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.ACTION> ProblemSolvingCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.ACTION> SeekingWinningSolutionsPlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.ACTION> SharingResourcesCooperativePlan;
    #uses BehaviorPlan<AffectEnum.COOPERATIVE, AffectEnum.ACTION> VolunteeringPlan;

}

