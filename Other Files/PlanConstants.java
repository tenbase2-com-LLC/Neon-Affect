package NeonAffect;

public final class PlanConstants {

    private PlanConstants() {} // non-instantiable

    public static final String ALL_PLANS = "AllPlans";
    public static final String RANDOM_SELECTED_PLAN = "0.1 + random(19.9)";
    public static final String RANDOM_NON_SELECTED_PLAN = "0";

    /**
     * Scale for graded plan values: {@code PLAN_VALUE = GRADED_PLAN_VALUE_SCALE * p},
     * where p is the judge's probability for that plan over the candidate set.
     *
     * <p>Expected gain is {@code PLAN_VALUE - PLAN_SUCCESS_COST} plus
     * {@code EXPECTED_GAIN_NOISE} of Gaussian noise (sigma 1.0 in cojack_cognitive.xml),
     * so this scale sets how large the gaps between plans are relative to that noise.
     * It is the dial controlling how faithfully CoJACK reproduces the judge's
     * distribution versus how decisively it picks the judge's favourite.
     *
     * <p>Measured against gpt-6-luna distributions for rage/nonverbal, as mean
     * total-variation distance between the judge's stated probabilities and the
     * selection frequency CoJACK actually realises (0 = perfect reproduction):
     *
     * <pre>
     *   scale   TV distance   top plan wins   behaviours in play per type
     *       6         0.039             21%        8.5     faithful, near-random looking
     *      10         0.161             30%        5.5     &lt;- chosen
     *      20         0.376             47%        3.9
     *      40         0.548             66%        3.0
     *   winner-takes-all
     *                 0.738             93%        1.0     the old behaviour
     * </pre>
     *
     * <p>6 reproduces the judge almost exactly, but GPT-6's distributions are flat
     * (top plan around 20% of 10 candidates), so faithful sampling makes a single run
     * look close to random. 10 keeps the characteristic behaviour clearly most likely
     * at roughly three times uniform while preserving real variety. Raise it toward 40
     * for more decisive, more repetitive behaviour.
     *
     * <p>Caveat: tuned on one emotion and one modality. The optimum depends on how
     * peaked the judge's distributions are, which varies by emotion.
     */
    public static final String ENV_GRADED_SCALE  = "NEON_PLAN_VALUE_SCALE";
    public static final String ENV_GRADED_OFFSET = "NEON_PLAN_VALUE_OFFSET";

    public static final double DEFAULT_GRADED_PLAN_VALUE_SCALE  = 3.0;
    public static final double DEFAULT_GRADED_PLAN_VALUE_OFFSET = 6.0;

    /**
     * Plan value for a plan the judge scored:
     * {@code PLAN_VALUE = GRADED_PLAN_VALUE_OFFSET + GRADED_PLAN_VALUE_SCALE * p}.
     * A plan the judge did not score gets 0.
     *
     * <p>The two numbers do different jobs, which is why a single scale could not serve
     * both. The <b>offset</b> lifts every scored plan clear of the unscored ones: at
     * expected gain {@code PLAN_VALUE - PLAN_SUCCESS_COST} against
     * {@code EXPECTED_GAIN_NOISE} of sigma 1.0, an offset of 6 puts scored plans about
     * six sigma above a plan at 0, so CoJACK effectively never selects something the
     * judge declined to score. The <b>scale</b> then sets the spread <i>among</i> the
     * scored plans, which is what reproduces the judge's distribution.
     *
     * <p>Measured as mean total-variation distance between the judge's probabilities and
     * the selection frequency CoJACK realises, plus the share of selections landing on
     * unscored plans:
     *
     * <pre>
     *   offset scale    TV     unscored picked
     *        0    10   0.252        2.0%     &lt;- first attempt, tuned on the wrong data
     *        5     2   0.058        0.0%
     *        6     3   0.067        0.0%     &lt;- chosen
     *        5     4   0.084        0.0%
     * </pre>
     *
     * <p>5/2 has the better unweighted mean but degrades on larger candidate sets.
     * Weighting by how many eligible plans the parameter groups in cojack_cognitive.xml
     * actually offer - 79% have 4 to 10, 15% have 3 or fewer, mean 6.8 - 6/3 is the
     * better fit and its worst case is milder.
     *
     * <p>An earlier version of this used {@code scale * p} with no offset, tuned against
     * 15 to 27 candidate plans read from the capability files. Production filters those
     * through cojack_cognitive.xml down to 6.8 on average, where that tuning was roughly
     * four times worse than this.
     *
     * <p>Both are initialised by a method call rather than a literal: a
     * {@code static final double = 3.0} is a compile-time constant that javac inlines
     * into every caller, so changing it would leave stale values baked into already
     * compiled classes. This form cannot be inlined and can be retuned by environment
     * variable without a rebuild.
     */
    public static final double GRADED_PLAN_VALUE_SCALE  = ReadDouble(ENV_GRADED_SCALE,  DEFAULT_GRADED_PLAN_VALUE_SCALE);

    /** @see #GRADED_PLAN_VALUE_SCALE */
    public static final double GRADED_PLAN_VALUE_OFFSET = ReadDouble(ENV_GRADED_OFFSET, DEFAULT_GRADED_PLAN_VALUE_OFFSET);

    private static double ReadDouble(String strName, double dDefault) {
        String str = System.getenv(strName);
        if (str != null && !str.isEmpty()) {
            try {
                double d = Double.parseDouble(str.trim());
                if (d >= 0.0) return d;
                System.out.println("PlanConstants: ignoring negative " + strName + " [" + str + "]");
            } catch (NumberFormatException e) {
                System.out.println("PlanConstants: ignoring unparseable " + strName + " [" + str + "]");
            }
        }
        return dDefault;
    }
}
