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
public capability ConfusionAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextConfusionPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.VERBAL> AskQuestionsConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.VERBAL> AskingClarificationConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.VERBAL> BreakingPromisesPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.VERBAL> FlightResponsesPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.VERBAL> InarticulateConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.VERBAL> RepeatAsQuestionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.VERBAL> RephraseToUnderstandConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.VERBAL> SayingUmPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.VERBAL> TalkAroundSituationPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.VERBAL> UsingFillerWordsConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.NONVERBAL> BadPostureConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.NONVERBAL> ExcessiveSwallowingFlusteredPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.NONVERBAL> FumblingPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.NONVERBAL> GrimaceConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.NONVERBAL> HeadFlitchingBackPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.NONVERBAL> LipBitingPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.NONVERBAL> RapidBlinkingConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.NONVERBAL> RubForeheadPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.NONVERBAL> ScatchCheekPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.NONVERBAL> ShrugConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.ACTION> BreakingDownConceptsConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.ACTION> DifficultyCompletingTaskPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.ACTION> DisorientatedConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.ACTION> IndecisivenessConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.ACTION> JumbledThoughtsConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.ACTION> LackOfProductivitiyPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.ACTION> MindRacingConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.ACTION> RelyingOnOthersConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.ACTION> SeekingMoreInformationConfusionPlan;
    #uses BehaviorPlan<AffectEnum.CONFUSION, AffectEnum.ACTION> TarnishedImagePlan;

}

