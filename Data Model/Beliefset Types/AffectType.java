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
public beliefset AffectType extends OpenWorld {
    #key field int id;
    #value field int iAffect;
    #indexed query get(int id, logical int iAffect);

    private logical int $affect;

    AffectType()
    {    
        try
        {
            //insert default value
            add(0, -1);
        }
        catch (BeliefSetException e)
        {
            e.printStackTrace();
        } 
    }

}
