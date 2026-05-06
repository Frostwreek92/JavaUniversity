import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticacion ***");
        // Constantes & Scanner
        final var USUARIO_CORRECTO = "admin";
        final var PASSWORD_CORRECTO = "123";
        Scanner consola = new Scanner(System.in);

        // Datos introducidos por teclado
        System.out.print("Cual es tu usuario? ");
        var usuario = consola.nextLine();
        System.out.print("Cual es tu password? ");
        var password = consola.nextLine();

        // Autenticacion
        var datosCorrectos = usuario.equals(USUARIO_CORRECTO) && password.equals(PASSWORD_CORRECTO);
        System.out.println("Datos son correctos? = " + datosCorrectos);
        consola.close();
    }
}
