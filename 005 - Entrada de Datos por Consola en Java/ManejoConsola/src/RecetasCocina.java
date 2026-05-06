import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        // Nombre del Programa
        System.out.println("*** Recetas de cocina ***\n");

        Scanner consola = new Scanner(System.in);

        // Nombre de la receta
        System.out.print("Introduce Nombre de la Receta: ");
        String nombreReceta = consola.nextLine();

        // Ingredientes
        System.out.print("Introduce los ingredientes: ");
        String ingredientesReceta = consola.nextLine();

        // Tiempo de preparación
        System.out.print("Tiempo de preparación: ");
        int tiempoPreparacion = Integer.parseInt(consola.nextLine());

        // Dificultad de la receta
        System.out.print("Introduce dificultad (facil, media, difícil): ");
        String dificultadReceta = consola.nextLine();

        // Montaje receta por pantalla
        String recetaPantalla = "\nDatos de la receta:";
        recetaPantalla = recetaPantalla.concat("\n\tNombre de la receta: ").concat(nombreReceta);
        recetaPantalla = recetaPantalla.concat("\n\tIngredientes: ").concat(ingredientesReceta);
        recetaPantalla = recetaPantalla.concat("\n\tTiempo de preparación: ").concat(String.valueOf(tiempoPreparacion)).concat(" min");
        recetaPantalla = recetaPantalla.concat("\n\tDificultad de la Receta: ").concat(dificultadReceta);

        //Imprimir receta por pantalla
        System.out.println(recetaPantalla);

    }
}
