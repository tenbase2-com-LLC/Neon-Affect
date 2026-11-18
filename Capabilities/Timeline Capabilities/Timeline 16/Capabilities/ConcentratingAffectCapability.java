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
public capability ConcentratingAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextConcentratingPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.VERBAL> ArticulatingThoughtsCarefullyPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.VERBAL> AskQuestionsConcentratingPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.VERBAL> LimitingConversationPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.VERBAL> MinimizingUnnecessaryTalkPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.VERBAL> MutteringCalculationsPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.VERBAL> RepeatToSelfPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.VERBAL> RequestingQuietPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.VERBAL> SpeakSlowlyConcentratingPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.VERBAL> UsingFocusedLanguagePlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.VERBAL> VerbalizingStepsPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.NONVERBAL> BlinkingSlowlyConcentratingPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.NONVERBAL> BreathingStoppedBrieflyPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.NONVERBAL> FocusedAttentionPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.NONVERBAL> LipBitingConcentrationPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.NONVERBAL> ListeningIntentlyConcentratingPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.NONVERBAL> SlowBodyMovementsConcentratingPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.NONVERBAL> SquintEyesConcentratingPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.NONVERBAL> StaringConcentratingPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.NONVERBAL> StrokingChinConcentratingPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.NONVERBAL> TiltHeadConcentratingPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.ACTION> AnalyzingDetailsPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.ACTION> DelayedResponseConcentratingPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.ACTION> FocusingOnTasksConcentratingPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.ACTION> FrustratedAtInterruptionsConcentratingPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.ACTION> IgnoringDisruptionsConcentratingPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.ACTION> IgnoringSurroundingsPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.ACTION> LosingSenseOfTimeConcentratingPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.ACTION> MentallyOrganzingThoughtsPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.ACTION> ProcessingInformationDeeplyPlan;
    #uses BehaviorPlan<AffectEnum.CONCENTRATING, AffectEnum.ACTION> VisualizingProblemsPlan;

}

