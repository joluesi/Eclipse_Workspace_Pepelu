

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
	public class Ej_2_LeerFichTextoBuf {
		
		static ArrayList<String> grupos = new ArrayList<String>();
		static ArrayList<String> alumnos = new ArrayList<String>();
		static ArrayList<Integer> num_alumnosxgrupo = new ArrayList<Integer>();
		
		static int i=0; //contador de alumnos-TOTALES
		
	  public static void main(String[] args) {
		  	  
	  try{
		  File fic = new File("nombres_alumnos.txt");//declara fichero
	      BufferedReader fichero = new BufferedReader(
	                       new FileReader(fic)); 
	      	     
	      String linea;     
	      //Bucle para rellenar el arrayList de grupos y almacenar los nombres de alumnos y grupos en los ArrayList
	      while((linea = fichero.readLine())!=null) 	 
	      {
	    	  String grupo = linea.substring(linea.length()-5, linea.length());
	    	  String alumno = linea.substring(7, linea.length()-12);
	    	  alumno = alumno + "#" + grupo;
	    	  //System.out.println(linea+" - "+alumno);
	    	  anadir_grupo_y_alumno(grupo, alumno);
	    	  i++;
	    	  
	      }
	      	      
	      fichero.close();
	      crear_ficheros(); //Crea los ficheros vacios
	      Collections.sort(alumnos); //ordeno los nombres
	      rellenar_ficheros(); //relleno los ficheros
	      crear_fichero_resumen();
	      
		}
		catch (FileNotFoundException fn ){                      
	               System.out.println("No se encuentra el fichero");}
		catch (IOException io) {
	               System.out.println("Error de E/S ");}
	               
	  } //FIN main()
	  
//###############################################################	 
private static void crear_fichero_resumen() throws IOException {
		// TODO Auto-generated method stub
	
for(int i=0; i<grupos.size(); i++){
		
		String grupo_leido=grupos.get(i);
		int num_alumnos = num_alumnosxgrupo.get(i);
		
		FileWriter  fich_resumen = new FileWriter("resumen.txt", true);
		BufferedWriter fout = new BufferedWriter(fich_resumen);
						
			try {
				//System.out.println(grupo_leido+" - "+num_alumnos);
				fout.write(grupo_leido+" - "+num_alumnos); //escribe una línea
			    fout.newLine(); //escribe un salto de línea
				fout.close();
							
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}	
FileWriter  fich_resumen = new FileWriter("resumen.txt", true);
BufferedWriter fout = new BufferedWriter(fich_resumen);
fout.write("TOTAL ALUMNOS = "+i+" alumnos."); //escribe una línea
fout.newLine(); //escribe un salto de línea
fout.close();
	}

//################################################################	  
private static void rellenar_ficheros() throws IOException {
		// TODO Auto-generated method stub
		
	for(int i=0; i<alumnos.size(); i++){
		
		String grupo_leido=alumnos.get(i).substring(alumnos.get(i).length()-5);
		String alumno_leido = alumnos.get(i).substring(0, alumnos.get(i).length()-6);
		
		FileWriter  fich_grupo = new FileWriter(grupo_leido+".txt", true);
		BufferedWriter fout = new BufferedWriter(fich_grupo);
						
			try {
				//System.out.println(alumno_leido+grupo_leido);
				fout.write(alumno_leido); //escribe una línea
			    fout.newLine(); //escribe un salto de línea
				fout.close();
							
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}
		
//################################################################
	  
	private static void crear_ficheros() throws IOException {
		// TODO Auto-generated method stub
		
		for(int i=0; i<grupos.size(); i++){
			File fileout=new File(grupos.get(i));
			if (!fileout.exists()){
				try {
					FileOutputStream fout =new FileOutputStream(fileout+".txt",true);
					fout.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			
		}
		
		
		
	}
	//################################################################
	private static void anadir_grupo_y_alumno(String grupo, String alumno) {
		// TODO Auto-generated method stub
		
		if (grupos.size()==0){ //La primera vez que inserto un nombre de alumno
			grupos.add(grupo);
			alumnos.add(alumno);
			num_alumnosxgrupo.add(1);
		} else {
			if (grupos.contains(grupo))	{
									alumnos.add(alumno);
									int posicion = grupos.indexOf(grupo);
									int alumnos_acumulados=num_alumnosxgrupo.get(posicion);
									num_alumnosxgrupo.set(posicion, alumnos_acumulados+1);
			}
			else {
				grupos.add(grupo);
				alumnos.add(alumno);
				num_alumnosxgrupo.add(1);
			}
		}
		
	}
	//################################################################	
	
	}// FIN clase
	
	
	

