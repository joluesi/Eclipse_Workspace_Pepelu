package domain;

public class Productor extends Thread {

	private Cesto miCestoManzanas;
	private int capacidadCesto;
	
	public Productor(Cesto miCestoManzanas, int capacidadCesto) {
		this.miCestoManzanas = miCestoManzanas;
		this.capacidadCesto = capacidadCesto;
	}

	public void run() {
		while (true) {
			int meter = (int) (Math.random()*25)+1;
			int metidas = 0;
			if (miCestoManzanas.getManzanasCesto() <= capacidadCesto) {
				metidas  = miCestoManzanas.ponerManzanasCesto(meter);
			}
			System.out.println("El jardinero mete "+metidas+" en el cesto hay "+miCestoManzanas.getManzanasCesto());
			int espera = (int) (Math.random()*1000)+1;
			try {
				sleep(espera);
			} catch (InterruptedException e) {}
		}//end-while
	}
}
