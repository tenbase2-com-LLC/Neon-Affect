/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
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
public beliefset NA_Debug extends OpenWorld {
    #value field boolean bDebug;
    #indexed query get(logical boolean bDebug);


    NA_Debug(boolean bDebug1)
    {    
        try
        {
            //insert default
            add(bDebug1);
        }
        catch (BeliefSetException e)
        {
            e.printStackTrace();
        } 
    }

}
