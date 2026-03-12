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
public capability RemorseAffectCapability extends Capability {
    #uses plan ApologizingRemorsePlan;
    #uses plan AskingTalkPlan;
    #uses plan HeadDownEyesLookingUpPlan;
    #uses plan TearingUpRemorsePlan;
    #uses plan HandCoveringMouthRemorsePlan;
    #uses plan SilenceRemorsePlan;
    #uses plan OfferingPromisePlan;
    #uses plan TellingTruthPlan;
    #uses plan QuickResponsesPlan;
    #uses plan HioldStomachPlan;
    #uses plan FrailtyPlan;
    #uses plan BadPostureRemorsePlan;
    #uses plan StaringAtFloorPlan;
    #uses plan BeggingForForgivenessPlan;
    #uses plan PleadingTonePlan;
    #uses plan ObediencePlan;
    #uses plan AskingForAdviceRemorsePlan;
    #uses plan RunnyNosePlan;
    #uses plan MentallyBeratingOneselfPlan;
    #uses plan DesireToFaceConsequencesPlan;
    #uses plan DeterminationRemorsePlan;
    #uses plan EmpathyRemorsePlan;
    #uses plan SetPlanContextRemorsePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
