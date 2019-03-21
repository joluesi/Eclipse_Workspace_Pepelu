

import java.io.File;

public class VerInf_ej4 {
	public static void main(String[] args){
		if(args.length == 2){
			File f4 = new File(args[0]);
			int tamañoFile=Integer.parseInt(args[1]);
			
			if(f4.exists() && tamañoFile>100){
			        System.out.println("Nombre del fichero  : "+f4.getName());
			        System.out.println("Ruta                : "+f4.getPath());
			        System.out.println("Ruta absoluta       : "+f4.getAbsolutePath());
			        System.out.println("Se puede leer       : "+f4.canRead());
			        System.out.println("Se puede escribir   : "+f4.canWrite());
			        System.out.println("Tamaño              : "+f4.length());
					System.out.println("Es un directorio    : "+f4.isDirectory()); 
					System.out.println("Es un fichero       : "+f4.isFile());
					System.out.println("Nombre del directorio padre: "+f4.getParent() +"\n \n");
				}
		}
	}

}
