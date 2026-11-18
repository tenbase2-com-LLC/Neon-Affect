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
public capability InjusticeAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextInjusticePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.VERBAL> ArguingInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.VERBAL> BlameInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.VERBAL> ChallengeViewpointInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.VERBAL> ComplainInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.VERBAL> DemandExplanationPlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.VERBAL> MutteringInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.VERBAL> RaisingVoiceInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.VERBAL> SarcasmInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.VERBAL> SwearingInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.VERBAL> VoiceAccusatoryToneInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.NONVERBAL> ClenchedJawInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.NONVERBAL> FrownInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.NONVERBAL> GaspInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.NONVERBAL> HandsOnHipsInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.NONVERBAL> MakeFistInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.NONVERBAL> PointingFingerAccusatoryInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.NONVERBAL> RollingEyesInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.NONVERBAL> ShakingHeadInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.NONVERBAL> StiffPostureInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.NONVERBAL> ThrowingHandsUpInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.ACTION> ConfrontChallengesDirectlyInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.ACTION> RebelliousInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.ACTION> RefusingToObeyInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.ACTION> RelivingWrongfulEventsInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.ACTION> ResistanceToCompromiseInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.ACTION> RuminationOverGrievancesInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.ACTION> SetThingsRightInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.ACTION> TakingRevengeInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.ACTION> UnforgivingInjusticePlan;
    #uses BehaviorPlan<AffectEnum.INJUSTICE, AffectEnum.ACTION> WithdrawingFromOthersInjusticePlan;

}

