package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks {
    private final String NOMBRE_ARCHIVO = "snacks.txt";

    // Crear lista de snacks
    private List<Snack> snacks = new ArrayList<>();

    // Constructor de clase vacio
    public ServicioSnacksArchivos() {
        // Creamos archivo si no existe
        File archivo = new File(NOMBRE_ARCHIVO);
        boolean existe = false;
        try {
            existe = archivo.exists();
            if (existe) {
                this.snacks = obtenerSnacks();
            } else {
                PrintWriter salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo");
            }
        } catch (Exception e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
        // Si no existe, cargamos algunos snacks iniciales
        if (!existe) {
            cargarSnacksIniciales();
        }
    }

    private void cargarSnacksIniciales() {
        this.agregarSnack(new Snack("Papas", 70));
        this.agregarSnack(new Snack("Refresco", 50));
        this.agregarSnack(new Snack("Sandwich", 120));
    }

    private List<Snack> obtenerSnacks() {
        ArrayList snacks = new ArrayList<>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for(String linea: lineas) {
                String[] lineaSnack = linea.split(","); // parseo separado por coma
                int idSnack = Integer.parseInt(lineaSnack[0]); // no se usa
                String nombre = lineaSnack[1];
                double precio = Double.parseDouble(lineaSnack[2]);
                Snack snack = new Snack(nombre, precio);
                snacks.add(snack);// agregamos el snack leido a la lista
            }
        } catch (Exception e) {
            System.out.println("Error al leer archivo snacks: " + e.getMessage());
            e.printStackTrace();
        }
        return snacks;
    }

    @Override
    public void agregarSnack(Snack snack) {
        // Agregamos el nuevo snack
        // 1. Se guarda a la lista de memoria
        this.snacks.add(snack);
        // 2. Guardamos el nuevo snack en el archivo
        this.agregarSnackArchivo(snack);
    }

    private void agregarSnackArchivo(Snack snack) {
        boolean anexar = false;
        File archivo = new File(NOMBRE_ARCHIVO);
        try {
            anexar = archivo.exists();
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(snack.escribirSnack());
            salida.close(); // se escribe la informacion en el archivo, si no, se queda en memoria

        } catch (Exception e) {
            System.out.println("Error al agregar snack: " + e.getMessage());
        }
    }

    @Override
    public void mostrarSnacks() {
        System.out.println("--- Snacks en el Inventario ---");
        // Mostramos la lista de snacks en el archivo
        String inventarioSnacks = "";
        for (var snack: this.snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println(inventarioSnacks);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
