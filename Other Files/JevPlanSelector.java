package NeonAffect;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Plan selection via TypeSafe Jev, as a single call a JACK plan can make.
 *
 * <p>This facade exists because {@link JevDecisionJudge#Decide} takes a
 * {@code Map<String, String>} of state, and a {@code .plan} file cannot build one: JAL
 * blanks generic type arguments before the JACK parser runs, so the type checker sees a
 * raw {@code Map} and will not resolve {@code put(String, String)} against
 * {@code put(Object, Object)}. Everything involving maps therefore stays on this side,
 * and PlanSelectorPlan passes only Strings, a boolean and an ArrayList.
 *
 * <h2>What Jev gets that the prompt could not give it</h2>
 * The OpenAI path narrates the emotion, modality and personality type into one English
 * sentence and asks for a numbered list back. Jev takes them as separate fields of
 * structured state and answers over a declared option set, so the personality type is an
 * input rather than a phrase, and the reply cannot come back reordered, truncated or
 * unparseable.
 */
public final class JevPlanSelector {

    private JevPlanSelector() {} // non-instantiable

    /**
     * @param planNames          candidate plans, fully qualified
     * @param strEmotion         e.g. "rage"
     * @param strInteractionType "verbal", "nonverbal" or "action"
     * @param strPersonalityType MBTI type, e.g. "INTP"
     * @param bDebug             verbose tracing
     * @return one {@link SelectedPlan} per candidate, ready to reply with
     */
    public static ArrayList<SelectedPlan> Select(ArrayList<String> planNames,
                                                 String strEmotion,
                                                 String strInteractionType,
                                                 String strPersonalityType,
                                                 boolean bDebug) {

        if (planNames == null || planNames.isEmpty()) {
            return new ArrayList<SelectedPlan>();
        }

        try {
            ArrayList<String> labels = PlanSelectionResolver.DisplayNames(planNames, strEmotion);

            Map<String, String> state = new LinkedHashMap<String, String>();
            state.put("personality_type", strPersonalityType);
            state.put("emotion", strEmotion);
            state.put("modality", strInteractionType);

            String strInstructions =
                "The agent has this Myers-Briggs personality type and is experiencing this emotion."
              + " Which of these " + strInteractionType + " behaviours is most characteristic of that"
              + " type in that state?";

            JudgeDecision decision = new JevDecisionJudge(bDebug)
                .Decide(strInstructions, labels, state);

            if (bDebug) {
                System.out.println("JevPlanSelector: choice [" + decision.label()
                    + "] confidence [" + decision.confidence()
                    + "] margin [" + decision.Margin() + "]");
            }

            return PlanSelectionResolver.Resolve(planNames, decision, strEmotion, bDebug);

        } catch (Exception e) {
            // A judge that fails is not a reason to leave every PLAN_VALUE unset - that
            // would give CoJACK nothing to select and stall the waiting agent. Fall back
            // to a uniform field, loudly, the same way an unusable response is handled.
            System.out.println("JevPlanSelector: WARNING Jev call failed (" + e
                + "); falling back to a uniform field over "
                + Integer.toString(planNames.size()) + " plans.");

            return PlanSelectionResolver.Resolve(planNames, JudgeDecision.None("jev"),
                                                 strEmotion, bDebug);
        }
    }
}
