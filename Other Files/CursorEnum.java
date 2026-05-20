package NeonAffect;

public final class CursorEnum {

    private CursorEnum() {} // non-instantiable

    public static String toString(String strCursorType, int iStartLevel, int iEndLevel) {
        return strCursorType + "_" + iStartLevel + "_" + iEndLevel;
    }

    public static final String LEVEL_CURSOR_NEG_6 = "LEVEL_CURSOR_NEG_6";
    public static final String LEVEL_CURSOR_NEG_5 = "LEVEL_CURSOR_NEG_5";
    public static final String LEVEL_CURSOR_NEG_4 = "LEVEL_CURSOR_NEG_4";
    public static final String LEVEL_CURSOR_NEG_3 = "LEVEL_CURSOR_NEG_3";
    public static final String LEVEL_CURSOR_NEG_2 = "LEVEL_CURSOR_NEG_2";
    public static final String LEVEL_CURSOR_NEG_1 = "LEVEL_CURSOR_NEG_1";
    public static final String LEVEL_CURSOR_POS_1 = "LEVEL_CURSOR_POS_1";
    public static final String LEVEL_CURSOR_POS_2 = "LEVEL_CURSOR_POS_2";
    public static final String LEVEL_CURSOR_POS_3 = "LEVEL_CURSOR_POS_3";
    public static final String LEVEL_CURSOR_POS_4 = "LEVEL_CURSOR_POS_4";
    public static final String LEVEL_CURSOR_POS_5 = "LEVEL_CURSOR_POS_5";
    public static final String LEVEL_CURSOR_POS_6 = "LEVEL_CURSOR_POS_6";

    public static final int iLEVEL_CURSOR_NEG_6 = -6;
    public static final int iLEVEL_CURSOR_NEG_5 = -5;
    public static final int iLEVEL_CURSOR_NEG_4 = -4;
    public static final int iLEVEL_CURSOR_NEG_3 = -3;
    public static final int iLEVEL_CURSOR_NEG_2 = -2;
    public static final int iLEVEL_CURSOR_NEG_1 = -1;
    public static final int iLEVEL_CURSOR_POS_1 = 1;
    public static final int iLEVEL_CURSOR_POS_2 = 2;
    public static final int iLEVEL_CURSOR_POS_3 = 3;
    public static final int iLEVEL_CURSOR_POS_4 = 4;
    public static final int iLEVEL_CURSOR_POS_5 = 5;
    public static final int iLEVEL_CURSOR_POS_6 = 6;

    public static final String AFFECT_HISTORY_CURSOR = "AFFECT_HISTORY_CURSOR";
    public static final String EXTREME_LEVEL_CURSOR = "EXTREME_LEVEL_CURSOR";
}
