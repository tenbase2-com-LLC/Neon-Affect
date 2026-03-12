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
public capability AdmirationAffectCapability extends Capability {
    #uses plan ProlongedEyeContactPlan;
    #uses plan SlightSmilePlan;
    #uses plan TiltHeadPlan;
    #uses plan OfferComplementPlan;
    #uses plan WarmGreetingPlan;
    #uses plan NoddingDuringSpeechPlan;
    #uses plan ImitationPlan;
    #uses plan WelcomingStancePlan;
    #uses plan AskingQuestionsAdmirationPlan;
    #uses plan AskingMoreDetailPlan;
    #uses plan AgreeablePlan;
    #uses plan IncreasedLaughterPlan;
    #uses plan CareTakingPlan;
    #uses plan OfferingPraisePlan;
    #uses plan WarmToneVoicePlan;
    #uses plan FriendlinessAdmirationPlan;
    #uses plan TalkativeAdmirationPlan;
    #uses plan NotInterruptingPlan;
    #uses plan GoOutOfWayPlan;
    #uses plan TrustingPlan;
    #uses plan DesireToLearnAdmirationPlan;
    #uses plan SpendTimeTogetherPlan;
    #uses plan ClappingCheeringPlan;
    #uses plan SetPlanContextAdmirationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
