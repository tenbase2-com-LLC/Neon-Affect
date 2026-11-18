package NeonAffect;

import aos.cojack.configuration.Configuration;

/**
 * The agent's emotional intensity as TWO CoJACK reservoirs, one per valence, so that a
 * positive and a negative emotion can be felt at the same time (mixed emotions).
 *
 * <ul>
 * <li>{@link Constants#NEON_POSITIVE_RESERVOIR}: 0 .. +65, read as neon_positive_parameter</li>
 * <li>{@link Constants#NEON_NEGATIVE_RESERVOIR}: -65 .. 0, read as neon_negative_parameter</li>
 * </ul>
 *
 * An incoming amount goes to the reservoir of its own sign. The inhibition factor k
 * (neon_inhibition in cojack_cognitive.xml) sets how much of it is first spent cancelling
 * the opposite reservoir:
 * <pre>
 *   incremental:  r = min(|opposite|, k * |amount|)
 *                 opposite moves r toward 0; own side receives amount minus r
 *   override:     own side = amount; opposite = opposite * (1 - k)
 * </pre>
 * k = 1 reproduces the old single reservoir exactly (only one side is ever non-zero);
 * k = 0 makes the two independent; values in between give partial suppression.
 */
public final class DualReservoir {

    private DualReservoir() {} // non-instantiable

    /**
     * Applies an emotion amount to the two reservoirs.
     *
     * @param strAgentId   CoJACK agent id (agent.getId())
     * @param dAmount      signed amount; positive goes to the positive reservoir
     * @param bIncremental add to the reservoir, or replace it
     * @param lTime        agent time (agent.timer.getTime())
     */
    public static void Apply(String strAgentId, double dAmount, boolean bIncremental, long lTime) {
        if (dAmount == 0.0) {
            return;
        }

        boolean bPositive = dAmount > 0.0;
        String strOwn = bPositive ? Constants.NEON_POSITIVE_RESERVOIR : Constants.NEON_NEGATIVE_RESERVOIR;
        String strOpposite = bPositive ? Constants.NEON_NEGATIVE_RESERVOIR : Constants.NEON_POSITIVE_RESERVOIR;

        double k = Inhibition(strAgentId, lTime);

        // both reservoirs as they are at this moment (decayed to lTime)
        double dOwn = Configuration.moderatorCurrentReservoir(strAgentId, strOwn, lTime);
        double dOpposite = Configuration.moderatorCurrentReservoir(strAgentId, strOpposite, lTime);

        double dNewOwn;
        double dNewOpposite;

        if (bIncremental) {
            double r = Math.min(Math.abs(dOpposite), k * Math.abs(dAmount));
            dNewOpposite = dOpposite - Math.signum(dOpposite) * r;      // toward 0
            dNewOwn = dOwn + dAmount - Math.signum(dAmount) * r;
        } else {
            dNewOwn = dAmount;
            dNewOpposite = dOpposite * (1.0 - k);
        }

        Configuration.moderatorReservoirAgentUpdate(strAgentId, strOwn, dNewOwn, lTime);
        Configuration.moderatorReservoirAgentUpdate(strAgentId, strOpposite, dNewOpposite, lTime);
    }

    /** The inhibition factor k in [0, 1], from neon_inhibition; the default if absent. */
    public static double Inhibition(String strAgentId, long lTime) {
        try {
            double k = Configuration.getValueCalculator(strAgentId, "NeonAffectAgent",
                Constants.NEON_INHIBITION_PARAMETER).getValueDoubleAt(lTime);
            if (k < 0.0) {
                return 0.0;
            }
            if (k > 1.0) {
                return 1.0;
            }
            return k;
        } catch (Exception e) {
            return Constants.DEFAULT_INHIBITION;
        }
    }

    /** Current value of the positive reservoir (0 .. +65). */
    public static double Positive(String strAgentId, long lTime) throws NoSuchMethodException {
        return Configuration.getValueCalculator(strAgentId, "NeonAffectAgent",
            Constants.NEON_POSITIVE_PARAMETER).getValueDoubleAt(lTime);
    }

    /** Current value of the negative reservoir (-65 .. 0). */
    public static double Negative(String strAgentId, long lTime) throws NoSuchMethodException {
        return Configuration.getValueCalculator(strAgentId, "NeonAffectAgent",
            Constants.NEON_NEGATIVE_PARAMETER).getValueDoubleAt(lTime);
    }
}
