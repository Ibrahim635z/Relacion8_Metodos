package Relacion8_Metodos;

import java.util.Scanner;

public class Ejercicio2 {
    public static String ConviertePalabras(int n){
        String numeros[]={"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
        char cifra;
        String palabras="";
        String numero= String.valueOf(n);
        for (int i = 0; i < numero.length(); i++) {
            
            cifra=numero.charAt(i);

            if(i==numero.length()-1){
                palabras=palabras+numeros[(int)cifra-48];
            }else palabras=palabras+numeros[(int)cifra-48]+",";
        }

        return palabras;
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int num=0;
       
        System.out.println("Ingrese un numero:");
        num=entrada.nextInt();
       
        System.out.println(ConviertePalabras(num));


        entrada.close();
    }
}
