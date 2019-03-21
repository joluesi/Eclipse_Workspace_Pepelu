import java.io.File;


public class Recursividad_Archivos {
	
	public static void main(String[] args){
		walkin(new File("/home/dam18-27/Documentos/Lenguaje_de_Marcas"));
	}
	
	public static void walkin(File dir){
		
		File listFile[]=dir.listFiles();
		if(listFile != null){
			for(int i=0; i<listFile.length; i++){
				if(listFile[i].isDirectory()){
					System.out.println("Es Directorio: "+listFile[i].getPath());
					walkin(listFile[i]);					
				}
				else{
					System.out.println("Archivo: "+listFile[i].getPath());
				}
			}
		}
	}
	
	

}
