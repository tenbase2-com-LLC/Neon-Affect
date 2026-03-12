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
public capability ExcitedAffectCapability extends Capability {
    #uses plan AskQuestionsExcitedPlan;
    #uses plan CreativityExcitedPlan;
    #uses plan DecisionMakingExcitedPlan;
    #uses plan DetailedDescriptionsPlan;
    #uses plan DifficultySittingStillPlan;
    #uses plan EagernessToPlanPlan;
    #uses plan EyesWideOpenExcitedPlan;
    #uses plan FidgetingExcitedPlan;
    #uses plan FlushedFaceExcitedPlan;
    #uses plan FocusedExcitedPlan;
    #uses plan FrequentExclamationsPlan;
    #uses plan HeightenedAwarenessExcitedPlan;
    #uses plan HighPitchedVoiceExcitedPlan;
    #uses plan ImpatienceExcitedPlan;
    #uses plan IntensifiedCuriosityPlan;
    #uses plan InterruptingExcitedPlan;
    #uses plan LaughingSuddenlyPlan;
    #uses plan OverestimatingAbilitiesExcitedPlan;
    #uses plan QuickToActionPlan;
    #uses plan RaiseEyebrowsExcitedPlan;
    #uses plan RepetitiveSpeechExcitePlan;
    #uses plan SmilingExcitedPlan;
    #uses plan SpeakingLoudlyExcitedPlan;
    #uses plan SpeakingQuicklyExcitedPlan;
    #uses plan UsingVividLanguagePlan;
    #uses plan SetPlanContextExcitedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
