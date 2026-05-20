package NeonAffect;

/**
 * A single entry in an affect timeline: maps a (timeline, intensity level)
 * pair to a specific affect.  Replaces the old {@code Object[]} tuples.
 *
 * @param timeline  timeline group number (-1 = personality-mapped, 1-20 = original)
 * @param level     intensity level (-6 to +6, 0 = neutral)
 * @param affect    the affect int ID (from AffectEnum constants), or NEUTRAL_ID for neutral
 */
public record AffectLevel(int timeline, int level, int affect) {

    /** Convenience: extract the legacy int ID, or -1 for neutral. */
    public int affectId() {
        return affect;
    }
}
