class Capitale extends Ville {
    private String president;

    public Capitale() {
        super();
        System.out.println("classe fille, sans parametre\n");
        this.president = "Inconnu";
    }

    public Capitale(String nVille, String nPays, int nHabitant, String president) {
        super(nVille, nPays, nHabitant);
        System.out.println("classe fille, avec parametre\n");
        this.president = president;
    }

    public String getPresident() {
        return this.president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String toString() {
        return super.toString() + " "+ this.president + " en est le président.";
    }
}