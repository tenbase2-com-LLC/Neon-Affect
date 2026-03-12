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
public capability FascinatedAffectCapability extends Capability {
    #uses plan AskQuestionsFascinatedPlan;
    #uses plan AttemptingToReplicatePhenomenaPlan;
    #uses plan BlinkingInfrequentlyFascinatedPlan;
    #uses plan CreatingTheoriesHypothesisPlan;
    #uses plan DescribingDetailsPlan;
    #uses plan ExclaimingInAmazementPlan;
    #uses plan ExpressingDesireToLearnPlan;
    #uses plan EyesWideOpenFascinatedPlan;
    #uses plan FastInformationProcessingFascinatedPlan;
    #uses plan FocusedFascinatedPlan;
    #uses plan GestureFascinatedPlan;
    #uses plan IgnoringSurroundingsFascinatedPlan;
    #uses plan LosingSenseOfTimePlan;
    #uses plan MakingMentalConnectionsPlan;
    #uses plan MouthOpenFascinatedPlan;
    #uses plan NoddingFascinatedPlan;
    #uses plan QuickBreathsFascinatedPlan;
    #uses plan RaisedEyeBrowsFascinatedPlan;
    #uses plan RequestingDemonstrationsPlan;
    #uses plan SayingWowPlan;
    #uses plan SeekingAdditionalResourcesPlan;
    #uses plan SeekingDeeperExplanationsPlan;
    #uses plan SharingInformationFascinatedPlan;
    #uses plan VerbalizingTheoriesPlan;
    #uses plan SetPlanContextFascinatedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
