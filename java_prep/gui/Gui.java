import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


import java.awt.*;


public class Gui extends JFrame {
    public Gui() {
        super("gui");

        this.setTitle("Ma fenetre Java");
        this.setSize(300,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setAlwaysOnTop(true);

        JPanel jp = new JPanel();
        jp.setBackground(Color.GREEN);
        this.setContentPane(jp);

        this.setVisible(true); //rends la fenêtre visible

        

    }

    public static void main(String []args) throws Exception {
        UIManager.setLookAndFeel( new NimbusLookAndFeel() );
        Gui test = new Gui();

    }
}