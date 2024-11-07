package Ponedeljak2309.Zadatak1;

import java.util.ArrayList;

public class Kuca extends Nekretnina{
    public Kuca(int kvadratura, double cenaKvadrat, ArrayList<Double> ponuda) {
        super(kvadratura, cenaKvadrat, ponuda);
    }

    @Override
    public double cena() {
        double ukupnaCena=getCenaKvadrat()*getKvadratura();
        if (getKvadratura()>200){
            ukupnaCena*=0.8;
        }
        return ukupnaCena;
    }
}
