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
public event Level6NegAffectEvent extends BDIGoalEvent {
    public int iAffect = -1;

    #posted as
    post(int iAffect1)
    {    
        try
        {        
            iAffect = iAffect1;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        } 
    }


}
