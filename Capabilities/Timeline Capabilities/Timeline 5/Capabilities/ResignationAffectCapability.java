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
public capability ResignationAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextResignationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.VERBAL> ExpressingHopelessnessResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.VERBAL> LessTalkativePlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.VERBAL> LossForWordsPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.VERBAL> MonotoneVoiceResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.VERBAL> MumblingResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.VERBAL> OneWordAnswerPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.VERBAL> SlowReactionPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.VERBAL> SpeakingFlatVoiceResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.VERBAL> UnemotionallyAgreePlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.VERBAL> WhateverResponseResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.NONVERBAL> AnsweringWithNodPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.NONVERBAL> AvoidingEyeContactResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.NONVERBAL> BadPostureResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.NONVERBAL> BlankFeaturesPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.NONVERBAL> DullEyesResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.NONVERBAL> LongExhalePlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.NONVERBAL> LossOfAppetiteResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.NONVERBAL> ShakingHeadResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.NONVERBAL> ShrugPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.NONVERBAL> SighResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.NONVERBAL> TearingUpResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.NONVERBAL> TremblingChinPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.ACTION> ApatheticPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.ACTION> ConfusionResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.ACTION> DepressionResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.ACTION> DirectionlessPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.ACTION> DisconnectingFromOthersPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.ACTION> DoubtingSelfResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.ACTION> InabilityToFocusResignationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.ACTION> LackOfEmotionPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.ACTION> MakeBestSituationPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.ACTION> NeverBeSamePlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.ACTION> PessimisticThoughtsPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.ACTION> PowerlessFuturePlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.ACTION> RetreatingInwardPlan;
    #uses BehaviorPlan<AffectEnum.RESIGNATION, AffectEnum.ACTION> SubmissivePlan;

}

