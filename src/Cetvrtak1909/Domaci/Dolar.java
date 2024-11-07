package Cetvrtak1909.Domaci;

public class Dolar extends Valuta{
    public Dolar(double kurs) {
        super("Dolar", "USD", kurs);
    }

    public void postaviNoviKurs(double noviKurs){
        setKurs(noviKurs);
        System.out.println("Novi kurs dolara je "+getKurs());
    }
}
