package NeonAffect;

/**
 * The 24 appraisal dimensions, named once.
 *
 * <p>The same 24 values are currently written out by hand in five places:
 * the fields of {@link AffectAppraisal}, its 24-argument constructor, its
 * copy constructor, {@code equals}/{@code hashCode}/{@code toString}, and
 * {@link AffectAppraisal#toArray()}. Adding a JSON schema and a parser would
 * have made seven. Ordering has to agree across all of them, because
 * {@code toArray()} is what the cosine similarity consumes positionally - a
 * dimension inserted in one place and not another does not fail, it silently
 * compares threat against fairness.</p>
 *
 * <p>So the order lives here and everything new reads it. {@code JSON[i]} is
 * the wire name of {@code AffectAppraisal.toArray()[i]}.</p>
 */
public final class AppraisalDimensions {

    private AppraisalDimensions() {}

    /** Count of appraisal dimensions. */
    public static final int COUNT = 24;

    /**
     * Wire names, in {@link AffectAppraisal#toArray()} order.
     *
     * <p>Snake case without the Hungarian {@code f} prefix: these go to a
     * language model, and {@code fCircumstancesResponsibility} invites it to
     * wonder what the {@code f} means. The Java field names stay as they are.</p>
     */
    public static final String[] JSON = {
        "self_responsibility",
        "other_responsibility",
        "circumstances_responsibility",
        "problem_focused_coping",
        "goal_relevance",
        "attentional_activity",
        "emotion_focused_coping",
        "self_controllable",
        "other_controllable",
        "circumstances_controllable",
        "predictability",
        "threat",
        "pleasantness",
        "certainty",
        "goal_conduciveness",
        "fairness",
        "future_expectancy",
        "consistency_with_social_norms",
        "loss",
        "familiarity",
        "effort",
        "challenge",
        "consistency_with_internal_values",
        "expectedness"
    };

    /**
     * One-line definitions, sent to the model as part of the schema.
     *
     * <p>These are not decoration. Several of these dimensions are ambiguous
     * out of context - "effort" could mean effort already spent or effort
     * anticipated, "expectedness" and "predictability" and "certainty" are
     * three different things that a model will happily collapse into one -
     * and an unglossed schema gets three correlated numbers where the
     * prototypes expect three independent ones.</p>
     */
    public static final String[] DESCRIPTION = {
        "How far the person holds themselves responsible for the situation.",
        "How far the person holds another agent responsible.",
        "How far the person attributes the situation to impersonal circumstance.",
        "Extent to which the person can act on the problem itself.",
        "How much the situation bears on the person's active goals, whether helping or harming.",
        "How strongly the situation draws and holds attention.",
        "Extent to which the person can only manage their own reaction, not the situation.",
        "How far the person themselves can control the outcome.",
        "How far another agent can control the outcome.",
        "How far the outcome is governed by circumstance beyond anyone's control.",
        "How far the situation could have been foreseen from what was known before it.",
        "Degree of harm or danger the situation poses.",
        "Intrinsic pleasantness of the situation, independent of the person's goals.",
        "Confidence in what is actually the case now, as opposed to what will happen.",
        "How far the situation advances the person's goals rather than blocking them.",
        "How far the situation accords with the person's sense of what is deserved.",
        "Expected direction of things from here, better or worse.",
        "How far the situation accords with the norms of the person's social group.",
        "Magnitude of something valued that is already gone and not recoverable.",
        "How far the situation resembles ones the person has met before.",
        "Exertion the situation demands of the person going forward.",
        "How far the situation is a demand the person could rise to rather than merely a threat.",
        "How far the situation accords with the person's own values, whatever others think.",
        "How far the situation departs from what the person anticipated in the moment."
    };

    /**
     * Builds an {@link AffectAppraisal} from 24 values in {@link #JSON} order.
     *
     * @throws IllegalArgumentException if the array is the wrong length, or any
     *         value falls outside 0.0-1.0. Out-of-range values are rejected
     *         rather than clamped: the prototype vectors are all drawn from
     *         {@link AffectAppraisalEnum} on a 0.0-1.0 scale, and cosine
     *         similarity against an out-of-range value does not fail, it
     *         quietly returns a confident wrong answer. A negative in
     *         particular reverses that dimension's contribution - which is also
     *         why the -1.0 defaults in AffectAppraisal's no-argument
     *         constructor must never reach the classifier.
     */
    public static AffectAppraisal toAppraisal(float[] v) {
        if (v == null || v.length != COUNT) {
            throw new IllegalArgumentException(
                "expected " + COUNT + " appraisal values, got "
                + (v == null ? "null" : String.valueOf(v.length)));
        }
        for (int i = 0; i < COUNT; i++) {
            if (Float.isNaN(v[i]) || v[i] < 0.0f || v[i] > 1.0f) {
                throw new IllegalArgumentException(
                    "appraisal dimension " + JSON[i] + " out of range 0.0-1.0: "
                    + v[i]);
            }
        }
        return new AffectAppraisal(
            v[0],  v[1],  v[2],  v[3],  v[4],  v[5],  v[6],  v[7],
            v[8],  v[9],  v[10], v[11], v[12], v[13], v[14], v[15],
            v[16], v[17], v[18], v[19], v[20], v[21], v[22], v[23]);
    }
}
