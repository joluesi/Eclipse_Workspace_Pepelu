package domain;

public class Buffer {
	 private char contenido;
	 private boolean disponible=false;
	 
	 public Buffer() {
	 }
	 
	 //ahora utilizo al synchronized
	 //public char recoger(){
	 public synchronized char recoger(){
		 while (!disponible){
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 disponible=false;
		 notifyAll();
		 return contenido;

	 }
	 
	 public synchronized void poner(char c){
		 while(disponible){
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 contenido=c;
		 disponible=true;
		 notifyAll();
	 }
}