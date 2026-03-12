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
public capability EnjoymentAffectCapability extends Capability {
    #uses plan CaptureMemoryPlan;
    #uses plan ComplimentEnjoymentPlan;
    #uses plan CreativityPlan;
    #uses plan EagerConversationPlan;
    #uses plan EmbraceNewExperiencePlan;
    #uses plan EngagedParticiapationPlan;
    #uses plan EnthusiasticExclamationPlan;
    #uses plan ExpressingGratitudeEnjoymentPlan;
    #uses plan EyesSatisifiedPlan;
    #uses plan FacialExpressionsEnjoymentPlan;
    #uses plan GesturesEnjoymentPlan;
    #uses plan LaughingEnjoymentPlan;
    #uses plan LivingForTheMomentPlan;
    #uses plan NoddingEnjoymentPlan;
    #uses plan OpenPostureEnjoymentPlan;
    #uses plan OptimisticPlan;
    #uses plan PlayfulnessEnjoymentPlan;
    #uses plan PositiveAffirmationPlan;
    #uses plan SeekingPleasurePlan;
    #uses plan SighEnjoymentPlan;
    #uses plan SmilingEnjoymentPlan;
    #uses plan VoicePleasantTonePlan;
    #uses plan SetPlanContextEnjoymentPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
