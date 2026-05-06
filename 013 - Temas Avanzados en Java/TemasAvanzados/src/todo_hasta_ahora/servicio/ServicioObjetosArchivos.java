package todo_hasta_ahora.servicio;

import todo_hasta_ahora.dominio.Objeto;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Se usa el implements, para que minimo, tengo los metodos de la interfaz
public class ServicioObjetosArchivos implements IServicioObjetos {

    // Ruta del archivo relativa
    String rutaArchivo = System.getProperty("user.dir") + "/src/todo_hasta_ahora/archivo/";

    // Variable del nombre del archivo que no se debe cambiar, a menos que sea desde el propio codigo
    private final String NOMBRE_ARCHIVO = "objetos.txt";

    // Crear lista de objetos que sera un tipo de lista de String
    private List<Objeto> objetos = new ArrayList<>();

    // Constructor de la clase, al que no le pasamos ninguna informacion
    public ServicioObjetosArchivos() {

        // Crear el archivo con la ruta del archivo + nombre
        File archivo = new File(rutaArchivo + NOMBRE_ARCHIVO);

        // Variable para, si no existe el archivo, crearlo, y si existe, que no lo cree de nuevo, sobreescribiendo el antiguo
        boolean existe = false;

        // Dentro de aquí, se prueba, si falla, imprime por pantalla la excepcion
        try {

            // Si el archivo existe, cambia a true
            existe = archivo.exists();

            if (existe) { // si el archivo existe, hara el metodo de dentro
                this.objetos = obtenerObjetos();
            } else { // si no existe, lo creara, y se cierra el flujo para crearlo
                PrintWriter salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo");
            }

        } catch (Exception e) {
            // Enviar mensaje con el tipo de fallo si hay algun error
            System.out.println("Error al crear archivo: " + e.getMessage());
        }

        // Si no existe el archivo, podemos cargar unos objetos iniciales
        if (!existe) {
            cargarObjetosIniciales();
        }
    }

    // este metodo, devuelve una lista de los objetos
    private List<Objeto> obtenerObjetos() {

        // Creamos una lista de los objetos que queremos devolver
        ArrayList objetos = new ArrayList<>();

        try {

            // Creamos una lista de lineas en formato String para que luego sean usadas
            List<String> lineas = Files.readAllLines(Paths.get(rutaArchivo + NOMBRE_ARCHIVO));

            // Leer todas las lineas para dividir y dar valor a las variables
            for (String linea: lineas) {

                // Creamos por cada linea que se lee, un array que se separara por comas
                String[] lineaObjeto = linea.split(",");

                // Damos valor a las variables
                int idObjeto = Integer.parseInt(lineaObjeto[0]); // No tiene uso, pues se da automaticamente en el constructor
                String nombre = lineaObjeto[1];
                double precio = Double.parseDouble(lineaObjeto[2]);

                // Creamos el objeto y se le dan las variables que pide el constructor
                Objeto objeto = new Objeto(nombre, precio);

                // Añadimos el objeto creado
                objetos.add(objeto);
            }
        } catch (Exception e) {

            // Imprimimos el error por pantalla
            System.out.println("Error al leer el archivo objetos: " + e.getMessage());
        }
        return objetos;
    }

    // Este metodo, genera una base para que el archivo, tengo unos datos de inicio
    private void cargarObjetosIniciales() {
        this.agregarObjeto(new Objeto("Moto", 4000.00));
        this.agregarObjeto(new Objeto("Patatas", 2.63));
    }

    // Metodo que esta en la interfaz y con ello, lo usamos
    @Override
    public void agregarObjeto(Objeto objeto) {
        // Agregamos el nuevo objeto
        // Se guarda en memoria
        this.objetos.add(objeto);
        // Se guarda en archivo
        this.agregarObjetoArchivo(objeto);
    }

    // Creamos el metodo para agregar el objeto al archivo
    private void agregarObjetoArchivo(Objeto objeto) {

        // Creamos el archivo que vamos a usar para escribir en el
        File archivo = new File(rutaArchivo + NOMBRE_ARCHIVO);

        // Esta variable se usa para, si el archivo existe, escribir en el
        boolean anexar = false;

        try {

            // Comprobar que existe el archivo
            anexar = archivo.exists();

            // Pasar el archivo y el comprobante que es correcto y existe, para poder escibir en el
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));

            // Escribir en el archivo
            salida.println(objeto.escribirObjeto());

            // Cerramos salida para que se escriba en el objeto
            salida.close();

        } catch (Exception e) {
            System.out.println("Fallo al agregar el objeto: " + e.getMessage());
        }
    }

    @Override
    public void mostrarObjetos() {

        // Mostramos que es lo que se va a imprimir por pantalla
        System.out.println("--- Inventario de Objetos ---");

        // Mostramos la lista de objetos en el archivo, debe estar inicializado
        String inventarioObjetos = "";

        // Recorremos los objetos y lo sumamos al String creado
        for (Objeto objeto: this.objetos) {
            inventarioObjetos += objeto.toString() + "\n";
        }

        // Imprimimos el enventario
        System.out.println(inventarioObjetos);
    }

    @Override
    public List<Objeto> getObjetos() {
        return this.objetos;
    }

}
