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
public capability VengefulAffectCapability extends Capability {
    #uses plan StiffPosturePlan;
    #uses plan IntenseGazePlan;
    #uses plan TensionInJawPlan;
    #uses plan HoldingChinUpPlan;
    #uses plan HoldingFullBreathPlan;
    #uses plan BidingTimePlan;
    #uses plan LyingEasilyConvicinglyPlan;
    #uses plan ReadingIntoSayDoPlan;
    #uses plan SmirkVengefulPlan;
    #uses plan RarelyApologizingPlan;
    #uses plan AnsweringQuestionsIndirectlyPlan;
    #uses plan HoldingBackInformationPlan;
    #uses plan InvadingPersonalSpacePlan;
    #uses plan StrongGesturePlan;
    #uses plan EncouragingSelfDoubtPlan;
    #uses plan VerballyAttackPlan;
    #uses plan NarrowEyesPlan;
    #uses plan ObsessingPlan;
    #uses plan RelivingWrongfulEventsPlan;
    #uses plan FantasizingGettingEvenPlan;
    #uses plan NormalRoutineAmissPlan;
    #uses plan PatienceForRightMomentPlan;
    #uses plan SetPlanContextVengefulPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();

}
