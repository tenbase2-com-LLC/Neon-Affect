package NeonAffect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class EmotionalTrajectoryAnalyzer {

    private EmotionalTrajectoryAnalyzer() {}

    private static final String[][] OPPOSING_PAIRS = {
        { PathologyMotifLibrary.FAMILY_DESCENT,      EmotionPatternLibrary.FAMILY_ASCENT },
        { PathologyMotifLibrary.FAMILY_DESCENT,      EmotionPatternLibrary.FAMILY_RESILIENCE },
        { PathologyMotifLibrary.FAMILY_OSCILLATION,  EmotionPatternLibrary.FAMILY_STABILITY },
        { PathologyMotifLibrary.FAMILY_OSCILLATION,  EmotionPatternLibrary.FAMILY_REGULATION },
        { PathologyMotifLibrary.FAMILY_FIXATION,     EmotionPatternLibrary.FAMILY_FLEXIBILITY },
        { PathologyMotifLibrary.FAMILY_FIXATION,     EmotionPatternLibrary.FAMILY_GROWTH },
        { PathologyMotifLibrary.FAMILY_ERUPTION,     EmotionPatternLibrary.FAMILY_REGULATION },
        { PathologyMotifLibrary.FAMILY_ERUPTION,     EmotionPatternLibrary.FAMILY_INTEGRATION },
        { PathologyMotifLibrary.FAMILY_DISCONNECT,   EmotionPatternLibrary.FAMILY_ENGAGEMENT },
        { PathologyMotifLibrary.FAMILY_DISCONNECT,   EmotionPatternLibrary.FAMILY_BONDING },
    };

    private static final String[][] OPPOSING_DESCRIPTIONS = {
        { "DESCENT",     "ASCENT",      "Upward momentum counteracting downward trajectory" },
        { "DESCENT",     "RESILIENCE",  "Active recovery from emotional descent" },
        { "OSCILLATION", "STABILITY",   "Stabilizing forces against emotional oscillation" },
        { "OSCILLATION", "REGULATION",  "Emerging regulation of oscillating states" },
        { "FIXATION",    "FLEXIBILITY", "Adaptive range breaking through emotional fixation" },
        { "FIXATION",    "GROWTH",      "Growth patterns loosening fixated states" },
        { "ERUPTION",    "REGULATION",  "Developing containment of eruption patterns" },
        { "ERUPTION",    "INTEGRATION", "Processing and integrating eruption experiences" },
        { "DISCONNECT",  "ENGAGEMENT",  "Re-engagement counteracting emotional withdrawal" },
        { "DISCONNECT",  "BONDING",     "Reconnection overcoming disconnection patterns" },
    };

    private static final String[][] REINFORCING_PAIRS = {
        { PathologyMotifLibrary.FAMILY_DESCENT,      EmotionPatternLibrary.FAMILY_INTEGRATION, "Processing descent through emotional integration" },
        { PathologyMotifLibrary.FAMILY_OSCILLATION,  EmotionPatternLibrary.FAMILY_COMPLEXITY,  "Oscillation reflecting emotional complexity processing" },
        { PathologyMotifLibrary.FAMILY_ERUPTION,     EmotionPatternLibrary.FAMILY_INTENSITY,   "Eruption energy channeled into intensity patterns" },
        { PathologyMotifLibrary.FAMILY_FIXATION,      EmotionPatternLibrary.FAMILY_STABILITY,  "Fixation masking as stability — verify genuine equilibrium" },
        { PathologyMotifLibrary.FAMILY_DISCONNECT,   EmotionPatternLibrary.FAMILY_FLOW,        "Disconnect coexisting with flow — possible selective engagement" },
    };

    private static final String[][] COMPOUND_CROSS_REFS = {
        { "DEPRESSION",         "HEALING",            "Healing from depressive trajectory" },
        { "DEPRESSION",         "BREAKTHROUGH",       "Breaking through depressive pattern" },
        { "DEPRESSION",         "TRANSFORMATION",     "Transformative recovery from depression" },
        { "ANXIETY",            "MINDFULNESS",        "Mindfulness managing anxiety patterns" },
        { "ANXIETY",            "SERENITY",           "Achieving serenity despite anxiety" },
        { "ANXIETY",            "EQUANIMITY",         "Developing equanimity against anxiety" },
        { "BIPOLAR",            "EMOTIONAL_MASTERY",  "Developing mastery over bipolar oscillation" },
        { "BIPOLAR",            "EQUANIMITY",         "Equanimity emerging from bipolar pattern" },
        { "BORDERLINE",         "EMOTIONAL_MASTERY",  "Building emotional mastery against borderline instability" },
        { "BORDERLINE",         "SECURE_ATTACHMENT",  "Secure attachment forming despite borderline patterns" },
        { "TRAUMA",             "HEALING",            "Active healing from trauma re-experiencing" },
        { "TRAUMA",             "TRANSFORMATION",     "Post-traumatic growth and transformation" },
        { "BURNOUT",            "VITALITY",           "Vitality returning after burnout" },
        { "BURNOUT",            "PRESENCE",           "Re-establishing presence after burnout" },
        { "HELPLESSNESS",       "BREAKTHROUGH",       "Breaking through learned helplessness" },
        { "HELPLESSNESS",       "FLOURISHING",        "Flourishing emerging from helplessness" },
        { "DISSOCIATION",       "PRESENCE",           "Presence countering dissociative patterns" },
        { "DISSOCIATION",       "AUTHENTICITY",       "Authentic reconnection from dissociation" },
        { "RAGE_GUILT",         "EMOTIONAL_MASTERY",  "Mastery developing over rage-guilt cycle" },
        { "RAGE_GUILT",         "EQUANIMITY",         "Equanimity replacing rage-guilt oscillation" },
        { "MANIC_DEFENSE",      "WISDOM",             "Wisdom replacing manic defensive patterns" },
        { "MANIC_DEFENSE",      "SERENITY",           "Serenity grounding manic defense" },
        { "NARCISSISTIC",       "AUTHENTICITY",       "Authentic expression replacing narcissistic patterns" },
        { "NARCISSISTIC",       "WISDOM",             "Wisdom transcending narcissistic wound cycle" },
        { "PASSIVE_AGGRESSIVE", "AUTHENTICITY",       "Authentic expression replacing passive-aggression" },
        { "PASSIVE_AGGRESSIVE", "EMOTIONAL_MASTERY",  "Direct emotional mastery replacing indirect expression" },
        { "PERFECTIONISM",      "CREATIVE_FLOW",      "Creative flow releasing perfectionist rigidity" },
        { "PERFECTIONISM",      "FLOURISHING",        "Flourishing beyond perfectionist constraints" },
        { "AVOIDANCE",          "PRESENCE",           "Presence overcoming avoidant withdrawal" },
        { "AVOIDANCE",          "SECURE_ATTACHMENT",   "Secure attachment replacing avoidant patterns" },
        { "RUMINATION",         "MINDFULNESS",        "Mindfulness interrupting obsessive rumination" },
        { "RUMINATION",         "CREATIVE_FLOW",      "Creative flow redirecting ruminative energy" },
    };

    public static TrajectoryAnalysisResult Analyze(PathologyResult pathology,
                                                    EmotionPatternResult pattern) {

        String mbtiType = pathology != null ? pathology.GetMBTIType() :
                          pattern != null ? pattern.GetMBTIType() : null;

        int severity = pathology != null ? pathology.GetOverallSeverity() : 0;
        int strength = pattern != null ? pattern.GetOverallStrength() : 0;

        int netBalance = strength - severity;
        if (netBalance < -4) netBalance = -4;
        if (netBalance > 4) netBalance = 4;

        Set<String> pathologyFamilies = collectPathologyFamilies(pathology);
        Set<String> patternFamilies = collectPatternFamilies(pattern);
        Set<String> pathologyCompoundTags = collectPathologyCompoundTags(pathology);
        Set<String> patternCompoundTags = collectPatternCompoundTags(pattern);

        String dominantPathFamily = computeDominantPathologyFamily(pathology);
        String dominantPatternFamily = pattern != null ? pattern.GetDominantFamily() : null;

        ArrayList<TrajectoryAnalysisResult.InteractionSignal> interactions =
            detectInteractions(pathologyFamilies, patternFamilies, severity, strength);

        ArrayList<TrajectoryAnalysisResult.CompoundCrossRef> crossRefs =
            detectCompoundCrossRefs(pathologyCompoundTags, patternCompoundTags);

        int phase = determinePhase(severity, strength, interactions, crossRefs);

        String narrative = buildNarrative(phase, severity, strength, netBalance,
            dominantPathFamily, dominantPatternFamily,
            interactions, crossRefs, mbtiType);

        return new TrajectoryAnalysisResult(phase, netBalance, narrative, mbtiType,
            severity, strength, dominantPathFamily, dominantPatternFamily,
            interactions, crossRefs);
    }

    private static Set<String> collectPathologyFamilies(PathologyResult result) {
        Set<String> families = new HashSet<>();
        if (result == null) return families;
        for (PathologyResult.MotifMatch m : result.GetTier1Matches()) {
            families.add(m.GetFamily());
        }
        return families;
    }

    private static Set<String> collectPatternFamilies(EmotionPatternResult result) {
        Set<String> families = new HashSet<>();
        if (result == null) return families;
        for (EmotionPatternResult.MotifMatch m : result.GetMotifMatches()) {
            families.add(m.GetFamily());
        }
        return families;
    }

    private static Set<String> collectPathologyCompoundTags(PathologyResult result) {
        Set<String> tags = new HashSet<>();
        if (result == null) return tags;
        for (PathologyResult.CompoundMatch c : result.GetCompoundMatches()) {
            tags.add(c.GetPathologyTag());
        }
        return tags;
    }

    private static Set<String> collectPatternCompoundTags(EmotionPatternResult result) {
        Set<String> tags = new HashSet<>();
        if (result == null) return tags;
        for (EmotionPatternResult.CompoundMatch c : result.GetCompoundMatches()) {
            tags.add(c.GetPatternTag());
        }
        return tags;
    }

    private static String computeDominantPathologyFamily(PathologyResult result) {
        if (result == null) return null;
        Map<String, Integer> counts = new HashMap<>();
        for (PathologyResult.MotifMatch m : result.GetTier1Matches()) {
            counts.merge(m.GetFamily(), 1, Integer::sum);
        }
        String dominant = null;
        int max = 0;
        for (Map.Entry<String, Integer> e : counts.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                dominant = e.getKey();
            }
        }
        return dominant;
    }

    private static ArrayList<TrajectoryAnalysisResult.InteractionSignal> detectInteractions(
            Set<String> pathFamilies, Set<String> patternFamilies,
            int severity, int strength) {

        ArrayList<TrajectoryAnalysisResult.InteractionSignal> signals = new ArrayList<>();
        int signalNum = 0;

        for (int i = 0; i < OPPOSING_PAIRS.length; i++) {
            String pathFam = OPPOSING_PAIRS[i][0];
            String emFam = OPPOSING_PAIRS[i][1];
            if (pathFamilies.contains(pathFam) && patternFamilies.contains(emFam)) {
                signalNum++;
                int sig = (severity >= 3 && strength >= 3) ?
                    TrajectoryAnalysisResult.SIG_CRITICAL :
                    (severity >= 2 || strength >= 2) ?
                        TrajectoryAnalysisResult.SIG_SIGNIFICANT :
                        TrajectoryAnalysisResult.SIG_NOTABLE;

                signals.add(new TrajectoryAnalysisResult.InteractionSignal(
                    "OPP-" + String.format("%02d", signalNum),
                    OPPOSING_DESCRIPTIONS[i][2],
                    pathFam, emFam, sig));
            }
        }

        for (String[] pair : REINFORCING_PAIRS) {
            String pathFam = pair[0];
            String emFam = pair[1];
            if (pathFamilies.contains(pathFam) && patternFamilies.contains(emFam)) {
                signalNum++;
                signals.add(new TrajectoryAnalysisResult.InteractionSignal(
                    "RNF-" + String.format("%02d", signalNum),
                    pair[2],
                    pathFam, emFam, TrajectoryAnalysisResult.SIG_NOTABLE));
            }
        }

        for (String pathFam : pathFamilies) {
            boolean hasCounter = false;
            for (String[] opp : OPPOSING_PAIRS) {
                if (opp[0].equals(pathFam) && patternFamilies.contains(opp[1])) {
                    hasCounter = true;
                    break;
                }
            }
            if (!hasCounter && severity >= 2) {
                signalNum++;
                signals.add(new TrajectoryAnalysisResult.InteractionSignal(
                    "UNC-" + String.format("%02d", signalNum),
                    "Uncontested " + pathFam.toLowerCase() + " pathology with no counterbalancing pattern",
                    pathFam, null,
                    severity >= 3 ? TrajectoryAnalysisResult.SIG_CRITICAL :
                                    TrajectoryAnalysisResult.SIG_SIGNIFICANT));
            }
        }

        return signals;
    }

    private static ArrayList<TrajectoryAnalysisResult.CompoundCrossRef> detectCompoundCrossRefs(
            Set<String> pathTags, Set<String> patternTags) {

        ArrayList<TrajectoryAnalysisResult.CompoundCrossRef> refs = new ArrayList<>();
        for (String[] row : COMPOUND_CROSS_REFS) {
            if (pathTags.contains(row[0]) && patternTags.contains(row[1])) {
                refs.add(new TrajectoryAnalysisResult.CompoundCrossRef(row[0], row[1], row[2]));
            }
        }
        return refs;
    }

    private static int determinePhase(int severity, int strength,
            ArrayList<TrajectoryAnalysisResult.InteractionSignal> interactions,
            ArrayList<TrajectoryAnalysisResult.CompoundCrossRef> crossRefs) {

        boolean hasOpposing = false;
        boolean hasUncontested = false;
        for (TrajectoryAnalysisResult.InteractionSignal sig : interactions) {
            if (sig.GetSignalId().startsWith("OPP-")) hasOpposing = true;
            if (sig.GetSignalId().startsWith("UNC-")) hasUncontested = true;
        }

        if (severity >= PathologyResult.SEVERITY_SEVERE && strength <= EmotionPatternResult.STRENGTH_FAINT) {
            return TrajectoryAnalysisResult.PHASE_CRISIS;
        }

        if (severity >= PathologyResult.SEVERITY_MODERATE && strength >= PathologyResult.SEVERITY_MODERATE
                && hasOpposing) {
            if (!crossRefs.isEmpty() || strength > severity) {
                return TrajectoryAnalysisResult.PHASE_RECOVERING;
            }
            return TrajectoryAnalysisResult.PHASE_CONFLICTED;
        }

        if (severity >= PathologyResult.SEVERITY_MODERATE && strength <= EmotionPatternResult.STRENGTH_MODERATE) {
            return TrajectoryAnalysisResult.PHASE_STRUGGLING;
        }

        if (severity <= PathologyResult.SEVERITY_NONE && strength >= EmotionPatternResult.STRENGTH_STRONG) {
            return TrajectoryAnalysisResult.PHASE_THRIVING;
        }

        if (severity <= PathologyResult.SEVERITY_MILD && strength >= EmotionPatternResult.STRENGTH_MODERATE) {
            return TrajectoryAnalysisResult.PHASE_GROWING;
        }

        if (severity >= PathologyResult.SEVERITY_MODERATE && hasOpposing) {
            return TrajectoryAnalysisResult.PHASE_RECOVERING;
        }

        return TrajectoryAnalysisResult.PHASE_STABLE;
    }

    private static String buildNarrative(int phase, int severity, int strength,
            int netBalance,
            String dominantPathFamily, String dominantPatternFamily,
            ArrayList<TrajectoryAnalysisResult.InteractionSignal> interactions,
            ArrayList<TrajectoryAnalysisResult.CompoundCrossRef> crossRefs,
            String mbtiType) {

        StringBuilder sb = new StringBuilder();

        switch (phase) {
            case TrajectoryAnalysisResult.PHASE_CRISIS:
                sb.append("In emotional crisis");
                if (dominantPathFamily != null) {
                    sb.append(" driven by ").append(dominantPathFamily.toLowerCase()).append(" pathology");
                }
                sb.append(" with no significant positive patterns emerging.");
                break;

            case TrajectoryAnalysisResult.PHASE_STRUGGLING:
                sb.append("Struggling emotionally");
                if (dominantPathFamily != null) {
                    sb.append(" with active ").append(dominantPathFamily.toLowerCase()).append(" patterns");
                }
                if (dominantPatternFamily != null) {
                    sb.append(" — faint ").append(dominantPatternFamily.toLowerCase()).append(" signals may indicate early coping");
                }
                sb.append(".");
                break;

            case TrajectoryAnalysisResult.PHASE_RECOVERING:
                sb.append("Recovering");
                if (dominantPathFamily != null && dominantPatternFamily != null) {
                    sb.append(" — ").append(dominantPatternFamily.toLowerCase());
                    sb.append(" patterns emerging against residual ");
                    sb.append(dominantPathFamily.toLowerCase()).append(" pathology");
                }
                sb.append(".");
                break;

            case TrajectoryAnalysisResult.PHASE_CONFLICTED:
                sb.append("In emotional conflict");
                if (dominantPathFamily != null && dominantPatternFamily != null) {
                    sb.append(" — significant ").append(dominantPathFamily.toLowerCase());
                    sb.append(" pathology coexisting with ").append(dominantPatternFamily.toLowerCase());
                    sb.append(" patterns in active tension");
                }
                sb.append(".");
                break;

            case TrajectoryAnalysisResult.PHASE_GROWING:
                sb.append("Growing emotionally");
                if (dominantPatternFamily != null) {
                    sb.append(" with strong ").append(dominantPatternFamily.toLowerCase()).append(" patterns");
                }
                if (severity > 0 && dominantPathFamily != null) {
                    sb.append(" despite mild ").append(dominantPathFamily.toLowerCase()).append(" traces");
                }
                sb.append(".");
                break;

            case TrajectoryAnalysisResult.PHASE_THRIVING:
                sb.append("Thriving");
                if (dominantPatternFamily != null) {
                    sb.append(" with dominant ").append(dominantPatternFamily.toLowerCase()).append(" patterns");
                }
                sb.append(" and no pathological concern.");
                break;

            case TrajectoryAnalysisResult.PHASE_STABLE:
                sb.append("Emotionally stable with no strong signals in either direction.");
                break;
        }

        int criticalCount = 0;
        int significantCount = 0;
        for (TrajectoryAnalysisResult.InteractionSignal sig : interactions) {
            if (sig.GetSignificance() == TrajectoryAnalysisResult.SIG_CRITICAL) criticalCount++;
            else if (sig.GetSignificance() == TrajectoryAnalysisResult.SIG_SIGNIFICANT) significantCount++;
        }

        if (criticalCount > 0 || significantCount > 0) {
            sb.append(" Active dynamics: ");
            boolean first = true;
            for (TrajectoryAnalysisResult.InteractionSignal sig : interactions) {
                if (sig.GetSignificance() >= TrajectoryAnalysisResult.SIG_SIGNIFICANT) {
                    if (!first) sb.append("; ");
                    sb.append(sig.GetDescription().substring(0, 1).toLowerCase());
                    sb.append(sig.GetDescription().substring(1));
                    first = false;
                }
            }
            sb.append(".");
        }

        if (!crossRefs.isEmpty()) {
            sb.append(" Compound interaction: ");
            boolean first = true;
            for (TrajectoryAnalysisResult.CompoundCrossRef ref : crossRefs) {
                if (!first) sb.append("; ");
                sb.append(ref.GetDescription().substring(0, 1).toLowerCase());
                sb.append(ref.GetDescription().substring(1));
                first = false;
            }
            sb.append(".");
        }

        String direction;
        if (netBalance >= 3) direction = "strongly positive";
        else if (netBalance >= 1) direction = "positive";
        else if (netBalance == 0) direction = "balanced";
        else if (netBalance >= -2) direction = "negative";
        else direction = "strongly negative";

        sb.append(" Overall trajectory: ").append(direction);
        if (mbtiType != null) {
            sb.append(" (").append(mbtiType).append("-calibrated)");
        }
        sb.append(".");

        return sb.toString();
    }
}
