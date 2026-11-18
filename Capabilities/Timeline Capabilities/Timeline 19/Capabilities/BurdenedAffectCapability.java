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
public capability BurdenedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextBurdenedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.VERBAL> AskForHelpBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.VERBAL> ComplainBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.VERBAL> DeclineSuggestionsBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.VERBAL> PessimisticStatementsBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.VERBAL> QuickResponsesBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.VERBAL> ReluctantCommitmentPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.VERBAL> SighBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.VERBAL> SpeakSoftlyBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.VERBAL> SubduedToneVoicePlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.VERBAL> WeakVoiceBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.NONVERBAL> ArmsCrossedBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.NONVERBAL> BadPostureBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.NONVERBAL> ClenchedJawBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.NONVERBAL> DeepExhaleBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.NONVERBAL> DropShouldersBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.NONVERBAL> FidgetingTenseBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.NONVERBAL> LoweredEyeContactBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.NONVERBAL> MassagingTemplesBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.NONVERBAL> ShrugBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.NONVERBAL> SlowBodyMovementsBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.ACTION> HesitationBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.ACTION> LowFocusedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.ACTION> LowWorryingPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.ACTION> NegativeThoughtsBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.ACTION> OverthinkingBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.ACTION> ProcrastinationBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.ACTION> RelyingOnOthersBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.ACTION> SelfDoubtBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.ACTION> TimeManagementBurdenedPlan;
    #uses BehaviorPlan<AffectEnum.BURDENED, AffectEnum.ACTION> WithdrawalFromOthersBurdenedPlan;

}

