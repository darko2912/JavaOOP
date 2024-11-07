package ProbniTest;

import java.util.ArrayList;

public class Zara extends Prodavnica {
    /*
    Napraviti klasu Zara koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 200.
     */
    public Zara(int brojZaposlenih, ArrayList<Artikl> listaArtikala) {
        super(brojZaposlenih, listaArtikala);
    }

    @Override
    public double ukupnaZarada() {
        double zarada=0;
        for (Artikl a:getListaArtikala()){
            zarada+=a.getCena();
        }
        return zarada-(getBrojZaposlenih()*200);
    }
}
