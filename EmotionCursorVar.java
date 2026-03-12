
package NeonAffect;

import java.util.Observable;

public class EmotionCursorVar extends Observable {

    private double dEmotion = 0.0;    
    private int iPrevLevel = -7;
    private boolean bDebug = true;
    
    public EmotionCursorVar()
    {
        
    }
    
    public void SetValue(double dEmotion1)
    {
        dEmotion = dEmotion1;
        
        int iLevel = LevelClassifier.GetLevel(dEmotion1);
        
        if (bDebug)
        {      
            System.out.println("Inside EmotionCursorVar: SetValue: iPrevLevel: " + Integer.toString(iPrevLevel) + " iLevel: " + Integer.toString(iLevel));
        }
        
        if (iPrevLevel == -7 || iLevel != iPrevLevel)
        {
            setChanged();
            notifyObservers();        
        }

        iPrevLevel = iLevel;
    }
    
    public double GetValue()
    {
        return dEmotion;    
    }
    
}
