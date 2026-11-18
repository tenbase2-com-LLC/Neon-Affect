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
public capability ArrogantAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextArrogantPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.VERBAL> BoastingArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.VERBAL> BraggingArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.VERBAL> CorrectingOthersArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.VERBAL> DismissingOthersOpinionsArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.VERBAL> InterruptingArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.VERBAL> PatronizingTonePlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.VERBAL> RefusingToAdmitMistakesArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.VERBAL> SpeakingLoudlyArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.VERBAL> SpeakingMatterOfFactArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.VERBAL> UsingCondescendingLanguagePlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.NONVERBAL> GesturesArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.NONVERBAL> HighChinArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.NONVERBAL> IgnoringOthersArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.NONVERBAL> KnowingGrinArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.NONVERBAL> LookAwayArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.NONVERBAL> LookingDisinterestedArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.NONVERBAL> PompousPosturePlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.NONVERBAL> RollingEyesArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.NONVERBAL> ScoffingExpressionPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.NONVERBAL> SmirkArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.ACTION> BelievingRulesDoNotApplyPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.ACTION> DemandSpecialTreatmentPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.ACTION> EntitlementArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.ACTION> HavingGrandioseFantasiesArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.ACTION> ManipulateArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.ACTION> OverestimatingAbilitiesPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.ACTION> RefusingToListenArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.ACTION> SeekingRecognitionArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.ACTION> ShowingOffArrogantPlan;
    #uses BehaviorPlan<AffectEnum.ARROGANT, AffectEnum.ACTION> UnderestimatingOthersArrogantPlan;

}

