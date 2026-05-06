public class AcumuladorFor {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio Acumulador Suma For ***");
        final int MAXIMO = 5;
        int resultado = 0;

        for (int contador = 1; contador <= MAXIMO; contador++) {
            System.out.print("Sumatorio actual " + contador + " + " + resultado + " = ");
            resultado += contador;
            System.out.println(resultado);
        }
    }
}
