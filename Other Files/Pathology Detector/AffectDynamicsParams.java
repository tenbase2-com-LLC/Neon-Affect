package NeonAffect;

import java.io.Serializable;

public class AffectDynamicsParams implements Serializable {

    public double velocity;
    public double acceleration;
    public double amplitude;
    public double inertia;
    public double volatility;
    public double baselineDrift;
    public double recoveryTime;
    public double reactivity;
    public double emotionalEntropy;
    public double attractorStrength;
    public double valenceAsymmetry;
    public double emotionalGranularity;
    public double crossEmotionCoupling;
    public double arousalValenceDecoupling;
    public double plateauDuration;
    public double regulationResistance;
    public double triggerSensitivity;
    public double periodicity;
    public double contagionBreadth;
    public double conversationArcSlope;

    public AffectDynamicsParams() {}

    public double[] ToArray() {
        return new double[] {
            velocity, acceleration, amplitude, inertia, volatility,
            baselineDrift, recoveryTime, reactivity, emotionalEntropy,
            attractorStrength, valenceAsymmetry, emotionalGranularity,
            crossEmotionCoupling, arousalValenceDecoupling, plateauDuration,
            regulationResistance, triggerSensitivity, periodicity,
            contagionBreadth, conversationArcSlope
        };
    }

    public String toString() {
        return "AffectDynamics[vel=" + f(velocity) + " acc=" + f(acceleration)
             + " amp=" + f(amplitude) + " iner=" + f(inertia)
             + " vol=" + f(volatility) + " drift=" + f(baselineDrift)
             + " recov=" + f(recoveryTime) + " react=" + f(reactivity)
             + " entropy=" + f(emotionalEntropy) + " attr=" + f(attractorStrength)
             + " valAsym=" + f(valenceAsymmetry) + " gran=" + f(emotionalGranularity)
             + " couple=" + f(crossEmotionCoupling) + " avDecoup=" + f(arousalValenceDecoupling)
             + " plateau=" + f(plateauDuration) + " regRes=" + f(regulationResistance)
             + " trigSens=" + f(triggerSensitivity) + " period=" + f(periodicity)
             + " contag=" + f(contagionBreadth) + " arcSlope=" + f(conversationArcSlope) + "]";
    }

    private static String f(double v) {
        return String.format("%.3f", v);
    }
}
