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
public capability IntimacyAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextIntimacyPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.VERBAL> AffirmingOthersFeelingsIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.VERBAL> AskingQuestionsIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.VERBAL> BeingHonestIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.VERBAL> MakingCommitmentsIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.VERBAL> SayingPersonalThingsIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.VERBAL> SharingSecretsIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.VERBAL> SpeakingWithTendernessIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.VERBAL> ThoughtfulResponsesIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.VERBAL> UsingPetNamesIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.VERBAL> WhisperDramaticallyIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.NONVERBAL> FocusedGazedIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.NONVERBAL> GentleCaressIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.NONVERBAL> HalfClosedEyesIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.NONVERBAL> ImitationBodyLanguageIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.NONVERBAL> LeaningInIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.NONVERBAL> MaintainPhysicalProximityIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.NONVERBAL> NoddingWhileListeningIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.NONVERBAL> OpenBodyPostureIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.NONVERBAL> SteadyEyeContactIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.NONVERBAL> TouchingAffectionatelyIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.ACTION> AnticipatingNeedsIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.ACTION> BuildRelationshipsIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.ACTION> EnhancedIntimacyIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.ACTION> FocusingOnPartnerIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.ACTION> FollowingImpulsesIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.ACTION> OpenToSuggestionsIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.ACTION> PrioritizingPartnerIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.ACTION> RememberingDetailsIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.ACTION> SpendingQualityTimeIntimacyPlan;
    #uses BehaviorPlan<AffectEnum.INTIMACY, AffectEnum.ACTION> SurprisingWithAffectionIntimacyPlan;

}

