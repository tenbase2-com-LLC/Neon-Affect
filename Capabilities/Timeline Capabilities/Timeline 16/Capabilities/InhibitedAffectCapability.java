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
public capability InhibitedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextInhibitedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.VERBAL> AgreeingQuicklyInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.VERBAL> ApologizingInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.VERBAL> AvoidingPersonalTopicsPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.VERBAL> CuttingConversationShortPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.VERBAL> QuickResponsesImhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.VERBAL> SecondGuessingStatementsPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.VERBAL> SpeakSoftlyInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.VERBAL> StutteringInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.VERBAL> UsingPassiveLanguagePlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.VERBAL> UsingQualifiersPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.NONVERBAL> ArmsCrossedInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.NONVERBAL> AvoidingEyeContactInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.NONVERBAL> BadPostureInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.NONVERBAL> FidgetingInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.NONVERBAL> LoweringHeadInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.NONVERBAL> MaintainNeutralExpressionInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.NONVERBAL> MaintainPhysicalDistanceInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.NONVERBAL> NervousSmileInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.NONVERBAL> ShrinkingAwayFromAttentionInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.NONVERBAL> StiffPostureImhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.ACTION> ConformingInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.ACTION> HesitatiingToTakeInitiativePlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.ACTION> NegativeThinkingInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.ACTION> OverthinkingInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.ACTION> PerformingRoutinesPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.ACTION> PreferringFamiliarityInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.ACTION> ResistingNewTasksPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.ACTION> SeekingApprovalInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.ACTION> SelfDoubtInhibitedPlan;
    #uses BehaviorPlan<AffectEnum.INHIBITED, AffectEnum.ACTION> WantingToBeAloneInihibitedPlan;

}

