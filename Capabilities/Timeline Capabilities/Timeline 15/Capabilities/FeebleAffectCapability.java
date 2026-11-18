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
public capability FeebleAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextFeeblePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.VERBAL> AgreeingQuicklyFeeblePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.VERBAL> ApologizingFeeblePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.VERBAL> AskForHelpFeeblePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.VERBAL> AskOthersOpinionPlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.VERBAL> ExpressingUncertaintyPlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.VERBAL> SpeakWeakVoicePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.VERBAL> StrugglingToSpeakFeeblePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.VERBAL> UseQualifyingLanguageFeeblePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.VERBAL> UsingHesitantLanguagePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.VERBAL> VerbalizingSelfDoubtPlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.NONVERBAL> AvoidingEyeContactFeeblePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.NONVERBAL> AvoidingGesturesPlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.NONVERBAL> AvoidingPhysicalContactPlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.NONVERBAL> BadPostureFeeblePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.NONVERBAL> CoweringPlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.NONVERBAL> HoldBreathFeeblePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.NONVERBAL> LoweringHeadFeeblePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.NONVERBAL> ShrinkingAwayFromAttentionPlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.NONVERBAL> ShrugFeeblePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.NONVERBAL> WringingHandsPlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.ACTION> AvoidingChallengesFeeblePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.ACTION> DoubtingOwnJudgementPlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.ACTION> FailingToAssertOneselfPlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.ACTION> GivingUpEasilyPlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.ACTION> HesitatingToTakeInitiativePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.ACTION> OveranalyzingTasksPlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.ACTION> ProcrastinationFeeblePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.ACTION> RelyingOnOthersFeeblePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.ACTION> SeekingReassuranceFeeblePlan;
    #uses BehaviorPlan<AffectEnum.FEEBLE, AffectEnum.ACTION> UnderestimatingOwnAbilitiesPlan;

}

