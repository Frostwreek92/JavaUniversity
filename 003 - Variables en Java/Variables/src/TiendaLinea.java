public class TiendaLinea {
    public static void main(String[] args) {
        // Detalle del producto
        System.out.println("*** Tienda en Linea (Detalle Producto) ***");
        String nombreProducto = "Laptop HP";
        double precioProducto = 1000.50;
        int cantidadDisponible = 15;
        boolean dispobibleVenta = true;

        // Imprimir el detalle del producto
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("dispobibleVenta = " + dispobibleVenta);

        // Modificar los valores
        nombreProducto = "Laptop HP x360 Spectre";
        precioProducto = 900.50;
        cantidadDisponible = 0;
        dispobibleVenta = false;

        System.out.println();
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("dispobibleVenta = " + dispobibleVenta);

    }
}
