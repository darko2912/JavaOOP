package Ponedeljak2309.Domaci;

public class Igrac {
    /*
    Napraviti klasu Igrac koja ima atribute: ime, godine iskustva, i broj postignutih poena.
     */
    private String ime;
    private int godinaIskustva;
    private int brojPoena;


    public Igrac(String ime, int godinaIskustva, int brojPoena) {
        this.ime = ime;
        this.godinaIskustva = godinaIskustva;
        this.brojPoena = brojPoena;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaIskustva() {
        return godinaIskustva;
    }

    public void setGodinaIskustva(int godinaIskustva) {
        this.godinaIskustva = godinaIskustva;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    public String toString(){
        return ime+" "+godinaIskustva+" "+brojPoena;
    }
}
