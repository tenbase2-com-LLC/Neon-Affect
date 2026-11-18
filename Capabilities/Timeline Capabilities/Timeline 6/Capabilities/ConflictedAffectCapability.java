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
public capability ConflictedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextConflictedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.VERBAL> ApologizingConflictedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.VERBAL> AskingQuestionsConflictedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.VERBAL> CondescendingTonePlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.VERBAL> RequestTimeToThinkPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.VERBAL> SelfInterruptedSpeechPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.VERBAL> SimilarSituationsTalkPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.VERBAL> StugglingSpeechPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.VERBAL> VerbalizeInnerConflictPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.VERBAL> VoicingSurprisePlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.VERBAL> WeighingProsConsPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.NONVERBAL> CancellingGesturesPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.NONVERBAL> DeepBreathConflictedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.NONVERBAL> DelayedReactionConflictedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.NONVERBAL> GrimaceConflictedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.NONVERBAL> LessAnimatedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.NONVERBAL> OpeningClosingMouthPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.NONVERBAL> RestlessStancePlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.NONVERBAL> ScratchingNeckCheekPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.NONVERBAL> ShakingHeadConflictedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.NONVERBAL> SmoothingClothesConflictedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.ACTION> IndecisivenessConflictedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.ACTION> LackOfConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.ACTION> MindRacingConflictedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.ACTION> OverthinkingConflictedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.ACTION> ReassuranceFromOthersConflictedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.ACTION> RethinkingPastDecisionConflictedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.ACTION> SecondGuessingConflictedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.ACTION> SeekingAlternativePerspectivesConflictedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.ACTION> SeekingApprovalConflictedPlan;
    #uses BehaviorPlan<AffectEnum.CONFLICTED, AffectEnum.ACTION> WeighingOptionsConflictedPlan;

}

