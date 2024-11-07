package Petak2009.Zadatak2;

import java.util.ArrayList;

public class Osnovac extends Ucenik{
    public Osnovac(String ime, double cenaSkolovanja, ArrayList<Integer> ocene, int neopravdani) {
        super(ime, cenaSkolovanja, ocene, neopravdani);
    }

    @Override
    public double ukupnaCenaSkolovanja() {
        return getCenaSkolovanja()*1.15;
    }
}
