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
public capability TimidAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextTimidPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.VERBAL> AgreeingQuicklyTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.VERBAL> ApologizingTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.VERBAL> AskPermissionTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.VERBAL> DownplayOwnOpinionsPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.VERBAL> HesitationSpeechTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.VERBAL> LimitedSelfExpressionPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.VERBAL> SpeakSoflyTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.VERBAL> StutteringTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.VERBAL> UseOfUncertainPhrasesPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.VERBAL> UsingQualifiersTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.NONVERBAL> ArmsCrossedTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.NONVERBAL> AvoidingEyeContactTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.NONVERBAL> BadPostureTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.NONVERBAL> BlushingTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.NONVERBAL> FidgetingTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.NONVERBAL> LoweringHeadTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.NONVERBAL> MaintainPhysicalDistanceTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.NONVERBAL> NervousSmileTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.NONVERBAL> ShrinkingAwayFromAttentionTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.NONVERBAL> SmilingTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.ACTION> AvoidingAttentionTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.ACTION> AvoidingNewExperiencesTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.ACTION> GivingUpEasilyTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.ACTION> HesitationTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.ACTION> NegativeThinkingTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.ACTION> OverthinkingSocialSituationsTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.ACTION> PreferringFamiliarityTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.ACTION> SecondGuessingTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.ACTION> SeekingApprovalTimidPlan;
    #uses BehaviorPlan<AffectEnum.TIMID, AffectEnum.ACTION> SeekingReassuranceTimidPlan;

}

