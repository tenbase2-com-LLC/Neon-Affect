/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
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
public capability SmugnessAffectCapability extends Capability {
    #uses plan GrinSmugnessPlan;
    #uses plan ArmsCrossedSmugnessPlan;
    #uses plan RaisedEyebrowsPlan;
    #uses plan TiltHeadSmugnessPlan;
    #uses plan SmirkPlan;
    #uses plan DirectEyeContactSmugnessPlan;
    #uses plan RollingEyesPlan;
    #uses plan InsultSmugnessPlan;
    #uses plan SighSmugnessPlan;
    #uses plan WavingHandPlan;
    #uses plan LeaningInSmugnessPlan;
    #uses plan CommandingConversationPlan;
    #uses plan SarcasmSmugnessPlan;
    #uses plan SuperiorityLookPlan;
    #uses plan GoodPostureSmugnessPlan;
    #uses plan ConfidentVoicePlan;
    #uses plan ExaggeratedMovementsPlan;
    #uses plan CriticizePlan;
    #uses plan CondescendingSmugnessPlan;
    #uses plan InterestedPosePlan;
    #uses plan AccomplishmentPlan;
    #uses plan ArguingSmugnessPlan;
    #uses plan ArroganceSmugnessPlan;
    #uses plan SetPlanContextSmugnessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
