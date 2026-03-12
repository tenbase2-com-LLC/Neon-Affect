
package NeonAffect;
    
public class CursorEnum {

    public CursorEnum()
    {
        
    }
    
    public static String toString(String strCursorType, int iStartLevel, int iEndLevel)
    {
        return strCursorType + "_" + Integer.toString(iStartLevel) + "_" + Integer.toString(iEndLevel);        
    }
    
    public final static String LEVEL_CURSOR_NEG_6 = "LEVEL_CURSOR_NEG_6";
    public final static String LEVEL_CURSOR_NEG_5 = "LEVEL_CURSOR_NEG_5";
    public final static String LEVEL_CURSOR_NEG_4 = "LEVEL_CURSOR_NEG_4";
    public final static String LEVEL_CURSOR_NEG_3 = "LEVEL_CURSOR_NEG_3";
    public final static String LEVEL_CURSOR_NEG_2 = "LEVEL_CURSOR_NEG_2";
    public final static String LEVEL_CURSOR_NEG_1 = "LEVEL_CURSOR_NEG_1";
    public final static String LEVEL_CURSOR_POS_1 = "LEVEL_CURSOR_POS_1";
    public final static String LEVEL_CURSOR_POS_2 = "LEVEL_CURSOR_POS_2";
    public final static String LEVEL_CURSOR_POS_3 = "LEVEL_CURSOR_POS_3";
    public final static String LEVEL_CURSOR_POS_4 = "LEVEL_CURSOR_POS_4";
    public final static String LEVEL_CURSOR_POS_5 = "LEVEL_CURSOR_POS_5";
    public final static String LEVEL_CURSOR_POS_6 = "LEVEL_CURSOR_POS_6";
 
    public final static int iLEVEL_CURSOR_NEG_6 = -6;
    public final static int iLEVEL_CURSOR_NEG_5 = -5;
    public final static int iLEVEL_CURSOR_NEG_4 = -4;
    public final static int iLEVEL_CURSOR_NEG_3 = -3;
    public final static int iLEVEL_CURSOR_NEG_2 = -2;
    public final static int iLEVEL_CURSOR_NEG_1 = -1;
    public final static int iLEVEL_CURSOR_POS_1 = 1;
    public final static int iLEVEL_CURSOR_POS_2 = 2;
    public final static int iLEVEL_CURSOR_POS_3 = 3;
    public final static int iLEVEL_CURSOR_POS_4 = 4;
    public final static int iLEVEL_CURSOR_POS_5 = 5;
    public final static int iLEVEL_CURSOR_POS_6 = 6;
  
    public final static String AFFECT_HISTORY_CURSOR = "AFFECT_HISTORY_CURSOR";
    public final static String EXTREME_LEVEL_CURSOR = "EXTREME_LEVEL_CURSOR";

}
