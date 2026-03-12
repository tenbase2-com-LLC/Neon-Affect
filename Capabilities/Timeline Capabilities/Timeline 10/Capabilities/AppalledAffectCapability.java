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
public capability AppalledAffectCapability extends Capability {
    #uses plan FlinchingAppalledPlan;
    #uses plan LipSnarlPlan;
    #uses plan DeepBreathAppalledPlan;
    #uses plan MouthOpenAppalledPlan;
    #uses plan EyesWideOpenPlan;
    #uses plan LookAwayAppalledPlan;
    #uses plan SwallowingBeforeSpeakingPlan;
    #uses plan ShockedSpeech;
    #uses plan InarticulateAppalledPlan;
    #uses plan LoudSpeechPlan;
    #uses plan WildGesturesPlan;
    #uses plan DryMouthPlan;
    #uses plan DizzinessAppalledPlan;
    #uses plan ReplayingExperiencePlan;
    #uses plan FocusedPlan;
    #uses plan BlamePlan;
    #uses plan NeedForAnswersPlan;
    #uses plan TearingUpAppalledPlan;
    #uses plan NotRespondingAppalledPlan;
    #uses plan NeedToEscapePlan;
    #uses plan SetPlanContextAppalledPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
