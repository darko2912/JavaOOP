package Ponedeljak2309.Domaci;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Napraviti klasu Igrac koja ima atribute: ime, godine iskustva, i broj postignutih poena.
Napraviti klasu Klub koja ima atribute: naziv, grad, i lista igraca (lista objekata klase Igrac).
Napraviti metode:
- najiskusnijiIgrac() -> vraca ime igrača sa najvise godina iskustva.
- ukupnoPoena() -> vraća ukupan broj poena koje su postigli svi igrači u klubu.
- vrednostTima() -> vraca vrednost tima (apstraktan metod)
Napraviti klasu KosarkaskiKlub koja nasleđuje klasu Klub, i dodati specifičnu metodu:
- sampionTima() -> vraća ime igraca koji ima više od 1000 postignutih poena.
Napraviti klasu FudbalskiKlub koja nasleđuje klasu Klub, i dodati metodu:
- najboljiStrelac() -> vraca ime igraca sa najvise postignutih golova
(golove cemo interpretirati kao postignute poene).
Napraviti klasu OdbojkaškiKlub koja nasleđuje klasu Klub, i dodati metodu:
- odbrambeniAs() -> vraća ime igrača koji ima najvise poena, ali je igrao manje od 3 godine.
vrednostTima() -> za kosarkaski tim racunamo da igrac vredi 50 za svaki postignut poen,
za fudbalski tim racunamo da igrac vredi po 1000 za svaki postignut gol,
dok za odbojkaski tim svaki igrac vredi 100 po poenu. Vrednost tima predstavlja sumu cena svih njegovih igraca
         */
        System.out.println("-----------------------------------------");

        Igrac i1=new Igrac("Teodosić",20,5000);
        Igrac i2=new Igrac("Topić", 3,800);
        Igrac i3=new Igrac("Nedović", 15,4000);
        ArrayList<Igrac> lista=new ArrayList<>();
        lista.add(i1);
        lista.add(i2);
        lista.add(i3);

        KosarkaskiKlub kk=new KosarkaskiKlub("KK Crvena zvezda", "Beograd",lista);
        System.out.println(kk.getNaziv());
        System.out.println("Najiskusniji igrač u timu: "+kk.najiskusnijiIgrac());
        System.out.println("Ukupno timskih poena: "+kk.ukupnoPoena());
        kk.sampionTima();
        System.out.println("Ukupna Vrednost tima: "+kk.vrednostTima());

        System.out.println("-----------------------------------------");

        Igrac i4=new Igrac("Katai",20,200);
        Igrac i5=new Igrac("Ivanić", 15,150);
        Igrac i6=new Igrac("Spajić", 15,10);
        ArrayList<Igrac> lista2=new ArrayList<>();
        lista2.add(i4);
        lista2.add(i5);
        lista2.add(i6);

        FudbalskiKlub fk=new FudbalskiKlub("FK Crvena zvezda", "Beograd",lista2);
        System.out.println(fk.getNaziv());
        System.out.println("Najiskusniji igrač u timu: "+fk.najiskusnijiIgrac());
        System.out.println("Ukupno timskih golova: "+fk.ukupnoPoena());
        System.out.println("Najbolji strelac tima: "+fk.najboljiStrelac());
        System.out.println("Ukupna vrednost tima: "+fk.vrednostTima());

        System.out.println("-----------------------------------------");

        Igrac i7=new Igrac("Petrović",10,1000);
        Igrac i8=new Igrac("Ristić", 5,500);
        Igrac i9=new Igrac("Nikolić", 4,100);
        ArrayList<Igrac> lista3=new ArrayList<>();
        lista3.add(i7);
        lista3.add(i8);
        lista3.add(i9);

        OdbojkaškiKlub ok=new OdbojkaškiKlub("OK Crvena zvezda", "Beograd",lista3);
        System.out.println(ok.getNaziv());
        System.out.println("Najiskusniji igrač u timu: "+ok.najiskusnijiIgrac());
        System.out.println("Ukupno timskih golova: "+ok.ukupnoPoena());
        ok.odbrambeniAs();
        System.out.println("Ukupna vrednost tima: "+ok.vrednostTima());
    }
}
