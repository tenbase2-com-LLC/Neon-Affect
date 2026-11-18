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
public capability OverwhelmedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextOverwhelmedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.VERBAL> AskForHelpOverwhelmedPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.VERBAL> ComplainOverwhelmedPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.VERBAL> CryingOverwhelmedPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.VERBAL> DifficultyRespondingOverwhelmedPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.VERBAL> InappropriateResponsesOverwhelmedPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.VERBAL> MumblingPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.VERBAL> QuickChoppySentencesOverwhelmedPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.VERBAL> RequestTimeToThinkOverwhelmedPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.VERBAL> VoiceChokedWithTears;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.VERBAL> WhimperPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.NONVERBAL> BringHandToForeheadPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.NONVERBAL> CloseEyesPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.NONVERBAL> DropShouldersPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.NONVERBAL> FaintingPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.NONVERBAL> HandsOverEarsPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.NONVERBAL> HoldingPalmUpPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.NONVERBAL> HyperventilatingPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.NONVERBAL> ShakingHeadOverwhelmedPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.NONVERBAL> ShakingPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.NONVERBAL> TearyEyesPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.NONVERBAL> WaveAwayPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.ACTION> ChronicFatiguePlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.ACTION> HeadachePlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.ACTION> InabilityToFocusPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.ACTION> IndecisivenessPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.ACTION> IsolationOverwhelmedPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.ACTION> NoiseSensitivityPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.ACTION> OverthinkingProblemsOverwhelmedPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.ACTION> RushedTasksOverwhelmedPlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.ACTION> SnappingUnderPressurePlan;
    #uses BehaviorPlan<AffectEnum.OVERWHELMED, AffectEnum.ACTION> WishingForComfortPlan;

}

