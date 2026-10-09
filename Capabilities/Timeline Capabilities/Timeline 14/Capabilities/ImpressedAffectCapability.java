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
public capability ImpressedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextImpressedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.VERBAL> AskForMoreDetailPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.VERBAL> CommentingOnSkillPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.VERBAL> ExcpressingGratitudePlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.VERBAL> ExpressingAdmirationPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.VERBAL> ExpressingDisbeliiefPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.VERBAL> ExpressingRespectPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.VERBAL> GivingComplementsImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.VERBAL> GivingPraiseImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.VERBAL> SayingWowImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.VERBAL> ThoughtfulResponsesImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.NONVERBAL> ApplaudingPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.NONVERBAL> EyesWideningIpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.NONVERBAL> GivingThumbsUpImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.NONVERBAL> LeanInImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.NONVERBAL> ListeningIntentlyImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.NONVERBAL> MakingWowFacePlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.NONVERBAL> MouthOpenImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.NONVERBAL> NoddingImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.NONVERBAL> RaiseEyebrowsImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.NONVERBAL> SmilingImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.ACTION> AcknowledgingEffortPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.ACTION> DesireToLearnImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.ACTION> DrawingInspirationPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.ACTION> FollowingUpPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.ACTION> ImitationImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.ACTION> OfferingToHelpImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.ACTION> ReflectingAchievementPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.ACTION> SeekingMoreInformationImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.ACTION> SharingResourcesImpressedPlan;
    #uses BehaviorPlan<AffectEnum.IMPRESSED, AffectEnum.ACTION> ShowingAppreciationPlan;

}

