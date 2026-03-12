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
public capability JoyfulAffectCapability extends Capability {
    #uses plan ComplementOthersPlan;
    #uses plan CreativityJoyfulPlan;
    #uses plan DesireToSpreadHappinessPlan;
    #uses plan EnergenicActivityPlan;
    #uses plan ExcitedChatterPlan;
    #uses plan ExpressingGratitudeJoyfulPlan;
    #uses plan EyesWideOpenJoyfulPlan;
    #uses plan GigglingPlan;
    #uses plan IncreasedProductivityPlan;
    #uses plan LaughingJoyfulPlan;
    #uses plan NodHeadFastJoyfulPlan;
    #uses plan NoticePositiveThingsPlan;
    #uses plan OpenBodyPostureJoyFulPlan;
    #uses plan OptimisticJoyfulPlan;
    #uses plan ProblemSolvingJoyfulPlan;
    #uses plan SeekingOutOthersPlan;
    #uses plan SharingGoodNewsPlan;
    #uses plan SingingHummingJoyfulPlan;
    #uses plan SmilingJoyfulPlan;
    #uses plan SpeakingWithLiltingTonePlan;
    #uses plan TellingJokesJoyfulPlan;
    #uses plan ThumbsUpJoyfulPlan;
    #uses plan UsingPositiveWordsPlan;
    #uses plan WillingnessToHelpJoyfulPlan;
    #uses plan SetPlanContextJoyfulPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
