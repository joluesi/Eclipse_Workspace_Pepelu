package domain;

import java.util.Random;

public class HiloSimple extends Thread{
	private String nombre;
	private int retardo;
	
	
	public HiloSimple(String s, int d) {		
		nombre = s;
		retardo = d;
	}
	
	public void run() {	
		Thread t = Thread.currentThread();
		Random rand = new Random();
		System.out.println(((HiloSimple) t).getNombre() + " - 'Hola Mundo'");	
		//retrasamos la ejecución el tiempo especificado de forma aleatoria
		for (int i=0; i<4; i++) {
			long aleatorio = rand.nextInt(1000);			
			try {
				t.sleep(aleatorio);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			System.out.print("*");

		}
		//fin de saludos
		System.out.println();
		System.out.println(((HiloSimple) t).getNombre() + " - Saludo Finalizado");
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
