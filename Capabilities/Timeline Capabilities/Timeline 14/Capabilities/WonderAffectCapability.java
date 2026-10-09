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
public capability WonderAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextWonderPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.VERBAL> AskQuestionsWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.VERBAL> DescribingSensationsPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.VERBAL> ExpressingEnthisiasmPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.VERBAL> GaspWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.VERBAL> SharingFeelingsPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.VERBAL> ShoutingPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.VERBAL> StrugglingToSpeakWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.VERBAL> SwearingWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.VERBAL> VerbaliszingJoyPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.VERBAL> WhisperDramaticallyWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.NONVERBAL> BlinkingRapidlyWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.NONVERBAL> EyesWideningWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.NONVERBAL> HeadShakingWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.NONVERBAL> LeanInWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.NONVERBAL> MouthOpenWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.NONVERBAL> PlacingHandOverHeartWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.NONVERBAL> RaiseEyebrowsWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.NONVERBAL> RemainingStillWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.NONVERBAL> StaringWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.NONVERBAL> TremblingBodyPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.ACTION> ContemplatingOnesPlacePlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.ACTION> EnjoyingMomemtWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.ACTION> ExaminingDetailsPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.ACTION> NoticingLittleThingsWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.ACTION> PausingAbsorbEnvironmentPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.ACTION> ReplayingPastEventsWonder;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.ACTION> ResearchingTopicFurtherWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.ACTION> SenseOfConnectionWonderPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.ACTION> TreasuringMomemrtPlan;
    #uses BehaviorPlan<AffectEnum.WONDER, AffectEnum.ACTION> WantingNewExperiencesWonderPlan;

}

