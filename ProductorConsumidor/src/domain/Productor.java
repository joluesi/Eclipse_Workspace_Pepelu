package domain;

import java.util.Random;

public class Productor extends Thread {
	 private Buffer buffer;
	 private final String letras="abcdefghijklmnopqrstuvxyz";
	 public Productor(Buffer buffer) {
	 this.buffer=buffer;
	 }
	 public void run() {
		 Random rand = new Random();
		 Thread t = Thread.currentThread();
		 for(int i=0; i<10; i++){
		 char c=letras.charAt((int)(Math.random()*letras.length()));
		 buffer.poner(c);
		 System.out.println(i+" "+ t.getName()+ " "+c);
		 	try {
		 		long aleatorio = rand.nextInt(600);
		 		sleep(aleatorio);
		 	} catch (InterruptedException e) { }
		 }
	}
}