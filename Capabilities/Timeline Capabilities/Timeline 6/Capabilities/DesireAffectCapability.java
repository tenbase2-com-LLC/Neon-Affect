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
public capability DesireAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDesirePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.VERBAL> AskingQuestionsDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.VERBAL> ComplimentDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.VERBAL> ExpressingAttractionDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.VERBAL> FlirtingTalkDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.VERBAL> ImmediateResponsePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.VERBAL> InarticulateDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.VERBAL> LowVoiceDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.VERBAL> PlanningFutureActivitiesDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.VERBAL> SighDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.VERBAL> SpeakingSoflyDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.NONVERBAL> CarefulMovementsPlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.NONVERBAL> FlirtyGlancePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.NONVERBAL> ImitationDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.NONVERBAL> IntenseGazeDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.NONVERBAL> LeanInDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.NONVERBAL> LickingLipsDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.NONVERBAL> RelaxedPostureDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.NONVERBAL> SmileBuildiingPlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.NONVERBAL> StrokingArmsPlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.NONVERBAL> StrongEyeContactDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.ACTION> ClosingDistanceDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.ACTION> FantasizingDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.ACTION> FixatingThoughtsSubjectDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.ACTION> FollowingImpulsesDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.ACTION> GoalSettingDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.ACTION> ImpatienceDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.ACTION> NeglectingOthersPlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.ACTION> PerseveringDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.ACTION> RiskTakingDesirePlan;
    #uses BehaviorPlan<AffectEnum.DESIRE, AffectEnum.ACTION> TakingOnTasksPlan;

}

