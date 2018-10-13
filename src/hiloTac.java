public class hiloTac extends Thread {
    private int c;
    private int hilo;

    //Constructor

    public hiloTac(int hilo) {
        this.hilo=hilo;
        //System.out.println("TIC");
    }

    public void run() {
        System.out.println("TAC");
    }

}