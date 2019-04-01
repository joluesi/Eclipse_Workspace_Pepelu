package HilosRunnable;

public class HolaRunnable implements Runnable {
	
	//el método run ejecuta el código del hilo
	public void run(){
		System.out.println("Hilo funcionando"); 
		
	}
	//otro método para comprobar que ambos hilos (h1 y h2) se ejecutan de forma paralela en el sistema
	public static void out(String s){
		System.out.println(s);
	}
	
	public static void main(String[] args){
		
		Thread h1 = new Thread(new HolaRunnable());
		
		//ejecuta dentro del hilo h1 el método run
		h1.start();
		
		Thread h2 = new Thread(new HolaRunnable());
		
		//ejecuta dentro del hilo h2 el método run
		h2.start();
		for(int i=0; i<20; i++){
			out("cuenta "+i);
		}
		
	}

}
