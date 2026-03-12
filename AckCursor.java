
package NeonAffect;

import aos.jack.util.cursor.Change;

public class AckCursor extends Change {

    private AckCursorVar c = null;
    private int iNumberOfItems = 0;
    private boolean bDebug = true;
   
    public AckCursor(AckCursorVar c1, int iNumberOfItems1)
    {
        super(c1, true); //was false
        c = c1;
        iNumberOfItems = iNumberOfItems1;
    }

    public boolean condition()
    {   
        boolean bRet = (c.GetValue() == iNumberOfItems);
        
        if (bDebug)
        {      
            System.out.println("Inside AckCursor Condition: Items added: " + Integer.toString(c.GetValue()) + " Number of Items: " + Integer.toString(iNumberOfItems) + " bRet: " + bRet);
        }
        
        return bRet;        
    }
    
    public void ClearVars()
    {
        c.ClearVar();
    }
}
