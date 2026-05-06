import java.util.Locale;

public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de Email ***");
        // Nombre completo del usuario
        String usuarioNombre;
        usuarioNombre= "Alvaro Garcia Mon";
        System.out.println("usuarioNombre = " + usuarioNombre);
        String usuarioNormalizado;
        usuarioNormalizado = usuarioNombre.strip().toLowerCase().replace(" ", ".");
        System.out.println("usuarioNormalizado = " + usuarioNormalizado);

        // Nombre completa de la empresa
        String empresaNombre;
        empresaNombre = "La Gran Castaña";
        System.out.println("empresaNombre = " + empresaNombre);
        String empresaNormalizado;
        empresaNormalizado = empresaNombre.strip().toLowerCase().replace(" ", "");
        System.out.println("empresaNormalizado = " + empresaNormalizado);
        String dominio = ".cosa.es";
        System.out.println("dominio = " + dominio);

        String emailGenerado = usuarioNormalizado.concat("@").concat(empresaNormalizado).concat(dominio);
        System.out.println("emailGenerado = " + emailGenerado);
    }
}
