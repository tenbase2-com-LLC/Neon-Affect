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
public capability FriendlyAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextFriendlyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.VERBAL> ActiveListeningResponsesFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.VERBAL> AskingQuestionsFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.VERBAL> ExpressingInterestPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.VERBAL> InitiatingConversationFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.VERBAL> LaughingFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.VERBAL> OfferingComplementFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.VERBAL> SharingExperienceFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.VERBAL> TellingJokesFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.VERBAL> UsingSupportiveLanguagePlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.VERBAL> UsingWarmGreetingsPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.NONVERBAL> EyeContactFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.NONVERBAL> HandWavingFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.NONVERBAL> HeadTiltingToSideFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.NONVERBAL> ListeningIntentlyFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.NONVERBAL> NoddingFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.NONVERBAL> OpenBodyPostureFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.NONVERBAL> RelaxedPostureFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.NONVERBAL> SmilingFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.NONVERBAL> UsingGentleHandGesturesPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.NONVERBAL> WelcomingStanceFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.ACTION> BeingOpenMindedPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.ACTION> BuildRelationshipsFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.ACTION> ConsideringOthersPerspectivesFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.ACTION> OfferingToHelpFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.ACTION> PlayfulnessFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.ACTION> ProvideUsefulInformationFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.ACTION> RememberingDetailsPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.ACTION> SeekingCommonGroundPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.ACTION> ShowingEmpathyFriendlyPlan;
    #uses BehaviorPlan<AffectEnum.FRIENDLY, AffectEnum.ACTION> ShowingInterestPlan;

}

