// Una interfaz es un conjunto de métodos abstractos (sin cuerpo), que una clase puede implementar.
// Cuando una clase implementa una interfaz, se compromete a proporcionar el código para todos esos métodos.
package todo_hasta_ahora.servicio;

import todo_hasta_ahora.dominio.Objeto;

import java.util.List;

public interface IServicioObjetos {

    // Metodo para agregar un objeto
    void agregarObjeto(Objeto objeto);

    // Metodo para ver los objetos
    void mostrarObjetos();

    // Lista de los objetos
    List<Objeto> getObjetos();
}
