package persona;

public class PruebaPersona {

    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objetos Persona ***");
        System.out.println("Variable estática: " + Persona.getContadorPersonas());
        Persona objeto1 = new Persona("Layla", "Acosta");
        System.out.println(objeto1); // Automaticamente se llama toString
        System.out.println("Variable estática: " + Persona.getContadorPersonas());

        // Segundo objeto
        Persona objeto2 = new Persona("Ian", "Gomez");
        System.out.println(objeto2);
        System.out.println("Variable estática: " + Persona.getContadorPersonas());

    }
}
