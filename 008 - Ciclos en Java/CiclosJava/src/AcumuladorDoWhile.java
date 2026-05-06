public class AcumuladorDoWhile {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio Acumulador Suma Do While ***");
        final int MAXIMO = 5;
        int numero = 1, resultado = 0;

        do {
            System.out.print("Sumatorio actual " + numero + " + " + resultado + " = ");
            resultado += numero;
            System.out.println(resultado);
            numero++;
        } while (numero <= MAXIMO);

        System.out.println("La suma de los " + MAXIMO + " primeros números = " + resultado);
    }
}
