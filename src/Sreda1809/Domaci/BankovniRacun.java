package Sreda1809.Domaci;

public class BankovniRacun {
    /*
    Kreirati klasu BankovniRacun koja modeluje bankovni racun. Svaki bankovni racun ima svoj jedinstveni broj,
ime vlasnika racuna, i trenutno stanje na racunu. Uraditi enkapsulaciju.
Implementirati konstruktor koji postavlja vrednosti ovih atributa pri kreiranju racuna.
Dodati metode uplata i isplata koje omogucavaju uplatu i isplatu novca sa racuna.
Obe metode primaju iznos kao argument. Metoda uplata povecava trenutno stanje racuna za dati iznos,
dok metoda skidanje smanjuje trenutno stanje racuna.
Implementirati provere da li je iznos uplate ili skidanja pozitivan i da li postoji dovoljno
sredstava na racunu za skidanje.
Napisati metodu toString koja generise string reprezentaciju objekta, uključujući broj racuna,
ime vlasnika i trenutno stanje na racunu.
U main metodi, kreirati objekat klase BankovniRacun, ispisati informacije o računu pomocu
metode toString, izvrsiti nekoliko uplata i skidanja novca na računu pomoću metoda uplata i
skidanje, te na kraju ispisati azurirane informacije o racunu.
     */

    private String brojRacuna;
    private String vlasnikRacuna;
    private double trenutnoStanje;

    public BankovniRacun (String brojRacuna, String vlasnikRacuna, double trenutnoStanje){
        this.brojRacuna=brojRacuna;
        this.vlasnikRacuna=vlasnikRacuna;
        this.trenutnoStanje=trenutnoStanje;
    }
    public String getBrojRacuna(){
        return brojRacuna;
    }
    public void setBrojRacuna(String noviRacun){
        this.brojRacuna=noviRacun;
    }
    public String getVlasnikRacuna(){
        return vlasnikRacuna;
    }
    public void setVlasnikRacuna(String noviVlasnik){
        this.vlasnikRacuna=noviVlasnik;
    }
    public double getTrenutnoStanje(){
        return trenutnoStanje;
    }
    public void setTrenutnoStanje(double novoStanje){
        this.trenutnoStanje=novoStanje;
    }

    public double uplata(double uplataNovca){
        double novoStanje=getTrenutnoStanje();
        if (uplataNovca>0){
            novoStanje+=uplataNovca;
            System.out.println("Uspešno ste uplatili "+uplataNovca+" na vaš račun.");
            setTrenutnoStanje(novoStanje);
        } else {
            System.out.println("Pogrešan iznos.");
        }
        return getTrenutnoStanje();
    }
    public double isplata(double isplataNovca){
        double novoStanje=getTrenutnoStanje();
        if (isplataNovca<0){
            System.out.println("Pogrešan iznos.");
        } else if (isplataNovca>=getTrenutnoStanje()) {
            System.out.println("Nemate dovoljno sredstava na računu.");
        } else {
            novoStanje-=isplataNovca;
            setTrenutnoStanje(novoStanje);
            System.out.println("Uspešno ste skinuli sa računa "+isplataNovca);
        }
        return getTrenutnoStanje();
    }

    public String toString (){
        return brojRacuna+" "+vlasnikRacuna+" "+trenutnoStanje;
    }
}
