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
public capability ScornAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextScornPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.VERBAL> AngerAddressedPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.VERBAL> HarshLaughterPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.VERBAL> InsultScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.VERBAL> InterruptingScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.VERBAL> MockingScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.VERBAL> PickFightScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.VERBAL> RidiculePlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.VERBAL> SarcasmScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.VERBAL> SpeakingFlatVoiceScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.VERBAL> SpeakingSlowlyScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.NONVERBAL> ArmsCrossedScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.NONVERBAL> ExhaleThroughNosePlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.NONVERBAL> IgnoringPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.NONVERBAL> LeaningBackScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.NONVERBAL> RollingEyesScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.NONVERBAL> SmirkScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.NONVERBAL> SneeringScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.NONVERBAL> SquintPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.NONVERBAL> StaringScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.NONVERBAL> WavingHandScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.ACTION> ArroganceScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.ACTION> BullyingPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.ACTION> IgnoringOthersScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.ACTION> JudgementalScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.ACTION> PleaseBehaviorPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.ACTION> PutInPlacePlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.ACTION> SuperiorityLookScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.ACTION> UnderestimatingOthersScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.ACTION> UnforgivingScornPlan;
    #uses BehaviorPlan<AffectEnum.SCORN, AffectEnum.ACTION> UnkindThoughtsScornPlan;

}

