package recuperación_01_codigo_base;

import java.io.*;

public class ej_1 {
	public static void main(String[] args) throws IOException {
		String dir = "C:\\Users\\joseluis\\Documents\\DAM_IES_CIERVA\\Acceso_a_Datos";
		File f = new File(dir);
		PrintWriter fsalida = new PrintWriter(dir+"\\fsalida2.txt");
		String[] archivos = f.list();
		File[] Files_archivos = f.listFiles();
		System.out.printf("Ficheros en el directorio actual: %d %n", archivos.length);
		for (int i = 0; i < Files_archivos.length; i++) {
			File f2 = new File(f, archivos[i]);
			if (f2.getName().contains(".txt")) {
                     
			if (Files_archivos[i].getName().contains(".txt")) {
			System.out.printf("Nombre: %s, es fichero?: %b, es directorio?: %b %n", archivos[i], f2.isFile(),
					f2.isDirectory());
			FileReader fic = new FileReader(Files_archivos[i]); //crear el flujo de entrada 
			int j;
			while ((j = fic.read()) != -1) //se va leyendo un carácter
					    //  System.out.println( (char) j + "==>"+ j);
			{  
				System.out.printf("%c", (char) j);
			      fsalida.printf("%c", (char) j);
			}
			
			}
		}
		fsalida.close();
	}
	
	}
}
