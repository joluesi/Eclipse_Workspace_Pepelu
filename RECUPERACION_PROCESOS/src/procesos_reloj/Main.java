package procesos_reloj;

import domain.Reloj;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		int repetir = 10;
		
		Reloj tic = new Reloj("tic", repetir);
		Reloj tac = new Reloj("tac", repetir);
		
		tic.start();
		tac.start();
		
		while (tic.isAlive() || tac.isAlive()){
			System.out.println("El main espera");
			Thread.sleep(1000);
		}
		System.out.println("El main termina");

	}

}
