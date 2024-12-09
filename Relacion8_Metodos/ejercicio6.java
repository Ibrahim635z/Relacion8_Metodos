package Relacion8_Metodos;

import Relacion8_Metodos.biblioteca_arrays.funciones_arrays;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
       
        funciones_arrays.generaArrayInt(10,20);
        
        System.out.println();

        int array1[]={4,6,1,7};
        int minimo= funciones_arrays.minimoArrayInt(array1);
        System.out.println("El minimo del array es "+minimo);

        int array2[]={1,6,9,7};
        int maximo= funciones_arrays.maximoArrayInt(array2);
        System.out.println("El maximo del array es "+maximo);
        entrada.close();

        int array3[]={5,4,6,3,7};
        int media=funciones_arrays.mediaArrayInt(array3);
        System.out.println("La media del array 3 es: "+media);

        int array4[]={7,9,10,25,34};
        funciones_arrays.estaEnArrayInt(25, array4);

        int array5[]={27,14,50,80};
        int a=14;
        int posicion=funciones_arrays.posicionEnArray(a, array5);
        System.out.println(a+ " se encuentra en la posicion " +posicion);

        int array6[]={20,21,22,23};
        int inverso[]=new int[4];
        inverso=funciones_arrays.volteaArrayInt(array6);
        for (int i = 0; i < inverso.length; i++) {
            System.out.print(inverso[i]+" ");
        }
        System.out.println();

        int array7[]={30,41,42,23};
        int rotado[]= new int[4];

        rotado=funciones_arrays.rotaDerechaArrayInt(array7,1);
        for (int i = 0; i < rotado.length; i++) {
            System.out.print(rotado[i]+" ");
        }
        System.out.println();
        rotado=funciones_arrays.rotaIzquierdaArrayInt(array7, 1);
        for (int i = 0; i < rotado.length; i++) {
            System.out.print(rotado[i]+" ");
        }


    }
    
}
