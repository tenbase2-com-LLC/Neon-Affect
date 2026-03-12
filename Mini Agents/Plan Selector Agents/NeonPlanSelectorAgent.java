/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import aos.jack.jak.util.timer.DilatedClock;
import aos.util.ThreadPool;

/**
 * 
 */
public agent NeonPlanSelectorAgent extends Agent {
    #private data NA_Debug debug(true);

    public NeonPlanSelectorAgent(String name, NeonAffectAgent neonAffectAgent1, ThreadPool tp1)
    {
        super(name);
        Init();
        
        tp = tp1;
    
        neonAffectAgent = neonAffectAgent1;
    }
    private ThreadPool tp = new ThreadPool();
    private NeonAffectAgent neonAffectAgent = null;
    private boolean bDebug = false;

    private void Init()
    {
        this.timer = new DilatedClock(1d, this.timer);
        this.timer.setTime(0L);       
    }

    public ThreadPool GetThreadPool()
    {
        return tp;        
    }

    public NeonAffectAgent GetNeonAffectAgent()
    {
        return neonAffectAgent;        
    }

}
