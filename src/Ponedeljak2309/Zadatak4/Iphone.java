package Ponedeljak2309.Zadatak4;

import java.util.ArrayList;

public class Iphone extends Telefon{
    /*
    Napraviti klasu IPhone koji nasledjuje klasu Telefon i on najvise koristi aplikaciju koja najvise zaradjuje.
     */
    public Iphone(String naziv, ArrayList<Aplikacija> listaAplikacija) {
        super(naziv, listaAplikacija);
    }

    @Override
    public void najkoriscenija() {
        double max=Double.MIN_VALUE;
        for (Aplikacija a:getListaAplikacija()){
            if (max<a.zarada()){
                max=a.zarada();
            }
        }
        for (Aplikacija a:getListaAplikacija()){
            if (max==a.zarada()){
                System.out.println("Najkorišćenija aplikaciju na Iphone-u je: "+a);
            }
        }
    }
}
