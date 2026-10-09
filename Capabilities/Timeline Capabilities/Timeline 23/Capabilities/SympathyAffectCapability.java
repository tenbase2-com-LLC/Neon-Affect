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
public capability SympathyAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextSympathyPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.VERBAL> ActiveListeningResponsesSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.VERBAL> AskingHowToHelpSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.VERBAL> CommunicateUnderstandingSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.VERBAL> OfferingAdviceSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.VERBAL> OfferingEncouragementSupportSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.VERBAL> OfferingHopeSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.VERBAL> SpeakingCarefullySympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.VERBAL> SpeakingGentlySympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.VERBAL> SpeakingSoftlySympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.VERBAL> ValidsatingFeelingsSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.NONVERBAL> EyeContactSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.NONVERBAL> FaceConcernedSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.NONVERBAL> FaceSoftSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.NONVERBAL> GentleCaressSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.NONVERBAL> HalfSmileSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.NONVERBAL> LeaningInSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.NONVERBAL> ListeningIntentlySympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.NONVERBAL> NoddingSlowlySympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.NONVERBAL> OpenBodyPostureSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.NONVERBAL> TiltHeadSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.ACTION> BeingGenerousSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.ACTION> ConsideringOthersPerspectivesSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.ACTION> GivingSpaceSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.ACTION> HelpfulnessSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.ACTION> ListeningNoJudgementSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.ACTION> OfferingHugSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.ACTION> OfferingToHelpSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.ACTION> ProvideListeningEarSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.ACTION> ProvideUsefulInformationSympathyPlan;
    #uses BehaviorPlan<AffectEnum.SYMPATHY, AffectEnum.ACTION> ShowingConcernSympathyPlan;

}

