package recuperación_01_codigo_base;

import java.io.File;

public class TotalDirectorio {
      
    public static File directorio = new File("C:\\Users\\joseluis\\Documents\\DAM_IES_CIERVA\\Acceso_a_Datos");
    
    public static void main(String args[]){
     System.out.printf("El tamaño del directorio %s es: %d = %.1f Kbytes = %.2f MBytes", directorio, tamanodir(directorio), (float) tamanodir(directorio)/1024, (float) ((tamanodir(directorio)/1024)/1024));
    }// fin MAIN
    	
    
    //####################################
    
    public static long tamanodir(File directorio){
        File[] listaArchivos=directorio.listFiles();
        long tamañototal=0; 
        for(int i=0; i<listaArchivos.length; i++){
                   	if (listaArchivos[i].isDirectory()) {
        		 tamañototal = tamañototal + 4096 + tamanodir(listaArchivos[i]);
                 }
                   	else{
                tamañototal = tamañototal + listaArchivos[i].length();
            }
                   	
        }
		return tamañototal;
       
    }// FIN tamanodir
    
}//  FIN clase