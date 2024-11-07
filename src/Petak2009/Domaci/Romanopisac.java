package Petak2009.Domaci;

import java.util.ArrayList;

public class Romanopisac extends Pisac {
    public Romanopisac(String ime, int godinaRodjenja, ArrayList<Knjiga> knjige) {
        super(ime, godinaRodjenja, knjige);
    }

    public void dugometrazniRoman(){
        for (Knjiga k:getKnjige()){
            if (k.getBrojStrana()>500){
                System.out.println(k.getNaslov()+" je dugometražni roman.");
            }
        }
    }
}
