package NeonAffect;

public class AffectHistoryVar {

    private final int iID;
    private final int iLevel;
    private final int iType;
    private final double dValue;
    private final long time;

    public AffectHistoryVar() {
        this(0, 0, 0, 0d, 0L);
    }

    public AffectHistoryVar(int iID, int iLevel, int iType, double dValue, long time) {
        this.iID = iID;
        this.iLevel = iLevel;
        this.iType = iType;
        this.dValue = dValue;
        this.time = time;
    }

    public int GetID()       { return iID; }
    public int GetLevel()    { return iLevel; }
    public int GetType()     { return iType; }
    public double GetValue() { return dValue; }
    public long GetTime()    { return time; }
}
