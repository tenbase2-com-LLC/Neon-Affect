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
public capability ConflictedAffectCapability extends Capability {
    #uses plan GrimaceConflictedPlan;
    #uses plan SelfInterruptedSpeechPlan;
    #uses plan ApologizingConflictedPlan;
    #uses plan OpeningClosingMouthPlan;
    #uses plan StugglingSpeechPlan;
    #uses plan ShakingHeadConflictedPlan;
    #uses plan CondescendingTonePlan;
    #uses plan ScratchingNeckCheekPlan;
    #uses plan LessAnimatedPlan;
    #uses plan AskingQuestionsConflictedPlan;
    #uses plan SimilarSituationsTalkPlan;
    #uses plan DeepBreathConflictedPlan;
    #uses plan RequestTimeToThinkPlan;
    #uses plan VoicingSurprisePlan;
    #uses plan RestlessStancePlan;
    #uses plan SmoothingClothesConflictedPlan;
    #uses plan CancellingGesturesPlan;
    #uses plan DelayedReactionConflictedPlan;
    #uses plan WeighingProsConsPlan;
    #uses plan VerbalizeInnerConflictPlan;
    #uses plan LackOfConfidencePlan;
    #uses plan SetPlanContextConflictedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
