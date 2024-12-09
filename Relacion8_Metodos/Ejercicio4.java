package Relacion8_Metodos;

import java.util.Scanner;

public class Ejercicio4 {
    public static String convierteArrayEnString(int array[]){

        String cadena="";
        

        for (int i = 0; i < array.length; i++) {
            cadena+=String.valueOf(array[i]);
        }
       return cadena;
    }
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        int num=0;
        String cadena="";

        System.out.println("Ingrese el tamaño del array");
        num=entrada.nextInt();
        int array[]= new int [num];
        for (int i = 0; i < array.length; i++) {
            System.out.println("introduce el valor " +(i+1) );
            array[i]=entrada.nextInt();
        }

       cadena=convierteArrayEnString(array);

        System.out.println("'"+cadena+"'");


        entrada.close();
    }
   
    
}
