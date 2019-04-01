package ejecucionProcesos;


import java.util.*;
import java.io.*;

public class LeeSalidaPB {
	// hace todo con el ProcessBuilder
	public static void main(String[] args) throws IOException{
		
		//definimos un array de caracteres que le vamos a pasar		
		String[] parametros = {"ls", "-l", "/home/dam18-27/Documentos/workspace_pepelu/Ejercicios_PROCESOS/src/ejecucionProcesos"};	
		
		//creamos un objeto ProcessBuilder de la aplicación
		ProcessBuilder pb = new ProcessBuilder(parametros);
		//creo variable de tipo proceso
		Process pr = null;
		try{
			/* llamo a la funcionalidad del proceso "start" y me devuelve un objeto proceso (lo ejecuto), 
			 * asociado al proceso que acabo de lanzar (variable pr)			 
			 */
			pr = pb.start();
			//creo variable y la enlazo con su salida estándar InputStream
			InputStream entrada = pr.getInputStream();
			//creo objeto de tipo InputStreamReader y lo paso a un bufferedReader, para enlazarlo con la salida estandar InputStream
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			
			
			/*
			 * Otra opción para no crear variable intermedia "entrada"
			 * BufferedReader buffer = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			 */
			
			String linea;
			while ((linea = buffer.readLine()) != null){
				System.out.println(linea);
				
			}// end-while
			buffer.close();
		}catch (Exception ex){
			ex.printStackTrace();			
		}
		// Variable para guardar lo que devuelve el valor del proceso (0, 1, 2 ...)
		int resultExe;
		try{
			resultExe = pr.waitFor();
			System.out.println("El comando se ha ejecutado: " +resultExe);
		}catch(Exception ex){
			ex.printStackTrace();
			
		}
	}

}
