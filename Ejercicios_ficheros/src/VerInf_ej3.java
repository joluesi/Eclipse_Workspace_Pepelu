
import java.io.File;

public class VerInf_ej3 {
	public static void main(String[] args){
		if(args.length == 2){
			File f3 = new File(args[0]);
			int tamañoFile=Integer.parseInt(args[1]);
			
			if(f3.exists() && f3.length()<tamañoFile){
				System.out.println("Nombre del fichero  : "+f3.getName());		        
		        System.out.println("Tamaño              : "+f3.length());				
				System.out.println("Nombre del directorio padre: "+f3.getParent());
					
				}
			
		}
	}

}
