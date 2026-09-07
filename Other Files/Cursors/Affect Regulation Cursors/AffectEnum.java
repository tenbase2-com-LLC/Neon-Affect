
package NeonAffect;

import java.util.HashMap;
import java.util.Map;

/**
 * All affect/emotion types in the NeonAffect system.
 * Constants are static final int values for JAC/javac compatibility.
 */
public final class AffectEnum {

    private AffectEnum() {}

    // Timeline 1
    public static final int RAGE = 0;
    public static final int VENGEFUL = 1;
    public static final int ANGRY = 2;
    public static final int DISGUST = 3;
    public static final int SAD = 4;
    public static final int MOODY = 5;
    public static final int ANTICIPATION = 6;
    public static final int PLEASED = 7;
    public static final int HAPPY = 8;
    public static final int ELATION = 9;
    public static final int EUPHORIA = 10;
    public static final int AWE = 11;

    // Timeline 2
    public static final int OVERWHELMED = 12;
    public static final int PANIC = 13;
    public static final int TERROR = 14;
    public static final int FEAR = 15;
    public static final int WARINESS = 16;
    public static final int IRRITATION = 17;
    public static final int INDIFFERENCE = 18;
    public static final int SATISFACTION = 20;
    public static final int AMAZEMENT = 21;
    public static final int EAGERNESS = 22;

    // Timeline 3
    public static final int OBSESSED = 24;
    public static final int BITTERNESS = 25;
    public static final int RESENTMENT = 26;
    public static final int ENVY = 27;
    public static final int JEALOUSY = 28;
    public static final int ACCEPTANCE = 30;
    public static final int PEACEFULNESS = 31;
    public static final int INSPIRED = 32;
    public static final int GRATITUDE = 33;
    public static final int CONNECTEDNESS = 34;
    public static final int WANDERLUST = 35;

    // Timeline 4
    public static final int HUMILIATION = 36;
    public static final int DENIAL = 37;
    public static final int HYSTERIA = 38;
    public static final int DREAD = 39;
    public static final int WORRY = 40;
    public static final int VULNERABILITY = 41;
    public static final int RELIEF = 42;
    public static final int VALUED = 43;
    public static final int PRIDE = 44;
    public static final int CONFIDENCE = 45;
    public static final int FEARLESSNESS = 46;
    public static final int SMUGNESS = 47;

    // Timeline 5
    public static final int SCORN = 48;
    public static final int CONTEMPT = 49;
    public static final int PITY = 50;
    public static final int DISAPPOINTMENT = 52;
    public static final int RESIGNATION = 53;
    public static final int HUMBLED = 54;
    public static final int DETERMINATION = 55;
    public static final int HOPEFULNESS = 56;
    public static final int ADORATION = 58;
    public static final int LOVE = 59;

    // Timeline 6
    public static final int DEPRESSED = 60;
    public static final int REGRET = 61;
    public static final int REMORSE = 62;
    public static final int GUILT = 63;
    public static final int DOUBT = 64;
    public static final int CONFLICTED = 65;
    public static final int ADMIRATION = 66;
    public static final int DESIRE = 67;
    public static final int LONGING = 68;
    public static final int LUST = 69;
    public static final int MOVED = 70;

    // Timeline 7
    public static final int TORMENTED = 72;
    public static final int ANGUISH = 73;
    public static final int STUNNED = 74;
    public static final int DESPERATION = 75;
    public static final int ANXIETY = 76;

    // Timeline 8
    public static final int GRIEF = 77;
    public static final int DEVASTATION = 78;
    public static final int DESPAIR = 79;
    public static final int FLUSTERED = 80;
    public static final int CONFUSION = 81;

    // Timeline 9
    public static final int IMPATIENCE = 82;
    public static final int FRUSTRATION = 83;
    public static final int ANNOYANCE = 84;

    // Timeline 10
    public static final int DEFIANT = 85;
    public static final int APPALLED = 86;

    // Timeline 11
    public static final int SURPRISED = 87;
    public static final int INJUSTICE = 88;
    public static final int DISCOURAGED = 89;
    public static final int TRUST = 90;

