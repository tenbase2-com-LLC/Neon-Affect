/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import java.util.*;

/**
 * 
 */
public event PlanSelectorEvent extends MessageEvent {
    public null strEmotion = "";
    public null strInteractionType = "";
    public ArrayList planNames = new ArrayList();

    #posted as
    post(String strEmotion1, String strInteractionType1, ArrayList planNames1)
    {
        strEmotion = strEmotion1;
        strInteractionType = strInteractionType1;
        planNames = (ArrayList)planNames1.clone();    
    }


}
