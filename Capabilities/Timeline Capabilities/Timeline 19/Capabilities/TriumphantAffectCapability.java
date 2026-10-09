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
public capability TriumphantAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextTriumphantPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.VERBAL> BraggingTriumphantPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.VERBAL> EmpoweredSpeechPatternsPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.VERBAL> EnthusiasticNarrationPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.VERBAL> ExpressingGratitudeTriumphantPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.VERBAL> ExuberantExclamationsPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.VERBAL> InspiringProclamationsPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.VERBAL> LaughingTriumphantPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.VERBAL> SelfAssuredCommentsTriumphantPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.VERBAL> SharingGoodNewsTriumphantPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.VERBAL> VictoryDeclarationsPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.NONVERBAL> DeepBreathsTriumphantPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.NONVERBAL> EyesWideAndGlowingTriumphantPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.NONVERBAL> FistPumpPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.NONVERBAL> HandClappingTriumphantPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.NONVERBAL> HeadHeldHighTriumphantPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.NONVERBAL> HuggingTriumphantPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.NONVERBAL> KnowingGrinTriumphantPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.NONVERBAL> ProudPosturePlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.NONVERBAL> SmilingTriumphantPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.NONVERBAL> TriumphantArmRaisingPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.ACTION> AchievementSavoringPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.ACTION> CelebratingMilestonesTriumphantPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.ACTION> CompetencyAffirmationPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.ACTION> ConfidenceBoostPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.ACTION> CreativityTriumphantPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.ACTION> GoalAccomplishmentReflectionPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.ACTION> PerformanceExpectationPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.ACTION> PositiveAttributionEnhancementPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.ACTION> SkillMasteryRecognitionPlan;
    #uses BehaviorPlan<AffectEnum.TRIUMPHANT, AffectEnum.ACTION> SocialBondingPlan;

}

