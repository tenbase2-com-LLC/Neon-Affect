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
public capability MacabreAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextMacabrePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.VERBAL> DescribingDetailsMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.VERBAL> DiscussingDisturbingTopicsPlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.VERBAL> HarshLaughterMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.VERBAL> JokingMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.VERBAL> LaughingSuddenlyDarkPlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.VERBAL> SpeakingCrypticallyPlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.VERBAL> SpeakingFlatVoiceMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.VERBAL> SpeakingMatterOfFactMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.VERBAL> SpeakingSlowlyMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.VERBAL> WhisperDramaticallyPlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.NONVERBAL> BlankStareMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.NONVERBAL> EyeContactDroppingMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.NONVERBAL> HeadTiltingToSideMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.NONVERBAL> IntenseGazeMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.NONVERBAL> LongPauseBeforeRespondingMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.NONVERBAL> MovingSlowlyMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.NONVERBAL> SmirkMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.NONVERBAL> SquintingMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.NONVERBAL> StandingStillMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.NONVERBAL> StaringMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.ACTION> DsitancingOneselfMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.ACTION> ExaminingDetailsMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.ACTION> FantasizingMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.ACTION> HypotheticalThinkingMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.ACTION> IgnoringMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.ACTION> IsolationMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.ACTION> ResearchingTopicFurtherMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.ACTION> SeekingDisturbingKnowledgePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.ACTION> ShareExperienceMacabrePlan;
    #uses BehaviorPlan<AffectEnum.MACABRE, AffectEnum.ACTION> WantingNewExperiencesMacabrePlan;

}

