public class NumerosParesFor {
    public static void main(String[] args) {
        System.out.println("*** Numeros Pares con Ciclo For en Java ***");

        for (int variable = 0; variable <= 20; variable++) {
            if (variable % 2 == 0 && variable != 0) {
                System.out.print(variable + " ");
            }
        }
    }
}
