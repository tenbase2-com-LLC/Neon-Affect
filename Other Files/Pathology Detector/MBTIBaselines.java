package NeonAffect;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class MBTIBaselines implements Serializable {

    private MBTIBaselines() {}

    public static class Baseline implements Serializable {
        public final double velocityMean;
        public final double volatilityMean;
        public final double inertiaMean;
        public final double reactivityMean;
        public final double entropyMean;
        public final double recoveryTimeMean;
        public final double amplitudeMean;
        public final double velocityThreshold;
        public final double volatilityThreshold;

        public Baseline(double velocityMean, double volatilityMean, double inertiaMean,
                        double reactivityMean, double entropyMean, double recoveryTimeMean,
                        double amplitudeMean) {
            this.velocityMean = velocityMean;
            this.volatilityMean = volatilityMean;
            this.inertiaMean = inertiaMean;
            this.reactivityMean = reactivityMean;
            this.entropyMean = entropyMean;
            this.recoveryTimeMean = recoveryTimeMean;
            this.amplitudeMean = amplitudeMean;
            this.velocityThreshold = velocityMean * 2.0;
            this.volatilityThreshold = volatilityMean * 2.0;
        }
    }

    private static final Map<String, Baseline> BASELINES = new HashMap<>();
    private static final Baseline DEFAULT_BASELINE = new Baseline(0.5, 0.4, 0.5, 1.5, 2.5, 5.0, 3.0);

    static {
        //                              vel   vol   iner  react  entr  recov  amp
        // Analysts
        BASELINES.put("INTJ", new Baseline(0.3, 0.25, 0.7, 1.2, 1.8, 8.0, 2.0));
        BASELINES.put("INTP", new Baseline(0.35, 0.3, 0.65, 1.0, 2.2, 7.0, 2.5));
        BASELINES.put("ENTJ", new Baseline(0.5, 0.35, 0.55, 1.8, 2.0, 4.0, 3.5));
        BASELINES.put("ENTP", new Baseline(0.6, 0.5, 0.4, 1.6, 2.8, 3.5, 4.0));

        // Diplomats
        BASELINES.put("INFJ", new Baseline(0.4, 0.35, 0.6, 2.0, 2.5, 6.0, 3.0));
        BASELINES.put("INFP", new Baseline(0.45, 0.4, 0.55, 2.2, 2.8, 7.5, 3.5));
        BASELINES.put("ENFJ", new Baseline(0.55, 0.4, 0.5, 2.5, 2.3, 3.5, 3.5));
        BASELINES.put("ENFP", new Baseline(0.65, 0.55, 0.35, 2.0, 3.0, 3.0, 4.5));

        // Sentinels
        BASELINES.put("ISTJ", new Baseline(0.25, 0.2, 0.75, 1.0, 1.5, 9.0, 1.5));
        BASELINES.put("ISFJ", new Baseline(0.3, 0.25, 0.7, 1.5, 1.8, 8.0, 2.0));
        BASELINES.put("ESTJ", new Baseline(0.45, 0.3, 0.6, 1.5, 1.8, 5.0, 2.5));
        BASELINES.put("ESFJ", new Baseline(0.5, 0.4, 0.5, 2.0, 2.2, 4.0, 3.0));

        // Explorers
        BASELINES.put("ISTP", new Baseline(0.35, 0.3, 0.65, 1.0, 2.0, 6.0, 2.5));
        BASELINES.put("ISFP", new Baseline(0.4, 0.35, 0.55, 2.0, 2.5, 6.5, 3.0));
        BASELINES.put("ESTP", new Baseline(0.6, 0.5, 0.35, 1.5, 2.5, 3.0, 4.0));
        BASELINES.put("ESFP", new Baseline(0.65, 0.55, 0.3, 2.0, 2.8, 2.5, 4.5));
    }

    public static Baseline Get(String mbtiType) {
        Baseline b = BASELINES.get(mbtiType);
        return b != null ? b : DEFAULT_BASELINE;
    }

    public static double DeviationScore(AffectDynamicsParams params, String mbtiType) {
        Baseline b = Get(mbtiType);
        double score = 0;
        score += Math.abs(params.velocity - b.velocityMean) / Math.max(b.velocityMean, 0.01);
        score += Math.abs(params.volatility - b.volatilityMean) / Math.max(b.volatilityMean, 0.01);
        score += Math.abs(params.inertia - b.inertiaMean) / Math.max(b.inertiaMean, 0.01);
        score += Math.abs(params.reactivity - b.reactivityMean) / Math.max(b.reactivityMean, 0.01);
        score += Math.abs(params.emotionalEntropy - b.entropyMean) / Math.max(b.entropyMean, 0.01);
        score += Math.abs(params.recoveryTime - b.recoveryTimeMean) / Math.max(b.recoveryTimeMean, 0.01);
        score += Math.abs(params.amplitude - b.amplitudeMean) / Math.max(b.amplitudeMean, 0.01);
        return score / 7.0;
    }

    public static String GetDominantFunction(String mbtiType) {
        if (mbtiType == null) return "unknown";
        switch (mbtiType) {
            case "ENTJ": case "ESTJ": return "Te";
            case "INTP": case "ISTP": return "Ti";
            case "ENFJ": case "ESFJ": return "Fe";
            case "INFP": case "ISFP": return "Fi";
            case "ENTP": case "ENFP": return "Ne";
            case "INTJ": case "INFJ": return "Ni";
            case "ESTP": case "ESFP": return "Se";
            case "ISTJ": case "ISFJ": return "Si";
            default: return "unknown";
        }
    }

    public static String GetInferiorFunction(String mbtiType) {
        if (mbtiType == null) return "unknown";
        switch (mbtiType) {
            case "ENTJ": case "ESTJ": return "Fi";
            case "INTP": case "ISTP": return "Fe";
            case "ENFJ": case "ESFJ": return "Ti";
            case "INFP": case "ISFP": return "Te";
            case "ENTP": case "ENFP": return "Si";
            case "INTJ": case "INFJ": return "Se";
            case "ESTP": case "ESFP": return "Ni";
            case "ISTJ": case "ISFJ": return "Ne";
            default: return "unknown";
        }
    }
}
