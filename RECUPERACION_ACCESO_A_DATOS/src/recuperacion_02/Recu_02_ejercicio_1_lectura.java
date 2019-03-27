package recuperacion_02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Recu_02_ejercicio_1_lectura {
	
	public static void main(String[] args) throws IOException {    
		File fichero = new File("FichAlumno.dat");
		DataInputStream dataIS = new DataInputStream(new FileInputStream(fichero));

	   String DNI;
	   String apellidos;
	   String nombre;
	   int turno;

	   try {
	    while (true) {
	        DNI = dataIS.readUTF(); //recupera el DNI
	        apellidos = dataIS.readUTF(); //recupera los apelllidos
	        nombre =  dataIS.readUTF(); //recupera los nombres
	        turno = dataIS.readInt(); //recupera los turnos
	        System.out.println("DNI: " + DNI + ", apellidos: " + apellidos + ", nombre: " + nombre + ", turno: " + turno);        
	    }
	    }catch (EOFException eo) {}
		
	   dataIS.close();  //cerrar stream   
	  }
}