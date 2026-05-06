package prueba;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        // Ruta del archivo relativa
        String rutaArchivo = System.getProperty("user.dir") + "/src/prueba/";

        // Nombre del archivo
        String nombreArchivo = "mi_archivo.txt";

        // Crear el archivo con la ruta del archivo + nombre
        File archivo = new File(rutaArchivo + nombreArchivo);

        try {
            if (archivo.exists()) { // Comprobar si el archivo existe y enviar mensaje
                System.out.println("El archivo ya existe");
            } else {
                // Crear el archivo
                PrintWriter salida = new PrintWriter(new FileWriter(archivo));

                // Se debe cerrar siempre el flujo de lo que se crea
                salida.close();

                // Enviamos mensaje como que se ha creado
                System.out.println("Archivo " + nombreArchivo + "\nCreado en la ruta: " + rutaArchivo);
            }
        } catch (IOException e) {
            System.out.println("Ocurrio un error: " + e);
        }
    }
}
