package prueba;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {

        // Creamos una variable para, si existe el archivo, se añada el contenido
        boolean anexar = false;

        // Ruta del archivo relativa
        String rutaArchivo = System.getProperty("user.dir") + "/src/prueba/";

        // Nombre del archivo
        String nombreArchivo = "mi_archivo.txt";

        // Crear el archivo con la ruta del archivo + nombre
        File archivo = new File(rutaArchivo + nombreArchivo);

        try {
            // Si el archivo existe, cambia el valor de anexar, para que se pueda escribir
            anexar = archivo.exists();

            // Si anexar es true, se podrá escribir en el archivo
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));

            // Linea de ejemplo para añadir al archivo de texto
            String nuevoContenido = "La\nPatata\nNo\nSe\nPuede\nPoseer";

            // Escribimos en el archivo la nueva linea de texto
            salida.println(nuevoContenido);

            // Se debe cerrar siempre el flujo de archivo
            salida.close();

            System.out.println("Se ha escrito en el archivo");

        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace();
        }

    }
}
