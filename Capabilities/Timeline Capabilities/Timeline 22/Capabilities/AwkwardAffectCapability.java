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
public capability AwkwardAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAwkwardPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.VERBAL> ApologizingAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.VERBAL> ChangingSubjectAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.VERBAL> ClearThroatAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.VERBAL> LaughterAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.VERBAL> RedirectingConversationAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.VERBAL> SelfDeprecatingHumorAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.VERBAL> SpeakingQuicklyAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.VERBAL> StutteringAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.VERBAL> TrailingOffMidSentenceAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.VERBAL> UsingFillerWordsAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.NONVERBAL> AvoidingEyeContactAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.NONVERBAL> BlushingAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.NONVERBAL> FidgetingAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.NONVERBAL> LickingLipsEmbarrassedlAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.NONVERBAL> NervousSmileAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.NONVERBAL> PlayingWithHairAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.NONVERBAL> RubBackOfNeckAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.NONVERBAL> ShiftWeightAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.NONVERBAL> SmoothingClothesAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.NONVERBAL> StiffPostureAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.ACTION> AvoidingAttentionAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.ACTION> AvoidingConversationsAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.ACTION> BecomingBusyAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.ACTION> ClumsinessAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.ACTION> DivertingAttentionAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.ACTION> DwellingOnEmbarrassmentAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.ACTION> ExitBirefllyAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.ACTION> MakeBestSituationAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.ACTION> OfferRefreshmentAwkwardPlan;
    #uses BehaviorPlan<AffectEnum.AWKWARD, AffectEnum.ACTION> OverthinkingSocialSituationsAwkwardPlan;

}

