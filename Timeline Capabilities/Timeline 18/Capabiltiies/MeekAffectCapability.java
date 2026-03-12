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
public capability MeekAffectCapability extends Capability {
    #uses plan AgreeingQuicklyPlan;
    #uses plan ApologizingMeekPlan;
    #uses plan AvoidingConflictMeekPlan;
    #uses plan AvoidingConfrontationsMeekPlan;
    #uses plan AvoidingEyeContactMeekPlan;
    #uses plan AvoidingLeadershipPlan;
    #uses plan BadPostureMeekPlan;
    #uses plan BlushingFaceMeekPlan;
    #uses plan DeferringToOthersOpinionsPlan;
    #uses plan DifficultySettingBoundariesPlan;
    #uses plan DownplayingOwnEmotionsPlan;
    #uses plan HesitateToAskHelpMeekPlan;
    #uses plan HesitatingToTakeInitiativeMeekPlan;
    #uses plan HesitationSpeechMeekPlan;
    #uses plan LoweringHeadMeekPlan;
    #uses plan MinimizingOwnAchievementsPlan;
    #uses plan PuttingOthersNeedsFirstPlan;
    #uses plan SecondGuessingMeekPlan;
    #uses plan SeekingApprovalMeekPlan;
    #uses plan SelfDeprecatingRemarksMeekPlan;
    #uses plan SmilingMeekPlan;
    #uses plan SpeakSoflyMeekPlan;
    #uses plan UsingQualifiersMeekPlan;
    #uses plan SetPlanContextMeekPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
