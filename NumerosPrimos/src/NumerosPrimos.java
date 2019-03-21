
import java.util.Scanner;

    public class NumerosPrimos{
    	
    public static void main(String[] args) {
    	
        Scanner teclado = new Scanner (System.in);
        int desde = 2;
        int hasta = 999983;
        boolean esPrimo;
        int contPosicion=0;
        int posicion=0;        
        int n=0;
        int k=0;
        
        System.out.println("Introduzca posición: ");
        posicion=teclado.nextInt();
        
        int arrayPrimos[]= new int[posicion];

        for (int i = desde; i <= hasta; i++) {
            esPrimo = true;

            for (int j = 2; j <= Math.sqrt(i) && esPrimo; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo && contPosicion<posicion){ 

                esPrimo=true;
                contPosicion++;
                k=i;
                arrayPrimos[n++]=k;
            }if(contPosicion>=posicion){
                break;
            }
        }System.out.println(arrayPrimos[arrayPrimos.length-1]);
        /*
        System.out.println("Array de primos acumulados hasta la posición: "+posicion);
        for(int i=0;i<arrayPrimos.length;i++) {        	
	        System.out.println("" + arrayPrimos[i]);
	    }*/
     }
  }  
    
    
    
    