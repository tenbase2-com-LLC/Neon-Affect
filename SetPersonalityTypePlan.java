/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import CoJACKConfigParserXML.parser;
import aos.cojack.configuration.*;
import aos.cojack.moderator.*;
import aos.jack.jak.beliefset.BeliefSetException;
import aos.jack.util.thread.Semaphore;
import java.util.*;

/**
 * 
 */
public plan SetPersonalityTypePlan extends Plan {

    #handles event SetPersonalityTypeEvent ev1;
    #uses interface NeonAffectAgent enc;
    #uses data PersonalityType personalityType;
    #uses data Semaphore mutex;
    #uses data NA_Debug debug;
    
    static boolean relevant(SetPersonalityTypeEvent ev1)
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
            logical boolean $debug;
            debug.get($debug).next();
         
            boolean bDebug = $debug.as_boolean();
                              
            if (bDebug)
            { 
                System.out.println("Inside SetPersonalityPlan.");
            }
    
            String strPersonalityType = new parser(strPath).GetMBTIPersonalityType("NeonAffectGroup");
                     
            if (bDebug)
            { 
                System.out.println("SetPersonalityTypePlan: setting type: [" + strPersonalityType + "]");
            }
            
            personalityType.add(0, strPersonalityType);
          
            enc.SetPersonalityType(strPersonalityType);
          
            if (bDebug)
            { 
                System.out.println("Leaving SetPersonalityTypePlan.");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();                
        }
        finally
        {
            mutex.signal();  
        }
    }
    private final String strPath = "E:\\JACK projects\\NeonAffect\\data\\cojack_cognitive.xml";

}
