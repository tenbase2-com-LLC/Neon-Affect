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
public capability SelfSatisfiedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextSelfSatisfiedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.VERBAL> AccomplishmentMentionPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.VERBAL> BraggingSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.VERBAL> ExpressingSatisfactionPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.VERBAL> GratificationSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.VERBAL> LaughingToOneselfSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.VERBAL> PositiveAffirmationSelfSatisifiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.VERBAL> SelfAssuredCommentsPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.VERBAL> SelfPraisePlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.VERBAL> SpeakSoflySelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.VERBAL> VerbalizingAccomplishmentSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.NONVERBAL> HighChinSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.NONVERBAL> KnowingGrinSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.NONVERBAL> NoddingSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.NONVERBAL> PostureImprovementPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.NONVERBAL> SighSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.NONVERBAL> SmileSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.NONVERBAL> SmirkSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.NONVERBAL> SquintSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.NONVERBAL> StraightPostureSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.NONVERBAL> UnhurriedMovementSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.ACTION> CompetenceReinforcementPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.ACTION> ConfidenceBoostSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.ACTION> PersonalStandardsMeetingPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.ACTION> PersonalValidationPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.ACTION> PositiveSelfThoughtsSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.ACTION> ReminiscingPastSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.ACTION> SelfAffirmationPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.ACTION> SelfCongratulationPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.ACTION> SenseOfContentmentSelfSatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.SELF_SATISFIED, AffectEnum.ACTION> ShowingOffSelfSatisfiedPlan;

}

