/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
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
public beliefset CancelPlan extends OpenWorld {
    #value field boolean bCancel;
    #indexed query get(logical boolean bCancel);


    CancelPlan(boolean bCancel1)
    {    
        try
        {
            //insert default
            add(bCancel1);
        }
        catch (BeliefSetException e)
        {
            e.printStackTrace();
        } 
    }

}
