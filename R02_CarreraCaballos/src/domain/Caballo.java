package domain;
<<<<<<< HEAD

public class Caballo extends Thread{
	private int longitudPista;
	
	// constructor
	public Caballo(int longitudPista) {
		this.longitudPista = longitudPista;
		
	}

	public void run(){
		int posicion = 0;
		System.out.println("Caballo corriendo");
		System.out.println();
		while (posicion < longitudPista){
			posicion += 10;
			int espera = (int) (Math.random()*100)+1;
			try {
				Thread.sleep(espera);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("*");
		}
		System.out.println();
		System.out.println("Caballo termina");
		
	}

}
=======
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


>>>>>>> 248b57efbe7f46408673a848161403b5f9570375
