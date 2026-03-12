
package NeonAffect;

public class AckVar {

    private String strCursorType = "";
    private int iLevel = 0;
    private int iStartLevel = 0;
    private int iEndLevel = 0;
    private boolean bValue = false;
    
    public AckVar(String strCursorType1, int iLevel1, int iStartLevel1, int iEndLevel1, boolean bValue1)
    {        
        strCursorType = strCursorType1;
        iLevel = iLevel1;
        iStartLevel = iStartLevel1;
        iEndLevel = iEndLevel1;
        bValue = bValue1;
    }
    
    public String GetCursorType()
    {
        return strCursorType;        
    }
      
    public int GetLevel()
    {
        return iLevel;        
    }
    
    public int GetStartLevel()
    {
        return iStartLevel;        
    }
    
    public int GetEndLevel()
    {
        return iEndLevel;        
    }
    
    public boolean GetValue()
    {
        return bValue;        
    }
    
    public String toString() 
    {        
        return "\nAckVar: " + strCursorType +
            " Level: " + Integer.toString(iLevel) +
            " StartLevel: " + Integer.toString(iStartLevel) +
            " EndLevel: " + Integer.toString(iEndLevel) + 
            " Value: " + bValue + "\n";
            
    }
}
