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
public capability ShameAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextShamePlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.VERBAL> ApologizingShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.VERBAL> CuttingConversationShortShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.VERBAL> DefensiveShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.VERBAL> MakingExcusesShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.VERBAL> MentallyBeratingOneselfShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.VERBAL> MumblingShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.VERBAL> QuietVoiceShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.VERBAL> SelfDeprecatingRemarksShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.VERBAL> SelfNegativeTalkShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.VERBAL> WithdrawFromConversationShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.NONVERBAL> AvoidingEyeContactShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.NONVERBAL> BlushingShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.NONVERBAL> BodyCollapsingInwardHumilationShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.NONVERBAL> CoverFaceHandsShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.NONVERBAL> CrossingArmsShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.NONVERBAL> LoweringHeadShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.NONVERBAL> MaintainNeutralExpressionShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.NONVERBAL> ShrinkingAwayFromAttentionShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.NONVERBAL> StaringAtFloorShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.NONVERBAL> SweatingShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.ACTION> AvoidingAttentionShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.ACTION> DwellingOnEmbarrassmentShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.ACTION> ExitBirefllyShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.ACTION> NegativeSelfImageShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.ACTION> OverlyCriticalSelfShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.ACTION> RationalizingShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.ACTION> SeekingComfortShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.ACTION> SelfLoathingHumilationShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.ACTION> SetThingsRightShamePlan;
    #uses BehaviorPlan<AffectEnum.SHAME, AffectEnum.ACTION> WithdrawingFromOthersShamePlan;

}

