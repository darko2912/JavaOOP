package Petak2009.Zadatak2;

import java.util.ArrayList;

public abstract class Ucenik {
    /*
    Napraviti klasu Ucenik koji ima kao atribute ime, fiksna cena skolovanja, listu ocena I broj neopravdanih.
Napraviti metode:
- zaUkor() -> vraca true ili false u zavisnosti od toga da li djak ispunjava neke uslove za ukor
(da li ima vise od 10 nepravdanih ili ako ima vise od 10 jedinica).
- cenaSkolovanja() -> vraca punu cenu skolovanja ako racunamo da pored vec fiksnih troskova imamo I druge troskove koji
iznose 15% od fiksne cene skolovanja
Klasa Osnovac nasledjuje klasu Ucenik.
Klasa SrednjoSkolac nasledjuje klasu Ucenik I on ima 25% dodatnih troskova.
Klasa Student nasledjuje klasu Ucenik I on ima 30% dodatnih troskova.
     */
    private String ime;
    private Double cenaSkolovanja;
    private ArrayList<Integer> ocene;
    private int neopravdani;

    public Ucenik(String ime, double cenaSkolovanja, ArrayList<Integer> ocene, int neopravdani){
        this.ime=ime;
        this.cenaSkolovanja=cenaSkolovanja;
        this.ocene=ocene;
        this.neopravdani=neopravdani;
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String novoIme) {
        this.ime = novoIme;
    }
    public Double getCenaSkolovanja() {
        return cenaSkolovanja;
    }
    public void setCenaSkolovanja(Double novaCenaSkolovanja) {
        this.cenaSkolovanja = novaCenaSkolovanja;
    }
    public ArrayList<Integer> getOcene() {
        return ocene;
    }
    public void setOcene(ArrayList<Integer> novaLista) {
        this.ocene = novaLista;
    }
    public int getNeopravdani() {
        return neopravdani;
    }
    public void setNeopravdani(int noviNeopravdani) {
        this.neopravdani = noviNeopravdani;
    }

    private int brojJedinica(){
        int brojac=0;
        for (Integer i:getOcene()){
            if (i==1){
                brojac++;
            }
        }
        return brojac;
    }

    public boolean zaUkor(){
        boolean ukor=false;
        if (getNeopravdani()>10 || brojJedinica()>10){
            ukor=true;
        }
        return ukor;
    }

    public abstract double ukupnaCenaSkolovanja();

    public String toString(){
        return ime+" "+cenaSkolovanja+" "+ocene+" "+neopravdani;
    }
}
