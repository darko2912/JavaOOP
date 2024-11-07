package Sreda1809.Zadatak5;

import Sreda1809.Zadatak4.Knjiga;

public class Autor {
    /*
    Napraviti klasu Autor koji u sklopu ima ime, godinu rodjenja,ukupan broj prodanih dela i jednu knjigu.(Kombinujemo sa klasom knjiga)
Napraviti metodu:
-ranaObjava() -> ispisati poruku ako je autor objavio svoju knjigu pre 25 godine
-zarada() -> Koliko je zaradio ukupno para od svih prodanih dela ako racunamo da imaju isti cenu kao ta jedna knjiga
     */

    private String ime;
    private int godinaRodjenja;
    private int prodanihDela;
    private Knjiga k;

    public Autor(String ime, int godinaRodjenja, int prodanihDela, Knjiga k) {
        this.ime=ime;
        this.godinaRodjenja=godinaRodjenja;
        this.prodanihDela=prodanihDela;
        this.k=k;
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }
    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public int getProdanihDela() {
        return prodanihDela;
    }
    public void setProdanihDela(int prodanihDela) {
        this.prodanihDela = prodanihDela;
    }
    public Knjiga getK() {
        return k;
    }
    public void setK(Knjiga novaKnjiga) {
        this.k = novaKnjiga;
    }

    public void ranaObjava(){
        if (getK().getGodinaIzdanja()-getGodinaRodjenja()<=25){
            System.out.println("Knjiga je objavljena pre navršenih 25 godina.");
        } else {
            System.out.println("Knjiga je objavljena nakon navršenih 25 godina.");
        }
    }
    public void zarada(){
        double zarada = getProdanihDela()*getK().popust();
        System.out.println("Ukupno zarađeno: "+zarada);
    }

    public String toString() {
        return ime+" "+godinaRodjenja+" "+prodanihDela+" "+k;
    }
}
