package domain;

public class Caballo extends Thread{

	private int longitudPista;
	private int posicion = 0;
	
	public Caballo(int longitudPista) {
		this.longitudPista = longitudPista;
	}

	public void run() {
		while (posicion < longitudPista) {
			posicion = posicion + 10;
			int espera = (int) (Math.random()*100)+1;
			try {
				Thread.sleep(espera);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//end-try
		}//end-while
	}//end-run()

	public int getPosicion() {
		return posicion;
	}
}
