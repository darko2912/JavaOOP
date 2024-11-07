package Ponedeljak2309.Zadatak4;

public class Aplikacija {
    /*
    Napraviti klasu Aplikacija koja od atributa ima naziv, broj korisnika i ukupno vremena provedeno
    na toj aplikaciji.
Klasa Aplikacija ima metode:
-zarada() -> zaradjuje 10 po korisniku
     */
    private String ime;
    private int brojKorisnika;
    private int vreme;


    public Aplikacija(String ime, int brojKorisnika, int vreme) {
        this.ime = ime;
        this.brojKorisnika = brojKorisnika;
        this.vreme = vreme;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrojKorisnika() {
        return brojKorisnika;
    }

    public void setBrojKorisnika(int brojKorisnika) {
        this.brojKorisnika = brojKorisnika;
    }

    public int getVreme() {
        return vreme;
    }

    public void setVreme(int vreme) {
        this.vreme = vreme;
    }

    public double zarada(){
        return getBrojKorisnika()*10;
    }

    public String toString(){
        return ime+" "+brojKorisnika+" "+vreme;
    }
}
