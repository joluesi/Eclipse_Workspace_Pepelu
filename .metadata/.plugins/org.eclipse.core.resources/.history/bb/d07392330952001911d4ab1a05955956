package main;

import domain.Caballo;
import domain.Marcador;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		int longitudPista = 1000;
		int numCaballos = 10;
		/*
		Caballo miCaballo = new Caballo(longitudPista);
		miCaballo.start();
		miCaballo.join();
		*/
		Marcador miMarcador = new Marcador(longitudPista,numCaballos);
		miMarcador.start();
		miMarcador.join();
		System.out.println("Terminada la carrera");
	}

}
