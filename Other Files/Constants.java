package NeonAffect;

public final class Constants {

    private Constants() {} // non-instantiable

    public static final String NEON_NAMESPACE = "NeonAffect.";
    public static final String NEON = "Neon";
    public static final String COJACK_COGNITIVE_PATH = "D:\\projects\\NeonAffect\\data\\cojack_cognitive.xml";

    // Mixed emotions: the agent's intensity is two reservoirs, one per valence, so a
    // positive and a negative emotion can be felt at once (see DualReservoir).
    public static final String NEON_POSITIVE_RESERVOIR = "NeonPositiveReservoir";
    public static final String NEON_NEGATIVE_RESERVOIR = "NeonNegativeReservoir";
    /** AddEmotionEvent moderator name meaning "route by sign to the two reservoirs". */
    public static final String NEON_DUAL_RESERVOIR = "NeonDualReservoir";
    public static final String NEON_POSITIVE_PARAMETER = "neon_positive_parameter";
    public static final String NEON_NEGATIVE_PARAMETER = "neon_negative_parameter";
    public static final String NEON_INHIBITION_PARAMETER = "neon_inhibition";
    /** Used when neon_inhibition is missing from cojack_cognitive.xml. */
    public static final double DEFAULT_INHIBITION = 0.5;
}
