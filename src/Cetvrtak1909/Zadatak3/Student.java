package Cetvrtak1909.Zadatak3;

import java.util.ArrayList;

public class Student extends Osoba {
    /*
    Kreirati klasu Student koja nasledjuje klasu Osoba i dodaje svoje specificne atribute,
    poput liste predmeta, broja indeksa i proseka ocena. Klasa Student dodaje i metodu za dodavanja predmeta,
    prikaza proseka i overide-uje metodu koja vraca opis, cineci je prilagodjenom za studente. Takodje,
    dodati metodu koja ispisPredmeta(), koja ispisuje sve predmete koje student slusa.
    Lista predmeta sadrzi elemente tipa Predmet.
     */
    private ArrayList<Predmet> listaPredmeta;
    private String brojIndeksa;
    private double prosekOcena;

    public Student(String ime, String prezime, int godinaRodjenja, String brojIndeksa, double prosekOcena) {
        super(ime, prezime, godinaRodjenja);
        this.listaPredmeta=new ArrayList<>();
        this.brojIndeksa=brojIndeksa;
        this.prosekOcena=prosekOcena;
    }
    public ArrayList<Predmet> getListaPredmeta() {
        return listaPredmeta;
    }
    public void setListaPredmeta(ArrayList<Predmet> listaPredmeta) {
        this.listaPredmeta = listaPredmeta;
    }
    public String getBrojIndeksa() {
        return brojIndeksa;
    }
    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
    public double getProsekOcena() {
        return prosekOcena;
    }
    public void setProsekOcena(double prosekOcena) {
        this.prosekOcena = prosekOcena;
    }

    public void dodajPredmet(Predmet predmet){
        listaPredmeta.add(predmet);
        System.out.println("Predmet "+predmet.getImePredmeta()+" je uspešno dodat.");
    }

    public void prosekOcena(){
        System.out.println("Prosek ocena studenta je: "+getProsekOcena());
    }

    @Override
    public void predsaviSe() {
        System.out.println("Ja sam student "+getIme()+" "+getPrezime()+" rođen/a sam "+getGodinaRodjenja()+", broj mog indeksa je "+getBrojIndeksa()+". Lista predmeta koje slušam je: "+getListaPredmeta());
    }

    public void ispisPredmeta(){
        System.out.println("Predmeti koje student sluša: ");
        for (Predmet p:getListaPredmeta()){
            System.out.println(p.getImePredmeta());
        }
    }

    public String toString(){
        return listaPredmeta+" "+brojIndeksa+" "+prosekOcena;
    }
}
