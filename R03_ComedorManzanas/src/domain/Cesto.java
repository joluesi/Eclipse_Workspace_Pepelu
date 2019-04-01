package domain;

import java.util.concurrent.Semaphore;

public class Cesto {
	
	private Semaphore accesoCesto = new Semaphore(1);
	private int manzanasCesto;
	private int capacidadCesto;
	
	public Cesto(int capacidadCesto) {
		this.capacidadCesto = capacidadCesto;
		this.manzanasCesto = capacidadCesto;
	}

	public synchronized int comerManzanasCesto(int manzanas) {
		int coger = 0;
		try {
			accesoCesto.acquire();
		
		if (manzanasCesto >= manzanas) {
			coger = manzanas;
			manzanasCesto = manzanasCesto - manzanas; 
		}
		else {
			coger = manzanasCesto;
			manzanasCesto = 0;
		}
		accesoCesto.release();
		if (manzanasCesto == 0) {
			System.out.println("Chaval a dormir");
			wait();
		}
		notifyAll();
		} catch (InterruptedException e) {}
		return coger;
	}

	public  int getManzanasCesto() {
		int valor = 0;
		try {
			accesoCesto.acquire();
			valor = manzanasCesto;
			accesoCesto.release();
		} catch (InterruptedException e) {}
		return valor;
	}
	public synchronized int ponerManzanasCesto(int manzanas) {
		int valor = 0;
		try {
			accesoCesto.acquire();
			if ((manzanasCesto+manzanas) <= capacidadCesto) {
				manzanasCesto = manzanasCesto + manzanas;
				valor = manzanas;
			}
			accesoCesto.release();
			if (manzanasCesto == capacidadCesto) {
				wait();
				System.out.println("Jardinero dormir");
			}
		    notifyAll();
		} catch (InterruptedException e) {}
		return valor;
	}
	
	

}
