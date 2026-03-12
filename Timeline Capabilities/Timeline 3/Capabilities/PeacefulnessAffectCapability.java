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
public capability PeacefulnessAffectCapability extends Capability {
    #uses plan RelaxedPosturePeacefulnessPlan;
    #uses plan SmilingPeacefulnessPlan;
    #uses plan NoddingPeacefulnessPlan;
    #uses plan LeanBackPeacefulnessPlan;
    #uses plan DeepBreathPeacefulnessPlan;
    #uses plan UnforcedLaughPlan;
    #uses plan WhistlingHummingPeacefulnessPlan;
    #uses plan BeingHonestPeacefulnessPlan;
    #uses plan SparklingEyesPlan;
    #uses plan EnjoyingMomentPlan;
    #uses plan HalfClosedEyesPlan;
    #uses plan SighPlan;
    #uses plan UnhurriedSpeechPlan;
    #uses plan MeaningfullConversationPlan;
    #uses plan IncludeSelfPlan;
    #uses plan ListeningToOthersPlan;
    #uses plan AvoidingMoodKillersPlan;
    #uses plan SetPlanContextPeacefulnessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
