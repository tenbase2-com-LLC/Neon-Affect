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
public capability WorryAffectCapability extends Capability {
    #uses plan SilencePlan;
    #uses plan AskingQuestionsPlan;
    #uses plan RubbingHandsPantLegPlan;
    #uses plan PoorCommunicationPlan;
    #uses plan RubbingFacePlan;
    #uses plan DeepBreathesWorryPlan;
    #uses plan BadPostureWorryPlan;
    #uses plan SmoothingClothesPlan;
    #uses plan PainedGazePlan;
    #uses plan UncertainAboutPastPlan;
    #uses plan InabilityTpFocusWorryPlan;
    #uses plan NeedControlPlan;
    #uses plan RegretfulPlan;
    #uses plan DistancingOneselfPlan;
    #uses plan OveranalyzingPlan;
    #uses plan AssumingWorstScenarioPlan;
    #uses plan OverprotectingPlan;
    #uses plan IrritabilityWorryPlan;
    #uses plan AnxietyAttackPlan;
    #uses plan SetPlanContextWorryPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
