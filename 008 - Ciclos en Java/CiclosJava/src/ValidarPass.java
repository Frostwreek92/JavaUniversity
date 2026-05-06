import java.util.Scanner;

public class ValidarPass {
    public static void main(String[] args) {
        System.out.println("*** Sistema Comprobador de Contraseña ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Introduce una contraseña con minimo 6 caracteres: ");
        String pass = consola.nextLine();

        while (pass.length() < 6) {
            System.out.print("""
                    Contraseña no valida!!
                    Vuelve a introducir la contraseña:\s""");
            pass = consola.nextLine();
        }

        System.out.println("""
                Contraseña valida!!
                Fin del programa.""");
    }
}
