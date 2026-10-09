package NeonAffect;

import java.util.ArrayList;

public final class EmotionPatternLibrary {

    private EmotionPatternLibrary() {}

    // --- Positive pattern families ---
    public static final String FAMILY_ASCENT      = "ASCENT";
    public static final String FAMILY_STABILITY   = "STABILITY";
    public static final String FAMILY_FLEXIBILITY = "FLEXIBILITY";
    public static final String FAMILY_REGULATION  = "REGULATION";
    public static final String FAMILY_ENGAGEMENT  = "ENGAGEMENT";
    public static final String FAMILY_RESILIENCE  = "RESILIENCE";
    public static final String FAMILY_FLOW        = "FLOW";
    public static final String FAMILY_GROWTH      = "GROWTH";
    public static final String FAMILY_BONDING     = "BONDING";
    public static final String FAMILY_INTEGRATION = "INTEGRATION";

    // --- Any-direction families ---
    public static final String FAMILY_TRANSITION  = "TRANSITION";
    public static final String FAMILY_COMPLEXITY  = "COMPLEXITY";
    public static final String FAMILY_INTENSITY   = "INTENSITY";
    public static final String FAMILY_RHYTHM      = "RHYTHM";
    public static final String FAMILY_CONTAGION   = "CONTAGION";

    private static final ArrayList<EmotionPatternMotif> MOTIFS = new ArrayList<>();
    private static final ArrayList<CompoundMotif> COMPOUNDS = new ArrayList<>();

