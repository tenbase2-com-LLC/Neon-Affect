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
public capability JealousyAffectCapability extends Capability {
    #uses plan SullenLookPlan;
    #uses plan QuickMovementsPlan;
    #uses plan PursingLipsPlan;
    #uses plan CrossingArmsJealousyPlan;
    #uses plan ClenchTeethPlan;
    #uses plan MutteringPlan;
    #uses plan UglyLaughterPlan;
    #uses plan ShoutingInsultsPlan;
    #uses plan FlushedFaceJealousyPlan;
    #uses plan OneUpPlan;
    #uses plan CriticizeJealousyPlan;
    #uses plan SwearingJealousyPlan;
    #uses plan ShowingOffPlan;
    #uses plan RudenessJealousyPlan;
    #uses plan RiskTakingJealousyPlan;
    #uses plan GloatingPlan;
    #uses plan FasterBreathsPlan;
    #uses plan RashDecisionMakingPlan;
    #uses plan FocusingOnNegativePlan;
    #uses plan ComparingOthersToRivalPlan;
    #uses plan SelfDoubtPlan;
    #uses plan PickFightJealousyPlan;
    #uses plan DishonestyWithSelfPlan;
    #uses plan SchemingAgainstRivalPlan;
    #uses plan SetPlanContextJealousyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
