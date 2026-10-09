package NeonAffect;

import OpenAIClassLibrary.OpenAI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * {@link DecisionJudge} backed by the existing OpenAI wrapper.
 *
 * <p>This exists so the judging interface works today, against the model
 * Neon-Affect already calls, with no new vendor and no new credentials. It is also
 * the natural comparison arm when measuring whether a cheaper decision-only judge
 * agrees with the incumbent.
 *
 * <p>Note what this adapter is doing: it asks a <em>generative</em> model for a
 * numbered list of percentages, then reduces that prose to a typed decision. That
 * round trip is exactly the cost the decision-only judges avoid - we pay to generate
 * tokens we immediately discard. Keeping it behind the same interface makes the
 * difference measurable rather than theoretical.
 */
public class OpenAIDecisionJudge implements DecisionJudge {

    private final boolean bDebug;

    public OpenAIDecisionJudge(boolean bDebug) {
        this.bDebug = bDebug;
    }

    @Override
    public String GetName() {
        return "openai";
    }

    @Override
    public JudgeDecision Decide(String strInstructions,
                                List<String> labels,
                                Map<String, String> context) throws Exception {

        if (labels == null || labels.isEmpty()) {
            return JudgeDecision.None(GetName());
        }

        String strPrompt = BuildPrompt(strInstructions, labels, context);

        if (bDebug) {
            System.out.println("OpenAIDecisionJudge: prompt [" + strPrompt + "]");
        }

        ArrayList<OpenAI.PlanResult> ret = new OpenAI().determineSelectedPlans(strPrompt);

        if (ret == null || ret.isEmpty()) {
            return JudgeDecision.None(GetName());
        }

        // Match on the name the model echoed back, never on list position - the model
        // is free to reorder, omit or duplicate rows.
        Map<String, Integer> scores = new HashMap<String, Integer>();

        for (OpenAI.PlanResult result : ret) {
            String strKey = PlanUtils.NormaliseName(result.name());
            int iPct = PlanUtils.ParsePercentage(result.percentage());

            if (strKey.isEmpty() || iPct < 0) {
                if (bDebug) {
                    System.out.println("OpenAIDecisionJudge: discarding row name ["
                        + result.name() + "] percentage [" + result.percentage() + "]");
                }
                continue;
            }

            Integer existing = scores.get(strKey);
            if (existing == null || iPct > existing.intValue()) {
                scores.put(strKey, Integer.valueOf(iPct));
            }
        }

        Map<String, Double> probabilities = DecisionJudge.Normalise(labels, scores);

        String strBest = null;
        double dBest = 0.0;

        for (Map.Entry<String, Double> e : probabilities.entrySet()) {
            if (e.getValue().doubleValue() > dBest) {
                dBest = e.getValue().doubleValue();
                strBest = e.getKey();
            }
        }

        if (strBest == null) {
            return JudgeDecision.None(GetName());
        }

        return new JudgeDecision(strBest, probabilities, dBest, GetName());
    }

    private String BuildPrompt(String strInstructions, List<String> labels, Map<String, String> context) {
        StringBuilder sb = new StringBuilder();

        sb.append(strInstructions).append("\n");

        if (context != null) {
            for (Map.Entry<String, String> e : context.entrySet()) {
                sb.append(e.getKey()).append(": ").append(e.getValue()).append("\n");
            }
        }

        int iCount = 1;
        for (String strLabel : labels) {
            sb.append(Integer.toString(iCount++)).append(".  ").append(strLabel).append("\n");
        }

        sb.append("Do not add to this list.\n");
        sb.append("Please respond like this: 1. Crying Pain - 15%\n");

        return sb.toString();
    }
}
