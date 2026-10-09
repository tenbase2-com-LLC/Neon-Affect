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
public capability PleasedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextPleasedPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.VERBAL> AccomplishmentMentionPleasedPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.VERBAL> ComplimentPleasedPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.VERBAL> ExpressingGratitudePleasedPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.VERBAL> GratificationPleasedPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.VERBAL> HummingWhistlingSingingPleasedPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.VERBAL> LaughingPleasedPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.VERBAL> LaughingToOneselfPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.VERBAL> SelfAssuredCommentsPleasedPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.VERBAL> SharingGoodNewsPleasedPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.VERBAL> SoftGentleVoicePlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.NONVERBAL> ChinLiftingPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.NONVERBAL> CoveringSmileWithHandPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.NONVERBAL> FlushedFacedPleasedPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.NONVERBAL> HandClappingPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.NONVERBAL> HeadNoddingPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.NONVERBAL> HeadTiltingToSidePlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.NONVERBAL> MakingStrongEyeContactPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.NONVERBAL> OpenBodyPosturePlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.NONVERBAL> PlacingHandOverHeartPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.NONVERBAL> RelaxedSmilePlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.NONVERBAL> ShakingHeadWhileSmilingPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.NONVERBAL> SighingPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.NONVERBAL> ThumbsUpPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.ACTION> BeingMoreTolerantPatientPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.ACTION> CaptureMemoryPleasedPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.ACTION> GenerosityPleasedPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.ACTION> IgnoringProblemsPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.ACTION> ImprovedProductivityPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.ACTION> ImprovedRelationshipsPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.ACTION> IncreasedSenseOfPrideSelfConfidencePlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.ACTION> ReflectingAchievementPleasedPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.ACTION> SenseOfContentmentPlan;
    #uses BehaviorPlan<AffectEnum.PLEASED, AffectEnum.ACTION> WantingFeelingToLastPlan;

}

