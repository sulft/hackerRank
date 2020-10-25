
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
        Ville[] tab = new Ville[6];

        String[] nVille = {"Marseille","Paris","Bordeaux","Lyon","Montpellier","Nantes"};
        int[] nbHabitant = {128,1258,158222,12,159,960};


        for(int i = 0; i < tab.length; i++) {
            System.out.println(i+1);
            if(i<3) {
                Ville v = new Ville(nVille[i],"France",nbHabitant[i]);
                tab[i] = v;
            }
            else {
                Capitale c  = new Capitale(nVille[i],"France",nbHabitant[i],"Sarkozy");
                tab[i] = c;
            }
        }
    }
}
