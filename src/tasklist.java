import java.io.*;

public class tasklist {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		String comando = "tasklist /v";
		Process p = null;
		
		if(args.length<1) {
			System.out.println("Introduce un nombre de fichero por favor.");
			System.exit(1);
		}
		
		try {
			FileOutputStream fos= new FileOutputStream(args[0]);
			PrintWriter pw= new PrintWriter(fos);
			
			p= r.exec(comando);
			InputStream is= p.getInputStream();
			BufferedReader br= new BufferedReader(new InputStreamReader(is));
			String linea;
			
			while ((linea=br.readLine())!=null) {
				System.out.println("Insert en "+ args[0]+" > "+linea);
				pw.println(linea);
			}
			br.close();
			pw.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}

	}
}
