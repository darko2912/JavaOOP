package Sreda1809.Zadatak1;

public class Auto {
    /*
    Napraviti klasu Auto koja ima private atribute naziv modela, maksimalnu brzinu na sat, cenu i boju.
    Napraviti getere i setere.
Napraviti metodu koja racuna za Koliko sati taj auto moze da predje 1000km.
Napraviti metodu koja smanjuje cenu za 10% ako je boja automobila ljubicasta.
Klasa mora imati adekvatan konstruktor i toString.
     */

   private String model;
   private int maxBrzina;
   private double cena;
   private String boja;

   public Auto (String model, int maxBrzina, double cena, String boja){
       this.model=model;
       this.maxBrzina=maxBrzina;
       this.cena=cena;
       this.boja=boja;
   }

   public String getModel(){
       return this.model;
   }

   public void setModel(String model) {
       this.model=model;
   }
    public int getMaxBrzina(){
        return this.maxBrzina;
    }

    public void setMaxBrzina(int novaBrzina) {
        this.maxBrzina=novaBrzina;
    }
    public double getCena(){
        return this.cena;
    }

    public void setCena(double novaCena) {
        this.cena=novaCena;
    }
    public String getBoja(){
        return this.boja;
    }

    public void setBoja(String novaBoja) {
        this.boja=novaBoja;
    }

    public int potrebnoSati() {
        return 1000/maxBrzina;
    }
    public double cenaSaPopustom() {
        if (getBoja().equalsIgnoreCase("ljubičasta")){
             setCena(cena*0.9);
        } else getCena();
        return getCena();
    }

   public String toString() {
       return model+" "+maxBrzina+" "+cena+" "+boja;
   }


}
