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
public capability ValuedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextValuedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.VERBAL> AppreciativePlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.VERBAL> AskingForFeedbackPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.VERBAL> BeingPositivePlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.VERBAL> CheeringPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.VERBAL> InitiatingConversationsPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.VERBAL> LaughterValuedPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.VERBAL> NoGossipingPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.VERBAL> NoSecretsPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.VERBAL> OfferingToHelpPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.VERBAL> SharingIdeaslPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.VERBAL> TalkativePlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.NONVERBAL> BeingGoodListenerPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.NONVERBAL> DeepBreathsValuedPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.NONVERBAL> EasyBreathingPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.NONVERBAL> GenuineSmileValuedPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.NONVERBAL> GoodAppearancePlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.NONVERBAL> HeadHeldHighPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.NONVERBAL> LeaningInValuedPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.NONVERBAL> NoddingWhileListeningPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.NONVERBAL> RelaxedMannerPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.NONVERBAL> StongEyeContactPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.ACTION> BuildRelationshipsPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.ACTION> FollowingRulesPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.ACTION> FriendlinessValuedPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.ACTION> NeedingReassurancePlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.ACTION> PolitenessPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.ACTION> ProudPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.ACTION> RiskTakingValuedPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.ACTION> SeekingRecognitionPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.ACTION> StayingOnTaskPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.ACTION> TakingOnNewTasksPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.ACTION> ThoughtfulnessPlan;
    #uses BehaviorPlan<AffectEnum.VALUED, AffectEnum.ACTION> WorkingHardPlan;

}

