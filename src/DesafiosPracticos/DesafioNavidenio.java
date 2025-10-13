package DesafiosPracticos;

import java.util.Random;
import java.util.Scanner;

public class DesafioNavidenio {
    public static void main(String[] args) {

        String[] emojis = {"⭐", "🎄", "🎅", "🎁"};
        String[][] matriz = new String[4][4];
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        String eleccionUsuario = "";
        int cantidadAdivinada = 0;
        int cantidadEmojis = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = emojis[random.nextInt(4)];
            }
        }

        System.out.println("\nElegí un emoji (⭐, 🎄, 🎅 o 🎁): ");
        eleccionUsuario = teclado.nextLine();

        System.out.println("¿Cuántas veces creés que aparece ese emoji en la matriz?: ");
        cantidadAdivinada = teclado.nextInt();


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j].equals(eleccionUsuario)) {
                    cantidadEmojis++;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nEl emoji " + eleccionUsuario + " apareció " + cantidadEmojis + " veces.");

        if (cantidadEmojis == cantidadAdivinada) {
            System.out.println("🎉 ¡Acertaste! Excelente memoria navideña 😄");
        } else {
            System.out.println("😅 No acertaste. ¡Seguí intentando!");
        }







    }
}
