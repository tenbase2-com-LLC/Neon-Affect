package NeonAffect;

import java.io.Serializable;
import java.util.ArrayList;

public class PathologyResult implements Serializable {

    public static final int SEVERITY_NONE      = 0;
    public static final int SEVERITY_MILD      = 1;
    public static final int SEVERITY_MODERATE  = 2;
    public static final int SEVERITY_SEVERE    = 3;
    public static final int SEVERITY_CRITICAL  = 4;

    private final ArrayList<MotifMatch> tier1Matches;
    private final ArrayList<CompoundMatch> compoundMatches;
    private final AffectDynamicsParams dynamics;
    private final int overallSeverity;
    private final String mbtiType;
    private final String tier2Route;

    public PathologyResult(ArrayList<MotifMatch> tier1Matches,
                           ArrayList<CompoundMatch> compoundMatches,
                           AffectDynamicsParams dynamics,
                           int overallSeverity,
                           String mbtiType,
                           String tier2Route) {
        this.tier1Matches = tier1Matches;
        this.compoundMatches = compoundMatches;
        this.dynamics = dynamics;
        this.overallSeverity = overallSeverity;
        this.mbtiType = mbtiType;
        this.tier2Route = tier2Route;
    }

    public ArrayList<MotifMatch> GetTier1Matches()       { return tier1Matches; }
    public ArrayList<CompoundMatch> GetCompoundMatches()  { return compoundMatches; }
    public AffectDynamicsParams GetDynamics()             { return dynamics; }
    public int GetOverallSeverity()                       { return overallSeverity; }
    public String GetMBTIType()                           { return mbtiType; }
    public String GetTier2Route()                         { return tier2Route; }

    public boolean HasPathology() {
        return overallSeverity > SEVERITY_NONE;
    }

    public String GetSeverityLabel() {
        switch (overallSeverity) {
            case SEVERITY_NONE:     return "NONE";
            case SEVERITY_MILD:     return "MILD";
            case SEVERITY_MODERATE: return "MODERATE";
            case SEVERITY_SEVERE:   return "SEVERE";
            case SEVERITY_CRITICAL: return "CRITICAL";
            default:                return "UNKNOWN";
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PathologyResult[severity=").append(GetSeverityLabel());
        sb.append(" mbti=").append(mbtiType);
        sb.append(" tier1=").append(tier1Matches.size());
        sb.append(" compounds=").append(compoundMatches.size());
        if (tier2Route != null) sb.append(" route=").append(tier2Route);
        sb.append("]");
        return sb.toString();
    }

    public static class MotifMatch implements Serializable {
        private final String motifId;
        private final String family;
        private final String description;
        private final int windowStart;
        private final int severity;

        public MotifMatch(String motifId, String family, String description,
                          int windowStart, int severity) {
            this.motifId = motifId;
            this.family = family;
            this.description = description;
            this.windowStart = windowStart;
            this.severity = severity;
        }

        public String GetMotifId()     { return motifId; }
        public String GetFamily()      { return family; }
        public String GetDescription() { return description; }
        public int GetWindowStart()    { return windowStart; }
        public int GetSeverity()       { return severity; }
    }

    public static class CompoundMatch implements Serializable {
        private final String compoundId;
        private final String description;
        private final String pathologyTag;
        private final String[] componentIds;

        public CompoundMatch(String compoundId, String description,
                             String pathologyTag, String[] componentIds) {
            this.compoundId = compoundId;
            this.description = description;
            this.pathologyTag = pathologyTag;
            this.componentIds = componentIds;
        }

        public String GetCompoundId()    { return compoundId; }
        public String GetDescription()   { return description; }
        public String GetPathologyTag()  { return pathologyTag; }
        public String[] GetComponentIds() { return componentIds; }
    }
}
