import java.util.*;

public class Exercice 
{
    public static void main(String []args) {
        //tableau une dim.
        int tab[] = new int[10];
        int a = 0 ;
        int i = 0;
        for(int str : tab) {
            tab[i] = tab[i] + a;
            a = a + 2;
            System.out.println(tab[i]);
            i++;
        }

        //recherche d'un élément dans un tableau.
        System.out.println("l'indice du nombre 2 est : " + Arrays.binarySearch(tab,2));


    }
}