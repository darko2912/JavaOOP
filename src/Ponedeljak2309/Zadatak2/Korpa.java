package Ponedeljak2309.Zadatak2;

public class Korpa {
    /*
    Napraviti klasu Stavka koja ima od atributa naziv i cenu.
Napraviti klasu KreditnaKartica koja od atributa ima stanje na racunu.
Napraviti klasu Korpa koji ima od atributa jednu stavku i kreditnu karticu.
Napraviti metode:
- plati() -> skida pare sa kreditne kartice u iznosu od cene stavke, ukoliko nema dovoljno, ispisati poruku.
- viseStavki() -> vraca nam Koliko puta mozemo da kupimo tu stavku sa parama koje imamo
OnlineKorpa nasledjuje klasu Korpa i on prilikom placanja daje popust od 10%.
FizickaKorpa nasledjuje klasu Korpa.
     */
    Stavka stavka;
    KreditnaKartica kk;

    public Korpa(Stavka stavka, KreditnaKartica kk) {
        this.stavka = stavka;
        this.kk = kk;
    }

    public Stavka getStavka() {
        return stavka;
    }
    public void setStavka(Stavka novaStavka) {
        this.stavka = novaStavka;
    }
    public KreditnaKartica getKk() {
        return kk;
    }
    public void setKk(KreditnaKartica novakk) {
        this.kk = novakk;
    }

    public void plati(){
        if (getStavka().getCena()<=getKk().getStanjeNaRacunu()){
            getKk().setStanjeNaRacunu(getKk().getStanjeNaRacunu()-getStavka().getCena());
            System.out.println("Uspešno ste kupili proizvod.");
            System.out.println("Novo stanje je: "+getKk().getStanjeNaRacunu());
        } else {
            System.out.println("Nemate dovoljno sredstava na računu.");
        }
    }

    public int viseStavki(){
        return (int) (getKk().getStanjeNaRacunu() / getStavka().getCena());
    }

    public String toString(){
        return stavka+" "+kk;
    }
}
