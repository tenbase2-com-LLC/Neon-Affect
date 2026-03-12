package NeonAffect;

import aos.cojack.base.NormalSimilarityCalculator;
import aos.jack.jak.beliefset.BeliefSet;
import aos.jack.jak.beliefset.Tuple;
import java.util.*;

public class AffectCriteriaSimCalculator extends NormalSimilarityCalculator {

    private boolean bDebug = false;    
    private double dMinSimilarity = Double.MAX_VALUE, maxSimilarity = 0.0;
    
    public AffectCriteriaSimCalculator(boolean bDebug1) {
        super();
        bDebug = bDebug1;
    }
  /*  
    public int GetMaxSimialrity(AffectAppraisal affectAppraisal, Appraisals appraisalSimList)
    {
        ArrayList enumList = new ArrayList();
        Hashtable hashSim = new Hashtable();
        
        for (int i = 0; i < appraisalSimList.size(); i++)
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
              
        for (int i = 0; i < appraisalSimList.size() && i < enumList.size(); i++)
        { 
            int iEnumValue = (int)enumList.get(i);

            AffectAppraisal appraisal = (AffectAppraisal)appraisalSimList.get(i);
            
            double dSimilarity = ComputeSimilarity(affectAppraisal, appraisal);
                      
            hashSim.add((Object)iEnumValue, (Object)dSimilarity);            
        }
        
        hashSim.values.sort();
        
        return (int)hashSim.keys[0];
    }

    private double ComputeSimilarity(Appraisals tuple1, Appraisals tuple2) 
    {
        int iEmotion = 0;
        
        double dSimilarityValue = 0.0; //super.compute(tuple1, tuple2);      
              
        if(bDebug)
        {
            System.out.println("similarity between "+tuple1+" and "+tuple2+" is "+dSimilarityValue);
        }
        
        return dSimilarityValue;
    }
*/
}
