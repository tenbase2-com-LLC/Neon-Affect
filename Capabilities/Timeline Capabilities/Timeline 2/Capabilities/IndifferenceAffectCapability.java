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
public capability IndifferenceAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextIndifferencePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.VERBAL> ChangingTopicPlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.VERBAL> ExcuseToLeavePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.VERBAL> LongPauseBeforeRespondingPlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.VERBAL> NotAnsweringQuestionsPlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.VERBAL> NotRespondingToPersonalJokePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.VERBAL> OneWordAnswerIndifferencePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.VERBAL> SpeakingFlatVoicePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.VERBAL> SpeakingWhenSpokenTooPlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.VERBAL> UnemotionallyAgreeIndifferencePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.VERBAL> WhateverResponsePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.NONVERBAL> ArmsAtSidePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.NONVERBAL> BlankStarePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.NONVERBAL> CloseEyesIndifferencePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.NONVERBAL> HandsInPocketsIndifferencePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.NONVERBAL> LookAwayPlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.NONVERBAL> LoweredShouldersPlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.NONVERBAL> NoddingAlongPlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.NONVERBAL> RelaxedPosturePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.NONVERBAL> ShuggingPlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.NONVERBAL> SlowEvenBreathsPlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.NONVERBAL> SmilingPolitelyPlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.NONVERBAL> WanderingGazePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.ACTION> ApatheticIndifferencePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.ACTION> DecliningParticipationIndifferencePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.ACTION> DisconnectWithLifeIndifferencePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.ACTION> DoingRoutinePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.ACTION> FadingEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.ACTION> IgnoringOthersPlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.ACTION> LackOfInitiativeIndifferencePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.ACTION> LossOfInterestIndifferencePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.ACTION> PassiveAgreementIndifferencePlan;
    #uses BehaviorPlan<AffectEnum.INDIFFERENCE, AffectEnum.ACTION> WanderingThoughtsPlan;

}

