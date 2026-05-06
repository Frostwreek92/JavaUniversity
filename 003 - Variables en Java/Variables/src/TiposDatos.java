public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de Datos en Java
        // Enteros (Su valor default es 0)
        byte tipoByte = 127; //Hasta 127, con 128 da fallo al compilar
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000; //5 dígitos máximo
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; // Usar L al final para indicar que es tipo long
        System.out.println("tipoLong = " + tipoLong);
        
        //Punto Flotante (valor default 0.0)
        float tipoFloat = 3.14F; //Usar F mayúscula para indicar que es tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315; // Opcional se puede poner una D mayúscula para indicar que es un double
        System.out.println("tipoDouble = " + tipoDouble);
        
        // Caracter ('\u0000')
        char tipoChar = 'A'; // Caracteres del tipo Unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar); // En unicode es la 'A'
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);
        
        //Booleano (Default es falso)
        boolean tipoBoolean = true; // Solo puede tener valor de 'true' o 'false'
        System.out.println("tipoBoolean = " + tipoBoolean);
        
        String nombre = null; // Valor por defecto = null, que no apunta a ningún objeto
        System.out.println("nombre = " + nombre);
        nombre = "Juan Perez";
        System.out.println("nombre = " + nombre);
    }
}
