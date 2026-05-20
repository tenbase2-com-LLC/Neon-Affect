package NeonAffect;

import aos.jack.util.cursor.Change;
import java.util.List;

public class _AffectRegulationIntervalCursor extends Change {

    private final AffectHistoryCursorVar r;
    private final int iStartLevel;
    private final int iEndLevel;
    private final String strCursorType;
    private final NeonAffectAgent agent1;
    private final boolean bDebug = true;

    public _AffectRegulationIntervalCursor(AffectHistoryCursorVar r, int iStartLevel,
            int iEndLevel, String strCursorType, NeonAffectAgent agent1) {
        super(r, false);
        this.r = r;
        this.iStartLevel = iStartLevel;
        this.iEndLevel = iEndLevel;
        this.strCursorType = CursorEnum.toString(strCursorType, iStartLevel, iEndLevel);
        this.agent1 = agent1;
        agent1.IncrementNumberOfCursors();
    }

    @Override
    public boolean condition() {
        boolean bStartLevelFound = false;
        boolean bEndLevelFound = false;

        if (bDebug) {
            System.out.println("Inside AffectRegulationIntervalCursor Condition StartLevel: "
                + iStartLevel + " EndLevel: " + iEndLevel);
        }

        List<AffectHistoryVar> items = r.GetItems();
        double dStartValue = 0d, dEndValue = 0d;
        long startTime = 0, endTime = 0;
        int iStartID = 0;

        for (var item : items) {
            if (item.GetLevel() == iStartLevel && !bEndLevelFound) {
                dStartValue = item.GetValue();
                startTime = item.GetTime();
                iStartID = item.GetID();
                bStartLevelFound = true;
            }

            if (item.GetLevel() == iEndLevel && item.GetID() != iStartID && bStartLevelFound) {
                dEndValue = item.GetValue();
                endTime = item.GetTime();
                bEndLevelFound = true;
            }

            if (bStartLevelFound && bEndLevelFound) {
                r.SetLevelVelocity((dEndValue - dStartValue) / (endTime - startTime));
                return true;
            }
        }

        agent1.SetCursorAck(strCursorType, iStartLevel, iEndLevel, false);
        return false;
    }

    public String GetCursorType() { return strCursorType; }
    public int GetStartLevel()    { return iStartLevel; }
    public int GetEndLevel()      { return iEndLevel; }
}
