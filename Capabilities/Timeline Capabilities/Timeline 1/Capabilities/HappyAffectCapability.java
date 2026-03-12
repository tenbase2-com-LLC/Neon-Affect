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
public capability HappyAffectCapability extends Capability {
    #uses plan SmilingPlan;
    #uses plan HummingWhistlingSingingPlan;
    #uses plan RelaxedAppearancePlan;
    #uses plan TellingJokesLaughingFrequentlyPlan;
    #uses plan EyesDanceSparkleShinePlan;
    #uses plan BubblyLightVoicePlan;
    #uses plan RapidSpeakingPlan;
    #uses plan BuyingGiftsOfferingKindnessPlan;
    #uses plan GivingThumbsUpPlan;
    #uses plan SittingUpStraightPlan;
    #uses plan FluidMovementPlan;
    #uses plan PoliteMannerPlan;
    #uses plan OfferingComplementPlan;
    #uses plan InitiatingPhysicalContactPlan;
    #uses plan InfusingPositiveWords;
    #uses plan TalkativeNatureCourtesyWithStrangersPlan;
    #uses plan SpontaneityPlan;
    #uses plan NoddingLeaningInWhileListeningPlan;
    #uses plan OfferingEncouragementSupportPlan;
    #uses plan QuickMovementsNoHesitationsPlan;
    #uses plan InitiatingRandomActsOfKindnessPlan;
    #uses plan BecomingMoreTalkativePlan;
    #uses plan PositiveThinkingPlan;
    #uses plan SpreadJoyPlan;
    #uses plan HelpfulnessPatiencePlan;
    #uses plan ContentmentHappyPlan;
    #uses plan BrightOutlookPlan;
    #uses plan BeWithLovedOnesFriendsPlan;
    #uses plan FearlessnessPlan;
    #uses plan BenignRiskTakingPlan;
    #uses plan JoyfulTearsPlan;
    #uses plan GenerosityCompassionPlan;
    #uses plan SetPlanContextHappyPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();

}
