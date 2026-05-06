public class AcumuladorWhile {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio Acumulador Suma ***");
        final int MAXIMO = 5;
        int numero = 1, resultado = 0;

        while (numero <= MAXIMO) {
            System.out.print("Sumatorio actual " + numero + " + " + resultado + " = ");
            resultado += numero;
            System.out.println(resultado);
            numero++;
        }

        System.out.println("La suma de los " + MAXIMO + " primeros números = " + resultado);
    }
}
