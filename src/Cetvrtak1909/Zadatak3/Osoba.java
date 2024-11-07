package Cetvrtak1909.Zadatak3;

public class Osoba {
    /*
    Implementirati klasu Osoba koja ima ime, prezime, god rodjenja i metodu za predstavljanje
     */
    private String ime;
    private String prezime;
    private int godinaRodjenja;

    public Osoba(String ime, String prezime, int godinaRodjenja){
        this.ime=ime;
        this.prezime=prezime;
        this.godinaRodjenja=godinaRodjenja;
    }
    public String getIme(){
        return ime;
    }
    public void setIme(String novoIme){
        this.ime=novoIme;
    }
    public String getPrezime(){
        return prezime;
    }
    public void setPrezime(String novoPrezime){
        this.prezime=novoPrezime;
    }
    public int getGodinaRodjenja(){
        return godinaRodjenja;
    }
    public void setGodinaRodjenja(int novaGodina){
        this.godinaRodjenja=novaGodina;
    }

    public void predsaviSe(){
        System.out.println("Moje ime i prezime je "+getIme()+" "+getPrezime()+", i rođen/a sam "+getPrezime()+".");
    }

    public String toString(){
        return ime+" "+prezime+" "+godinaRodjenja;
    }
}
