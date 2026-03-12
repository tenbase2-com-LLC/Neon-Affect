/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
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
public capability TroubledAffectCapability extends Capability {
    #uses plan AskQuestionsTroubledPlan;
    #uses plan BitingLipTroubledPlan;
    #uses plan ConcernVocalizationsPlan;
    #uses plan DistractedTroubledPlan;
    #uses plan FurrowedBrowPlan;
    #uses plan HeightenedAwarenessTroubledPlan;
    #uses plan IndecisivenessTroubledPlan;
    #uses plan IndecisiveResponsesPlan;
    #uses plan LaughterTroubledPlan;
    #uses plan LookAwayTroubledPlan;
    #uses plan LowVoiceTroubledPlan;
    #uses plan NegativeThoughtsTroubledPlan;
    #uses plan NervousSmileTroubledPlan;
    #uses plan OverthinkingTroubledPlan;
    #uses plan ProcrastinationTroubledPlan;
    #uses plan SeekingPleasureTroubledPlan;
    #uses plan SeekingReassuranceTroubledPlan;
    #uses plan SelfNegativeThoughtTroubledPlan;
    #uses plan ShiftWeightTroubledPlan;
    #uses plan SighTroubledPlan;
    #uses plan TentativeExpressionsPlan;
    #uses plan UncertainSpeechPatternsPlan;
    #uses plan SetPlanContextTroubledPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
