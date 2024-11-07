package Cetvrtak1909.Domaci;

public class Euro extends Valuta{
    public Euro(double kurs) {
        super("Euro", "EUR", kurs);
    }

    public void postaviNoviKurs(double noviKurs){
        setKurs(noviKurs);
        System.out.println("Novi kurs eura je "+getKurs());
    }
}
