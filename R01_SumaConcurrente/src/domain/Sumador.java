package domain;

public class Sumador extends Thread {
	
	private Computo misDatos;
	private int numHilo;
	
	
	public Sumador(int numHilo, Computo misDatos) {
		this.numHilo = numHilo;
		this.misDatos = misDatos;
	
	}

	public void run(){
		int valor1 = misDatos.getDato1(numHilo);
		int valor2 = misDatos.getDato2(numHilo);
		int resultado = valor1 + valor2;
		misDatos.setResultado(numHilo, resultado); 
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
