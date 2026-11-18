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
public capability EgotisticalAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextEgotisticalPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.VERBAL> BoastingPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.VERBAL> BraggingEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.VERBAL> CorrectingOthersEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.VERBAL> DismissingOthersOpinionsPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.VERBAL> DominatingConversationEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.VERBAL> InterruptingOthersEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.VERBAL> OverusingIPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.VERBAL> SelfAssuredCommentsEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.VERBAL> TalkingOverOthersEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.VERBAL> UsingSuperlativesPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.NONVERBAL> ExaggeratedMovementsEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.NONVERBAL> HighChinEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.NONVERBAL> ImpatienceEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.NONVERBAL> LookingDisinterestedPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.NONVERBAL> RollingEyesEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.NONVERBAL> SighEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.NONVERBAL> SmilingCondescendentlyPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.NONVERBAL> SmirkEgotistiscalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.NONVERBAL> StaringDownEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.NONVERBAL> WavingHandEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.ACTION> BeingControllingPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.ACTION> BelievingRulesDoNotApplyEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.ACTION> HavingGrandioseFantasiesPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.ACTION> IgnoringEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.ACTION> InvadingPersonalSpaceEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.ACTION> LackingEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.ACTION> OverestimatingCapabilitiesPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.ACTION> RefusingToAdmitMistakesPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.ACTION> SeekingRecognitionEgotisticalPlan;
    #uses BehaviorPlan<AffectEnum.EGOTISTICAL, AffectEnum.ACTION> UnderestimatingOthersPlan;

}

