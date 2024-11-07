package Petak2009.ApstraktneKlase;

public class Macka  extends Zivotinja{
    public Macka(String naziv){
        super (naziv);
    }

    @Override
    public void oglasiSe() {
        System.out.println("Mjau");
    }
}
