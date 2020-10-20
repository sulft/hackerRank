import java.util.*;

public class Scanner1 {
    public static void main(String []args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Quel age as-tu ?");
        int b = a.nextInt();

        System.out.println("Tu as " + b + " ans.");

        //condition ternaire
        b = (b<18) ? 18 : b; //si l'utilisateur a moins de 18 ans. Je le fais avoir 18 ans
    }

        System.out.println("Tu as " + b + " ans."); 
    }
}
