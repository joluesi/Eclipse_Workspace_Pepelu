package HilosConThreads;

public class main {
	
	private static int caballos = 10;
	public static int posicion[] = new int[caballos];
	
	static Caballo[] caballo = new Caballo[caballos];
			
	private boolean carrera(){
		return true;
	}
			
	public static void main(String[] args){
		
		for(int i=0; i<caballos; i++){
			caballo[i] = new Caballo(i);
			caballo[i].setName("Caballo "+i);
			caballo[i].start();
			
		}
	}
	

}
