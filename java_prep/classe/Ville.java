public class Ville {
    private String nomVille;
    private String nomPays;
    private int nbHabitant;

    //constructeur par défaut
    Ville() {
        System.out.println("Creation d'une ville. constructeur sans parametre");
        nomVille = "Inconnu";
        nomPays = "Inconnu";
        nbHabitant = 0;
    }

    //constructeur avec paramètre
    Ville(String nVille, String nPays, int nHabitant) {
        System.out.println("Creation d'une ville. constructeur avec parametre");
        nomVille = nVille;
        nomPays = nPays;
        nbHabitant = nHabitant;
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
}