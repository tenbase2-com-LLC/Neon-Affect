package NeonAffect;

import java.util.ArrayList;

/**
 * Pairs each recorded behaviour with the emotion the agent was actually in when it
 * produced that behaviour, and renders the result as prompt lines.
 *
 * <h2>The bug this replaces</h2>
 * Both InteractionPlan and DecidePlan looped over {@code behaviorList} while reading
 * {@code affectHistory.get(0)} - index zero, not the loop index. Every numbered line
 * therefore reported the <em>same</em> emotion against a different behaviour, so the
 * judge was shown a history that never happened.
 *
 * <p>The obvious repair - {@code affectHistory.get(i)} - is wrong too. The two lists
 * are built from different sources in {@code NeonAffectAgent.GetAffectHistoryBehaviors()}
 * and are not parallel: the size-equality guard is commented out in both plans, and
 * errors.txt records an {@code IndexOutOfBoundsException} from exactly this family.
 * Indexing by position would turn a silent wrong answer into a crash.
 *
 * <h2>What it does instead</h2>
 * Both {@link AffectHistoryVar} and {@link BehaviorItem} carry a timestamp, so each
 * behaviour is matched to the most recent affect entry at or before it - the emotional
 * state the agent was in at the moment it acted. That is what the generated sentence
 * has always claimed, and it degrades sensibly when the lists differ in length. A
 * behaviour older than every affect entry falls back to the earliest one rather than
 * being dropped.
 *
 * <p>Lives in plain Java so the pairing is unit-testable without standing up an agent,
 * and so both plans share one implementation instead of two copies that can drift.
 */
public final class AffectBehaviorHistory {

    private AffectBehaviorHistory() {} // non-instantiable

    /** One behaviour matched to the emotion in force when it happened. */
    public record Pairing(BehaviorItem behavior, AffectHistoryVar affect, long lSecondsAgo) {}

    /**
     * @param affectHistory recorded affect entries, any order
     * @param behaviorList  recorded behaviours, any order
     * @param lNow          reference time, normally {@code System.currentTimeMillis()}
     * @return one pairing per behaviour, in behaviour order; empty when either list is empty
     */
    public static ArrayList<Pairing> Pair(ArrayList<AffectHistoryVar> affectHistory,
                                          ArrayList<BehaviorItem> behaviorList,
                                          long lNow) {

        ArrayList<Pairing> out = new ArrayList<Pairing>();

        if (affectHistory == null || affectHistory.isEmpty()
            || behaviorList == null || behaviorList.isEmpty()) {
            return out;
        }

        for (int i = 0; i < behaviorList.size(); i++) {
            BehaviorItem behavior = behaviorList.get(i);
            if (behavior == null) continue;

            AffectHistoryVar match = MatchAffect(affectHistory, behavior.GetTime());
            if (match == null) continue;

            long lSecondsAgo = (lNow - behavior.GetTime()) / 1000L;

            out.add(new Pairing(behavior, match, lSecondsAgo));
        }

        return out;
    }

    /**
     * The affect entry in force at {@code lBehaviorTime}: the latest entry at or before
     * that moment. Falls back to the earliest entry overall when the behaviour predates
     * all recorded affect, so a behaviour is never silently dropped.
     */
    private static AffectHistoryVar MatchAffect(ArrayList<AffectHistoryVar> affectHistory,
                                                long lBehaviorTime) {
        AffectHistoryVar best = null;
        AffectHistoryVar earliest = null;

        for (int i = 0; i < affectHistory.size(); i++) {
            AffectHistoryVar candidate = affectHistory.get(i);
            if (candidate == null) continue;

            if (earliest == null || candidate.GetTime() < earliest.GetTime()) {
                earliest = candidate;
            }

            if (candidate.GetTime() <= lBehaviorTime) {
                if (best == null || candidate.GetTime() > best.GetTime()) {
                    best = candidate;
                }
            }
        }

        return (best != null) ? best : earliest;
    }

    /**
     * Renders the paired history as the numbered lines both prompts use. Callers supply
     * their own instruction header; only these lines are shared.
     *
     * <p>Format is unchanged from the original, including whole-second durations, so the
     * only behavioural difference is which emotion each line names.
     */
    public static String FormatLines(ArrayList<AffectHistoryVar> affectHistory,
                                     ArrayList<BehaviorItem> behaviorList,
                                     long lNow) throws Exception {

        ArrayList<Pairing> pairings = Pair(affectHistory, behaviorList, lNow);

        StringBuilder sb = new StringBuilder();
        int iCount = 1;

        for (int i = 0; i < pairings.size(); i++) {
            Pairing p = pairings.get(i);

            sb.append(Integer.toString(iCount++))
              .append(".  A ")
              .append(AffectEnum.GetName(p.affect().GetType()))
              .append(" emotion occurred with a ")
              .append(p.behavior().GetBehaviorName())
              .append(" behavior at ")
              .append(Long.toString(p.lSecondsAgo()))
              .append(" seconds ago.\n");
        }

        return sb.toString();
    }
}
