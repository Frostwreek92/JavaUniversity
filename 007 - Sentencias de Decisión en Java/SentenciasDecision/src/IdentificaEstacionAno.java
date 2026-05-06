import java.util.Scanner;

public class IdentificaEstacionAno {
    public static void main(String[] args) {
        System.out.println("*** Identifica la Estacion del Año ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Introduce numero del mes: ");
        int numeroMes = Integer.parseInt(consola.nextLine());
        String estacion;

        if (numeroMes == 1 || numeroMes == 2 || numeroMes == 12) {
            estacion = "Invierno";
        } else if (numeroMes == 3 || numeroMes == 4 || numeroMes == 5) {
            estacion = "Primavera";
        } else if (numeroMes == 6 || numeroMes == 7 || numeroMes == 8) {
            estacion = "Verano";
        } else if (numeroMes == 9 || numeroMes == 10 || numeroMes == 11) {
            estacion = "Otoño";
        } else {
            estacion = "Desconocida";
        }

        System.out.printf("Para el mes %d, la estacion es: %s".formatted(numeroMes, estacion));

        consola.close();
    }
}
