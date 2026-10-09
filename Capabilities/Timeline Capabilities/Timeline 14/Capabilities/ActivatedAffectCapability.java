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
public capability ActivatedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextActivatedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.VERBAL> AnimatedDiscussionPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.VERBAL> AskingQuestionsActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.VERBAL> ChangingTopicActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.VERBAL> DetailedExplanationsActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.VERBAL> ExpressingReadinessActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.VERBAL> InterruptingOthersActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.VERBAL> SharingIdeasActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.VERBAL> SpeakingQuicklyLouderActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.VERBAL> VerbalizingExcitementPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.VERBAL> VerbalizingThoughtsActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.NONVERBAL> EyesWideOpenActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.NONVERBAL> FidgetingActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.NONVERBAL> FocusedAttentionActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.NONVERBAL> LeanInActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.NONVERBAL> MaintainEyeContactActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.NONVERBAL> NoddingActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.NONVERBAL> PushUpSleavesActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.NONVERBAL> QuickHeadMovementsActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.NONVERBAL> RapidEyeMovementsActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.NONVERBAL> ShiftWeiightActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.ACTION> BrainstormingIdeasPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.ACTION> EagernessToPlanActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.ACTION> EnergenicActivityActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.ACTION> FocusedActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.ACTION> ImmersingSelfInProjectsPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.ACTION> MultitaskingActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.ACTION> QuickToActionActivatedPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.ACTION> RapidProblemSolvingPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.ACTION> SeekingNewStimuliPlan;
    #uses BehaviorPlan<AffectEnum.ACTIVATED, AffectEnum.ACTION> TakingOnMultipleProjectsPlan;

}

