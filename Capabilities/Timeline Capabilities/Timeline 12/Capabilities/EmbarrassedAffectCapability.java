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
public capability EmbarrassedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextEmbarrassedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.VERBAL> AdmittingMistakesPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.VERBAL> ApologizingEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.VERBAL> DownplaySituationPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.VERBAL> LaughterEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.VERBAL> MakingExcusesEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.VERBAL> QuietVoiceEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.VERBAL> RedirectingConversationPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.VERBAL> SelfDeprecatingHumorPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.VERBAL> SpeakingQuicklyEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.VERBAL> StutteringEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.NONVERBAL> ArmsCrossedEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.NONVERBAL> AvoidingEyeContactEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.NONVERBAL> BlinkingRapidlyEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.NONVERBAL> BlushingEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.NONVERBAL> CoveringFaceEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.NONVERBAL> CrossingArmsEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.NONVERBAL> FidgetingEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.NONVERBAL> LickingLipsEmbarrassedlPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.NONVERBAL> PlayingWithHairPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.NONVERBAL> SweatingPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.ACTION> AvoidingAttentionEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.ACTION> BecomingBusyPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.ACTION> DistractedEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.ACTION> DivertingAttentionEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.ACTION> DwellingOnEmbarrassmentEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.ACTION> ExitBirefllyPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.ACTION> MakeBestSituationEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.ACTION> OfferRefreshmentPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.ACTION> OverthinkingSocialSituationsEmbarrassedPlan;
    #uses BehaviorPlan<AffectEnum.EMBARRASSED, AffectEnum.ACTION> SeekingReassuranceEmbarrassedPlan;

}

