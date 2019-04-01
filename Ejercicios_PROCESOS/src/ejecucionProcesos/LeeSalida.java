package ejecucionProcesos;

import java.util.*;
import java.io.*;

public class LeeSalida {
	// hace todo con el exec
	public static void main(String[] args) throws IOException{
		
		String comando = "ls";		
		String[] parametros = {"ls", "-l"};	
		
		//creamos un objeto runtime de la aplicación
		Runtime r = Runtime.getRuntime();
		//creo variable de tipo proceso
		Process p = null;
		try{
			//llamo a la funcionalidad del proceso "ejecuta" y me devuelve un objeto proceso, asociado al proceso que acabo de lanzar (variable p)
			p = r.exec(comando);
			//creo variable y la enlazo con su salida estándar
			InputStream entrada = p.getInputStream();
			//creo objeto de tipo InputStreamReader y lo paso a un bufferedReader, para enlazarlo con la salida estandar
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			
			String linea;
			while ((linea = buffer.readLine()) != null){
				System.out.println(linea);
				
			}// end-while
			buffer.close();
		}catch (Exception ex){
			ex.printStackTrace();			
		}
		int resultExe;
		try{
			resultExe = p.waitFor();
			System.out.println("El comando se ha ejecutado: " +resultExe);
		}catch(Exception ex){
			ex.printStackTrace();
			
		}
	}

}
