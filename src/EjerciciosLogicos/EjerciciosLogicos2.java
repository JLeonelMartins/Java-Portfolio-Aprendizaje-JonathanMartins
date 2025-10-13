package EjerciciosLogicos;

import java.util.Scanner;

public class EjerciciosLogicos2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double salario;
        int categoria;

        System.out.println("Ingrese la categoria deseada");
        System.out.println("1-Repositores \n2-Cajero \n3-Supervisor");
        categoria = scanner.nextInt();
        switch (categoria) {
            case 1:
                salario = 15890 + (15890 * 0.10);
                System.out.println("La categoria ingresada es Repositor y su salario es de " + salario);
                break;
            case 2:
                salario = 25630;
                System.out.println("La categoria ingresada es Cajero y su salario es de " + salario);
                break;
            case 3:
                salario = 35560 - (35560.20 * 0.11);
                System.out.println("La categoria ingresada es Supervisor y su salario es de " + salario);
                break;
            default:
                System.out.println("Ingrese un numero valido");
                break;
        }



    }
}
