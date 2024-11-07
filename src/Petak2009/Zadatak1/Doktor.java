package Petak2009.Zadatak1;

public abstract class Doktor {
    /*
    Napraviti klasu Doktor koji od atributa ima ime, broj pacijenata i godinu zaposlenja.
Napraviti metode:
- godineStaza() -> racuna Koliko doktor ima godina staza
- plata() -> racuna koliku platu ima doktor ako zaradjuje 100 po pacijentu
Napraviti klasu Pedijatar koji nasledjuje klasu Doktor I on zaradjuje 150 po pacijentu.
Napraviti klasu Hirurg koji nasledjuje klasu Doktor I on zaradjuje 230 po pacijentu.
Napraviti klasu Oftalmolog koji nasledjuje klasu Doktor.
     */
    private String ime;
    private int brojPacijenata;
    private int godinaZposlenja;

    public Doktor (String ime, int brojPacijenata, int godinaZposlenja){
        this.ime=ime;
        this.brojPacijenata=brojPacijenata;
        this.godinaZposlenja=godinaZposlenja;
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public int getBrojPacijenata() {
        return brojPacijenata;
    }
    public void setBrojPacijenata(int brojPacijenata) {
        this.brojPacijenata = brojPacijenata;
    }
    public int getGodinaZposlenja() {
        return godinaZposlenja;
    }
    public void setGodinaZposlenja(int godinaZposlenja) {
        this.godinaZposlenja = godinaZposlenja;
    }

    public int godineStaza(int trenutnaGodina){
        int staz = trenutnaGodina-getGodinaZposlenja();
        return staz;
    }

    public abstract double plata();

    public String toString(){
        return ime+" "+brojPacijenata+" "+godinaZposlenja;
    }
}
