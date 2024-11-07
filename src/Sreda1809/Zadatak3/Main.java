package Sreda1809.Zadatak3;

public class Main {
    public static void main(String[] args) {
        /*
        Napraviti klasu Radnik koja ima id, godinu zaposlenja i platu radnika.
Napraviti metodu koja racuna staz radniku i metodu koja daje povisicu za 20%
ukoliko se radnik tu nalazi vise od 5 godina, i povisicu od 40% ukoliko ima
staz duzi od 10 godina.
Napraviti adekvatan konstruktor, get i set metod, kao i toString.
         */

        Radnik r = new Radnik(12,2020,80000);
        System.out.println(r);
        System.out.println("Godine radnog staža: "+r.staz());
        r.povisica();
        System.out.println("Vaša plata je "+r.getPlata());

    }
}
