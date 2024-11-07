package ProbniTest;

public class Artikl {
    /*
    Napraviti klasu Artikl koji od atributa ima naziv, cenu I godinu proizvodnje.
     */
    private String naziv;
    private double cena;
    private int godinaProizvodnje;


    public Artikl(String naziv, double cena, int godinaProizvodnje) {
        this.naziv = naziv;
        this.cena = cena;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String toString(){
        return naziv+" "+cena+" "+godinaProizvodnje;
    }
}
