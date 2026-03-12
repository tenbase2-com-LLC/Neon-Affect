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
public event AddAffectHistoryEvent extends Event {
    public int iLevel;
    public int iAffect;
    public double dValue;
    public long time;

    #posted as
    post(int iLevel1, long time1, int iAffect1, double dValue1)
    { 
        try
        {
            iLevel = iLevel1;           
            iAffect = iAffect1;            
            dValue = dValue1;
            time = time1;
        }
        catch (Exception e)
        {
            e.printStackTrace();           
        }
    }


}
