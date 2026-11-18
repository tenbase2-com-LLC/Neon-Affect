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
public capability AngryAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAngryPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.VERBAL> ClammingUpAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.VERBAL> CuttingPeopleOffPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.VERBAL> DemandExplanationAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.VERBAL> JumpingToConclusionsPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.VERBAL> MutteringAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.VERBAL> RaisingVoiceAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.VERBAL> SarcasmPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.VERBAL> SpeakingInChallengingToneAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.VERBAL> SwearingAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.VERBAL> YellingAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.NONVERBAL> ClenchedJawAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.NONVERBAL> ClenchedTeethAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.NONVERBAL> CrossingArmsAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.NONVERBAL> ExhaleThroughNoseAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.NONVERBAL> FlushedFacePlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.NONVERBAL> FrownAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.NONVERBAL> MakeFistAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.NONVERBAL> PointingFingerAccusatoryAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.NONVERBAL> StaringDownAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.NONVERBAL> ThrowingHandsUpAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.ACTION> CloudedJudgementAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.ACTION> DemandingImmediateActionPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.ACTION> ExplodingOverLittleThingsPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.ACTION> IrrationalReactionsPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.ACTION> IrritabilityPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.ACTION> PickingFightsPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.ACTION> PoorListeningSkillsPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.ACTION> RefusingToCompromiseAngryPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.ACTION> TakingInappropriateActionsPlan;
    #uses BehaviorPlan<AffectEnum.ANGRY, AffectEnum.ACTION> WithdrawingFromOthersAngryPlan;

}

