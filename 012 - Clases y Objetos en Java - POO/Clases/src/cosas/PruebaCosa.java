package cosas;

public class PruebaCosa {
    public static void main(String[] args) {
        System.out.println("Prueba de cosas");
        System.out.println("Contador cosas: " + Cosa.contadorCosas);
        Cosa patata = new Cosa("Patata", "Es una Patata");
        System.out.println(patata.toString());
        System.out.println("Contador cosas: " + Cosa.contadorCosas);
        Jarron ming = new Jarron("Ming", "Es un jarrón de la dinastia Ming");
        System.out.println(ming);
        System.out.println("Contador cosas: " + Cosa.contadorCosas);
    }
}
