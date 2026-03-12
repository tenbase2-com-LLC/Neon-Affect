package NeonAffect;

public class LevelClassifier {

    public LevelClassifier()
    {        
        
    }

    public static int GetLevel(double dValue)
    {
        if (Level6NegAffect.condition(dValue))
        {
            return -6;
        }
        else if (Level5NegAffect.condition(dValue))
        {
            return -5;
        }
        else if (Level4NegAffect.condition(dValue))
        {
            return -4;
        }
        else if (Level3NegAffect.condition(dValue))
        {
            return -3;
        }
        else if (Level2NegAffect.condition(dValue))
        {
            return -2;
        }
        else if (Level1NegAffect.condition(dValue))
        {
            return -1;
        }
        else if (Level1PosAffect.condition(dValue))
        {
            return 1;
        }
        else if (Level2PosAffect.condition(dValue))
        {
            return 2;
        }
        else if (Level3PosAffect.condition(dValue))
        {
            return 3;
        }
        else if (Level4PosAffect.condition(dValue))
        {
            return 4;
        }
        else if (Level5PosAffect.condition(dValue))
        {
            return 5;
        }
        else if (Level6PosAffect.condition(dValue))
        {
            return 6;
        } 
        return 0;
    }
    
    public static double GetLevelMean(int iLevel1) throws Exception
    {              
        switch (iLevel1)
        {
            case -6:
                return (Level6NegAffect.MAX_VALUE + Level6NegAffect.MIN_VALUE) / 2;
            
            case -5:
                return (Level5NegAffect.MAX_VALUE + Level5NegAffect.MIN_VALUE) / 2;
                  
            case -4:
                return (Level4NegAffect.MAX_VALUE + Level4NegAffect.MIN_VALUE) / 2;
            
            case -3:
                return (Level3NegAffect.MAX_VALUE + Level3NegAffect.MIN_VALUE) / 2;     
                
            case -2:
                return (Level2NegAffect.MAX_VALUE + Level2NegAffect.MIN_VALUE) / 2;
           
            case -1:
                return (Level1NegAffect.MAX_VALUE + Level1NegAffect.MIN_VALUE) / 2;
               
            case 0:
                return 0.0;
                
            case 1:
                return (Level1PosAffect.MAX_VALUE + Level1PosAffect.MIN_VALUE) / 2;
                
            case 2:
                return (Level2PosAffect.MAX_VALUE + Level2PosAffect.MIN_VALUE) / 2;
                
            case 3:
                return (Level3PosAffect.MAX_VALUE + Level3PosAffect.MIN_VALUE) / 2;
          
            case 4:
                return (Level4PosAffect.MAX_VALUE + Level4PosAffect.MIN_VALUE) / 2;      
                       
            case 5:
                return (Level5PosAffect.MAX_VALUE + Level5PosAffect.MIN_VALUE) / 2;
         
            case 6:
                return (Level6PosAffect.MAX_VALUE + Level6PosAffect.MIN_VALUE) / 2;
                
            default:
                throw new Exception("LevelClassifier: GetLevelMean: incorrect level value.");            
        }
    }
    
}
