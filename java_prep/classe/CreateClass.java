public class CreateClass {
    public static void main(String []args) {
        Ville test = new Ville("Nantes", "France", 213);
        Ville tmp = new Ville();
        Ville test1 = new Ville("Paris","France",123);

        System.out.println("Le nom de la ville 1 est :" + test.getNomVille());
        System.out.println("Le nom de la ville 2 est :" + test1.getNomVille());

        //on interchange le nom des villes
        tmp.setNomVille(test.getNomVille());
        test.setNomVille(test1.getNomVille());
        test1.setNomVille(tmp.getNomVille());
        
        System.out.println("Le nom de la ville 1 est :" + test.getNomVille());
        System.out.println("Le nom de la ville 2 est :" + test1.getNomVille());


    }
}