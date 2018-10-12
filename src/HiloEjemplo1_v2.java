
public class HiloEjemplo1_v2 extends Thread {
	
	//Propiedades
	private int c; //contador hilo
	private int hilo;
	
	//Constructor
	public HiloEjemplo1_v2 (int hilo) {
		this.hilo=hilo;
		System.out.println("Creando hilo: "+hilo);
	} //fin constructor
	
	//Método Run
	public void run() {
		c=0;
		while(c<=5) {
			System.out.println("Hilo: "+hilo + " Ck= "+c);
			c++;
		}
	}
}
