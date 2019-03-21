/**
 * Aplicación para suma en paralelo multiproceso
 * llamada lanzadoFich <número inicial> <número final> <procesos>
 * 
 */

package ejecucionProcesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LanzadorFich {
	
	//Devuelve el contenido del fichero1 y fichero2 	
	public static long obtenerContenido(String fichero) throws IOException{
        long valor = 0;
        String datos;
        FileReader f = new FileReader(fichero);
        BufferedReader buffer = new BufferedReader(f);
        //while ((datos = buffer.readLine()) == null); 
        datos = buffer.readLine();
        buffer.close();
        valor = Long.parseLong(datos);
		return valor;
	}

	
	
	public static Process lanzarSumador(long n1, long n2, String fichero){
        String[] Parametros = {"java","Sumador",String.valueOf(n1), String.valueOf(n2)};
        ProcessBuilder pb = new ProcessBuilder(Parametros);
        Process p = null;
        System.out.println("Llamando "+Parametros[0]+" "+Parametros[1]+" "+Parametros[2]+" "+Parametros[3]+" ");
        try{
              pb.redirectOutput(new File(fichero));
              pb.redirectError(new File("errores.txt"));
              p = pb.start();
          }catch(Exception ex){
              ex.printStackTrace();
          }
        return p;
	}

	public static void main(String[] args){
		  int maxProcesos = 20;
		  
		  //arrays para los límites
		  long[] limiteIz = new long[maxProcesos];
		  long[] limiteDe = new long[maxProcesos];
		  
		  //Array para los nombres delos ficheros
		  String[] files = new String[maxProcesos];
		  
		  //Array para los procesos
		  Process[] p = new Process[maxProcesos];
		  
		  if(args.length < 3){
			  System.out.println("lanzadoFich <número inicial> <número final> <procesos>");
		  }
		  else{
			  
			  long minimo = Long.parseLong(args[0]);
			  long maximo = Long.parseLong(args[1]);
			  long maxPro = Long.parseLong(args[2]);
			  
			  long par = maxPro % 2;
			  if(par !=0){
				  System.out.println("El número de procesos debe ser par");
			  }
			  else{
				  int procesos = (int)maxPro;
				  long incremento = (maximo / maxPro) -1;
				  limiteIz[0] = minimo;
				  limiteDe[0] = minimo + incremento;
				  files[0] = "fich0.txt";
				  
				  for(int i=0; i<procesos; i++){
					  limiteIz[i] = limiteDe[i-1]+1;
					  limiteDe[i] = limiteIz[i] + incremento;
					  files[i] = "fich" +i +".txt";	  
				  }
				  //apaño para cuando número máximo no divisible entre proceso
				  limiteDe[procesos-1] = maximo;
				  //lanzar los procesos
				  for(int i=0; i<procesos; i++){
					  System.out.println("línea "+i +" "+limiteIz[i]+ " " + limiteDe[i]);
					  p[i] = lanzarSumador(limiteIz[i], limiteDe[i], files[i]);
				  }
				  
				  //esperamos que todos los procesos terminen
				  for(int i=0; i<procesos; i++){
					  try{
						  p[i].waitFor();
						  
					  }catch (InterruptedException e){
						  e.printStackTrace();
					  }
					  System.out.println("línea "+i +" "+limiteIz[i]+ " " + limiteDe[i]);
					  p[i] = lanzarSumador(limiteIz[i], limiteDe[i], files[i]);
				  }
				  
				  
				  
				  
				  /*
				  String f1 = "result1.txt";
				  String f2 = "result2.txt";
				  long n1=Long.parseLong(args[0]);
				  long n4=Long.parseLong(args[1]);
				  long n2=0;
				  long n3=0;
				  long r1=0;
				  long r2=0;
				  Process p1;
				  Process p2;
				  long result;
				  // calculo valores intermedios	 
				  n2 = n4 / 2;
				  n3 = n2 +1;
				  System.out.println("n1 --> "+n1);
				  System.out.println("n2 --> "+n2);
				  System.out.println("n3 --> "+n3);
				  System.out.println("n4 --> "+n4);
				  
				  //lanzo los procesos de suma
				  p1 = lanzarSumador(n1,n2,f1);
				  p2 = lanzarSumador(n3,n4,f2);
				  try{
					  p1.waitFor();
					  p2.waitFor();
				  }
				  catch (InterruptedException e){
					  e.printStackTrace();
				  }
				  try{
				  r1 = obtenerContenido(f1);
				  r2 = obtenerContenido(f2);
				  }catch(Exception ex){
					  ex.printStackTrace();
				  }
				  result = r1 + r2;
				  System.out.println("El resultado es: "+result);*/
			  }// end else par/impar
			  
		  }//end else
		  
		}
		
	}
