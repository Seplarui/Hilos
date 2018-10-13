public class ticTac {
    public static void main(String[] args) {
        int i = 0;
        hiloTic hTic = null;
        hiloTac hTac = null;

        while (i <= 10) {
            hTic = new hiloTic(i);
            hTic.start();
            try {
                hTic.sleep(1000);
                hTac.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            hTac = new hiloTac(i);
            hTac.start();

            // i++;
        }
    }
}