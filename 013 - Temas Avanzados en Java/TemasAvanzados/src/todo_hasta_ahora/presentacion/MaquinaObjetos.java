package todo_hasta_ahora.presentacion;

import todo_hasta_ahora.dominio.Objeto;
import todo_hasta_ahora.servicio.IServicioObjetos;
import todo_hasta_ahora.servicio.ServicioObjetosArchivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaObjetos {

    // Metodo principal para poder ejecutar las clases y metodos
    public static void main(String[] args) {

        // Clase que inicia
        maquinaObjetos();

    }

    // clase que no devuelve nada e inicia el programa
    public static void maquinaObjetos() {

        // variable que se usa para salir del programa
        boolean salir = false;

        // iniciamos la variable del escaner para recoger datos por teclado
        Scanner consola = new Scanner(System.in);

        // Creamos la interfaz para obtener los objetos desde el archivo
        IServicioObjetos servicioObjetos = new ServicioObjetosArchivos();

        // Creamos la lista de los objetos
        List<Objeto> objetosLista = new ArrayList<>();

        // Titulo de la aplicacion
        System.out.println("*** Maquina de Objetos ***");

        // Mostramos los objetos almacenados
        servicioObjetos.mostrarObjetos();

        // Iniciamos el bucle de hasta que la variable salir sea true
        while (!salir) {
            try {

                // creamos una variable que tendra la opcion que escribamos por teclado
                int opcion = mostrarMenu(consola);

                /* Si en las opciones que se ejecutan, se pulsa el 5, salir se cambiara a true y se terminara el ciclo
                Se pasa dentro lo siguiente:
                opcion: es la variable que se usara para ejecutar
                consola: al agregar un objeto, hara falta escribir por consola
                objetosLista: para poder usar los objetos de esa lista
                servicioObjetos: para poder usar las opciones de la interface*/

                salir = ejecutarOpciones(opcion, consola, objetosLista, servicioObjetos);

            } catch (Exception e) {
                System.out.println("Ocurrio un error al iniciar el menu: " + e.getMessage());
            } finally {

                // Imprime un salto de linea para cada iteracion
                System.out.println();
            }
        }
    }

    // Creamos el menu que se mostrara en pantalla, y el cual, devolvera la variable para ejecutar la opcion
    private static int mostrarMenu(Scanner consola) {

        // Mostramos por pantalla el menu para elegir
        System.out.print("""
                Menu:
                1. Comprar Objeto
                2. Mostrar Lista Comprados
                3. Agregar Nuevo Objeto
                4. Inventario Snacks
                5. Salir
                Elige una opcion:\s""");

        // En el propio retorno, cogemos la opcion deseada y la transforma en un entero
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones (int opcion,
                                             Scanner consola,
                                             List<Objeto> objetosLista,
                                             IServicioObjetos servicioObjetos) {

        // creamos la variable boolean salir para usarla solo aqui
        boolean salir = false;

        // Creamos un switch para la opcion que hemos pasado
        switch (opcion) {
            case 1 -> comprarObjeto(consola, objetosLista, servicioObjetos);
            case 2 -> mostrarLista(objetosLista);
            case 3 -> agregarObjeto(consola, servicioObjetos);
            case 4 -> listarInventarioObjetos(consola, servicioObjetos);
            case 5 -> {
                System.out.println("Despedida del programa!");
                salir = true;
            }
            default -> System.out.println("Opcion incorrecta: " + opcion + ", prueba de nuevo");
        }

        // devolvemos el booleano
        return salir;
    }

    // Metodo para comprar el objeto
    private static void comprarObjeto (Scanner consola,
                                       List<Objeto> objetosLista,
                                       IServicioObjetos servicioObjetos) {

        // Mensaje para mostrar al inicio
        System.out.print("Que objeto quieres comprar (ID) ?");

        // Variable creada para el objeto que se selecciona
        int idObjetoConsola = Integer.parseInt(consola.nextLine());

        // Variable creada para saber si existe el objeto
        boolean objetoEncontrado = false;

        // Recorrer la lista de objetos hasta que encuentre el elegido
        for (Objeto objeto: servicioObjetos.getObjetos()) {

            // Debe coincidir el id con el que se busca
            if (idObjetoConsola == objeto.getIdObjeto()) {

                // Agregamos el objeto a la lista
                objetosLista.add(objeto);

                // Mostramos que se ha añadido el objeto a la lista
                System.out.println("Agregado el objeto a la lista: " + objeto);

                // Cambiamos la variable a que se ha encontrado el objeto
                // Para que no se use luego el siguiente if como que no ha encontrado el objeto
                objetoEncontrado = true;

                // Tal como se encuentra el objeto, se termina el ciclo y así no lo sigue recorriendo
                break;

            }
        }

        // Por si no se encuentra el objeto
        if (!objetoEncontrado) {
            System.out.println("Objeto no encontrado: " + idObjetoConsola);
        }
    }

    // Mostramos la lista de objetos comprados
    private static void mostrarLista(List<Objeto> objetosLista) {

        // Con StringBuilder, generamos un texto completo
        StringBuilder lista = new StringBuilder("*** Lista de Objetos ***");

        // Variable creada para sumar los totales
        double total = 0.0;

        // Recorrer la lista de productos añadidos y mostrarlos
        for (Objeto objeto: objetosLista) {

            // Añadir el texto de cada Objeto a la lista
            lista.append("\n\t- ").append(objeto.getNombre()).append(" - $").append(objeto.getPrecio());

            // Sumar el precio del Objeto a Total
            total += objeto.getPrecio();

        }

        // Añadimos el total
        lista.append("\n\tTotal -> ").append(total);

        // Mostrar la lista
        System.out.println(lista);
    }

    // Agregar Objetos a la base de datos
    private static void agregarObjeto (Scanner consola,
                                       IServicioObjetos servicioObjetos) {

        // Nombre del objeto
        System.out.print("Nombre del Objeto: ");
        String nombre = consola.nextLine();

        // Precio del objeto
        System.out.print("Precio del Objeto: ");
        double precio = Double.parseDouble(consola.nextLine());

        // Agregamos el Objeto al archivo
        servicioObjetos.agregarObjeto(new Objeto(nombre, precio));

        System.out.println("Objeto agregado correctamente");

        // Mostramos de nuevo la lista de objetos para confirmar que se ha añadido bien
        servicioObjetos.mostrarObjetos();

    }

    // Mostrar el inventario de los objetos
    private static void listarInventarioObjetos (Scanner consola,
                                                 IServicioObjetos servicioObjetos) {

        // Mostrar la lista de los objetos
        servicioObjetos.mostrarObjetos();
    }

}
