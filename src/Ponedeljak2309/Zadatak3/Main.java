package Ponedeljak2309.Zadatak3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Napraviti klasu Ucenik koji ima kao atribute ime, broj neopravdanih I listu ocena.
Napraviti metodu:
- prosek() -> racuna ucenikov prosek
Napraviti klasu Skola koja ima listu ucenika i metode:
- vukovci() -> vraca listu djaka koji imaju prosek 5.0
- izbaci() -> izbacuje iz liste sve djake koji imaju prosek ispod 1.5
- ukupnoNeopravdanih() -> vraca sumu svih neopravdanih od ucenika
         */

        ArrayList<Integer> ocene=new ArrayList<>();
        ocene.add(5);
        ocene.add(3);
        ocene.add(4);
        Ucenik u1=new Ucenik("Darko", 5,ocene);

        ArrayList<Integer> ocene2=new ArrayList<>();
        ocene2.add(5);
        ocene2.add(5);
        ocene2.add(5);
        Ucenik u2=new Ucenik("Marko", 5,ocene2);

        ArrayList<Integer> ocene3=new ArrayList<>();
        ocene3.add(1);
        ocene3.add(2);
        ocene3.add(1);
        Ucenik u3=new Ucenik("Miloš", 5,ocene3);


        ArrayList<Ucenik> lista=new ArrayList<>();
        lista.add(u1);
        lista.add(u2);
        lista.add(u3);
        Skola s=new Skola(lista);
        System.out.println("Vukovci "+s.vukovci());
        System.out.println("Neopravdani "+s.neopravdani());
        s.izbaci();
        System.out.println("Nova lista učenika "+s.getListaUcenika());
    }
}
