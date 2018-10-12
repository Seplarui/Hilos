import java.io.*;

public class Ejemplo3 {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		String comando = "tasklist /v";
		Process p = null;
		
		if(args.length<1) {
			System.out.println("Se necesita nombre de fichero...kk");
			System.exit(1);
		}
		
		try {
			//fichero al que se enviará la salida del programa Unsaludo
			
			FileOutputStream fos= new FileOutputStream(args[0]);
			PrintWriter pw= new PrintWriter(fos);
			
			//ejecuto comando
			p=r.exec(comando);
			
			//creo buffer
			InputStream is= p.getInputStream();
			BufferedReader br= new BufferedReader(new InputStreamReader(is));
			String linea;
			
			//leo linea a linea e imprimo en el fichero
			
			while((linea=br.readLine())!=null) {
				System.out.println("inserto en " +args[0]+" >"+linea);
				pw.println(linea);
			}
			br.close();
			pw.close();
			
		} catch (Exception ex)  {
			ex.printStackTrace();
		}
		
		int exitVal;
		try {
			exitVal=p.waitFor();
			System.out.println("Valor de salida "+exitVal);
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
