import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Pedir datos usuario
        System.out.println("*** Sistema Generador de ID Único ***");
        System.out.print("Introduce tu nombre: ");
        var nombre = scanner.nextLine();
        System.out.print("Introduce tu apellido: ");
        var apellido = scanner.nextLine();
        System.out.print("Introduce tu año de nacimiento (YYYY): ");
        var anyoNacimiento = scanner.nextLine();
        scanner.close();

        // Generar numero aleatorio
        var aleatorio = random.nextInt(9999)+1;

        // Información para usuarioID
        var inicialNombre = nombre.trim().toUpperCase().substring(0, 2);
        var inicialApellido = apellido.trim().toUpperCase().substring(0, 2);
        var inicialAnyo = anyoNacimiento.trim().substring(2);
        var aleatorioFormateado = String.format("%04d", aleatorio);

        var idGenerado = inicialNombre + inicialApellido + inicialAnyo + aleatorioFormateado;

        // Mostrar Informacion con ID unico del Usuario
        System.out.printf("""
                Hola %s,
                \tTu nuevo numero de identificación (ID) generado por el sistema es:
                \t%s
                \tFelicidades!
                """.formatted(nombre, idGenerado));
    }
}
