package Sreda1809.Zadatak2;

public class Sportista {
    /*
    Napraviti klasu Sportista koji od atributa ima ime, broj nagrada i godinu rodjenja.
Napraviti metodu:
- penzija(int potrebnoNagrada) -> ova metoda prima kao argument neki potreban broj nagrada da bi
sportista otisao u penziju
- veteran() -> metoda ispisuje poruku o tome da li je ovaj sportista veteran, tj stariji od 40 godina
Napraviti adekvatan konstruktor, get i set metod, kao i toString.
     */
    private String ime;
    private int brojNagrada;
    private int godinaRodjenja;

    public Sportista (String ime, int brojNagrada, int godinaRodjenja) {
        this.ime=ime;
        this.brojNagrada=brojNagrada;
        this.godinaRodjenja=godinaRodjenja;
    }
    public String getIme(){
        return this.ime;
    }
    public void setIme(String novoIme){
        this.ime=novoIme;
    }
    public int getBrojNagrada(){
        return this.brojNagrada;
    }
    public void setBrojNagrada(int noveNagrade){
        this.brojNagrada+=noveNagrade;
    }
    public int getGodinaRodjenja(){
        return this.godinaRodjenja;
    }
    public void setGodinaRodjenja(int novaGodinaRodjenja){
        this.godinaRodjenja=novaGodinaRodjenja;
    }
    public void penzija (int potrebnoNagrada){
        if (getBrojNagrada()>=potrebnoNagrada){
            System.out.println("Sportista ima više od minimalnog broja nagrada. Može da ide u penziju.");
        } else {
            System.out.println("Sportista nema dovoljan broj nagrada za penziju.");
        }
    }
    public void veteran(){
        if ((2024-getGodinaRodjenja())>=40){
            System.out.println("Sportista je veteran.");
        } else {
            System.out.println("Sportista nije veteran.");
        }
    }
    public String toString(){
        return ime+" "+brojNagrada+" "+godinaRodjenja;
    }

}
