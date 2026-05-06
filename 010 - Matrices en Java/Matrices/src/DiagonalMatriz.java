import java.util.Scanner;

public class DiagonalMatriz {
    public static void main(String[] args) {
        // Titulo y variables
        System.out.println("*** Suma de la Diagonal de una Matriz Dinamica ***");
        Scanner consola = new Scanner(System.in);
        int filas, columnas, diagonal = 0;
        String texto = "La suma de la diagonal:";

        // Pedido datos filas y columnas
        System.out.print("Introduce numero de filas: ");
        filas = Integer.parseInt(consola.nextLine());
        System.out.print("Introduce numero de columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        int [][] matriz = new int[filas][columnas];

        // Pedido datos para la matriz
        System.out.println();
        for (int fil = 0; fil < filas; fil++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print("Introduce el valor para matriz[" + fil + "][" + col + "] : ");
                matriz[fil][col] = Integer.parseInt(consola.nextLine());
            }
        }

        System.out.println();
        // Sumatorio de la diagonal de la matriz
        for (int fil = 0; fil < filas; fil++) {
            for (int col = 0; col < columnas; col++) {
                if (col == fil) {
                    diagonal += matriz[fil][col];
                    texto += " matriz[" + fil + "][" + col + "]: " + matriz[fil][col] + ",";
                }
            }
        }

        // Acabar de sumar al texto e imprimir resultado
        texto += " = " + diagonal;
        System.out.println(texto);

        consola.close();
    }
}
