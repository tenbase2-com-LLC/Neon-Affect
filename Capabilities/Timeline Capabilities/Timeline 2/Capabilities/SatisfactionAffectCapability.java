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
public capability SatisfactionAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextSatisfactionPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.VERBAL> AccomplishmentMentionSatisfactionPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.VERBAL> BraggingPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.VERBAL> ExpressingGratitudeSatisfactionPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.VERBAL> GratificationPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.VERBAL> LaughingToOneselfSatisfactionPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.VERBAL> LoudCheeringPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.VERBAL> OfferingCongratulationsPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.VERBAL> SelfAssuredCommentsSatisfactionPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.VERBAL> UnhurriedSpeechSatisfactionPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.VERBAL> WhistlingHummingPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.NONVERBAL> ClappingPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.NONVERBAL> CockySmilePlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.NONVERBAL> CrispNodPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.NONVERBAL> DeepBreathPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.NONVERBAL> DeepSighPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.NONVERBAL> DirectMannerPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.NONVERBAL> RelaxedSmileSatisfactionPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.NONVERBAL> StraightPosturePlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.NONVERBAL> ThumbsUpSatisfactionPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.NONVERBAL> UnhurriedMovementPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.ACTION> CelebratingMilestonesSatisfactionPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.ACTION> ContentmentPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.ACTION> EnjoyingMomentSatisfactionPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.ACTION> GenerositySatisfactionPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.ACTION> HyperAwarenessOfOthersPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.ACTION> ImprovedProductivitySatisfactionPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.ACTION> IncreasedConfidencePlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.ACTION> PersonalStandardsMeetingSatisfactionPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.ACTION> ReflectingAchievementSatisfactionPlan;
    #uses BehaviorPlan<AffectEnum.SATISFACTION, AffectEnum.ACTION> WantingFeelingToLastSatisfactionPlan;

}

