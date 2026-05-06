public class HotelConReservas {
    public static void main(String[] args) {
        System.out.println("*** Reserva para el Hotel ***");
        String nombreCliente;
        int diasEstancia;
        final double tarifaDiaria = 3.5;
        double tarifaTotal;
        boolean vistasMar;

        nombreCliente = "Manuel Santillana";
        diasEstancia = 4;
        tarifaTotal = diasEstancia * tarifaDiaria;
        vistasMar = true;

        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tarifaTotal = " + tarifaTotal);
        System.out.println("vistasMar = " + vistasMar);
        System.out.println();

        nombreCliente = "Hector Sinclaire";
        diasEstancia = 8;
        tarifaTotal = diasEstancia * tarifaDiaria;
        vistasMar = false;

        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tarifaTotal = " + tarifaTotal);
        System.out.println("vistasMar = " + vistasMar);
    }
}
