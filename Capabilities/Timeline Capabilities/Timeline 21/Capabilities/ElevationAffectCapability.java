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
public capability ElevationAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextElevationPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.VERBAL> ExpressingCommitmentElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.VERBAL> ExpressingRespectElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.VERBAL> ExpressingWondermentElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.VERBAL> GivingPraiseElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.VERBAL> InabilityFindWordsElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.VERBAL> SharingFeelingsElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.VERBAL> SpeakToInspireElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.VERBAL> SpeakingHighlyOthersElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.VERBAL> ThoughtfulResponsesElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.VERBAL> VoiceChokedWithTearsElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.NONVERBAL> ApplaudingElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.NONVERBAL> ChokedUpElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.NONVERBAL> DeepBreathsElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.NONVERBAL> EyesGlisteningElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.NONVERBAL> HeadHeldHighElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.NONVERBAL> MeaningfulEyeContactElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.NONVERBAL> MouthOpenElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.NONVERBAL> PlacingHandOverHeartElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.NONVERBAL> RemainingStillElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.NONVERBAL> SmilingElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.ACTION> ContemplatingOnesPlaceElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.ACTION> DrawingInspirationElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.ACTION> ImitationElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.ACTION> IncreasedGenerosityElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.ACTION> InitiatingRandomActsOfKindnessElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.ACTION> LeadByExampleElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.ACTION> MoreWillingToHelpOthersElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.ACTION> PerformActsOfKindnessElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.ACTION> SenseOfConnectionElevationPlan;
    #uses BehaviorPlan<AffectEnum.ELEVATION, AffectEnum.ACTION> TakingTimeForReflectionElevationPlan;

}

