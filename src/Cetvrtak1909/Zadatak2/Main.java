package Cetvrtak1909.Zadatak2;

public class Main {
    public static void main(String[] args) {
        /*
Napraviti klasu Glumac koji ima godinu rodjenja I ime.
Napraviti klasu Film koji od atributa ima godinu objavljivanja, glavnog glumca I ukupno zaradjenih para.
Napraviti metode:
- godineGlavnogGlumca() -> kao rezultat vraca broj godina koje je glumac imao kad je snimio film
- troskovi() -> vraca nam koliki su troskovi ako racunamo da iznose 20% od ukupne zarade filma
Klasa Horor nasledjuje klasu Film.
Klasa AkcioniFilm nasledjuje klasu Film I njegovi troskovi iznose 40% od ukupne zarade.
Klasa Romantika nasledjuje klasu Film I njegovi troskovi iznose 10% od ukupne zarade.
         */

//        Horor h=new Horor(2020, 1000,new Glumac("Darko", 1995));
//        System.out.println("Godine glumca: "+h.godineGlavnogGlumca());
//        System.out.println("Troškovi za horor film: "+h.troskovi());
//
//        AkcioniFilm af=new AkcioniFilm(2010,10000,new Glumac("Darko", 1995));
//        System.out.println("Godine glumca: "+af.godineGlavnogGlumca());
//        System.out.println("Troškovi za akcioni film: "+af.troskovi());
//
//        Romantika r=new Romantika(2015,5000,new Glumac("Darko", 1995));
//        System.out.println("Godine glumca: "+r.godineGlavnogGlumca());
//        System.out.println("Troškovi za romantiku: "+r.troskovi());

        Film f=new AkcioniFilm(2020, 10000, new Glumac("Darko", 1995));
        System.out.println("Godine glumca: "+f.godineGlavnogGlumca());
        System.out.println("Troškovi filma: "+f.troskovi());
    }
}
