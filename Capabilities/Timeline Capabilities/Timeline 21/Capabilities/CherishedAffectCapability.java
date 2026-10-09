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
public capability CherishedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextCherishedPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.VERBAL> AppreciativeCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.VERBAL> ExpressingGratitudeCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.VERBAL> HumbleAcknowledgementsCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.VERBAL> MakingCommitmentsCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.VERBAL> SayILoveYouCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.VERBAL> SharingFeelingsCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.VERBAL> SharingSecretsCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.VERBAL> SincereThankYousCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.VERBAL> SpeakingWithTendernessCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.VERBAL> TremblingVoiceCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.NONVERBAL> BlushingCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.NONVERBAL> EasyBreathingCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.NONVERBAL> EyesGlisteningCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.NONVERBAL> HuggingCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.NONVERBAL> MeaningfulEyeContactCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.NONVERBAL> PlacingHandOverHeartCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.NONVERBAL> RelaxedMannerCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.NONVERBAL> SlowNodCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.NONVERBAL> SmilingNoReasonCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.NONVERBAL> StongEyeContactCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.ACTION> GratitudeCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.ACTION> IncreasedConfidenceCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.ACTION> KeepingPromisesCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.ACTION> MoodElevationCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.ACTION> SenseOfContentmentCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.ACTION> ShowingAffectionCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.ACTION> SurprisingWithAffectionCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.ACTION> TakingOnNewTasksCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.ACTION> ValueRecognitionCherishedPlan;
    #uses BehaviorPlan<AffectEnum.CHERISHED, AffectEnum.ACTION> WantingFeelingToLastCherishedPlan;

}

