public class DiaSemanaMejorado {
    public static void main(String[] args) {
        System.out.println("*** Dia de la Semana con Switch Mejorado ***");
        int diaSemana = 1;

        switch (diaSemana) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Dia invalido");
        }
    }
}
