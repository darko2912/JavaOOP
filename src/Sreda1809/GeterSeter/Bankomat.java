package Sreda1809.GeterSeter;

public class Bankomat {
        /*
    Enkapasulacija podrazumeva sakrivanje informacija
    od krajnih korisnika.
     */

    private double para;

    public Bankomat(double para) {
        this.para=para;
    }

    //Vraca nam kopiju orginalnog polja
    public double getPara() {
        return para;
    }

    //set-er je zaduzen da promeni orginalnu vrednost polja
    public void setPara(double novIznos) {
        this.para=novIznos;
    }



    //vrati mi koliko bi ostalo para kad bi platio 10%
    public void kamata10Posto() {
        double rezultat = getPara()*0.9;
        setPara(getPara()*0.9);
    }

    public String toString() {
        return para + " ";
    }
}
