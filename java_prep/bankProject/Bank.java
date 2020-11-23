import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Bank {
    public static Scanner scan =new Scanner(System.in);
    public static void main(String []args) {
        LaBanque test = new LaBanque(1000,"150","VILVER");
        LaBanque test1 = new LaBanque(2000,"151","LEVY");
        Fenetre fen = new Fenetre();
        System.out.println(test1.toString());
    }
}

class LaBanque {
    /* ** ATTRIBUT ** */
    private int solde;
    private String id_client;
    private String nom_client;
    private static int montant = 0;

    /* ** CONSTRUCTEUR ** */
    public LaBanque() {
        solde = 0;
        id_client = "###";
        nom_client = "Inconnu";

        System.out.println("Compte client crée..\n");
    }

    public LaBanque(int solde, String id_client, String nom_client) {
        this.solde = solde;
        this.id_client = id_client;
        this.nom_client = nom_client;

        System.out.println("Compte client crée..\n");
    }

    /* ** Methode de classe ** */
    public String getIdClient() {
        return this.id_client;
    }

    public int getSolde() {
        return this.solde;
    }

    public String getNomClient() {
        return this.nom_client;
    }

    public int getScanI(){
        return Bank.scan.nextInt();
    }

    /* ** Depot d'argent ** */
    public void depot() {
        System.out.print("Combien voulez-vous déposer (en euros) ? ");

        this.montant = getScanI();

        if(this.montant > 0) {
            this.solde = this.solde + this.montant;
            System.out.println("Vous avez déposé " + this.montant + " euros.\n");
        } else {
            System.out.println("Erreur dans la saisie..");
        }
    }

    /* ** Retrait d'argent ** */
    public void retrait() {
        System.out.print("Combien voulez-vous retirer (en euros) ? ");

        this.montant = getScanI();

        if(this.montant > 0 && this.montant <= 700) {
            if (this.solde - this.montant < 0) {
                System.out.println("Vous n'avez pas assez d'argent sur votre compte.");
                System.out.println("Le solde de votre compte est de " + this.solde + " euros.\n");
            } else {
                this.solde = this.solde - this.montant;
                System.out.println("Vous avez retiré " + this.montant + " euros.\n");
            }
        } else if (this.montant > 700) {
            System.out.println("La limite de retrait max est de 700 euros !");
        } else {
            System.out.println("Erreur dans la saisie..");
        }
    }

    public void afficheMontant() {
        System.out.println("Vous ( " + this.nom_client + " ) avez actuellement " + this.solde + " euros dans votre compte.\n");
    }

    /* ** Transfert d'argent ** */
    public void transfertArgent(LaBanque beneficier) {
        System.out.print("Combien voulez-vous transférer à " + beneficier.nom_client  + " (en euros) ? ");

        this.montant = getScanI();

        if(this.montant > 0 && this.montant <= 700) {
            if (this.solde - this.montant < 0) {
                System.out.println("Vous n'avez pas assez d'argent sur votre compte.");
                System.out.println("Le solde de votre compte est de " + this.solde + " euros.\n");
            } else {
                beneficier.solde = beneficier.solde + this.montant;
                this.solde-=this.montant;
                System.out.println("Le compte de "+ beneficier.nom_client + " à bénéficié de " + this.montant + " euros.\n");
            }
        } else if (this.montant > 700) {
            System.out.println("La limite de transfert max est de 700 euros !");
        } else {
            System.out.println("Erreur dans la saisie..");
        }
    }

    /* ** methode toString ** */
    public String toString() {
        return "Le propriétaire du compte est " + getNomClient() +
        ". \nSon numéro de compte est " + getIdClient() + ". \nLe solde de son compte est le : " +
        getSolde() + " euros.";
    }
}

class Fenetre extends JFrame {
    //création de conteneur
    JPanel pan = new JPanel();
    JPanel screen = new JPanel(); 
    JPanel bottom = new JPanel();

    //création label
    JLabel texte = new JLabel();

    Fenetre() {
        this.setTitle("Ma banque");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //type de layout
        pan.setLayout(new BorderLayout());
        screen.setLayout(new FlowLayout(FlowLayout.CENTER,0,200));

        //ajout du conteneur "bottom" au conteneur "pan"
        pan.add(bottom);
        pan.add(bottom, BorderLayout.SOUTH);
        
        pan.add(screen);

        //initialisation et création des boutons
        JButton but20 = new JButton("20$");
        JButton but50 = new JButton("50$");
        JButton but100 = new JButton("100$");
        JButton but200 = new JButton("200$");
        JButton but500 = new JButton("500$");

        bottom.add(but20);
        bottom.add(but50);
        bottom.add(but100);
        bottom.add(but200);
        bottom.add(but500);

        //liaison au ActionListener
        but20.addActionListener(new but20());


        //initialisation texte
        screen.add(texte);
        texte.setText("Bienvenu dans ma banque !");

        this.setContentPane(pan);


        this.setVisible(true);

    }

    class but20 implements ActionListener {
        public void ActionPerformed(ActionEvent arg0) {
            texte.setText("Don de 20 euros");
        }
    }

}


