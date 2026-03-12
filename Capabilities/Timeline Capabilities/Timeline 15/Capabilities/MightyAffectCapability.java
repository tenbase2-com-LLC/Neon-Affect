/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
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
public capability MightyAffectCapability extends Capability {
    #uses plan ArticulatingVisionClearlyPlan;
    #uses plan ChallengingOthersVocallyPlan;
    #uses plan ConfidentVoiceMightyPlan;
    #uses plan ConfrontingChallengesDirectlyPlan;
    #uses plan DemonstratingSteadfastComposurePlan;
    #uses plan DisplayingExceptionalSkillPlan;
    #uses plan ExibitingControlledStrengthPlan;
    #uses plan EyesFocusedMightyPLan;
    #uses plan GivingInspirationalSpeechesPlan;
    #uses plan IssuingCommandsPlan;
    #uses plan MakingBoldDeclarationsPlan;
    #uses plan MakingQuickDecisionsPlan;
    #uses plan PushingBoundariesPlan;
    #uses plan SpeakingAuthoritativeTonePlan;
    #uses plan StandingFirmMightyPlan;
    #uses plan TakingChargeOfSituationPlan;
    #uses plan UsingBoldGesturesPlan;
    #uses plan UsingPowerfulLanguagePlan;
    #uses plan SetPlanContextMightyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
