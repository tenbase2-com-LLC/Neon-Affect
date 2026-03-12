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
public agent NeonMoodyAgent extends AbstractMiniAgent {
    #has capability MoodyAffectCapability cap1;

    public NeonMoodyAgent(String strName, String strInteractionType1, boolean bDebug1)
    {
        super(strName, strInteractionType1, AffectEnum.MOODY, bDebug1);
         
        bDebug = bDebug1;
    }
    private boolean bDebug = false;

    public void PostEvent()
    {   
        try
        {
            //call level plan            
            postEvent(ev1.post(GetAffectType()));        
            mutex.threadWait();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            mutex.signal();
        }
    }

}
