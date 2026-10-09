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
public capability TendernessAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextTendernessPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.VERBAL> AskingHowToHelpTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.VERBAL> CalmingSpeechTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.VERBAL> OfferingWordsSupportTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.VERBAL> ReassuringOthersTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.VERBAL> SpeakingGentlyTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.VERBAL> SpeakingSoftlyTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.VERBAL> SpeakingWithTendernessTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.VERBAL> UsingPetNamesTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.VERBAL> ValidsatingFeelingsTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.VERBAL> WisperingTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.NONVERBAL> FaceSoftTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.NONVERBAL> GentleCaressTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.NONVERBAL> HalfClosedEyesTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.NONVERBAL> HeadTiltingToSideTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.NONVERBAL> HuggingTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.NONVERBAL> MaintainPhysicalProximityTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.NONVERBAL> NoddingSlowlyTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.NONVERBAL> PatientlyWaitingTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.NONVERBAL> SteadyEyeContactTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.NONVERBAL> UsingGentleHandGesturesTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.ACTION> AnticipatingNeedsTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.ACTION> GivingSpaceTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.ACTION> ListeningNoJudgementTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.ACTION> OfferingHugTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.ACTION> OfferingToBabysitTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.ACTION> ProtectingOthersTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.ACTION> ProvideListeningEarTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.ACTION> RememberingDetailsTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.ACTION> ShowingConcernTendernessPlan;
    #uses BehaviorPlan<AffectEnum.TENDERNESS, AffectEnum.ACTION> SurprisingWithAffectionTendernessPlan;

}

