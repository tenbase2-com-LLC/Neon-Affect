/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
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
    #uses plan LoweredShouldersPlan;
    #uses plan ArmsAtSidePlan;
    #uses plan ShuggingPlan;
    #uses plan LongPauseBeforeRespondingPlan;
    #uses plan BlankStarePlan;
    #uses plan HandsInPocketsIndifferencePlan;
    #uses plan LookAwayPlan;
    #uses plan SpeakingFlatVoicePlan;
    #uses plan SmilingPolitelyPlan;
    #uses plan WanderingGazePlan;
    #uses plan CloseEyesIndifferencePlan;
    #uses plan NotAnsweringQuestionsPlan;
    #uses plan SpeakingWhenSpokenTooPlan;
    #uses plan NotRespondingToPersonalJokePlan;
    #uses plan RelaxedPosturePlan;
    #uses plan WhateverResponsePlan;
    #uses plan ChangingTopicPlan;
    #uses plan SlowEvenBreathsPlan;
    #uses plan WanderingThoughtsPlan;
    #uses plan DisconnectWithLifeIndifferencePlan;
    #uses plan FadingEmpathyPlan;
    #uses plan DoingRoutinePlan;
    #uses plan IgnoringOthersPlan;
    #uses plan NoddingAlongPlan;
    #uses plan ExcuseToLeavePlan;
    #uses plan SetPlanContextIndifferencePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
