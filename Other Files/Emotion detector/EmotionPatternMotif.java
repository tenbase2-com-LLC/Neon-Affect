package NeonAffect;

import java.io.Serializable;

public class EmotionPatternMotif implements Serializable {

    private final String id;
    private final String family;
    private final String description;
    private final int[] categorySequence;
    private final boolean requireHighVelocity;
    private final boolean requireLowVolatility;
    private final boolean requireHighInertia;
    private final boolean requireLowEntropy;
    private final boolean requireHighEntropy;

    public EmotionPatternMotif(String id, String family, String description,
                               int[] categorySequence,
                               boolean requireHighVelocity,
                               boolean requireLowVolatility,
                               boolean requireHighInertia,
                               boolean requireLowEntropy,
                               boolean requireHighEntropy) {
        this.id = id;
        this.family = family;
        this.description = description;
        this.categorySequence = categorySequence;
        this.requireHighVelocity = requireHighVelocity;
        this.requireLowVolatility = requireLowVolatility;
        this.requireHighInertia = requireHighInertia;
        this.requireLowEntropy = requireLowEntropy;
        this.requireHighEntropy = requireHighEntropy;
    }

    public EmotionPatternMotif(String id, String family, String description, int[] categorySequence) {
        this(id, family, description, categorySequence, false, false, false, false, false);
    }

    public String GetId()          { return id; }
    public String GetFamily()      { return family; }
    public String GetDescription() { return description; }
    public int[] GetSequence()     { return categorySequence; }
    public int GetLength()         { return categorySequence.length; }

    public boolean Matches(int[] window, AffectDynamicsParams params,
                           double velocityThreshold, double volatilityThreshold) {
        if (window.length < categorySequence.length) return false;

        for (int i = 0; i < categorySequence.length; i++) {
            if (categorySequence[i] != window[i]) return false;
        }

        if (requireHighVelocity && params.velocity < velocityThreshold) return false;
        if (requireLowVolatility && params.volatility > volatilityThreshold * 0.5) return false;
        if (requireHighInertia && params.inertia < 0.5) return false;
        if (requireLowEntropy && params.emotionalEntropy > 1.5) return false;
        if (requireHighEntropy && params.emotionalEntropy < 2.5) return false;

        return true;
    }
}
