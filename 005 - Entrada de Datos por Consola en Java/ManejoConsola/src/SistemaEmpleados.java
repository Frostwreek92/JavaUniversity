import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Empleados ***");

        var consola = new Scanner(System.in);

        // Nombre del empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        // Edad del empleado
        System.out.print("Edad del empleado: ");
        int edad = Integer.parseInt(consola.nextLine());

        // Salario del empleado
        System.out.print("Salario del empleado: ");
        double salario = Double.parseDouble(consola.nextLine());

        // Jefe de Departamento
        System.out.print("¿Es Jefe de Departamento (true / false)?: ");
        boolean esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        // Imprimir valores del empleado
        System.out.println("\nDatos del empleado:");
        System.out.println("\tNombre = " + nombreEmpleado);
        System.out.println("\tEdad = " + edad);
        // System.out.println("\tSalario = " + salario);
        System.out.printf("\tSalario: $ %.2f%n", salario);
        System.out.println("\tEs Jefe de Departamento: " + esJefeDepartamento);

        consola.close();
    }
}
