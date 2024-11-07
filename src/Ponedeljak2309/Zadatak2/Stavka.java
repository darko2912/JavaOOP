package Ponedeljak2309.Zadatak2;

public class Stavka {

    private String naziv;
    private double cena;


    public Stavka(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String novNaziv) {
        this.naziv = novNaziv;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double novaCena) {
        this.cena = novaCena;
    }

    public String toString(){
        return naziv+" "+cena;
    }
}
