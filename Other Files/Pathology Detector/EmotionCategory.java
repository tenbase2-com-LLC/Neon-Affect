package NeonAffect;

import java.util.HashMap;
import java.util.Map;

public final class EmotionCategory {

    private EmotionCategory() {}

    public static final int NEG_DEEP    = 0;
    public static final int NEG_STRONG  = 1;
    public static final int NEG_MOD     = 2;
    public static final int NEG_MILD    = 3;
    public static final int SHADOW      = 4;
    public static final int NEUTRAL     = 5;
    public static final int POS_MILD    = 6;
    public static final int POS_MOD     = 7;
    public static final int POS_STRONG  = 8;
    public static final int POS_PEAK    = 9;

    public static final int CAT_SELF_ATK  = 10;
    public static final int CAT_OTHER_ATK = 11;
    public static final int CAT_ANX       = 12;
    public static final int CAT_FLAT      = 13;
    public static final int CAT_AROUSAL   = 14;

    private static final String[] NAMES = {
        "NEG_DEEP", "NEG_STRONG", "NEG_MOD", "NEG_MILD", "SHADOW",
        "NEUTRAL", "POS_MILD", "POS_MOD", "POS_STRONG", "POS_PEAK",
        "SELF_ATK", "OTHER_ATK", "ANX", "FLAT", "AROUSAL"
    };

    public static String GetName(int cat) {
        if (cat >= 0 && cat < NAMES.length) return NAMES[cat];
        return "UNKNOWN";
    }

    private static final Map<Integer, int[]> CATEGORIES = new HashMap<>();

