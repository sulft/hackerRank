import javax.swing.*;
import java.awt.*;


public class Gui extends JFrame {
    public Gui() {
        super("Gui");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Ferme le programme, une fois la fenêtre fermé
        this.setSize(600,400); // modifie la taille de la fenêtre
        this.setLocationRelativeTo(null); //null le bureau qui est le composant que je prends pour référence 
        setVisible(true);

        JPanel element = (JPanel) this.getContentPane();
        element.setLayout( new FlowLayout() ); //from java.awt, gère le layout de mes boutons
        element.add( new JButton("Depot") );
        element.add( new JButton("Retrait") );

    }

    public static void main(String []args) {
        JFrame gui = new Gui();
    }
}