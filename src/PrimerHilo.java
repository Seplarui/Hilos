
public class PrimerHilo extends Thread {
	
	//propiedades clase
	private int x;
	
	//constructor clase
	PrimerHilo(int x) {
		this.x=x;
	}
	
	//método ejecución run
	public void run() {
		for (int i=0;i<x;i++ ) {
			System.out.println("En el hilo...");
		}
	}
	
	

	public static void main(String[] args) {
		
		PrimerHilo p= new PrimerHilo(1000);
		p.start();
		
		

		
		
	}

}
