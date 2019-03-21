import java.io.File;


public class Borrar_dirA {
	
	public static void main(String[] args){
		walkin(new File("/home/dam18-27/Documentos/pruebas"));
	}
	
	public static void walkin(File dir){
		
		File listFile[]=dir.listFiles();
		if(listFile != null){
			for(int i=0; i<listFile.length; i++){
				if(listFile[i].isFile()){
					System.out.println("Archivo: "+listFile[i].getPath());
					walkin(listFile[i]);
					
				}
				else{
					System.out.println("Es directorio");
				}
			}
		}
	}

}
