package domain;

public class Reloj extends Thread {

	private String sonido;
	private int repetir;
	//private boolean vivo;

	// constructor con 1 parámetro (string)
	public Reloj(String sonido, int repetir) {
		this.sonido = sonido;
		this.repetir = repetir;
		//this.vivo = true;  // asegura que al ejecutar el método isVivo(), éste se va a ejecutar antes que el run(start)
	}	// si utilizo el método predefinido isAlive() --> ya no tiene sentido usar la variable vivo (ya viene codificado)

	public void run(){
		try{
			//vivo = true; 
			int contador = 0;
			while (contador < repetir){
				System.out.println(sonido);		
				Thread.sleep(500);
				contador++;
			}			
			//vivo = false;
			System.out.println(sonido +" terminado");
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}

	}
	/*
	public boolean isVivo() {
		return vivo;
	}
	*/

}

