
public class UsaHilo_Sleep {

	public static void main(String[] args) {

		HiloEjemplo_Alive h = null;
		h = new HiloEjemplo_Alive(1);
		h.start();

		try {
			h.sleep(4000);
		} catch (InterruptedException e) {

		}
	}

}
