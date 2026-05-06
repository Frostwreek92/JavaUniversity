package aaprincipal;

import aaprincipal.opciones_archivos.ModificarArchivo;
import aaprincipal.opciones_archivos.ModificarDirectorio;

import java.util.Scanner;

public class ClaseMain {
    public static void main(String[] args) {

        inicioPrograma();

    }

    public static void inicioPrograma () {
        // Variables e iniciadores
        Scanner consola = new Scanner(System.in);
        int opcionSwitch;
        boolean salir = false;


        // Ruta del archivo relativa
        String rutaRelativa = System.getProperty("user.dir") + "/src/aaprincipal/";
        String rutaArchivo = rutaRelativa + "archivo/";
        final String NOMBRE_ARCHIVO = "mi_archivo.txt";
        String rutaConNombre = rutaArchivo + NOMBRE_ARCHIVO; // Usado para los archivos con las pruebas

        // Clases que se usaran de otro lado del paquete
        ModificarDirectorio modificarDirectorio = new ModificarDirectorio(rutaArchivo);
        ModificarArchivo modificarArchivo = new ModificarArchivo(rutaConNombre);

        while (!salir) {

            try {

                opcionSwitch = eleccionOpcion(consola);

                salir = ejecutarOpcion(opcionSwitch,
                        rutaArchivo,
                        salir,
                        modificarDirectorio,
                        modificarArchivo,
                        consola,
                        rutaConNombre);

            } catch (Exception e) {
                System.out.println("No ha podido iniciarse el programa: " + e.getMessage());
            }

        }
    }

    private static int eleccionOpcion (Scanner consola) {
        int opcion;

        System.out.print("""
                \nElige una de las opciones:
                \n\tSin peligro:
                \t1. Crear Directorio
                \t2. Listar Archivos en directorio Archivo
                \t3. Crear Archivo
                \t4. Modificar contenido Archivo
                \n\tPeligrosas de uso
                \t5. Eliminar Directorio
                \t6. Eliminar Archivo
                \n\t7. Salir
                \nElige una opcion:\s""");
        opcion = Integer.parseInt(consola.nextLine());
        System.out.println();

        return opcion;
    }

    private static boolean ejecutarOpcion (int opcionSwitch,
                                           String rutaArchivo,
                                           boolean salir,
                                           ModificarDirectorio modificarDirectorio,
                                           ModificarArchivo modificarArchivo,
                                           Scanner consola,
                                           String rutaConNombre) {

        switch (opcionSwitch) {
            case 1 -> modificarDirectorio.crear(rutaArchivo);
            case 2 -> modificarDirectorio.listar(rutaArchivo);
            case 3 -> modificarArchivo.crear();
            case 4 -> modificarArchivo.modificar(consola, rutaConNombre);
            case 5 -> modificarDirectorio.eliminar(rutaArchivo);
            case 6 -> modificarArchivo.eliminar();
            case 7 -> {
                System.out.println("Saliendo del programa...");
                salir = true;
            }
            default -> System.out.println("\nIntroduce una opcion diferente: " + opcionSwitch);
        }

        return salir;
    }

}
