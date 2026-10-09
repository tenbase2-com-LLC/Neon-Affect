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
public capability AnticipationAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAnticipationPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.VERBAL> BecomingSelfCriticalPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.VERBAL> BeggingForDetailsPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.VERBAL> FrustrationImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.VERBAL> IrritabilityAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.VERBAL> LackOfConcentrationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.VERBAL> NeglectingEverythingElsePlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.VERBAL> PlanningFutureActivitiesAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.VERBAL> TalkToSelfAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.VERBAL> UnableThinkTalkAnythingElsePlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.VERBAL> VerbalizingExcitementAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.NONVERBAL> BitingLipAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.NONVERBAL> CheckWatchAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.NONVERBAL> ClosingEyesSighingPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.NONVERBAL> EyesWideOpenAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.NONVERBAL> FidgetingAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.NONVERBAL> HandsClenchedAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.NONVERBAL> HoldBreathAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.NONVERBAL> LeaningInPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.NONVERBAL> StandingStillAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.NONVERBAL> TappingFootAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.ACTION> CalculatingTimeRemainingAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.ACTION> DifficultySittingStillAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.ACTION> EagernessToPlanAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.ACTION> FantasizingAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.ACTION> ImagineWhatWillHappenPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.ACTION> ImpatienceAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.ACTION> OverthinkingPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.ACTION> PreparingBestScenarioAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.ACTION> RehearsingAnticipationPlan;
    #uses BehaviorPlan<AffectEnum.ANTICIPATION, AffectEnum.ACTION> SensitiviityToTouchPlan;

}

