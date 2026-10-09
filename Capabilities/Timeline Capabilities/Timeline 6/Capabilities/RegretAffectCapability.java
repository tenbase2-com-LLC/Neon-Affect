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
public capability RegretAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextRegretPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.VERBAL> AcknowledgingMistakesRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.VERBAL> ApologizingPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.VERBAL> AskingQuestionsRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.VERBAL> AttemptToReasonPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.VERBAL> CryingRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.VERBAL> InabilityFogiveOneselfPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.VERBAL> MakeTskNoiseRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.VERBAL> PutOneselfDownRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.VERBAL> RelivingPastEventsPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.VERBAL> WishingEventNeverHappenedPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.NONVERBAL> ArmsCrossedRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.NONVERBAL> AvoidingEyeContactRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.NONVERBAL> BadPostureRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.NONVERBAL> CoverFaceHandsRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.NONVERBAL> DownturnedMouthRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.NONVERBAL> EyesClosedPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.NONVERBAL> ShakingHeadRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.NONVERBAL> SighRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.NONVERBAL> StaringAtFloorRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.NONVERBAL> WinceRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.ACTION> ConfusionRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.ACTION> DesireToFaceConsequencesRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.ACTION> ForgetEventPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.ACTION> LackOfIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.ACTION> PeaceOfferingRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.ACTION> RethinkingPastDecisionRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.ACTION> RuminatingPastFailuresRegretPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.ACTION> SetThingsRightPlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.ACTION> ShockAwePlan;
    #uses BehaviorPlan<AffectEnum.REGRET, AffectEnum.ACTION> WantingToBeAloneRegretPlan;

}

