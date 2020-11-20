import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bouton extends JFrame{

    private JPanel pan = new JPanel();
    private JButton fenetre = new JButton("Le BOUTON");
    
    private JLabel label = new JLabel();
    protected int compteur = 0;
    private JButton bouton = new JButton("incrementation");
    private JButton bouton2 = new JButton("decrementation");
    private JButton bouton3 = new JButton("remise a 0");

    Bouton() {
        //Création de bouton

        // Configuration de la fenetre
        this.setTitle("Les boutons");
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        //BorderLayout
        pan.setLayout(new BorderLayout());//on définit le type de Layout à utiliser


        //création d'un second JPanel
        JPanel bottom = new JPanel();
        bottom.add(bouton);
        bottom.add(bouton2);
        bottom.add(bouton3);
        //ajout d'un JPanel dans un autre JPanel
        pan.add(bottom, BorderLayout.SOUTH);


        //ajout du bouton a notre fenetre en tant que event
        bouton.addActionListener(new ListenBouton1());
        bouton2.addActionListener(new ListenBouton2());
        bouton3.addActionListener(new ListenBouton3());

        //placement des éléments dans ça fenetre
        label.setText("Vous avez clique " + this.compteur + " fois");
        label.setForeground (Color.red); //change la couleur d'écrit du texte
        label.setHorizontalAlignment(JLabel.CENTER); //aligne le texte horizontalement
        pan.add(label, BorderLayout.CENTER); //Place le texte au centre
        this.setContentPane(pan);
        this.setVisible(true);
    }

    public int getCompteur() {
        return this.compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    /*public void actionPerformed(ActionEvent x){
        if(x.getSource() == bouton) {
            this.compteur++;
            label.setText("Vous avez clique " + this.compteur + " fois");
        }
        if(x.getSource() == bouton2) {
            this.compteur--;
            label.setText("Vous avez clique " + this.compteur + " fois");
        }
        if(x.getSource() == bouton3) {
            this.compteur = 0;
            label.setText("Vous avez clique " + this.compteur + " fois");

        }
    
        //getSource permet de déterminer le nom de l'instance qui a généré un évènement
        //l'argument "x" est un évènement
    }*/

    class ListenBouton1 implements ActionListener {
        public void actionPerformed(ActionEvent x) {
            setCompteur(getCompteur()+1);
            label.setText("Vous avez clique " + getCompteur() + " fois");
        }
    }

    class ListenBouton2 implements ActionListener {
        public void actionPerformed(ActionEvent y) {
            setCompteur(getCompteur()-1);
            label.setText("Vous avez clique " + getCompteur() + " fois");
        }
    }

    class ListenBouton3 implements ActionListener {
        public void actionPerformed(ActionEvent z) {
            setCompteur(0);
            label.setText("Vous avez clique " + getCompteur() + " fois");
        }
    }

    public static void main(String []args) {
        Bouton test1 = new Bouton();
    }

}