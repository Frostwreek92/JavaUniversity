import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.print("""
                    *** Sistema de administración de Cuentas ***
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Introduce una de las opciones:\s""");
            opcion = Integer.parseInt(consola.nextLine());
            switch (opcion) {
                case 1 -> System.out.println("Creando cuenta...\n");
                case 2 -> System.out.println("Eliminando cuenta...\n");
                case 3 -> {
                    System.out.println("""
                            Saliendo del sistema...
                            Hasta Pronto!!""");
                    salir = true;
                }
                default -> System.out.println("Introduce una opcion entre 1 y 3\n");
            }
        }
        consola.close();
    }
}
