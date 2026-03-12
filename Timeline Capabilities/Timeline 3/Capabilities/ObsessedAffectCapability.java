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
public capability ObsessedAffectCapability extends Capability {
    #uses plan AttentiveListeningPlan;
    #uses plan RisingPitchVoicePlan;
    #uses plan IntenseGazeObsessedPlan;
    #uses plan OvertakingConversationPlan;
    #uses plan LongStaringPlan;
    #uses plan TalkLooselyPlan;
    #uses plan AngryWhenBelittledPlan;
    #uses plan DistractedPlan;
    #uses plan SteadfastnessPlan;
    #uses plan FantasizingPlan;
    #uses plan MoodSwingsPlan;
    #uses plan FatiguedObsessedPlan;
    #uses plan InabilityToFunctionPlan;
    #uses plan BecomingIsolatedPlan;
    #uses plan ObsessiveCompulsivePlan;
    #uses plan LossOfSelfPlan;
    #uses plan LossSensationEmotionsPlan;
    #uses plan AngryWhenConfrontedPlan;
    #uses plan SetPlanContextObsessedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
