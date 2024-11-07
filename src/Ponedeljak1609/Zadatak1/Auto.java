package Ponedeljak1609.Zadatak1;

public class Auto {

    String model;
    int maksimalnaBrzina;
    double cena;
    String boja;

    public Auto (String model, int maksimalnaBrzina, double cena, String boja){
        this.model = model;
        this.maksimalnaBrzina = maksimalnaBrzina;
        this.cena = cena;
        this.boja = boja;
    }
    public int potrebnoSati() {
        return 1000/maksimalnaBrzina;
    }
    public double cenaSaPopustom() {
        if (boja.equalsIgnoreCase("ljubičasta")){
            return cena-cena*0.1;
        } else {
            return cena;
        }
    }

    public String toString () {
        return model + " " + maksimalnaBrzina + " " + cena + " " + boja;
    }

}
