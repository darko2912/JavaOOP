package Petak2009.Zadatak3;

public class Reper extends Muzicar{
    public Reper(String ime, int godinaPocetkaKarijere, Album a) {
        super(ime, godinaPocetkaKarijere, a);
    }

    @Override
    public double zarada() {
        return getA().getBrojPesama()*500;
    }
}
