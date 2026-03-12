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
public capability ContemptAffectCapability extends Capability {
    #uses plan ArmsCrossedContemptPlan;
    #uses plan DownturnedMouthPlan;
    #uses plan SneeringContemptPlan;
    #uses plan ShakingHeadContemptPlan;
    #uses plan MockingPlan;
    #uses plan RollingEyesContemptPlan;
    #uses plan SarcasmContemptPlan;
    #uses plan GossipingContemptPlan;
    #uses plan BlowingRaspberryPlan;
    #uses plan AlteredBodyAnglePlan;
    #uses plan WavingHandContemptPlan;
    #uses plan GoodPostureContemptPlan;
    #uses plan NoResponseContemptPlan;
    #uses plan LookDownContemptPlan;
    #uses plan SmrkingComteptPlan;
    #uses plan LaughterContemptPlan;
    #uses plan JokingContemptPlan;
    #uses plan HardTonePlan;
    #uses plan NegativeThinkingContemptPlan;
    #uses plan ArguingContemptPlan;
    #uses plan LookAwayContemptPlan;
    #uses plan ChangeSubjectContemptPlan;
    #uses plan LeaningBackContemptPlan;
    #uses plan SetPlanContextContemptPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
