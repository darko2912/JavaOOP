package Sreda1809.Zadatak4;

public class Main {
    public static void main(String[] args) {
        /*
        Napraviti klasu Knjiga koja ima od atributa naziv, broj strana,godinu izdanja i cenu.
Napraviti metodu:
-popust() -> ako je duzina knjige veca od 300 strana, umanjiti za 20%
-oldTimer() -> ako je knjiga starija od 20 godina, ispisati poruku da je u pitanju stara knjiga
         */

        Knjiga k = new Knjiga("Iza kiše",328,2022,3000);
        System.out.println(k);
        k.popust();
        System.out.println(k.getCena());
        k.oldTimer(2024);
    }
}
