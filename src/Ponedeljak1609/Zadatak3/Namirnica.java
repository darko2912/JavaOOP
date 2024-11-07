package Ponedeljak1609.Zadatak3;

public class Namirnica {
    /*
    Napraviti klasu Namirnica koja ima naziv i cenu.
Napraviti klasu Korpa koja ima listu namernica i metodu za racunanje ukupne cene svih namernica.
Klasa mora imati adekvatan konstruktor I toString.
     */
    String naziv;
    double cena;

    public Namirnica (String naziv, double cena) {
        this.naziv=naziv;
        this.cena=cena;
    }

    public String toString (){
        return naziv+" "+cena;
    }
}
