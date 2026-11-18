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
public capability WanderlustAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextWanderlustPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.VERBAL> AskingQuestionsWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.VERBAL> DescribingSensationsWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.VERBAL> EngagingPhilosophicalDiscussionsWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.VERBAL> ExpressingCuriosiityWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.VERBAL> ExpressingDesireToLearnWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.VERBAL> ExpressingEnthisiasmWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.VERBAL> ExpressingUnconventionalIdeasWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.VERBAL> PlanningFutureActivitiesWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.VERBAL> ReminiscingPastWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.VERBAL> SharingExperiencesWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.NONVERBAL> DeepBreathsWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.NONVERBAL> EyesBrightPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.NONVERBAL> EyesWideOpenWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.NONVERBAL> FluidMovementWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.NONVERBAL> FocusedGazeWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.NONVERBAL> GenuineSmilePlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.NONVERBAL> GoodPostureWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.NONVERBAL> HoldingHeadHighPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.NONVERBAL> LeaningInWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.NONVERBAL> RaiseEyebrowsWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.ACTION> ConfidenceWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.ACTION> DesireToLearnPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.ACTION> EmpathyPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.ACTION> FriendlinessPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.ACTION> HeightenedSensesWanderliustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.ACTION> MakePlansWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.ACTION> RiskTakingWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.ACTION> SpontaneityWanderlustPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.ACTION> StrongImaginationPlan;
    #uses BehaviorPlan<AffectEnum.WANDERLUST, AffectEnum.ACTION> TryNewThingsWanderlustPlan;

}

