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
public capability CuriousAffectCapability extends Capability {
    #uses plan AnalyzingPatternsPlan;
    #uses plan AskForMoreDetailsCuriousPlan;
    #uses plan AskQuestionsCuriousPlan;
    #uses plan BreakingDownConceptsPlan;
    #uses plan DrawingConnectionsPlan;
    #uses plan EncouragingElaborationPlan;
    #uses plan ExperimentingWithIdeasPlan;
    #uses plan ExpressingEagernessToLearnPlan;
    #uses plan ExpressingWondermentPlan;
    #uses plan EyesWideningCuriousPlan;
    #uses plan FurrowedBrowCuriousPlan;
    #uses plan ImaginingScenariosPlan;
    #uses plan MaintainEyeContactCuriousPlan;
    #uses plan NoddingCuriousPlan;
    #uses plan ProposingHypothesesPlan;
    #uses plan PurseLipsCuriousPlan;
    #uses plan RaiseEyebrowsCuriousPlan;
    #uses plan RephraseToUnderstandPlan;
    #uses plan ResearchingTopicFurtherPlan;
    #uses plan SeekingAlternativePerspectivesPlan;
    #uses plan SeekingClarificationPlan;
    #uses plan SharingExperiencesCuriousPlan;
    #uses plan StrokingChinPlan;
    #uses plan TakeMentalNotesPlan;
    #uses plan TestingAssumptionsPlan;
    #uses plan TiltingHeadToSideCuriousPlan;
    #uses plan VerbalizingThoughtsPlan;
    #uses plan SetPlanContextCuriousPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
