package Petak2009.Zadatak1;

public class Pedijatar extends Doktor{
    public Pedijatar(String ime, int brojPacijenata, int godinaZposlenja){
        super(ime,brojPacijenata,godinaZposlenja);
    }

    @Override
    public double plata() {
        double zarada=getBrojPacijenata()*150;
        return zarada;
    }
}