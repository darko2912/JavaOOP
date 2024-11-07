package Ponedeljak2309.Zadatak1;

import java.util.ArrayList;

public class Lokal extends Nekretnina{
    public Lokal(int kvadratura, double cenaKvadrat, ArrayList<Double> ponuda) {
        super(kvadratura, cenaKvadrat, ponuda);
    }

    @Override
    public double cena() {
        double ukupnaCena=getCenaKvadrat()*getKvadratura();
        if (getKvadratura()>250){
            ukupnaCena*=0.75;
        }
        return ukupnaCena;
    }
}
