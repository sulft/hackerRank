public class Abstrait {
    public static void main(String []args) {
        Animal c = new Chat("bleu",56);
        c.manger();
        c.boire();
        c.deplacement();
        c.crier();
        System.out.println(c.toString());
    }
}
