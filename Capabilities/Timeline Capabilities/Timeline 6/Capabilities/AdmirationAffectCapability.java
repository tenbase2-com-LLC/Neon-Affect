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
public capability AdmirationAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAdmirationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.VERBAL> AgreeablePlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.VERBAL> AskingMoreDetailPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.VERBAL> AskingQuestionsAdmirationPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.VERBAL> FriendlinessAdmirationPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.VERBAL> IncreasedLaughterPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.VERBAL> NotInterruptingPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.VERBAL> OfferComplementPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.VERBAL> OfferingPraisePlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.VERBAL> SpendTimeTogetherPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.VERBAL> TalkativeAdmirationPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.VERBAL> WarmGreetingPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.VERBAL> WarmToneVoicePlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.NONVERBAL> ClappingCheeringPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.NONVERBAL> EyesWideningIpressedAdmirationPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.NONVERBAL> LeaningInAdmirationPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.NONVERBAL> ListeningIntentlyAdmirationPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.NONVERBAL> NoddingDuringSpeechPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.NONVERBAL> ProlongedEyeContactPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.NONVERBAL> SlightSmilePlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.NONVERBAL> SteadyEyeContactAdmirationPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.NONVERBAL> TiltHeadPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.NONVERBAL> WelcomingStancePlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.ACTION> AcknowledgingEffortAdmirationPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.ACTION> CareTakingPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.ACTION> DesireToLearnAdmirationPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.ACTION> DrawingInspirationAdmirationPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.ACTION> FollowingUpAdmirationPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.ACTION> GoOutOfWayPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.ACTION> ImitationPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.ACTION> ResearchingTopicFurtherAdmirationPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.ACTION> ShowingAppreciationAdmirationPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRATION, AffectEnum.ACTION> TrustingPlan;

}

