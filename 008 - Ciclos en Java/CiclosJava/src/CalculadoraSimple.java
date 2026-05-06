import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        float operando1 = 0, operando2 = 0, resultado, resto;
        boolean salir = false;

        while (!salir) {
            System.out.print("""
                    *** Calculadora ***
                    Menu:
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    Introduce una opcion:\s""");
            int opcion = Integer.parseInt(consola.nextLine());

            if (opcion <= 4 && opcion >= 1) {
                System.out.print("Operando 1: ");
                operando1 = Float.parseFloat(consola.nextLine());
                System.out.print("Operando 2: ");
                operando2 = Float.parseFloat(consola.nextLine());
            }

            switch (opcion) {
                case 1 -> {
                    resultado = operando1 + operando2;
                    System.out.printf("%.2f + %.2f = %.2f%n%n", operando1, operando2, resultado);
                }
                case 2 -> {
                    resultado = operando1 - operando2;
                    System.out.printf("%.2f - %.2f = %.2f%n%n", operando1, operando2, resultado);
                }
                case 3 -> {
                    resultado = operando1 * operando2;
                    System.out.printf("%.2f x %.2f = %.2f%n%n", operando1, operando2, resultado);
                }
                case 4 -> {
                    if (operando2 != 0) {
                        resultado = operando1 / operando2;
                        resto = operando1 % operando2;
                        System.out.printf("%.2f / %.2f = %.2f con resto %.2f%n%n", operando1, operando2, resultado, resto);
                    } else {
                        System.out.println("No se puede dividir entre 0\n");
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo del programa");
                    salir = true;
                }
                default -> System.out.println("Introduce una de las opciones anteriores\n");
            }
        }

        consola.close();
    }
}
