
public class NumerosPrimosArray {
	
	public static void numerosPrimos(int n) {
	    int v[] = new int[n];
	    int posicion=0;

	    //hallando un numero primo
	    int divisibles;
	    for(int i=0;posicion<n;i++){ //no sale de este for sino esta lleno el vector
	        divisibles=0;
	        for(int j=1;j<=i;j++){ // aqui este for, recorre todos los numeros detras de el
	            if(i%j==0){ //los numero primos solo son divisible por 1 y por ellos mismo
	                divisibles++;
	            }
	        }
	        if(divisibles==2){ //si es divisible por el y por 1 entrara
	            v[posicion]=i; // guardo numero el en vector
	            posicion++; // aumento una posicion para el sgte numero
	        }
	    }


	    for(int i=0;i<v.length;i++) {
	        System.out.println("" + v[i]);
	    }
	}

}
