public class ticTac {
	public static void main(String[] args) {
		int i = 0;
		hiloTic hTic = null;
		hiloTac hTac = null;

		while (i == 0) {

			hiloTic h1 = new hiloTic(1);
			
			try 
			{
				h1.sleep(1000);
				h1.start();
			} catch (InterruptedException ex) {
				
			}
			

			hiloTac h2 = new hiloTac(2);
			try {
				h2.sleep(1000);
				h2.start();
			} catch (InterruptedException ex) {
				
			}
			
			
		}
	}
}