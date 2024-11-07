package Petak2009.Zadatak1;

public class Oftalmolog extends Doktor{
    public Oftalmolog(String ime, int brojPacijenata, int godinaZposlenja) {
        super(ime, brojPacijenata, godinaZposlenja);
    }

    @Override
    public double plata() {
        return getBrojPacijenata()*100;
    }
}
