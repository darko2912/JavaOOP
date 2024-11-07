package Ponedeljak2309.Zadatak1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Napraviti klasu Nekretnina koja ima kao atribut kvadraturu, cena po kvadratu i listu ponuda.
Napraviti metode:
- najvecaPonuda() -> vraca najvecu ponudu iz liste
- cena() -> vraca cenu nekretnine, ukoliko ima vise od 100 kvadrata, na ukupnu svotu dati popust od 15%
Napraviti klasu Stan koji nasledjuje klasu Nekretnina.
Napraviti klasu Kuca koji nasledjuje klasu Nekretnina i on daje popust od 20% ukoliko je kuca veca od 200 kvadrata.
Napraviti klasu Lokal nasledjuje klasu Nekretnina i on daje popust od 25% ukoliko je kuca veca od 250 kvadrata.
         */

        ArrayList<Double> listaPonuda=new ArrayList<>();
        listaPonuda.add(50000.0);
        listaPonuda.add(30000.0);
        listaPonuda.add(45000.0);

        Nekretnina n=new Lokal(251,1000,listaPonuda);
        System.out.println(n.cena());
        System.out.println(n.najvecaPonuda());
    }
}
