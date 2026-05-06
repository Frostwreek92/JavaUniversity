import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        // Introducir valores a un arreglo
        Scanner consola = new Scanner(System.in);
        // Declarar el arreglo
        System.out.print("Introduce el tamaño del arreglo: ");
        int largoArreglo = Integer.parseInt(consola.nextLine());
        // Creamos de manera dinamica el arreglo
        int [] enteros = new int[largoArreglo];
        // Solicitar los valores del arreglo
        for (int contador = 0; contador < largoArreglo; contador++) {
            System.out.print("Proporciona enteros[" + contador + "] = ");
            enteros[contador] = Integer.parseInt(consola.nextLine());
        }
        // Imprimir los valores del arreglo
        System.out.println("\nImpresion del arreglo:");
        for (int contador = 0; contador < largoArreglo; contador++) {
            System.out.println("El valor de enteros[" + contador + "] = " + enteros[contador]);
        }
    }
}
