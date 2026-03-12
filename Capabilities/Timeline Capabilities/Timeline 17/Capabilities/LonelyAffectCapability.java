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
public capability LonelyAffectCapability extends Capability {
    #uses plan AskForHelpLonelyPlan;
    #uses plan FacialExpressionsLonelyPlan;
    #uses plan FidgetingLonelyPlan;
    #uses plan LookAwayLonelyPlan;
    #uses plan MonotoneVoiceLonelyPlan;
    #uses plan NegativeThoughtsLonelyPlan;
    #uses plan OvercommittingToActivitiesLonelyPlan;
    #uses plan OverthinkingSocialSituationsLonelyPlan;
    #uses plan ReachingOutTentativelyLonelyPlan;
    #uses plan RuminatingPastFailuresLonelyPlan;
    #uses plan SeekingComfortLonelyPlan;
    #uses plan SeekingConversationPlan;
    #uses plan SeekingReassuranceLonelyPlan;
    #uses plan SharingFeelingsIsolationPlan;
    #uses plan SharingSecretsLonelyPlan;
    #uses plan SighLonelyPlan;
    #uses plan SlowBodyMovementsLonelyPlan;
    #uses plan TalkingAboutPastRelationshipsPlan;
    #uses plan SetPlanContextLonelyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
