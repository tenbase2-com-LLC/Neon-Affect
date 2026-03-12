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
public capability PityAffectCapability extends Capability {
    #uses plan HalfSmilePlan;
    #uses plan SighPityPlan;
    #uses plan BadPosturePityPlan;
    #uses plan TiltHeadPityPlan;
    #uses plan AngledBodyPlan;
    #uses plan DirtyLookPlan;
    #uses plan LoweredEyeContactPlan;
    #uses plan SpeakingCarefullyPlan;
    #uses plan ShakingHeadPityPlan;
    #uses plan MakingTskNoisePlan;
    #uses plan ListeningNoJudgementPlan;
    #uses plan LookAwayPityPlan;
    #uses plan ExpectationLookPlan;
    #uses plan ClearThroatPityPlan;
    #uses plan OfferingHopePlan;
    #uses plan GuiltPlan;
    #uses plan SetPlanContextPityPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
