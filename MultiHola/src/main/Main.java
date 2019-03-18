package main;

import domain.HiloSimple;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		HiloSimple hs1 = new HiloSimple("Hilo1", (int)(Math.random()*2000));
		HiloSimple hs2 = new HiloSimple("Hilo2", (int)(Math.random()*2000));
		HiloSimple hs3 = new HiloSimple("Hilo3", (int)(Math.random()*2000));
		hs1.start();
		hs2.start();	
		hs3.start();	
		
		//ahora le digo al hilo del método 'main' que espere hasta que terminen los hilos 
		hs1.join();	
		hs2.join();	
		hs3.join();	
		
		

	}

}
