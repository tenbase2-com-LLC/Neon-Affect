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
public capability DepressedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDepressedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.VERBAL> CryingDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.VERBAL> DelayedResponseDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.VERBAL> ExpressingHopelessnessDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.VERBAL> MakingExcusesDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.VERBAL> MonotoneVoiceDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.VERBAL> OneWordAnswerDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.VERBAL> PessimisticStatementsDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.VERBAL> PoorCommunicationDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.VERBAL> SelfNegativeTalkDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.VERBAL> SpeakingLessDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.NONVERBAL> AvoidingEyeContactDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.NONVERBAL> BadPostureDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.NONVERBAL> BlinkingInfrequentlyPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.NONVERBAL> DullEyesDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.NONVERBAL> EmptyStareDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.NONVERBAL> GauntAppearancePlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.NONVERBAL> RedEyesPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.NONVERBAL> ShallowBreathingPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.NONVERBAL> SighDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.NONVERBAL> TearingUpDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.ACTION> AvoidingStressfulSituationsPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.ACTION> FatiguedDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.ACTION> ForgettingDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.ACTION> InabilityConcentrateDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.ACTION> LosingTrackOfTimeDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.ACTION> NegativeSelfImagePlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.ACTION> NoiseInsensitivityPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.ACTION> PessimisticDepressedPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.ACTION> PoorObservationPlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.ACTION> PreferBeingAlonePlan;
    #uses BehaviorPlan<AffectEnum.DEPRESSED, AffectEnum.ACTION> UnmotivatedPlan;

}

