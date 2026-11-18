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
public capability LuckyAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextLuckyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.VERBAL> AttributingSuccessToFatePlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.VERBAL> BraggingLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.VERBAL> DescribingUnlikelyEventsPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.VERBAL> DownplayngSkillsPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.VERBAL> ExpressingGratitudeLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.VERBAL> JokingLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.VERBAL> MentioningCoincidencesPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.VERBAL> ReminiscingPastPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.VERBAL> SharingGoodNewsLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.VERBAL> UsingSuperstitiousPhrasesPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.NONVERBAL> CrispNodLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.NONVERBAL> EyesWideOpenLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.NONVERBAL> FistPumpLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.NONVERBAL> HandsOnHeadPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.NONVERBAL> HeadShakingLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.NONVERBAL> KnowingGrinLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.NONVERBAL> QuickGlanceAroundPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.NONVERBAL> RelaxedPostureLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.NONVERBAL> ShrugLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.NONVERBAL> SmilingLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.ACTION> EngagingInRitualsPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.ACTION> GenerosityLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.ACTION> IgnoringNegativePossibilitiesPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.ACTION> InvincibilityLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.ACTION> NoticePositiveThingsLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.ACTION> OptimisticLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.ACTION> OverestimatingAbilitiesLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.ACTION> SeekingNewOpportunitiesPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.ACTION> SharingResourcesLuckyPlan;
    #uses BehaviorPlan<AffectEnum.LUCKY, AffectEnum.ACTION> TakingRisksPlan;

}

