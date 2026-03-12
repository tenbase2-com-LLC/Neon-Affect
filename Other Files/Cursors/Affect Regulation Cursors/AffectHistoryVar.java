
package NeonAffect;

public class AffectHistoryVar {
   
    private int iID = 0;
    private int iLevel = 0;
    private int iType = 0;
    private double dValue = 0d;
    private long time = 0L;
   
    public AffectHistoryVar()
    {
        
    }
    
    public AffectHistoryVar(int iID1, int iLevel1, int iType1, double dValue1, long time1)
    {        
        iID = iID1;
        iLevel = iLevel1;
        iType = iType1;
        dValue = dValue1;
        time = time1;        
    }
    
    public int GetID()
    {
        return iID;        
    }
    
    public int GetLevel()
    {
        return iLevel;        
    }
    
    public int GetType()
    {
        return iType;        
    }
    
    public double GetValue()
    {
        return dValue;        
    }
    
    public long GetTime()
    {
        return time;        
    }
}
