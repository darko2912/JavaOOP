package ProbniTest;

import java.util.ArrayList;

public class SportVision extends Prodavnica{
    /*
    Napraviti klasu SportVision I on nasleđuje klasu Prodavnica i za black Friday daje popust
    od 30% na sve artikle.
     */
    public SportVision(int brojZaposlenih, ArrayList<Artikl> listaArtikala) {
        super(brojZaposlenih, listaArtikala);
    }

    @Override
    public void blackFriday() {
        for (Artikl a:getListaArtikala()){
            a.setCena(a.getCena()*0.7);
        }
        System.out.println("Artkili sa novim cenama: "+getListaArtikala());
    }
}
