public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("*** Operador or ***");
        // or (regresa true si cualquiera de los valores es true)
        boolean a = false, b = false;
        var resultado = a || b;
        System.out.println("resultado = " + resultado);
        a = true;
        b = false;
        resultado = a || b;
        System.out.println("resultado = " + resultado);
        a = false;
        b = true;
        resultado = a || b;
        System.out.println("resultado = " + resultado);
        a = true;
        b = true;
        resultado = a || b;
        System.out.println("resultado = " + resultado);
    }
}
