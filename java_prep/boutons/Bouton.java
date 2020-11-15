import javax.swing.*;
import java.awt.*;

public class Bouton extends JFrame {

    private JPanel pan = new JPanel();
    private JButton fenetre = new JButton("Le BOUTON");
    private GridLayout g = new GridLayout();
    private FlowLayout test = new FlowLayout(FlowLayout.CENTER,15,20);
    private BorderLayout bLayout = new BorderLayout();
    private JLabel label = new JLabel();

    Bouton() {
        // Configuration de la fenetre
        this.setTitle("Les boutons");
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        //BorderLayout
        pan.setLayout(bLayout);//on définit le type de Layout à utiliser
        label.setText("Mon premier Label..");

        pan.add(new JButton("NORD"), BorderLayout.NORTH) ;
        pan.add(label, BorderLayout.EAST);
        pan.add(new JButton("SUD"), BorderLayout.SOUTH);
        this.setContentPane(pan);
        this.setVisible(true);

        //GridLayout
        /*g.setRows(4);
        g.setColumns(3);
        this.setLayout(g);

        g.setHgap(10);
        g.setVgap(20);

        this.getContentPane().add(new JButton("1"));
        this.getContentPane().add(new JButton("2"));
        this.getContentPane().add(new JButton("3"));
        this.getContentPane().add(new JButton("4"));
        this.getContentPane().add(new JButton("5"));
        this.getContentPane().add(new JButton("6"));
        this.getContentPane().add(new JButton("7"));
        this.getContentPane().add(new JButton("8"));
        this.getContentPane().add(new JButton("9"));
        this.getContentPane().add(new JButton("10"));
        this.setVisible(true);*/

        //FlowLayout
        /*this.setLayout(test);//on définit le type de Layout à utiliser
        pan.add(new JButton("1"));
        pan.add(new JButton("2"));
        pan.add(new JButton("3"));
        pan.add(new JButton("4"));
        pan.add(new JButton("1"));
        pan.add(new JButton("2"));
        pan.add(new JButton("3"));
        pan.add(new JButton("4"));
        this.setVisible(true);*/
    }
    public static void main(String []args) {
        Bouton test1 = new Bouton();
    }
}