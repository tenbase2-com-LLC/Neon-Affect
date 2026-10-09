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
public capability AdmiredAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAdmiredPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.VERBAL> ArticulatedSpeechAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.VERBAL> CharmingAnecdotesPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.VERBAL> ComplimentAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.VERBAL> EncouragingOthersAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.VERBAL> GivingAdviceAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.VERBAL> GraciousAcceptancePlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.VERBAL> HumbleAcknowledgementsPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.VERBAL> InspiringSpeechPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.VERBAL> PersuasiveSpeechAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.VERBAL> ThoughtfulResponsesPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.NONVERBAL> ComposedDemeanerPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.NONVERBAL> EyeContactAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.NONVERBAL> FacialExpressionsAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.NONVERBAL> GracefulHandGesturesAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.NONVERBAL> ListeningIntentlyAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.NONVERBAL> MagneticPresencePlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.NONVERBAL> OpenGesturesPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.NONVERBAL> RegalBearingPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.NONVERBAL> SmilingAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.NONVERBAL> StiffPosureAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.ACTION> CompassionatePlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.ACTION> CultivatingExcellencePlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.ACTION> DecisionMakingAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.ACTION> DemonstratingHumilityAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.ACTION> EasyGoingMannerAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.ACTION> FosteringOthersGrowthPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.ACTION> LeadByExampleAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.ACTION> MaintainingIntegrityPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.ACTION> ProblemSolvingAdmiredPlan;
    #uses BehaviorPlan<AffectEnum.ADMIRED, AffectEnum.ACTION> SkilllApplicationAdmiredPlan;

}

