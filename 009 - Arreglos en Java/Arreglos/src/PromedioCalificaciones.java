import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de Calificaciones ***");
        Scanner consola = new Scanner(System.in);

        // Introducir tamaño del array
        System.out.print("\nCuantas calificaciones quieres añadir? ");
        int tamanyoCalificaciones = Integer.parseInt(consola.nextLine());

        // Introducir las notas
        int [] calificaciones = new int[tamanyoCalificaciones];

        for (int contador = 0; contador < tamanyoCalificaciones; contador++) {
            System.out.print("Introduce calificacion[" + contador + "]: ");
            calificaciones[contador] = Integer.parseInt(consola.nextLine());
        }

        // Calculador del promedio
        double promedio = 0;
        for (int contador = 0; contador < tamanyoCalificaciones; contador++) {
            promedio += calificaciones[contador];
        }
        promedio = promedio / tamanyoCalificaciones;

        System.out.printf("\nEl promedio es de = %.2f", promedio);

        consola.close();
    }
}
