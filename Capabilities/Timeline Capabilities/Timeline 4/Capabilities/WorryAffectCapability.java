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
public capability WorryAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextWorryPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.VERBAL> AskForHelpWorryPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.VERBAL> AskingQuestionsPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.VERBAL> ConcernVocalizationsWorryPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.VERBAL> MutteringWorryPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.VERBAL> RepeatThoughtsWorryPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.VERBAL> SeekingReassuranceWorryPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.VERBAL> SilencePlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.VERBAL> SpeakingQuicklyWorryPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.VERBAL> TentativeExpressionsWorryPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.VERBAL> WeighingProsConsWorryPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.NONVERBAL> BadPostureWorryPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.NONVERBAL> BitingLipWorryPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.NONVERBAL> DeepBreathesWorryPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.NONVERBAL> DistancingOneselfPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.NONVERBAL> FidgetingWorryPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.NONVERBAL> FurrowedBrowWorryPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.NONVERBAL> PainedGazePlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.NONVERBAL> RubbingFacePlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.NONVERBAL> RubbingHandsPantLegPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.NONVERBAL> SmoothingClothesPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.ACTION> AnxietyAttackPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.ACTION> AssumingWorstScenarioPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.ACTION> InabilityTpFocusWorryPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.ACTION> IrritabilityWorryPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.ACTION> NeedControlPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.ACTION> OveranalyzingPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.ACTION> OverprotectingPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.ACTION> PoorCommunicationPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.ACTION> RegretfulPlan;
    #uses BehaviorPlan<AffectEnum.WORRY, AffectEnum.ACTION> UncertainAboutPastPlan;

}

