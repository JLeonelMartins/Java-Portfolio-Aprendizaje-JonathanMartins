package ProgramacionOrientadaAObjetos;

import java.util.Scanner;

public class AgendaElectronica {
    public static void main(String[] args) {

        String dni[] = new String[10];
        String nombre[] = new String[10];
        String apellido[] = new String[10];
        String telefono[] = new String[10];
        String fechaNacimiento[] = new String[10];
        String direccion[] = new String[10];

        String flag = "";
        String dniBuscado = "";

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre: ");
            nombre[i] = teclado.nextLine();
            System.out.println("Ingrese el apellido: ");
            apellido[i] = teclado.nextLine();
            System.out.println("Ingrese el dni: ");
            dni[i] = teclado.nextLine();
            System.out.println("Ingrese el telefono: ");
            telefono[i] = teclado.nextLine();
            System.out.println("Ingrese el fecha de nacimiento: ");
            fechaNacimiento[i] = teclado.nextLine();
            System.out.println("Ingrese el direccion: ");
            direccion[i] = teclado.nextLine();
        }

        while (!flag.equalsIgnoreCase("finish")) {

            System.out.println("Ingrese el dni de la persona que desea buscar");
            dniBuscado = teclado.nextLine();
            for (int i = 0; i < dni.length; i++) {
                if (dniBuscado.equals(dni[i])) {
                    System.out.println("Datos cargados de dicha persona:");
                    System.out.println("Nombre: " + nombre[i]);
                    System.out.println("Apellido: " + apellido[i]);
                    System.out.println("DNI: " + dni[i]);
                    System.out.println("Telefono: " + telefono[i]);
                    System.out.println("Fecha de nacimiento: " + fechaNacimiento[i]);
                    System.out.println("Direccion: " + direccion[i]);
                }
            }
            System.out.println("Desea buscar a otra persona?. Ingrese finish para terminar o cualquier valor para seguir");
            flag = teclado.next();
        }
    }
}
