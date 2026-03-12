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
public capability EmpathyAffectCapability extends Capability {
    #uses plan AcknowlegdingOthersPainPlan;
    #uses plan AffirmingOthersFeelingsPlan;
    #uses plan AskQuestionsEmpathyPlan;
    #uses plan CommunicateUnderstandingPlan;
    #uses plan EyeContactEmpathyPlan;
    #uses plan FaceSoftPlan;
    #uses plan HelpfulnessEmpathyPlan;
    #uses plan LeaningInEmpathyPlan;
    #uses plan NoddingDuringSpeechEmpathy;
    #uses plan OfferingToHelpEmpathyPlan;
    #uses plan OpenBodyPostureEmpathyPlan;
    #uses plan ProvideUsefulInformationPlan;
    #uses plan ProvidingSupportEmpathyPlan;
    #uses plan RepeatStatementPlan;
    #uses plan SharingSecretsEmpathyPlan;
    #uses plan SlowEvenBreathsEmpathyPlan;
    #uses plan SmilingEmpathyPlan;
    #uses plan SpeakingIStatementsPlan;
    #uses plan TiltHeadEmpathyPlan;
    #uses plan TryHarderEmpathyPlan;
    #uses plan SetPlanContextEmpathyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
