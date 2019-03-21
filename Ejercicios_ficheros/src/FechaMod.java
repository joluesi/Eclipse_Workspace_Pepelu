
import java.io.*;
import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FechaMod {
	public static void main(String[] args) throws ParseException {
		String dir = "/home/dam18-27/Documentos/Acceso_a_Datos/recursosUnidad1/EjemplosLibro";
		
		File f = new File(dir);
		String[] archivos = f.list();
		String dia;
		String mes;
		String annio;
		
		dia=args[0].substring(0, 2);
		mes =args[0].substring(4, 5 );
		annio= args[0].substring(6,10);
		
		System.out.printf("fecha= %s / %s / %s%n", dia, mes, annio);
		
		Calendar fecha_introducida= new GregorianCalendar();
		fecha_introducida.set( Integer.parseInt(annio), Integer.parseInt(mes), Integer.parseInt(dia));
		long milisegundos_fecha_introducida = fecha_introducida.getTimeInMillis();
		
		
		System.out.printf("Ficheros en el directorio actual: %d %n", archivos.length);
		for (int i = 0; i < archivos.length; i++) {
			File f2 = new File(f, archivos[i]);
			long ms=f2.lastModified();
			System.out.printf("Fecha introducida (ms)= %d Fecha_archivo (ms)= %d%n", milisegundos_fecha_introducida, ms);
			if (ms < milisegundos_fecha_introducida) 
			System.out.printf("Nombre: %s, es fichero?: %b, es directorio?: %b%n", archivos[i], f2.isFile(),	f2.isDirectory());
		}
	}
}