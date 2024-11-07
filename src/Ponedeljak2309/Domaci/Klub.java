package Ponedeljak2309.Domaci;

import java.util.ArrayList;

public abstract class Klub {
    /*
    Napraviti klasu Klub koja ima atribute: naziv, grad, i lista igraca (lista objekata klase Igrac).
Napraviti metode:
- najiskusnijiIgrac() -> vraca ime igrača sa najvise godina iskustva.
- ukupnoPoena() -> vraća ukupan broj poena koje su postigli svi igrači u klubu.
- vrednostTima() -> vraca vrednost tima (apstraktan metod)
     */
    private String naziv;
    private String grad;
    private ArrayList<Igrac> listaIgraca;

    public Klub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        this.naziv = naziv;
        this.grad = grad;
        this.listaIgraca = listaIgraca;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public ArrayList<Igrac> getListaIgraca() {
        return listaIgraca;
    }

    public void setListaIgraca(ArrayList<Igrac> listaIgraca) {
        this.listaIgraca = listaIgraca;
    }

    public String najiskusnijiIgrac(){
        Igrac najiskusniji=getListaIgraca().get(0);
        for (Igrac i:getListaIgraca()){
            if (najiskusniji.getGodinaIskustva()<i.getGodinaIskustva()){
                najiskusniji=i;
            }
        }
        return najiskusniji.getIme();
    }

    public int ukupnoPoena(){
        int rezultat=0;
        for (Igrac i:getListaIgraca()){
            rezultat+=i.getBrojPoena();
        }
        return rezultat;
    }

    public abstract double vrednostTima();

    public String toString(){
        return naziv+" "+grad+" "+listaIgraca;
    }
}
