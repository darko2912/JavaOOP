package Cetvrtak1909.Nasledjivanje;

public class Brod extends Vozilo {

    private int tezinaBroda;
    public Brod(double cena, int kilometraza, int godinaProizvodnje,int tezinaBroda) {
        super(cena, kilometraza, godinaProizvodnje);
        this.tezinaBroda=tezinaBroda;
    }

}
