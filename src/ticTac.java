import java.lang.*;
public class ticTac {

	public static void main(String[] args) {

		hiloTic hTic= new hiloTic(0);
		hTic.start();
		try {
			hTic.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		hiloTac hTac= new hiloTac(0);
		hTac.start();
	}

}
