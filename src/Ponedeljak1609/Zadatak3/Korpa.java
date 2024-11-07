package Ponedeljak1609.Zadatak3;

import java.util.ArrayList;

public class Korpa {
    ArrayList<Namirnica> lista;

    public Korpa(ArrayList<Namirnica> lista){
        this.lista=lista;
    }

    public String toString (){
        return lista+" ";
    }

    public double ukupnaCena() {
        double racun =0;
        for (Namirnica n:lista){
            racun += n.cena;
        }
        return racun;
    }

}
