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
public capability AcceptanceAffectCapability extends Capability {
    #uses plan TakeBreathPlan;
    #uses plan NoddingPlan;
    #uses plan SlowSmileAcceptancePlan;
    #uses plan EyesFocusedPlan;
    #uses plan AdoptGesturePlan;
    #uses plan TellingJokesAcceptancePlan;
    #uses plan PeaceOfferingPlan;
    #uses plan ListeningIntentlyPlan;
    #uses plan BeingHonestPlan;
    #uses plan LightLaughterPlan;
    #uses plan StrongEyeContactAcceptancePlan;
    #uses plan AskingForAdvicePlan;
    #uses plan MakePlansPlan;
    #uses plan ForgivenessPlan;
    #uses plan ShareMomentPlan;
    #uses plan LettingThingsGoPlan;
    #uses plan ConfidencePlan;
    #uses plan PurposefulPlan;
    #uses plan ForgingStrongRelationshipsPlan;
    #uses plan BeingOptimisticPlan;
    #uses plan HeavySighPlan;
    #uses plan ClarfiyDelayResponsePlan;
    #uses plan PurseLipsAcceptancePlan;
    #uses plan TeasingPlan;
    #uses plan SetMockConditionsPlan;
    #uses plan SlowIndicisiveResponsePlan;
    #uses plan SetPlanContextAcceptancePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
