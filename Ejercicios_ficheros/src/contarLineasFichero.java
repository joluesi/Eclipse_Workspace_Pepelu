
import java.io.*;


public class contarLineasFichero {
	
		   public static void main(String[] args) throws IOException {
		   File fichero = new File("/home/dam18-27/Documentos/Lenguaje_de_Marcas/Tema_3_CSS/estilos.css");
		   FileInputStream fic = new FileInputStream(fichero);   
		   
		   System.out.println("El número de líneas del fichero es: "+numLineas(fic));
		   System.out.println();
		   
		   fic.skip(-200);
		   leerLinea(fic);
	   
		   fic.close();
		  }
		   
		   public static int numLineas(FileInputStream fich) throws NumberFormatException, IOException{
			   	
				  int i;
				  int contador = 0;				  
				  				
					  while ((i = fich.read()) != -1){
					   if(i == 10){ 						  
						   contador++;						   
					   }
					}
				  return contador;
				  
			  }
		  
		  //implementar método en el que lea ficheros de texto por líneas(similar a si fuera con Buffer)
		  
		  public static String leerLinea(FileInputStream fich){
			  String linea = null;
			  int i;
			  try{				
				  while ((i = fich.read()) != -1)
				   if(i != 10 || i != 13){ // caracteres no imprimibles: 10 - salto de línea, 13 - retorno de carro
					   linea = ""+System.out.printf("%c", i);					  
				   }
				   else{
					   System.out.println();
				   }
			    fich.close();
			  }catch(IOException e){
				  e.printStackTrace();
			  }
			  return linea;
			  
		  }
		  
	}




