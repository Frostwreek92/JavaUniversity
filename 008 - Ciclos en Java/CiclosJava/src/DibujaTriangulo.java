import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un triangulo ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Introduce numero de filas: ");
        int numeroFilas = Integer.parseInt(consola.nextLine());

        for (int fila = 1; fila <= numeroFilas; fila++) {
            String espaciosBlanco = " ".repeat(numeroFilas - fila);
            String asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espaciosBlanco + asteriscos);
        }

        consola.close();
    }
}
