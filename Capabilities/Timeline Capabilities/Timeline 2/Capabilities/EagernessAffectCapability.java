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
public capability EagernessAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextEagernessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.VERBAL> AskingQuestionsEagernessPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.VERBAL> EnthusiasticExclamationEagernessPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.VERBAL> ExpressingEagernessToLearnEagernessPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.VERBAL> ExpressingReadinessEagernessPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.VERBAL> FirstToSpeakEagernessPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.VERBAL> InterruptSpeakOverPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.VERBAL> LoudVoicePlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.VERBAL> OfferingSuggestionsPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.VERBAL> RushedWordsPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.VERBAL> VerbalizingThoughtsEagernessPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.NONVERBAL> EyesWideOpenEagernessPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.NONVERBAL> FocusedGazeEagernessPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.NONVERBAL> HandsClenchedPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.NONVERBAL> HeadUpAlertPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.NONVERBAL> LeanInEagernessPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.NONVERBAL> LongBreathesPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.NONVERBAL> NodHeadFastPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.NONVERBAL> SmilingEagernessPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.NONVERBAL> StrongEyeContactPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.NONVERBAL> WinkPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.ACTION> EagernessToPlanEagernessPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.ACTION> FocusedListeningPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.ACTION> ImpatienceEagernessPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.ACTION> LosingAllInhibitionsPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.ACTION> NotEasilyDistractedPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.ACTION> PositiveThinkingEagernessPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.ACTION> QuickDecisionsPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.ACTION> QuickToActionEagernessPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.ACTION> TakingInitiativeEagernessPlan;
    #uses BehaviorPlan<AffectEnum.EAGERNESS, AffectEnum.ACTION> VolunteeringEagernessPlan;

}

