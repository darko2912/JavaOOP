package Petak2009.Domaci;

import java.util.ArrayList;

public class Eseista extends Pisac{
    public Eseista(String ime, int godinaRodjenja, ArrayList<Knjiga> knjige) {
        super(ime, godinaRodjenja, knjige);
    }

    public int kratkiEsej(){
        int brojac=0;
        for (Knjiga k:getKnjige()){
            if (k.getBrojStrana()<50){
                brojac++;
            }
        }
        return brojac;
    }
}
