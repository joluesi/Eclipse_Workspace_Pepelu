
import java.io.*;
import java.util.regex.Pattern;
public class LeerFichBytes {
  public static void main(String[] args) throws IOException {
      
	if (!hay_errores_en_argumentos(args)){
	  
   	try {
   		File fichero_lectura = new File(args[0]); 
		FileInputStream fic = new FileInputStream(fichero_lectura);
		
		if (args[1].equalsIgnoreCase("-e")) encriptar(fichero_lectura);
		if (args[1].equalsIgnoreCase("-d")) desencriptar(fichero_lectura);
		    
	} catch (FileNotFoundException e)
	{
		System.out.print("El fichero a leer no existe o la ruta es incorrecta.");
	}
	}
  } // FIN main()
//####################################################################
  
  public static boolean hay_errores_en_argumentos(String[] args){
	boolean comprobacion=true;
	
//	System.out.println(Pattern.matches(".*.txt", (args[0].toLowerCase())));
//	System.out.println(Pattern.matches(".*.txt", (args[0].toLowerCase())));
	
	  if (args.length!=2) System.out.println("El nº de argumentos es incorrecto");
	  else {
	  if ((args[1].equalsIgnoreCase("-e")) && (Pattern.matches(".*.txt", (args[0].toLowerCase()))))
	  {
		  comprobacion=false;
	  } else{ 
		  if ((args[1].equalsIgnoreCase("-d")) && (Pattern.matches(".*.cod", (args[0].toLowerCase()))))
		  {
			  comprobacion=false;
		  } else{
			  	System.out.println("La extensión del fichero a utilizar o la operación a realizar es incorrecta");
		  }
	  }
	  }
		
	  return comprobacion;
	  
	  
  }// FIN comprobar_argumentos()
  
//####################################################################
    
  public static void encriptar(File fic) throws IOException{
  
  
  String fichero_salida= fic.getAbsolutePath();
  
  fichero_salida=fichero_salida.substring(0,fichero_salida.length()-3)+"cod";
  
  File file_salida=new File(fichero_salida);
  FileOutputStream fileout = new FileOutputStream(file_salida,false);   //inicializo FileOutputStream con false para que machaque fichero si existiera.
  FileInputStream filein = new FileInputStream(fic);   
  
  int i;

  while ((i = filein.read()) != -1)
      fileout.write(i+7); //escribe datos en el flujo de salida 	  
  
  fileout.close(); //cerrar stream de salida   
  
  
  System.out.println((fic.getName() + " Encriptado al fichero; "+fichero_salida));	
	
	
  
  } // FIN encriptar
  
//####################################################################
  
  public static void desencriptar(File fic) throws IOException{
	 
	  String fichero_salida= fic.getAbsolutePath();
	  
	  fichero_salida=fichero_salida.substring(0,fichero_salida.length()-3)+"dec";
	  
	  File file_salida=new File(fichero_salida);
	  FileOutputStream fileout = new FileOutputStream(file_salida,false);   
	  FileInputStream filein = new FileInputStream(fic);   
	  
	  int i;

	  while ((i = filein.read()) != -1)
	      fileout.write(i-7); //escribe datos en el flujo de salida 	  
	  
	  fileout.close(); //cerrar stream de salida   
	  
	  
	  System.out.println((fic.getName() + " recuperado al fichero; "+fichero_salida));	
		
	  
	  
	  } // FIN desencriptar  
  
  
  
  
  
} /// FIN CLASE