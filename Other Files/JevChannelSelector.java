package NeonAffect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Interaction-channel selection via TypeSafe Jev, as a single call a JACK plan can make.
 *
 * <p>InteractionPlan asks which ONE channel the agent responds in - verbal, nonverbal
 * or action - given the personality type and the recent history of emotions and the
 * behaviours they produced. Like {@link JevPlanSelector}, this lives in plain Java
 * because it needs a {@code Map<String, String>} of state, which a {@code .plan}
 * cannot build (JAL blanks generic type arguments before the JACK parser runs).
 *
 * <p>The labels are exactly the three answers ContextReply understands, so the result
 * maps straight onto bVerbal, bNonverbal or bAction. On any failure this returns
 * {@link #VERBAL}, the same channel InteractionPlan uses when there is no history yet,
 * so a judge that fails never leaves the agent without a response.
 */
public final class JevChannelSelector {

    public static final String VERBAL = "Verbal";
    public static final String NONVERBAL = "Nonverbal";
    public static final String ACTION = "Action";

    private static final List<String> CHANNELS = Arrays.asList(VERBAL, NONVERBAL, ACTION);

    private JevChannelSelector() {} // non-instantiable

    /**
     * @param affectHistory      the agent's affect history
     * @param behaviorList       the behaviours those affects produced
     * @param strPersonalityType MBTI type, e.g. "INTP"
     * @param bDebug             verbose tracing
     * @return "Verbal", "Nonverbal" or "Action" - never null
     */
    public static String Select(ArrayList<AffectHistoryVar> affectHistory,
                                ArrayList<BehaviorItem> behaviorList,
                                String strPersonalityType,
                                boolean bDebug) {

        try {
            Map<String, String> state = new LinkedHashMap<String, String>();
            state.put("personality_type", strPersonalityType);
            state.put("recent_history",
                AffectBehaviorHistory.FormatLines(affectHistory, behaviorList, System.currentTimeMillis()));

            String strInstructions =
                "Given this Myers-Briggs personality type and this history of emotions and the"
              + " behaviors they produced, in which one channel is the agent most likely to"
              + " respond next: verbal, nonverbal or action?";

            JudgeDecision decision = new JevDecisionJudge(bDebug)
                .Decide(strInstructions, CHANNELS, state);

            if (bDebug) {
                System.out.println("JevChannelSelector: choice [" + decision.label()
                    + "] confidence [" + decision.confidence()
                    + "] margin [" + decision.Margin() + "]");
            }

            if (decision.HasDecision() && CHANNELS.contains(decision.label())) {
                return decision.label();
            }

            System.out.println("JevChannelSelector: WARNING no usable channel from Jev ("
                + decision.label() + "); responding verbally.");
            return VERBAL;

        } catch (Exception e) {
            System.out.println("JevChannelSelector: WARNING Jev call failed (" + e
                + "); responding verbally.");
            return VERBAL;
        }
    }

    /**
     * Mixed emotions: one channel for EACH of two co-occurring emotions, chosen together,
     * so the two are expressed in different channels (e.g. a sharp remark with a smile).
     * Jev chooses among the six ordered pairs of distinct channels. If it cannot answer,
     * the stronger emotion (larger |level|) responds verbally and the other nonverbally.
     *
     * @return {channel for emotion 1, channel for emotion 2} - never null, never equal
     */
    public static String[] SelectPair(int iAffect1, int iLevel1, int iAffect2, int iLevel2,
                                      ArrayList<AffectHistoryVar> affectHistory,
                                      ArrayList<BehaviorItem> behaviorList,
                                      String strPersonalityType,
                                      boolean bDebug) {

        String strName1 = Name(iAffect1);
        String strName2 = Name(iAffect2);

        // "rage: Verbal, joy: Nonverbal" -> {Verbal, Nonverbal}
        Map<String, String[]> pairs = new LinkedHashMap<String, String[]>();
        for (String c1 : CHANNELS) {
            for (String c2 : CHANNELS) {
                if (!c1.equals(c2)) {
                    pairs.put(strName1 + ": " + c1 + ", " + strName2 + ": " + c2, new String[] {c1, c2});
                }
            }
        }

        try {
            Map<String, String> state = new LinkedHashMap<String, String>();
            state.put("personality_type", strPersonalityType);
            state.put("emotion_1", Describe(iAffect1, iLevel1));
            state.put("emotion_2", Describe(iAffect2, iLevel2));
            state.put("recent_history",
                AffectBehaviorHistory.FormatLines(affectHistory, behaviorList, System.currentTimeMillis()));

            String strInstructions =
                "The agent has this Myers-Briggs personality type and is feeling both emotions at"
              + " once. Each emotion is expressed in a different channel - verbal, nonverbal or"
              + " action. Which assignment of channels to the two emotions is most characteristic?";

            JudgeDecision decision = new JevDecisionJudge(bDebug)
                .Decide(strInstructions, new ArrayList<String>(pairs.keySet()), state);

            if (bDebug) {
                System.out.println("JevChannelSelector: pair choice [" + decision.label()
                    + "] confidence [" + decision.confidence() + "]");
            }

            if (decision.HasDecision() && pairs.containsKey(decision.label())) {
                return pairs.get(decision.label());
            }

            System.out.println("JevChannelSelector: WARNING no usable channel pair from Jev ("
                + decision.label() + "); stronger emotion verbal, the other nonverbal.");

        } catch (Exception e) {
            System.out.println("JevChannelSelector: WARNING Jev call failed (" + e
                + "); stronger emotion verbal, the other nonverbal.");
        }

        if (Math.abs(iLevel1) >= Math.abs(iLevel2)) {
            return new String[] {VERBAL, NONVERBAL};
        }
        return new String[] {NONVERBAL, VERBAL};
    }

    /** "rage (level -4)" - how an emotion is described to the judge. */
    public static String Describe(int iAffect, int iLevel) {
        return Name(iAffect) + " (level " + Integer.toString(iLevel) + ")";
    }

    private static String Name(int iAffect) {
        try {
            return AffectEnum.GetName(iAffect).toLowerCase();
        } catch (Exception e) {
            return "emotion " + Integer.toString(iAffect);
        }
    }
}
