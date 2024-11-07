package Ponedeljak2309.Zadatak3;

import java.util.ArrayList;

public class Ucenik {

    private String ime;
    private int brojNeopravdaniv;
    private ArrayList<Integer> listaOcena;


    public Ucenik(String ime, int brojNeopravdaniv, ArrayList<Integer> listaOcena) {
        this.ime = ime;
        this.brojNeopravdaniv = brojNeopravdaniv;
        this.listaOcena = listaOcena;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrojNeopravdaniv() {
        return brojNeopravdaniv;
    }

    public void setBrojNeopravdaniv(int brojNeopravdaniv) {
        this.brojNeopravdaniv = brojNeopravdaniv;
    }

    public ArrayList<Integer> getListaOcena() {
        return listaOcena;
    }

    public void setListaOcena(ArrayList<Integer> listaOcena) {
        this.listaOcena = listaOcena;
    }

    public double prosek (){
        double sum=0;
        for (Integer i:getListaOcena()){
            sum+=i;
        }
        return sum/getListaOcena().size();
    }

    public String toString(){
        return ime+" "+brojNeopravdaniv+" "+listaOcena;
    }
}
