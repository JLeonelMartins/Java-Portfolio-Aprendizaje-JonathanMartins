package EjerciciosVectores;

import java.util.Scanner;

public class EjerciciosPracticosVectores2 {
    public static void main(String[] args) {

        int matriz[][] = new int[4][4];
        int promedio = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la nota del alumno numero° " + i);
                matriz[i][j] = teclado.nextInt();

                promedio = promedio + matriz[i][j];
            }
            matriz[i][3] = promedio / 3;
            promedio = 0;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Las notas del alumno numero° " + i + " son: ");
            for (int j = 0; j < 3; j++) {
                System.out.println("Nota N° " + j + ": " + matriz[i][j]);
            }
            System.out.println("Promedio: " + matriz[i][3]);
        }

    }
}
