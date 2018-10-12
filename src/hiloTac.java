public class hiloTac extends Thread {
	
	private int y;
	private int j=0;
	
	hiloTac(int y) {
		this.y=y;
	}
	
	public void run() {
		while (j<=5) {
			System.out.println("TAC");
			j++;
		}
	}
	

}