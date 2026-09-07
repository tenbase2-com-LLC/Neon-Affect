package NeonAffect;

public class AckVar {

    private final String strCursorType;
    private final int iLevel;
    private final int iStartLevel;
    private final int iEndLevel;
    private final boolean bValue;

    public AckVar(String strCursorType, int iLevel, int iStartLevel, int iEndLevel, boolean bValue) {
        this.strCursorType = strCursorType;
        this.iLevel = iLevel;
        this.iStartLevel = iStartLevel;
        this.iEndLevel = iEndLevel;
        this.bValue = bValue;
    }

    public String GetCursorType() { return strCursorType; }
    public int GetLevel()         { return iLevel; }
    public int GetStartLevel()    { return iStartLevel; }
    public int GetEndLevel()      { return iEndLevel; }
    public boolean GetValue()     { return bValue; }

    @Override
    public String toString() {
        return "\nAckVar: " + strCursorType
            + " Level: " + iLevel
            + " StartLevel: " + iStartLevel
            + " EndLevel: " + iEndLevel
            + " Value: " + bValue + "\n";
    }
}
