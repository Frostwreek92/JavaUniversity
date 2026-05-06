import java.util.Scanner;

public class SistemaTiendaEnLinea {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Linea con Descuentos ***");
        Scanner consola = new Scanner(System.in);
        final var MINIMO_COMPRA_DESCUENTO = 1000.00;
        String mensaje = "";
        double descuento, restoDescuento, resultadoFinal;

        // Pedir datos al cliente
        System.out.print("Cual fue el monto de tu compra? ");
        var valorCompra = Double.parseDouble(consola.nextLine());
        System.out.print("Eres miembro de la tienda (true / false)? ");
        var miembroTienda = Boolean.parseBoolean(consola.nextLine());

        // Calcular si tiene descuento y es miembro
        if (valorCompra >= MINIMO_COMPRA_DESCUENTO && miembroTienda) {
            descuento = 10;
            restoDescuento = valorCompra / descuento;
            resultadoFinal = valorCompra - restoDescuento;
            mensaje = """
                    \nFelicidades!, has obtenido un descuento del %.0f %%
                    Monto de la compra: $%.2f
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2f
                    """.formatted(descuento, valorCompra, restoDescuento, resultadoFinal);
        } else if (miembroTienda) {
            descuento = 5;
            restoDescuento = valorCompra / descuento;
            resultadoFinal = valorCompra - restoDescuento;
            mensaje = """
                    %nFelicidades!, has obtenido un descuento del %.0f %%
                    Monto de la compra: $%.2f
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2f
                    """.formatted(descuento, valorCompra, restoDescuento, resultadoFinal);
        } else {
            mensaje = """
                    %nNo obtuviste ningún tipo de descuento
                    Te invitamos a hacerte miembro de la tienda
                    Monto final de la compra: $ %.2f
                    """.formatted(valorCompra);
        }

        // Imprimir mensaje por pantalla
        System.out.println(mensaje);

        // Cerrar Scanner
        consola.close();
    }
}
