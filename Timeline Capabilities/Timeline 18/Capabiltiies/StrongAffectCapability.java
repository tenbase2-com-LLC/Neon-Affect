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
public capability StrongAffectCapability extends Capability {
    #uses plan BarrierOvercomingPlan;
    #uses plan CompetitivenessPlan;
    #uses plan ConfrontChallengesDirectlyStrongPlan;
    #uses plan CreativityStrongPlan;
    #uses plan EmotionalDeclarationsPlan;
    #uses plan EuphoricExclamationsPlan;
    #uses plan ExaggeratedStorytellingPlan;
    #uses plan FocusedStrongPlan;
    #uses plan GradioseProclamationsPlan;
    #uses plan HyperventilatingStroingPlan;
    #uses plan LaughingStrongPlan;
    #uses plan LeadershipInitiativePlan;
    #uses plan MakingDecisionsStrongPlan;
    #uses plan OfferingComplementStrongPlan;
    #uses plan PhysicalEnduranceBoostPlan;
    #uses plan RapidEyeMovementsStrongPlan;
    #uses plan RapidSpeakingStrongPlan;
    #uses plan RememberDetailsStrongPlan;
    #uses plan RepeatingWordsStrongPlan;
    #uses plan RiskTakingStrongPlan;
    #uses plan SetRealisticDeadlinesStrongPlan;
    #uses plan SingingHummingStrongPlan;
    #uses plan TearingUpStrongPlan;
    #uses plan TremblingBodyStrongPlan;
    #uses plan WildGesticulationPlan;
    #uses plan SetPlanContextStrongPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
