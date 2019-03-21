package HilosConThreads;

import java.util.Random;

public class Mecanismo extends Thread{
	
	private int repetir;
	private String sonido;
	
	public Mecanismo(int repetir, String sonido){
		this.repetir = repetir;
		this.sonido = sonido;
	}
	
	public void run(){
		Random rand = new Random();
		Thread r = Thread.currentThread(); //crea un puntero
		
		
		for(int i = 0; i< repetir; i++){
			System.out.println(sonido +" ");
			long aleatrio = rand.nextInt(500);
			try {
				r.sleep(aleatrio);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
