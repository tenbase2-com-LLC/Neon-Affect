package NeonAffect;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class AckCursorVar extends Observable {

    private Map<String, AckVar> cursorAcks;
    private final Object lock = new Object();
    private final boolean bDebug = true;

    public AckCursorVar(Map<String, AckVar> cursorAcks) {
        this.cursorAcks = cursorAcks;
    }

    public void SetAck(String strAckType, AckVar ackVar) {
        synchronized (lock) {
            if (bDebug) {
                System.out.println("Inside AckCursorVar: SetAck: Type: [" + strAckType + "] Value: " + ackVar.GetValue());
            }

            cursorAcks.put(strAckType, ackVar);

            setChanged();
            notifyObservers();
        }
    }

    public int GetValue() {
        return cursorAcks.size();
    }

    public void ClearVar() {
        cursorAcks = new HashMap<>();
    }
}
