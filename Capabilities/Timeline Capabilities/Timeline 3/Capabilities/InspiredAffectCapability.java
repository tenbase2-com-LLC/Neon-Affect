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
public capability InspiredAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextInspiredPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.VERBAL> ArticulatingVisionClearlyInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.VERBAL> LimitingConversationInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.VERBAL> ProposingHypothesesInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.VERBAL> RepeatToSelfInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.VERBAL> SharingIdeasInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.VERBAL> SpeakToInspireInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.VERBAL> SpeakingQuicklyLouderPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.VERBAL> TalkToSelfInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.VERBAL> UsingVividLanguageInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.VERBAL> VerbalizingExcitementInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.NONVERBAL> FocusedAttentionInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.NONVERBAL> HandWavingPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.NONVERBAL> HidingSmilePlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.NONVERBAL> LeaningInInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.NONVERBAL> MouthOpenPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.NONVERBAL> NotRespondingPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.NONVERBAL> RapidBreathingInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.NONVERBAL> RemainStillAtAhaMomentPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.NONVERBAL> SmilingFrequentlyPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.NONVERBAL> WideOpenEyesPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.ACTION> BrainstormingIdeasInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.ACTION> CreativityInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.ACTION> DrawingInspirationInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.ACTION> EasilyDistractedPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.ACTION> ForgettingInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.ACTION> FrustratedAtInterruptionsPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.ACTION> ImmersingSelfInProjectsInspiredPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.ACTION> LosingTrackOfTimePlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.ACTION> MentalClarityPlan;
    #uses BehaviorPlan<AffectEnum.INSPIRED, AffectEnum.ACTION> SeriousExpressionInspiredPlan;

}

