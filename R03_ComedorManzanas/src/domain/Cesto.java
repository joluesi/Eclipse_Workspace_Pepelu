package domain;

import java.util.concurrent.Semaphore;

public class Cesto {
	
	//4º creo una variable para saber cuantas manzanas tengo en el cesto en ese momento
	private int manzanasCesto;
	private int capacidadCesto;
	
	//7º creo una variable de tipo semáforo
	private Semaphore accesoCesto = new Semaphore(1);
	
	//3º creo el constructor de la clase Cesto (el cesto está lleno)
	public Cesto (int capacidadCesto){
		this.capacidadCesto = capacidadCesto;
		this.manzanasCesto = capacidadCesto;
	}

	//6º tengo que establecer un semáforo por problemas de concurrencia cuando se quiera acceder
	// a la variable manzanasCesto
	public synchronized int comerManzanasCesto(int manzanas) {
		int coger;
		try{
			if(manzanasCesto == 0){
				System.out.println("Chaval duerme");
				wait();
			}
			accesoCesto.acquire();
		}catch (InterruptedException e) {}
		
		if (manzanasCesto >= manzanas){
			coger = manzanas;
			manzanasCesto -= manzanas;
		}
		else{
			coger = manzanasCesto;
			manzanasCesto = 0;
		}
		accesoCesto.release();
		notifyAll();
		return coger;
	}
			
	
	//5º creo los getters and setters
	public int getManzanasCesto() {	
		int valor = 0;
		try{
			
			accesoCesto.acquire();
			valor = manzanasCesto;
			accesoCesto.release();
			
			
		}catch (InterruptedException e) {}

		return manzanasCesto;
	}

	public synchronized int ponerManzanasCesto(int manzanas) {
		int valor = 0;
		try{
			if(manzanasCesto == capacidadCesto){
				System.out.println("Productor duerme");
				wait();
			}
			accesoCesto.acquire();
			if((manzanasCesto + manzanas) <= capacidadCesto){
				manzanasCesto += manzanas;
				valor = manzanas;
			accesoCesto.release();
			}
			notifyAll();

		}catch (InterruptedException e) {}
		
		return valor;
	}
	
	
	
}
