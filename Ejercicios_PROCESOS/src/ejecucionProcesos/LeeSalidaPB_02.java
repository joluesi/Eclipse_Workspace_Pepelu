package ejecucionProcesos;


import java.util.*;
import java.io.*;

public class LeeSalidaPB_02 {
	// hace todo con el ProcessBuilder
	public static void main(String[] args) throws IOException{
				
		String[] parametros = {"bin/bash"};	
		
		//creamos un objeto ProcessBuilder de la aplicación
		ProcessBuilder pb = new ProcessBuilder(parametros);
		File fout = new File("salida.txt");
		File ferr = new File("error.txt");
		File finp = new File("comando.txt");
		pb.redirectOutput(fout);
		pb.redirectError(ferr);
		pb.redirectInput(finp);
		//creo variable de tipo proceso
		Process p = null;
		try{
			//llamo a la funcionalidad del proceso "start" y me devuelve un objeto proceso, asociado al proceso que acabo de lanzar (variable p)
			p = pb.start();
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
