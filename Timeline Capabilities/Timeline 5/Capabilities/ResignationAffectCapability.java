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
public capability ResignationAffectCapability extends Capability {
    #uses plan SighResignationPlan;
    #uses plan BlankFeaturesPlan;
    #uses plan BadPostureResignationPlan;
    #uses plan TearingUpResignationPlan;
    #uses plan MonotoneVoiceResignationPlan;
    #uses plan LessTalkativePlan;
    #uses plan DullEyesResignationPlan;
    #uses plan TremblingChinPlan;
    #uses plan AnsweringWithNodPlan;
    #uses plan LossOfAppetiteResignationPlan;
    #uses plan AvoidingEyeContactResignationPlan;
    #uses plan LossForWordsPlan;
    #uses plan ShakingHeadResignationPlan;
    #uses plan UnemotionallyAgreePlan;
    #uses plan ShrugPlan;
    #uses plan LongExhalePlan;
    #uses plan MumblingResignationPlan;
    #uses plan SlowReactionPlan;
    #uses plan OneWordAnswerPlan;
    #uses plan LackOfEmotionPlan;
    #uses plan MakeBestSituationPlan;
    #uses plan InabilityToFocusResignationPlan;
    #uses plan DirectionlessPlan;
    #uses plan ConfusionResignationPlan;
    #uses plan NeverBeSamePlan;
    #uses plan PowerlessFuturePlan;
    #uses plan PessimisticThoughtsPlan;
    #uses plan DepressionResignationPlan;
    #uses plan RetreatingInwardPlan;
    #uses plan DisconnectingFromOthersPlan;
    #uses plan DoubtingSelfResignationPlan;
    #uses plan ApatheticPlan;
    #uses plan SubmissivePlan;
    #uses plan SetPlanContextResignationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
