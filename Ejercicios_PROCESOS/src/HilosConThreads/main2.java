package HilosConThreads;

public class main2 {
	
	static int hilos = 5;
	static Mecanismo[] mecanismo = new Mecanismo[hilos];
	static String sonido[] = {"TIC", "TAC", "TOC", "TIC", "TOC"};
	
	public static void main(String[] args){
		/*mecanismo[0] = new Mecanismo(5, "TIC");
		mecanismo[1] = new Mecanismo(5, "TAC");
		mecanismo[0].start();
		mecanismo[1].start();
		*/
		
		for (int i = 0; i < hilos; i++){
			mecanismo[i]= new Mecanismo(5, sonido[i]);
			mecanismo[i].start();
		}
		
	}

}
