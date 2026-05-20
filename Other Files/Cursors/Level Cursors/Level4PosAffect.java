
package NeonAffect;

import aos.jack.util.cursor.Change;

public class Level4PosAffect extends Change {

    private final EmotionCursorVar c;
    private final String strCursorType = CursorEnum.LEVEL_CURSOR_POS_4;
    private final int iLevel = CursorEnum.iLEVEL_CURSOR_POS_4;
    private final NeonAffectAgent agent1;
    
    public final static double MAX_VALUE = 45.0;
    public final static double MIN_VALUE = 35.0;
    
    public Level4PosAffect(EmotionCursorVar c1, NeonAffectAgent agent11)
    {
        super(c1, false);
        this.c = c1;
        this.agent1 = agent11;
   
        agent1.IncrementNumberOfCursors();
    }

    @Override
    public boolean condition()
    {
        System.out.println("Inside Level4PosAffect condition()");
        
        double dValue = c.GetValue();
        
        System.out.println("dValue = " + dValue);

        if (dValue >= MIN_VALUE && dValue < MAX_VALUE)
        {
            return true;   
        }

        agent1.SetCursorAck(strCursorType, iLevel, false);

        return false;
    }
    
    public static boolean condition(double dValue)
    {
        System.out.println("Inside Level4PosAffect condition(dValue)");
               
        System.out.println("dValue = " + dValue);

        if (dValue >= MIN_VALUE && dValue < MAX_VALUE)
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
