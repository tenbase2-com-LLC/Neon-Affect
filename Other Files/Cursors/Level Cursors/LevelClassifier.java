package NeonAffect;

public class LevelClassifier {

    public static int GetLevel(double dValue) {
        if (Level6NegAffect.condition(dValue)) return -6;
        if (Level5NegAffect.condition(dValue)) return -5;
        if (Level4NegAffect.condition(dValue)) return -4;
        if (Level3NegAffect.condition(dValue)) return -3;
        if (Level2NegAffect.condition(dValue)) return -2;
        if (Level1NegAffect.condition(dValue)) return -1;
        if (Level1PosAffect.condition(dValue)) return 1;
        if (Level2PosAffect.condition(dValue)) return 2;
        if (Level3PosAffect.condition(dValue)) return 3;
        if (Level4PosAffect.condition(dValue)) return 4;
        if (Level5PosAffect.condition(dValue)) return 5;
        if (Level6PosAffect.condition(dValue)) return 6;
        return 0;
    }

    public static double GetLevelMean(int iLevel) throws Exception {
        return switch (iLevel) {
            case -6 -> (Level6NegAffect.MAX_VALUE + Level6NegAffect.MIN_VALUE) / 2;
            case -5 -> (Level5NegAffect.MAX_VALUE + Level5NegAffect.MIN_VALUE) / 2;
            case -4 -> (Level4NegAffect.MAX_VALUE + Level4NegAffect.MIN_VALUE) / 2;
            case -3 -> (Level3NegAffect.MAX_VALUE + Level3NegAffect.MIN_VALUE) / 2;
            case -2 -> (Level2NegAffect.MAX_VALUE + Level2NegAffect.MIN_VALUE) / 2;
            case -1 -> (Level1NegAffect.MAX_VALUE + Level1NegAffect.MIN_VALUE) / 2;
            case  0 -> 0.0;
            case  1 -> (Level1PosAffect.MAX_VALUE + Level1PosAffect.MIN_VALUE) / 2;
            case  2 -> (Level2PosAffect.MAX_VALUE + Level2PosAffect.MIN_VALUE) / 2;
            case  3 -> (Level3PosAffect.MAX_VALUE + Level3PosAffect.MIN_VALUE) / 2;
            case  4 -> (Level4PosAffect.MAX_VALUE + Level4PosAffect.MIN_VALUE) / 2;
            case  5 -> (Level5PosAffect.MAX_VALUE + Level5PosAffect.MIN_VALUE) / 2;
            case  6 -> (Level6PosAffect.MAX_VALUE + Level6PosAffect.MIN_VALUE) / 2;
            default -> throw new Exception("LevelClassifier: GetLevelMean: incorrect level value.");
        };
    }
}
