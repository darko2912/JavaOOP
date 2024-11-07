package Sreda1809.Zadatak4;

public class Knjiga {
    /*
    Napraviti klasu Knjiga koja ima od atributa naziv, broj strana,godinu izdanja i cenu.
Napraviti metodu:
-popust() -> ako je duzina knjige veca od 300 strana, umanjiti za 20%
-oldTimer() -> ako je knjiga starija od 20 godina, ispisati poruku da je u pitanju stara knjiga
     */

    private String naziv;
    private int brojStrana;
    private int godinaIzdanja;
    private double cena;

    public Knjiga (String naziv, int brojStrana, int godinaIzdanja, double cena){
        this.naziv=naziv;
        this.brojStrana=brojStrana;
        this.godinaIzdanja=godinaIzdanja;
        this.cena=cena;
    }

    public String getNaziv(){
        return this.naziv;
    }
    public void setNaziv(String noviNaziv){
        this.naziv=noviNaziv;
    }
    public int getBrojStrana() {
        return this.brojStrana;
    }
    public void setBrojStrana(int noviBroj){
        this.brojStrana=noviBroj;
    }
    public int getGodinaIzdanja(){
        return this.godinaIzdanja;
    }
    public void setGodinaIzdanja(int novaGodina){
        this.godinaIzdanja=novaGodina;
    }
    public double getCena(){
        return this.cena;
    }
    public void setCena(double novaCena){
        this.cena=novaCena;
    }

    public double popust(){
        double novaCena=getCena();
        if (getBrojStrana()>300) {
            novaCena = getCena() * 0.8;
            setCena(novaCena);
        }
        return novaCena;
    }

    public void oldTimer(int trenutnaGodina){
        if ((trenutnaGodina-getGodinaIzdanja())>20){
            System.out.println("Stara knjiga.");
        } else {
            System.out.println("Knjiga nije stara.");
        }
    }

    public String toString(){
        return naziv+" "+brojStrana+" "+godinaIzdanja+" "+cena;
    }
}
