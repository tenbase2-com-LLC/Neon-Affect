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
public capability AdmiredAffectCapability extends Capability {
    #uses plan ArticulatedSpeechAdmiredPlan;
    #uses plan CharmingAnecdotesPlan;
    #uses plan CompassionatePlan;
    #uses plan ComplimentAdmiredPlan;
    #uses plan ComposedDemeanerPlan;
    #uses plan CultivatingExcellencePlan;
    #uses plan DecisionMakingAdmiredPlan;
    #uses plan EncouragingOthersAdmiredPlan;
    #uses plan EyeContactAdmiredPlan;
    #uses plan FacialExpressionsAdmiredPlan;
    #uses plan FosteringOthersGrowthPlan;
    #uses plan GivingAdviceAdmiredPlan;
    #uses plan GracefulHandGesturesAdmiredPlan;
    #uses plan GraciousAcceptancePlan;
    #uses plan HumbleAcknowledgementsPlan;
    #uses plan InspiringSpeechPlan;
    #uses plan LeadByExampleAdmiredPlan;
    #uses plan ListeningIntentlyAdmiredPlan;
    #uses plan MagneticPresencePlan;
    #uses plan MaintainingIntegrityPlan;
    #uses plan OpenGesturesPlan;
    #uses plan PersuasiveSpeechAdmiredPlan;
    #uses plan ProblemSolvingAdmiredPlan;
    #uses plan RegalBearingPlan;
    #uses plan SkilllApplicationAdmiredPlan;
    #uses plan SmilingAdmiredPlan;
    #uses plan StiffPosureAdmiredPlan;
    #uses plan ThoughtfulResponsesPlan;
    #uses plan SetPlanContextAdmiredPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
