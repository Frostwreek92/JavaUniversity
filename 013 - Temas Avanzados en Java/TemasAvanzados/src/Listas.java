import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        for (String elemento: miLista) {
            System.out.println("Dia de la Semana: " + elemento);
        }

        System.out.println();
        // Funciones lambda (funcion anonima de un codigo muy compacto)
        miLista.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });
        System.out.println();

        miLista.forEach(System.out::println);
        System.out.println();

        System.out.println("Lista de nombres");
        List<String> nombres = Arrays.asList("Pedro", "Ivonne", "Nohemi");
        nombres.forEach(System.out::println);
    }
}
