package NeonAffect;

import java.util.ArrayList;
import java.util.List;

/**
 * Splits the affect history into tracks for the analyzers, now that a positive and a
 * negative emotion can be active at once (mixed emotions, see DualReservoir).
 *
 * <p>The history records one entry per level event, from whichever reservoir fired, so
 * with mixing its entries alternate between the two valences. Read as one series, that
 * alternation looks like rapid mood swings. The analyzers therefore read:
 * <ul>
 * <li>{@link #Positive}: the positive reservoir's entries only;</li>
 * <li>{@link #Negative}: the negative reservoir's entries only;</li>
 * <li>{@link #Net}: one entry per history entry, holding positive + negative as they stood
 *     at that moment, typed with whichever side is stronger - a real swing of the overall
 *     state shows here, alternating records do not.</li>
 * </ul>
 * Entries are told apart by the sign of their level (+1..+6 positive, -6..-1 negative).
 */
public final class AffectHistoryTracks {

    private AffectHistoryTracks() {} // non-instantiable

    public static ArrayList<AffectHistoryVar> Positive(List<AffectHistoryVar> history) {
        ArrayList<AffectHistoryVar> out = new ArrayList<AffectHistoryVar>();
        if (history != null) {
            for (AffectHistoryVar h : history) {
                if (h.GetLevel() > 0) {
                    out.add(h);
                }
            }
        }
        return out;
    }

    public static ArrayList<AffectHistoryVar> Negative(List<AffectHistoryVar> history) {
        ArrayList<AffectHistoryVar> out = new ArrayList<AffectHistoryVar>();
        if (history != null) {
            for (AffectHistoryVar h : history) {
                if (h.GetLevel() < 0) {
                    out.add(h);
                }
            }
        }
        return out;
    }

    public static ArrayList<AffectHistoryVar> Net(List<AffectHistoryVar> history) {
        ArrayList<AffectHistoryVar> out = new ArrayList<AffectHistoryVar>();
        if (history == null) {
            return out;
        }

        double dPositive = 0.0;
        double dNegative = 0.0;
        int iPositiveType = -1;
        int iNegativeType = -1;

        for (AffectHistoryVar h : history) {
            if (h.GetLevel() > 0) {
                dPositive = h.GetValue();
                iPositiveType = h.GetType();
            } else if (h.GetLevel() < 0) {
                dNegative = h.GetValue();
                iNegativeType = h.GetType();
            } else {
                out.add(h);                 // level 0: no side to merge with
                continue;
            }

            double dNet = dPositive + dNegative;
            boolean bPositiveStronger = Math.abs(dPositive) >= Math.abs(dNegative);
            int iType = bPositiveStronger ? iPositiveType : iNegativeType;
            if (iType < 0) {
                iType = h.GetType();
            }
            out.add(new AffectHistoryVar(h.GetID(), LevelClassifier.GetLevel(dNet), iType, dNet, h.GetTime()));
        }
        return out;
    }
}
