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
public capability ConcentratingAffectCapability extends Capability {
    #uses plan AnalyzingDetailsPlan;
    #uses plan ArticulatingThoughtsCarefullyPlan;
    #uses plan AskQuestionsConcentratingPlan;
    #uses plan BreathingStoppedBrieflyPlan;
    #uses plan BlinkingSlowlyConcentratingPlan;
    #uses plan DelayedResponseConcentratingPlan;
    #uses plan FocusedAttentionPlan;
    #uses plan FocusingOnTasksConcentratingPlan;
    #uses plan IgnoringDisruptionsConcentratingPlan;
    #uses plan IgnoringSurroundingsPlan;
    #uses plan LimitingConversationPlan;
    #uses plan LipBitingConcentrationPlan;
    #uses plan MentallyOrganzingThoughtsPlan;
    #uses plan MinimizingUnnecessaryTalkPlan;
    #uses plan MutteringCalculationsPlan;
    #uses plan ProcessingInformationDeeplyPlan;
    #uses plan RepeatToSelfPlan;
    #uses plan RequestingQuietPlan;
    #uses plan SlowBodyMovementsConcentratingPlan;
    #uses plan SpeakSlowlyConcentratingPlan;
    #uses plan SquintEyesConcentratingPlan;
    #uses plan StaringConcentratingPlan;
    #uses plan TiltHeadConcentratingPlan;
    #uses plan UsingFocusedLanguagePlan;
    #uses plan VerbalizingStepsPlan;
    #uses plan VisualizingProblemsPlan;
    #uses plan SetPlanContextConcentratingPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
