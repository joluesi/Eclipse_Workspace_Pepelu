package main;

import domain.Caballo;

public class Main {
	
	//En ejercicio anterior se hizo una carrera DE UN SOLO CABALLO...
	
	//Ahora haremos una carrera CON 10 CABALLOS
	private static int caballos = 10;
	static Caballo[] caballo = new Caballo[caballos];
	
	public static void main(String[] args) throws InterruptedException{
		
		for (int i=0; i<caballos; i++) {
			caballo[i] = new Caballo();
			caballo[i].setName("Caballo Nº"+i);
			caballo[i].start();
		}
	}
	
	

}
