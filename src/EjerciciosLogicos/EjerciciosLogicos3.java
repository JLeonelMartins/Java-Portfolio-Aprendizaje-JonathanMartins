package EjerciciosLogicos;

import java.util.Scanner;

public class EjerciciosLogicos3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int limite = sc.nextInt();

        System.out.println("Ingrese el limite hasta el que quiere contar");
        for (int i = 1; i < limite; i++) {
            System.out.println("Estoy dando la vuelta " + i);
        }

    }
}
