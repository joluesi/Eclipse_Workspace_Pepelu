package domain;

public class Computo {
		
	private int[] dato1;
	private int[] dato2;
	private int[] resultado;
	int hilos;
	
	//constructor
	public Computo(int hilos) {
		dato1 = new int[hilos];
		dato2 = new int[hilos];
		resultado = new int[hilos];
		this.hilos = hilos;
		int valor1;
		int valor2;
		// llenamos los arrays de enteros con números 
		for (int i = 0; i < hilos; i++){
			valor1 = (int) (Math.random()*100)+1;
			dato1[i] = valor1;
			valor2 = (int) (Math.random()*100)+1;
			dato2[i] = valor2;
			
		}
	}
	
	public void print(){
		for (int i = 0; i < hilos; i++){
			System.out.println();
			System.out.print(" Dato1["+i+"] = "+dato1[i]);
			System.out.print(" Dato2["+i+"] = "+dato2[i]);
			System.out.print(" Resultado["+i+"] = "+resultado[i]);

		}
	}

	public int getResultado(int numHilo) {
		return resultado[numHilo];
	}

	public void setResultado(int numHilo, int valor) {
		this.resultado[numHilo] = valor;
	}

	public int getDato1(int numHilo) {
		return dato1[numHilo];
	}

	public int getDato2(int numHilo) {
		return dato2[numHilo];
	}



}
