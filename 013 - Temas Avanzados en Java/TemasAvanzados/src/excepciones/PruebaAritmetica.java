package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            double resultado = Aritmetica.division(10, 2);
            System.out.println("Resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
        }
        finally {
            System.out.println("Se reviso la division entre 0");
        }
    }
}
