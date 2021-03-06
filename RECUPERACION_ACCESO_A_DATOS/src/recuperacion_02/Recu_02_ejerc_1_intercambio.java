package recuperacion_02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Recu_02_ejerc_1_intercambio {

	public static void main(String[] args) throws IOException {
		File ficheroIN = new File("FichAlumno.dat");
		DataInputStream dataIS = new DataInputStream(new FileInputStream(
				ficheroIN));

		File ficheroOUT = new File("FichData_TEMP.dat");
		DataOutputStream dataOS = new DataOutputStream(new FileOutputStream(
				ficheroOUT));

		String DNI;
		String apellidos;
		String nombre;
		int turno;

		try {
			while (true) {
				DNI = dataIS.readUTF(); // recupera el DNI
				apellidos = dataIS.readUTF(); // recupera los apelllidos
				nombre = dataIS.readUTF(); // recupera los nombres
				turno = dataIS.readInt(); // recupera los turnos

				if (turno == 7) {
					turno = 8;
				}
				else if (turno == 8) {
					turno = 7;
				}
				dataOS.writeUTF(DNI); // inserta nombre
				dataOS.writeUTF(apellidos); // inserta edad
				dataOS.writeUTF(nombre); // inserta nombre
				dataOS.writeInt(turno); // inserta edad

				

				System.out.println("DNI: " + DNI + ", apellidos: " + apellidos
						+ ", nombre: " + nombre + ", turno: " + turno);
			}
		} catch (EOFException eo) {
		}

		dataIS.close(); // cerrar stream
		dataOS.close(); // cerrar stream
		
		ficheroIN.delete();
		ficheroOUT.renameTo(ficheroIN);
	}

}
