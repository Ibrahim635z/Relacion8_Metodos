package Relacion8_Metodos;

import java.util.Scanner;

public class Ejercicio1 {
    public static String convierteEnPalotes (int n){
        String palotes="";
        int numeroInvertido=0;
        while (n > 0) {
            numeroInvertido = numeroInvertido * 10 + n % 10;
            n = n / 10;
        }
        while (numeroInvertido>0) {
            int digito=numeroInvertido%10;
            
            for (int i = 0; i < digito; i++) {
                
                palotes+="|";
            }
            palotes+="-";
            numeroInvertido=numeroInvertido/10;
        }
        return palotes;

    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);

        int num=0;
        String palotes;

        System.out.print("Ingrese el numero que desea convertir:");
        num=entrada.nextInt();

        palotes=convierteEnPalotes(num);

        System.out.println("El numero "+num+ " en palotes es: " +palotes);

        entrada.close();
    }
}
