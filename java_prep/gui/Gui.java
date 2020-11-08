import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.*;


public class Gui extends JFrame {
    public Gui() {
        super("Gui");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Ferme le programme, une fois la fenêtre fermé
        this.setSize(600,400); // modifie la taille de la fenêtre
        this.setLocationRelativeTo(null); //null le bureau qui est le composant que je prends pour référence 
        setVisible(true);

        JPanel element = (JPanel) this.getContentPane();
        element.setLayout( null ); //Permet de placer les éléments à la main
        JButton btn_depot = new JButton("Depot");
        btn_depot.setBounds(260,300,70,30);
        element.add( btn_depot );

        JButton btn_retrait = new JButton("Retrait");
        btn_retrait.setBounds(260,250,70,30);
        element.add( btn_retrait );


    }

    public static void main(String []args) throws Exception {
        UIManager.setLookAndFeel( new NimbusLookAndFeel() );
        JFrame gui = new Gui();
    }
}