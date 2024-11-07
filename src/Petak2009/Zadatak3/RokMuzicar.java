package Petak2009.Zadatak3;

public class RokMuzicar extends Muzicar{
    public RokMuzicar(String ime, int godinaPocetkaKarijere, Album a) {
        super(ime, godinaPocetkaKarijere, a);
    }

    @Override
    public double zarada() {
        return getA().getBrojPesama()*750;
    }
}
