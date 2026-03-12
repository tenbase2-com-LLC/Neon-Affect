/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
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
    #uses plan GauntAppearancePlan;
    #uses plan BlinkingInfrequentlyPlan;
    #uses plan RedEyesPlan;
    #uses plan NoiseInsensitivityPlan;
    #uses plan BadPostureDepressedPlan;
    #uses plan MakingExcusesDepressedPlan;
    #uses plan PoorCommunicationDepressedPlan;
    #uses plan PreferBeingAlonePlan;
    #uses plan ForgettingDepressedPlan;
    #uses plan FatiguedDepressedPlan;
    #uses plan ShallowBreathingPlan;
    #uses plan UnmotivatedPlan;
    #uses plan NegativeSelfImagePlan;
    #uses plan PoorObservationPlan;
    #uses plan PessimisticDepressedPlan;
    #uses plan InabilityConcentrateDepressedPlan;
    #uses plan LosingTrackOfTimeDepressedPlan;
    #uses plan AvoidingStressfulSituationsPlan;
    #uses plan SetPlanContextDepressedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
