package NeonAffect;

import java.io.Serializable;

public class PathologyMotif implements Serializable {

    private final String id;
    private final String family;
    private final String description;
    private final int[] categorySequence;
    private final boolean requireHighVelocity;
    private final boolean requireLowInertia;
    private final boolean requireHighVolatility;

    public PathologyMotif(String id, String family, String description,
                          int[] categorySequence,
                          boolean requireHighVelocity,
                          boolean requireLowInertia,
                          boolean requireHighVolatility) {
        this.id = id;
        this.family = family;
        this.description = description;
        this.categorySequence = categorySequence;
        this.requireHighVelocity = requireHighVelocity;
        this.requireLowInertia = requireLowInertia;
        this.requireHighVolatility = requireHighVolatility;
    }

    public PathologyMotif(String id, String family, String description, int[] categorySequence) {
        this(id, family, description, categorySequence, false, false, false);
    }

    public String GetId()          { return id; }
    public String GetFamily()      { return family; }
    public String GetDescription() { return description; }
    public int[] GetSequence()     { return categorySequence; }
    public int GetLength()         { return categorySequence.length; }

    public boolean RequiresHighVelocity()   { return requireHighVelocity; }
    public boolean RequiresLowInertia()     { return requireLowInertia; }
    public boolean RequiresHighVolatility() { return requireHighVolatility; }

    public boolean Matches(int[] window, AffectDynamicsParams params,
                           double velocityThreshold, double volatilityThreshold) {
        if (window.length < categorySequence.length) return false;

        for (int i = 0; i < categorySequence.length; i++) {
            if (categorySequence[i] != window[i]) return false;
        }

        if (requireHighVelocity && params.velocity < velocityThreshold) return false;
        if (requireHighVolatility && params.volatility < volatilityThreshold) return false;
        if (requireLowInertia && params.inertia > 0.3) return false;

        return true;
    }
}
