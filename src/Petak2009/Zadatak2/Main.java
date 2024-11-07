package Petak2009.Zadatak2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Napraviti klasu Ucenik koji ima kao atribute ime, fiksna cena skolovanja, listu ocena I broj neopravdanih.
Napraviti metode:
- zaUkor() -> vraca true ili false u zavisnosti od toga da li djak ispunjava neke uslove za ukor
(da li ima vise od 10 nepravdanih ili ako ima vise od 10 jedinica).
- cenaSkolovanja() -> vraca punu cenu skolovanja ako racunamo da pored vec fiksnih troskova imamo I druge troskove koji
iznose 15% od fiksne cene skolovanja
Klasa Osnovac nasledjuje klasu Ucenik.
Klasa SrednjoSkolac nasledjuje klasu Ucenik I on ima 25% dodatnih troskova.
Klasa Student nasledjuje klasu Ucenik I on ima 30% dodatnih troskova.
         */
        ArrayList<Integer> ocene=new ArrayList<>();
        ocene.add(1);
        ocene.add(1);
        ocene.add(1);
        ocene.add(1);
        ocene.add(5);
        ocene.add(1);
        ocene.add(1);
        ocene.add(1);
        ocene.add(1);
        ocene.add(1);
        ocene.add(1);

        Ucenik u1 = new Osnovac("Darko", 1000, ocene,5);
        System.out.println("Ukupna cena školovanja za osnovca je "+u1.ukupnaCenaSkolovanja());
        if (u1.zaUkor()){
            System.out.println("Učenik ima ulsove za ukor.");
        } else {
            System.out.println("Učenik nema uslov za ukor.");
        }

        Ucenik u2 = new Srednjoskolac("Marko", 10000, ocene,4);
        System.out.println("Ukupna cena školovanja za srednjoškolce je "+u2.ukupnaCenaSkolovanja());
        if (u2.zaUkor()){
            System.out.println("Učenik ima ulsove za ukor.");
        } else {
            System.out.println("Učenik nema uslov za ukor.");
        }

        Ucenik u3 = new Student("Miloš", 100000, ocene,1);
        System.out.println("Ukupna cena školovanja za studente je "+u3.ukupnaCenaSkolovanja());
        if (u3.zaUkor()){
            System.out.println("Student ima ulsove za ukor.");
        } else {
            System.out.println("Student nema uslov za ukor.");
        }
    }
}
