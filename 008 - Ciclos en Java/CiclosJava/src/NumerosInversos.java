public class NumerosInversos {
    public static void main(String[] args) {
        System.out.println("*** Numeros inversos ***");

        int contador = 10;

        do {
            System.out.print(contador);
            contador--;
            if (contador > 0) {
                System.out.print(" ");
            }
        } while (contador > 0);
    }
}
