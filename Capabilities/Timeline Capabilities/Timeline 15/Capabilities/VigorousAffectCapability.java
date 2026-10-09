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
public capability VigorousAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextVigorousPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.VERBAL> DebatingPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.VERBAL> OpinionatedVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.VERBAL> SharingIdeasVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.VERBAL> SpeakingAnimatedlyPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.VERBAL> SpeakingLoudlyPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.VERBAL> SpeakingQuicklyVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.VERBAL> SpeakingWithConvictionPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.VERBAL> UsingEmphaticLanguagePlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.VERBAL> UsingEnthusiasticTonePlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.VERBAL> UsingFocusedLanguageVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.NONVERBAL> FacialExpressionsPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.NONVERBAL> FocusedGazeVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.NONVERBAL> LeanInVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.NONVERBAL> MaintainEyeContactVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.NONVERBAL> MakeFistVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.NONVERBAL> MakingBoldGesturesPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.NONVERBAL> NoddingVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.NONVERBAL> StandingStillVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.NONVERBAL> StiffPostureVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.NONVERBAL> StrongPostureVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.ACTION> BeingProactivePlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.ACTION> DeterminationVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.ACTION> ExhibitingStaminaPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.ACTION> FocusedVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.ACTION> MakingDecisionsPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.ACTION> QuickThinkingPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.ACTION> ShowingResiliencePlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.ACTION> TakingInitiativeVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.ACTION> TakingOnChallengesVigorousPlan;
    #uses BehaviorPlan<AffectEnum.VIGOROUS, AffectEnum.ACTION> UsingMentalAgilityPlan;

}

