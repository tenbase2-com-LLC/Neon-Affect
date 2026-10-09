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
public capability ApprehensiveAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextApprehensivePlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.VERBAL> AskQuestionsApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.VERBAL> AskingClarificationApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.VERBAL> ConcernVocalizationsApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.VERBAL> HesitationSpeechApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.VERBAL> SeekingReassuranceApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.VERBAL> SpeakingCarefulWordsApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.VERBAL> SpeakingQuicklyApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.VERBAL> TentativeExpressionsApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.VERBAL> UseOfUncertainPhrasesApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.VERBAL> WeighingProsConsApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.NONVERBAL> BitingLipApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.NONVERBAL> CockHeadApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.NONVERBAL> FidgetingApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.NONVERBAL> FurrowedBrowApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.NONVERBAL> ListeningForSomethingApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.NONVERBAL> NervousSmileApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.NONVERBAL> PainedGazeApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.NONVERBAL> PurseLipsApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.NONVERBAL> ShiftWeightApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.NONVERBAL> SmoothingClothesApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.ACTION> AssumingWorstScenarioApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.ACTION> AwarenessOfFutureApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.ACTION> HesitationApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.ACTION> OverPreparingApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.ACTION> OveranalyzingApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.ACTION> OverprotectingApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.ACTION> OverthinkingApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.ACTION> ProcrastinationApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.ACTION> ReassuranceFromOthersApprehensivePlan;
    #uses BehaviorPlan<AffectEnum.APPREHENSIVE, AffectEnum.ACTION> SeekingMoreInformationApprehensivePlan;

}

