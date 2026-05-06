package aaprincipal.opciones_archivos;

import java.io.File;

public class ModificarDirectorio {

    private final File directorio;

    public ModificarDirectorio(String rutaArchivo) {
        this.directorio = new File(rutaArchivo);
    }

    public void crear(String rutaArchivo) {

        try {
            // Si el directorio que le pasamos no existe, entra el programa
            if (!directorio.exists()) {
                boolean creado = directorio.mkdirs(); // Crea todos los directorios necesarios
                if (creado) {
                    System.out.println("Directorio creado: " + rutaArchivo);
                } else {
                    System.out.println("No se pudo crear el directorio.");
                }
            } else {
                System.out.println("El directorio ya está creado");
            }

        } catch (Exception e) {
            System.out.println("No se ha podido crear el directorio: " + e.getMessage());
        }
    }

    public void listar(String rutaArchivo) {

        try {

            if (directorio.exists() && directorio.isDirectory()) {
                File[] archivos = directorio.listFiles(); // Lista los archivos en un array

                if (archivos != null && archivos.length > 0) { // Si es diferente de vacío y mayor de 0
                    System.out.println("Archivos encontrados en: " + rutaArchivo);

                    for (File archivo: archivos) { // Recorre archivos

                        if (archivo.isFile()) {
                            System.out.println("\t- " + archivo.getName());
                        }
                    }
                } else {
                    System.out.println("La carpeta está vacía");
                }
            } else {
                System.out.println("No existe la ruta o no es una carpeta");
            }

        } catch (Exception e) {
            System.out.println("No se ha podido listar el directorio: " + e.getMessage());
        }

    }

    public void eliminar(String rutaArchivo) {

        try {
            if (directorio.exists() && directorio.isDirectory()) {
                if (directorio.delete()) {
                    System.out.println("Directorio eliminado: " + rutaArchivo);
                } else {
                    System.out.println("No se ha eliminado el directorio");
                }
            } else {
                System.out.println("No existe el directorio");
            }

        } catch (Exception e) {
            System.out.println("No se ha podido eliminar el directorio: " + e.getMessage());
        }

    }
}
