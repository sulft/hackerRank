import java.util.*;


public class Bank {
    public static Scanner scan =new Scanner(System.in);
    public static void main(String []args) {
        LaBanque test = new LaBanque(1000,"150","VILVER");
        LaBanque test1 = new LaBanque(2000,"151","LEVY");
        test.afficheMontant();
        test1.afficheMontant();

        test.transfertArgent(test1);

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