
package NeonAffect;

import aos.jack.util.cursor.Change;

public class Level6NegAffect extends Change {

    private EmotionCursorVar c = null;
    private String strCursorType = CursorEnum.LEVEL_CURSOR_NEG_6;
    private int iLevel = CursorEnum.iLEVEL_CURSOR_NEG_6;
    private NeonAffectAgent agent1 = null;
    
    public final static double MAX_VALUE = -55.0;
    public final static double MIN_VALUE = -65.0;
    
    public Level6NegAffect(EmotionCursorVar c1, NeonAffectAgent agent11)
    {
        super(c1, false);
        c = c1;
        agent1 = agent11;
   
        agent1.IncrementNumberOfCursors();
    }
    
    public boolean condition()
    {
        System.out.println("Inside Level6NegAffect condition()");
        
        double dValue = c.GetValue();
        
        System.out.println("dValue = " + Double.toString(dValue));

        if (dValue > MIN_VALUE && dValue <= MAX_VALUE)
        {
            return true;   
        }
        
        agent1.SetCursorAck(strCursorType, iLevel, false);
        
        return false;
    }
    
    public static boolean condition(double dValue)
    {
        System.out.println("Inside Level6NegAffect condition(dValue)");
               
        System.out.println("dValue = " + Double.toString(dValue));

        if (dValue > MIN_VALUE && dValue <= MAX_VALUE)
        {
            return true;   
        }
        
        return false;
    }
    
    public String GetCursorType()
    {
        return strCursorType;        
    }
    
    public int GetLevel()
    {
        return iLevel;        
    }
}
