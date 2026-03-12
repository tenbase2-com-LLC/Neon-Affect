/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import java.util.ArrayList;

/**
 * 
 */
public beliefset AffectHistory extends OpenWorld {
    #key field int iID;
    #value field int iLevel;
    #value field int iAffect;
    #value field double dValue;
    #value field long time;
    #indexed query getIter(logical int iID, logical int iLevel, logical int iAffect, logical double dValue, logical long time);
    #indexed query getIter(int iID, logical int iLevel, logical int iAffect, logical double dValue, logical long time);


    private void Init() //?
    {        
        try
        {
            //insert default value - no default due to no behaviors
            add(0, 0, 0, 0d, System.currentTimeMillis());
        }
        catch (BeliefSetException e)
        {
            e.printStackTrace();
        }
    }

    AffectHistory()
    {    
        //Init();
    }

}
