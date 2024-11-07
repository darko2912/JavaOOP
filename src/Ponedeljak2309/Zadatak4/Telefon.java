package Ponedeljak2309.Zadatak4;

import java.util.ArrayList;

public class Telefon {
    /*
    Napraviti klasu Telefon koji kao atribut ima naziv i listu aplikacija. Napraviti metodu:
- najkoriscenija() -> vraca aplikaciju koja se najvise koristi
- netWorth() -> vraca ukupnu zaradu svih aplikacija koje telefon ima
- delete(Aplikacija a) -> brise aplikaciju iz liste - ako se ta aplikacija nalazi u listi obrisati.
     */
    private String naziv;
    private ArrayList<Aplikacija> listaAplikacija;


    public Telefon(String naziv, ArrayList<Aplikacija> listaAplikacija) {
        this.naziv = naziv;
        this.listaAplikacija = listaAplikacija;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Aplikacija> getListaAplikacija() {
        return listaAplikacija;
    }

    public void setListaAplikacija(ArrayList<Aplikacija> listaAplikacija) {
        this.listaAplikacija = listaAplikacija;
    }

    public void najkoriscenija(){
        int max=Integer.MIN_VALUE;
        for (Aplikacija a:getListaAplikacija()){
            if (max<a.getBrojKorisnika()){
                max=a.getBrojKorisnika();
            }
        }
        for (Aplikacija a:getListaAplikacija()){
            if (max==a.getBrojKorisnika()){
                System.out.println("Najkorišćenija aplikacija je: "+a);
                break;
            }
        }
    }

    public double netWorth(){
        double zarada=0;
        for (Aplikacija a:getListaAplikacija()){
            zarada+=a.zarada();
        }
        return zarada;
    }

    public void delete (String aplikacija){
        for (int i=0; i<getListaAplikacija().size(); i++){
            if (getListaAplikacija().get(i).getIme().equalsIgnoreCase(aplikacija)){
                getListaAplikacija().remove(i);
            }
        }
    }

    public String toString(){
        return naziv+" "+listaAplikacija;
    }
}
