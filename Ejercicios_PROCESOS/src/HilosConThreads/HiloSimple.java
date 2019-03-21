package HilosConThreads;

public class HiloSimple extends Thread {

	public void run(){
		Thread t = Thread.currentThread();
		
		for	(int i = 0; i<5; i++){
			System.out.println(t.getName()+" En el hilo "+i);
		}
	}
	
	public static void main(String[] args){
		
		HiloSimple h1 = new HiloSimple();
		h1.setName("Hilo h1");
		HiloSimple h2 = new HiloSimple();
		h2.setName("Hilo h2");
		h1.start();
		h2.start();
	}
	
	
	
}
