package Relacion8_Metodos;

import java.util.Scanner;

public class Ejercicio5 {
    public static int[] concatena (int a[],int b[]){
        int array_concatenado[]=new int [a.length + b.length];
        System.arraycopy(a,0, array_concatenado, 0, a.length);
        System.arraycopy(b, 0, array_concatenado, a.length, b.length);
        
        return array_concatenado;

    }
    public static void main(String[] args) {
         Scanner entrada =new Scanner (System.in);
        int num=0;
        

        System.out.println("Ingrese el tamaño del primer array");
        num=entrada.nextInt();
        int array1[]= new int [num];

        System.out.println("Ingrese el tamaño del segundo array");
        num=entrada.nextInt();
        int array2[]= new int [num];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Ingrese el valor " +(i+1)+ " del primer array" );
            array1[i]=entrada.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Ingrese el valor " +(i+1)+ " del segundo array" );
            array2[i]=entrada.nextInt();
        }

        int array_concatenado[]=concatena(array1, array2);
        System.out.print("El array concatenado es: ");
        for (int j = 0; j < array_concatenado.length; j++) {
            System.out.print(array_concatenado[j]);
        }
        

        entrada.close();
    }
    
}