    static {
        int ND = EmotionCategory.NEG_DEEP;
        int NS = EmotionCategory.NEG_STRONG;
        int NM = EmotionCategory.NEG_MOD;
        int NL = EmotionCategory.NEG_MILD;
        int SH = EmotionCategory.SHADOW;
        int NT = EmotionCategory.NEUTRAL;
        int PM = EmotionCategory.POS_MILD;
        int PD = EmotionCategory.POS_MOD;
        int PS = EmotionCategory.POS_STRONG;
        int PP = EmotionCategory.POS_PEAK;

        // ===== ASCENT family (8 motifs) =====
        add("A01", FAMILY_ASCENT, "Mild to moderate positive climb",        new int[]{PM, PD});
        add("A02", FAMILY_ASCENT, "Moderate to strong positive climb",      new int[]{PD, PS});
        add("A03", FAMILY_ASCENT, "Strong to peak positive climb",          new int[]{PS, PP});
        add("A04", FAMILY_ASCENT, "Negative to neutral recovery",           new int[]{NM, NL, NT});
        add("A05", FAMILY_ASCENT, "Negative to positive full recovery",     new int[]{NM, NT, PM});
        add("A06", FAMILY_ASCENT, "Shadow to positive climb",               new int[]{SH, NT, PM});
        add("A07", FAMILY_ASCENT, "Deep negative to peak turnaround",       new int[]{ND, NT, PP}, true, false, false, false, false);
        add("A08", FAMILY_ASCENT, "Sustained multi-step upward trend",      new int[]{NL, PM, PD});

        // ===== STABILITY family (8 motifs) =====
        add("S01", FAMILY_STABILITY, "Sustained neutral groundedness",       new int[]{NT, NT, NT}, false, true, true, false, false);
        add("S02", FAMILY_STABILITY, "Sustained mild positive contentment",  new int[]{PM, PM, PM}, false, true, true, false, false);
        add("S03", FAMILY_STABILITY, "Sustained moderate positive",          new int[]{PD, PD, PD}, false, true, false, false, false);
        add("S04", FAMILY_STABILITY, "Quick return after negative dip",      new int[]{NL, NT, PM});
        add("S05", FAMILY_STABILITY, "Steady positive despite variation",    new int[]{PM, PD, PM}, false, true, false, false, false);
        add("S06", FAMILY_STABILITY, "Low volatility positive maintenance",  new int[]{PD, PS, PD}, false, true, false, false, false);
        add("S07", FAMILY_STABILITY, "Emotional anchoring after disruption", new int[]{NM, PM, PM});
        add("S08", FAMILY_STABILITY, "Equilibrium maintenance",              new int[]{PM, NT, PM}, false, true, true, false, false);

        // ===== FLEXIBILITY family (8 motifs) =====
        add("L01", FAMILY_FLEXIBILITY, "Varied positive states",             new int[]{PM, PS, PD}, false, false, false, false, true);
        add("L02", FAMILY_FLEXIBILITY, "Broad range with positive bias",     new int[]{NL, PM, PS}, false, false, false, false, true);
        add("L03", FAMILY_FLEXIBILITY, "Healthy transition across range",    new int[]{PD, PM, PS});
        add("L04", FAMILY_FLEXIBILITY, "High granularity positive",          new int[]{PM, PD, PM}, false, false, false, false, true);
        add("L05", FAMILY_FLEXIBILITY, "Positive exploration",               new int[]{PS, PD, PP}, false, false, false, false, true);
        add("L06", FAMILY_FLEXIBILITY, "Adaptive shifting",                  new int[]{NL, PD, PM});
        add("L07", FAMILY_FLEXIBILITY, "Balanced arousal variation",         new int[]{PM, PS, PD}, false, false, false, false, true);
        add("L08", FAMILY_FLEXIBILITY, "Diverse emotional vocabulary",       new int[]{PD, PM, PS}, false, false, false, false, true);

        // ===== REGULATION family (8 motifs) =====
        add("R01", FAMILY_REGULATION, "Negative dampened to neutral",        new int[]{NS, NL, NT});
        add("R02", FAMILY_REGULATION, "High arousal de-escalated",           new int[]{NS, NM, NL});
        add("R03", FAMILY_REGULATION, "Self-soothing sequence",              new int[]{NM, NT, PM});
        add("R04", FAMILY_REGULATION, "Proportional response modulation",    new int[]{NM, NL, PM});
        add("R05", FAMILY_REGULATION, "Gradual de-escalation from intensity", new int[]{NS, NM, NT});
        add("R06", FAMILY_REGULATION, "Velocity reduction deceleration",     new int[]{NS, NL, NT}, false, true, false, false, false);
        add("R07", FAMILY_REGULATION, "Containment without suppression",     new int[]{NS, NM, NL});
        add("R08", FAMILY_REGULATION, "Negative processed without spreading", new int[]{NM, NT, NT});

        // ===== ENGAGEMENT family (8 motifs) =====
        add("G01", FAMILY_ENGAGEMENT, "Increasing emotional responsiveness", new int[]{NT, PM, PD});
        add("G02", FAMILY_ENGAGEMENT, "Deepening emotional range",           new int[]{PM, PD, PS});
        add("G03", FAMILY_ENGAGEMENT, "Growing emotional investment",        new int[]{NT, PM, PS});
        add("G04", FAMILY_ENGAGEMENT, "Increasing granularity over time",    new int[]{PM, PD, PS}, false, false, false, false, true);
        add("G05", FAMILY_ENGAGEMENT, "Positive arousal engagement",         new int[]{PM, PS, PP});
        add("G06", FAMILY_ENGAGEMENT, "Emotional attunement",               new int[]{NL, PM, PD});
        add("G07", FAMILY_ENGAGEMENT, "Authentic varied expression",         new int[]{PD, PM, PS}, false, false, false, false, true);
        add("G08", FAMILY_ENGAGEMENT, "Progressive emotional openness",      new int[]{NT, PM, PD});

        // ===== RESILIENCE family (8 motifs) =====
        add("B01", FAMILY_RESILIENCE, "Quick recovery from negative",        new int[]{NS, NT, PM});
        add("B02", FAMILY_RESILIENCE, "Post-adversity growth",               new int[]{NS, PM, PS});
        add("B03", FAMILY_RESILIENCE, "Decreasing negative impact",          new int[]{NS, NM, NL});
        add("B04", FAMILY_RESILIENCE, "Maintained positive despite negative", new int[]{PM, NL, PM});
        add("B05", FAMILY_RESILIENCE, "Adaptive coping sequence",            new int[]{NM, NL, PD});
        add("B06", FAMILY_RESILIENCE, "Stress inoculation",                  new int[]{NM, NT, PM}, false, true, false, false, false);
        add("B07", FAMILY_RESILIENCE, "Bounce-back from deep negative",      new int[]{ND, NL, PM});
        add("B08", FAMILY_RESILIENCE, "Anti-fragility strengthening",        new int[]{NS, PM, PS}, true, false, false, false, false);

        // ===== FLOW family (8 motifs) =====
        add("W01", FAMILY_FLOW, "Sustained moderate arousal positive",       new int[]{PD, PD, PD}, false, true, true, true, false);
        add("W02", FAMILY_FLOW, "Absorbed low entropy focus",                new int[]{PS, PS, PS}, false, true, true, true, false);
        add("W03", FAMILY_FLOW, "Progressive deepening",                     new int[]{PM, PD, PS}, false, true, false, false, false);
        add("W04", FAMILY_FLOW, "Sustained peak with graceful descent",      new int[]{PP, PS, PD}, false, true, false, false, false);
        add("W05", FAMILY_FLOW, "Creative flow varied positive",             new int[]{PS, PD, PS}, false, true, false, false, true);
        add("W06", FAMILY_FLOW, "Peak experience sequence",                  new int[]{PS, PP, PS}, false, true, false, false, false);
        add("W07", FAMILY_FLOW, "Focused engagement plateau",                new int[]{PD, PS, PD}, false, true, true, false, false);
        add("W08", FAMILY_FLOW, "Energized calm",                            new int[]{PD, PD, PS}, false, true, false, true, false);

        // ===== GROWTH family (8 motifs) =====
        add("H01", FAMILY_GROWTH, "Increasing emotional granularity",        new int[]{PM, PD, PS}, false, false, false, false, true);
        add("H02", FAMILY_GROWTH, "Expanding emotional range",               new int[]{NL, PM, PS}, false, false, false, false, true);
        add("H03", FAMILY_GROWTH, "Decreasing regulation resistance",        new int[]{NM, NL, PM});
        add("H04", FAMILY_GROWTH, "Improving recovery time",                 new int[]{NS, NL, PM}, true, false, false, false, false);
        add("H05", FAMILY_GROWTH, "Expanding positive repertoire",           new int[]{PM, PS, PP}, false, false, false, false, true);
        add("H06", FAMILY_GROWTH, "Shadow integration processing",           new int[]{SH, NL, PM});
        add("H07", FAMILY_GROWTH, "Increasing emotional depth",              new int[]{PM, PD, PS});
        add("H08", FAMILY_GROWTH, "Progressive maturation",                  new int[]{NL, NT, PD});

        // ===== BONDING family (8 motifs) =====
        add("N01", FAMILY_BONDING, "Trust building cautious to warm",        new int[]{NT, PM, PD});
        add("N02", FAMILY_BONDING, "Vulnerability shared positive received", new int[]{SH, PM, PD});
        add("N03", FAMILY_BONDING, "Mutual positive escalation",             new int[]{PM, PD, PS});
        add("N04", FAMILY_BONDING, "Progressive disclosure warmth",          new int[]{NL, PM, PS});
        add("N05", FAMILY_BONDING, "Comfort establishment",                  new int[]{NT, PM, PM}, false, true, false, false, false);
        add("N06", FAMILY_BONDING, "Rapport building sequence",              new int[]{NT, PM, PD}, false, true, false, false, false);
        add("N07", FAMILY_BONDING, "Collaborative joy shared peaks",         new int[]{PD, PS, PP});
        add("N08", FAMILY_BONDING, "Empathic mirroring",                     new int[]{NL, NL, PM}, false, false, true, false, false);

        // ===== INTEGRATION family (8 motifs) =====
        add("I01", FAMILY_INTEGRATION, "Mixed emotions resolving to clarity", new int[]{NM, NL, PM});
        add("I02", FAMILY_INTEGRATION, "Grief processing to acceptance",      new int[]{ND, NM, NT});
        add("I03", FAMILY_INTEGRATION, "Conflict resolution",                 new int[]{NS, NT, PM});
        add("I04", FAMILY_INTEGRATION, "Catharsis release to peace",           new int[]{ND, NL, PM});
        add("I05", FAMILY_INTEGRATION, "Ambivalence resolved",                new int[]{NL, SH, PM});
        add("I06", FAMILY_INTEGRATION, "Meaning-making from shadow",          new int[]{SH, NT, PD}, false, false, false, false, true);
        add("I07", FAMILY_INTEGRATION, "Negative processed to acceptance",    new int[]{NS, NL, NT});
        add("I08", FAMILY_INTEGRATION, "Emotional synthesis",                  new int[]{NM, PM, PD}, false, false, false, false, true);

        // ===== TRANSITION family (8 motifs) =====
        add("T01", FAMILY_TRANSITION, "Positive valence reversal to negative", new int[]{PS, NM});
        add("T02", FAMILY_TRANSITION, "Negative valence reversal to positive", new int[]{NM, PS});
        add("T03", FAMILY_TRANSITION, "Rapid category change",                 new int[]{PP, NM}, true, false, false, false, false);
        add("T04", FAMILY_TRANSITION, "Gradual category drift downward",       new int[]{PS, PD, PM});
        add("T05", FAMILY_TRANSITION, "Multi-step upward transition",          new int[]{NL, NT, PM});
        add("T06", FAMILY_TRANSITION, "Neutral boundary crossing upward",      new int[]{NL, NT, PM});
        add("T07", FAMILY_TRANSITION, "Arousal activation",                    new int[]{NT, PM, PS}, true, false, false, false, false);
        add("T08", FAMILY_TRANSITION, "Category leap skipping levels",         new int[]{NM, PS}, true, false, false, false, false);

        // ===== COMPLEXITY family (8 motifs) =====
        add("K01", FAMILY_COMPLEXITY, "High granularity mixed states",         new int[]{NL, PM, NL}, false, false, false, false, true);
        add("K02", FAMILY_COMPLEXITY, "Multi-category co-activation",          new int[]{SH, PM, NL}, false, false, false, false, true);
        add("K03", FAMILY_COMPLEXITY, "Ambivalent processing",                 new int[]{PM, NL, PM});
        add("K04", FAMILY_COMPLEXITY, "Mixed valence exploration",             new int[]{PD, NL, PD}, false, false, false, false, true);
        add("K05", FAMILY_COMPLEXITY, "Emotional layering",                    new int[]{NM, PM, SH}, false, false, false, false, true);
        add("K06", FAMILY_COMPLEXITY, "Paradoxical emotional state",           new int[]{PS, SH, PS}, false, false, false, false, true);
        add("K07", FAMILY_COMPLEXITY, "Nuanced expression markers",            new int[]{PM, NL, PD}, false, false, false, false, true);
        add("K08", FAMILY_COMPLEXITY, "Sophisticated differentiation",         new int[]{PD, PM, PS}, false, false, false, false, true);

        // ===== INTENSITY family (8 motifs) =====
        add("Y01", FAMILY_INTENSITY, "Escalating intensity any direction",     new int[]{NL, NM, NS}, true, false, false, false, false);
        add("Y02", FAMILY_INTENSITY, "De-escalating intensity",                new int[]{NS, NM, NL});
        add("Y03", FAMILY_INTENSITY, "Sustained high positive intensity",      new int[]{PS, PP, PS});
        add("Y04", FAMILY_INTENSITY, "Sustained low intensity calm",           new int[]{NT, PM, NT}, false, true, true, false, false);
        add("Y05", FAMILY_INTENSITY, "Intensity spike from baseline",          new int[]{NT, PS}, true, false, false, false, false);
        add("Y06", FAMILY_INTENSITY, "Intensity cycling moderate",             new int[]{PD, PM, PD});
        add("Y07", FAMILY_INTENSITY, "Gradual intensity build",                new int[]{PM, PD, PS});
        add("Y08", FAMILY_INTENSITY, "Intensity plateau sustained",            new int[]{PS, PS, PS}, false, true, true, false, false);

        // ===== RHYTHM family (8 motifs) =====
        add("M01", FAMILY_RHYTHM, "Regular healthy cycling",                   new int[]{PD, PM, PD}, false, true, false, false, false);
        add("M02", FAMILY_RHYTHM, "Conversation arc opening",                  new int[]{NT, PM, PD});
        add("M03", FAMILY_RHYTHM, "Conversation arc deepening",                new int[]{PD, PS, PP});
        add("M04", FAMILY_RHYTHM, "Conversation arc closing",                  new int[]{PD, PM, NT});
        add("M05", FAMILY_RHYTHM, "Energy wave activity to rest",              new int[]{PS, PD, PM});
        add("M06", FAMILY_RHYTHM, "Building momentum",                         new int[]{PM, PD, PS});
        add("M07", FAMILY_RHYTHM, "Winding down gracefully",                   new int[]{PS, PD, PM}, false, true, false, false, false);
        add("M08", FAMILY_RHYTHM, "Punctuated equilibrium shift",              new int[]{PM, PM, PD}, false, true, true, false, false);

        // ===== CONTAGION family (8 motifs) =====
        add("Q01", FAMILY_CONTAGION, "Single emotion broadening",              new int[]{PM, PM, PD}, false, false, false, false, true);
        add("Q02", FAMILY_CONTAGION, "Emotional narrowing to focus",           new int[]{PD, PS, PS}, false, false, false, true, false);
        add("Q03", FAMILY_CONTAGION, "Cross-dimensional spread positive",      new int[]{PM, PD, PS}, false, false, false, false, true);
        add("Q04", FAMILY_CONTAGION, "Emotional cascade upward",               new int[]{NL, PM, PS});
        add("Q05", FAMILY_CONTAGION, "Successful containment",                 new int[]{NM, NL, NT}, false, true, false, false, false);
        add("Q06", FAMILY_CONTAGION, "Selective amplification positive",       new int[]{PM, PS, PP});
        add("Q07", FAMILY_CONTAGION, "Positive chain reaction",                new int[]{NT, PD, PP});
        add("Q08", FAMILY_CONTAGION, "Dimensional decoupling stabilize",       new int[]{NM, NT, NT}, false, true, false, false, false);

        // ===== COMPOUND PATTERNS (15) =====
        compound("P01", "Flourishing",          new String[]{"A02", "L01", "G02"},  "FLOURISHING");
        compound("P02", "Mindfulness",           new String[]{"S02", "R01", "G01"},  "MINDFULNESS");
        compound("P03", "Breakthrough",          new String[]{"B02", "H03", "I01"},  "BREAKTHROUGH");
        compound("P04", "Creative flow",         new String[]{"W05", "L01", "Y03"},  "CREATIVE_FLOW");
        compound("P05", "Secure attachment",     new String[]{"N05", "S02", "B04"},  "SECURE_ATTACHMENT");
        compound("P06", "Emotional mastery",     new String[]{"R01", "L03", "H03"},  "EMOTIONAL_MASTERY");
        compound("P07", "Transformation",        new String[]{"I04", "H06", "T02"},  "TRANSFORMATION");
        compound("P08", "Vitality",              new String[]{"A03", "W03", "Y07"},  "VITALITY");
        compound("P09", "Serenity",              new String[]{"S02", "R06", "Y04"},  "SERENITY");
        compound("P10", "Wisdom",                new String[]{"I06", "K08", "H01"},  "WISDOM");
        compound("P11", "Peak experience",       new String[]{"W06", "Y03", "A03"},  "PEAK_EXPERIENCE");
        compound("P12", "Healing",               new String[]{"B07", "I02", "A05"},  "HEALING");
        compound("P13", "Authenticity",          new String[]{"G07", "K04", "L01"},  "AUTHENTICITY");
        compound("P14", "Equanimity",            new String[]{"S01", "R08", "K01"},  "EQUANIMITY");
        compound("P15", "Presence",              new String[]{"G01", "S05", "W07"},  "PRESENCE");
    }

