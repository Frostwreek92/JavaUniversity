package aaprincipal.objetos;

import java.io.Serializable;
import java.util.Objects;

public class Objeto implements Serializable {

    private static int contadorObjetos = 0;

    private int idObjeto;
    private String nombre;
    private double precio;

    public Objeto() {
        this.idObjeto = ++Objeto.contadorObjetos;
    }

    public Objeto (String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public static int getContadorObjetos() {
        return contadorObjetos;
    }

    public int getIdObjeto() {
        return idObjeto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public static void setContadorObjetos(int contadorObjetos) {
        Objeto.contadorObjetos = contadorObjetos;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String escribirObjeto() {
        return idObjeto + "," + nombre + "," + precio;
    }

    @Override
    public String toString() {
        return "Objeto {" +
                "idObjeto = " + idObjeto +
                ", nombre = '" + nombre + '\'' +
                ", precio = " + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Objeto objeto = (Objeto) o;
        return idObjeto == objeto.idObjeto && Double.compare(precio, objeto.precio) == 0 && Objects.equals(nombre, objeto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObjeto, nombre, precio);
    }
}
