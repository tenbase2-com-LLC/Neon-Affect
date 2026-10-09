package NeonAffect;

import java.util.HashMap;
import java.util.Map;

/**
 * Hand-authored appraisal vectors, for offline and deterministic runs.
 *
 * <p>Tuning the prototypes in the sixteen {@code *_PersonalityTypeAppraisals}
 * files means running the classifier over the same few situations repeatedly
 * and watching which affect wins. Doing that against a live model costs money
 * per iteration and, worse, moves the input while the thing under test is also
 * moving - a classification that changes between runs tells you nothing about
 * whether the prototype edit helped.</p>
 *
 * <p>So this source returns a fixed vector for a registered key and refuses
 * anything else. It does not fall back to a neutral vector or to the network:
 * a test that silently starts costing money, or that silently starts comparing
 * against 0.5s, is worse than one that stops.</p>
 *
 * <p>The four situations below are starting points chosen to separate the
 * appraisal dimensions that the classifier most often confuses, not to be
 * realistic. Add your own with {@link #put}.</p>
 */
public final class ScriptedAppraisalSource implements IAppraisalSource {

    private final Map<String, AffectAppraisal> byKey = new HashMap<>();
    private final boolean bDebug;

    public ScriptedAppraisalSource(boolean bDebug) {
        this.bDebug = bDebug;
        seed();
    }

    /**
     * Registers a vector. The key is matched case-insensitively against the
     * situation text after trimming.
     *
     * @param values 24 floats in {@link AppraisalDimensions#JSON} order
     */
    public void put(String situationKey, float[] values) {
        byKey.put(normalise(situationKey), AppraisalDimensions.toAppraisal(values));
    }

    @Override
    public AffectAppraisal DetermineAppraisal(String situation,
                                              String personalityType)
        throws Exception {

        AffectAppraisal a = byKey.get(normalise(situation));
        if (a == null) {
            throw new Exception(
                "ScriptedAppraisalSource has no vector for [" + situation
                + "]. Register one with put(), or use OpenAIAppraisalSource. "
                + "Refusing rather than inventing one: a fabricated vector is "
                + "indistinguishable from a real appraisal downstream.");
        }
        if (bDebug) {
            System.out.println("ScriptedAppraisalSource: matched [" + situation
                + "] for type [" + personalityType + "]");
        }
        // Defensive copy: the caller gets a vector it can mutate without
        // corrupting the table for the next test in the same run.
        return new AffectAppraisal(a);
    }

    private static String normalise(String s) {
        return s == null ? "" : s.trim().toLowerCase();
    }

    /**
     * Four situations spanning the corners the dimensions are meant to separate:
     * self-caused loss, other-caused injustice, impersonal threat, and earned
     * success. Values are in {@link AppraisalDimensions#JSON} order.
     */
    private void seed() {
        // self-caused, irrecoverable, high loss, low threat (it already happened)
        put("i made a mistake that cost us the contract", new float[] {
            0.9f, 0.1f, 0.2f,   // responsibility: self, other, circumstances
            0.2f, 0.8f, 0.8f,   // problem-focused coping, goal relevance, attention
            0.7f, 0.2f, 0.1f,   // emotion-focused coping, self/other controllable
            0.1f, 0.4f, 0.2f,   // circumstances controllable, predictability, threat
            0.1f, 0.8f, 0.1f,   // pleasantness, certainty, goal conduciveness
            0.5f, 0.3f, 0.6f,   // fairness, future expectancy, social norms
            0.9f, 0.3f, 0.5f,   // loss, familiarity, effort
            0.3f, 0.2f, 0.2f    // challenge, internal values, expectedness
        });

        // other-caused, unfair, high goal blockage, low loss
        put("a colleague took credit for my work in front of the team", new float[] {
            0.1f, 0.9f, 0.1f,
            0.5f, 0.8f, 0.9f,
            0.4f, 0.4f, 0.7f,
            0.1f, 0.2f, 0.4f,
            0.1f, 0.8f, 0.1f,
            0.05f, 0.4f, 0.1f,
            0.3f, 0.3f, 0.6f,
            0.5f, 0.1f, 0.1f
        });

        // impersonal, high threat, low certainty, unfamiliar - threat without loss
        put("the building alarm goes off and nobody knows why", new float[] {
            0.05f, 0.1f, 0.9f,
            0.3f, 0.7f, 0.9f,
            0.5f, 0.2f, 0.1f,
            0.8f, 0.1f, 0.8f,
            0.1f, 0.1f, 0.2f,
            0.5f, 0.3f, 0.5f,
            0.1f, 0.2f, 0.6f,
            0.4f, 0.5f, 0.05f
        });

        // self-caused, high challenge and effort, conducive - the positive corner
        put("i finished the hard part of the project ahead of schedule", new float[] {
            0.9f, 0.2f, 0.2f,
            0.9f, 0.9f, 0.7f,
            0.2f, 0.9f, 0.2f,
            0.2f, 0.6f, 0.05f,
            0.9f, 0.9f, 0.95f,
            0.8f, 0.9f, 0.8f,
            0.05f, 0.6f, 0.8f,
            0.9f, 0.9f, 0.4f
        });
    }
}
