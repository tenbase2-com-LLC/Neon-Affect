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
public capability DeterminationAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDeterminationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.VERBAL> AffirmativeWordsPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.VERBAL> ArticulatedSpeechPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.VERBAL> AskingQuestionsDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.VERBAL> ExpressingCommitmentDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.VERBAL> FirstToSpeakPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.VERBAL> IgnoringDistractionsPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.VERBAL> LowVoicePlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.VERBAL> PositiveSelfTalkDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.VERBAL> RepeatToSelfDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.VERBAL> SpeakingWithConvictionDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.NONVERBAL> DeepBreathDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.NONVERBAL> EyesFocusedDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.NONVERBAL> HeadHeldHighDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.NONVERBAL> LeanInDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.NONVERBAL> LipsTogetherDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.NONVERBAL> MakeFistDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.NONVERBAL> PushUpSleavesPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.NONVERBAL> QuickNodDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.NONVERBAL> StandingFirmPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.NONVERBAL> StrongEyeContactDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.ACTION> ConfrontChallengesDirectlyDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.ACTION> GoalSettingDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.ACTION> ListeningDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.ACTION> PerseveringDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.ACTION> PurposefulDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.ACTION> RehearsingPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.ACTION> SacrificingPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.ACTION> ShowingResilienceDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.ACTION> TakingOnChallengesDeterminationPlan;
    #uses BehaviorPlan<AffectEnum.DETERMINATION, AffectEnum.ACTION> TryHarderDeterminationPlan;

}

