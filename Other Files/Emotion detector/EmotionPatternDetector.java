package NeonAffect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class EmotionPatternDetector {

    private EmotionPatternDetector() {}

    private static final int MIN_HISTORY_SIZE = 3;

    public static EmotionPatternResult Detect(ArrayList<AffectHistoryVar> history, String mbtiType) {
        ArrayList<EmotionPatternResult.MotifMatch> motifMatches = new ArrayList<>();
        ArrayList<EmotionPatternResult.CompoundMatch> compoundMatches = new ArrayList<>();
        AffectDynamicsParams dynamics = new AffectDynamicsParams();

        if (history == null || history.size() < MIN_HISTORY_SIZE) {
            return new EmotionPatternResult(motifMatches, compoundMatches, dynamics,
                EmotionPatternResult.STRENGTH_NONE, mbtiType, null);
        }

        dynamics = AffectDynamicsCalculator.Compute(history);

        int n = history.size();
        int[] categories = new int[n];
        for (int i = 0; i < n; i++) {
            categories[i] = EmotionCategory.GetPrimaryCategory(history.get(i).GetType());
        }

        MBTIBaselines.Baseline baseline = MBTIBaselines.Get(mbtiType);

        ArrayList<EmotionPatternMotif> motifs = EmotionPatternLibrary.GetMotifs();
        Set<String> matchedMotifIds = new HashSet<>();
        Map<String, Integer> familyCounts = new HashMap<>();

        for (int windowStart = 0; windowStart <= n - 2; windowStart++) {
            for (EmotionPatternMotif motif : motifs) {
                int len = motif.GetLength();
                if (windowStart + len > n) continue;

                int[] window = new int[len];
                System.arraycopy(categories, windowStart, window, 0, len);

                AffectDynamicsParams windowParams = computeWindowParams(history, windowStart, windowStart + len);

                if (motif.Matches(window, windowParams,
                                  baseline.velocityThreshold,
                                  baseline.volatilityThreshold)) {

                    int strength = scoreStrength(motif, windowParams, dynamics, mbtiType);

                    motifMatches.add(new EmotionPatternResult.MotifMatch(
                        motif.GetId(), motif.GetFamily(), motif.GetDescription(),
                        windowStart, strength));

                    matchedMotifIds.add(motif.GetId());
                    familyCounts.merge(motif.GetFamily(), 1, Integer::sum);
                }
            }
        }

        for (EmotionPatternLibrary.CompoundMotif compound : EmotionPatternLibrary.GetCompounds()) {
            if (compound.IsPresent(matchedMotifIds)) {
                compoundMatches.add(new EmotionPatternResult.CompoundMatch(
                    compound.GetId(), compound.GetDescription(),
                    compound.GetPatternTag(), compound.GetComponentIds()));
            }
        }

        int overallStrength = computeOverallStrength(
            motifMatches, compoundMatches, dynamics, familyCounts);

        String dominantFamily = computeDominantFamily(familyCounts);

        return new EmotionPatternResult(motifMatches, compoundMatches, dynamics,
            overallStrength, mbtiType, dominantFamily);
    }

    private static AffectDynamicsParams computeWindowParams(
            ArrayList<AffectHistoryVar> history, int start, int end) {
        ArrayList<AffectHistoryVar> window = new ArrayList<>();
        for (int i = start; i < end; i++) {
            window.add(history.get(i));
        }
        return AffectDynamicsCalculator.Compute(window);
    }

    private static int scoreStrength(EmotionPatternMotif motif,
                                     AffectDynamicsParams windowParams,
                                     AffectDynamicsParams overallParams,
                                     String mbtiType) {
        int score = 0;
        String family = motif.GetFamily();

        if (family.equals(EmotionPatternLibrary.FAMILY_ASCENT)) {
            int[] seq = motif.GetSequence();
            for (int cat : seq) {
                if (cat == EmotionCategory.POS_PEAK) score += 2;
                else if (cat == EmotionCategory.POS_STRONG) score += 1;
            }
        } else if (family.equals(EmotionPatternLibrary.FAMILY_STABILITY)) {
            if (overallParams.volatility < 0.3) score += 2;
            else if (overallParams.volatility < 0.5) score += 1;
        } else if (family.equals(EmotionPatternLibrary.FAMILY_FLEXIBILITY)) {
            if (overallParams.emotionalGranularity > 0.7) score += 2;
            else if (overallParams.emotionalGranularity > 0.5) score += 1;
        } else if (family.equals(EmotionPatternLibrary.FAMILY_REGULATION)) {
            if (overallParams.regulationResistance < 0.2) score += 2;
            else if (overallParams.regulationResistance < 0.4) score += 1;
        } else if (family.equals(EmotionPatternLibrary.FAMILY_ENGAGEMENT)) {
            if (overallParams.conversationArcSlope > 0.3) score += 2;
            else if (overallParams.conversationArcSlope > 0.1) score += 1;
        } else if (family.equals(EmotionPatternLibrary.FAMILY_RESILIENCE)) {
            if (overallParams.recoveryTime < 2.0) score += 2;
            else if (overallParams.recoveryTime < 5.0) score += 1;
        } else if (family.equals(EmotionPatternLibrary.FAMILY_FLOW)) {
            if (overallParams.inertia > 0.6 && overallParams.volatility < 0.3) score += 2;
            else if (overallParams.inertia > 0.4) score += 1;
        } else if (family.equals(EmotionPatternLibrary.FAMILY_GROWTH)) {
            if (overallParams.conversationArcSlope > 0.2 && overallParams.emotionalGranularity > 0.5) score += 2;
            else if (overallParams.conversationArcSlope > 0.1) score += 1;
        } else if (family.equals(EmotionPatternLibrary.FAMILY_BONDING)) {
            if (overallParams.valenceAsymmetry > 0.3) score += 2;
            else if (overallParams.valenceAsymmetry > 0.1) score += 1;
        } else if (family.equals(EmotionPatternLibrary.FAMILY_INTEGRATION)) {
            if (overallParams.conversationArcSlope > 0.2 && overallParams.regulationResistance < 0.3) score += 2;
            else if (overallParams.conversationArcSlope > 0.0) score += 1;
        } else if (family.equals(EmotionPatternLibrary.FAMILY_TRANSITION)) {
            if (windowParams.velocity > 0.5) score += 2;
            else score += 1;
        } else if (family.equals(EmotionPatternLibrary.FAMILY_COMPLEXITY)) {
            if (overallParams.emotionalEntropy > 3.0) score += 2;
            else if (overallParams.emotionalEntropy > 2.0) score += 1;
        } else if (family.equals(EmotionPatternLibrary.FAMILY_INTENSITY)) {
            if (overallParams.amplitude > 6.0) score += 2;
            else if (overallParams.amplitude > 3.0) score += 1;
        } else if (family.equals(EmotionPatternLibrary.FAMILY_RHYTHM)) {
            if (overallParams.periodicity > 0.3) score += 2;
            else if (overallParams.periodicity > 0.1) score += 1;
        } else if (family.equals(EmotionPatternLibrary.FAMILY_CONTAGION)) {
            if (overallParams.contagionBreadth > 5) score += 2;
            else if (overallParams.contagionBreadth > 3) score += 1;
        }

        if (score >= 4) return EmotionPatternResult.STRENGTH_DOMINANT;
        if (score >= 3) return EmotionPatternResult.STRENGTH_STRONG;
        if (score >= 2) return EmotionPatternResult.STRENGTH_MODERATE;
        if (score >= 1) return EmotionPatternResult.STRENGTH_FAINT;
        return EmotionPatternResult.STRENGTH_NONE;
    }

    private static int computeOverallStrength(
            ArrayList<EmotionPatternResult.MotifMatch> matches,
            ArrayList<EmotionPatternResult.CompoundMatch> compounds,
            AffectDynamicsParams dynamics,
            Map<String, Integer> familyCounts) {

        if (matches.isEmpty()) return EmotionPatternResult.STRENGTH_NONE;

        int maxStrength = 0;
        for (EmotionPatternResult.MotifMatch m : matches) {
            if (m.GetStrength() > maxStrength) maxStrength = m.GetStrength();
        }

        int totalScore = maxStrength;

        if (!compounds.isEmpty()) totalScore += 1;

        int familiesHit = familyCounts.size();
        if (familiesHit >= 4) totalScore += 2;
        else if (familiesHit >= 2) totalScore += 1;

        int totalMatches = matches.size();
        if (totalMatches >= 10) totalScore += 2;
        else if (totalMatches >= 5) totalScore += 1;

        if (totalScore >= 7) return EmotionPatternResult.STRENGTH_DOMINANT;
        if (totalScore >= 5) return EmotionPatternResult.STRENGTH_STRONG;
        if (totalScore >= 3) return EmotionPatternResult.STRENGTH_MODERATE;
        if (totalScore >= 1) return EmotionPatternResult.STRENGTH_FAINT;
        return EmotionPatternResult.STRENGTH_NONE;
    }

    private static String computeDominantFamily(Map<String, Integer> familyCounts) {
        String dominant = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : familyCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                dominant = entry.getKey();
            }
        }
        return dominant;
    }
}
