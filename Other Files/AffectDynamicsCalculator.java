package NeonAffect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class AffectDynamicsCalculator {

    private AffectDynamicsCalculator() {}

    public static AffectDynamicsParams Compute(ArrayList<AffectHistoryVar> history) {
        AffectDynamicsParams p = new AffectDynamicsParams();
        if (history == null || history.size() < 2) return p;

        int n = history.size();

        double[] valences = new double[n];
        long[] times = new long[n];
        int[] cats = new int[n];

        for (int i = 0; i < n; i++) {
            AffectHistoryVar h = history.get(i);
            int cat = EmotionCategory.GetPrimaryCategory(h.GetType());
            cats[i] = cat;
            valences[i] = EmotionCategory.GetValenceRank(cat) * Math.abs(h.GetValue());
            times[i] = h.GetTime();
        }

        // --- velocity: mean |dValence/dt| ---
        double[] velocities = new double[n - 1];
        for (int i = 1; i < n; i++) {
            double dt = (times[i] - times[i - 1]) / 1000.0;
            if (dt < 0.001) dt = 0.001;
            velocities[i - 1] = (valences[i] - valences[i - 1]) / dt;
        }
        p.velocity = meanAbs(velocities);

        // --- acceleration: mean |dVelocity/dt| ---
        if (velocities.length >= 2) {
            double[] accs = new double[velocities.length - 1];
            for (int i = 1; i < velocities.length; i++) {
                double dt = (times[i + 1] - times[i]) / 1000.0;
                if (dt < 0.001) dt = 0.001;
                accs[i - 1] = (velocities[i] - velocities[i - 1]) / dt;
            }
            p.acceleration = meanAbs(accs);
        }

        // --- amplitude: max(valence) - min(valence) ---
        double vMin = valences[0], vMax = valences[0];
        for (int i = 1; i < n; i++) {
            if (valences[i] < vMin) vMin = valences[i];
            if (valences[i] > vMax) vMax = valences[i];
        }
        p.amplitude = vMax - vMin;

        // --- inertia: autocorrelation at lag 1 ---
        p.inertia = autocorrelation(valences);

        // --- volatility: std dev of valence changes ---
        p.volatility = stdDev(velocities);

        // --- baseline drift: slope of linear regression on valences over time ---
        p.baselineDrift = linearSlope(times, valences);

        // --- recovery time: average time from neg peak to non-negative ---
        p.recoveryTime = computeRecoveryTime(valences, times);

        // --- reactivity: mean absolute change from neutral (0) ---
        p.reactivity = meanAbs(valences);

        // --- emotional entropy: Shannon entropy of category distribution ---
        p.emotionalEntropy = categoryEntropy(cats);

        // --- attractor strength: fraction of time in most-visited category ---
        p.attractorStrength = attractorStrength(cats);

        // --- valence asymmetry: (sum of positive valences) / (sum of |negative valences|) - 1 ---
        p.valenceAsymmetry = valenceAsymmetry(valences);

        // --- emotional granularity: unique emotions / total ---
        p.emotionalGranularity = emotionalGranularity(history);

        // --- cross-emotion coupling: correlation between adjacent category changes ---
        p.crossEmotionCoupling = crossCategoryCoupling(cats);

        // --- arousal-valence decoupling: fraction of events where arousal tag disagrees with valence direction ---
        p.arousalValenceDecoupling = arousalValenceDecoupling(history);

        // --- plateau duration: longest consecutive run of same category ---
        p.plateauDuration = plateauDuration(cats, times);

        // --- regulation resistance: fraction of neg->pos transitions that revert within 2 steps ---
        p.regulationResistance = regulationResistance(cats);

        // --- trigger sensitivity: ratio of extreme emotions to total ---
        p.triggerSensitivity = triggerSensitivity(cats);

        // --- periodicity: dominant frequency via zero-crossing rate ---
        p.periodicity = zeroCrossingRate(valences, times);

        // --- contagion breadth: number of distinct timelines touched ---
        p.contagionBreadth = contagionBreadth(history);

        // --- conversation arc slope: slope of second half vs first half mean ---
        p.conversationArcSlope = conversationArcSlope(valences);

        return p;
    }

    private static double meanAbs(double[] arr) {
        if (arr.length == 0) return 0;
        double sum = 0;
        for (double v : arr) sum += Math.abs(v);
        return sum / arr.length;
    }

    private static double mean(double[] arr) {
        if (arr.length == 0) return 0;
        double sum = 0;
        for (double v : arr) sum += v;
        return sum / arr.length;
    }

    private static double stdDev(double[] arr) {
        if (arr.length < 2) return 0;
        double m = mean(arr);
        double sum = 0;
        for (double v : arr) sum += (v - m) * (v - m);
        return Math.sqrt(sum / (arr.length - 1));
    }

    private static double autocorrelation(double[] vals) {
        if (vals.length < 3) return 0;
        double m = mean(vals);
        double num = 0, den = 0;
        for (int i = 0; i < vals.length - 1; i++) {
            num += (vals[i] - m) * (vals[i + 1] - m);
        }
        for (double v : vals) den += (v - m) * (v - m);
        if (den < 1e-9) return 0;
        return num / den;
    }

    private static double linearSlope(long[] times, double[] vals) {
        int n = vals.length;
        if (n < 2) return 0;
        double t0 = times[0];
        double sumX = 0, sumY = 0, sumXY = 0, sumXX = 0;
        for (int i = 0; i < n; i++) {
            double x = (times[i] - t0) / 1000.0;
            sumX += x;
            sumY += vals[i];
            sumXY += x * vals[i];
            sumXX += x * x;
        }
        double denom = n * sumXX - sumX * sumX;
        if (Math.abs(denom) < 1e-9) return 0;
        return (n * sumXY - sumX * sumY) / denom;
    }

    private static double computeRecoveryTime(double[] valences, long[] times) {
        double totalRecovery = 0;
        int recoveryCount = 0;
        for (int i = 1; i < valences.length - 1; i++) {
            if (valences[i] < valences[i - 1] && valences[i] < -1) {
                for (int j = i + 1; j < valences.length; j++) {
                    if (valences[j] >= 0) {
                        totalRecovery += (times[j] - times[i]) / 1000.0;
                        recoveryCount++;
                        break;
                    }
                }
            }
        }
        return recoveryCount > 0 ? totalRecovery / recoveryCount : 0;
    }

    private static double categoryEntropy(int[] cats) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int c : cats) counts.merge(c, 1, Integer::sum);
        double entropy = 0;
        double n = cats.length;
        for (int count : counts.values()) {
            double p = count / n;
            if (p > 0) entropy -= p * (Math.log(p) / Math.log(2));
        }
        return entropy;
    }

    private static double attractorStrength(int[] cats) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int c : cats) counts.merge(c, 1, Integer::sum);
        int maxCount = 0;
        for (int count : counts.values()) {
            if (count > maxCount) maxCount = count;
        }
        return (double) maxCount / cats.length;
    }

    private static double valenceAsymmetry(double[] valences) {
        double posSum = 0, negSum = 0;
        for (double v : valences) {
            if (v > 0) posSum += v;
            else if (v < 0) negSum += Math.abs(v);
        }
        if (negSum < 0.001 && posSum < 0.001) return 0;
        if (negSum < 0.001) return 1;
        return (posSum / negSum) - 1;
    }

    private static double emotionalGranularity(ArrayList<AffectHistoryVar> history) {
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < history.size(); i++) {
            unique.add(history.get(i).GetType());
        }
        return (double) unique.size() / history.size();
    }

    private static double crossCategoryCoupling(int[] cats) {
        if (cats.length < 3) return 0;
        int coupled = 0;
        for (int i = 1; i < cats.length - 1; i++) {
            int prevDelta = cats[i] - cats[i - 1];
            int nextDelta = cats[i + 1] - cats[i];
            if (Integer.signum(prevDelta) == Integer.signum(nextDelta) && prevDelta != 0) {
                coupled++;
            }
        }
        return (double) coupled / (cats.length - 2);
    }

    private static double arousalValenceDecoupling(ArrayList<AffectHistoryVar> history) {
        int decoupled = 0;
        int arousalCount = 0;
        for (int i = 0; i < history.size(); i++) {
            AffectHistoryVar h = history.get(i);
            if (EmotionCategory.IsInCategory(h.GetType(), EmotionCategory.CAT_AROUSAL)) {
                arousalCount++;
                int primary = EmotionCategory.GetPrimaryCategory(h.GetType());
                if (EmotionCategory.IsNegative(primary)) {
                    decoupled++;
                }
            }
        }
        return arousalCount > 0 ? (double) decoupled / arousalCount : 0;
    }

    private static double plateauDuration(int[] cats, long[] times) {
        double maxDuration = 0;
        int start = 0;
        for (int i = 1; i < cats.length; i++) {
            if (cats[i] != cats[start]) {
                double d = (times[i - 1] - times[start]) / 1000.0;
                if (d > maxDuration) maxDuration = d;
                start = i;
            }
        }
        double d = (times[cats.length - 1] - times[start]) / 1000.0;
        if (d > maxDuration) maxDuration = d;
        return maxDuration;
    }

    private static double regulationResistance(int[] cats) {
        int attempts = 0, reversions = 0;
        for (int i = 1; i < cats.length; i++) {
            if (EmotionCategory.IsNegative(cats[i - 1]) && EmotionCategory.IsPositive(cats[i])) {
                attempts++;
                for (int j = i + 1; j < Math.min(i + 3, cats.length); j++) {
                    if (EmotionCategory.IsNegative(cats[j])) {
                        reversions++;
                        break;
                    }
                }
            }
        }
        return attempts > 0 ? (double) reversions / attempts : 0;
    }

    private static double triggerSensitivity(int[] cats) {
        int extreme = 0;
        for (int c : cats) {
            if (c == EmotionCategory.NEG_DEEP || c == EmotionCategory.NEG_STRONG
                || c == EmotionCategory.POS_PEAK) {
                extreme++;
            }
        }
        return (double) extreme / cats.length;
    }

    private static double zeroCrossingRate(double[] valences, long[] times) {
        if (valences.length < 3) return 0;
        double m = mean(valences);
        int crossings = 0;
        for (int i = 1; i < valences.length; i++) {
            if ((valences[i] - m) * (valences[i - 1] - m) < 0) crossings++;
        }
        double totalTime = (times[valences.length - 1] - times[0]) / 1000.0;
        return totalTime > 0 ? crossings / totalTime : 0;
    }

    private static double contagionBreadth(ArrayList<AffectHistoryVar> history) {
        Set<Integer> timelines = new HashSet<>();
        for (int i = 0; i < history.size(); i++) {
            timelines.add(history.get(i).GetID());
        }
        return timelines.size();
    }

    private static double conversationArcSlope(double[] valences) {
        int n = valences.length;
        if (n < 4) return 0;
        int mid = n / 2;
        double firstHalf = 0, secondHalf = 0;
        for (int i = 0; i < mid; i++) firstHalf += valences[i];
        for (int i = mid; i < n; i++) secondHalf += valences[i];
        firstHalf /= mid;
        secondHalf /= (n - mid);
        return secondHalf - firstHalf;
    }
}
