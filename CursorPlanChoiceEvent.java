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
public event CursorPlanChoiceEvent extends Event {
    public int iLevel = 0;
    public int iAffect = 0;
    public double dEmotion = 0.0;

    #posted as
    post(int iLevel1, int iAffect1, double dEmotion1)
    {
        iLevel = iLevel1;
        iAffect = iAffect1;
        dEmotion = dEmotion1;
    }


}
