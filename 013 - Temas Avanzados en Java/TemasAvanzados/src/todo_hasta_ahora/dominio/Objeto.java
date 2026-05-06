package todo_hasta_ahora.dominio;
// Dominio, es usado para la clase del objeto mas basica

import java.io.Serializable;
import java.util.Objects;

// Implementa Serializable para que se pueda usar a nivel de aplicacion de escritorio
public class Objeto implements Serializable {

    // Variables y su uso

    // Contador privado para que no se pueda usar fuera de esta clase
    // static para que pertenezca a la clase
    // debe inicializarse si o si
    private static int contadorObjetos = 0;

    // Variables de uso en esta clase, pero privadas, para que no se puedan usar fuera de esta clase
    private int idObjeto;
    private String nombre;
    private double precio;

    // Constructor de la clase
    // En este caso, cada vez que se añada algo, hace un sumatorio automatico
    public Objeto() {
        this.idObjeto = ++Objeto.contadorObjetos;
    }

    // Continuacion del constructor de la clase
    public Objeto(String nombre, double precio) {
        // Aquí se llama al constructor principal para usar el sumatorio antes que el resto del código siguiente
        this();

        // Cuando se crea el objeto, se pasan sus variables
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters son usados para que la informacion de las variables puedan ser usadas fuera de la clase
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

    // Setters son usados para crear informacion con las variables
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

    // Genera un texto al llamar a la clase para devolver la informacion
    @Override
    public String toString() {
        return "Objeto{" +
                "idObjeto = " + idObjeto +
                ", nombre = '" + nombre + '\'' +
                ", precio = " + precio +
                '}';
    }

    // Se usa para recoger la informacion y escribirla en el archivo
    public String escribirObjeto() {
        return idObjeto + "," + nombre + "," + precio;
    }

    // Metodo que sirve para saber si 2 objetos son iguales
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Objeto objeto = (Objeto) o;
        return idObjeto == objeto.idObjeto && Double.compare(precio, objeto.precio) == 0 && Objects.equals(nombre, objeto.nombre);
    }

    // Este metodo devuelve un numero entero (el hash) que representa al objeto
    @Override
    public int hashCode() {
        return Objects.hash(idObjeto, nombre, precio);
    }
}
