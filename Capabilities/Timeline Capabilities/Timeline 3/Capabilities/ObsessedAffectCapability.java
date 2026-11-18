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
public capability ObsessedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextObsessedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.VERBAL> ConstantlyTalkingAboutObsessedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.VERBAL> DetailedDescriptionsObsessedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.VERBAL> DismissingOthersOpinionsObsessedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.VERBAL> MinimizingUnnecessaryTalkObsessedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.VERBAL> MutteringObsessedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.VERBAL> OvertakingConversationPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.VERBAL> RepeatToSelfObsessedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.VERBAL> RisingPitchVoicePlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.VERBAL> TalkLooselyPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.VERBAL> UnableThinkTalkAnythingElseObsessedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.NONVERBAL> AttentiveListeningPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.NONVERBAL> ClenchedJawObsessedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.NONVERBAL> DistractedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.NONVERBAL> FidgetingObsessedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.NONVERBAL> FurrowedBrowObsessedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.NONVERBAL> IntenseGazeObsessedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.NONVERBAL> LeanInObsessedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.NONVERBAL> LongStaringPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.NONVERBAL> RestlessnessObsessedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.NONVERBAL> SteadfastnessPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.ACTION> AngryWhenBelittledPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.ACTION> AngryWhenConfrontedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.ACTION> BecomingIsolatedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.ACTION> FantasizingPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.ACTION> FatiguedObsessedPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.ACTION> InabilityToFunctionPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.ACTION> LossOfSelfPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.ACTION> LossSensationEmotionsPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.ACTION> MoodSwingsPlan;
    #uses BehaviorPlan<AffectEnum.OBSESSED, AffectEnum.ACTION> ObsessiveCompulsivePlan;

}

