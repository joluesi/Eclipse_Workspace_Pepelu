
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class VerDir {
	
	public static int n_archivos=0;
	public static int n_carpetas=0;
	private static String path;
	
	public static void main(String[] args) {
		String dir = "";
		
		System.out.println("Introduzca la ruta de directorio: ");
		Scanner Entrada_Teclado = new Scanner(System.in);
		dir = Entrada_Teclado.nextLine();
		
		try {
		
		File f = new File(dir);
		File[] archivos = f.listFiles();
		
		mostrar_directorio(dir, archivos);
		}
		catch (Exception e)
		{System.out.println("Error al tratar ese directorio");}
		
		
	}  // FIN main()
	
//################################################################

	private static void mostrar_directorio(String dir, File[] archivos)
	{
	System.out.printf("Elementos en el directorio actual (%s)= %d %n", dir, archivos.length);
	System.out.printf("===========================================================%n%n", dir, archivos.length);
	for (int i = 0; i < archivos.length; i++) {
		File f2 = archivos[i];
		n_archivos=0;
		n_carpetas=0;
		if (f2.isDirectory()) 		
			try {
					System.out.printf("Nombre DIRECTORIO: %s --> Tamaño: %.4f KBytes, n_archivos= %d, n_carpetas= %d%n", archivos[i], folderSize(f2.getAbsolutePath())/1024, n_archivos, n_carpetas);
			} catch (Exception e){
	    System.out.printf("Nombre DIRECTORIO: %s --> NO TENGO PERMISOS DE LECTURA%n", archivos[i]);
			}
					
		else
		{
			try {
			
			float tamanio= f2.length()+0;
			tamanio=tamanio/1024;
			System.out.printf("%n     Nombre Fichero   :  %s --> Tamaño: %.4f KBytes%n%n", archivos[i], tamanio);
			} catch (Exception e){
			    System.out.printf("Nombre FICHERO: %s --> NO TENGO PERMISOS DE LECTURA%n", archivos[i]);
					}
		}		
	
	}
	}
// #######################################################
			
	public static float folderSize(String path) { 
	      	           
	      float length = 0; 
	      File directory=new File(path);
	      
	      for (File file : directory.listFiles()) { 
	       if (file.isFile()) {
	    	   n_archivos++;
	    	   length += file.length();
	       }
	       else {
	    	   n_carpetas++;
	    	   length += (4096 *3 ) + folderSize(file.getAbsolutePath());
	       }
	      } 
	      return length; 
	   }
	
	
	
}

// ("D:\\ADAT-1314\\UNI1\\Departamentos.dat");
// ("C:\\Program Files");
// ( "D:\\ADAT-1314\\UNI1");
/*
 * System.out.println("�Se puede leer ?"+f.canRead()); System.out.println(
 * "�Se puede escribir ?"+f.canWrite()); System.out.println(
 * "Nombre del fichero : "+f.getName()); System.out.println(
 * "Ruta               : "+f.getPath()); System.out.println(
 * "Ruta absoluta      : "+f.getAbsolutePath()); System.out.println(
 * "Tama�o             : "+f.length()); System.out.println(
 * "Es un directorio   : "+f.isDirectory()); System.out.println(
 * "Es un fichero      : "+f.isFile()); System.out.println(
 * "Directorio padre   : "+f.getParent());
 * 
 * 
 * 
 */
