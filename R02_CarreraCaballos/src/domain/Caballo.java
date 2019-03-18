package domain;
import java.util.Random;

public class Caballo extends Thread{	

	// constructor
	public Caballo() {		
	
	}

	public void run(){		
		Thread t = Thread.currentThread();
		Random rand = new Random();
		System.out.println(t.getName() + " Corriendo");	
		//Caballos Corriendo
		for (int i=0; i< 10; i++) {
			long aleatorio = rand.nextInt(1000);			
			try {
				t.sleep(aleatorio);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			System.out.print("*");

		}
		//fin de carrera		
		System.out.println(t.getName() + " Finalizado");
		}
			
}


