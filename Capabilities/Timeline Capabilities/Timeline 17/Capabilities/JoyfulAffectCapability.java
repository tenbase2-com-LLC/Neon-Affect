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
public capability JoyfulAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextJoyfulPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.VERBAL> ComplementOthersPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.VERBAL> ExcitedChatterPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.VERBAL> ExpressingGratitudeJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.VERBAL> LaughingJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.VERBAL> LaughingToOneselfJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.VERBAL> SharingGoodNewsPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.VERBAL> SingingHummingJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.VERBAL> SpeakingWithLiltingTonePlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.VERBAL> TellingJokesJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.VERBAL> UsingPositiveWordsPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.NONVERBAL> EyesDanceSparkleShineJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.NONVERBAL> EyesWideOpenJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.NONVERBAL> GigglingPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.NONVERBAL> HandClappingJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.NONVERBAL> JoyfulTearsJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.NONVERBAL> NodHeadFastJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.NONVERBAL> OpenBodyPostureJoyFulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.NONVERBAL> RelaxedPostureJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.NONVERBAL> SmilingJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.NONVERBAL> ThumbsUpJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.ACTION> CreativityJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.ACTION> DesireToSpreadHappinessPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.ACTION> EnergenicActivityPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.ACTION> EnjoyingMomentJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.ACTION> IncreasedProductivityPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.ACTION> NoticePositiveThingsPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.ACTION> OptimisticJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.ACTION> ProblemSolvingJoyfulPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.ACTION> SeekingOutOthersPlan;
    #uses BehaviorPlan<AffectEnum.JOYFUL, AffectEnum.ACTION> WillingnessToHelpJoyfulPlan;

}

