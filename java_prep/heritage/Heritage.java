
public class Heritage {
    public static void main(String []args) {
        Ville v1 = new Ville("Paris", "France", 128);
        Capitale c1 = new Capitale("Paris", "France", 128, "Sarkozy"); 
       
        System.out.println(c1.toString());

        System.out.println("\n\nApplication du polymorphisme.. \n\n");

        System.out.println(v1.toString());
    }
}
