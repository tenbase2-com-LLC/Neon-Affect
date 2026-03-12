
package NeonAffect;

import java.util.*;

public class AckCursorVar extends Observable {

    private Hashtable cursorAcks = null;
    private final Object lock = new Object();
    private boolean bDebug = true;
    
    public AckCursorVar(Hashtable c1)
    {        
        cursorAcks = c1;
    }
    
    public void SetAck(String strAckType1, AckVar ackVar)
    {      
        synchronized (lock)
        {
            if (bDebug)
            {      
               System.out.println("Inside AckCursorVar: SetAck: Type: [" + strAckType1 + "] Value: " + ackVar.GetValue());
            }
        
            cursorAcks.put((Object)strAckType1, (Object)ackVar);
        
            setChanged();
            notifyObservers();
        }
    }
    
    public int GetValue()
    {
        return cursorAcks.size(); 
    }
    
    public void ClearVar()
    {
        cursorAcks = new Hashtable();   
    }
}
