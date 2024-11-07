package Cetvrtak1909.Zadatak1;

public class Main {
    public static void main(String[] args) {
            /*
    Napraviti klasu DrustvenaMreza koja od atributa ima broj korisnika i broj reklama.
Napraviti metodu:
- zarada() -> racuna zaradu za drustvene mreze ako zaradjuje 2 po korisniku a 5 po reklami.
- upozorenje() -> ispisuje poruku o upozorenju ukoliko drustvena mreza nema dovoljno korisnika
(manje od 200)
Napraviti klasu Facebook koji nasledjuje klasu DrustvenaMreza.
Napraviti klasu Instagram koji nasledjuje klasu DrustvenaMreza I on zaradjuje 1 po korisniku
I 10 po reklami.
Napraviti klasu TikTok koji nasledjuje klasu DrustvenaMreza I on ispisuje upozorenje ukoliko
ima manje od 500 korisnika.
             */
        Facebook f=new Facebook(250,100);
        System.out.println("Zarada za fb je: "+f.zarada());
        f.upozorenje();

        Instagram i=new Instagram(250,100);
        System.out.println("Zarada za insta: "+i.zarada());
        i.upozorenje();

        TikTok tt=new TikTok(550,100);
        System.out.println("Zarada za TT: "+tt.zarada());
        tt.upozorenje();
    }
}
