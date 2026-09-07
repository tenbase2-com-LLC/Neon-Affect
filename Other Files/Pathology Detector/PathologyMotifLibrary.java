package NeonAffect;

import java.util.ArrayList;

public final class PathologyMotifLibrary {

    private PathologyMotifLibrary() {}

    public static final String FAMILY_DESCENT     = "DESCENT";
    public static final String FAMILY_OSCILLATION = "OSCILLATION";
    public static final String FAMILY_FIXATION    = "FIXATION";
    public static final String FAMILY_ERUPTION    = "ERUPTION";
    public static final String FAMILY_DISCONNECT  = "DISCONNECT";

    private static final ArrayList<PathologyMotif> MOTIFS = new ArrayList<>();
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
        int SA = EmotionCategory.CAT_SELF_ATK;
        int OA = EmotionCategory.CAT_OTHER_ATK;
        int AX = EmotionCategory.CAT_ANX;
        int FL = EmotionCategory.CAT_FLAT;
        int AR = EmotionCategory.CAT_AROUSAL;

        // ===== DESCENT family =====
        add("D01", FAMILY_DESCENT, "Gradual negative descent",              new int[]{PM, NL, NM});
        add("D02", FAMILY_DESCENT, "Moderate-to-deep plunge",              new int[]{NM, NS, ND});
        add("D03", FAMILY_DESCENT, "Positive crash",                        new int[]{PS, NM, NS}, true, false, false);
        add("D04", FAMILY_DESCENT, "Peak-to-despair freefall",             new int[]{PP, NM, ND}, true, false, false);
        add("D05", FAMILY_DESCENT, "Neutral to deep negative",             new int[]{NT, NM, ND});
        add("D06", FAMILY_DESCENT, "Hope collapse",                         new int[]{PD, NL, NS});
        add("D07", FAMILY_DESCENT, "Mild negative deepening",              new int[]{NL, NM, NS});
        add("D08", FAMILY_DESCENT, "Shadow descent",                        new int[]{SH, NS, ND});

        // ===== OSCILLATION family =====
        add("O01", FAMILY_OSCILLATION, "Positive-negative oscillation",     new int[]{PS, NS, PS}, false, false, true);
        add("O02", FAMILY_OSCILLATION, "Negative bounce",                   new int[]{NS, PM, NS});
        add("O03", FAMILY_OSCILLATION, "Rapid mood swing",                  new int[]{PP, ND, PP}, true, false, true);
        add("O04", FAMILY_OSCILLATION, "Mild oscillation",                  new int[]{PD, NM, PD});
        add("O05", FAMILY_OSCILLATION, "Anxiety-relief cycle",             new int[]{NM, PM, NM});
        add("O06", FAMILY_OSCILLATION, "Peak-trough-peak",                  new int[]{PP, NS, PP}, false, false, true);
        add("O07", FAMILY_OSCILLATION, "Anger-calm-anger",                  new int[]{NS, NT, NS});
        add("O08", FAMILY_OSCILLATION, "Deep oscillation with high velocity", new int[]{ND, PS, ND}, true, false, true);

        // ===== FIXATION family =====
        add("F01", FAMILY_FIXATION, "Deep negative fixation",              new int[]{ND, ND, ND});
        add("F02", FAMILY_FIXATION, "Strong negative fixation",            new int[]{NS, NS, NS});
        add("F03", FAMILY_FIXATION, "Moderate negative fixation",          new int[]{NM, NM, NM});
        add("F04", FAMILY_FIXATION, "Neutral flatline",                     new int[]{NT, NT, NT});
        add("F05", FAMILY_FIXATION, "Shadow fixation",                      new int[]{SH, SH, SH});
        add("F06", FAMILY_FIXATION, "Peak fixation (mania signal)",         new int[]{PP, PP, PP});
        add("F07", FAMILY_FIXATION, "Mild negative stagnation",            new int[]{NL, NL, NL});
        add("F08", FAMILY_FIXATION, "Anxious fixation",                     new int[]{NM, NM, NM});

        // ===== ERUPTION family =====
        add("E01", FAMILY_ERUPTION, "Calm-to-rage eruption",               new int[]{NT, NS, ND}, true, true, false);
        add("E02", FAMILY_ERUPTION, "Positive-to-shadow flip",             new int[]{PD, SH, NS}, true, true, false);
        add("E03", FAMILY_ERUPTION, "Mild-to-extreme eruption",            new int[]{NL, ND},      true, true, false);
        add("E04", FAMILY_ERUPTION, "Neutral explosion",                    new int[]{NT, ND},      true, true, false);
        add("E05", FAMILY_ERUPTION, "Euphoria eruption",                    new int[]{NM, PP},      true, false, false);
        add("E06", FAMILY_ERUPTION, "Shadow eruption from positive",        new int[]{PS, SH},      true, true, false);
        add("E07", FAMILY_ERUPTION, "Anxiety escalation burst",            new int[]{NL, NM, NS},  true, false, false);
        add("E08", FAMILY_ERUPTION, "Suppression burst",                    new int[]{NT, NT, ND},  true, true, false);

