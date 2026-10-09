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
public capability GuardedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextGuardedPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.VERBAL> AskingClarificationGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.VERBAL> AvoidingPersonalTopicsGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.VERBAL> ChangingSubjectGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.VERBAL> DeflectingQuestionsGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.VERBAL> GivingNeutralResponsesGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.VERBAL> HesitationSpeechGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.VERBAL> SeekingReassuranceGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.VERBAL> SelfDeprecatingHumorGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.VERBAL> ShortResponsesGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.VERBAL> SpeakingCarefulWordsGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.NONVERBAL> ArmsCrossedGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.NONVERBAL> BackingAwayGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.NONVERBAL> CockHeadGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.NONVERBAL> HesitationGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.NONVERBAL> MaintainNeutralExpressionGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.NONVERBAL> MaintainPhysicalDistanceGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.NONVERBAL> NervousSmileGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.NONVERBAL> SeriousExpressionGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.NONVERBAL> SmilingPolitelyGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.NONVERBAL> SquintingGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.ACTION> CommittmentIssuesGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.ACTION> DefensiveGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.ACTION> DownplayingOwnEmotionsGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.ACTION> HeightenedSensesGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.ACTION> MaintainingLowProfileGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.ACTION> ObservingBeforeReactingGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.ACTION> OverprotectingGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.ACTION> OverthinkingSocialSituationsGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.ACTION> SeekingMoreInformationGuardedPlan;
    #uses BehaviorPlan<AffectEnum.GUARDED, AffectEnum.ACTION> TrustingGutFeelingsGuardedPlan;

}

