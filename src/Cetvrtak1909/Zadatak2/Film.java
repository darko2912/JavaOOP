package Cetvrtak1909.Zadatak2;

public class Film {
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
    private int godinaObjavljivanja;
    private double ukupnaZarada;
    private Glumac g;

    public Film (int godinaObjavljivanja, double ukupnaZarada, Glumac g){
        this.godinaObjavljivanja=godinaObjavljivanja;
        this.ukupnaZarada=ukupnaZarada;
        this.g=g;
    }
    public int getGodinaObjavljivanja(){
        return godinaObjavljivanja;
    }
    public void setGodinaObjavljivanja(int godinaObjavljivanja) {
        this.godinaObjavljivanja = godinaObjavljivanja;
    }
    public double getUkupnaZarada() {
        return ukupnaZarada;
    }
    public void setUkupnaZarada(double ukupnaZarada) {
        this.ukupnaZarada = ukupnaZarada;
    }
    public Glumac getG() {
        return g;
    }
    public void setG(Glumac noviGlumac) {
        this.g = noviGlumac;
    }

    public int godineGlavnogGlumca(){
        int godine=getGodinaObjavljivanja()-g.getGodinaRodjenja();
        return godine;
    }

    public double troskovi(){
        double trosak=getUkupnaZarada()*0.2;
        return trosak;
    }

    public String toString(){
        return godinaObjavljivanja+" "+ukupnaZarada+" "+g;
    }
}
