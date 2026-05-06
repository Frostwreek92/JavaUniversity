package cosas;

public class Cosa {

    static int contadorCosas = 0;
    protected static String nombre;
    protected static String descripcion;

    public Cosa() {
    }

    public Cosa (String nombre, String descripcion) {
        Cosa.nombre = nombre;
        Cosa.descripcion = descripcion;
        Cosa.contadorCosas++;
    }

    @Override
    public String toString() {
        return "Cosa: " + nombre + ", Descripcion: " + descripcion;
    }
}

class Jarron extends Cosa {
    public Jarron (String nombre, String descripcion) {
        Cosa.nombre = nombre;
        Cosa.descripcion = descripcion;
        Cosa.contadorCosas++;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Descripcion: " + descripcion;
    }
}
