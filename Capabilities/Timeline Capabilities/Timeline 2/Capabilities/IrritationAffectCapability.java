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
public capability IrritationAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextIrritationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.VERBAL> AskingPointedQuestionsPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.VERBAL> ChallengeViewpointPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.VERBAL> ChangeSubjectPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.VERBAL> ForcingLaughPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.VERBAL> InsultPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.VERBAL> InterruptingPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.VERBAL> InterruptingSelfPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.VERBAL> JudgementalPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.VERBAL> NegativeLanguagePlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.VERBAL> RaisingVoiceIrritationPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.VERBAL> SarcasmIrritationPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.VERBAL> SpeakingInChallengingTonePlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.VERBAL> SwearingPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.NONVERBAL> ClenchingTeethIrritationPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.NONVERBAL> CrossingArmsIrritationPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.NONVERBAL> ExhaleThroughNoseIrritationPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.NONVERBAL> FrownIrritationPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.NONVERBAL> GoingSilentPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.NONVERBAL> IntentivelyWatchingPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.NONVERBAL> PurseLipsIrritationPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.NONVERBAL> RepeatMannerismPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.NONVERBAL> RubbingBackOfNeckPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.NONVERBAL> SmilingHardPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.NONVERBAL> SternLookHeadForwardPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.ACTION> AssertiveIrritationPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.ACTION> CalculatingTimeRemainingIrritationPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.ACTION> CloudedJudgementPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.ACTION> DivertNegativityPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.ACTION> EasilyFrustratedIrritationPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.ACTION> FaultFindingIrritationPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.ACTION> IrritabilityIrritationPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.ACTION> SnappingUnderPressureIrritationPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.ACTION> StrayingAttentionIrritationPlan;
    #uses BehaviorPlan<AffectEnum.IRRITATION, AffectEnum.ACTION> WishingShutupPlan;

}

