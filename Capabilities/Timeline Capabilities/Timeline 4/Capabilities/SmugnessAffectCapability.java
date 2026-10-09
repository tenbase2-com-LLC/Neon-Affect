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
public capability SmugnessAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextSmugnessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.VERBAL> ArguingSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.VERBAL> ArroganceSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.VERBAL> BraggingSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.VERBAL> CondescendingSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.VERBAL> ConfidentVoicePlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.VERBAL> CriticizePlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.VERBAL> InsultSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.VERBAL> LaughingToOneselfSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.VERBAL> SarcasmSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.VERBAL> SelfAssuredCommentsSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.NONVERBAL> ArmsCrossedSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.NONVERBAL> DirectEyeContactSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.NONVERBAL> ExaggeratedMovementsPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.NONVERBAL> GoodPostureSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.NONVERBAL> GrinSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.NONVERBAL> InterestedPosePlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.NONVERBAL> LeaningInSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.NONVERBAL> RaisedEyebrowsPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.NONVERBAL> RollingEyesPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.NONVERBAL> SighSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.NONVERBAL> SmirkPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.NONVERBAL> TiltHeadSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.NONVERBAL> WavingHandPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.ACTION> AccomplishmentPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.ACTION> CommandingConversationPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.ACTION> OverestimatingAbilitiesSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.ACTION> PersonalValidationSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.ACTION> ReminiscingPastSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.ACTION> SeekingRecognitionSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.ACTION> SelfCongratulationSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.ACTION> ShowingOffSmugnessPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.ACTION> SuperiorityLookPlan;
    #uses BehaviorPlan<AffectEnum.SMUGNESS, AffectEnum.ACTION> UnderestimatingOthersSmugnessPlan;

}

