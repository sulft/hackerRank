import java.lang.Exception;

public class PersonnaliseExcep {
    public static void main(String[]args) {
        try {
            Ville v = new Ville("Paris","France",-12000);
            System.out.println(v.toString());
        } catch(HabitantException e) {
            
        }
    }
}