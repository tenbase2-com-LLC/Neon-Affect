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
public capability BoredAffectCapability extends Capability {
    #uses plan BadPostureBoredPlan;
    #uses plan CalculatingTimeRemainingPlan;
    #uses plan ChangeSubjectBoredPlan;
    #uses plan ComplainBoredPlan;
    #uses plan DecliningParticipationPlan;
    #uses plan FidgetingBoredPlan;
    #uses plan InterruptingBoredPlan;
    #uses plan IrrelevamtntComversationtPlan;
    #uses plan PlanningFutureActivitiesPlan;
    #uses plan ProcrastinationBoredPlan;
    #uses plan RepetitiveGesturesPlan;
    #uses plan ReplayingPastEventsBoredPlan;
    #uses plan RollingEyesBoredPlan;
    #uses plan SarcasmBoredPlan;
    #uses plan ShortResponsesBoredPlan;
    #uses plan SighBoredPlan;
    #uses plan SpeakingFlatVoiceBoredPlan;
    #uses plan SpeakingMatterOfFactBoredPlan;
    #uses plan StaringBoredPlan;
    #uses plan YawningBoredPlan;
    #uses plan SetPlanContextBoredPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
