
import java.io.*;
public class LeerFichTextoBuf {
  public static void main(String[] args) {
  try{
	  File fic = new File("/home/dam18-27/Documentos/Lenguaje_de_Marcas/Tema_3_CSS/estilos.css");//declara fichero
      BufferedReader fichero = new BufferedReader(
                       new FileReader(fic)); 
      
      String linea; 
      while((linea = fichero.readLine())!=null) 	 
        System.out.println(linea);     
      fichero.close(); 
	}
	catch (FileNotFoundException fn ){                      
               System.out.println("No se encuentra el fichero");}
	catch (IOException io) {
               System.out.println("Error de E/S ");}
               
  }
}