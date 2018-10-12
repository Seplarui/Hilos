import java.util.Scanner;

public class casiBash {

	public static void main(String[] args) {

		Scanner cadena= new Scanner(System.in);
		String comando="";
		Runtime r= Runtime.getRuntime();
		Process p;
		
		try {
			System.out.println("Introduce comando por favor");
			comando=cadena.nextLine();
			p=r.exec(comando);
		} catch(Exception e) {
			System.out.println("Error en comando: "+comando);
			e.printStackTrace();
		}
	
	}

}
