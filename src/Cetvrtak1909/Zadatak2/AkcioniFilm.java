package Cetvrtak1909.Zadatak2;

public class AkcioniFilm extends Film{
    public AkcioniFilm(int godinaObjavljivanja, double ukupnaZarada, Glumac g) {
        super(godinaObjavljivanja, ukupnaZarada, g);
    }

    @Override
    public double troskovi() {
        double trosak=getUkupnaZarada()*0.4;
        return trosak;
    }
}
