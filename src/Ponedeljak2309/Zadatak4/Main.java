package Ponedeljak2309.Zadatak4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Napraviti klasu Aplikacija koja od atributa ima naziv, broj korisnika i ukupno vremena provedeno na toj aplikaciji.
Klasa Aplikacija ima metode:
-zarada() -> zaradjuje 10 po korisniku
Napraviti klasu Telefon koji kao atribut ima naziv i listu aplikacija. Napraviti metodu:
- najkoriscenija() -> vraca aplikaciju koja se najvise koristi
- netWorth() -> vraca ukupnu zaradu svih aplikacija koje telefon ima
- delete(Aplikacija a) -> brise aplikaciju iz liste - ako se ta aplikacija nalazi u listi obrisati.
Napraviti klasu Android koji nasledjuje klasu Telefon.
Napraviti klasu IPhone koji nasledjuje klasu Telefon i on najvise koristi aplikaciju koja najvise zaradjuje.
         */
        Aplikacija a=new Aplikacija("Facebook", 400,1000);
        System.out.println("Zadara Facebooka: "+a.zarada());
        Aplikacija a2=new Aplikacija("Instagram", 200,500);
        System.out.println("Zarada Instagrama: "+a2.zarada());
        Aplikacija a3=new Aplikacija("Tiktok", 300,1500);
        System.out.println("Zarada Tiktoka: "+a3.zarada());

        ArrayList<Aplikacija> lista=new ArrayList<>();
        lista.add(a);
        lista.add(a2);
        lista.add(a3);

        Telefon t=new Iphone("Samsung", lista);
        t.najkoriscenija();
        System.out.println("Ukupna zarada svih aplikacija: "+t.netWorth());
        t.delete("tiktok");
        System.out.println(t.getListaAplikacija());
    }
}
