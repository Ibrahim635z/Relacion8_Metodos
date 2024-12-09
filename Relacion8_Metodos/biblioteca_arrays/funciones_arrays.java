package Relacion8_Metodos.biblioteca_arrays;

import java.util.Scanner;

public class funciones_arrays{
  //GENERA ARRAY
    public static void generaArrayInt(int minimo,int maximo){
        Scanner entrada=new Scanner (System.in);

        int n=0;

        System.out.println("ingrese el tamaño del array");
        n=entrada.nextInt();

        int array[]= new int [n];

        for (int i = 0; i < array.length; i++) {
            array[i]= (int) (Math.random() *(maximo-minimo)+minimo);
            System.out.print(array[i]+" ");
        }




        entrada.close();
    }
    //DEVUELVE EL MINIMO DEL ARRAY
    public static int minimoArrayInt(int a[]) {

        int pos_minima=a[0];

        for (int i = 0; i < a.length; i++) {
            
            if (a[i]<pos_minima){
                pos_minima=a[i];
            }
            
        }
        return pos_minima;
       

    }
    //DEVUELVE EL MAXIMO DEL ARRAY
    public static int maximoArrayInt(int a[]) {

        int pos_maxima=a[0];

        for (int i = 0; i < a.length; i++) {
            
            if(a[i]>pos_maxima){
                pos_maxima=a[i];
            }
        }
        return pos_maxima;
       
    }
    //DEVUELVE LA MEDIA DEL ARRAY
    public static int mediaArrayInt(int a[]) {
        int media=0, cont=0;
        for (int i = 0; i < a.length; i++) {
            media+=a[i];
            cont++;
        }
        media=media/cont;

        return media;
        
    }
    //NUMERO DENTRO O NO DEL ARRAY
    public static void estaEnArrayInt(int a, int array[]){
       int cont=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==a){
                cont++;
            }
        }
        if (cont>0){
            System.out.println( a+ " Si esta en el array");
        }else{ System.out.println(a+ " No esta en el array");
        }
    }
    //BUSCA UN NUMERO EN UN ARRAY Y DEVUELE LA POSICION
    public static int posicionEnArray(int a, int array[]){
        int posicion=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==a){
                posicion=i;
            }
        }
        return posicion+1;
    }

    //LE DA LA VUELTA A UN ARRAY
    public static int[] volteaArrayInt(int array[]) {
        int[] inverso = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            inverso[i] = array[array.length - 1 - i];
        }
        return inverso;
    }
    // ROTA N POSICIONES A LA DERECHA LOS NUMEROS DE UN ARRAY
    public static int[] rotaDerechaArrayInt(int array[], int n) {
        int[] rotado = new int[array.length];
        

        for (int i = 0; i < array.length; i++) {
            rotado[(i + n) % array.length] = array[i]; 
        }
        return rotado;
    }
    //ROTA N POSICIONES A LA IZQUIERDA LOS NUMEROS DE UN ARRAY

    public static int[] rotaIzquierdaArrayInt(int array[], int n) {
        int[] rotado = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            rotado[i] = array[(i + n) % array.length];
        }
        return rotado;
    }
}