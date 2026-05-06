package archivos;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class EliminarLineaArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "mi_archivo.txt";

        try (Scanner scanner = new Scanner(System.in)) {
            // Leer todas las líneas del archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));

            if (lineas.isEmpty()) {
                System.out.println("El archivo está vacío.");
                return;
            }

            // Mostrar las líneas con numeración para que el usuario elija
            System.out.println("Contenido actual del archivo:");
            for (int i = 0; i < lineas.size(); i++) {
                System.out.printf("%d: %s%n", i + 1, lineas.get(i));
            }

            // Solicitar al usuario la línea a eliminar
            System.out.print("Ingresa el número de línea que deseas eliminar: ");
            int numeroLineaEliminar = scanner.nextInt();

            // Validar entrada
            if (numeroLineaEliminar <= 0 || numeroLineaEliminar > lineas.size()) {
                System.out.println("Número de línea inválido.");
                return;
            }

            // Eliminar línea
            String lineaEliminada = lineas.remove(numeroLineaEliminar - 1);

            // Reescribir el archivo
            Files.write(Paths.get(nombreArchivo), lineas);
            System.out.println("Línea eliminada correctamente: \"" + lineaEliminada + "\"");
        } catch (IOException e) {
            System.out.println("Error al modificar el archivo: " + e.getMessage());
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor ingresa un número.");
        }
    }
}
