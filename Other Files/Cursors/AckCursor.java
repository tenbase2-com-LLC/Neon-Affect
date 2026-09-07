package NeonAffect;

import aos.jack.util.cursor.Change;

public class AckCursor extends Change {

    private final AckCursorVar c;
    private final int iNumberOfItems;
    private final boolean bDebug = true;

    public AckCursor(AckCursorVar c, int iNumberOfItems) {
        super(c, true);
        this.c = c;
        this.iNumberOfItems = iNumberOfItems;
    }

    @Override
    public boolean condition() {
        boolean bRet = (c.GetValue() == iNumberOfItems);

        if (bDebug) {
            System.out.println("Inside AckCursor Condition: Items added: " + c.GetValue()
                + " Number of Items: " + iNumberOfItems + " bRet: " + bRet);
        }

        return bRet;
    }

    public void ClearVars() {
        c.ClearVar();
    }
}
