package EjerciciosLogicos;

import java.util.Scanner;

public class EjerciciosLogicos6 {
    public static void main(String[] args) {


        String nombre;
        int edad;
        int dni;
        String categoria = "";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese su DNI: ");
        dni = teclado.nextInt();
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();

        while (dni != 0 && !nombre.equalsIgnoreCase("fin")) {

            if (edad >= 6 && edad <= 10) {
                categoria = "Menores A";
                System.out.println("La categoria es: " + categoria);
            } else if (edad >= 11 && edad <= 17) {
                categoria = "Menores B";
                System.out.println("La categoria es: " + categoria);
            } else if (edad >= 18 && edad <= 30) {
                categoria = "Juveniles";
                System.out.println("La categoria es: " + categoria);
            } else if (edad >= 31 && edad <= 50) {
                categoria = "Adultos";
                System.out.println("La categoria es: " + categoria);
            } else if (edad >= 51) {
                categoria = "Adultos mayores";
                System.out.println("La categoria es: " + categoria);
            } else {
                System.out.println("La persona no cuenta con la edad indicada");
            }

            //System.out.println("Persona registrada \nNombre: " + nombre + "\nDNI: " + dni + "\nEdad: " + edad + "\nCategoria: " + categoria + "\n");

            teclado.nextLine();
            System.out.println("Ingrese su nombre: ");
            nombre = teclado.nextLine();
            System.out.println("Ingrese su DNI: ");
            dni = teclado.nextInt();
            System.out.println("Ingrese su edad: ");
            edad = teclado.nextInt();

        }

    }
}
