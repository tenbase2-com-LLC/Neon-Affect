
package NeonAffect;

import java.util.Observable;
import java.util.ArrayList;

public class AffectHistoryCursorVar extends Observable {

    private ArrayList values = new ArrayList();
    private double dLevelVelocity = 0d;   
    
    public AffectHistoryCursorVar()
    {
        
    }
    
    public void SetValue(AffectHistoryVar item)
    {
        values.add(item);
        
        setChanged();
        notifyObservers();        
    }
    
    public ArrayList GetItems()
    {
        return values;        
    }
    
    public void SetLevelVelocity(double dValue)
    {
        dLevelVelocity = dValue;
    }
    
    public double GetLevelVelocity()
    {
        return dLevelVelocity;
    }
}
