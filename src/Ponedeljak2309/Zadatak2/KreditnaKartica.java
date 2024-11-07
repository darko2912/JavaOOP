package Ponedeljak2309.Zadatak2;

public class KreditnaKartica {
    private double stanjeNaRacunu;


    public KreditnaKartica(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }
    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }
    public void setStanjeNaRacunu(double novoStanje) {
        this.stanjeNaRacunu = novoStanje;
    }
    public String toString(){
        return stanjeNaRacunu+" ";
    }
}
