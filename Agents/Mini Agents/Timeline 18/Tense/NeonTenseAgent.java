/*******************************************************************
 * Created by the JDE: Fri Oct 09 07:56:20 EDT 2026
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
public agent NeonTenseAgent extends AbstractMiniAgent implements IPost {
    #has capability TenseAffectCapability cap1;
    #handles event AffectEvent;
    #posts event AffectEvent ev1;

    public NeonTenseAgent(String strName, String strInteractionType1, boolean bDebug1)
    {
        super(strName, strInteractionType1, AffectEnum.TENSE, bDebug1);
         
        bDebug = bDebug1;
    }
    private boolean bDebug = false;

    @Override
    public void PostEvent()
    {   
        try
        {     
            //call level plan            
            postEvent(ev1.post(GetAffectType(), 0));        
            mutex.threadWait();
        }
        catch (Exception e)
        {
            e.printStackTrace();            
        }
    }

}

