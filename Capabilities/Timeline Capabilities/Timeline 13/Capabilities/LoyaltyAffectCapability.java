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
public capability LoyaltyAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextLoyaltyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.VERBAL> AppreciativeLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.VERBAL> DefendingFriendsPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.VERBAL> GivingCreditPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.VERBAL> OfferingToHelpLoyalty;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.VERBAL> PraisingOthersPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.VERBAL> ProvidingEncouragementPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.VERBAL> ReassuringOthersPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.VERBAL> ShareExperienceLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.VERBAL> SpeakingHighlyOthersPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.VERBAL> UsingInclusiveLanguagePlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.NONVERBAL> EyeContactLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.NONVERBAL> HighFivePlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.NONVERBAL> LeaningInLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.NONVERBAL> NoddingLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.NONVERBAL> NoddingWhileListeningLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.NONVERBAL> OpenPostureLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.NONVERBAL> SmilingLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.NONVERBAL> StandingFirmLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.NONVERBAL> SteadyEyeContactLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.NONVERBAL> ThumbsUpLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.ACTION> AnticipatingNeedsLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.ACTION> BeingDependablePlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.ACTION> HelpfullnessLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.ACTION> KeepingPromisesPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.ACTION> ProtectingOthersPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.ACTION> SacrificingLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.ACTION> SharingResourcesPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.ACTION> SpendingQualityTimeLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.ACTION> StayingConsistentLoyaltyPlan;
    #uses BehaviorPlan<AffectEnum.LOYALTY, AffectEnum.ACTION> VolunteeringLoyaltyPlan;

}

