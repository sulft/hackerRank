

public class Ville {
    private static int nbVille = 0;
    private String nomVille;
    private String nomPays;
    private int nbHabitant;

    //constructeur par défaut
    Ville() {
        System.out.println("Creation d'une ville. constructeur sans parametre");
        nomVille = "Inconnu";
        nomPays = "Inconnu";
        nbHabitant = 0;
        nbVille++;
    }

    //constructeur avec paramètre
    Ville(String nVille, String nPays, int nHabitant) {
        System.out.println("Creation d'une ville. constructeur avec parametre");
        nomVille = nVille;
        nomPays = nPays;
        nbHabitant = nHabitant;
        nbVille++;
    }

    //Accesseur
    public String getNomVille() {
        return nomVille;
    }

    public String getNomPays() {
        return nomPays;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    public static int getNbVille() {
        return nbVille;
    }

    //Mutateur
    public void setNomVille(String nVille) {
        nomVille = nVille;
    }

    public void setNomPays(String nPays) {
        nomPays = nPays;
    }

    public void setNbHabitant(int nHabitant) {
        nbHabitant = nHabitant;
    }

    //Methode de classe
    public void comparer(Ville v1) {
        if(this.nbHabitant>v1.nbHabitant) {
            System.out.print("La ville " + this.getNomVille() + " est plus peuplé que la ville de ");
            System.out.println(v1.getNomVille());
        } else {
            System.out.print("La ville " + this.getNomVille() + " est moins peuplé que la ville de ");
            System.out.println(v1.getNomVille());
        }
    }
}