import java.lang.*;

public class UsaHilo_Alive {

	public static void main(String[] args) {
		
		HiloEjemplo_Alive h= null;
		h=new HiloEjemplo_Alive(1);
		
		System.out.println("Antes llamada a start");
		System.out.println("Is Alive? " +h.isAlive() );
		System.out.println("State: "+ h.getState());
		System.out.println("Llamo a start");
		h.start();
		
		System.out.println("State: "+ h.getState());
		System.out.println("Is Alive? "+h.isAlive());
		
		try {
			h.join();
			
		} catch (Exception ex) {
			System.out.println("Tras finalizar hilo");
			System.out.println("State: "+h.getState());
			System.out.println("Is alive? = "+ h.isAlive());
		}

		
		
	}

}
