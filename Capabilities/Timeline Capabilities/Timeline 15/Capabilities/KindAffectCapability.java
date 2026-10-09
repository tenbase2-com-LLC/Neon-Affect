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
public capability KindAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextKindPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.VERBAL> AcknowledgingEffortKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.VERBAL> ExpressingGratitudePlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.VERBAL> GivingComplementsKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.VERBAL> GivingPraiseKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.VERBAL> OfferingEncouragementPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.VERBAL> OfferingToHelpKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.VERBAL> SharingPositiveFeedbackPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.VERBAL> SpeakingCarefullyKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.VERBAL> SpeakingGentlyKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.VERBAL> UsingPoliteLanguagePlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.NONVERBAL> CalmExteriorKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.NONVERBAL> EyeContactKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.NONVERBAL> FaceSoftKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.NONVERBAL> GivingThumbsUpKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.NONVERBAL> ListeningKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.NONVERBAL> NoddingKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.NONVERBAL> OpenBodyPostureKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.NONVERBAL> PatientlyWaitingPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.NONVERBAL> SmilingKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.NONVERBAL> UsingGentleHandGesturesKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.ACTION> BeingGenerousPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.ACTION> ConsideringOthersPerspectivesPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.ACTION> ForgivenessKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.ACTION> GivingSpaceKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.ACTION> HelpfulnessKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.ACTION> PerformingActsOfKindnessKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.ACTION> ProvideListeningEarKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.ACTION> ShowingConcernKindPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.ACTION> ShowingEmpathyPlan;
    #uses BehaviorPlan<AffectEnum.KIND, AffectEnum.ACTION> ThinkingPositivelyPlan;

}

