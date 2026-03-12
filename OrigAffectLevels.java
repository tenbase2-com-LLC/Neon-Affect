
package NeonAffect;

import java.util.*;

public class OrigAffectLevels
{

    public OrigAffectLevels()
    {
        //timeline 1
        affectTimelineList.add(new Object[] { 1, -6, AffectEnum.RAGE });
        affectTimelineList.add(new Object[] { 1, -5, AffectEnum.VENGEFUL });
        affectTimelineList.add(new Object[] { 1, -4, AffectEnum.ANGRY });
        affectTimelineList.add(new Object[] { 1, -3, AffectEnum.DISGUST });
        affectTimelineList.add(new Object[] { 1, -2, AffectEnum.SAD });
        affectTimelineList.add(new Object[] { 1, -1, AffectEnum.MOODY });
        affectTimelineList.add(new Object[] { 1, 0, AffectEnum.NEUTRAL });
        affectTimelineList.add(new Object[] { 1, 1, AffectEnum.ANTICIPATION });
        affectTimelineList.add(new Object[] { 1, 2, AffectEnum.PLEASED });
        affectTimelineList.add(new Object[] { 1, 3, AffectEnum.HAPPY });
        affectTimelineList.add(new Object[] { 1, 4, AffectEnum.ELATION });
        affectTimelineList.add(new Object[] { 1, 5, AffectEnum.EUPHORIA });
        affectTimelineList.add(new Object[] { 1, 6, AffectEnum.AWE });
        
        //timeline 2
        affectTimelineList.add(new Object[] { 2, -6, AffectEnum.OVERWHELMED });
        affectTimelineList.add(new Object[] { 2, -5, AffectEnum.PANIC });
        affectTimelineList.add(new Object[] { 2, -4, AffectEnum.TERROR });
        affectTimelineList.add(new Object[] { 5, -3, AffectEnum.FEAR });
        affectTimelineList.add(new Object[] { 2, -2, AffectEnum.WARINESS });
        affectTimelineList.add(new Object[] { 2, -1, AffectEnum.IRRITATION });
        affectTimelineList.add(new Object[] { 2, 0, AffectEnum.NEUTRAL });
        affectTimelineList.add(new Object[] { 2, -1, AffectEnum.INDIFFERENCE });
        //affectTimelineList.add(new Object[] { 2, 2, AffectEnum.CURIOSITY });
        affectTimelineList.add(new Object[] { 2, 3, AffectEnum. SATISFACTION });
        affectTimelineList.add(new Object[] { 5, 4, AffectEnum.AMAZEMENT });
        affectTimelineList.add(new Object[] { 2, 5, AffectEnum.EAGERNESS });
        //affectTimelineList.add(new Object[] { 2, 6, AffectEnum.EXCITEMENTE }); 
     
        //timeline 3
        affectTimelineList.add(new Object[] { 3, -6, AffectEnum.OBSESSED });
        affectTimelineList.add(new Object[] { 3, -5, AffectEnum.BITTERNESS });
        affectTimelineList.add(new Object[] { 3, -4, AffectEnum.RESENTMENT });
        affectTimelineList.add(new Object[] { 3, -3, AffectEnum.ENVY });
        affectTimelineList.add(new Object[] { 3, -2, AffectEnum.JEALOUSY });
        affectTimelineList.add(new Object[] { 3, -1, AffectEnum.ACCEPTANCE });
        affectTimelineList.add(new Object[] { 3, 0, AffectEnum.NEUTRAL });
        affectTimelineList.add(new Object[] { 3, 1, AffectEnum.PEACEFULNESS });
        affectTimelineList.add(new Object[] { 3, 2, AffectEnum.INSPIRED });
        affectTimelineList.add(new Object[] { 3, 3, AffectEnum.GRATITUDE });
        affectTimelineList.add(new Object[] { 3, 4, AffectEnum.CONNECTEDNESS });
        affectTimelineList.add(new Object[] { 3, 5, AffectEnum.WANDERLUST });
        
        //timeline 4
        affectTimelineList.add(new Object[] { 4, -6, AffectEnum.HUMILIATION });
        affectTimelineList.add(new Object[] { 4, -5, AffectEnum.DENIAL });
        affectTimelineList.add(new Object[] { 4, -4, AffectEnum.HYSTERIA });
        affectTimelineList.add(new Object[] { 4, -3, AffectEnum.DREAD });
        affectTimelineList.add(new Object[] { 4, -2, AffectEnum.WORRY });
        affectTimelineList.add(new Object[] { 4, -1, AffectEnum.VULNERABILITY });
        affectTimelineList.add(new Object[] { 4, 0, AffectEnum.NEUTRAL });
        affectTimelineList.add(new Object[] { 4, 1, AffectEnum.RELIEF });
        affectTimelineList.add(new Object[] { 4, 2, AffectEnum.VALUED });
        affectTimelineList.add(new Object[] { 4, 3, AffectEnum.PRIDE });
        affectTimelineList.add(new Object[] { 4, 4, AffectEnum.CONFIDENCE });
        affectTimelineList.add(new Object[] { 4, 5, AffectEnum.FEARLESSNESS });
        affectTimelineList.add(new Object[] { 4, 6, AffectEnum.SMUGNESS });
                
        //timeline 5
        affectTimelineList.add(new Object[] { 5, -6, AffectEnum.SCORN });
        affectTimelineList.add(new Object[] { 5, -5, AffectEnum.CONTEMPT });
        affectTimelineList.add(new Object[] { 5, -4, AffectEnum.PITY });
        //affectTimelineList.add(new Object[] { 5, -3, AffectEnum.RESENTMENT });
        affectTimelineList.add(new Object[] { 5, -2, AffectEnum.DISAPPOINTMENT });
        affectTimelineList.add(new Object[] { 5, -1, AffectEnum.RESIGNATION });
        affectTimelineList.add(new Object[] { 5, 0, AffectEnum.NEUTRAL });
        affectTimelineList.add(new Object[] { 5, -1, AffectEnum.HUMBLED });
        affectTimelineList.add(new Object[] { 5, 2, AffectEnum.DETERMINATION });
        affectTimelineList.add(new Object[] { 5, 3, AffectEnum.HOPEFULNESS });
        //affectTimelineList.add(new Object[] { 5, 4, AffectEnum.CONFIDENCE });
        affectTimelineList.add(new Object[] { 5, 5, AffectEnum.ADORATION });
        affectTimelineList.add(new Object[] { 5, 6, AffectEnum.LOVE }); 
    
        //timeline 6
        affectTimelineList.add(new Object[] { 6, -6, AffectEnum.DEPRESSED });
        affectTimelineList.add(new Object[] { 6, -5, AffectEnum.REGRET });
        affectTimelineList.add(new Object[] { 6, -4, AffectEnum.REMORSE });
        affectTimelineList.add(new Object[] { 6, -3, AffectEnum.GUILT });
        affectTimelineList.add(new Object[] { 6, -2, AffectEnum.DOUBT });
        affectTimelineList.add(new Object[] { 6, -1, AffectEnum.CONFLICTED });
        affectTimelineList.add(new Object[] { 6, 0, AffectEnum.NEUTRAL });
        affectTimelineList.add(new Object[] { 6, 1, AffectEnum.ADMIRATION });
        affectTimelineList.add(new Object[] { 6, 2, AffectEnum.DESIRE });
        affectTimelineList.add(new Object[] { 6, 3, AffectEnum.LONGING });
        affectTimelineList.add(new Object[] { 6, 4, AffectEnum.LUST });
        affectTimelineList.add(new Object[] { 6, 5, AffectEnum.MOVED });
        //affectTimelineList.add(new Object[] { 6, 6, AffectEnum.LOVE });
    
        //timeline 7
        affectTimelineList.add(new Object[] { 7, -6, AffectEnum.TORMENTED });
        affectTimelineList.add(new Object[] { 7, -5, AffectEnum.ANGUISH });
        affectTimelineList.add(new Object[] { 7, -4, AffectEnum.STUNNED });
        affectTimelineList.add(new Object[] { 7, -3, AffectEnum.DESPERATION });
        affectTimelineList.add(new Object[] { 7, -2, AffectEnum.ANXIETY });
    
        //timeline 8
        affectTimelineList.add(new Object[] { 8, -6, AffectEnum.GRIEF });
        affectTimelineList.add(new Object[] { 8, -5, AffectEnum.DEVASTATION });
        affectTimelineList.add(new Object[] { 8, -4, AffectEnum.DESPAIR });
        affectTimelineList.add(new Object[] { 8, -3, AffectEnum.FLUSTERED });
        affectTimelineList.add(new Object[] { 8, -2, AffectEnum.CONFUSION });
    
        //timeline 9
        affectTimelineList.add(new Object[] { 9, -5, AffectEnum.IMPATIENCE });
        affectTimelineList.add(new Object[] { 9, -4, AffectEnum.FRUSTRATION });
        affectTimelineList.add(new Object[] { 9, -3, AffectEnum.ANNOYANCE });
        
        //timeline 10
        affectTimelineList.add(new Object[] { 10, -4, AffectEnum.DEFIANT });
        affectTimelineList.add(new Object[] { 10, -3, AffectEnum.APPALLED });
    
        //timeline 11
        affectTimelineList.add(new Object[] { 11, -5, AffectEnum.DISCOURAGED });
        affectTimelineList.add(new Object[] { 11, -4, AffectEnum.INJUSTICE });
        affectTimelineList.add(new Object[] { 11, 3, AffectEnum.TRUST });
        affectTimelineList.add(new Object[] { 11, 5, AffectEnum.SURPRISED });
    
        //timeline 12
        affectTimelineList.add(new Object[] { 12, -5, AffectEnum.PAIN });
        affectTimelineList.add(new Object[] { 12, -4, AffectEnum.MACABRE });
        affectTimelineList.add(new Object[] { 12, -3, AffectEnum.EMBARRASSED });
        affectTimelineList.add(new Object[] { 12, -1, AffectEnum.FATIGUED });
        affectTimelineList.add(new Object[] { 12, 2, AffectEnum.AROUSED });
        affectTimelineList.add(new Object[] { 12, 3, AffectEnum.PATIENCE });
        affectTimelineList.add(new Object[] { 12, 5, AffectEnum.COMPASSION });
    
        //timeline 13
        affectTimelineList.add(new Object[] { 13, 3, AffectEnum.EMPATHY });    
        affectTimelineList.add(new Object[] { 13, 5, AffectEnum.LOYALTY }); 
        
        //timeline 14
        affectTimelineList.add(new Object[] { 14, -6, AffectEnum.DOMINEERING });
        affectTimelineList.add(new Object[] { 14, -5, AffectEnum.SEXUALLY_EXCITED });
        affectTimelineList.add(new Object[] { 14, -4, AffectEnum.UPSET });
        affectTimelineList.add(new Object[] { 14, -3, AffectEnum.DEFEATED });
        affectTimelineList.add(new Object[] { 14, -2, AffectEnum.BORED });
        affectTimelineList.add(new Object[] { 14, -1, AffectEnum.DISSATISFIED });
        affectTimelineList.add(new Object[] { 14, 0, AffectEnum.NEUTRAL });
        affectTimelineList.add(new Object[] { 14, 1, AffectEnum.ACTIVATED });
        affectTimelineList.add(new Object[] { 14, 2, AffectEnum.INTERESTED });
        affectTimelineList.add(new Object[] { 14, 3, AffectEnum.CAPABLE });
        affectTimelineList.add(new Object[] { 14, 4, AffectEnum.AFFECTIONATE });
        affectTimelineList.add(new Object[] { 14, 5, AffectEnum.IMPRESSED });
        affectTimelineList.add(new Object[] { 14, 6, AffectEnum.WONDER });
    
        //timeline 15
        affectTimelineList.add(new Object[] { 15, -6, AffectEnum.POWERLESS });
        affectTimelineList.add(new Object[] { 15, -5, AffectEnum.FEEBLE });
        affectTimelineList.add(new Object[] { 15, -4, AffectEnum.INSECURE });
        affectTimelineList.add(new Object[] { 15, -3, AffectEnum.EGOTISTICAL });
        affectTimelineList.add(new Object[] { 15, -2, AffectEnum.VIGOROUS });
        affectTimelineList.add(new Object[] { 15, -1, AffectEnum.SHY });
        affectTimelineList.add(new Object[] { 15, 0, AffectEnum.NEUTRAL });
        affectTimelineList.add(new Object[] { 15, 1, AffectEnum.KIND });
        affectTimelineList.add(new Object[] { 15, 2, AffectEnum.FRIENDLY });
        affectTimelineList.add(new Object[] { 15, 3, AffectEnum.CAREFREE });
        affectTimelineList.add(new Object[] { 15, 4, AffectEnum.DEVOTED });
        affectTimelineList.add(new Object[] { 15, 5, AffectEnum.IN_LOVE });
        affectTimelineList.add(new Object[] { 15, 6, AffectEnum.MIGHTY });
        
        //timeline 16
    
        affectTimelineList.add(new Object[] { 16, -5, AffectEnum.DISTRESSED });
        affectTimelineList.add(new Object[] { 16, -4, AffectEnum.AGGRESSIVE });
        affectTimelineList.add(new Object[] { 16, -3, AffectEnum.INHIBITED });
        affectTimelineList.add(new Object[] { 16, -2, AffectEnum.SUBDUED });
        affectTimelineList.add(new Object[] { 16, -1, AffectEnum.SERIOUS});
        affectTimelineList.add(new Object[] { 16, 0, AffectEnum.NEUTRAL });
        affectTimelineList.add(new Object[] { 16, 1, AffectEnum.CONCENTRATING });
        affectTimelineList.add(new Object[] { 16, 2, AffectEnum.RESPONSIBLE });
        affectTimelineList.add(new Object[] { 16, 3, AffectEnum.USEFUL });
        affectTimelineList.add(new Object[] { 16, 4, AffectEnum.BOLD });
        affectTimelineList.add(new Object[] { 16, 5, AffectEnum.INFLUENTIAL });
        affectTimelineList.add(new Object[] { 16, 6, AffectEnum.ENJOYMENT });
        
        //timeline 17
        affectTimelineList.add(new Object[] { 17, -4, AffectEnum.ARROGANT });
        affectTimelineList.add(new Object[] { 17, -3, AffectEnum.REJECTED });
        affectTimelineList.add(new Object[] { 17, -2, AffectEnum.LONELY });
        affectTimelineList.add(new Object[] { 17, -1, AffectEnum.LISTLESS });
        affectTimelineList.add(new Object[] { 17, 1, AffectEnum.ALERT });
        affectTimelineList.add(new Object[] { 17, 2, AffectEnum.COOPERATIVE });
        affectTimelineList.add(new Object[] { 17, 3, AffectEnum.JOYFUL });
        affectTimelineList.add(new Object[] { 17, 4, AffectEnum.EXCITED });
        affectTimelineList.add(new Object[] { 17, 5, AffectEnum.POWERFUL });
        affectTimelineList.add(new Object[] { 17, 6, AffectEnum.ADMIRED });
        
        //timeline 18
        affectTimelineList.add(new Object[] { 18, -4, AffectEnum.CONTROLLING });
        affectTimelineList.add(new Object[] { 18, -3, AffectEnum.TENSE });
        affectTimelineList.add(new Object[] { 18, -2, AffectEnum.TIMID });
        affectTimelineList.add(new Object[] { 18, -1, AffectEnum.MEEK });
        affectTimelineList.add(new Object[] { 18, 1, AffectEnum.LUCKY });
        affectTimelineList.add(new Object[] { 18, 2, AffectEnum.DIGNIFIED });
        affectTimelineList.add(new Object[] { 18, 5, AffectEnum.FREE });
        affectTimelineList.add(new Object[] { 18, 6, AffectEnum.STRONG });
    
        //timeline 19
        affectTimelineList.add(new Object[] { 19, -3, AffectEnum.DISCONTENTED });
        affectTimelineList.add(new Object[] { 19, -2, AffectEnum.TROUBLED });
        affectTimelineList.add(new Object[] { 19, -1, AffectEnum.BURDENED });
        affectTimelineList.add(new Object[] { 19, 2, AffectEnum.THANKFUL });
        affectTimelineList.add(new Object[] { 19, 5, AffectEnum.MASTERFUL });
        affectTimelineList.add(new Object[] { 19, 6, AffectEnum.TRIUMPHANT });
        
        //timeline 20
        affectTimelineList.add(new Object[] { 20, 1, AffectEnum.SELF_SATISFIED });
        affectTimelineList.add(new Object[] { 20, 3, AffectEnum.CURIOUS });
        affectTimelineList.add(new Object[] { 20, 5, AffectEnum.FASCINATED });       
    }
    
    public ArrayList GetLevels()
    {
        return affectTimelineList;   
    }
    
    private ArrayList affectTimelineList = new ArrayList();
}
