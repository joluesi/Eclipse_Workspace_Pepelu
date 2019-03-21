import java.io.*;

public class leerFicheroBytes {

	  public static void main(String[] args) throws IOException {
	   File fichero = new File("/home/dam18-27/Documentos/Lenguaje_de_Marcas/Tema_2_HTML_XHTML/ejercicio_proyectos/Ejercicio_14/formulario_14.html");
	   FileInputStream fic = new FileInputStream(fichero);    
	   int i;
		
	   while ((i = fic.read()) != -1)
		   //para que salga como caracteres
		    System.out.printf("%c", i);
		   //así saldría en formato numérico
	   		//System.out.printf("%c", i);
	    fic.close();    
	  }
 
}

