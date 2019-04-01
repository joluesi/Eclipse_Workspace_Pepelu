package ejecucionProcesos;

import java.io.*;  
public class Lanzador {

    public static void lanzarSumador(long n1, long n2, String fichero){
                  String[] Parametros = {"java","Sumador",String.valueOf(n1), String.valueOf(n2)};
                  ProcessBuilder pb = new ProcessBuilder(Parametros);
                  Process p = null;
                  System.out.println("Lllamando "+Parametros[0]+" "+Parametros[1]+" "+Parametros[2]+" "+Parametros[3]+" ");
                  try{
                        pb.redirectOutput(new File(fichero));
                        pb.redirectError(new File("errores.txt"));
                        p = pb.start();
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
    }

    public static void main(String[] args){
            String f1 = "result1.txt";
            String f2 = "result2.txt";
            long n1=Long.parseLong(args[0]);
            long n2=Long.parseLong(args[1]);
            long n3=Long.parseLong(args[2]);
            long n4=Long.parseLong(args[3]);
            lanzarSumador(n1,n2,f1);
            lanzarSumador(n3,n4,f2);
            System.out.println("Terminado");
    }
}