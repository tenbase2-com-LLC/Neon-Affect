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
public capability HopefulnessAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextHopefulnessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.VERBAL> AskingQuestionsHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.VERBAL> ExpressingOptimismHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.VERBAL> OfferingCommittmentPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.VERBAL> PlanningFutureActivitiesHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.VERBAL> PositiveAffirmationHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.VERBAL> PositiveSelfTalkHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.VERBAL> RefusingNegativityPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.VERBAL> SeekingReassuranceHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.VERBAL> TremblingVoicePlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.VERBAL> VoiceOptimisticHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.NONVERBAL> BitingLipHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.NONVERBAL> CoverFaceWithHandsPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.NONVERBAL> DeepBreathsHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.NONVERBAL> HoldBreathPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.NONVERBAL> LeanInHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.NONVERBAL> SmilingHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.NONVERBAL> SmoothingClothesHopefulnesslan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.NONVERBAL> SquirmingPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.NONVERBAL> StandingStillPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.NONVERBAL> StiffPostureHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.NONVERBAL> StrongEyeContactHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.NONVERBAL> TearingHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.ACTION> AwarenessSurroundingsPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.ACTION> FocusingImprovmentPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.ACTION> ImagineWhatWillHappenHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.ACTION> LookingAheadHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.ACTION> MakePlansHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.ACTION> PerseveringHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.ACTION> PostiiveThinkingHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.ACTION> PreparingBestScenarioPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.ACTION> ReachingOutTentativelyHopefulnessPlan;
    #uses BehaviorPlan<AffectEnum.HOPEFULNESS, AffectEnum.ACTION> SeekingNewOpportunitiesHopefulnessPlan;

}

