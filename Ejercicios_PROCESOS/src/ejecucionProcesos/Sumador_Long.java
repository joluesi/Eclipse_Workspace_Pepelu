package ejecucionProcesos;

public class Sumador_Long {
/** Suma todos los valores incluidos
* entre dos valores
*/
public static long sumar(long n1, long n2){
	long suma=0;
	if (n1>n2){
		//variable aux: ordena los dos valores, para que el menor sea el primer argumento que paso
		long aux=n1;
		n1=n2;
		n2=aux;
	}	
	for (long i=n1; i<=n2; i++){
		suma=suma+i;
	}
		return suma;
}


public static void main(String[] args){
	long n1=Integer.parseInt(args[0]);
	long n2=Integer.parseInt(args[1]);
	long suma=sumar(n1, n2);
		System.out.println(suma);
			System.out.flush();
}
}
