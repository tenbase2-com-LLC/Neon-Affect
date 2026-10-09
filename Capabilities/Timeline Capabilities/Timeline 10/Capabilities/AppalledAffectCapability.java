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
public capability AppalledAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAppalledPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.VERBAL> BlamePlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.VERBAL> DemandExplanationAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.VERBAL> GaspAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.VERBAL> InarticulateAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.VERBAL> LoudSpeechPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.VERBAL> NeedForAnswersPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.VERBAL> NotRespondingAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.VERBAL> RepeatSaidNoEmotionAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.VERBAL> ShockedSpeech;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.VERBAL> StammeringAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.NONVERBAL> DeepBreathAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.NONVERBAL> DizzinessAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.NONVERBAL> DryMouthPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.NONVERBAL> EyesWideOpenPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.NONVERBAL> FlinchingAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.NONVERBAL> LipSnarlPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.NONVERBAL> LookAwayAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.NONVERBAL> MouthOpenAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.NONVERBAL> SwallowingBeforeSpeakingPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.NONVERBAL> TearingUpAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.NONVERBAL> WildGesturesPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.ACTION> DemandingImmediateActionAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.ACTION> DisbeliefAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.ACTION> FocusedPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.ACTION> JudgementalAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.ACTION> MindReplayingAgonizingAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.ACTION> NeedToEscapePlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.ACTION> ReplayingExperiencePlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.ACTION> UnableToConcentrateAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.ACTION> WishingSomewhereElseAppalledPlan;
    #uses BehaviorPlan<AffectEnum.APPALLED, AffectEnum.ACTION> WithdrawingFromOthersAppalledPlan;

}

