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
public capability AmazementAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAmazementPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.VERBAL> AskForMoreDetailsAmazementPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.VERBAL> ExpressingDisbeliiefAmazementPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.VERBAL> ForcingCoughPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.VERBAL> GiddinessPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.VERBAL> GulpStutterAmazementPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.VERBAL> InabilityFindWordsPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.VERBAL> SayingWowAmazementPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.VERBAL> SmallYelpPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.VERBAL> SpeechlessLessArticulateAmazementPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.VERBAL> SpontaneousLaughterPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.NONVERBAL> BecomingSuddenlyStillPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.NONVERBAL> EyesWideningPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.NONVERBAL> HandCoveringMouthPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.NONVERBAL> LeanInPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.NONVERBAL> LookDownPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.NONVERBAL> RapidBlinkingThenStarePlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.NONVERBAL> SlowHeadShakePlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.NONVERBAL> SpeechlessnessAmazementPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.NONVERBAL> StonyExpressionPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.NONVERBAL> SuckInQuickBreathPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.NONVERBAL> TakeStepBackPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.ACTION> DesireToGetCloserAmazementPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.ACTION> DisorientatedAmazementPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.ACTION> ExaminingDetailsAmazementPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.ACTION> ForgettingAmazementPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.ACTION> PausingAbsorbEnvironmentAmazementPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.ACTION> RepeatingPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.ACTION> ReplayingExperienceAmazementPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.ACTION> SeekingMoreInformationAmazementPlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.ACTION> ShareExperiencePlan;
    #uses BehaviorPlan<AffectEnum.AMAZEMENT, AffectEnum.ACTION> TakingSeatPlan;

}

