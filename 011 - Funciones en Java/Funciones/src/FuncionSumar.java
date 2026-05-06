public class FuncionSumar {
    // Definimos la funcion sumar
    static int sumar (int numero1, int numero2) {
        int resultado = numero1 + numero2;
        return resultado;
    }

    public static void main(String[] args) {

        int numero1 = 3, numero2 = 8;
        int resultado_funcion = sumar(numero1, numero2);
        System.out.println("Resultado de la suma de: " + numero1 + " + " + numero2 + " = " + resultado_funcion);

        resultado_funcion = sumar(10, 20);
        System.out.println("resultado_funcion = " + resultado_funcion);
    }
}
