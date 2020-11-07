import java.util.*;


public class Bank {
    public static Scanner scan =new Scanner(System.in);
    public static void main(String []args) {
        LaBanque b = new LaBanque();
        b.depot();
        System.out.println(b.toString());
        b.retrait();
        System.out.println(b.toString());

    }
}


class LaBanque {
    /* ** ATTRIBUT ** */
    private int solde;
    private String id_client;
    private String nom_client;
    private int montant;

    /* ** CONSTRUCTEUR ** */
    public LaBanque() {
        solde = 0;
        id_client = "###";
        nom_client = "Inconnu";
        montant = 0;

        System.out.println("Compte client crée..\n");
    }

    public LaBanque(int solde, String id_client, String nom_client) {
        this.solde = solde;
        this.id_client = id_client;
        this.nom_client = nom_client;
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

    public void depot() {
        System.out.print("Combien voulez-vous déposer (en euros) ? ");

        this.montant = getScanI();

        if(this.montant > 0) {
            this.solde = this.solde + this.montant;
            System.out.println("Vous avez déposé " + this.montant + " euros.");
        } else {
            System.out.println("Erreur dans la saisie..");
        }
    }

    public void retrait() {
        System.out.print("Combien voulez-vous retirer (en euros) ? ");

        this.montant = getScanI();

        if(this.montant > 0 && this.montant <= 700) {
            this.solde = this.solde - this.montant;
            System.out.println("Vous avez retiré " + this.montant + " euros.");
        } else if (this.montant > 700) {
            System.out.println("La limite de retrait max est de 700 euros !");
        } else {
            System.out.println("Erreur dans la saisie..");
        }
    }

    public String toString() {
        return "Le propriétaire du compte est " + getNomClient() +
        ". Son numéro de compte est " + getIdClient() + ". Le solde de son compte est : " +
        getSolde() + " euros.\n";
    }
}