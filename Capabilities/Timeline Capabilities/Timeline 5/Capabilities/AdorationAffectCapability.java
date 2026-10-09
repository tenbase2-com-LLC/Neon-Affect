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
public capability AdorationAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAdorationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.VERBAL> AskingMoreDetailAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.VERBAL> ComplimentPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.VERBAL> NotInterruptingAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.VERBAL> PraisingFrequentlyAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.VERBAL> RepetitiiveSpeechPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.VERBAL> SoftTonePlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.VERBAL> SpeakingWithTendernessAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.VERBAL> TongueTiedAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.VERBAL> UsingPetNamesAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.VERBAL> WhisperDramaticallyAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.NONVERBAL> CloseEyesAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.NONVERBAL> FlushedFacedPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.NONVERBAL> ImitationBodyLanguagePlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.NONVERBAL> LeanInAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.NONVERBAL> LipsPartingAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.NONVERBAL> ReducedBlinkingPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.NONVERBAL> SighAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.NONVERBAL> SlackExpressionPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.NONVERBAL> SteadyEyeContactAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.NONVERBAL> TouchingMouthPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.ACTION> AcuteListeningPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.ACTION> BeingAttentivePlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.ACTION> FixatingThoughtsSubjectPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.ACTION> IgnoringDistractionsAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.ACTION> LosingAwarenessPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.ACTION> LosingTrackOfTimeAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.ACTION> PossessivenessPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.ACTION> PrioritizingPartnerAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.ACTION> RememberingDetailsAdorationPlan;
    #uses BehaviorPlan<AffectEnum.ADORATION, AffectEnum.ACTION> SurprisingWithAffectionAdorationPlan;

}

