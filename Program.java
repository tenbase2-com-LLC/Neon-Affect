import NeonAffect.NeonAffectAgent;
import NeonAffect.AffectEnum;

public class Program {

    public static void main(String[] args) {
        try {
            long begTime = System.currentTimeMillis();

            var neonAgent = new NeonAffectAgent();
            neonAgent.PostInit();

            neonAgent.AddEmotionDirect(AffectEnum.RAGE);
            neonAgent.Wait(10.0);

            long elapsedTime = System.currentTimeMillis() - begTime;
            System.out.println("\nElapsed time: " + elapsedTime);

            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
