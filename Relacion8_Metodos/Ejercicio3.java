package Relacion8_Metodos;

import java.util.Scanner;

public class Ejercicio3 {

    public static void piramide(char caracter, int repeticiones){
        for (int i = repeticiones ; i>0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(caracter);
            }
            System.out.println(" ");
        }

    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int altura=0;
        char caracter;

        System.out.println("Ingrese la altura de la figura");
        altura=entrada.nextInt();

        System.out.println("Ingrese el caracter que desea usar");
        caracter = entrada.next().charAt(0);

        piramide(caracter,altura);

        entrada.close();
    }
    
}
