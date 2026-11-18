/*******************************************************************
 * Created by the JDE: Fri Oct 09 07:56:20 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import aos.jack.jak.beliefset.BeliefSetException;

/**
 * 
 */
public beliefset Emotion extends OpenWorld {
    #key field int id;
    #value field double dAmount;
    #indexed query get(int id, logical double dAmount);
    
    #function query double GetValue()
    {             
        double dValue = 0d;
        
        try
        {           
            boolean bDebug = true;
        
            if (bDebug)
            { 
                System.out.println("Inside Level4PosEvent.");
            }       
        
            get(0, $emotion).next();
            dValue = $emotion.as_double();
            
            if (bDebug)
            { 
                System.out.println("After grabbing emotion: " + Double.toString(dValue));
            }            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return dValue;        
    }


    private logical double $emotion;

    Emotion()
    {    
        try
        {
            //insert default value
            add(0, 0.0d);
        }
        catch (BeliefSetException e)
        {
            e.printStackTrace();
        } 
    }

}

