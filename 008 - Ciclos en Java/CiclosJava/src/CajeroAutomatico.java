import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        double saldo = 1000.00;
        boolean salir = false;

        while (!salir) {
            System.out.print("""
                    *** Aplicacion de Cajero Automatico ***
                    Operaciones que puedes realizar:
                    1. Consultar Saldo
                    2. Retirar Saldo
                    3. Ingresar Saldo
                    4. Salir
                    Escoge una opcion:\s""");
            int opcion = Integer.parseInt(consola.nextLine());

            switch (opcion) {
                case 1 -> System.out.printf("Tu saldo actual es de: %.2f€%n%n", saldo);
                case 2 -> {
                    System.out.print("Introduce Saldo a retirar: ");
                    double retirada = Double.parseDouble(consola.nextLine());
                    if (retirada <= saldo) {
                        saldo -= retirada;
                        System.out.printf("Tu saldo actual es de: %.2f€%n%n", saldo);
                    } else {
                        System.out.printf("El saldo actual (%.2f€) es inferior a lo que quieres retirar (%.2f€)%n%n",saldo, retirada);
                    }
                }
                case 3 -> {
                    System.out.print("Introduce Saldo a ingresar: ");
                    double ingreso = Double.parseDouble(consola.nextLine());
                    saldo += ingreso;
                    System.out.printf("Tu saldo actual es de: %.2f€%n%n", saldo);
                }
                case 4 -> {
                    salir = true;
                    System.out.println("""
                            Saliendo del progrema...
                            Hasta Pronto!!""");
                }
                default -> System.out.println("Escoge una de las opciones anteriores.\n");
            }
        }

        consola.close();
    }
}
