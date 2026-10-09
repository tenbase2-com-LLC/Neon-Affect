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
public capability DreadAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDreadPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.VERBAL> AskQuestionsDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.VERBAL> LowerVoiceToWhisperDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.VERBAL> OneWordResponsePlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.VERBAL> PessimisticStatementsDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.VERBAL> PleadingPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.VERBAL> QuietVoicePlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.VERBAL> SeekingReassuranceDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.VERBAL> SilenceDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.VERBAL> TalkToSelfDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.VERBAL> VoiceTremorDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.NONVERBAL> AvoidingEyeContactPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.NONVERBAL> BadPosturePlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.NONVERBAL> CrossingArmsDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.NONVERBAL> DifficultyBreathingPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.NONVERBAL> FidgetingDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.NONVERBAL> IncreasedSwallowingPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.NONVERBAL> LeanBackPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.NONVERBAL> LookAroundDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.NONVERBAL> NoiseSentivitiyPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.NONVERBAL> RockingSlightlyPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.ACTION> AssumingWorstScenarioDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.ACTION> AvoidingStressfulSituationsDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.ACTION> DizzinessDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.ACTION> ImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.ACTION> LossOfAppetiteDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.ACTION> NeedControlDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.ACTION> OverPreparingDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.ACTION> PessimisticPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.ACTION> ProcrastinationDreadPlan;
    #uses BehaviorPlan<AffectEnum.DREAD, AffectEnum.ACTION> ReassuranceFromOthersDreadPlan;

}

