
package NeonAffect;

import java.util.*;

public class AffectAppraisalCalculator {

    private boolean bDebug = false;

    public AffectAppraisalCalculator(boolean bDebug1)
    {
        bDebug = bDebug1;
    }
    
    public int GetMaxSimilarity(AffectAppraisal appraisal, ArrayList appraisalList)
    {  
        ArrayList enumList = new ArrayList();
        double dMaxSimilarity = 0.0;
        int iMaxAffectEnum = -1; 
        Utils utils = new Utils();         
         
        float[] vector1 = appraisal.ToArray();
       
        for (int i = 0; i < appraisalList.size(); i++)
        {
            try            
            {
                AffectEnum.GetName(i);
            }
            catch (Exception e)
            {
                continue;                
            }
             
            enumList.add((Object)i);            
        }
              
        for (int i = 0; i < appraisalList.size() && i < enumList.size(); i++)
        { 
            int iEnumValue = (int)enumList.get(i);
    
            AffectAppraisal appraisalSim = (AffectAppraisal)appraisalList.get(i);
            
            float[] vector2= appraisalSim.ToArray();
            
            double dSimilarity = utils.cosineSimilarity(vector1, vector2);      
             
            if (bDebug)
            {
                System.out.println("Cosine Similarity score: ["+ Double.toString(dSimilarity) + "]");
            }       
                    
            if (dSimilarity > dMaxSimilarity)
            {
                dMaxSimilarity = dSimilarity;
                iMaxAffectEnum = i;
            }
        }
 
         if (bDebug)
         {
             if (iMaxAffectEnum != -1)
             {
                 try
                 {
                     System.out.println("Max enum: ["+ AffectEnum.GetName(iMaxAffectEnum) + "]");
                 }
                 catch (Exception e)
                 {
                    
                 }
             }
             
             System.out.println("Max Cosine Similarity score: ["+ Double.toString(dMaxSimilarity) + "]");
         }
 
        return iMaxAffectEnum;
    }
}
