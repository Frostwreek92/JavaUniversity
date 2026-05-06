public class FuncionRecursiva {
    // Imprimir 1 al 5 usando una funcion recursiva
    // Funcion Recursiva
    static void funcionRecursiva ( int numero){
        if (numero == 1) {
            System.out.print(numero + " ");
        } else {
            // Caso recursivo
            funcionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }

}
