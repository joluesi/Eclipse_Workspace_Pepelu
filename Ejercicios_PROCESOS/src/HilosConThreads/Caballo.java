package HilosConThreads;

import java.util.Random;

public class Caballo extends Thread {
	
	private int dorsal;
	public Caballo(int i){
		dorsal = i;
	}
	
	public void run(){
		Thread posicion = Thread.currentThread();
		Random rand = new Random();
		for	(int i = 0; i<10; i++){
			long aleatorio = rand.nextInt(1000);
			
			try{
			posicion.sleep(aleatorio);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			main.posicion[dorsal] = i;
		}
			
		//Fin de la carrera
		System.out.println(posicion.getName()+ " Finalizado");
		
	}
	

}



