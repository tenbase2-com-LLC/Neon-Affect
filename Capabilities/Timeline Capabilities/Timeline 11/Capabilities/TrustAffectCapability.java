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
public capability TrustAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextTrustPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.VERBAL> ApologizingTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.VERBAL> AskingForAdviceTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.VERBAL> BeingHonestTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.VERBAL> ConfidentVoiceTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.VERBAL> ExpressingAgreementTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.VERBAL> GivingComplementsTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.VERBAL> SayingPersonalThingsTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.VERBAL> SharingSecretsTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.VERBAL> SpeakingGentlyTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.VERBAL> WarmToneVoiceTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.NONVERBAL> ForgvvenessTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.NONVERBAL> GentleCaressTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.NONVERBAL> ImitationBodyLanguageTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.NONVERBAL> LeaningInTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.NONVERBAL> ListeningIntentlyTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.NONVERBAL> NoddingWhileListeningTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.NONVERBAL> OpenBodyPostureTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.NONVERBAL> RelaxedPostureTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.NONVERBAL> RelaxedSmileTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.NONVERBAL> StreadyEyeContactTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.ACTION> AppreciativeTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.ACTION> BuildRelationshipsTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.ACTION> EmpathyTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.ACTION> KeepingPromisesTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.ACTION> MakePlansTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.ACTION> OfferingToHelpTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.ACTION> OpenToSuggestionsTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.ACTION> RelyingOnOthersTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.ACTION> SharingResourcesTrustPlan;
    #uses BehaviorPlan<AffectEnum.TRUST, AffectEnum.ACTION> TrustingGutFeelingsTrustPlan;

}

