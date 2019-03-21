

import java.io.*;
public class VerInf_ej2 {
public static void main(String[] args) {

  		for(int i=0;i<args.length;i++){	
  			System.out.println("INFORMACIÓN SOBRE EL DIRECTORIO Y FICHEROS: \n"); 	
  				File f = new File(args[i]);  
  				File[] listaArchivos = f.listFiles();
  				System.out.printf("Tu Directorio es: %s, %n", f.getName());
  			
  				for(int j=0;j<listaArchivos.length;j++){
  					File f2 = listaArchivos[j];

  				if(f2.exists()){
  			        System.out.println("Nombre del fichero  : "+f2.getName());
  			        System.out.println("Ruta                : "+f2.getPath());
  			        System.out.println("Ruta absoluta       : "+f2.getAbsolutePath());
  			        System.out.println("Se puede leer       : "+f2.canRead());
  			        System.out.println("Se puede escribir   : "+f2.canWrite());
  			        System.out.println("Tamaño              : "+f2.length());
  					System.out.println("Es un directorio    : "+f2.isDirectory()); 
  					System.out.println("Es un fichero       : "+f2.isFile());
  					System.out.println("Nombre del directorio padre: "+f.getParent() +"\n \n");
  				}
  			  }
  			}
  			
  		}

}

