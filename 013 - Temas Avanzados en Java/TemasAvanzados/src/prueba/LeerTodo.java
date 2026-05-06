package prueba;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        // Ruta del archivo relativa
        String rutaArchivo = System.getProperty("user.dir") + "/src/prueba/";

        // Nombre del archivo
        String nombreArchivo = "mi_archivo.txt";

        try {
            // Creamos una lista para guardar todas las lineas
            List<String> lineas = Files.readAllLines(Paths.get(rutaArchivo + nombreArchivo));

            // 2 formas de leer el archivo
            // Primera forma con un for normal
            for (String linea: lineas) {
                System.out.println(linea);
            }

            // Salto de linea para separarlas
            System.out.println();

            // Segunda forma, con forEach
            lineas.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
            e.printStackTrace();
        }

    }
}
