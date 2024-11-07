package Petak2009.Domaci;

public class Knjiga {

    private String naslov;
    private int brojStrana;
    private int godinaIzdanja;

    public Knjiga(String naslov, int brojStrana, int godinaIzdanja){
        this.naslov=naslov;
        this.brojStrana=brojStrana;
        this.godinaIzdanja=godinaIzdanja;
    }
    public String getNaslov(){
        return naslov;
    }
    public void setNaslov(String noviNaslov){
        this.naslov=noviNaslov;
    }
    public int getBrojStrana(){
        return brojStrana;
    }
    public void setBrojStrana(int noviBroj){
        this.brojStrana=noviBroj;
    }
    public int getGodinaIzdanja(){
        return godinaIzdanja;
    }
    public void setGodinaIzdanja(int novaGodina){
        this.godinaIzdanja=novaGodina;
    }



    public String toString(){
        return naslov+" "+brojStrana+" "+godinaIzdanja;
    }
}