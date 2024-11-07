package Test;

public class Planina {
    /*
    Napraviti klasu Planina
atributi: naziv(String), visina(double ili int) i opasnost(Boolean)
     */
    private String naziv;
    private int visina;
    private boolean opasnost;


    public Planina(String naziv, int visina, boolean opasnost) {
        this.naziv = naziv;
        this.visina = visina;
        this.opasnost = opasnost;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

    public boolean isOpasnost() {
        return opasnost;
    }

    public void setOpasnost(boolean opasnost) {
        this.opasnost = opasnost;
    }

    public String toString(){
        return naziv+" "+visina+" "+opasnost;
    }
}