    private static void add(String id, String family, String desc, int[] seq) {
        MOTIFS.add(new EmotionPatternMotif(id, family, desc, seq));
    }

    private static void add(String id, String family, String desc, int[] seq,
                            boolean highVel, boolean lowVol, boolean highInertia,
                            boolean lowEntropy, boolean highEntropy) {
        MOTIFS.add(new EmotionPatternMotif(id, family, desc, seq,
            highVel, lowVol, highInertia, lowEntropy, highEntropy));
    }

    private static void compound(String id, String desc, String[] motifIds, String tag) {
        COMPOUNDS.add(new CompoundMotif(id, desc, motifIds, tag));
    }

    public static ArrayList<EmotionPatternMotif> GetMotifs() {
        return MOTIFS;
    }

    public static ArrayList<CompoundMotif> GetCompounds() {
        return COMPOUNDS;
    }

    public static class CompoundMotif implements java.io.Serializable {
        private final String id;
        private final String description;
        private final String[] componentIds;
        private final String patternTag;

        public CompoundMotif(String id, String description, String[] componentIds, String patternTag) {
            this.id = id;
            this.description = description;
            this.componentIds = componentIds;
            this.patternTag = patternTag;
        }

        public String GetId()            { return id; }
        public String GetDescription()   { return description; }
        public String[] GetComponentIds() { return componentIds; }
        public String GetPatternTag()    { return patternTag; }

        public boolean IsPresent(java.util.Set<String> detectedMotifIds) {
            for (String cid : componentIds) {
                if (!detectedMotifIds.contains(cid)) return false;
            }
            return true;
        }
    }
}
