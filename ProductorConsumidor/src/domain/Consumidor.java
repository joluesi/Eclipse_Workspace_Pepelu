package domain;

import java.util.Random;

public class Consumidor extends Thread {
	 private Buffer buffer;
	 public Consumidor(Buffer buffer) {
	 this.buffer=buffer;
	 }
	 public void run(){
		 Thread t = Thread.currentThread();
		 Random rand = new Random();
		 char valor;
		 for(int i=0; i<10; i++){
		 valor=buffer.recoger();
		 System.out.println(i+ " "+t.getName()+" "+valor);
		 try{
			 long aleatorio = rand.nextInt(600);
			 sleep(aleatorio);
		 }catch (InterruptedException e) { }
		 }
	}

}
