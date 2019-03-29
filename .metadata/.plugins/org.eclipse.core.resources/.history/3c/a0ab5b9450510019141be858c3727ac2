package recuperación_01;

import java.io.File;
import java.util.GregorianCalendar;

public class ejercicio_3 {
	
	public static void main(String[] args){
		
		File directorio = new File("/home/dam18-27/workspace_pepelu/AaD_Ejemplos_Libro_Tema_1");		
		
		
		GregorianCalendar fecha = new GregorianCalendar(2000, 0, 1, 0, 0,0);
		
		long ms = fecha.getTimeInMillis();
		
		cambiarFecha(directorio, ms);
	
	}
	
	public static void cambiarFecha(File directorio, long ms){
        File[] listaArchivos=directorio.listFiles();
        
        for(int i=0; i<listaArchivos.length; i++){
                   	if (listaArchivos[i].isDirectory()) {
                   		cambiarFecha(listaArchivos[i], ms);
        		 
                 }
                   	else{
                   		listaArchivos[i].setLastModified(ms);
            }
                   	
        }
		
       
    }// FIN tamanodir

}
