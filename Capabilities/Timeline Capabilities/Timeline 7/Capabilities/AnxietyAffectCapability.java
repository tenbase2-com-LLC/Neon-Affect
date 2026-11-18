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
public capability AnxietyAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAnxietyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.VERBAL> AskingClarificationAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.VERBAL> HesitationSpeechAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.VERBAL> MutteringAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.VERBAL> SeekingReassuranceAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.VERBAL> SpeakingQuicklyAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.VERBAL> StutteringAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.VERBAL> TalkToSelfAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.VERBAL> VoiceStrainedAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.VERBAL> VoiceTremorAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.VERBAL> WeighingProsConsAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.NONVERBAL> ArmsCrossedAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.NONVERBAL> BitingLipAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.NONVERBAL> ClenchedJawAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.NONVERBAL> ExcessiveSwallowingAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.NONVERBAL> FidgetingAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.NONVERBAL> HeadShakingAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.NONVERBAL> QuickGazeAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.NONVERBAL> RubBackOfNeckAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.NONVERBAL> ShallowBreathingAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.NONVERBAL> ShiftingPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.ACTION> EasilyDistractedAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.ACTION> EngagingWorstCaseScenarioPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.ACTION> ImpatienceAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.ACTION> IncreasedAwarenessPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.ACTION> OverPreparingAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.ACTION> OverthinkingAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.ACTION> PacingAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.ACTION> ReassuranceFromOthersPlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.ACTION> SelfBlamePlan;
    #uses BehaviorPlan<AffectEnum.ANXIETY, AffectEnum.ACTION> SlowedTimePlan;

}