    static {
        // NEG_DEEP: -5 to -6 intensity
        put(AffectEnum.DEPRESSED,    NEG_DEEP);
        put(AffectEnum.DESPAIR,      NEG_DEEP);
        put(AffectEnum.POWERLESS,    NEG_DEEP);
        put(AffectEnum.DEVASTATION,  NEG_DEEP);
        put(AffectEnum.GRIEF,        NEG_DEEP);
        put(AffectEnum.TORMENTED,    NEG_DEEP);
        put(AffectEnum.OBSESSED,     NEG_DEEP);
        put(AffectEnum.OVERWHELMED,  NEG_DEEP);

        // NEG_STRONG: -4 to -5 intensity
        put(AffectEnum.RAGE,         NEG_STRONG, CAT_AROUSAL);
        put(AffectEnum.TERROR,       NEG_STRONG, CAT_ANX);
        put(AffectEnum.PANIC,        NEG_STRONG, CAT_ANX, CAT_AROUSAL);
        put(AffectEnum.HYSTERIA,     NEG_STRONG, CAT_ANX);
        put(AffectEnum.ANGUISH,      NEG_STRONG);
        put(AffectEnum.DESPERATION,  NEG_STRONG, CAT_ANX);
        put(AffectEnum.ANGRY,        NEG_STRONG);
        put(AffectEnum.FRUSTRATION,  NEG_STRONG);
        put(AffectEnum.CONTEMPT,     NEG_STRONG, CAT_OTHER_ATK);
        put(AffectEnum.SCORN,        NEG_STRONG, CAT_OTHER_ATK);
        put(AffectEnum.DISGUST,      NEG_STRONG, CAT_OTHER_ATK);
        put(AffectEnum.HUMILIATION,  NEG_STRONG, CAT_SELF_ATK);
        put(AffectEnum.INJUSTICE,    NEG_STRONG);
        put(AffectEnum.BITTERNESS,   NEG_STRONG, CAT_OTHER_ATK);
        put(AffectEnum.INSECURE,     NEG_STRONG, CAT_SELF_ATK);
        put(AffectEnum.FEEBLE,       NEG_STRONG, CAT_SELF_ATK);

        // NEG_MOD: -2 to -3 intensity
        put(AffectEnum.SAD,            NEG_MOD);
        put(AffectEnum.FEAR,           NEG_MOD, CAT_ANX);
        put(AffectEnum.DREAD,          NEG_MOD, CAT_ANX);
        put(AffectEnum.ANXIETY,        NEG_MOD, CAT_ANX);
        put(AffectEnum.WORRY,          NEG_MOD, CAT_ANX);
        put(AffectEnum.GUILT,          NEG_MOD, CAT_SELF_ATK);
        put(AffectEnum.REMORSE,        NEG_MOD, CAT_SELF_ATK);
        put(AffectEnum.REGRET,         NEG_MOD, CAT_SELF_ATK);
        put(AffectEnum.DOUBT,          NEG_MOD, CAT_SELF_ATK);
        put(AffectEnum.CONFUSION,      NEG_MOD);
        put(AffectEnum.RESENTMENT,     NEG_MOD, CAT_OTHER_ATK);
        put(AffectEnum.ENVY,           NEG_MOD);
        put(AffectEnum.JEALOUSY,       NEG_MOD);
        put(AffectEnum.DISAPPOINTMENT, NEG_MOD);
        put(AffectEnum.DEFEATED,       NEG_MOD);
        put(AffectEnum.DISCOURAGED,    NEG_MOD);
        put(AffectEnum.EMBARRASSED,    NEG_MOD, CAT_SELF_ATK);
        put(AffectEnum.LONELY,         NEG_MOD);
        put(AffectEnum.REJECTED,       NEG_MOD);
        put(AffectEnum.STUNNED,        NEG_MOD);
        put(AffectEnum.UPSET,          NEG_MOD);
        put(AffectEnum.TROUBLED,       NEG_MOD);
        put(AffectEnum.CONFLICTED,     NEG_MOD);
        put(AffectEnum.TENSE,          NEG_MOD, CAT_ANX);
        put(AffectEnum.DISTRESSED,     NEG_MOD);
        put(AffectEnum.PAIN,           NEG_MOD);
        put(AffectEnum.APPALLED,       NEG_MOD);
        put(AffectEnum.DEFIANT,        NEG_MOD);
        put(AffectEnum.ANNOYANCE,      NEG_MOD);
        put(AffectEnum.IMPATIENCE,     NEG_MOD);
        put(AffectEnum.FLUSTERED,      NEG_MOD, CAT_ANX);
        put(AffectEnum.DISCONTENTED,   NEG_MOD);

        // NEG_MILD: -1 to -2 intensity
        put(AffectEnum.MOODY,          NEG_MILD);
        put(AffectEnum.BORED,          NEG_MILD, CAT_FLAT);
        put(AffectEnum.IRRITATION,     NEG_MILD);
        put(AffectEnum.INDIFFERENCE,   NEG_MILD, CAT_FLAT);
        put(AffectEnum.WARINESS,       NEG_MILD, CAT_ANX);
        put(AffectEnum.SHY,            NEG_MILD, CAT_FLAT);
        put(AffectEnum.TIMID,          NEG_MILD, CAT_FLAT);
        put(AffectEnum.MEEK,           NEG_MILD, CAT_FLAT);
        put(AffectEnum.SUBDUED,        NEG_MILD, CAT_FLAT);
        put(AffectEnum.INHIBITED,      NEG_MILD, CAT_FLAT);
        put(AffectEnum.LISTLESS,       NEG_MILD, CAT_FLAT);
        put(AffectEnum.FATIGUED,       NEG_MILD, CAT_FLAT);
        put(AffectEnum.DISSATISFIED,   NEG_MILD);
        put(AffectEnum.VULNERABILITY,  NEG_MILD);
        put(AffectEnum.RESIGNATION,    NEG_MILD, CAT_FLAT);
        put(AffectEnum.BURDENED,       NEG_MILD);
        put(AffectEnum.SERIOUS,        NEG_MILD);

        // SHADOW
        put(AffectEnum.CONTROLLING,    SHADOW, CAT_OTHER_ATK);
        put(AffectEnum.DOMINEERING,    SHADOW, CAT_OTHER_ATK);
        put(AffectEnum.AGGRESSIVE,     SHADOW, CAT_OTHER_ATK);
        put(AffectEnum.ARROGANT,       SHADOW, CAT_OTHER_ATK);
        put(AffectEnum.EGOTISTICAL,    SHADOW);
        put(AffectEnum.VENGEFUL,       SHADOW, CAT_OTHER_ATK);
        put(AffectEnum.MACABRE,        SHADOW);
        put(AffectEnum.PITY,           SHADOW);
        put(AffectEnum.DENIAL,         SHADOW);

        // NEUTRAL
        put(AffectEnum.ACCEPTANCE,     NEUTRAL);
        put(AffectEnum.HUMBLED,        NEUTRAL);

        // POS_MILD
        put(AffectEnum.KIND,           POS_MILD);
        put(AffectEnum.FRIENDLY,       POS_MILD);
        put(AffectEnum.RELIEF,         POS_MILD);
        put(AffectEnum.PEACEFULNESS,   POS_MILD);
        put(AffectEnum.THANKFUL,       POS_MILD);
        put(AffectEnum.ANTICIPATION,   POS_MILD);
        put(AffectEnum.ALERT,          POS_MILD);
        put(AffectEnum.ACTIVATED,      POS_MILD);
        put(AffectEnum.COOPERATIVE,    POS_MILD);
        put(AffectEnum.DIGNIFIED,      POS_MILD);
        put(AffectEnum.SELF_SATISFIED, POS_MILD);
        put(AffectEnum.LUCKY,          POS_MILD);
        put(AffectEnum.RESPONSIBLE,    POS_MILD);
        put(AffectEnum.PATIENCE,       POS_MILD);

        // POS_MOD
        put(AffectEnum.HAPPY,          POS_MOD);
        put(AffectEnum.PLEASED,        POS_MOD);
        put(AffectEnum.GRATITUDE,      POS_MOD);
        put(AffectEnum.TRUST,          POS_MOD);
        put(AffectEnum.PRIDE,          POS_MOD);
        put(AffectEnum.SATISFACTION,   POS_MOD);
        put(AffectEnum.HOPEFULNESS,    POS_MOD);
        put(AffectEnum.CONFIDENCE,     POS_MOD);
        put(AffectEnum.DETERMINATION,  POS_MOD);
        put(AffectEnum.CURIOUS,        POS_MOD);
        put(AffectEnum.INTERESTED,     POS_MOD);
        put(AffectEnum.CAPABLE,        POS_MOD);
        put(AffectEnum.USEFUL,         POS_MOD);
        put(AffectEnum.COMPASSION,     POS_MOD);
        put(AffectEnum.EMPATHY,        POS_MOD);
        put(AffectEnum.ADMIRATION,     POS_MOD);
        put(AffectEnum.JOYFUL,         POS_MOD);
        put(AffectEnum.CAREFREE,       POS_MOD);
        put(AffectEnum.VALUED,         POS_MOD);
        put(AffectEnum.CONCENTRATING,  POS_MOD);
        put(AffectEnum.BOLD,           POS_MOD);

        // POS_STRONG
        put(AffectEnum.ELATION,        POS_STRONG);
        put(AffectEnum.EXCITED,        POS_STRONG, CAT_AROUSAL);
        put(AffectEnum.EAGERNESS,      POS_STRONG);
        put(AffectEnum.AMAZEMENT,      POS_STRONG);
        put(AffectEnum.INSPIRED,       POS_STRONG);
        put(AffectEnum.DEVOTED,        POS_STRONG);
        put(AffectEnum.FEARLESSNESS,   POS_STRONG);
        put(AffectEnum.LOVE,           POS_STRONG);
        put(AffectEnum.LOYALTY,        POS_STRONG);
        put(AffectEnum.MOVED,          POS_STRONG);
        put(AffectEnum.IMPRESSED,      POS_STRONG);
        put(AffectEnum.ADORATION,      POS_STRONG);
        put(AffectEnum.AFFECTIONATE,   POS_STRONG);
        put(AffectEnum.LONGING,        POS_STRONG);
        put(AffectEnum.LUST,           POS_STRONG);
        put(AffectEnum.IN_LOVE,        POS_STRONG);
        put(AffectEnum.POWERFUL,       POS_STRONG);
        put(AffectEnum.STRONG,         POS_STRONG);
        put(AffectEnum.FREE,           POS_STRONG);
        put(AffectEnum.INFLUENTIAL,    POS_STRONG);
        put(AffectEnum.WANDERLUST,     POS_STRONG);
        put(AffectEnum.FASCINATED,     POS_STRONG);

        // POS_PEAK
        put(AffectEnum.EUPHORIA,       POS_PEAK, CAT_AROUSAL);
        put(AffectEnum.AWE,            POS_PEAK);
        put(AffectEnum.WONDER,         POS_PEAK);
        put(AffectEnum.CONNECTEDNESS,  POS_PEAK);
        put(AffectEnum.MASTERFUL,      POS_PEAK);
        put(AffectEnum.TRIUMPHANT,     POS_PEAK);
        put(AffectEnum.ENJOYMENT,      POS_PEAK);
        put(AffectEnum.MIGHTY,         POS_PEAK);
        put(AffectEnum.ADMIRED,        POS_PEAK);

        // Emotions that need both a valence category and a special tag
        put(AffectEnum.SURPRISED,        POS_MILD);
        put(AffectEnum.DESIRE,           POS_MOD);
        put(AffectEnum.SEXUALLY_EXCITED, POS_STRONG, CAT_AROUSAL);
        put(AffectEnum.AROUSED,          POS_MOD,    CAT_AROUSAL);
        put(AffectEnum.VIGOROUS,         POS_STRONG, CAT_AROUSAL);
        put(AffectEnum.SMUGNESS,         SHADOW);
    }

