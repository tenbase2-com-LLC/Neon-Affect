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
public capability EuphoriaAffectCapability extends Capability {
    #uses plan UnrestrainedSmilingLaughterPlan;
    #uses plan MouthOpeningInWonderPlan;
    #uses plan GaspEuphoriaPlan;
    #uses plan TemporaryBreathlessnessPlan;
    #uses plan SlurringWordsPlan;
    #uses plan RapidSpeechDecliningArticulationPlan;
    #uses plan InvincibilityPlan;
    #uses plan HeightenedCreativityPlan;
    #uses plan RiskTakingEuphoriaPlan;
    #uses plan IncreasedEmpathyCompassionAltruismPlan;
    #uses plan MoreLikelyToNoticeBeautyPlan;
    #uses plan SetPlanContextEuphoriaPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();

}
