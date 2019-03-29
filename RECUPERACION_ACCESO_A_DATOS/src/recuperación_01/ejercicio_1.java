package recuperación_01;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ejercicio_1 {
	public static void main(String[] args) throws IOException {
		String dir = "C:\\Users\\joseluis\\Documents\\DAM_IES_CIERVA\\Acceso_a_Datos";
		File f = new File(dir);		
		String[] archivos = f.list(); // devuelve lista de archivos de la carpeta representada en el objeto File
		System.out.printf("Elementos en la ruta seleccionada: %d %n", archivos.length);
		int totalDir = 0;
		int totalFich = 0;		
		for (int i = 0; i < archivos.length; i++) {
			File f2 = new File(f, archivos[i]);
			System.out.printf("Nombre: %s, es un fichero?: %b, es un directorio?: %b %n", archivos[i], f2.isFile(), f2.isDirectory());				
				if (f2.isFile()) {
					totalFich += 1;
				}
				else if (f2.isDirectory())  {
					totalDir += 1;
				}				
	
		}		
		System.out.println("Total Directorios: "+totalDir);
		System.out.println("Total Ficheros: "+totalFich);
		System.out.println();
				
		PrintWriter fsalida = new PrintWriter(dir+"\\fsalida.txt");
		File[] Files_archivos = f.listFiles();
		
		System.out.println("Ficheros con extesión 'txt':");
		for (int i = 0; i < Files_archivos.length; i++) {
			//File f2 = new File(f, archivos[i]);
			//if (f2.getName().contains(".txt")) {			
                     
			if (Files_archivos[i].getName().contains(".txt")) {
				System.out.printf("Nombre del fichero: %s %n", archivos[i]);				
			//System.out.printf("Nombre: %s, es fichero?: %b, es directorio?: %b %n", archivos[i], f2.isFile(),
					//f2.isDirectory());
			FileReader fic = new FileReader(Files_archivos[i]); //crear el flujo de entrada 
			int j;
			while ((j = fic.read()) != -1) //se va leyendo un carácter
					    //  System.out.println( (char) j + "==>"+ j);
			{  
				System.out.printf("%c", (char) j);
			      fsalida.printf("%c", (char) j);
			}
			
			//}
		//}
		fsalida.close();
	}
		 
}
}
}

