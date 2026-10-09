package NeonAffect;

import java.io.Serializable;
import java.util.ArrayList;

public class EmotionPatternResult implements Serializable {

    public static final int STRENGTH_NONE     = 0;
    public static final int STRENGTH_FAINT    = 1;
    public static final int STRENGTH_MODERATE = 2;
    public static final int STRENGTH_STRONG   = 3;
    public static final int STRENGTH_DOMINANT  = 4;

    private final ArrayList<MotifMatch> motifMatches;
    private final ArrayList<CompoundMatch> compoundMatches;
    private final AffectDynamicsParams dynamics;
    private final int overallStrength;
    private final String mbtiType;
    private final String dominantFamily;

    public EmotionPatternResult(ArrayList<MotifMatch> motifMatches,
                                ArrayList<CompoundMatch> compoundMatches,
                                AffectDynamicsParams dynamics,
                                int overallStrength,
                                String mbtiType,
                                String dominantFamily) {
        this.motifMatches = motifMatches;
        this.compoundMatches = compoundMatches;
        this.dynamics = dynamics;
        this.overallStrength = overallStrength;
        this.mbtiType = mbtiType;
        this.dominantFamily = dominantFamily;
    }

    public ArrayList<MotifMatch> GetMotifMatches()        { return motifMatches; }
    public ArrayList<CompoundMatch> GetCompoundMatches()   { return compoundMatches; }
    public AffectDynamicsParams GetDynamics()              { return dynamics; }
    public int GetOverallStrength()                        { return overallStrength; }
    public String GetMBTIType()                            { return mbtiType; }
    public String GetDominantFamily()                      { return dominantFamily; }

    public boolean HasPattern() {
        return overallStrength > STRENGTH_NONE;
    }

    public String GetStrengthLabel() {
        switch (overallStrength) {
            case STRENGTH_NONE:     return "NONE";
            case STRENGTH_FAINT:    return "FAINT";
            case STRENGTH_MODERATE: return "MODERATE";
            case STRENGTH_STRONG:   return "STRONG";
            case STRENGTH_DOMINANT: return "DOMINANT";
            default:                return "UNKNOWN";
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmotionPatternResult[strength=").append(GetStrengthLabel());
        sb.append(" mbti=").append(mbtiType);
        sb.append(" motifs=").append(motifMatches.size());
        sb.append(" compounds=").append(compoundMatches.size());
        if (dominantFamily != null) sb.append(" dominant=").append(dominantFamily);
        sb.append("]");
        return sb.toString();
    }

    public static class MotifMatch implements Serializable {
        private final String motifId;
        private final String family;
        private final String description;
        private final int windowStart;
        private final int strength;

        public MotifMatch(String motifId, String family, String description,
                          int windowStart, int strength) {
            this.motifId = motifId;
            this.family = family;
            this.description = description;
            this.windowStart = windowStart;
            this.strength = strength;
        }

        public String GetMotifId()     { return motifId; }
        public String GetFamily()      { return family; }
        public String GetDescription() { return description; }
        public int GetWindowStart()    { return windowStart; }
        public int GetStrength()       { return strength; }
    }

    public static class CompoundMatch implements Serializable {
        private final String compoundId;
        private final String description;
        private final String patternTag;
        private final String[] componentIds;

        public CompoundMatch(String compoundId, String description,
                             String patternTag, String[] componentIds) {
            this.compoundId = compoundId;
            this.description = description;
            this.patternTag = patternTag;
            this.componentIds = componentIds;
        }

        public String GetCompoundId()    { return compoundId; }
        public String GetDescription()   { return description; }
        public String GetPatternTag()    { return patternTag; }
        public String[] GetComponentIds() { return componentIds; }
    }
}
