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
public capability ValuedAffectCapability extends Capability {
    #uses plan HeadHeldHighPlan;
    #uses plan DeepBreathsValuedPlan;
    #uses plan GenuineSmileValuedPlan;
    #uses plan TakingOnNewTasksPlan;
    #uses plan PolitenessPlan;
    #uses plan TalkativePlan;
    #uses plan LeaningInValuedPlan;
    #uses plan InitiatingConversationsPlan;
    #uses plan StongEyeContactPlan;
    #uses plan LaughterValuedPlan;
    #uses plan BeingPositivePlan;
    #uses plan RelaxedMannerPlan;
    #uses plan NoSecretsPlan;
    #uses plan NoGossipingPlan;
    #uses plan NoddingWhileListeningPlan;
    #uses plan CheeringPlan;
    #uses plan FriendlinessValuedPlan;
    #uses plan ThoughtfulnessPlan;
    #uses plan BeingGoodListenerPlan;
    #uses plan StayingOnTaskPlan;
    #uses plan FollowingRulesPlan;
    #uses plan OfferingToHelpPlan;
    #uses plan GoodAppearancePlan;
    #uses plan ProudPlan;
    #uses plan EasyBreathingPlan;
    #uses plan RiskTakingValuedPlan;
    #uses plan WorkingHardPlan;
    #uses plan SharingIdeaslPlan;
    #uses plan BuildRelationshipsPlan;
    #uses plan AppreciativePlan;
    #uses plan NeedingReassurancePlan;
    #uses plan AskingForFeedbackPlan;
    #uses plan SeekingRecognitionPlan;
    #uses plan SetPlanContextValuedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
