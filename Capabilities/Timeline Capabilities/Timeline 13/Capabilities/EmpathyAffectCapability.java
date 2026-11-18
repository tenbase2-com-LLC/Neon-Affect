/*******************************************************************
 * Created by the JDE: Fri Oct 09 07:56:20 EDT 2026
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
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextEmpathyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.VERBAL> AcknowlegdingOthersPainPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.VERBAL> ActiveListeningResponsesEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.VERBAL> AffirmingOthersFeelingsPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.VERBAL> AskQuestionsEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.VERBAL> CommunicateUnderstandingPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.VERBAL> OfferingToHelpEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.VERBAL> ProvidingSupportEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.VERBAL> RepeatStatementPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.VERBAL> SharingSecretsEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.VERBAL> SpeakingIStatementsPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.NONVERBAL> EyeContactEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.NONVERBAL> FaceSoftPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.NONVERBAL> GentleCaressEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.NONVERBAL> LeaningInEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.NONVERBAL> ListeningIntentlyEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.NONVERBAL> NoddingDuringSpeechEmpathy;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.NONVERBAL> OpenBodyPostureEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.NONVERBAL> SlowEvenBreathsEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.NONVERBAL> SmilingEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.NONVERBAL> TiltHeadEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.ACTION> AnticipatingNeedsEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.ACTION> ConsideringOthersPerspectivesEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.ACTION> HelpfulnessEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.ACTION> ListeningNoJudgementEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.ACTION> OfferingHugEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.ACTION> ProvideListeningEarEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.ACTION> ProvideUsefulInformationPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.ACTION> SeekingCommonGroundEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.ACTION> ShowingConcernEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EMPATHY, AffectEnum.ACTION> TryHarderEmpathyPlan;

}

