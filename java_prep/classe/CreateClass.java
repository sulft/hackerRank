public class CreateClass {
    public static void main(String []args) {
        Ville test = new Ville();
        Ville test1 = new Ville("Paris","France",123);

        System.out.println(test.getNomVille());

        test.setNomVille("Nantes");

        System.out.println(test.getNomVille());

    }
}