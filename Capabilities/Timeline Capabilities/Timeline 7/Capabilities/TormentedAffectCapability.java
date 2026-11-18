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
public capability TormentedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextTormentedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.VERBAL> HighPitchedVoicePlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.VERBAL> InarticulateTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.VERBAL> MentallyBeratingOneselfTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.VERBAL> MoaningTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.VERBAL> PleadingTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.VERBAL> RepeatThoughtsTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.VERBAL> RepeatingNegativesTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.VERBAL> TalkToSelfTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.VERBAL> VocalizeTormentPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.VERBAL> YellingTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.NONVERBAL> ClenchedJawTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.NONVERBAL> EyesWideNotBlinkingPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.NONVERBAL> FlinchingTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.NONVERBAL> GrimaceTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.NONVERBAL> HoldingOneselfTightlyTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.NONVERBAL> NoiseSensitivityTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.NONVERBAL> QuickBreathingTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.NONVERBAL> RockingSlightlyTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.NONVERBAL> ShakingHeadTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.NONVERBAL> TearingTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.ACTION> AskForHelpTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.ACTION> InabilityToFocusTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.ACTION> MindReplayingAgonizingTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.ACTION> OverthinkingTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.ACTION> PacingTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.ACTION> PoorCopingSkillsPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.ACTION> SeekingComfortTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.ACTION> SelfBlameTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.ACTION> ThinkingIrrationallyTormentedPlan;
    #uses BehaviorPlan<AffectEnum.TORMENTED, AffectEnum.ACTION> WithdrawingFromOthersTormentedPlan;

}

