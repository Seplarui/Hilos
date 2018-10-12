
public class hiloTic extends Thread {
	
	private int x;
	private int i=0;
	
	hiloTic(int x) {
		this.x=x;
	}
	
	public void run() {
		while (i<=5) {
			System.out.println("TIC");
			i++;
		}
	}
	

}
