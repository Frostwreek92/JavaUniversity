package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks() {
        boolean salir = false;
        Scanner consola = new Scanner(System.in);

        // Creamos la lista de productos de tipo snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnacks(); // Mostrar inventario de snacks disponibles

        while (!salir) {
            try {
                int opcion = mostrarMenu(consola);
                salir = ejecutaropciones(opcion, consola, productos);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            finally {
                System.out.println(); // Imprime un salto de linea con cada iteracion
            }
        }
    }

    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                Menu:
                1. Comprar Snack
                2. Mostrar ticket
                3. Agregar Nuevo Snack
                4. Salir
                Elige una opción:\s""");
        // Leemos y retornamos la opcion seleccionada
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutaropciones(int opcion, Scanner consola, List<Snack> productos) {
        boolean salir = false;
        switch (opcion) {
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                System.out.println("Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida: " + opcion);
        }
        return salir;
    }

    private static void comprarSnack(Scanner consola, List<Snack> productos) {
        System.out.print("Que snack quieres comprar (id)? ");
        int idSnack = Integer.parseInt(consola.nextLine());

        // Validar que el snack exista en la lista de snacks
        boolean snackEncontrado = false;
        for (Snack snack: Snacks.getSnacks()) {
            if (idSnack == snack.getIdSnack()) {
                // Agregamos el snack a la lista de productos
                productos.add(snack);
                System.out.println("Ok, Snack agregado: " + snack);
                snackEncontrado = true;
                break;
            }
        }

        if (!snackEncontrado) {
            System.out.println("Id de snack no encontrado: " + idSnack);
        }
    }

    private static void mostrarTicket (List<Snack> productos) {
        StringBuilder ticket = new StringBuilder("*** Ticket de Venta ***");
        double total = 0.0;
        for (Snack producto: productos) {
            ticket.append("\n\t- ").append(producto.getNombre()).append(" - $").append(producto.getPrecio());
            total += producto.getPrecio();
        }
        ticket.append("\n\tTotal -> $").append(total);
        System.out.println(ticket);
    }

    private static void agregarSnack (Scanner consola) {
        System.out.print("Nombre del snack: ");
        String nombre = consola.nextLine();
        System.out.print("Precio del snack: ");
        double precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Tu snack se ha agregado correctamente");
        Snacks.mostrarSnacks();
    }
}
