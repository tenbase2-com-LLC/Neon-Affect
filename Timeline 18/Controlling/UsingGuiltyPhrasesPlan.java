/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import aos.jack.jak.beliefset.BeliefSetException;
import aos.jack.util.thread.Semaphore;

/**
 * 
 */
public plan UsingGuiltyPhrasesPlan extends Plan {

    #handles event Level4NegAffectEvent ev1;
    #uses data PlanContextName planContextName;
    #uses data Behavior behaviorName;
    #uses data Semaphore mutex;
    
    static boolean relevant(Level4NegAffectEvent ev1)
    {
        return ev1.iAffect == AffectEnum.CONTROLLING;
    }
    
    context()
    {
        planContextName.get(0, $name) && ($name.as_string().equals(PlanConstants.ALL_PLANS) || $name.as_string().equals(getPlanName()));
    }

    #reasoning method
    body()
    {
        try
        {
            behaviorName.add(0, getPlanName());
        }
        catch (BeliefSetException e)
        {
            e.printStackTrace();    
        }
        finally
        {
            mutex.signal();
        }
    }
    logical String $name;

}
