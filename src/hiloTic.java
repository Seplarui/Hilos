public class hiloTic extends Thread {
    private int c;
    private int hilo;

    //Constructor

    public hiloTic(int hilo) {
        this.hilo=hilo;
        //System.out.println("TIC");
    }

    public void run() {
        System.out.println("TIC");
    }

}