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
public capability LuckyAffectCapability extends Capability {
    #uses plan AttributingSuccessToFatePlan;
    #uses plan BraggingLuckyPlan;
    #uses plan DescribingUnlikelyEventsPlan;
    #uses plan DownplayngSkillsPlan;
    #uses plan EngagingInRitualsPlan;
    #uses plan ExpressingGratitudeLuckyPlan;
    #uses plan EyesWideOpenLuckyPlan;
    #uses plan GenerosityLuckyPlan;
    #uses plan HandsOnHeadPlan;
    #uses plan HeadShakingLuckyPlan;
    #uses plan IgnoringNegativePossibilitiesPlan;
    #uses plan InvincibilityLuckyPlan;
    #uses plan JokingLuckyPlan;
    #uses plan MentioningCoincidencesPlan;
    #uses plan NoticePositiveThingsLuckyPlan;
    #uses plan OverestimatingAbilitiesLuckyPlan;
    #uses plan QuickGlanceAroundPlan;
    #uses plan RelaxedPostureLuckyPlan;
    #uses plan ReminiscingPastPlan;
    #uses plan SeekingNewOpportunitiesPlan;
    #uses plan SharingGoodNewsLuckyPlan;
    #uses plan ShrugLuckyPlan;
    #uses plan SmilingLuckyPlan;
    #uses plan TakingRisksPlan;
    #uses plan UsingSuperstitiousPhrasesPlan;
    #uses plan SetPlanContextLuckyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
