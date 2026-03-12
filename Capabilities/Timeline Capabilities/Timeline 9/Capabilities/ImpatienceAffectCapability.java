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
public capability ImpatienceAffectCapability extends Capability {
    #uses plan ScowlingPlan;
    #uses plan LookingUpwardImpatiencePlan;
    #uses plan ArmsCrosseImpatiencePlan;
    #uses plan StiffPostureImpatiencePlan;
    #uses plan TappingFootPlan;
    #uses plan PurseLipsImpatiencePlan;
    #uses plan CheckWatchPlan;
    #uses plan ClenchedTeethPlan;
    #uses plan FidgetingImpatiencePlan;
    #uses plan SquintEyesImpatiencePlan;
    #uses plan TalkingOverOthersPlan;
    #uses plan AbnoxiousImpatiencePlan;
    #uses plan NotEasilyDistractedImpatiencePlan;
    #uses plan FrownImpatiencePlan;
    #uses plan SharpTonePlan;
    #uses plan MassagingTemplesPlan;
    #uses plan SensitiveNoiseImpatiencePlan;
    #uses plan DeepExhalePlan;
    #uses plan ShakingHeadImpatiencePlan;
    #uses plan SarcasmPatiencePlan;
    #uses plan GetThingsGoingPlan;
    #uses plan YellingImpatiencePlan;
    #uses plan InattentiveImpatiencePlan;
    #uses plan InterruptingImpatiencePlan;
    #uses plan GettingToPointSpeechPlan;
    #uses plan SetTimeLimitPlan;
    #uses plan MakeDemandsPlan;
    #uses plan SetPlanContextImpatiencePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
