import NeonAffect.NeonAffectAgent;
import NeonAffect.AffectEnum;
import aos.jack.jak.util.timer.DilatedClock;
import aos.cojack.configuration.*;

public class Program {
    public static void main( String args[] )
    {
        try
        {   
            long begTime =  System.currentTimeMillis();       
        
            NeonAffectAgent neonAgent = new NeonAffectAgent();
            //neonAgent.CountAffectLevels();
            
            neonAgent.PostInit();

            //neonAgent.TestAffectAppraisal();

            //for (int i = 0; i < 5; i++)
            //{ 
                  neonAgent.AddEmotionDirect(AffectEnum.RAGE);
                  neonAgent.Wait(10.0);
                  
                  /*
                  neonAgent.AddPositiveEmotion(AffectEnum.LUST, 30.0);
                  neonAgent.Wait(10.0);
                  
                  neonAgent.AddPositiveEmotion(AffectEnum.LUST, 30.0);
                  neonAgent.Wait(10.0);
                  */
            //}
                      
            long endTime =  System.currentTimeMillis();

            long elapsedTime = endTime - begTime;
            
            System.out.println("\nElapsed time: " + elapsedTime); 
            
            System.in.read();
        }
        catch (Exception e)
        {
            e.printStackTrace();  
        }
        System.exit(0);
    }
}
