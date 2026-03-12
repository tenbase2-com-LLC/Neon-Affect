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
public capability ConfusionAffectCapability extends Capability {
    #uses plan DifficultyCompletingTaskPlan;
    #uses plan FumblingPlan;
    #uses plan SayingUmPlan;
    #uses plan GrimaceConfusionPlan;
    #uses plan ExcessiveSwallowingFlusteredPlan;
    #uses plan RepeatAsQuestionPlan;
    #uses plan ScatchCheekPlan;
    #uses plan ShrugConfusionPlan;
    #uses plan InarticulateConfusionPlan;
    #uses plan BadPostureConfusionPlan;
    #uses plan HeadFlitchingBackPlan;
    #uses plan LipBitingPlan;
    #uses plan RubForeheadPlan;
    #uses plan AskQuestionsConfusionPlan;
    #uses plan RapidBlinkingConfusionPlan;
    #uses plan TalkAroundSituationPlan;
    #uses plan MindRacingConfusionPlan;
    #uses plan FlightResponsesPlan;
    #uses plan LackOfProductivitiyPlan;
    #uses plan TarnishedImagePlan;
    #uses plan BreakingPromisesPlan;
    #uses plan SetPlanContextConfusionPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
