import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        // Titulo, escaner y constantes
        System.out.println("*** Sistema de envíos ***");
        Scanner consola = new Scanner(System.in);
        final double NACIONAL = 10.0;
        final double INTERNACIONAL = 20.0;

        // Peticion de datos y variables
        System.out.print("Destino de paquete (nacional o internacional): ");
        String lugarEnvio = consola.nextLine().strip().toLowerCase();
        System.out.print("Peso del paquete en kilos: ");
        double peso = Double.parseDouble(consola.nextLine());
        double precioFinal = 0;

        switch (lugarEnvio) {
            case "nacional" -> precioFinal = peso * NACIONAL;
            case "internacional" -> precioFinal = peso * INTERNACIONAL;
            default -> System.out.println("No has introducido bien el destino");
        }

        System.out.printf("El precio final del envio para destino %s, es de %.2f€", lugarEnvio, precioFinal);
        consola.close();
    }
}
