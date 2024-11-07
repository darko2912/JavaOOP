package ProbniTest;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Napraviti klasu Artikl koji od atributa ima naziv, cenu I godinu proizvodnje.
Napraviti klasu Prodavnica koja od atributa ima broj zaposlenih I listu artikala.
Napraviti metode:
-blackFriday() -> sve artikle iz liste spusta za 50%
-pronadji(String a) -> trazi prosledjeni naziv u listi artikala
-triftKolekcija() -> vraca listu artikala koji su stariji od 20 godina
-ukupnaZarada() -> racuna Koliko prodavnica zaradjuje kada proda sve artikle, uz to da svakog zaposlenog placaju 100
-izbaciPrestaro() -> izbacuje iz liste sve artikle koji su stariji od 30 god
Napraviti klasu HM koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 150.
Napraviti klasu Zara koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 200.
Napraviti klasu Reserved koji ima dodatni atribut za ocekivanu godisnju zaradu, ukoliko je to ispunjeno
svi zaposleni dobijaju platu od 200, u suprotnom imaju platu od 100.
Napraviti klasu SportVision I on za black Friday daje popust od 30% na sve artikle.
Za sve klase kreirati adekvatne konstruktore, geter I setere kao I toString.
Modifikovanje metoda je dozvoljeno kao I kreiranje dodatnih.
         */
        Artikl a1=new Artikl("Majica", 1000,2010);
        Artikl a2=new Artikl("Pantalone", 2000,2000);
        Artikl a3=new Artikl("Duks", 3000,1990);
        ArrayList<Artikl> lista =new ArrayList<>();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);

        Prodavnica p=new SportVision(2,lista);
        p.blackFriday();
        p.pronadji("majica");
        System.out.println("Artikli stariji od 20 godina: "+p.triftKolekcija());
        System.out.println("Ukupna zarada: "+p.ukupnaZarada());
        p.izbaciPrestaro();

    }
}
