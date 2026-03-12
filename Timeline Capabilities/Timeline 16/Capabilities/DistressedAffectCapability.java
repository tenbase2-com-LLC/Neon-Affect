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
public capability DistressedAffectCapability extends Capability {
    #uses plan AskForHelpDistressedPlan;
    #uses plan AvoidingPanicSituationsDistressedPlan;
    #uses plan ConfusionDistressedPlan;
    #uses plan CoveringFaceDistressedPlan;
    #uses plan EasilyOverwhelmedPlan;
    #uses plan ExpressingFeelingsPlan;
    #uses plan EyesWideningDistressedPlan;
    #uses plan FidgetingDistressedPlan;
    #uses plan MakingSoundsPlan;
    #uses plan NeglectingSelfPlan;
    #uses plan OverthinkingProblemsPlan;
    #uses plan PessimisticThoughtsDistressedPlan;
    #uses plan PleadingForSupportPlan;
    #uses plan RapidBreathingDistressedPlan;
    #uses plan RepeatingNegativesDistressedPlan;
    #uses plan RepeatThoughtsPlan;
    #uses plan SeekingReassurancePlan;
    #uses plan SpeakingQuicklyDistressedPlan;
    #uses plan StiffPostureDistressedPlan;
    #uses plan StutteringDistressePlan;
    #uses plan TremblingBodyDistressedPlan;
    #uses plan UsingPanicWordsPlan;
    #uses plan VocalizingAnxietyPlan;
    #uses plan VoicingWorryPlan;
    #uses plan SetPlanContextDistressedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
