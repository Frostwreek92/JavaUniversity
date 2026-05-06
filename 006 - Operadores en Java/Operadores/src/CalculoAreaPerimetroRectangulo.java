import java.util.Scanner;

public class CalculoAreaPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Calcular el Area y el Perimetro de un Rectangulo***");
        Scanner consola = new Scanner(System.in);

        // Variables a pedir al usuario
        System.out.print("Introduce la Base: ");
        var base = Integer.parseInt(consola.nextLine());
        System.out.print("Introduce la Altura: ");
        var altura = Integer.parseInt(consola.nextLine());

        //  Calculo del Area y el Perimetro
        var areaRectangulo = base * altura;
        var perimetroRectangulo = 2 * (base + altura);

        // Imprimir por pantalla resultados
        System.out.printf("""
                %nArea y perimetro del rectangulo
                Base = %d
                Altura = %d
                %nArea = %d
                Perimetro = %d
                """, base, altura, areaRectangulo, perimetroRectangulo);


    }
}
