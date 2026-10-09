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
public capability SupportedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextSupportedPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.VERBAL> AskingForAdviceSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.VERBAL> AskingForFeedbackSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.VERBAL> BeingHonestSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.VERBAL> ExpressingGratitudeSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.VERBAL> ExpressingOptimismSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.VERBAL> PositiveSelfTalkSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.VERBAL> SayingPersonalThingsSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.VERBAL> SharingFeelingsSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.VERBAL> SincereThankYousSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.VERBAL> UsingInclusiveLanguageSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.NONVERBAL> EasyBreathingSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.NONVERBAL> HeadHeldHighSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.NONVERBAL> HuggingSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.NONVERBAL> LeaningInSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.NONVERBAL> NoddingWhileListeningSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.NONVERBAL> OpenBodyPostureSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.NONVERBAL> RelaxedPostureSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.NONVERBAL> ShouldersDroppingSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.NONVERBAL> SmilingSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.NONVERBAL> SteadyEyeContactSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.ACTION> AppreciativeSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.ACTION> BeingReceptiveToFeedbackSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.ACTION> IncreasedConfidenceSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.ACTION> LettingGoConcernsSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.ACTION> OpenToSuggestionsSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.ACTION> PerseveringSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.ACTION> RelyingOnOthersSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.ACTION> SpendingMoreTimeWithOthersSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.ACTION> TrustingSupportedPlan;
    #uses BehaviorPlan<AffectEnum.SUPPORTED, AffectEnum.ACTION> TryNewThingsSupportedPlan;

}

