package ProgramacionOrientadaAObjetos.reservaAsientos;

import java.util.ArrayList;
import java.util.Scanner;

public class ReservaAsientos {
    public static void main(String[] args) {



        String matriz[][] = new String[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = "[L]";
            }
        }

        Scanner teclado = new Scanner(System.in);


        int fila = 0;
        int asiento = 0;
        int numeroTicket = 0;
        int precio = 500;
        int idCliente = 0;
        int dni = 0;
        String nombreCliente = "";
        String apellidoCliente = "";
        ArrayList<Ticket> listaTickets = new ArrayList<>();

        String flag = "";

        while (!flag.equalsIgnoreCase("fin")) {
            System.out.println("------------Bienvenido!!!-----------------");
            System.out.println("------------Cine Martins------------------");
            System.out.println("Este es el mapa actual de asientos:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Ingrese la fila que desea: ");
            fila = teclado.nextInt();

            if (fila >= 0 && fila < matriz.length) {

                System.out.println("Ingrese el asiento que desea: ");
                asiento = teclado.nextInt();

                if (asiento >= 0 && asiento < matriz[fila].length) {

                    if (matriz[fila][asiento].equals("[L]")) {
                        matriz[fila][asiento] = "[X]";
                        System.out.println("Asiento reservado con exito");
                        numeroTicket++;
                        System.out.println("Ingrese su nombre: ");
                        nombreCliente = teclado.next();
                        System.out.println("Ingrese su apellido: ");
                        apellidoCliente = teclado.next();
                        System.out.println("Ingrese su dni: ");
                        dni = teclado.nextInt();
                        idCliente++;
                        Cliente cliente = new Cliente(idCliente, dni, nombreCliente, apellidoCliente);
                        Ticket  ticket = new Ticket(numeroTicket, "11/10/2025", "11/10/2025", precio, fila, asiento, cliente);
                        listaTickets.add(ticket);
                        System.out.println("Aqui tiene su ticket: " + ticket);
                        System.out.println("Si desea continuar reservando ingrese cualquier valor, para salir ingrese fin");
                        flag = teclado.next();
                    } else {
                        System.out.println("Asiento ocupado, por favor ingrese otro asiento.");
                    }
                } else {
                    System.out.println("Numero de asiento inexistente, ingrese un valor de 0 a 9");
                }
            } else {
                System.out.println("Fila inexistente, ingrese un valor del 0 al 9");
            }


        }


    }
}
