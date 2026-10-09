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
public capability AlertAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAlertPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.VERBAL> AskQuestionsAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.VERBAL> ClearArticulationPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.VERBAL> DetailedDiscussionPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.VERBAL> ExpressingReadinessPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.VERBAL> OfferingObservationsPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.VERBAL> QuickResponsesAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.VERBAL> SharingInformationAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.VERBAL> SpeakingWithEnergyPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.VERBAL> UsingPreciseLanguageAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.VERBAL> VerbalUnderstandingPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.NONVERBAL> BlinkingInfrequentlyAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.NONVERBAL> EyeContactAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.NONVERBAL> EyesWideOpenAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.NONVERBAL> FacialExpressionsAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.NONVERBAL> LeanInAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.NONVERBAL> ListeningForSomethingAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.NONVERBAL> ListeningIntentlyAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.NONVERBAL> QuickHeadMovementsPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.NONVERBAL> RapidEyeMovementsPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.NONVERBAL> StrongPostureAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.ACTION> AnticipatingNeedsAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.ACTION> AwarenessSurrroundingsAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.ACTION> FocusedAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.ACTION> HeightenedSensesAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.ACTION> ImprovedReactionTimePlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.ACTION> MultitaskingPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.ACTION> PreparingBestScenarioAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.ACTION> ProblemSolvingAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.ACTION> QuickDecisionsAlertPlan;
    #uses BehaviorPlan<AffectEnum.ALERT, AffectEnum.ACTION> QuickThinkingAlertPlan;

}

