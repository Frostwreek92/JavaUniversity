import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Calificaciones ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Introduce un número entre 0 y 10: ");
        double nota = Double.parseDouble(consola.nextLine());
        String letraNota;

        if (nota >= 9 && nota <= 10) {
            letraNota = "A";
        } else if (nota >= 8 && nota < 9) {
            letraNota = "B";
        } else if (nota >= 7 && nota < 8) {
            letraNota = "C";
        } else if (nota >= 6 && nota < 7) {
            letraNota = "D";
        } else if (nota >= 0 && nota < 6) {
            letraNota = "F";
        } else {
            letraNota = "Valor desconocido";
        }

        System.out.printf("Con la nota %.2f tu letra de nota es: %s", nota, letraNota);
    }
}
