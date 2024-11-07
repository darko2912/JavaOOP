package Cetvrtak1909.Zadatak1;

public class DrustvenaMreza {
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
    private int brojKorisnika;
    private int brojReklama;

    public DrustvenaMreza (int brojKorisnika, int brojReklama){
        this.brojKorisnika=brojKorisnika;
        this.brojReklama=brojReklama;
    }

    public int getBrojKorisnika(){
        return brojKorisnika;
    }
    public void setBrojKorisnika (int noviKorisnici){
        this.brojKorisnika +=noviKorisnici;
    }
    public int getBrojReklama(){
        return brojReklama;
    }
    public void setBrojReklama(int noveReklame){
        this.brojKorisnika+=noveReklame;
    }

    public double zarada(){
        return (getBrojReklama()*5)+(getBrojKorisnika()*2);
    }

    public void upozorenje(){
        if (getBrojKorisnika()<200){
            System.out.println("Društvena mreža nema dovoljno korisnika.");
        } else {
            System.out.println("Društvena mreža ima dovoljno korisnika.");
        }
    }

    public String toString (){
        return brojKorisnika+" "+brojReklama;
    }
}
