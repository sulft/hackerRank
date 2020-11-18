import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bouton extends JFrame implements ActionListener{

    private JPanel pan = new JPanel();
    private JButton fenetre = new JButton("Le BOUTON");
    private GridLayout g = new GridLayout();
    private FlowLayout test = new FlowLayout(FlowLayout.CENTER,15,20);
    private BorderLayout bLayout = new BorderLayout();
    private JLabel label = new JLabel();
    private JLabel label1 = new JLabel();
    private int compteur = 0;

    Bouton() {
        //Création de bouton
        JButton bouton = new JButton("compteur");

        // Configuration de la fenetre
        this.setTitle("Les boutons");
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        //BorderLayout
        pan.setLayout(bLayout);//on définit le type de Layout à utiliser
        label.setText("Vous avez clique " + this.compteur + " fois");

        //ajout du bouton a notre fenetre en tant que event
        bouton.addActionListener(this);
        pan.add (bouton, BorderLayout.SOUTH);

        label.setForeground (Color.red); //change la couleur d'écrit du texte
        label.setHorizontalAlignment(JLabel.CENTER); //aligne le texte horizontalement
        pan.add(label, BorderLayout.CENTER); //Place le texte au centre
        pan.add(bouton, BorderLayout.SOUTH);
        this.setContentPane(pan);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent arg0){
        this.compteur++;
        label.setText("Vous avez clique " + this.compteur + " fois");
    }

    public static void main(String []args) {
        Bouton test1 = new Bouton();
    }
}