package recuperación_01;

import java.io.File;

public class ejercicio_2 {

	public static File directorio = new File("C:\\Users\\joseluis\\Documents\\DAM_IES_CIERVA\\Acceso_a_Datos");

	public static void main(String args[]) {
		System.out.printf("El tamaño del directorio PADRE %s es: %d = %.1f Kbytes = %.2f MBytes", directorio,
				tamanodir(directorio), (float) tamanodir(directorio) / 1024,
				(float) ((tamanodir(directorio) / 1024.0) / 1024.0));
				
		long tamañototal = 0;
		File[] listaArchivos = directorio.listFiles();
		for (int i = 0; i < listaArchivos.length; i++) {
			if (listaArchivos[i].isDirectory()) {				
				tamañototal = tamañototal + 4096 + tamanodir(listaArchivos[i]);				
				
			}
		}
		System.out.println();
		System.out.printf("El tamaño total de los subdirectorios es: %.2f MBytes", ((float) tamañototal / 1024.0) / 1024.0);
		
		
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