/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
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
public capability DissatisfiedAffectCapability extends Capability {
    #uses plan AnalyzingShortComingsPlan;
    #uses plan ArmsCrossedDissatisfiedPlan;
    #uses plan ClosedBodyPosturePlan;
    #uses plan ComplainDissatisfiedPlan;
    #uses plan ContemplatingImprovementsPlan;
    #uses plan DisengageFromInteractionPlan;
    #uses plan DwellingOnNegativePlan;
    #uses plan ExpressingDisappointmentDissatisfiedPlan;
    #uses plan FrownDissatisfiedPlan;
    #uses plan LipsPursedDissatisfiedPlan;
    #uses plan LookAwayDissatisfiedPlan;
    #uses plan NegativeLanguageDissatisfiedPlan;
    #uses plan PointingOutShortComingsPlan;
    #uses plan ReplayingPastLetDownsPlan;
    #uses plan RollingEyesDissatisfiedPlan;
    #uses plan SeekingAlternativeOptionsPlan;
    #uses plan ShakingHeadDissatisfiedPlan;
    #uses plan SighDissatisfiedPlan;
    #uses plan VerbalizingFrustrationPlan;
    #uses plan VoicingCriticismPlan;
    #uses plan SetPlanContextDissatisfiedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
