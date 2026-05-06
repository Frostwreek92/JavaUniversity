import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        // Titulo y constantes
        System.out.println("*** Sistema de Autenticacion ***");
        final String USER = "admin";
        final String PASS = "123";
        Scanner consola = new Scanner (System.in);

        // Variables por Scanner
        System.out.print("Introduce usuario: ");
        String user = consola.nextLine();
        System.out.print("Introduce contraseña: ");
        String pass = consola.nextLine();

        // Comprobacion e impresion de mensaje
        if (user.equals(USER) && pass.equals(PASS)) {
            System.out.println("Ha entrado en el sistema!");
        } else if (!user.equals(USER) && pass.equals(PASS)) {
            System.out.println("Usuario incorrecto");
        } else if (user.equals(USER) && !pass.equals(PASS)) {
            System.out.println("Contraseña incorrecta");
        } else {
            System.out.println("Usuario y contraseña incorrectos");
        }

        consola.close();
    }
}
