package EjerciciosVectores;

import java.util.Scanner;

public class EjerciciosPracticosVectores3 {
    public static void main(String[] args) {

        String vector [] = new String[8];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el nombre que desea guardar: ");
            vector[i] = teclado.nextLine();
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

    }
}
