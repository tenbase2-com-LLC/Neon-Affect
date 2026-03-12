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
public capability CarefreeAffectCapability extends Capability {
    #uses plan AvoidingOverplanningPlan;
    #uses plan BeingFlexiblePlan;
    #uses plan ChoosingOptimismPlan;
    #uses plan DismissingWorriesPlan;
    #uses plan EmbracingSpontaneityPlan;
    #uses plan EmbracingUncertaintyPlan;
    #uses plan EncouragingSpontaneityPlan;
    #uses plan ExpressingOptimismPlan;
    #uses plan FacialExpressionsCarefreePlan;
    #uses plan FluidMovementCarefreePlan;
    #uses plan FocusingOnMomentPlan;
    #uses plan JokingCarefreePlan;
    #uses plan LaughingFrequentlyPlan;
    #uses plan LettingGoConcernsPlan;
    #uses plan MakingCasualGesturesPlan;
    #uses plan MinimizingStressorsPlan;
    #uses plan OpenPostureCarefreePlan;
    #uses plan RelaxedPostureCarefreePlan;
    #uses plan SeekingEnjoyableActivitiesPlan;
    #uses plan SharingWhimsicalThoughtsCarefreePlan;
    #uses plan SmilingCarefreePlan;
    #uses plan SpeakingLightlyPlan;
    #uses plan TakingThingsLightlyPlan;
    #uses plan UsingPlayfulLanguagePlan;
    #uses plan SetPlanContextCarefreePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
