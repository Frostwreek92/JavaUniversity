package aaprincipal.objetos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioObjetosArchivos {

    String rutaArchivo = System.getProperty("user.dir") + "/src/aaprincipal/archivo/";

    private final String NOMBRE_ARCHIVO = "mi_archivo.txt";

    private List<Objeto> objetos = new ArrayList<>();

    public ServicioObjetosArchivos() {
        File archivo = new File(rutaArchivo + NOMBRE_ARCHIVO);

        boolean existe = false;

        try {
            existe = archivo.exists();

            if (existe) {
                this.objetos = obtenerObjetos();
            } else {
                PrintWriter salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo");
            }
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }

        if (!existe) {
            cargarObjetosIniciales();
        }
    }

    private List<Objeto> obtenerObjetos() {
        ArrayList objetos = new ArrayList<>();

        try {
            List<String> lineas = Files.readAllLines(Paths.get(rutaArchivo + NOMBRE_ARCHIVO));

            for (String linea: lineas) {
                String[] lineaObjeto = linea.split(",");
                int idObjeto = Integer.parseInt(lineaObjeto[0]);
                String nombre = lineaObjeto[1];
                double precio = Double.parseDouble(lineaObjeto[2]);

                Objeto objeto = new Objeto(nombre, precio);

                objetos.add(objeto);
            }
        } catch (Exception e) {
            System.out.println("Excepcion al obtener objetos: " + e.getMessage());
        }
        return objetos;
    }

    private void cargarObjetosIniciales() {
        this.agregarObjeto(new Objeto("Moto", 4000.00));
        this.agregarObjeto(new Objeto("Patatas", 2.63));
    }

    public void agregarObjeto (Objeto objeto) {
        this.objetos.add(objeto);
        this.agregarObjetoArchivo(objeto);
    }

    private void agregarObjetoArchivo (Objeto objeto) {
        File archivo = new File(rutaArchivo + NOMBRE_ARCHIVO);
        boolean anexar = false;

        try {
            anexar = archivo.exists();
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(objeto.escribirObjeto());
            salida.close();
        } catch (Exception e) {
            System.out.println("Fallo al agregar el objeto: " + e.getMessage());
        }
    }

    public void mostrarObjetos() {
        System.out.println("--- Inventario de Objetos ---");
        String inventarioObjetos = "";
        for (Objeto objeto: this.objetos) {
            inventarioObjetos += objeto.toString() + "\n";
        }
        System.out.println(inventarioObjetos);
    }
}
