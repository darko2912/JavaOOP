package Sreda1809.Zadatak5;

import Sreda1809.Zadatak4.Knjiga;

public class Main {
    public static void main(String[] args) {
    /*
    Napraviti klasu Autor koji u sklopu ima ime, godinu rodjenja,ukupan broj prodanih dela i jednu knjigu. (Kombinujemo sa klasom knjiga, koristimo ovu klasu u klasi autor)
Napraviti metodu:
-ranaObjava() -> ispisati poruku ako je autor objavio svoju knjigu pre 25 godine
-zarada() -> Koliko je zaradio ukupno para od svih prodanih dela ako racunamo da imaju isti cenu kao ta jedna knjiga
     */

        Autor a = new Autor("Darko", 2000, 200, new Knjiga("Iza Kiše",350,2022,1000));
        a.ranaObjava();
        a.zarada();
    }
}
