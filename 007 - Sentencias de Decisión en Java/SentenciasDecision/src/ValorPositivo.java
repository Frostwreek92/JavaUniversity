import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println("*** Valor Positivo? Negativo? o 0 ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        var numero = Integer.parseInt(consola.nextLine());

        if (numero > 0) {
            System.out.println("El numero es positivo: " + numero);
        } else if (numero < 0) {
            System.out.println("El numero es negativo: " + numero);
        } else {
            System.out.println("El numero es " + numero);
        }

        consola.close();
    }
}
