import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("*** Bienvenidos al Sistema Bancario ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Deseas salir del sistema (true / false)?: ");
        var salirSistema = Boolean.getBoolean(consola.nextLine());

        // Verificamos (aplicando lógica inversa)
        if (!salirSistema) {
            System.out.println("Continuamos dentro del sistema...");
        } else {
            System.out.println("Saliendo de sistema...");
        }

        consola.close();
    }
}
