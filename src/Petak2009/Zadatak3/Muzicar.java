package Petak2009.Zadatak3;

public abstract class Muzicar {
    /*
    Napraviti klasu Album koji ima kao atribute naziv, godinu objavljivanja I broj pesama.
Napraviti klasu Muzicar koji od atributa ima ime, godinu pocetka karijere I jedan album.
Napraviti metode:
- prviHit() -> ukoliko je album objavljen kad je muzicar I zapoceo karijeru, ispisati poruku da mu je to prvi hit
- zarada() -> vraca zaradu od albuma ako znamo da zaradjuje 1000 po pesmi.
Napraviti klasu RokMuzicar koji nasledjuje klasu Muzicar I on zaradjuje 750 po pesmi.
Napraviti klasu PopMuzicar koji nasledjuje klasu Muzicar.
Napraviti klasu Reper koji nasledjuje klasu Muzicar I on zaradjuje 500 po pesmi.
     */
    private String ime;
    private int godinaPocetkaKarijere;
    private Album a;

    public Muzicar(String ime, int godinaPocetkaKarijere, Album a) {
        this.ime = ime;
        this.godinaPocetkaKarijere = godinaPocetkaKarijere;
        this.a = a;
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String novoIme) {
        this.ime = novoIme;
    }
    public int getGodinaPocetkaKarijere() {
        return godinaPocetkaKarijere;
    }
    public void setGodinaPocetkaKarijere(int novaGodinaPocetkaKarijere) {
        this.godinaPocetkaKarijere = novaGodinaPocetkaKarijere;
    }
    public Album getA() {
        return a;
    }
    public void setA(Album a) {
        this.a = a;
    }

    public void prviHit(){
        if (getGodinaPocetkaKarijere()==a.getGodinaObjavljivanja()){
            System.out.println("Ovo je moj prvi hit.");
        }
    }

    public abstract double zarada();

    public String toString(){
        return ime+" "+godinaPocetkaKarijere+" "+a;
    }
}
