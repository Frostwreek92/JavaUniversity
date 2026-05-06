import java.util.Random;
import java.util.Scanner;

public class NumeroMagico {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner consola = new Scanner(System.in);
        final int INTENTOS_MAXIMOS = 10;
        int magico = aleatorio.nextInt(50) + 1;
        int contadorIntentos = 0;
        int numeroIntroducido = 0;

        System.out.println("*** Juego del Numero Mágico ***");

        while (contadorIntentos != INTENTOS_MAXIMOS && numeroIntroducido != magico) {
            System.out.print("Introduce un numero (1 - 50): ");
            numeroIntroducido = Integer.parseInt(consola.nextLine());
            if (numeroIntroducido < magico) {
                System.out.println("El numero introducido es MENOR que el mágico");
            } else if (numeroIntroducido >magico){
                System.out.println("El numero introducido es MAYOR que el mágico");
            }
            contadorIntentos++;
            if (numeroIntroducido != magico) {
                System.out.printf("""
                    Llevas %d intento/s\n""", contadorIntentos);
            }
        }

        if (numeroIntroducido == magico) {
            System.out.printf("""
                    Lo has conseguido, felicidades!!
                    Has hecho %d intento/s""", contadorIntentos);
        } else {
            System.out.printf("""
                    Que pena, no lo has conseguido en los intentos maximos: %d.
                    Prueba de nuevo en otro momento.
                    El numero secreto era %d""", INTENTOS_MAXIMOS, magico);
        }

        consola.close();
    }
}
