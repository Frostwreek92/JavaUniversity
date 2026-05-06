package prueba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        // Ruta del archivo relativa
        String rutaArchivo = System.getProperty("user.dir") + "/src/prueba/";

        // Nombre del archivo
        String nombreArchivo = "mi_archivo.txt";

        // Crear el archivo con la ruta del archivo + nombre
        File archivo = new File(rutaArchivo + nombreArchivo);

        try {
            System.out.println("Contenido del archivo:");

            // Abrimos el archivo para su lectura
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));

            // Crear la primera linea a leer
            String linea = entrada.readLine();

            // Leer linea a linea hasta que sea null
            while (linea != null) {
                System.out.println(linea);
                // Antes que se cierre el ciclo, se lee la siguiente linea y se almacena el valor
                linea = entrada.readLine();
            }

            // Cerramos la entrada del archivo leido
            entrada.close();
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e.getMessage());
            e.printStackTrace();
        }

    }
}
