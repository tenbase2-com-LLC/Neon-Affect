package NeonAffect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class PathologyDetector {

    private PathologyDetector() {}

    private static final int MIN_HISTORY_SIZE = 3;
    private static final int MAX_WINDOW_SIZE = 3;

    public static PathologyResult Detect(ArrayList<AffectHistoryVar> history, String mbtiType) {
        ArrayList<PathologyResult.MotifMatch> tier1Matches = new ArrayList<>();
        ArrayList<PathologyResult.CompoundMatch> compoundMatches = new ArrayList<>();
        AffectDynamicsParams dynamics = new AffectDynamicsParams();

        if (history == null || history.size() < MIN_HISTORY_SIZE) {
            return new PathologyResult(tier1Matches, compoundMatches, dynamics,
                PathologyResult.SEVERITY_NONE, mbtiType, null);
        }

        dynamics = AffectDynamicsCalculator.Compute(history);

        int n = history.size();
        int[] categories = new int[n];
        for (int i = 0; i < n; i++) {
            categories[i] = EmotionCategory.GetPrimaryCategory(history.get(i).GetType());
        }

        MBTIBaselines.Baseline baseline = MBTIBaselines.Get(mbtiType);

        // --- Tier 1: sliding window motif matching ---
        ArrayList<PathologyMotif> motifs = PathologyMotifLibrary.GetMotifs();
        Set<String> matchedMotifIds = new HashSet<>();
        Map<String, Integer> familyCounts = new HashMap<>();

        for (int windowStart = 0; windowStart <= n - 2; windowStart++) {
            for (PathologyMotif motif : motifs) {
                int len = motif.GetLength();
                if (windowStart + len > n) continue;

                int[] window = new int[len];
                System.arraycopy(categories, windowStart, window, 0, len);

                AffectDynamicsParams windowParams = computeWindowParams(history, windowStart, windowStart + len);

                if (motif.Matches(window, windowParams,
                                  baseline.velocityThreshold,
                                  baseline.volatilityThreshold)) {

                    int severity = scoreSeverity(motif, windowParams, dynamics, baseline, mbtiType);

                    tier1Matches.add(new PathologyResult.MotifMatch(
                        motif.GetId(), motif.GetFamily(), motif.GetDescription(),
                        windowStart, severity));

                    matchedMotifIds.add(motif.GetId());
                    familyCounts.merge(motif.GetFamily(), 1, Integer::sum);
                }
            }
        }

        // --- Compound motif detection ---
        for (PathologyMotifLibrary.CompoundMotif compound : PathologyMotifLibrary.GetCompounds()) {
            if (compound.IsPresent(matchedMotifIds)) {
                compoundMatches.add(new PathologyResult.CompoundMatch(
                    compound.GetId(), compound.GetDescription(),
                    compound.GetPathologyTag(), compound.GetComponentIds()));
            }
        }

        // --- Overall severity ---
        int overallSeverity = computeOverallSeverity(
            tier1Matches, compoundMatches, dynamics, baseline, mbtiType, familyCounts);

        // --- Tier 2 route ---
        String tier2Route = computeTier2Route(
            matchedMotifIds, compoundMatches, familyCounts, mbtiType, dynamics);

        return new PathologyResult(tier1Matches, compoundMatches, dynamics,
            overallSeverity, mbtiType, tier2Route);
    }

    private static AffectDynamicsParams computeWindowParams(
            ArrayList<AffectHistoryVar> history, int start, int end) {
        ArrayList<AffectHistoryVar> window = new ArrayList<>();
        for (int i = start; i < end; i++) {
            window.add(history.get(i));
        }
        return AffectDynamicsCalculator.Compute(window);
    }

    private static int scoreSeverity(PathologyMotif motif, AffectDynamicsParams windowParams,
                                     AffectDynamicsParams overallParams,
                                     MBTIBaselines.Baseline baseline,
                                     String mbtiType) {
        int score = 0;
        String family = motif.GetFamily();

        if (family.equals(PathologyMotifLibrary.FAMILY_DESCENT)) {
            int[] seq = motif.GetSequence();
            for (int cat : seq) {
                if (cat == EmotionCategory.NEG_DEEP) score += 2;
                else if (cat == EmotionCategory.NEG_STRONG) score += 1;
            }
        } else if (family.equals(PathologyMotifLibrary.FAMILY_ERUPTION)) {
            if (windowParams.velocity > baseline.velocityThreshold * 1.5) score += 2;
            else if (windowParams.velocity > baseline.velocityThreshold) score += 1;
        } else if (family.equals(PathologyMotifLibrary.FAMILY_OSCILLATION)) {
            if (windowParams.volatility > baseline.volatilityThreshold * 1.5) score += 2;
            else if (windowParams.volatility > baseline.volatilityThreshold) score += 1;
        } else if (family.equals(PathologyMotifLibrary.FAMILY_FIXATION)) {
            score += 1;
        } else if (family.equals(PathologyMotifLibrary.FAMILY_DISCONNECT)) {
            if (overallParams.emotionalEntropy < 1.0) score += 1;
        }

        double deviation = MBTIBaselines.DeviationScore(overallParams, mbtiType);
        if (deviation > 2.0) score += 2;
        else if (deviation > 1.0) score += 1;

        if (score >= 4) return PathologyResult.SEVERITY_CRITICAL;
        if (score >= 3) return PathologyResult.SEVERITY_SEVERE;
        if (score >= 2) return PathologyResult.SEVERITY_MODERATE;
        if (score >= 1) return PathologyResult.SEVERITY_MILD;
        return PathologyResult.SEVERITY_NONE;
    }

    private static int computeOverallSeverity(
            ArrayList<PathologyResult.MotifMatch> matches,
            ArrayList<PathologyResult.CompoundMatch> compounds,
            AffectDynamicsParams dynamics,
            MBTIBaselines.Baseline baseline,
            String mbtiType,
            Map<String, Integer> familyCounts) {

        if (matches.isEmpty()) return PathologyResult.SEVERITY_NONE;

        int maxMotifSeverity = 0;
        for (PathologyResult.MotifMatch m : matches) {
            if (m.GetSeverity() > maxMotifSeverity) maxMotifSeverity = m.GetSeverity();
        }

        int totalScore = maxMotifSeverity;

        if (!compounds.isEmpty()) totalScore += 1;

        int familiesHit = familyCounts.size();
        if (familiesHit >= 3) totalScore += 1;

        double deviation = MBTIBaselines.DeviationScore(dynamics, mbtiType);
        if (deviation > 2.0) totalScore += 1;

        if (dynamics.regulationResistance > 0.7) totalScore += 1;

        if (totalScore >= 6) return PathologyResult.SEVERITY_CRITICAL;
        if (totalScore >= 4) return PathologyResult.SEVERITY_SEVERE;
        if (totalScore >= 2) return PathologyResult.SEVERITY_MODERATE;
        if (totalScore >= 1) return PathologyResult.SEVERITY_MILD;
        return PathologyResult.SEVERITY_NONE;
    }

    private static String computeTier2Route(
            Set<String> matchedMotifIds,
            ArrayList<PathologyResult.CompoundMatch> compounds,
            Map<String, Integer> familyCounts,
            String mbtiType,
            AffectDynamicsParams dynamics) {

        for (PathologyResult.CompoundMatch c : compounds) {
            return mbtiType + "_" + c.GetPathologyTag();
        }

        String dominantFamily = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : familyCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                dominantFamily = entry.getKey();
            }
        }

        if (dominantFamily == null) return null;

        String inferiorFunc = MBTIBaselines.GetInferiorFunction(mbtiType);
        boolean gripState = false;

        if (inferiorFunc.equals("Fe") && dynamics.valenceAsymmetry < -0.5) gripState = true;
        if (inferiorFunc.equals("Fi") && dynamics.regulationResistance > 0.6) gripState = true;
        if (inferiorFunc.equals("Se") && dynamics.triggerSensitivity > 0.5) gripState = true;
        if (inferiorFunc.equals("Si") && dynamics.inertia > 0.8) gripState = true;
        if (inferiorFunc.equals("Ne") && dynamics.emotionalEntropy > 3.5) gripState = true;
        if (inferiorFunc.equals("Ni") && dynamics.attractorStrength > 0.7) gripState = true;
        if (inferiorFunc.equals("Te") && dynamics.volatility > baseline_vol(mbtiType) * 2) gripState = true;
        if (inferiorFunc.equals("Ti") && dynamics.crossEmotionCoupling < 0.1) gripState = true;

        String route = mbtiType + "_" + dominantFamily;
        if (gripState) route += "_GRIP";

        return route;
    }

    private static double baseline_vol(String mbtiType) {
        return MBTIBaselines.Get(mbtiType).volatilityMean;
    }
}
