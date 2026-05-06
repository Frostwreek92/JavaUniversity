import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {
        System.out.println("*** Salud Y Fitness ***");

        // Constantes
        final int META_PASOS_DIARIOS = 10000;
        final double CALORIAS_POR_PASO = 0.04; // Valor aproximado en kilocalorias
        Scanner consola = new Scanner(System.in);

        // Variables por consola
        System.out.print("Nombre de usuario: ");
        String nombreUsuario = consola.nextLine();
        System.out.print("Pasos realizados: ");
        int pasosDiarios = Integer.parseInt(consola.nextLine());

        // Creacion de condiciones
        double caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;
        var metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIOS) ?
                "Ha alcanzado la meta de pasos diarios!!" :
                "No ha alcanzado la meta, le faltan: " + (META_PASOS_DIARIOS-pasosDiarios) + " como minimo";

        // Imprimir mensaje final
        System.out.printf("""
                %nEl usuario: %s
                Ha realizado: %d pasos
                Ha quemado: %.2f kilocalorias
                %s
                -----------------------------
                La meta diaria minima es de: %d pasos diarios
                """.formatted(nombreUsuario, pasosDiarios, caloriasQuemadas, metaAlcanzada, META_PASOS_DIARIOS));

        consola.close();
    }
}
