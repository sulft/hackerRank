import java.util.*;

public class For {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre: ");
        char reponse = 'O';
        while(reponse == 'O') {
            for(int i = sc.nextInt(); i>=0 ; i--) {
                System.out.println("Compte a rebours: " + i);
            }
            System.out.println("Recommencer ? (O:oui ou N:non) ");
            sc.nextLine();
            reponse = sc.nextLine().charAt(0);
            if(reponse == 'O') {
                System.out.print("\n");
                System.out.println("Entrez un nombre: ");
            }
            else if (reponse == 'N'){
                reponse = 'N';
                System.out.print("\n");
                System.out.println("Au revoir..");
            }
            else {
                System.out.print("\n");
                System.out.println("ERREUR DE SAISIE!");
            }
        }
    }
}