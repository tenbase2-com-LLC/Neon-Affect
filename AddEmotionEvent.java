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
public event AddEmotionEvent extends BDIGoalEvent {
    public null strModerator = "";
    public double dAmount = 0.0;
    public boolean bIncremental = true;

    #posted as
    post(String strModerator1, double dAmount1, boolean bIncremental1)
    {
        strModerator = strModerator1;
        dAmount = dAmount1;       
        bIncremental = bIncremental1;
    }


}
