
package NeonAffect;

import java.util.ArrayList;
import java.util.List;

public class INTP_AffectLevels
{

    public INTP_AffectLevels()
    {
        // Level -6 (Most extreme negative states - INTP focus on cognitive entrapment and Fe-grip emotional flood)
        affectTimelineList.add(new AffectLevel(-1, -6, AffectEnum.OBSESSED)); // Trapped in a Ti loop
        affectTimelineList.add(new AffectLevel(-1, -6, AffectEnum.TORMENTED)); // By unresolvable contradictions
        affectTimelineList.add(new AffectLevel(-1, -6, AffectEnum.OVERWHELMED)); // Fe grip emotional flood [level representative]

        // Level -5 (Very intense negative states - INTP focus on collapse of understanding and loss of composure)
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.DEPRESSED)); // Withdrawn and processed internally
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.DESPAIR)); // When logic fails completely
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.DEVASTATION)); // Whole framework collapses
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.HYSTERIA)); // Inferior Fe eruption
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.PANIC)); // Fe grip loss of composure
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.POWERLESS)); // To think clearly
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.SHAME)); // Whole self judged bad (new)
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.CONFUSION)); // Understanding itself collapses [level representative]

        // Level -4 (Strong negative states - INTP focus on intellectual starvation and being misunderstood)
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.ABANDONED)); // Left alone by those relied on (new)
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.ANGUISH)); // Over theoretical dead ends
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.BETRAYED)); // Trust broken by someone close (new)
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.BORED)); // Starved of ideas
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.DEFIANT)); // Against imposed rules
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.DENIAL)); // Of feelings beneath the logic
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.DISILLUSIONED)); // Ideals collapse (new)
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.DISTRESSED)); // By sustained illogic
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.DRAINED)); // Exhausted from giving (new)
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.EXASPERATED)); // Patience exhausted (new)
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.FEEBLE)); // In logical capability
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.FRUSTRATION)); // With unsolvable problems
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.HUMILIATION)); // Exposed as socially inept
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.INSECURE)); // About intellectual competence
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.TERROR)); // Of losing the mind
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.TROUBLED)); // By unresolved inconsistencies
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.REJECTED)); // Misunderstood and shut out [level representative]

        // Level -3 (Moderate negative states - INTP focus on friction with illogic and emotional demands)
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.ANGRY)); // Cold and contained
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.ANXIETY)); // About emotional demands
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.AWKWARD)); // Socially out of step (new)
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.BURDENED)); // By imposed obligations
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.CONFLICTED)); // Between logic and feeling
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.CONTEMPT)); // For willful illogic
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.DEFEATED)); // By an intractable problem
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.DESPERATION)); // To make sense of it
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.DISCONTENTED)); // With insufficient data
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.DISCOURAGED)); // By repeated dead ends
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.DISGUST)); // At illogical behavior
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.DREAD)); // Of forced social expression
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.EMBARRASSED)); // By social missteps
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.FEAR)); // Of intellectual failure
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.FLUSTERED)); // By emotional scenes
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.GRIEF)); // Contained until it breaks through
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.HEARTBROKEN)); // Loss of a cherished bond (new)
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.HURT)); // Wounded by another (new)
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.INJUSTICE)); // Truth ignored or distorted
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.LISTLESS)); // When unstimulated
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.LONELY)); // No one follows the reasoning
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.PAIN)); // Felt late and privately
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.RAGE)); // Rare and quickly suppressed
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.SCORN)); // Detached and analytical
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.STUNNED)); // By unexpected data
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.TENSE)); // Under imposed structure
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.UPSET)); // By emotional pressure
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.VULNERABILITY)); // Emotionally exposed
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.WORRY)); // About being understood
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.APPALLED)); // By broken reasoning [level representative]

        // Level -2 (Mild negative states - INTP focus on mild intellectual irritation and social reserve)
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.ANNOYANCE)); // At sloppy thinking
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.APPREHENSIVE)); // Unease about what is coming (new)
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.ARROGANT)); // Intellectual certainty
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.BITTERNESS)); // Rarely held for long
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.DISAPPOINTMENT)); // In shallow reasoning
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.DISSATISFIED)); // With incomplete understanding
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.DOUBT)); // In own model
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.ENVY)); // Of greater knowledge
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.FATIGUED)); // By social demands
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.GUARDED)); // Holding back to avoid hurt (new)
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.GUILT)); // Over neglected people
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.IMPATIENCE)); // With repetition
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.INHIBITED)); // In social settings
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.MOODY)); // When intellectually frustrated
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.REGRET)); // Analysed then filed
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.REMORSE)); // Logically assessed
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.RESENTMENT)); // Of imposed rules
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.RESIGNATION)); // To an imperfect world
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.SAD)); // Quiet and private
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.SHY)); // Natural reserve
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.SUBDUED)); // Natural state
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.TIMID)); // In social settings
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.VIGOROUS)); // In problem-solving bursts
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.WARINESS)); // Of emotional demands
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.WISTFUL)); // Longing for the unreachable (new)
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.IRRITATION)); // At illogic [level representative]

        // Level -1 (Slight negative states - INTP focus on detached disinterest in status and control)
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.ACCEPTANCE)); // Of limitations
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.AGGRESSIVE)); // Rarely expressed
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.CONTROLLING)); // Only of personal space
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.DOMINEERING)); // Rarely if ever
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.EGOTISTICAL)); // Quiet intellectual pride
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.HUMBLED)); // By greater insight
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.JEALOUSY)); // Of social ease in others
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.MACABRE)); // Detached curiosity
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.MEEK)); // Natural deference
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.PITY)); // From a distance
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.RESTLESS)); // Unable to settle (new)
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.SERIOUS)); // Natural state
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.SEXUALLY_EXCITED)); // Kept internal
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.UNAPPRECIATED)); // Efforts go unrecognised (new)
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.VENGEFUL)); // Barely registers
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.INDIFFERENCE)); // To status and convention [level representative]

        // Level 0 (Neutral state)
        affectTimelineList.add(new AffectLevel(-1, 0, AffectEnum.NEUTRAL_ID)); // Analytical baseline

        // Level 1 (Slight positive states - INTP focus on quiet dry amusement and easy acceptance)
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.BELONGING)); // Accepted by the group (new)
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.COOPERATIVE)); // When it makes sense
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.DIGNIFIED)); // In reasoned composure
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.FRIENDLY)); // Reserved expression
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.KIND)); // Quietly expressed
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.LUCKY)); // In chance discovery
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.REASSURED)); // Doubt eased by another (new)
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.RESPONSIBLE)); // For accuracy
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.SUPPORTED)); // Backed by others (new)
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.SYMPATHY)); // Feeling for another's trouble (new)
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.AMUSED)); // Finding something funny (new) [level representative]

        // Level 2 (Mild positive states - INTP focus on settled calm of a problem resolved)
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.ADMIRED)); // Matters little
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.ADORATION)); // Reserved
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.AFFECTIONATE)); // Reserved expression
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.AROUSED)); // Kept internal
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.EMPATHY)); // Through understanding
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.INFLUENTIAL)); // Matters little
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.LUST)); // Cerebral expression
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.PEACEFULNESS)); // In solitude
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.PLAYFUL)); // Light teasing spontaneity (new)
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.SELF_SATISFIED)); // With a clean analysis
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.TENDERNESS)); // Gentle protective warmth (new)
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.THANKFUL)); // Quietly
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.USEFUL)); // When ideas are applied
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.VALUED)); // For insight
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.RELIEF)); // Puzzle resolved [level representative]

        // Level 3 (Moderate positive states - INTP focus on warm engagement with ideas and kindred minds)
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.ADMIRATION)); // Of elegant thinking
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.ANTICIPATION)); // Of a new puzzle
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.BOLD)); // In unconventional ideas
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.CAPABLE)); // In analysis
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.CAREFREE)); // In theoretical play
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.CHERISHED)); // Deeply valued by another (new)
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.COMPASSION)); // Through understanding
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.COMPERSION)); // Joy in another's joy (new)
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.DETERMINATION)); // To understand
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.FEARLESSNESS)); // In theoretical exploration
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.GRATITUDE)); // For good ideas
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.HAPPY)); // With understanding
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.HOPEFULNESS)); // About a promising theory
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.INTIMACY)); // Mutual closeness and openness (new)
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.IN_LOVE)); // Cerebrally expressed
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.LOVE)); // Reserved expression
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.MIGHTY)); // Rarely sought
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.NOSTALGIA)); // Fondness for the past (new)
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.PATIENCE)); // With complex problems
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.POWERFUL)); // Rarely sought
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.PRIDE)); // Mild in achievement
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.PROTECTIVE)); // Drive to keep others safe (new)
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.PURPOSEFUL)); // Acting toward meaning (new)
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.SMUGNESS)); // Quiet intellectual confidence
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.TRUST)); // In sound reasoning
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.PLEASED)); // With a clean argument [level representative]

        // Level 4 (Strong positive states - INTP focus on absorbed engagement with a live problem)
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.ACTIVATED)); // By interesting problems
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.ALERT)); // To patterns and flaws
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.CONFIDENCE)); // In logical ability
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.DESIRE)); // For knowledge
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.EAGERNESS)); // For discovery
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.ELEVATION)); // Uplifted by human goodness (new)
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.JOYFUL)); // In discovery
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.LONGING)); // For deeper understanding
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.LOYALTY)); // To truth and logic
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.MOVED)); // By profound insights
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.SATISFACTION)); // From solving problems
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.STRONG)); // In understanding
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.TRIUMPHANT)); // Quiet sense of a solved problem
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.WANDERLUST)); // For new knowledge
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.CONCENTRATING)); // Absorbed in a problem [level representative]

        // Level 5 (Very intense positive states - INTP focus on intense curiosity and elegant insight)
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.AMAZEMENT)); // At elegant solutions
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.BLISS)); // Effortless happiness (new)
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.CONNECTEDNESS)); // To universal patterns
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.DEVOTED)); // To understanding
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.ELATION)); // At breakthrough
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.EMPOWERED)); // Able to effect change (new)
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.ENJOYMENT)); // Of deep thinking
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.EXCITED)); // By new concepts
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.IMPRESSED)); // By elegant solutions
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.INSPIRED)); // By concepts
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.INTERESTED)); // Highly engaged by ideas
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.MASTERFUL)); // Full grasp of a system
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.ONENESS)); // Union with something larger (new)
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.SERENITY)); // Deep untroubled calm (new)
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.SURPRISED)); // By unexpected connections
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.CURIOUS)); // Hunger to understand [level representative]

        // Level 6 (Most extreme positive states - INTP focus on pure insight and intellectual freedom)
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.AWE)); // At profound realizations
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.FASCINATED)); // By complex systems
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.FREE)); // Unbounded intellectual freedom
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.WONDER)); // At universal patterns
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.EUPHORIA)); // Perfect logical clarity [level representative]
    }
    
    public ArrayList<AffectLevel> GetLevels()
    {
        return affectTimelineList;   
    }
    
    private final ArrayList<AffectLevel> affectTimelineList = new ArrayList<>();
}
