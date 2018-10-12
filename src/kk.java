import java.io.*;
public class kk {
	public static void main(String[] args){
	Runtime r=Runtime.getRuntime();
	String comando="CMD /C "; //comando a ejecutar
	Process p=null;

	InputStreamReader in=new InputStreamReader(System.in);
	BufferedReader brr= new BufferedReader(in);
	String cadena;
	
	try{
		System.out.println("Introduce una cadena por favor");
		cadena=brr.readLine();
		System.out.println("Cadena escrita es: "+cadena);
		in.close();
		p=r.exec(comando);
		//escritura - envio entrada a date
		OutputStream os=p.getOutputStream();
		os.write(cadena.getBytes());
		os.flush(); //vacio buffer
		
		//lectura - obtiene la salida de date
		InputStream is=p.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader (is));
		String linea;
		while ((linea=br.readLine())!=null)//lee una linea
			System.out.println(linea);
		br.close();
		} catch(Exception e) {
			System.out.println ("Error en "+comando);
			e.printStackTrace();
			}
		
	//comprobación de error 0 bien - 1 mal
	int exitVal;
	try {
		exitVal=p.waitFor();
		System.out.println("Valor de salida "+exitVal);
		} catch(InterruptedException e){
			e.printStackTrace();
			}
	
	
	}//fin main



}//fin ejemplo5