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
public capability DiscouragedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDiscouragedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.VERBAL> AcknowledgingMistakesDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.VERBAL> AskForHelpDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.VERBAL> ComplainFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.VERBAL> ConfidingInadequecyPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.VERBAL> ExpressingHopelessnessDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.VERBAL> LessTalkativeDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.VERBAL> PessimisticStatementsDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.VERBAL> PutOneselfDownDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.VERBAL> SelfNegativeTalkDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.VERBAL> SwearingDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.NONVERBAL> AvoidingEyeContactDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.NONVERBAL> BadPostureDiuscouragedPLan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.NONVERBAL> DropShouldersDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.NONVERBAL> FidgetingDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.NONVERBAL> LongExhaleDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.NONVERBAL> LookDownDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.NONVERBAL> RubBackOfNeckDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.NONVERBAL> ShakingHeadDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.NONVERBAL> SighDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.NONVERBAL> TearingUpDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.ACTION> AvoidingChallengesPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.ACTION> GiveUpGoalPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.ACTION> IgnoringResponsbilitiesPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.ACTION> LackOfMotivationDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.ACTION> MakingMistakesPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.ACTION> ProcrastinatePlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.ACTION> RethinkingPastDecisionDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.ACTION> SeekingAlternativeOptionsDiscouragedPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.ACTION> SeekingComfortPlan;
    #uses BehaviorPlan<AffectEnum.DISCOURAGED, AffectEnum.ACTION> SelfDoubtDiscouragedPlan;

}

