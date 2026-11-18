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
public capability ProtectiveAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextProtectivePlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.VERBAL> AssertiveStatementsProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.VERBAL> CalmingSpeechProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.VERBAL> ClearDirectivesProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.VERBAL> DefendingFriendsProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.VERBAL> OfferingUnconditionalSupportProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.VERBAL> RaisingVoiceProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.VERBAL> ReactingWithoutThinkingProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.VERBAL> ReassuringOthersProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.VERBAL> SayingNoProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.VERBAL> SpeakingGentlyProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.NONVERBAL> GentleCaressProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.NONVERBAL> HuggingProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.NONVERBAL> ListeningForSomethingProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.NONVERBAL> LookAroundProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.NONVERBAL> MaintainPhysicalProximityProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.NONVERBAL> NarrowEyesProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.NONVERBAL> QuickHeadMovementsProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.NONVERBAL> StandingFirmProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.NONVERBAL> StrongPostureProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.NONVERBAL> WideStanceProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.ACTION> AnticipatingNeedsProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.ACTION> ConfrontChallengesDirectlyProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.ACTION> HeightenedSensesProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.ACTION> ObservingBeforeReactingProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.ACTION> OverprotectingProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.ACTION> ProtectingOthersProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.ACTION> QuickDecisionsProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.ACTION> ReactingImpulsivelyProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.ACTION> SacrificingProtectivePlan;
    #uses BehaviorPlan<AffectEnum.PROTECTIVE, AffectEnum.ACTION> TakingChargeOfSituationProtectivePlan;

}

