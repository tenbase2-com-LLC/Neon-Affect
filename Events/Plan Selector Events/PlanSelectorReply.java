/*******************************************************************
 * Created by the JDE: Mon Sep 07 11:06:52 EDT 2026
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
public event PlanSelectorReply extends MessageEvent {
    public ArrayList selectedPlans = null;

    #posted as
    response(ArrayList selectedPlans1)
    {
        selectedPlans = (ArrayList)selectedPlans1.clone();
    }


}
