public class CreateClass {
    public static void main(String []args) {
        Ville test = new Ville("Nantes", "France", 213);
        Ville test1 = new Ville("Paris","France",123);

        test.comparer(test1);

        System.out.println("Nombre de ville : " + test1.getNbVille());
    }
}