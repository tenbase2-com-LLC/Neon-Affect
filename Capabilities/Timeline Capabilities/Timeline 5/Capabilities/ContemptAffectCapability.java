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
public capability ContemptAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextContemptPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.VERBAL> ArguingContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.VERBAL> ChangeSubjectContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.VERBAL> CondescendingContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.VERBAL> GossipingContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.VERBAL> HardTonePlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.VERBAL> JokingContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.VERBAL> LaughterContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.VERBAL> MockingPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.VERBAL> SarcasmContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.VERBAL> SpeakingMatterOfFactContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.NONVERBAL> AlteredBodyAnglePlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.NONVERBAL> ArmsCrossedContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.NONVERBAL> BlowingRaspberryPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.NONVERBAL> DownturnedMouthPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.NONVERBAL> GoodPostureContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.NONVERBAL> LeaningBackContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.NONVERBAL> LookAwayContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.NONVERBAL> LookDownContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.NONVERBAL> NoResponseContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.NONVERBAL> RollingEyesContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.NONVERBAL> ShakingHeadContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.NONVERBAL> SmrkingComteptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.NONVERBAL> SneeringContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.NONVERBAL> WavingHandContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.ACTION> ArroganceContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.ACTION> DisengageFromInteractionContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.ACTION> IgnoringOthersContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.ACTION> JudgementalContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.ACTION> NegativeThinkingContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.ACTION> NotGivingInKindnessContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.ACTION> PutInPlaceContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.ACTION> RefusingToListenContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.ACTION> SuperiorityLookContemptPlan;
    #uses BehaviorPlan<AffectEnum.CONTEMPT, AffectEnum.ACTION> UnkindThoughtsContemptPlan;

}

