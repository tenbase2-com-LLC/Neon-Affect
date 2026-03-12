/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import aos.cojack.base.CatMan;
import aos.jack.jak.util.timer.DilatedClock;

/**
 * 
 */
public agent NeonVengefulAgent extends AbstractMiniAgent {
    #has capability VengefulAffectCapability cap1;

    public NeonVengefulAgent(String strName, String strInteractionType1, boolean bDebug1)
    {
        super(strName, strInteractionType1, AffectEnum.VENGEFUL, bDebug1);
        
        Init();
        
        bDebug = bDebug1;
    }
    #uses taskmanager CatMan(this);
    private boolean bDebug = false;

    public void Init()
    {               
        this.timer = new DilatedClock(1d, this.timer);
        this.timer.setTime(0L);        
    }

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
        }
    }

}
