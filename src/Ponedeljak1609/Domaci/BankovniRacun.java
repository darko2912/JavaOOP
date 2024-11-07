package Ponedeljak1609.Domaci;

public class BankovniRacun {
    /*
Kreirati klasu BankovniRacun koja modeluje bankovni racun. Svaki bankovni racun ima svoj jedinstveni broj,
ime vlasnika racuna, i trenutno stanje na racunu.
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

    String brojRacuna;
    String imeVlasnika;
    double trenutnoStanje;

    public BankovniRacun (String brojRacuna, String imeVlasnika, double trenutnoStanje){
        this.brojRacuna=brojRacuna;
        this.imeVlasnika=imeVlasnika;
        this.trenutnoStanje=trenutnoStanje;
    }
    public double uplata (double iznosUplate){
        if (iznosUplate>0){
            trenutnoStanje+=iznosUplate;
            System.out.println("Na Vaš račun je uplaćeno: "+iznosUplate);
        }else {
            System.out.println("Pogrešan iznos za uplatu.");
        }
        return trenutnoStanje;
    }
    public double isplata (double iznosIsplate){
        if (iznosIsplate>0){
            if (iznosIsplate<=trenutnoStanje){
                trenutnoStanje-=iznosIsplate;
                System.out.println("Sa računa je isplaćeno: "+iznosIsplate);
            }else {
                System.out.println("Nemate dovoljno sredstava na računu.");
            }
        } else {
            System.out.println("Pogrešan iznos za podizanje.");
        }
        return trenutnoStanje;
    }
    public String toString() {
        return "Broj računa: "+ brojRacuna +".\nIme vlasnika: "+imeVlasnika+".\nTrenutno stanje na računu: "+trenutnoStanje;
    }
}
