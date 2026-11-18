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
public capability PrideAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextPridePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.VERBAL> AccomplishmentMentionPridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.VERBAL> BoomingLaughPlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.VERBAL> ConfidentVoicePridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.VERBAL> DominatingConversationPlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.VERBAL> HumbleAcknowledgementsPridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.VERBAL> PositiveAffirmationSelfSatisifiedPridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.VERBAL> PositiveComplementsPlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.VERBAL> SharingGoodNewsPridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.VERBAL> TalkativePridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.VERBAL> VerbalizingAccomplishmentPlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.NONVERBAL> CockySmilePridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.NONVERBAL> EyesSatisifiedPridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.NONVERBAL> FistPumpPridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.NONVERBAL> HighChinPlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.NONVERBAL> KnowingGrinPlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.NONVERBAL> PostureImprovementPridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.NONVERBAL> ProudPosturePridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.NONVERBAL> RelaxedSmilePridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.NONVERBAL> SmirkPridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.NONVERBAL> SteadyEyeContactPridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.ACTION> CompetenceReinforcementPridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.ACTION> ConfidenceBoostPridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.ACTION> LeadByExamplePridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.ACTION> PositiveSelfThoughtsPlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.ACTION> PreoccupiedWithPriorSuccessPlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.ACTION> ReflectingAchievementPridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.ACTION> SeekingRecognitionPridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.ACTION> SelfCongratulationPridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.ACTION> ShowingOffPridePlan;
    #uses BehaviorPlan<AffectEnum.PRIDE, AffectEnum.ACTION> TakingOnChallengesPridePlan;

}

