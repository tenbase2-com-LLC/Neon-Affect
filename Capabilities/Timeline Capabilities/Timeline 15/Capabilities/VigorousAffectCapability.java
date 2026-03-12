/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
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
    #uses plan BeingProactivePlan;
    #uses plan DebatingPlan;
    #uses plan DeterminationVigorousPlan;
    #uses plan ExhibitingStaminaPlan;
    #uses plan FacialExpressionsPlan;
    #uses plan FocusedVigorousPlan;
    #uses plan LeanInVigorousPlan;
    #uses plan MaintainEyeContactVigorousPlan;
    #uses plan MakeFistVigorousPlan;
    #uses plan MakingBoldGesturesPlan;
    #uses plan MakingDecisionsPlan;
    #uses plan NoddingVigorousPlan;
    #uses plan OpinionatedVigorousPlan;
    #uses plan QuickThinkingPlan;
    #uses plan ShowingResiliencePlan;
    #uses plan SpeakingAnimatedlyPlan;
    #uses plan SpeakingLoudlyPlan;
    #uses plan SpeakingQuicklyVigorousPlan;
    #uses plan SpeakingWithConvictionPlan;
    #uses plan StandingStillVigorousPlan;
    #uses plan StiffPostureVigorousPlan;
    #uses plan TakingInitiativeVigorousPlan;
    #uses plan TakingOnChallengesVigorousPlan;
    #uses plan UsingEmphaticLanguagePlan;
    #uses plan UsingEnthusiasticTonePlan;
    #uses plan UsingMentalAgilityPlan;
    #uses plan SetPlanContextVigorousPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
