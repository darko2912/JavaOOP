package Sreda1809.Zadatak2;

public class Main {
    public static void main(String[] args) {
        /*
        Napraviti klasu Sportista koji od atributa ima ime, broj nagrada i godinu rodjenja.
Napraviti metodu:
- penzija(int potrebnoNagrada) -> ova metoda prima kao argument neki potreban broj nagrada da bi
sportista otisao u penziju
- veteran() -> metoda ispisuje poruku o tome da li je ovaj sportista veteran, tj stariji od 40 godina
Napraviti adekvatan konstruktor, get i set metod, kao i toString.
         */
        Sportista s=new Sportista("Darko",10, 1995);
        System.out.println(s);
        s.setBrojNagrada(5);
        System.out.println(s.getBrojNagrada());
        s.penzija(12);
        s.veteran();
    }
}
