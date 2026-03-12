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
public capability LoyaltyAffectCapability extends Capability {
    #uses plan AppreciativeLoyaltyPlan;
    #uses plan BeingDependablePlan;
    #uses plan DefendingFriendsPlan;
    #uses plan EyeContactLoyaltyPlan;
    #uses plan GivingCreditPlan;
    #uses plan HelpfullnessLoyaltyPlan;
    #uses plan HighFivePlan;
    #uses plan KeepingPromisesPlan;
    #uses plan NoddingLoyaltyPlan;
    #uses plan OfferingToHelpLoyalty;
    #uses plan OpenPostureLoyaltyPlan;
    #uses plan PraisingOthersPlan;
    #uses plan ProtectingOthersPlan;
    #uses plan ProvidingEncouragementPlan;
    #uses plan ReassuringOthersPlan;
    #uses plan SacrificingLoyaltyPlan;
    #uses plan ShareExperienceLoyaltyPlan;
    #uses plan SharingResourcesPlan;
    #uses plan SmilingLoyaltyPlan;
    #uses plan SpeakingHighlyOthersPlan;
    #uses plan ThumbsUpLoyaltyPlan;
    #uses plan UsingInclusiveLanguagePlan;
    #uses plan SetPlanContextLoyaltyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
