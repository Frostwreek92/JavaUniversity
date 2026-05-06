import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hoteles ***");

        // Constantes e inicializacion de variables
        final double CON_VISTAS_MAR = 190.50;
        final double SIN_VISTAS_MAR = 150.50;
        double precioEstadia;
        String infoVistasMar;

        // Solicitar datos al cliente
        Scanner consola = new Scanner(System.in);
        System.out.print("Nombre del cliente: ");
        String nombreCliente = consola.nextLine();
        System.out.print("Dias de estancia: ");
        int diasEstancia = Integer.parseInt(consola.nextLine());
        System.out.print("Quiere vistas al mar? ");
        boolean tieneVistasMar = Boolean.parseBoolean(consola.nextLine());

        // Calcular Estadia y si tiene vistas al mar
        if (tieneVistasMar) {
            precioEstadia = diasEstancia * CON_VISTAS_MAR;
        } else {
            precioEstadia = diasEstancia * SIN_VISTAS_MAR;
        }

        infoVistasMar = tieneVistasMar ? "Si, tiene vistas al mar" : "No, no tiene vistas al mar";

        // Imprimir datos
        System.out.printf("""
                %n--------- Detalles de la Reservación ---------
                  Cliente: %s
                  Días de estadía: %d
                  Costo total: $%.2f
                  Habitación con vistas al mar: %s
                """.formatted(nombreCliente, diasEstancia, precioEstadia, infoVistasMar));

        consola.close();
    }
}
