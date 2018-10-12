import java.lang.*;

public class UsaHilo_toString {
	
	public static void main(String[] args) {
		HiloEjemplo_Alive h=null;
		h=new HiloEjemplo_Alive(1);
		h.start();
		
		System.out.println("Información id hilo: "+ h.getId());
		System.out.println("Información hilo: "+h.toString());
	}

}
