package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        boolean anexar = false;
        String nombreArchivo = "mi_archivo.txt";
        File archivo = new File(nombreArchivo);
        try {
            // Revisar si existe el archivo
            anexar = archivo.exists();
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            String nuevoContenido = "Nuevo\ncontenido";
            salida.println(nuevoContenido);
            // Guardamos la informacion en el archivo
            salida.close();
            System.out.println("Se agrego contenido al archivo...");
        } catch (Exception e) {
            System.out.println("Error al escribir al archivo: " + e);
        }

    }
}
