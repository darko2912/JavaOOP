package Cetvrtak1909.Zadatak3;

public class Predmet {
    /*
    Klasa Predmet sadrzi ime predmeta, broj ESPB-a i ime profesora i
metod koji vraca opis predmeta.
     */
    private String imePredmeta;
    private int espb;
    private String imeProfesora;

    public Predmet(String imePredmeta, int espb, String imeProfesora) {
        this.imePredmeta = imePredmeta;
        this.espb = espb;
        this.imeProfesora = imeProfesora;
    }
    public String getImePredmeta() {
        return imePredmeta;
    }
    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }
    public int getEspb() {
        return espb;
    }
    public void setEspb(int espb) {
        this.espb = espb;
    }
    public String getImeProfesora() {
        return imeProfesora;
    }
    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public void opisPredmeta(){
        System.out.println("Naziv predmeta je "+getImePredmeta()+". Ovaj predmet donosi "+getEspb()+" ESPB bodova i predaje ga profesor "+getImeProfesora()+".");
    }

    public String toString(){
        return imePredmeta+" "+espb+" "+imeProfesora;
    }
}