    // Timeline 12
    public static final int PAIN = 91;
    public static final int MACABRE = 92;
    public static final int EMBARRASSED = 93;
    public static final int FATIGUED = 94;
    public static final int AROUSED = 95;
    public static final int PATIENCE = 96;
    public static final int COMPASSION = 97;

    // Timeline 13
    public static final int EMPATHY = 98;
    public static final int LOYALTY = 99;

    // Timeline 14
    public static final int DEFEATED = 100;
    public static final int BORED = 101;
    public static final int DISSATISFIED = 102;
    public static final int UPSET = 103;
    public static final int DOMINEERING = 104;
    public static final int SEXUALLY_EXCITED = 105;
    public static final int INTERESTED = 106;
    public static final int CAPABLE = 107;
    public static final int AFFECTIONATE = 108;
    public static final int ACTIVATED = 109;
    public static final int IMPRESSED = 110;
    public static final int WONDER = 111;

    // Timeline 15
    public static final int POWERLESS = 112;
    public static final int FEEBLE = 113;
    public static final int INSECURE = 115;
    public static final int EGOTISTICAL = 116;
    public static final int VIGOROUS = 117;
    public static final int SHY = 118;
    public static final int KIND = 119;
    public static final int FRIENDLY = 120;
    public static final int CAREFREE = 121;
    public static final int DEVOTED = 122;
    public static final int IN_LOVE = 123;
    public static final int MIGHTY = 124;

    // Timeline 16
    public static final int SUBDUED = 125;
    public static final int INHIBITED = 126;
    public static final int DISTRESSED = 127;
    public static final int AGGRESSIVE = 128;
    public static final int SERIOUS = 129;
    public static final int USEFUL = 130;
    public static final int RESPONSIBLE = 131;
    public static final int CONCENTRATING = 132;
    public static final int ENJOYMENT = 133;
    public static final int INFLUENTIAL = 134;
    public static final int BOLD = 135;

    // Timeline 17
    public static final int LONELY = 136;
    public static final int LISTLESS = 137;
    public static final int REJECTED = 138;
    public static final int ARROGANT = 139;
    public static final int ADMIRED = 140;
    public static final int ALERT = 141;
    public static final int COOPERATIVE = 142;
    public static final int EXCITED = 143;
    public static final int JOYFUL = 144;
    public static final int POWERFUL = 145;

    // Timeline 18
    public static final int TIMID = 146;
    public static final int MEEK = 147;
    public static final int TENSE = 148;
    public static final int CONTROLLING = 149;
    public static final int DIGNIFIED = 150;
    public static final int FREE = 151;
    public static final int LUCKY = 152;
    public static final int STRONG = 153;

    // Timeline 19
    public static final int BURDENED = 154;
    public static final int DISCONTENTED = 155;
    public static final int TROUBLED = 156;
    public static final int THANKFUL = 157;
    public static final int MASTERFUL = 158;
    public static final int TRIUMPHANT = 159;

    // Timeline 20
    public static final int CURIOUS = 160;
    public static final int SELF_SATISFIED = 161;
    public static final int FASCINATED = 162;

    // ── Category constants ─────────────────────────────────────────────

    public static final String VERBAL = "Verbal";
    public static final String NONVERBAL = "Nonverbal";
    public static final String ACTION = "Action";

    public static final int NEUTRAL_ID = -1;

    // ── Name lookup ────────────────────────────────────────────────────

