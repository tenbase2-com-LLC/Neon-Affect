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
public capability PurposefulAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextPurposefulPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.VERBAL> ArticulatingGoalsPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.VERBAL> ClearCommunicationPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.VERBAL> ExpressingCommitmentPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.VERBAL> PositiveSelfTalkPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.VERBAL> RepeatToSelfPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.VERBAL> SharingIdeasPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.VERBAL> SpeakingWithConvictionPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.VERBAL> SpeakingWithPassionPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.VERBAL> ToThePointSpeechPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.VERBAL> VerbalizingStepsPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.NONVERBAL> EyesFocusedPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.NONVERBAL> FluidMovementPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.NONVERBAL> FocusedExpressionPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.NONVERBAL> HeadHeldHighPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.NONVERBAL> LipsTogetherPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.NONVERBAL> OpenBodyLanguagePurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.NONVERBAL> PushUpSleavesPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.NONVERBAL> QuickNodPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.NONVERBAL> SmilingPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.NONVERBAL> StandingFirmPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.ACTION> CreativityPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.ACTION> FocusingOnTasksPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.ACTION> FollowingThroughPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.ACTION> GoalSettingPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.ACTION> ImmersingSelfInProjectsPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.ACTION> PerseveringPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.ACTION> SacrificingPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.ACTION> StayingOnTaskPurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.ACTION> TakingInitiativePurposefulPlan;
    #uses BehaviorPlan<AffectEnum.PURPOSEFUL, AffectEnum.ACTION> VolunteeringPurposefulPlan;

}

