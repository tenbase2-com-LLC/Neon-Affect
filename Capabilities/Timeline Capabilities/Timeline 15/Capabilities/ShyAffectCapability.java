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
public capability ShyAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextShyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.VERBAL> ApologizingShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.VERBAL> DeflectingQuestionsShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.VERBAL> HesitationSpeechShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.VERBAL> MumblingShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.VERBAL> QuietVoiceShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.VERBAL> SelfDeprecatingHumorShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.VERBAL> ShortResponsesShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.VERBAL> SpeakSoftlyShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.VERBAL> SpeakingWithUncertaintyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.VERBAL> StutteringShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.NONVERBAL> ArmsCrossedShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.NONVERBAL> AvoidingEyeContactShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.NONVERBAL> BadPostureShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.NONVERBAL> BlinkingShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.NONVERBAL> BlushingShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.NONVERBAL> FidgetingShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.NONVERBAL> LookDownShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.NONVERBAL> LoweringHeadShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.NONVERBAL> NervousSmileShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.NONVERBAL> StayBackgrouindShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.ACTION> AvoidingAttentionPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.ACTION> AvoidingChallengesShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.ACTION> AvoidingConversationsPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.ACTION> BeingIndecisivePlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.ACTION> DoubtingAbilitiesShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.ACTION> DwellingOnEmbarrassmentPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.ACTION> FearingRejectionPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.ACTION> HesitateAskForHelpPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.ACTION> OverthinkingShyPlan;
    #uses BehaviorPlan<AffectEnum.SHY, AffectEnum.ACTION> PreferenceAloneShyPlan;

}