    private static void put(int affect, int... cats) {
        CATEGORIES.put(affect, cats);
    }

    private static void addSecondary(int affect, int... extraCats) {
        int[] existing = CATEGORIES.get(affect);
        if (existing == null) {
            CATEGORIES.put(affect, extraCats);
        } else {
            int[] merged = new int[existing.length + extraCats.length];
            System.arraycopy(existing, 0, merged, 0, existing.length);
            System.arraycopy(extraCats, 0, merged, existing.length, extraCats.length);
            CATEGORIES.put(affect, merged);
        }
    }

    public static int GetPrimaryCategory(int affectId) {
        int[] cats = CATEGORIES.get(affectId);
        if (cats != null && cats.length > 0) return cats[0];
        return NEUTRAL;
    }

    public static int[] GetAllCategories(int affectId) {
        int[] cats = CATEGORIES.get(affectId);
        if (cats != null) return cats;
        return new int[]{ NEUTRAL };
    }

    public static boolean IsInCategory(int affectId, int category) {
        int[] cats = CATEGORIES.get(affectId);
        if (cats == null) return false;
        for (int i = 0; i < cats.length; i++) {
            if (cats[i] == category) return true;
        }
        return false;
    }

    public static boolean IsNegative(int category) {
        return category >= NEG_DEEP && category <= NEG_MILD;
    }

    public static boolean IsPositive(int category) {
        return category >= POS_MILD && category <= POS_PEAK;
    }

    public static int GetValenceRank(int category) {
        switch (category) {
            case NEG_DEEP:   return -4;
            case NEG_STRONG: return -3;
            case NEG_MOD:    return -2;
            case NEG_MILD:   return -1;
            case SHADOW:     return -2;
            case NEUTRAL:    return 0;
            case POS_MILD:   return 1;
            case POS_MOD:    return 2;
            case POS_STRONG: return 3;
            case POS_PEAK:   return 4;
            default:         return 0;
        }
    }
}
