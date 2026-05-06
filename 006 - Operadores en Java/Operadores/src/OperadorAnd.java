public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println("*** Operador and ***");
        // and (regresa true si ambos valores son true)
        boolean a = false, b = false;
        var resultado = a && b;
        System.out.println("resultado = " + resultado);
        a = true;
        b = false;
        resultado = a && b;
        System.out.println("resultado = " + resultado);
        a = false;
        b = true;
        resultado = a && b;
        System.out.println("resultado = " + resultado);
        a = true;
        b = true;
        resultado = a && b;
        System.out.println("resultado = " + resultado);

    }
}
