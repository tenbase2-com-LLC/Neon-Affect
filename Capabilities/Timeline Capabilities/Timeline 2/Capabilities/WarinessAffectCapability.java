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
public capability WarinessAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextWarinessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.VERBAL> AskingClarificationWarinessPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.VERBAL> AskingQuestionsWarinessPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.VERBAL> AvoidingPersonalTopicsWarinessPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.VERBAL> HesitationSpeechWarinessPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.VERBAL> LowerVoiceToWhisperWarinessPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.VERBAL> SeekingReassuranceWarinessPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.VERBAL> ShortResponsesWarinessPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.VERBAL> SpeakingCarefulWordsPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.VERBAL> SpeakingSmoothlyPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.VERBAL> TenseVoicePlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.NONVERBAL> BackingAwayPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.NONVERBAL> BitingLipPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.NONVERBAL> BreathingStoppingAbruptlyPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.NONVERBAL> CockHeadPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.NONVERBAL> GoodPosturePlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.NONVERBAL> HesitationPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.NONVERBAL> HoldingUpHandsPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.NONVERBAL> LiftingChinPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.NONVERBAL> ListeningForSomethingPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.NONVERBAL> PurseLipsPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.NONVERBAL> SeriousExpressionPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.NONVERBAL> SomethingNotRightPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.NONVERBAL> SquintingWarinessPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.NONVERBAL> UnableToRelaxPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.ACTION> AwarenessOfFuturePlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.ACTION> CommittmentIssuesPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.ACTION> ConfusionPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.ACTION> DefensiveWarinessPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.ACTION> HeightenedSensesWarinessPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.ACTION> MakeSenseSituationThoughtsRacingPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.ACTION> ObservingBeforeReactingWarinessPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.ACTION> OverprotectingWarinessPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.ACTION> SeekingMoreInformationWarinessPlan;
    #uses BehaviorPlan<AffectEnum.WARINESS, AffectEnum.ACTION> TrustingGutFeelingsPlan;

}

