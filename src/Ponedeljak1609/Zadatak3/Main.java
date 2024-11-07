package Ponedeljak1609.Zadatak3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Napraviti klasu Namirnica koja ima naziv i cenu.
Napraviti klasu Korpa koja ima listu namernica i metodu za racunanje ukupne cene svih namernica.
Klasa mora imati adekvatan konstruktor I toString.
         */

        Namirnica n1 = new Namirnica("Hleb", 50);
        Namirnica n2 = new Namirnica("Mleko", 150);

        ArrayList<Namirnica> lista = new ArrayList<>();
        lista.add(n1);
        lista.add(n2);
        Korpa bag = new Korpa(lista);
        System.out.println(bag);
        System.out.println(bag.ukupnaCena());
    }
}
