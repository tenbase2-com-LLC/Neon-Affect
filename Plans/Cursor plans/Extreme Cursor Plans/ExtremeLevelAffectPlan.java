/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;


/**
 * 
 */
public plan ExtremeLevelAffectPlan extends Plan {

    #handles event SetExtremeLevelCursorEvent selce;
    #posts event ExtremeLevelEvent ele;
    #uses interface NeonAffectAgent enc;
    #uses data AffectType affectType;
    #uses data AffectHistory affectHistory;
    #uses data NA_Debug debug;
    
    static boolean relevant(SetExtremeLevelCursorEvent selce)
    {
        return true;
    }
    
    context()
    {
        true;
    }

    #reasoning method
    body()
    {
        
        try
        {   
            logical int $affect;
            
            logical boolean $debug;
            debug.get($debug).next();
         
            boolean bDebug = $debug.as_boolean();
        
            int iBegLevel = selce.iBegLevel;
            int iEndLevel = selce.iEndLevel;
        
            if (bDebug)
            { 
                System.out.println("Inside ExtremeLevelAffectPlan.");
                System.out.println("StartLevel: " + Integer.toString(iBegLevel) + " EndLevel: " + Integer.toString(iEndLevel));
            }
        
            int iAffect = 0;
            double dVelocity = 0.0d;       
    
            ExtremeLevelCursor c = new ExtremeLevelCursor(enc.affectHistoryCursorVar, iBegLevel, iEndLevel, enc.GetAgent());
                    
            while (true)        
            {                
                try
                {
                    @wait_for(c);
                    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
                    
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    ele.post(iBegLevel, iEndLevel, iAffect, dVelocity);
                    */
               
                    enc.SetCursorAck(c.GetCursorType(), c.GetStartLevel(), c.GetEndLevel(), true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }    
    }

}
