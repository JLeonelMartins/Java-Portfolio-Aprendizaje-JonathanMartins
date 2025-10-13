package EjerciciosVectores;

import java.util.Scanner;

public class EjerciciosPracticosVectores4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        String ciudades[] = new String[5];
        Double minimas[] = new Double[5];
        Double maximas[] = new Double[5];

        Double minima = 9999999.0;
        Double maxima = -1.0;
        int ciudadMin = -1;
        int ciudadMax = -1;


        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese el nombre de la ciudad: " + i);
            ciudades[i] = teclado.next();

            System.out.println("Ingrese la minima de la ciudad: " + i);
            minimas[i] = teclado.nextDouble();
            minima = minimas[i];

            System.out.println("Ingrese la maxima de la ciudad: " + i);
            maximas[i] = teclado.nextDouble();

        }

        for (int i = 0; i < minimas.length; i++) {

            if (minimas[i] < minima) {
                minima = minimas[i];
                ciudadMin = i;
            }

        }
        for (int i = 0; i < maximas.length; i++) {

            if (maximas[i] > maxima) {
                maxima = maximas[i];
                ciudadMax = i;
            }
        }


        System.out.println("La ciudad con temperatura menor es: " + ciudades[ciudadMin] + " con temperatura de " + minima);
        System.out.println("La ciudad con temperatura mayor es: " + ciudades[ciudadMax] + " con temperatura de " + maxima);


    }
}
