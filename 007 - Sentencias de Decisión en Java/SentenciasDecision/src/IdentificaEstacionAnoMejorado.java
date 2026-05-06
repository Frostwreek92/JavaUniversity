import java.util.Scanner;

public class IdentificaEstacionAnoMejorado {
    public static void main(String[] args) {
        System.out.println("*** Identifica la Estacion del Año Switch Mejorado ***");
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce numero del mes: ");
        int mes = Integer.parseInt(consola.nextLine());
        String estacion;

        switch (mes) {
            case 1, 2, 12 -> estacion = "Invierno";
            case 3, 4, 5 -> estacion = "Primavera";
            case 6, 7, 8 -> estacion = "Verano";
            case 9, 10, 11 -> estacion = "Otoño";
            default -> estacion = "Estación desconocida";
        }

        System.out.printf("La estación para el mes %d es %s", mes, estacion);

        consola.close();
    }
}
