package Ponedeljak2309.Zadatak2;

public class Main {
    public static void main(String[] args) {
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
        Korpa k=new OnlineKorpa(new Stavka("Hleb",100),new KreditnaKartica(200));
        k.plati();
        System.out.println(k.viseStavki());
    }
}
