package domain;

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
