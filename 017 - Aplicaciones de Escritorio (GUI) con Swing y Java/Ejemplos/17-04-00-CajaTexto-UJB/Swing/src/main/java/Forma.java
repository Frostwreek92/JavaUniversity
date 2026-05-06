import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.*;

public class Forma extends JFrame{
    private JPanel panelPrincipal;
    private JTextField campoTexto;

    public Forma(){
        inicializarForma();
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);//centramos la ventana
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();// Cambiar look and feel a modo oscuro
        Forma forma = new Forma();
        forma.setVisible(true);
    }
}
