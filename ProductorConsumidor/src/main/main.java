package main;

import domain.Buffer;
import domain.Consumidor;
import domain.Productor;



public class main {
	
	private static Buffer b = new Buffer();
	
	public static void main(String[] args){
		
		Productor p1 = new Productor(b);
		Productor p2 = new Productor(b);
		Consumidor c1 = new Consumidor(b);
		Consumidor c2 = new Consumidor(b);
		Thread productor1 = new Thread(p1);
		Thread productor2 = new Thread(p2);
		Thread consumidor1 = new Thread(c1);
		Thread consumidor2 = new Thread(c2);
		consumidor1.setName("consumidor 1");
		consumidor2.setName("consumidor 2");
		productor1.setName("Productor 1");
		productor2.setName("Productor 2");
		
		productor1.start();
		productor2.start();
		consumidor1.start();
		consumidor2.start();

	}

}
