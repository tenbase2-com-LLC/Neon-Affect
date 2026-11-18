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
public capability TroubledAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextTroubledPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.VERBAL> AskQuestionsTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.VERBAL> ConcernVocalizationsPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.VERBAL> IndecisiveResponsesPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.VERBAL> LaughterTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.VERBAL> LowVoiceTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.VERBAL> SeekingReassuranceTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.VERBAL> TentativeExpressionsPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.VERBAL> UncertainSpeechPatternsPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.VERBAL> VerbalizeInnerConflictTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.VERBAL> WeighingProsConsTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.NONVERBAL> BitingLipTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.NONVERBAL> FurrowedBrowPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.NONVERBAL> HeadShakingTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.NONVERBAL> LookAwayTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.NONVERBAL> NervousSmileTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.NONVERBAL> PainedGazeTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.NONVERBAL> RubbingFaceTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.NONVERBAL> ShiftWeightTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.NONVERBAL> SighTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.NONVERBAL> SmoothingClothesTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.ACTION> DistractedTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.ACTION> HeightenedAwarenessTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.ACTION> IndecisivenessTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.ACTION> NegativeThoughtsTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.ACTION> OveranalyzingTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.ACTION> OverthinkingTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.ACTION> ProcrastinationTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.ACTION> SeekingComfortTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.ACTION> SeekingPleasureTroubledPlan;
    #uses BehaviorPlan<AffectEnum.TROUBLED, AffectEnum.ACTION> SelfNegativeThoughtTroubledPlan;

}

