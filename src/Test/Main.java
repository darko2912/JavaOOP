package Test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Napraviti klasu Planina
atributi: naziv(String), visina(double ili int) i opasnost(Boolean)
Napraviti klasu Planinar
atributi:lista planina, max uspon(maksimalna visina na koju taj planinar moze da se popne)
Metode: -dodaj(Planina p) -> ubacuje datu planinu u listu ukoliko je njena visina manja ili jednaka max usponu
	-opasne() -> metoda vraca listu planina koje su opasne za penjanje
 	-izbaci() -> izbacuje planinu iz liste ukoliko je veca od max uspona nekog planinara ili ako je opasna
	-najveca()-> vraca najvecu planinu iz planinarove liste
Napraviti klasu Rekreativac koji nasledjuje klasu Planinar.
Napraviti klasu Amater koji nasledjuje klasu Planinar.
Napraviti klasu Pro koji nasledjuje klasu Planinar koji iz svoje liste izbacuje samo planine
koje su vece od njegovog maxUspon-a.(override izbaci)
Za sve klase je potrebno deklarisati dati konstruktor, get,set i toString.
         */

        Planina p1=new Planina("Zlatibor",1800,false);
        Planina p2=new Planina("Tara",2000,false);
        Planina p3=new Planina("Stara planina",2500,true);
        Planina p4=new Planina("Zlatar",1700,true);
        Planina p5=new Planina("Golija", 1500,false);
        Planina p6=new Planina("Šar planina", 2800,true);

        ArrayList<Planina> lista=new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        Planinar pl=new Pro(2000,lista);
        System.out.println("Trenutna lista: "+pl);
        pl.dodaj(p5);
        pl.dodaj(p6);
        System.out.println("Ažurirana lista: "+pl);
        pl.najveca();
        System.out.println("Opasne planine su: "+pl.opasne());
        pl.izbaci();
        System.out.println("Lista nakon izbačenih planina: "+pl);


    }
}
