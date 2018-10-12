import java.io.*;

public class Ejemplo6 {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		String comando = "CMD /C";
		String cadena="";
//		BufferedReader br= new BufferedReader(in);
		Process p = null;
		
		
		
		try {
			p=r.exec(comando);
			
			//Introducir cadena
			System.out.println("Introduce una cadena por favor");
//			cadena=br.readLine();
			
			InputStreamReader in= new InputStreamReader(System.in);
			
			
			OutputStream os= p.getOutputStream();
			os.write(cadena.getBytes());
			os.flush();
			
			InputStream is=p.getInputStream();
			BufferedReader brr=new BufferedReader(new InputStreamReader(is));
			while ((cadena=brr.readLine())!=null) {
				System.out.println(cadena);
				brr.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