        // ===== DISCONNECT family =====
        add("X01", FAMILY_DISCONNECT, "Emotional shutdown",                 new int[]{NS, NT, NT});
        add("X02", FAMILY_DISCONNECT, "Positive flattening",               new int[]{PS, PM, NT});
        add("X03", FAMILY_DISCONNECT, "Affect bleaching",                   new int[]{PD, NT, NT});
        add("X04", FAMILY_DISCONNECT, "Negative flattening",               new int[]{NS, NL, NT});
        add("X05", FAMILY_DISCONNECT, "Emotional numbing",                  new int[]{ND, NL, NT});
        add("X06", FAMILY_DISCONNECT, "Gradual disengagement",             new int[]{PD, PM, NL});
        add("X07", FAMILY_DISCONNECT, "Arousal dropout",                    new int[]{PS, PM, NL});
        add("X08", FAMILY_DISCONNECT, "Total flattening from peak",         new int[]{PP, PM, NT});

        // ===== COMPOUND MOTIFS =====
        compound("C01", "Depressive spiral",         new String[]{"D02", "F01"},       "DEPRESSION");
        compound("C02", "Anxiety cascade",           new String[]{"D07", "O05"},       "ANXIETY");
        compound("C03", "Bipolar pattern",           new String[]{"O03", "F06"},       "BIPOLAR");
        compound("C04", "Narcissistic wound cycle",  new String[]{"E02", "F05"},       "NARCISSISTIC");
        compound("C05", "Dissociative shutdown",     new String[]{"D03", "X01"},       "DISSOCIATION");
        compound("C06", "Borderline oscillation",    new String[]{"O08", "E01"},       "BORDERLINE");
        compound("C07", "Trauma re-experiencing",    new String[]{"E01", "D04"},       "TRAUMA");
        compound("C08", "Learned helplessness",      new String[]{"D01", "F03"},       "HELPLESSNESS");
        compound("C09", "Emotional burnout",         new String[]{"X02", "F04"},       "BURNOUT");
        compound("C10", "Rage-guilt cycle",          new String[]{"E01", "O02"},       "RAGE_GUILT");
        compound("C11", "Manic defense",             new String[]{"D02", "E05"},       "MANIC_DEFENSE");
        compound("C12", "Passive-aggressive loop",   new String[]{"X01", "E02"},       "PASSIVE_AGGRESSIVE");
        compound("C13", "Perfectionist collapse",    new String[]{"D06", "F02"},       "PERFECTIONISM");
        compound("C14", "Avoidant withdrawal",       new String[]{"O05", "X06"},       "AVOIDANCE");
        compound("C15", "Obsessive rumination",      new String[]{"F02", "O07"},       "RUMINATION");
    }

    private static void add(String id, String family, String desc, int[] seq) {
        MOTIFS.add(new PathologyMotif(id, family, desc, seq));
    }

    private static void add(String id, String family, String desc, int[] seq,
                            boolean highVel, boolean lowInertia, boolean highVol) {
        MOTIFS.add(new PathologyMotif(id, family, desc, seq, highVel, lowInertia, highVol));
    }

    private static void compound(String id, String desc, String[] motifIds, String tag) {
        COMPOUNDS.add(new CompoundMotif(id, desc, motifIds, tag));
    }

    public static ArrayList<PathologyMotif> GetMotifs() {
        return MOTIFS;
    }

    public static ArrayList<CompoundMotif> GetCompounds() {
        return COMPOUNDS;
    }

    public static class CompoundMotif implements java.io.Serializable {
        private final String id;
        private final String description;
        private final String[] componentIds;
        private final String pathologyTag;

        public CompoundMotif(String id, String description, String[] componentIds, String pathologyTag) {
            this.id = id;
            this.description = description;
            this.componentIds = componentIds;
            this.pathologyTag = pathologyTag;
        }

        public String GetId()            { return id; }
        public String GetDescription()   { return description; }
        public String[] GetComponentIds() { return componentIds; }
        public String GetPathologyTag()  { return pathologyTag; }

        public boolean IsPresent(java.util.Set<String> detectedMotifIds) {
            for (String cid : componentIds) {
                if (!detectedMotifIds.contains(cid)) return false;
            }
            return true;
        }
    }
}
