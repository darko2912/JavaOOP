package ProbniTest;

import java.util.ArrayList;

public class Prodavnica {
    /*
    Napraviti klasu Prodavnica koja od atributa ima broj zaposlenih I listu artikala.
Napraviti metode:
-blackFriday() -> sve artikle iz liste spusta za 50%
-pronadji(String a) -> trazi prosledjeni naziv u listi artikala
-triftKolekcija() -> vraca listu artikala koji su stariji od 20 godina
-ukupnaZarada() -> racuna Koliko prodavnica zaradjuje kada proda sve artikle, uz to da svakog zaposlenog placaju 100
-izbaciPrestaro() -> izbacuje iz liste sve artikle koji su stariji od 30 god
     */

    private int brojZaposlenih;
    private ArrayList<Artikl> listaArtikala;

    public Prodavnica(int brojZaposlenih, ArrayList<Artikl> listaArtikala) {
        this.brojZaposlenih = brojZaposlenih;
        this.listaArtikala = listaArtikala;
    }

    public int getBrojZaposlenih() {
        return brojZaposlenih;
    }

    public void setBrojZaposlenih(int brojZaposlenih) {
        this.brojZaposlenih = brojZaposlenih;
    }

    public ArrayList<Artikl> getListaArtikala() {
        return listaArtikala;
    }

    public void setListaArtikala(ArrayList<Artikl> listaArtikala) {
        this.listaArtikala = listaArtikala;
    }

    public void blackFriday(){
        for (Artikl a:getListaArtikala()){
            a.setCena(a.getCena()*0.5);
        }
        System.out.println("Cena artikala za BlackFriday: "+getListaArtikala());
    }

    public void pronadji(String traziArtikal){
        boolean pronađena=false;
        for (Artikl a:getListaArtikala()){
            if (traziArtikal.equalsIgnoreCase(a.getNaziv())){
                pronađena=true;
                System.out.println("Informacije o traženom artiklu: "+a);
                break;
            }
        }
        if (!pronađena){
            System.out.println("Artikal nepostoji.");
        }
    }

    public ArrayList<Artikl> triftKolekcija(){
        ArrayList<Artikl> lista=new ArrayList<>();
        for (Artikl a:getListaArtikala()){
            if ((2024-a.getGodinaProizvodnje())>20){
                lista.add(a);
            }
        }
        return lista;
    }

    public double ukupnaZarada(){
        double zarada=0;
        for (Artikl a:getListaArtikala()){
            zarada+=a.getCena();
        }
        return zarada-(getBrojZaposlenih()*100);
    }

    public void izbaciPrestaro(){
        ArrayList<Artikl> novaLista=new ArrayList<>();
        for (Artikl a:getListaArtikala()){
            if ((2024-a.getGodinaProizvodnje())<=30){
                novaLista.add(a);
            }
        }
        setListaArtikala(novaLista);
        System.out.println("Nova lista bez izbačenog artikla: "+getListaArtikala());
    }

    public String toString(){
        return brojZaposlenih+" "+listaArtikala;
    }
}
