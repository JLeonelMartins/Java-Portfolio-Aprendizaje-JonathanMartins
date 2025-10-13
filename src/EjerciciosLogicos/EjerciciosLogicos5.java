package EjerciciosLogicos;

import java.util.Scanner;

public class EjerciciosLogicos5 {
    public static void main(String[] args) {


        System.out.println("Ingrese una palabra: ");
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.nextLine();


        while( !palabra.equalsIgnoreCase("salir")){
            System.out.println(palabra);
            System.out.println("Ingrese una palabra: ");
            palabra = teclado.nextLine();
        }

    }
}
