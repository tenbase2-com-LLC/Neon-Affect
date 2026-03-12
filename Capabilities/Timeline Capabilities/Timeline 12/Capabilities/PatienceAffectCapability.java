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
public capability PatienceAffectCapability extends Capability {
    #uses plan AskingQuestionsPatiencePlan;
    #uses plan CalmingSpeechPatiencePlan;
    #uses plan CelebratingMilestonesPlan;
    #uses plan DeepBreathsPatiencePlan;
    #uses plan DetailedExplanationsPlan;
    #uses plan DistancingOneselfPatiencePlan;
    #uses plan EyeContactPatiencePlam;
    #uses plan FaceNeutralPlan;
    #uses plan GiveComplementsPatiencePlan;
    #uses plan GiveEncouragementPlan;
    #uses plan GiveTimeToFinishSpeakingPlan;
    #uses plan GivingSpacePlan;
    #uses plan InvestingTimeInTasksPlan;
    #uses plan LeanInPatiencePlan;
    #uses plan NoddingSlowlyPatiencePlan;
    #uses plan PauseToExaminePatiencePlan;
    #uses plan ProvidingSupportPlan;
    #uses plan RelaxedPosturePatiencePlan;
    #uses plan RestatingPointsPlan;
    #uses plan StillnessPatiencePlan;
    #uses plan WaitingToFinishPlan;
    #uses plan SetPlanContextPatiencePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
