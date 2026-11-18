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
public capability HeartbrokenAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextHeartbrokenPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.VERBAL> AskForHelpHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.VERBAL> CryingHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.VERBAL> ExpressingHopelessnessHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.VERBAL> MoaningHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.VERBAL> OneWordAnswerHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.VERBAL> RelivingPastEventsHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.VERBAL> SharingFeelingsHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.VERBAL> SpeakingLessHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.VERBAL> TalkingAboutPastRelationshipsHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.VERBAL> WishingEventNeverHappenedHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.NONVERBAL> CoverFaceHandsHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.NONVERBAL> EmptyStareHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.NONVERBAL> HoldingBackTearsHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.NONVERBAL> HuggingHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.NONVERBAL> LossOfBreathHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.NONVERBAL> SelfHuggingHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.NONVERBAL> SlowBodyMovementsHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.NONVERBAL> TearingUpHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.NONVERBAL> TremblingLipsHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.NONVERBAL> UncontrollableTearsHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.ACTION> DesireToBeHeldHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.ACTION> DwellingOnPastHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.ACTION> InabilityToSeeFutureHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.ACTION> IsolationHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.ACTION> LackOfMotivationHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.ACTION> LossOfAppetiteHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.ACTION> MakingBigChangesHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.ACTION> NeedToBeAloneHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.ACTION> SeekingComfortHeartbrokenPlan;
    #uses BehaviorPlan<AffectEnum.HEARTBROKEN, AffectEnum.ACTION> SpendingMoreTimeWithOthersHeartbrokenPlan;

}

