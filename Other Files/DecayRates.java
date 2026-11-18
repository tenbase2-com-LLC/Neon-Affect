package NeonAffect;

import aos.cojack.configuration.Configuration;
import aos.cojack.moderator.ModeratorConfiguration;
import aos.cojack.moderator.ModeratorEngine;

/**
 * Sets each reservoir's decay rate at run time from three things:
 * <pre>
 *   rate = base rate of the side  x  personality factor  /  duration of the current emotion
 * </pre>
 * <ul>
 * <li><b>Base rate</b>: neon_positive_decay / neon_negative_decay in cojack_cognitive.xml
 *     (0.2525 and 0.1683 units/second: negative emotions fade 1.5x more slowly).</li>
 * <li><b>Personality factor</b>, from the type's own baselines in MBTIBaselines, relative to
 *     the 16-type average and square-root damped so no type is extreme. The negative side uses
 *     recovery time (time from a negative peak back to non-negative): longer recovery, slower
 *     decay. The positive side uses inertia (how persistent emotional states are).</li>
 * <li><b>Emotion duration</b>: EmotionDuration (sadness lasts longest, surprise and relief
 *     shortest).</li>
 * </ul>
 * Called when a side's current emotion changes, and once at start-up. The reservoir is first
 * re-based at the current time, so the time already elapsed decays at the old rate and only
 * the time from now on at the new one.
 */
public final class DecayRates {

    private DecayRates() {} // non-instantiable

    public static final double DEFAULT_POSITIVE_DECAY = 0.2525;
    public static final double DEFAULT_NEGATIVE_DECAY = 0.1683;

    /** Sets the decay rate of one reservoir for its current emotion (-1: none yet). */
    public static double Apply(String strAgentId, boolean bPositive, int iAffect,
                               String strPersonalityType, long lTime, boolean bDebug) {
        double dRate = Rate(strAgentId, bPositive, iAffect, strPersonalityType, lTime);
        String strModerator = bPositive ? Constants.NEON_POSITIVE_RESERVOIR : Constants.NEON_NEGATIVE_RESERVOIR;
        String strParameter = bPositive ? Constants.NEON_POSITIVE_PARAMETER : Constants.NEON_NEGATIVE_PARAMETER;

        try {
            // make sure the moderator is instantiated before looking it up
            Configuration.getValueCalculator(strAgentId, "NeonAffectAgent", strParameter);

            // re-base at now: what has elapsed decays at the old rate, the rest at the new one
            double dNow = Configuration.moderatorCurrentReservoir(strAgentId, strModerator, lTime);
            Configuration.moderatorReservoirAgentUpdate(strAgentId, strModerator, dNow, lTime);

            String strFormula = Formula(dRate);
            ModeratorConfiguration[] modconfs = Configuration.getModerators(strAgentId, strModerator);
            for (int i = 0; i < modconfs.length; i++) {
                ((ModeratorEngine) modconfs[i]).setReservoirFormula(strFormula);
            }

            if (bDebug) {
                System.out.println("DecayRates: " + strModerator + " affect [" + iAffect + "] type ["
                    + strPersonalityType + "] rate [" + String.format(java.util.Locale.US, "%.4f", dRate) + "]");
            }
        } catch (Exception e) {
            System.out.println("DecayRates: WARNING could not set the " + strModerator + " rate (" + e + ")");
        }
        return dRate;
    }

    /** The decay rate in units/second, without applying it. */
    public static double Rate(String strAgentId, boolean bPositive, int iAffect,
                              String strPersonalityType, long lTime) {
        double dBase = Base(strAgentId, bPositive, lTime);
        double dType = PersonalityFactor(bPositive, strPersonalityType);
        double dDuration = (iAffect >= 0) ? EmotionDuration.Get(iAffect) : 1.0;
        return dBase * dType / dDuration;
    }

    /** Personality factor on the decay rate: above 1 fades faster, below 1 lingers. */
    public static double PersonalityFactor(boolean bPositive, String strPersonalityType) {
        String[] types = {"INTJ", "INTP", "ENTJ", "ENTP", "INFJ", "INFP", "ENFJ", "ENFP",
                          "ISTJ", "ISFJ", "ESTJ", "ESFJ", "ISTP", "ISFP", "ESTP", "ESFP"};
        double dSum = 0.0;
        for (String t : types) {
            dSum += Persistence(bPositive, MBTIBaselines.Get(t));
        }
        double dMean = dSum / types.length;
        double dThis = Persistence(bPositive, MBTIBaselines.Get(strPersonalityType));
        if (dThis <= 0.0) {
            return 1.0;
        }
        return Math.sqrt(dMean / dThis);
    }

    private static double Persistence(boolean bPositive, MBTIBaselines.Baseline b) {
        return bPositive ? b.inertiaMean : b.recoveryTimeMean;
    }

    private static double Base(String strAgentId, boolean bPositive, long lTime) {
        String strParameter = bPositive ? "neon_positive_decay" : "neon_negative_decay";
        try {
            double d = Configuration.getValueCalculator(strAgentId, "NeonAffectAgent", strParameter)
                .getValueDoubleAt(lTime);
            if (d > 0.0) {
                return d;
            }
        } catch (Exception e) {
            // fall through to the default
        }
        return bPositive ? DEFAULT_POSITIVE_DECAY : DEFAULT_NEGATIVE_DECAY;
    }

    /** The dead-band decay formula used by both reservoirs, at rate r units/second. */
    static String Formula(double r) {
        String R = String.format(java.util.Locale.US, "%.6f", r);
        return "if ((reservoir - " + R + " * dt > 0) && reservoir > 0.05) then (reservoir - " + R + " * dt) "
             + "else if ((reservoir + " + R + " * dt < 0) && reservoir < -0.05) then (reservoir + " + R + " * dt) "
             + "else 0.0;";
    }
}
