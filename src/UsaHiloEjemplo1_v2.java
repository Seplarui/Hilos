
public class UsaHiloEjemplo1_v2 {

	public static void main(String[] args) {

		HiloEjemplo1_v2 h=null;
		
		for (int i=0;i<3;i++) {
			h=new HiloEjemplo1_v2(i+1); //creo hilo
			h.start();
			
			System.out.println("Status= "+h.isAlive());
		}
		System.out.println("3 hilos creados...");
	}
}
