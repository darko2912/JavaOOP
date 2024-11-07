package Petak2009.ApstraktneKlase;

public abstract class Zivotinja {
    private String naziv;

    public Zivotinja (String naziv){
        this.naziv=naziv;
    }

    public abstract void oglasiSe();

    public String getNaziv(){
        return naziv;
    }
}
