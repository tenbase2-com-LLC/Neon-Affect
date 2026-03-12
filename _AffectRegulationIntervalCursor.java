
package NeonAffect;

import aos.jack.util.cursor.Change;
import java.util.ArrayList;

public class _AffectRegulationIntervalCursor extends Change {

    private AffectHistoryCursorVar r = null;
    private int iStartLevel = 0;
    private int iEndLevel = 0;
    private String strCursorType = "";
    private NeonAffectAgent agent1 = null;

    private boolean bDebug = true;

    public _AffectRegulationIntervalCursor(AffectHistoryCursorVar r1, int iStartLevel1, int iEndLevel1, String strCursorType1, NeonAffectAgent agent11)
    {
        super(r1, false);
        r = r1;
        iStartLevel = iStartLevel1;
        iEndLevel = iEndLevel1;
        strCursorType = CursorEnum.toString(strCursorType1, iStartLevel1, iEndLevel1);
        agent1 = agent11;
   
        agent1.IncrementNumberOfCursors();
    }

    public boolean condition()
    {
        boolean bStartLevelFound = false;
        boolean bEndLevelFound = false;       
        boolean bDebug = true;

        if (bDebug)
        {  
            System.out.println("Inside AfectRegulationIntervalCursor Condition StartLevel: " + Integer.toString(iStartLevel) + " EndLevel: " + Integer.toString(iEndLevel));
        }
            
        ArrayList items = r.GetItems();
        
        double dStartValue = 0d;
        double dEndValue = 0d;
        
        long startTime = 0;
        long endTime = 0;
        
        for(int i = 0; i < items.size(); i++)
        {
            AffectHistoryVar item = (AffectHistoryVar)items.get(i);
            
            int iItemStartLevel = item.GetLevel();
            int iStartID = item.GetID();
            
            if (iItemStartLevel == iStartLevel && !bEndLevelFound)
            {
                dStartValue = item.GetValue();
                startTime = item.GetTime();
                bStartLevelFound = true;
            }
             
            int iItemEndLevel = item.GetLevel();
            int iEndID = item.GetID();
            
            if (iItemEndLevel == iEndLevel && iStartID != iEndID && bStartLevelFound)
            {
                dEndValue = item.GetValue();
                endTime = item.GetTime();
                bEndLevelFound = true;
            }
            
            if (bStartLevelFound && bEndLevelFound)
            {
                r.SetLevelVelocity((dEndValue - dStartValue) / (endTime - startTime));
                return true;
            }            
        }

        agent1.SetCursorAck(strCursorType, iStartLevel, iEndLevel, false);
        
        return false;
    }
    
    public String GetCursorType()
    {
        return strCursorType;        
    }
    
    public int GetStartLevel()
    {
        return iStartLevel;        
    }
    
    public int GetEndLevel()
    {
        return iEndLevel;        
    }

}
