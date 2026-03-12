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
public capability DevotedAffectCapability extends Capability {
    #uses plan AnticipatingNeedsDevotedPlan;
    #uses plan BeingReliabilePlan;
    #uses plan ComplementDevotedPlan;
    #uses plan ExpressingGratitudeDevotedPlan;
    #uses plan ExpressingLoyaltyPlan;
    #uses plan LeanInDevotedPlan;
    #uses plan MaintainEyeContactDevotedPlan;
    #uses plan MaintainingFocusPlan;
    #uses plan MakingCommitmentsPlan;
    #uses plan NoddingDevotedPlan;
    #uses plan OfferingUnconditionalSupportPlan;
    #uses plan PerseveringPlan;
    #uses plan PraisingFrequentlyPlan;
    #uses plan PrioritizingPartnerDevotedPlan;
    #uses plan RememberingDetailsDevotedPan;
    #uses plan SacrificingDevotedPlan;
    #uses plan ShowingAlertnessPlan;
    #uses plan SmilingDevotedPlan;
    #uses plan SpeakingWithPassionPlan;
    #uses plan StayingConsistentPlan;
    #uses plan TouchingAffectionatelyPlan;
    #uses plan VocalizingTrustPlan;
    #uses plan SetPlanContextDevotedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
