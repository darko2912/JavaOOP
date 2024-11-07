package Sreda1809.Zadatak3;

public class Radnik {
    /*
    Napraviti klasu Radnik koja ima id, godinu zaposlenja i platu radnika.
Napraviti metodu koja racuna staz radniku i metodu koja daje povisicu za 20%
ukoliko se radnik tu nalazi vise od 5 godina, i povisicu od 40% ukoliko ima
staz duzi od 10 godina.
Napraviti adekvatan konstruktor, get i set metod, kao i toString.
     */
    private int id;
    private int godinaZaposlenja;
    private double plata;

    public Radnik (int id, int godinaZaposlenja, double plata){
        this.id=id;
        this.godinaZaposlenja=godinaZaposlenja;
        this.plata=plata;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int noviId){
        this.id=noviId;
    }
    public int getGodinaZaposlenja(){
        return this.godinaZaposlenja;
    }
    public void setGodinaZaposlenja(int novaGodina){
        this.godinaZaposlenja=novaGodina;
    }
    public double getPlata(){
        return this.plata;
    }
    public void setPlata(double novaPlata){
        this.plata=novaPlata;
    }

    public int staz() {
        return 2024-getGodinaZaposlenja();
    }

    public void povisica(){
        if (staz()>10){
            setPlata(getPlata()*1.4);
        } else if (staz()>5) {
            setPlata(getPlata()*1.2);
        } else {
            setPlata(getPlata());
        }
    }

    public String toString(){
        return id+" "+godinaZaposlenja+" "+plata;
    }
}
