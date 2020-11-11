import javax.swing.*;
import java.awt.*;

public class Bouton extends JFrame {

    private JPanel pan = new JPanel();
    private JButton bouton = new JButton("Le BOUTON");

    Bouton() {
        this.setTitle("Les boutons");
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        pan.add(bouton);

        this.setLayout(new BorderLayout());//on définit le type de Layout à utiliser

        this.getContentPane().add(new JButton("NORD"), BorderLayout.NORTH) ;
        this.getContentPane().add(new JButton("SUD"), BorderLayout.SOUTH);
        this.getContentPane().add(new JButton("MILLIEU"), BorderLayout.CENTER);
        this.getContentPane().add(new JButton("EST"), BorderLayout.EAST);
        this.getContentPane().add(new JButton("OUEST"), BorderLayout.WEST);
        this.setVisible(true);
    }
    public static void main(String []args) {
        Bouton test = new Bouton();
    }
}