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
public capability FascinatedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextFascinatedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.VERBAL> AskQuestionsFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.VERBAL> DescribingDetailsPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.VERBAL> ExclaimingInAmazementPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.VERBAL> ExpressingDesireToLearnPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.VERBAL> ExpressingWondermentFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.VERBAL> RequestingDemonstrationsPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.VERBAL> SayingWowPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.VERBAL> SeekingDeeperExplanationsPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.VERBAL> SharingInformationFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.VERBAL> VerbalizingTheoriesPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.NONVERBAL> BlinkingInfrequentlyFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.NONVERBAL> EyesWideOpenFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.NONVERBAL> GestureFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.NONVERBAL> LeanInFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.NONVERBAL> MouthOpenFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.NONVERBAL> NoddingFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.NONVERBAL> QuickBreathsFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.NONVERBAL> RaisedEyeBrowsFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.NONVERBAL> StaringFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.NONVERBAL> StrokingChinFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.ACTION> AttemptingToReplicatePhenomenaPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.ACTION> CreatingTheoriesHypothesisPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.ACTION> ExperimentingWithIdeasFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.ACTION> FastInformationProcessingFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.ACTION> FocusedFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.ACTION> IgnoringSurroundingsFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.ACTION> LosingSenseOfTimePlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.ACTION> MakingMentalConnectionsPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.ACTION> ResearchingTopicFurtherFascinatedPlan;
    #uses BehaviorPlan<AffectEnum.FASCINATED, AffectEnum.ACTION> SeekingAdditionalResourcesPlan;

}

