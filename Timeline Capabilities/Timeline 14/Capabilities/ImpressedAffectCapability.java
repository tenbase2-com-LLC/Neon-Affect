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
public capability ImpressedAffectCapability extends Capability {
    #uses plan AcknowledgingEffortPlan;
    #uses plan ApplaudingPlan;
    #uses plan AskForMoreDetailPlan;
    #uses plan CommentingOnSkillPlan;
    #uses plan DrawingInspirationPlan;
    #uses plan ExcpressingGratitudePlan;
    #uses plan ExpressingAdmirationPlan;
    #uses plan ExpressingDisbeliiefPlan;
    #uses plan ExpressingRespectPlan;
    #uses plan EyesWideningIpressedPlan;
    #uses plan FollowingUpPlan;
    #uses plan GivingComplementsImpressedPlan;
    #uses plan GivingPraiseImpressedPlan;
    #uses plan GivingThumbsUpImpressedPlan;
    #uses plan MakingWowFacePlan;
    #uses plan MouthOpenImpressedPlan;
    #uses plan NoddingImpressedPlan;
    #uses plan OfferingToHelpImpressedPlan;
    #uses plan ReflectingAchievementPlan;
    #uses plan SeekingMoreInformationImpressedPlan;
    #uses plan SharingResourcesImpressedPlan;
    #uses plan ShowingAppreciationPlan;
    #uses plan SmilingImpressedPlan;
    #uses plan SetPlanContextImpressedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
