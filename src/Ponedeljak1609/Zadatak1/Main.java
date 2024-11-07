package Ponedeljak1609.Zadatak1;

public class Main {
    public static void main(String[] args) {
        /*
        Napraviti klasu Auto koja ima od atributa naziv modela, maksimalnu brzinu na sat, cenu i boju.
Napraviti metodu koja racuna za Koliko sati taj auto moze da predje 1000km.
Napraviti metodu koja smanjuje cenu za 10% ako je boja automobila ljubicasta.
Klasa mora imati adekvatan konstruktor i toString.
         */

        Auto a = new Auto("Renault", 200, 10000, "ljubičasta");

        System.out.println(a);
        System.out.println(a.potrebnoSati());
        System.out.println(a.cenaSaPopustom());
    }
}
