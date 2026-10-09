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
public capability DevotedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDevotedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.VERBAL> ComplementDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.VERBAL> ExpressingCommitmentDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.VERBAL> ExpressingGratitudeDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.VERBAL> ExpressingLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.VERBAL> MakingCommitmentsPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.VERBAL> OfferingUnconditionalSupportPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.VERBAL> PraisingFrequentlyPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.VERBAL> SpeakingWithPassionPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.VERBAL> SpeakingWithTendernessDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.VERBAL> VocalizingTrustPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.NONVERBAL> GentleCaressDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.NONVERBAL> LeanInDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.NONVERBAL> ListeningIntentlyDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.NONVERBAL> MaintainEyeContactDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.NONVERBAL> MaintainPhysicalProximityDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.NONVERBAL> NoddingDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.NONVERBAL> OpenBodyPostureDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.NONVERBAL> ShowingAlertnessPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.NONVERBAL> SmilingDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.NONVERBAL> TouchingAffectionatelyPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.ACTION> AnticipatingNeedsDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.ACTION> BeingReliabilePlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.ACTION> MaintainingFocusPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.ACTION> PerseveringPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.ACTION> PrioritizingPartnerDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.ACTION> ProtectingOthersDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.ACTION> RememberingDetailsDevotedPan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.ACTION> SacrificingDevotedPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.ACTION> StayingConsistentPlan;
    #uses BehaviorPlan<AffectEnum.DEVOTED, AffectEnum.ACTION> SurprisingWithAffectionDevotedPlan;

}

