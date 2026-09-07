package NeonAffect;

public class AffectRegulationIntervalCursor extends _AffectRegulationIntervalCursor {

    public AffectRegulationIntervalCursor(AffectHistoryCursorVar r, int iStartLevel, int iEndLevel, NeonAffectAgent agent) {
        super(r, iStartLevel, iEndLevel, CursorEnum.AFFECT_HISTORY_CURSOR, agent);
    }
}
