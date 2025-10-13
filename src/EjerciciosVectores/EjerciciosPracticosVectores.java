package EjerciciosVectores;

import java.util.Scanner;

public class EjerciciosPracticosVectores {
    public static void main(String[] args) {

        int vector[] = new int[15];
        int contador = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Ingrese un valor que desea guardar: ");
            vector[i] = teclado.nextInt();
            if (vector[i] == 3) {
                contador++;
            }

        }
        System.out.println("El numero 3 fue cargado un total de " + contador + " veces");

    }
}
