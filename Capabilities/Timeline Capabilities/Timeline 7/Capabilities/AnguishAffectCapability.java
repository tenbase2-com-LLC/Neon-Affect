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
public capability AnguishAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAnguishPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.VERBAL> AskForHelpAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.VERBAL> CryingAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.VERBAL> DescribingSensationAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.VERBAL> MoaningAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.VERBAL> PleadingAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.VERBAL> SwearingAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.VERBAL> VerbalizeInnerConflictAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.VERBAL> VocalizeTormentAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.VERBAL> WishingEventNeverHappenedAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.VERBAL> YellingAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.NONVERBAL> CheckingTimePlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.NONVERBAL> ClenchedJawPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.NONVERBAL> CoverFaceHandsAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.NONVERBAL> GrimaceAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.NONVERBAL> HeavyBreathingAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.NONVERBAL> NoiseSensitivityAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.NONVERBAL> RubBackOfNeckPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.NONVERBAL> StiffPostureAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.NONVERBAL> StrongGazeAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.NONVERBAL> TremblingLipsAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.ACTION> BargainingAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.ACTION> InabilityToFocusAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.ACTION> MindReplayingAgonizingAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.ACTION> PacingAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.ACTION> PoorCopingSkillsAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.ACTION> RacingThoughtsAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.ACTION> ReassuranceFromOthersAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.ACTION> SeekingComfortAnguishPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.ACTION> ThinkingIrrationallyPlan;
    #uses BehaviorPlan<AffectEnum.ANGUISH, AffectEnum.ACTION> WithdrawingFromOthersAnguishPlan;

}

