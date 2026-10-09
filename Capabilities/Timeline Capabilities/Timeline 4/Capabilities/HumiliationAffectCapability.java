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
public capability HumiliationAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextHumiliationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.VERBAL> ApologizingHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.VERBAL> CryingHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.VERBAL> CuttingConversationShortHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.VERBAL> MakingExcusesHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.VERBAL> MumblingHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.VERBAL> QuietVoiceHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.VERBAL> SelfDeprecatingRemarksHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.VERBAL> StutteringHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.VERBAL> WhimperingPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.VERBAL> WithdrawFromConversationHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.NONVERBAL> ArmsAtSideHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.NONVERBAL> BodyCollapsingInwardHumilationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.NONVERBAL> BottomLipTremblingPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.NONVERBAL> BowHeadPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.NONVERBAL> CoverFaceHandsPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.NONVERBAL> DizzinessPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.NONVERBAL> DownwardGazePlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.NONVERBAL> DullEyesPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.NONVERBAL> FlushedFaceHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.NONVERBAL> NoiseSensitivityHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.NONVERBAL> RapidSwallowingPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.NONVERBAL> ShiveringPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.NONVERBAL> UncontrollableTearsPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.ACTION> AvoidingAttentionHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.ACTION> DisillusionedHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.ACTION> DwellingOnEmbarrassmentHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.ACTION> ExitBirefllyHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.ACTION> FantasizingGettingEvenHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.ACTION> MindReplayingAgonizingHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.ACTION> RacingThoughtsPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.ACTION> SeekingComfortHumiliationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.ACTION> SelfLoathingHumilationPlan;
    #uses BehaviorPlan<AffectEnum.HUMILIATION, AffectEnum.ACTION> WithdrawingFromOthersHumiliationPlan;

}

