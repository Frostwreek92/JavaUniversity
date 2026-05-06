public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("*** Dia de la Semana con Switch ***");

        var dia = 9; // Suponiendo 1 Lunes, 2 Martes, etc

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido: " + dia);
                break; // Opcional
        }
    }
}
