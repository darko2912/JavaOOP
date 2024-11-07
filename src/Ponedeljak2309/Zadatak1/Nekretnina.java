package Ponedeljak2309.Zadatak1;

import java.util.ArrayList;

public class Nekretnina {

    private int kvadratura;
    private double cenaKvadrat;
    private ArrayList<Double> ponuda;

    public Nekretnina(int kvadratura, double cenaKvadrat, ArrayList<Double> ponuda) {
        this.kvadratura = kvadratura;
        this.cenaKvadrat = cenaKvadrat;
        this.ponuda = ponuda;
    }
    public int getKvadratura() {
        return kvadratura;
    }
    public void setKvadratura(int novaKvadratura) {
        this.kvadratura = novaKvadratura;
    }
    public double getCenaKvadrat() {
        return cenaKvadrat;
    }
    public void setCenaKvadrat(double novaCenaKvadrat) {
        this.cenaKvadrat = novaCenaKvadrat;
    }
    public ArrayList<Double> getPonuda() {
        return ponuda;
    }
    public void setPonuda(ArrayList<Double> novaPonuda) {
        this.ponuda = novaPonuda;
    }

    public double najvecaPonuda(){
        double max=ponuda.get(0);
        for (int i=0; i<ponuda.size(); i++){
            if (max<ponuda.get(i)){
                max=ponuda.get(i);
            }
        }
        return max;
    }

    public double cena(){
        double ukupnaCena=getCenaKvadrat()*getKvadratura();
        if (getKvadratura()>100){
            ukupnaCena*=0.85;
        }
        return ukupnaCena;
    }

    public String toString(){
        return kvadratura+" "+cenaKvadrat+" "+ponuda;
    }
}
