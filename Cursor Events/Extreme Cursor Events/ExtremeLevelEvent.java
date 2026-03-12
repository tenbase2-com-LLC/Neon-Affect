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
public event ExtremeLevelEvent extends Event {
    public int iInitialLevel = 0;
    public int iEndLevel = 0;
    public int iAffect = 0;
    public double dLevelVelocity = 0.0;

    #posted as
    post(int iInitialLevel1, int iEndLevel1, int iAffect1, double dLevelVelocity1)
    {
        iInitialLevel = iInitialLevel1;
        iEndLevel = iEndLevel1;
        iAffect = iAffect1;
        dLevelVelocity = dLevelVelocity1;
    }


}
