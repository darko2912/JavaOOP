package Petak2009.Domaci;

import java.util.ArrayList;

public class Pisac {

    private String ime;
    private int godinaRodjenja;
    private ArrayList<Knjiga> knjige;

    public Pisac (String ime, int godinaRodjenja, ArrayList<Knjiga> knjige){
        this.ime=ime;
        this.godinaRodjenja=godinaRodjenja;
        this.knjige=knjige;
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
    public ArrayList<Knjiga> getKnjige(){
        return knjige;
    }
    public void setKnjige(ArrayList<Knjiga> noveKnjige){
        this.knjige=noveKnjige;
    }

    public String najpoznatijaKnjiga(){
        Knjiga najpoznatija=knjige.get(0);
        for (Knjiga k:knjige){
            if (najpoznatija.getBrojStrana()<k.getBrojStrana()){
                najpoznatija=k;
            }
        }
        return najpoznatija.getNaslov();
    }

    public int vremePisanja(){
        int maks=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (Knjiga k:knjige){
            if (maks<k.getGodinaIzdanja()){
                maks=k.getGodinaIzdanja();
            }
        }
        for (Knjiga k:knjige){
            if (min>k.getGodinaIzdanja()){
                min=k.getGodinaIzdanja();
            }
        }
        return maks-min;
    }

    public String toString(){
        return ime+" "+godinaRodjenja+" "+knjige;
    }
}
