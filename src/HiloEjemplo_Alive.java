
public class HiloEjemplo_Alive extends Thread {

	// Propiedades
	private int c;
	private int hilo;

	public HiloEjemplo_Alive(int hilo) {
		this.hilo = hilo;
		System.out.println("Creando Hilo: " + hilo);
	}

	public void run() {
		c = 0;
		while (c <= 5) {
			System.out.println("Hilo: " + hilo + " C= " + c);
			c++;
		}
	}

}
