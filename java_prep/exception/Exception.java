import java.util.Scanner;

public class Exception {
    //exception 
    public static void main(String []args) {

        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt(), i = scan.nextInt();
        try {
            System.out.println("La division de " + j + " par " + i + " donne : " + j/i);
        } catch (ArithmeticException e) {
            System.out.println("Division par zéro, impossible !");
        }

        System.out.println("Coucou toi !");
    }
}