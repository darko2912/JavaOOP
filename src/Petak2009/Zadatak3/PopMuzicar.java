package Petak2009.Zadatak3;

public class PopMuzicar extends Muzicar{
    public PopMuzicar(String ime, int godinaPocetkaKarijere, Album a) {
        super(ime, godinaPocetkaKarijere, a);
    }

    @Override
    public double zarada() {
        return getA().getBrojPesama()*1000;
    }
}
