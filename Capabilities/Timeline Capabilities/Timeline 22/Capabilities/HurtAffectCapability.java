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
public capability HurtAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextHurtPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.VERBAL> CryingHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.VERBAL> DefensiveResponsesHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.VERBAL> DemandExplanationHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.VERBAL> ExpressingFeelingsHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.VERBAL> QuietVoiceHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.VERBAL> ShortResponsesHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.VERBAL> SpeakingLessHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.VERBAL> VoiceAccusatoryToneHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.VERBAL> VoicingInsecuritiesHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.VERBAL> WithdrawFromConversationHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.NONVERBAL> ArmsCrossedHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.NONVERBAL> DownturnedMouthHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.NONVERBAL> FrownHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.NONVERBAL> IncreasePersonalDistanceHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.NONVERBAL> LookAwayHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.NONVERBAL> MaintainNeutralExpressionHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.NONVERBAL> SelfHuggingHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.NONVERBAL> ShakingHeadHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.NONVERBAL> TearingUpHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.NONVERBAL> TremblingLipsHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.ACTION> DefensiveHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.ACTION> DesireToBeHeldHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.ACTION> DwellingOnPastHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.ACTION> EasilyHurtByCommentsHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.ACTION> MindReplayingAgonizingHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.ACTION> MoodyHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.ACTION> NotGivingInKindnessHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.ACTION> SeekingComfortHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.ACTION> WantingToBeAloneHurtPlan;
    #uses BehaviorPlan<AffectEnum.HURT, AffectEnum.ACTION> WithdrawingFromOthersHurtPlan;

}

