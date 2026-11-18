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
public capability MeekAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextMeekPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.VERBAL> AgreeingQuicklyPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.VERBAL> ApologizingMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.VERBAL> AskPermissionMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.VERBAL> DeferringToOthersOpinionsPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.VERBAL> DownplayOwnOpinionsMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.VERBAL> HesitationSpeechMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.VERBAL> MinimizingOwnAchievementsPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.VERBAL> SelfDeprecatingRemarksMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.VERBAL> SpeakSoflyMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.VERBAL> UsingQualifiersMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.NONVERBAL> AvoidingEyeContactMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.NONVERBAL> BadPostureMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.NONVERBAL> BlushingFaceMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.NONVERBAL> FidgetingMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.NONVERBAL> LoweringHeadMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.NONVERBAL> NervousSmileMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.NONVERBAL> ShrinkingAwayFromAttentionMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.NONVERBAL> SlowNodMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.NONVERBAL> SmilingMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.NONVERBAL> StayBackgrouindMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.ACTION> AvoidingConflictMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.ACTION> AvoidingConfrontationsMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.ACTION> AvoidingLeadershipPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.ACTION> DifficultySettingBoundariesPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.ACTION> DownplayingOwnEmotionsPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.ACTION> HesitateToAskHelpMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.ACTION> HesitatingToTakeInitiativeMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.ACTION> PuttingOthersNeedsFirstPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.ACTION> SecondGuessingMeekPlan;
    #uses BehaviorPlan<AffectEnum.MEEK, AffectEnum.ACTION> SeekingApprovalMeekPlan;

}

