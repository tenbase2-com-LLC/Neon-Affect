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
public capability WarinessAffectCapability extends Capability {
    #uses plan CockHeadPlan;
    #uses plan SquintingWarinessPlan;
    #uses plan PurseLipsPlan;
    #uses plan HoldingUpHandsPlan;
    #uses plan SpeakingSmoothlyPlan;
    #uses plan BackingAwayPlan;
    #uses plan GoodPosturePlan;
    #uses plan ListeningForSomethingPlan;
    #uses plan LiftingChinPlan;
    #uses plan AwarenessOfFuturePlan;
    #uses plan AskingQuestionsWarinessPlan;
    #uses plan TenseVoicePlan;
    #uses plan HesitationPlan;
    #uses plan BitingLipPlan;
    #uses plan SpeakingCarefulWordsPlan;
    #uses plan UnableToRelaxPlan;
    #uses plan SeriousExpressionPlan;
    #uses plan BreathingStoppingAbruptlyPlan;
    #uses plan SomethingNotRightPlan;
    #uses plan TrustingGutFeelingsPlan;
    #uses plan HeightenedSensesWarinessPlan;
    #uses plan DefensiveWarinessPlan;
    #uses plan MakeSenseSituationThoughtsRacingPlan;
    #uses plan ConfusionPlan;
    #uses plan CommittmentIssuesPlan;
    #uses plan SetPlanContextWarinessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
