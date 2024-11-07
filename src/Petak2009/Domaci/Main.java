package Petak2009.Domaci;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*
Napraviti klasu Knjiga koja ima atribute: naslov, broj strana, i godina izdavanja.
Napraviti klasu Pisac koja ima atribute: ime, godina rođenja, i lista knjiga (lista objekata klase Knjiga).
Napraviti metode:
najpoznatijaKnjiga() -> koja vraća naslov knjige sa najvećim brojem strana.
vremePisanja() -> koja vraća razliku između godine izdavanja prve i poslednje knjige.
Napraviti klasu Romanopisac koji nasledjuje klasu Pisac i specifična metoda je:
dugometrazniRoman() -> vraća "dugometražni roman" ako knjiga ima više od 500 strana.
Napraviti klasu Pesnik koji nasledjuje klasu Pisac i ima metodu:
brojZbirki() -> koja vraća broj knjiga koje imaju manje od 100 strana (pretpostavljamo da su zbirke poezije kraće).
Napraviti klasu Eseista koja nasledjuje klasu Pisac i dodati metodu:
kratkiEseji() -> vraća broj eseja (knjiga) koji imaju manje od 50 strana.
 */
        Knjiga k1 = new Knjiga("Iza kiše", 550, 2022);
        Knjiga k2 = new Knjiga("Moj Kompas", 40, 2020);
        Knjiga k3 = new Knjiga("Porodični dnevnik", 80, 2024);

        ArrayList<Knjiga> listaKnjiga =new ArrayList<>();
        listaKnjiga.add(k1);
        listaKnjiga.add(k2);
        listaKnjiga.add(k3);

        Pisac p = new Pisac("Srđan", 1985, listaKnjiga);

        System.out.println("Najduža knjiga je: "+p.najpoznatijaKnjiga());
        System.out.println("Razlika između prve i poslenjde napisane knjige je "+p.vremePisanja()+" godina");

        Romanopisac rp=new Romanopisac("Srđan", 1985,listaKnjiga);
        rp.dugometrazniRoman();

        Pesnik ps=new Pesnik("Srđan", 1985, listaKnjiga);
        System.out.println("Broj izdatih zbirki je: "+ps.brojZbirki());

        Eseista e=new Eseista("Srđan", 1985,listaKnjiga);
        System.out.println("Broj kratkih eseja je: "+e.kratkiEsej());
    }
}
