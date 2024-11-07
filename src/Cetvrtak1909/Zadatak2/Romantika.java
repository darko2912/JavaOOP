package Cetvrtak1909.Zadatak2;

public class Romantika extends Film{
    public Romantika(int godinaObjavljivanja, double ukupnaZarada, Glumac g) {
        super(godinaObjavljivanja, ukupnaZarada, g);
    }

    @Override
    public double troskovi() {
        double trosak=getUkupnaZarada()*0.1;
        return trosak;
    }
}
