package EjerciciosLogicos;

public class EjerciciosLogicos1 {
    public static void main(String[] args) {

       int numero1 = 35;
       int numero2 = 20;
       int auxiliar;

        System.out.println("El numero1 es " + numero1 +" y el numero2 es " + numero2);
        auxiliar = numero1;
        numero1 = numero2;
        numero2 = auxiliar;
        System.out.println("Ahora el numero1 es " + numero1 +" y el numero2 es " + numero2);

    }
}
