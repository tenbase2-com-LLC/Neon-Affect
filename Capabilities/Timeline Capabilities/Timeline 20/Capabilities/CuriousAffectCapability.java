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
public capability CuriousAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextCuriousPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.VERBAL> AskForMoreDetailsCuriousPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.VERBAL> AskQuestionsCuriousPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.VERBAL> EncouragingElaborationPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.VERBAL> ExpressingEagernessToLearnPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.VERBAL> ExpressingWondermentPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.VERBAL> ProposingHypothesesPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.VERBAL> RephraseToUnderstandPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.VERBAL> SeekingClarificationPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.VERBAL> SharingExperiencesCuriousPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.VERBAL> VerbalizingThoughtsPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.NONVERBAL> EyesWideningCuriousPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.NONVERBAL> FocusedGazedCuriousPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.NONVERBAL> FurrowedBrowCuriousPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.NONVERBAL> LeaningInCuriousPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.NONVERBAL> MaintainEyeContactCuriousPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.NONVERBAL> NoddingCuriousPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.NONVERBAL> PurseLipsCuriousPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.NONVERBAL> RaiseEyebrowsCuriousPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.NONVERBAL> StrokingChinPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.NONVERBAL> TiltingHeadToSideCuriousPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.ACTION> AnalyzingPatternsPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.ACTION> BreakingDownConceptsPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.ACTION> DrawingConnectionsPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.ACTION> ExperimentingWithIdeasPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.ACTION> ImaginingScenariosPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.ACTION> ResearchingTopicFurtherPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.ACTION> SeekingAlternativePerspectivesPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.ACTION> TakeMentalNotesPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.ACTION> TestingAssumptionsPlan;
    #uses BehaviorPlan<AffectEnum.CURIOUS, AffectEnum.ACTION> TryNewThingsCuriousPlan;

}

