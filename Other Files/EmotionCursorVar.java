package NeonAffect;

import java.util.Observable;

public class EmotionCursorVar extends Observable {

    private double dEmotion = 0.0;
    private int iPrevLevel = -7;
    private final boolean bDebug = true;

    /** Whether SetValue(dEmotion) would notify the cursors (first value, or a new level). */
    public boolean LevelChanges(double dEmotion) {
        return iPrevLevel == -7 || LevelClassifier.GetLevel(dEmotion) != iPrevLevel;
    }

    public void SetValue(double dEmotion) {
        this.dEmotion = dEmotion;
        int iLevel = LevelClassifier.GetLevel(dEmotion);

        if (bDebug) {
            System.out.println("Inside EmotionCursorVar: SetValue: iPrevLevel: " + iPrevLevel + " iLevel: " + iLevel);
        }

        if (iPrevLevel == -7 || iLevel != iPrevLevel) {
            setChanged();
            notifyObservers();
        }

        iPrevLevel = iLevel;
    }

    public double GetValue() {
        return dEmotion;
    }
}
