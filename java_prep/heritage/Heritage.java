
public class Heritage {
    public static void main(String []args) {
        Ville v1 = new Ville("Paris", "France", 128);
        Capitale c1 = new Capitale("Paris", "France", 128, "Sarkozy"); 
       
        System.out.println(c1.toString());

        System.out.println("\n\nApplication du polymorphisme.. \n\n");

        System.out.println(v1.toString());

        System.out.print("\n\n\n\n");

        //appplication des covariances
        System.out.println("Application de la covariance");
        //création d'un tableau de ville 
        Ville [] v = new Ville[6];

        String [] nomVille = {"bordeaux","Caen","Lyon","Montpellier","Nantes","Bourges"};
        int [] nbHabitant = {115900,85000,75900,85632,42365,59630};

        for(int i = 0; i < v.length ; i++) {
            if(i<3) {
                Ville v2 = new Ville(nomVille[i],"France",nbHabitant[i]);
                v[i] = v2;
            }
            else {
                Capitale c2 = new Capitale(nomVille[i],"France",nbHabitant[i],"Macron");
                v[i] = c2;
            }
            System.out.println(v[i].toString());
        }
    }
}
