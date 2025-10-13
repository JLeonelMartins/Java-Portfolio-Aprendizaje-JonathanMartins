package EjerciciosVectores;

import java.util.Scanner;

public class EjerciciosPracticosVectores6 {
    public static void main(String[] args) {

        //creamos matriz
        int matriz[][] = new int[3][6];

        Scanner teclado = new Scanner(System.in);

        //cargamos matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("Ingrese la cantidad de asientos para el destino " + i + " horario " + j);
                matriz[i][j] = teclado.nextInt();

            }
        }

        Scanner teclado2 = new Scanner(System.in);
        String flag = "";
        int destino;
        int horario;
        int asiento;

        while (!flag.equalsIgnoreCase("finish")) {
            System.out.println("Ingrese el numero de destino");
            destino = teclado.nextInt();
            System.out.println("Ingrese el horario");
            horario = teclado.nextInt();
            System.out.println("Ingrese la cantidada de asientos");
            asiento = teclado.nextInt();

            if (destino >= 0 && destino <= 5) {
                if (horario >= 0 && horario <= 2) {
                    if (matriz[destino][horario] >= asiento) {
                        System.out.println("Su reserva fue realizada con exito para el destino " + destino + " horario " + horario);
                        matriz[destino][horario] = matriz[destino][horario] - asiento;
                    } else {
                        System.out.println("Disculpe, no quedan asientos disponibles");
                    }
                } else {
                    System.out.println("Horario no existente. Ingrese un valor entre 0 y 2");
                }
            } else {
                System.out.println("Destino no existente. Ingrese un valor entre 0 y 5");
            }

        }
        System.out.println("Desea continuar reservando?. Ingrese finish para terminar o cualquier valor para seguir");
        flag = teclado2.next();


    }
}



