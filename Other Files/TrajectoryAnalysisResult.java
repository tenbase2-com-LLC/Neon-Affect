package NeonAffect;

import java.io.Serializable;
import java.util.ArrayList;

public class TrajectoryAnalysisResult implements Serializable {

    public static final int PHASE_CRISIS     = 0;
    public static final int PHASE_STRUGGLING = 1;
    public static final int PHASE_RECOVERING = 2;
    public static final int PHASE_STABLE     = 3;
    public static final int PHASE_CONFLICTED = 4;
    public static final int PHASE_GROWING    = 5;
    public static final int PHASE_THRIVING   = 6;

    public static final int SIG_NOTABLE     = 1;
    public static final int SIG_SIGNIFICANT = 2;
    public static final int SIG_CRITICAL    = 3;

    private final int phase;
    private final int netBalance;
    private final String narrative;
    private final String mbtiType;
    private final int pathologySeverity;
    private final int patternStrength;
    private final String dominantPathologyFamily;
    private final String dominantPatternFamily;
    private final ArrayList<InteractionSignal> interactions;
    private final ArrayList<CompoundCrossRef> compoundCrossRefs;

    public TrajectoryAnalysisResult(int phase, int netBalance, String narrative,
                                    String mbtiType, int pathologySeverity, int patternStrength,
                                    String dominantPathologyFamily, String dominantPatternFamily,
                                    ArrayList<InteractionSignal> interactions,
                                    ArrayList<CompoundCrossRef> compoundCrossRefs) {
        this.phase = phase;
        this.netBalance = netBalance;
        this.narrative = narrative;
        this.mbtiType = mbtiType;
        this.pathologySeverity = pathologySeverity;
        this.patternStrength = patternStrength;
        this.dominantPathologyFamily = dominantPathologyFamily;
        this.dominantPatternFamily = dominantPatternFamily;
        this.interactions = interactions;
        this.compoundCrossRefs = compoundCrossRefs;
    }

    public int GetPhase()                       { return phase; }
    public int GetNetBalance()                   { return netBalance; }
    public String GetNarrative()                 { return narrative; }
    public String GetMBTIType()                  { return mbtiType; }
    public int GetPathologySeverity()            { return pathologySeverity; }
    public int GetPatternStrength()              { return patternStrength; }
    public String GetDominantPathologyFamily()   { return dominantPathologyFamily; }
    public String GetDominantPatternFamily()     { return dominantPatternFamily; }
    public ArrayList<InteractionSignal> GetInteractions()       { return interactions; }
    public ArrayList<CompoundCrossRef> GetCompoundCrossRefs()   { return compoundCrossRefs; }

    public String GetPhaseLabel() {
        switch (phase) {
            case PHASE_CRISIS:     return "CRISIS";
            case PHASE_STRUGGLING: return "STRUGGLING";
            case PHASE_RECOVERING: return "RECOVERING";
            case PHASE_STABLE:     return "STABLE";
            case PHASE_CONFLICTED: return "CONFLICTED";
            case PHASE_GROWING:    return "GROWING";
            case PHASE_THRIVING:   return "THRIVING";
            default:               return "UNKNOWN";
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrajectoryAnalysis[phase=").append(GetPhaseLabel());
        sb.append(" balance=").append(netBalance > 0 ? "+" : "").append(netBalance);
        sb.append(" pathology=").append(pathologySeverity);
        sb.append(" pattern=").append(patternStrength);
        sb.append(" interactions=").append(interactions.size());
        sb.append(" crossRefs=").append(compoundCrossRefs.size());
        sb.append("]");
        return sb.toString();
    }

    public static class InteractionSignal implements Serializable {
        private final String signalId;
        private final String description;
        private final String pathologyFamily;
        private final String emotionFamily;
        private final int significance;

        public InteractionSignal(String signalId, String description,
                                 String pathologyFamily, String emotionFamily,
                                 int significance) {
            this.signalId = signalId;
            this.description = description;
            this.pathologyFamily = pathologyFamily;
            this.emotionFamily = emotionFamily;
            this.significance = significance;
        }

        public String GetSignalId()        { return signalId; }
        public String GetDescription()     { return description; }
        public String GetPathologyFamily() { return pathologyFamily; }
        public String GetEmotionFamily()   { return emotionFamily; }
        public int GetSignificance()       { return significance; }

        public String GetSignificanceLabel() {
            switch (significance) {
                case SIG_NOTABLE:     return "NOTABLE";
                case SIG_SIGNIFICANT: return "SIGNIFICANT";
                case SIG_CRITICAL:    return "CRITICAL";
                default:              return "UNKNOWN";
            }
        }
    }

    public static class CompoundCrossRef implements Serializable {
        private final String pathologyTag;
        private final String patternTag;
        private final String description;

        public CompoundCrossRef(String pathologyTag, String patternTag,
                                String description) {
            this.pathologyTag = pathologyTag;
            this.patternTag = patternTag;
            this.description = description;
        }

        public String GetPathologyTag() { return pathologyTag; }
        public String GetPatternTag()   { return patternTag; }
        public String GetDescription()  { return description; }
    }
}
