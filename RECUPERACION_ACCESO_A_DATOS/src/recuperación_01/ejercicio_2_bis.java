package recuperación_01;

import java.io.File;

public class ejercicio_2_bis {

	public static File directorio = new File("/home/dam18-27/Documentos/Lenguaje_de_Marcas");

	public static void main(String args[]) {
		/*System.out.printf("El tamaño del directorio PADRE %s es: %d = %.1f Kbytes = %.2f MBytes", directorio,
				tamanodir(directorio), (float) tamanodir(directorio) / 1024,
				(float) ((tamanodir(directorio) / 1024.0) / 1024.0));
			*/
		
		long tamañototal = 0;	// ideintifican el tamaño de directorio más grnade encontrado
		String Dir_maximo = ""; // identificaré el directorio que más ocupa a nivel de "nombre"
		long FILE_tamañototal = 0;   //
		String FILE_maximo = ""; // identificaré el fichero que más ocupa a nivel de "nombre"
		
		long tamaño_elemento = 0;
		File[] listaArchivos = directorio.listFiles();
		for (int i = 0; i < listaArchivos.length; i++) {
			if (listaArchivos[i].isDirectory()) {				
				//tamañototal = tamañototal + 4096 + tamanodir(listaArchivos[i]);				
				tamaño_elemento = tamanodir(listaArchivos[i]);
				if (tamaño_elemento > tamañototal) {
					tamañototal = tamaño_elemento;
					Dir_maximo = listaArchivos[i].getName();
				}
	
			}
			
			else {
				tamaño_elemento = listaArchivos[i].length();
				if (tamaño_elemento > FILE_tamañototal) {
					FILE_tamañototal = tamaño_elemento;
					FILE_maximo = listaArchivos[i].getName();
				}
				
			}
		}
		System.out.println();
		System.out.printf("El mayor de los subdirectorios es: %s, con un tamaño de: %.2f MBytes", Dir_maximo, (float) ((tamañototal/1024.0)/1024.0));
		System.out.println();
		System.out.printf("El mayor de los archivos es: %s, con un tamaño de: %.1f MBytes", FILE_maximo, (float) ((FILE_tamañototal/1024.0)/1024.0));
		
		
	}// fin MAIN

	// ####################################

	public static long tamanodir(File directorio) {
		File[] listaArchivos = directorio.listFiles();
		long tamañototal = 0;
		for (int i = 0; i < listaArchivos.length; i++) {
			if (listaArchivos[i].isDirectory()) {
				tamañototal = tamañototal + 4096 + tamanodir(listaArchivos[i]);
				
			} 
			else {
				tamañototal = tamañototal + listaArchivos[i].length();
			}

		}
		return tamañototal;

	}// FIN tamanodir

}// FIN clase