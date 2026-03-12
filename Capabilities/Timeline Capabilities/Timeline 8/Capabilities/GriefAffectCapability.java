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
public capability GriefAffectCapability extends Capability {
    #uses plan WeakMovementsPlan;
    #uses plan SlackFacePlan;
    #uses plan LossOfBreathPlan;
    #uses plan LashingOutGriefPlan;
    #uses plan TremblingLipsPlan;
    #uses plan IsolationGriefPlan;
    #uses plan WeakVoiceSpeakingPlan;
    #uses plan LosingTrackConversationPlan;
    #uses plan WeakPostureGriefPlan;
    #uses plan CryingGriefPlan;
    #uses plan LosingTrackOfTimeGriefPlan;
    #uses plan NoiseSensitivityGriefPlan;
    #uses plan RedEyesGriefPlan;
    #uses plan CondescendingPlan;
    #uses plan LonelinessPlan;
    #uses plan LackOfMotivationPlan;
    #uses plan ParanoiaGriefPlan;
    #uses plan OverdoingItPlan;
    #uses plan SetPlanContextGriefPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
