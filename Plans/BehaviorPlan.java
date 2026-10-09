package NeonAffect;

import aos.jack.jak.beliefset.BeliefSetException;
import aos.jack.util.thread.Semaphore;

// TEMPLATE for every behaviour plan of the affect capabilities.
//
// A capability creates each behaviour plan with one line:
//
//     #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.VERBAL> ScreamPlan;
//
// Before JAL parses, the JDE's template expander (PlanTemplateExpander) writes
// ScreamPlan.plan from this text: AFFECT becomes the affect (AffectEnum.RAGE),
// and CHANNEL the one
// channel - VERBAL, NONVERBAL or ACTION - the behaviour is activated in. The
// plan gets the capability's name for it, so getPlanName() is unchanged.
//
// The channel is read by the CoJACK configuration generator: the plan is
// written into all three parameter groups of data/cojack_cognitive.xml,
// active in its own channel's group and PLAN_VALUE 0 in the other two.
//
// Every behaviour plan handles the one AffectEvent(iAffect, iLevel): relevant() selects by
// affect, and the run-time level is data on the event (ev.iLevel), not the event type.
//
// This file is not a JDE component: edit it as text. The capability lines are
// kept in each capability's model (.gcap) as verbatim code.
public plan BehaviorPlan<AFFECT, CHANNEL> extends Plan {

    /** The channel this behaviour belongs to: AffectEnum.VERBAL, NONVERBAL or ACTION. */
    public static final String BEHAVIOR_CHANNEL = CHANNEL;

    logical String $name;
    #handles event AffectEvent ev;
    #uses data PlanContextName planContextName;
    #uses data Behavior behaviorName;
    #uses data Semaphore mutex;

    static boolean relevant(AffectEvent ev)
    {
        return ev.iAffect == AFFECT;
    }

    context()
    {
        planContextName.get(0, $name) && ($name.as_string().equals(PlanConstants.ALL_PLANS) || $name.as_string().equals(getPlanName()));
    }

    #reasoning method
    body()
    {
        try
        {
            behaviorName.add(0, getPlanName());
        }
        catch (BeliefSetException e)
        {
            e.printStackTrace();
        }
        finally
        {
            mutex.signal();
        }
    }
}
