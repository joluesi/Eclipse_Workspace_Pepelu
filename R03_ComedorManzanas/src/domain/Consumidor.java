package domain;

public class Consumidor extends Thread {
	
	private Cesto miCestoManzanas;
	
	public Consumidor(Cesto miCestoManzanas) {
		this.miCestoManzanas = miCestoManzanas;
	}

	public void run() {
		while (true) {
			int comer = (int) (Math.random()*15)+1;
			int comidas = 0;
			if (miCestoManzanas.getManzanasCesto() > 0) {
				comidas  = miCestoManzanas.comerManzanasCesto(comer);
			}
			System.out.println("Chaval se come "+comidas+" en el cesto hay "+miCestoManzanas.getManzanasCesto());
			int espera = (int) (Math.random()*1000)+1;
			try {
				sleep(espera);
			} catch (InterruptedException e) {}
		}//end-while
	}
	
}
