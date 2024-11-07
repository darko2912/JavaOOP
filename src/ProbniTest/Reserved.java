package ProbniTest;

import java.util.ArrayList;

public class Reserved extends Prodavnica{
    /*
    Napraviti klasu Reserved koji ima dodatni atribut za ocekivanu godisnju zaradu, ukoliko je to ispunjeno
svi zaposleni dobijaju platu od 200, u suprotnom imaju platu od 100.
     */
    private double ocekivanaGodZarada;
    public Reserved(int brojZaposlenih, ArrayList<Artikl> listaArtikala, double ocekivanaGodZarada) {
        super(brojZaposlenih, listaArtikala);
        this.ocekivanaGodZarada=ocekivanaGodZarada;
    }

    public double getOcekivanaGodZarada() {
        return ocekivanaGodZarada;
    }

    public void setOcekivanaGodZarada(double ocekivanaGodZarada) {
        this.ocekivanaGodZarada = ocekivanaGodZarada;
    }

    @Override
    public double ukupnaZarada() {
        double zarada=0;
        for (Artikl a:getListaArtikala()){
            zarada+=a.getCena();
        }
        if (zarada>=getOcekivanaGodZarada()){
            return zarada-(getBrojZaposlenih()*200);
        } else {
            return zarada-(getBrojZaposlenih()*100);
        }
    }

    public String toString() {
        return ocekivanaGodZarada+" ";
    }
}
