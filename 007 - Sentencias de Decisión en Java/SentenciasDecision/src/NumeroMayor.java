import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        System.out.println("*** El Mayor de 2 Numeros ***");

        // Pedir numeros por teclado
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int numero1 = Integer.parseInt(consola.nextLine());
        System.out.print("Introduce el segundo numero: ");
        int numero2 = Integer.parseInt(consola.nextLine());

        int mayorNumero = Math.max(numero1, numero2);
        System.out.println("El numero mayor es: " + mayorNumero);

        consola.close();

    }
}
