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
public capability AggressiveAffectCapability extends Capability {
    #uses plan ActingTerritorialyPlan;
    #uses plan ClenchedTeethAggressivePlan;
    #uses plan DominatingOthersPlan;
    #uses plan EscalatingConflictsPlan;
    #uses plan ExpressingAngerPlan;
    #uses plan EyesIntensePlan;
    #uses plan IgnoringOthersAggressivePlan;
    #uses plan InsultAggressivePlan;
    #uses plan InterpretingSituationsHostileyPlan;
    #uses plan InterruptingAggressivePlan;
    #uses plan IssuingUltimatumsPlan;
    #uses plan MakeFistAggressivePlan;
    #uses plan MakingDemandsAggressivePlan;
    #uses plan PointingFingerAccusatoryPlan;
    #uses plan ReactingImpulsivelyPlan;
    #uses plan RefusingToCompromiseAggressivePlan;
    #uses plan RetaliationPlan;
    #uses plan SeekingConfrontationPlan;
    #uses plan ShoutingAggressivePlan;
    #uses plan SpeakingLoudlyAggressivePlan;
    #uses plan StiffPostureAggressivePlan;
    #uses plan SwearingAggressivePlan;
    #uses plan UsingConfrontationalToneAggressivePlan;
    #uses plan UsingThreateningLanguagePlan;
    #uses plan SetPlanContextAggressivePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
