package main;

import domain.Computo;
import domain.Sumador;

public class Main {

	public static void main(String[] args) {
		
		int hilos = 10;
		Computo misDatos = new Computo(hilos);
		misDatos.print();
		Sumador[] miSumador = new Sumador[hilos];
		
		//bucle para inicializar los hilos
		for (int i = 0; i < hilos; i++){
			miSumador[i] = new Sumador(i, misDatos);
		}
		
		//bucle para ejecutar los hilos
		System.out.println();		
		System.out.println("Iniciamos los hilos");
		for (int i = 0; i < hilos; i++){
			miSumador[i].start();
		
		}
		
		//esperamos a que todos los hilos terminen
		boolean finalizados;
		do {
			finalizados = true;
			for (int i = 0; i < hilos; i++){
				if (miSumador[i].isAlive())
					finalizados = false; 
			}
		} while (! finalizados);		
		misDatos.print();
		System.out.println();
		System.out.println("Finalizada la suma");
	}

}