    private static final Map<Integer, String> NAMES = new HashMap<>();
    static {
        NAMES.put(RAGE, "Rage"); NAMES.put(VENGEFUL, "Vengeful"); NAMES.put(ANGRY, "Angry");
        NAMES.put(DISGUST, "Disgust"); NAMES.put(SAD, "Sad"); NAMES.put(MOODY, "Moody");
        NAMES.put(ANTICIPATION, "Anticipation"); NAMES.put(PLEASED, "Pleased");
        NAMES.put(HAPPY, "Happy"); NAMES.put(ELATION, "Elation"); NAMES.put(EUPHORIA, "Euphoria");
        NAMES.put(AWE, "Awe"); NAMES.put(OVERWHELMED, "Overwhelmed"); NAMES.put(PANIC, "Panic");
        NAMES.put(TERROR, "Terror"); NAMES.put(FEAR, "Fear"); NAMES.put(WARINESS, "Wariness");
        NAMES.put(IRRITATION, "Irritation"); NAMES.put(INDIFFERENCE, "Indifference");
        NAMES.put(SATISFACTION, "Satisfaction"); NAMES.put(AMAZEMENT, "Amazement");
        NAMES.put(EAGERNESS, "Eagerness"); NAMES.put(OBSESSED, "Obsessed");
        NAMES.put(BITTERNESS, "Bitterness"); NAMES.put(RESENTMENT, "Resentment");
        NAMES.put(ENVY, "Envy"); NAMES.put(JEALOUSY, "Jealousy");
        NAMES.put(ACCEPTANCE, "Acceptance"); NAMES.put(PEACEFULNESS, "Peacefulness");
        NAMES.put(INSPIRED, "Inspired"); NAMES.put(GRATITUDE, "Gratitude");
        NAMES.put(CONNECTEDNESS, "Connectedness"); NAMES.put(WANDERLUST, "Wanderlust");
        NAMES.put(HUMILIATION, "Humiliation"); NAMES.put(DENIAL, "Denial");
        NAMES.put(HYSTERIA, "Hysteria"); NAMES.put(DREAD, "Dread"); NAMES.put(WORRY, "Worry");
        NAMES.put(VULNERABILITY, "Vulnerability"); NAMES.put(RELIEF, "Relief");
        NAMES.put(VALUED, "Valued"); NAMES.put(PRIDE, "Pride");
        NAMES.put(CONFIDENCE, "Confidence"); NAMES.put(FEARLESSNESS, "Fearlessness");
        NAMES.put(SMUGNESS, "Smugness"); NAMES.put(SCORN, "Scorn");
        NAMES.put(CONTEMPT, "Contempt"); NAMES.put(PITY, "Pity");
        NAMES.put(DISAPPOINTMENT, "Disappointment"); NAMES.put(RESIGNATION, "Resignation");
        NAMES.put(HUMBLED, "Humbled"); NAMES.put(DETERMINATION, "Determination");
        NAMES.put(HOPEFULNESS, "Hopefulness"); NAMES.put(ADORATION, "Adoration");
        NAMES.put(LOVE, "Love"); NAMES.put(DEPRESSED, "Depressed");
        NAMES.put(REGRET, "Regret"); NAMES.put(REMORSE, "Remorse"); NAMES.put(GUILT, "Guilt");
        NAMES.put(DOUBT, "Doubt"); NAMES.put(CONFLICTED, "Conflicted");
        NAMES.put(ADMIRATION, "Admiration"); NAMES.put(DESIRE, "Desire");
        NAMES.put(LONGING, "Longing"); NAMES.put(LUST, "Lust"); NAMES.put(MOVED, "Moved");
        NAMES.put(TORMENTED, "Tormented"); NAMES.put(ANGUISH, "Anguish");
        NAMES.put(STUNNED, "Stunned"); NAMES.put(DESPERATION, "Desperation");
        NAMES.put(ANXIETY, "Anxiety"); NAMES.put(GRIEF, "Grief");
        NAMES.put(DEVASTATION, "Devastation"); NAMES.put(DESPAIR, "Despair");
        NAMES.put(FLUSTERED, "Flustered"); NAMES.put(CONFUSION, "Confusion");
        NAMES.put(IMPATIENCE, "Impatience"); NAMES.put(FRUSTRATION, "Frustration");
        NAMES.put(ANNOYANCE, "Annoyance"); NAMES.put(DEFIANT, "Defiant");
        NAMES.put(APPALLED, "Appalled"); NAMES.put(SURPRISED, "Surprised");
        NAMES.put(INJUSTICE, "Injustice"); NAMES.put(DISCOURAGED, "Discouraged");
        NAMES.put(TRUST, "Trust"); NAMES.put(PAIN, "Pain"); NAMES.put(MACABRE, "Macabre");
        NAMES.put(EMBARRASSED, "Embarrassed"); NAMES.put(FATIGUED, "Fatigued");
        NAMES.put(AROUSED, "Aroused"); NAMES.put(PATIENCE, "Patience");
        NAMES.put(COMPASSION, "Compassion"); NAMES.put(EMPATHY, "Empathy");
        NAMES.put(LOYALTY, "Loyalty"); NAMES.put(DEFEATED, "Defeated");
        NAMES.put(BORED, "Bored"); NAMES.put(DISSATISFIED, "Dissatisfied");
        NAMES.put(UPSET, "Upset"); NAMES.put(DOMINEERING, "Domineering");
        NAMES.put(SEXUALLY_EXCITED, "SexuallyExcited"); NAMES.put(INTERESTED, "Interested");
        NAMES.put(CAPABLE, "Capable"); NAMES.put(AFFECTIONATE, "Affectionate");
        NAMES.put(ACTIVATED, "Activated"); NAMES.put(IMPRESSED, "Impressed");
        NAMES.put(WONDER, "Wonder"); NAMES.put(POWERLESS, "Powerless");
        NAMES.put(FEEBLE, "Feeble"); NAMES.put(INSECURE, "Insecure");
        NAMES.put(EGOTISTICAL, "Egotistical"); NAMES.put(VIGOROUS, "Vigorous");
        NAMES.put(SHY, "Shy"); NAMES.put(KIND, "Kind"); NAMES.put(FRIENDLY, "Friendly");
        NAMES.put(CAREFREE, "Carefree"); NAMES.put(DEVOTED, "Devoted");
        NAMES.put(IN_LOVE, "InLove"); NAMES.put(MIGHTY, "Mighty");
        NAMES.put(SUBDUED, "Subdued"); NAMES.put(INHIBITED, "Inhibited");
        NAMES.put(DISTRESSED, "Distressed"); NAMES.put(AGGRESSIVE, "Aggressive");
        NAMES.put(SERIOUS, "Serious"); NAMES.put(USEFUL, "Useful");
        NAMES.put(RESPONSIBLE, "Responsible"); NAMES.put(CONCENTRATING, "Concentrating");
        NAMES.put(ENJOYMENT, "Enjoyment"); NAMES.put(INFLUENTIAL, "Influential");
        NAMES.put(BOLD, "Bold"); NAMES.put(LONELY, "Lonely");
        NAMES.put(LISTLESS, "Listless"); NAMES.put(REJECTED, "Rejected");
        NAMES.put(ARROGANT, "Arrogant"); NAMES.put(ADMIRED, "Admired");
        NAMES.put(ALERT, "Alert"); NAMES.put(COOPERATIVE, "Cooperative");
        NAMES.put(EXCITED, "Excited"); NAMES.put(JOYFUL, "Joyful");
        NAMES.put(POWERFUL, "Powerful"); NAMES.put(TIMID, "Timid");
        NAMES.put(MEEK, "Meek"); NAMES.put(TENSE, "Tense");
        NAMES.put(CONTROLLING, "Controlling"); NAMES.put(DIGNIFIED, "Dignified");
        NAMES.put(FREE, "Free"); NAMES.put(LUCKY, "Lucky"); NAMES.put(STRONG, "Strong");
        NAMES.put(BURDENED, "Burdened"); NAMES.put(DISCONTENTED, "Discontented");
        NAMES.put(TROUBLED, "Troubled"); NAMES.put(THANKFUL, "Thankful");
        NAMES.put(MASTERFUL, "Masterful"); NAMES.put(TRIUMPHANT, "Triumphant");
        NAMES.put(CURIOUS, "Curious"); NAMES.put(SELF_SATISFIED, "SelfSatisfied");
        NAMES.put(FASCINATED, "Fascinated");
    }

    public static String GetName(int id) throws Exception {
        String name = NAMES.get(id);
        if (name == null) {
            throw new Exception("AffectEnum: GetName: does not have key: " + id);
        }
        return name;
    }
}
