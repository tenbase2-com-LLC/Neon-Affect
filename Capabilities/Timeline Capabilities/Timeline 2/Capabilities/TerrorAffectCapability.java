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
public capability TerrorAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextTerrorPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.VERBAL> AskForHelpTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.VERBAL> InabilityToSpeakTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.VERBAL> LowerVoiceToWhisperTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.VERBAL> PleadingTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.VERBAL> QuickChoppySentencesTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.VERBAL> ScreamingPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.VERBAL> SpeechlessnessIncoherencePlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.VERBAL> TalkToSelfTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.VERBAL> UncontrollableVoiceTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.VERBAL> VoiceTremorTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.NONVERBAL> CoveringFacePlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.NONVERBAL> CoweringTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.NONVERBAL> EyesWideningTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.NONVERBAL> FlinchingTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.NONVERBAL> HoldingOneselfTightlyPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.NONVERBAL> NotBlinkingPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.NONVERBAL> RigidBodyPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.NONVERBAL> SeeingSpotsPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.NONVERBAL> ShakingHeadTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.NONVERBAL> SqueezingEyesShutPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.ACTION> AvoidingPanicSituationsTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.ACTION> ClumsinessPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.ACTION> ConfusionTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.ACTION> DevelopingPhobiasTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.ACTION> ImpairedDecisionMakingPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.ACTION> NeedToEscapeTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.ACTION> RiskTakingTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.ACTION> SurrenderBreakingPointPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.ACTION> ThinkingIrrationallyTerrorPlan;
    #uses BehaviorPlan<AffectEnum.TERROR, AffectEnum.ACTION> WillingToDoAnythingTerrorPlan;

}

