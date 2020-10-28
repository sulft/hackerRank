public abstract class Animal {
    //attribut
    protected String couleur;
    protected int poids;

    //ATTENTION LES CLASSES ABSTRAITES N'ONT PAS DE CONSTRUCTEUR

    //methode 
    public void manger() {
        System.out.println("je mange de la viande.");
    }

    public void boire() {
        System.out.println("je bois de l'eau.");
    }
    abstract void crier();
    abstract void deplacement();
}

abstract class Canin extends Animal {
    public void deplacement() {
        System.out.println("Je me déplace seul !");
    }
    
}

abstract class Felin extends Animal {
    public void deplacement() {
        System.out.println("Je me déplace en groupe !");
    } 
} 

class Loup extends Canin {
    public Loup() {
        this.couleur = "inconnu";
        this.poids = 0;
    }

    public Loup(String couleur, int poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    public void crier() {
        System.out.println("J'hurle lors de la pleine lune' !");
    }

    public String toString() {
        return "je suis un " + this.getClass() + " de couleur " + this.couleur + " et je pèse " + this.poids + "kg.";
    }
} 

class Chien extends Canin {
    public Chien() {
        this.couleur = "inconnu";
        this.poids = 0;
    }

    public Chien(String couleur, int poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    public void crier() {
        System.out.println("J'aboie sur les visiteurs !");
    }

    public String toString() {
        return "je suis un " + this.getClass() + " de couleur " + this.couleur + " et je pèse " + this.poids + "kg.";
    }
} 

class Lion extends Felin {
    public Lion() {
        this.couleur = "inconnu";
        this.poids = 0;
    }

    public Lion(String couleur, int poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    public void crier() {
        System.out.println("Je rugis!");
    }

    public String toString() {
        return "je suis un " + this.getClass() + " de couleur " + this.couleur + " et je pèse " + this.poids + "kg.";
    }
} 

class Tigre extends Felin {
    public Tigre() {
        this.couleur = "inconnu";
        this.poids = 0;
    }

    public Tigre(String couleur, int poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    public void crier() {
        System.out.println("Je grogne !");
    }

    public String toString() {
        return "je suis un " + this.getClass() + " de couleur " + this.couleur + " et je pèse " + this.poids + "kg.";
    }
} 

class Chat extends Felin {
    public Chat() {
        this.couleur = "inconnu";
        this.poids = 0;
    }

    public Chat(String couleur, int poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    public void crier() {
        System.out.println("Je miaule !");
    }

    public String toString() {
        return "je suis un " + this.getClass() + " de couleur " + this.couleur + " et je pèse " + this.poids + "kg.";
    }
} 