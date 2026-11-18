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
public capability HappyAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextHappyPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.VERBAL> BecomingMoreTalkativePlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.VERBAL> BrightOutlookPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.VERBAL> BubblyLightVoicePlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.VERBAL> HummingWhistlingSingingPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.VERBAL> InfusingPositiveWords;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.VERBAL> OfferingComplementPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.VERBAL> OfferingEncouragementSupportPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.VERBAL> RapidSpeakingPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.VERBAL> TalkativeNatureCourtesyWithStrangersPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.VERBAL> TellingJokesLaughingFrequentlyPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.NONVERBAL> EyesDanceSparkleShinePlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.NONVERBAL> FluidMovementPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.NONVERBAL> GivingThumbsUpPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.NONVERBAL> InitiatingPhysicalContactPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.NONVERBAL> JoyfulTearsPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.NONVERBAL> NoddingLeaningInWhileListeningPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.NONVERBAL> PoliteMannerPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.NONVERBAL> QuickMovementsNoHesitationsPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.NONVERBAL> RelaxedAppearancePlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.NONVERBAL> SittingUpStraightPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.NONVERBAL> SmilingPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.ACTION> BeWithLovedOnesFriendsPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.ACTION> BenignRiskTakingPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.ACTION> BuyingGiftsOfferingKindnessPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.ACTION> ContentmentHappyPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.ACTION> FearlessnessPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.ACTION> GenerosityCompassionPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.ACTION> HelpfulnessPatiencePlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.ACTION> InitiatingRandomActsOfKindnessPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.ACTION> PositiveThinkingPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.ACTION> SpontaneityPlan;
    #uses BehaviorPlan<AffectEnum.HAPPY, AffectEnum.ACTION> SpreadJoyPlan;

}

