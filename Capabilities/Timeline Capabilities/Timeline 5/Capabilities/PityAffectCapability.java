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
public capability PityAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextPityPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.VERBAL> AskingHowToHelpPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.VERBAL> CommunicateUnderstandingPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.VERBAL> CondescendingPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.VERBAL> MakingTskNoisePlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.VERBAL> OfferingEncouragementSupportPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.VERBAL> OfferingHopePlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.VERBAL> SpeakingCarefullyPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.VERBAL> SpeakingGentlyPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.VERBAL> SpeakingSoftlyPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.VERBAL> ValidsatingFeelingsPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.NONVERBAL> AngledBodyPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.NONVERBAL> BadPosturePityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.NONVERBAL> ClearThroatPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.NONVERBAL> DirtyLookPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.NONVERBAL> ExpectationLookPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.NONVERBAL> HalfSmilePlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.NONVERBAL> LookAwayPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.NONVERBAL> LoweredEyeContactPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.NONVERBAL> ShakingHeadPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.NONVERBAL> SighPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.NONVERBAL> TiltHeadPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.ACTION> AvoidingPersonPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.ACTION> BeingGenerousPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.ACTION> ConsideringOthersPerspectivesPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.ACTION> GuiltPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.ACTION> HelpfulnessPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.ACTION> ListeningNoJudgementPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.ACTION> OfferingToHelpPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.ACTION> ProvideListeningEarPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.ACTION> ShowingConcernPityPlan;
    #uses BehaviorPlan<AffectEnum.PITY, AffectEnum.ACTION> UnderestimatingOthersPityPlan;

}

