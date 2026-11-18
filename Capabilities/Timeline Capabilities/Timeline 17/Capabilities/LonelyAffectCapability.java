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
public capability LonelyAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextLonelyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.VERBAL> AskForHelpLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.VERBAL> InitiatingConversationLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.VERBAL> MonotoneVoiceLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.VERBAL> SeekingConversationPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.VERBAL> SeekingReassuranceLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.VERBAL> SharingFeelingsIsolationPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.VERBAL> SharingSecretsLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.VERBAL> SighLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.VERBAL> SpeakSoftlyLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.VERBAL> TalkingAboutPastRelationshipsPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.NONVERBAL> BadPostureLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.NONVERBAL> EmptyStareLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.NONVERBAL> FacialExpressionsLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.NONVERBAL> FidgetingLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.NONVERBAL> LeaningInLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.NONVERBAL> LookAwayLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.NONVERBAL> LoweringHeadLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.NONVERBAL> MaintainPhysicalDistanceLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.NONVERBAL> SelfHuggingLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.NONVERBAL> SlowBodyMovementsLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.ACTION> BecomingBusyLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.ACTION> DesireAffectionLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.ACTION> IsolationLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.ACTION> NegativeThoughtsLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.ACTION> OvercommittingToActivitiesLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.ACTION> OverthinkingSocialSituationsLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.ACTION> ReachingOutTentativelyLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.ACTION> RuminatingPastFailuresLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.ACTION> SeekingComfortLonelyPlan;
    #uses BehaviorPlan<AffectEnum.LONELY, AffectEnum.ACTION> SpendingMoreTimeWithOthersLonelyPlan;

}

