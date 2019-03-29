package main;

import domain.Cesto;
import domain.Consumidor;
import domain.Productor;

public class Main {

	public static void main(String[] args) {
		int capacidadCesto = 25;
		Cesto miCestoManzanas = new Cesto(capacidadCesto);
		
		Productor jardinero = new Productor(miCestoManzanas, capacidadCesto);
		Consumidor chaval = new Consumidor(miCestoManzanas);
		
		chaval.start();
		jardinero.start();
	}

}
