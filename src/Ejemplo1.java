
public class Ejemplo1 {

	public static void main(String[] args) {

		Runtime r= Runtime.getRuntime();
		String comando= "dir";
		Process p;
		
		try {
			p=r.exec(comando);
		} catch(Exception e) {
			System.out.println("Error en comando: "+comando);
			e.printStackTrace();
		}
	}

}
