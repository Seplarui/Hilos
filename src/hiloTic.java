
public class hiloTic extends Thread {
	
	public void run() {
		
		int i=0;
		System.out.println("Dentro del hilo TIC: "+this.getName());
		
		while(i<1) {
			System.out.println("TIC");
		}
	}
	

}
