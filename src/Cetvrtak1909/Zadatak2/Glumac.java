package Cetvrtak1909.Zadatak2;

public class Glumac {
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
    private String ime;
    private int godinaRodjenja;

    public Glumac (String ime, int godinaRodjenja){
        this.ime=ime;
        this.godinaRodjenja=godinaRodjenja;
    }
    public String getIme(){
        return ime;
    }
    public void setIme(String novoIme){
        this.ime=novoIme;
    }
    public int getGodinaRodjenja(){
        return godinaRodjenja;
    }
    public void setGodinaRodjenja(int novaGodina){
        this.godinaRodjenja=novaGodina;
    }
    public String toString(){
        return ime+" "+godinaRodjenja;
    }
}
