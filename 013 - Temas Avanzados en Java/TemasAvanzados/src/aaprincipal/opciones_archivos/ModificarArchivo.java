package aaprincipal.opciones_archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ModificarArchivo {

    private final File archivo;
    boolean existeArchivo = false;

    public ModificarArchivo(String rutaConNombre) {

        this.archivo = new File(rutaConNombre);
    }

    public void crear() {

        try {

            if (!archivo.exists()) {
                PrintWriter salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (Exception e) {
            System.out.println("Fallo al crear el archivo: " + e.getMessage());
        }
    }

    public void modificar(Scanner consola, String rutaConNombre) {

        try {

            existeArchivo = archivo.exists();

            if (existeArchivo) {

                System.out.print("""
                Quieres añadir o eliminar contenido:
                \t1. Mostrar contenido
                \t2. Añadir contenido
                \t3. Eliminar contenido
                \nSelecciona una opcion:\s""");

                int opcion = Integer.parseInt(consola.nextLine());

                switch (opcion) {
                    case 1 -> mostrarContenido(rutaConNombre);
                    case 2 -> anyadirContenido(consola);
                    case 3 -> eliminarContenido(consola, rutaConNombre);
                    default -> System.out.println("No has elegido una de las opciones correctas");
                }

            } else {
                System.out.println("No existe el archivo para poder interactuar");
            }

        } catch (Exception e) {
            System.out.println("No se ha podido modificar el archivo: " + e.getMessage());
        }

    }

    private void mostrarContenido(String rutaConNombre) {

        try {

            List<String> lineas = Files.readAllLines(Paths.get(rutaConNombre));
            if (lineas.isEmpty()) {
                System.out.println("El archivo esta vacio");
            } else {
                System.out.println("Contenido del archivo:\n");
                lineas.forEach(System.out::println);
            }


        } catch (Exception e) {
            System.out.println("Error al mostrar contenido: " + e.getMessage());
        }
    }

    private void anyadirContenido (Scanner consola) {

        try {

            PrintWriter salida = new PrintWriter(new FileWriter(archivo, existeArchivo));
            System.out.println("Introduce texto para añadir (pulsar intro termina lo que se añade):");
            String texto = consola.nextLine();
            salida.println(texto);
            salida.close();
            System.out.println("Se agrego contenido al archivo");

        } catch (Exception e) {
            System.out.println("No se ha podido modificar el archivo: " + e.getMessage());
        }
    }

    private void eliminarContenido (Scanner consola, String rutaConNombre) {

        try {

            List<String> lineas = Files.readAllLines(Paths.get(rutaConNombre));

            if (lineas.isEmpty()) {
                System.out.println("El archivo esta vacio.");
            } else {

                System.out.println("Contenido actual del archivo:");
                for (int i = 0; i < lineas.size(); i++) {
                    System.out.printf("%d: %s%n", i+1, lineas.get(i));
                }

                System.out.print("Escribe el numero de la linea a borrar: ");
                int numeroLineaEliminar = Integer.parseInt(consola.nextLine());

                lineas.remove(numeroLineaEliminar - 1);
                Files.write(Paths.get(rutaConNombre), lineas);
                System.out.println("Se ha eliminado la linea deseada");

            }

        } catch (Exception e) {
            System.out.println("No se ha podido eliminar contenido del archivo: " + e.getMessage());
        }

    }

    public void eliminar () {

        try {

            if (archivo.exists()) {
                if (archivo.delete()) {
                    System.out.println("Se ha eliminado el archivo");
                } else {
                    System.out.println("No se ha podido eliminar el archivo");
                }
            } else {
                System.out.println("El archivo no existe.");
            }

        } catch (Exception e) {
            System.out.println("No se ha podido eliminar el archivo: " + e.getMessage());
        }

    }
}
