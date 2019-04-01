package domain;

public class Caballo extends Thread{

	private int longitudPista;
	private int posicion = 0;
	private boolean meta;
	private boolean corriendo;
	
	public Caballo(int longitudPista) {
		this.longitudPista = longitudPista;
		this.meta = false;
		this.corriendo = false;
	}

	public void run() {
		corriendo = true;
		while (posicion < longitudPista) {
			posicion = posicion + 10;
			int espera = (int) (Math.random()*100)+1;
			try {
				Thread.sleep(espera);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//end-try
			if (!corriendo)
				break;
		}//end-while
		meta = true;
	}//end-run()

	public int getPosicion() {
		return posicion;
	}
	public boolean getMeta() {
		return meta;
	}

	public void setTerminar() {
		corriendo = false;
	}
}
