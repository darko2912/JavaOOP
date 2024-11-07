package Ponedeljak2309.Domaci;

import java.util.ArrayList;

public class OdbojkaškiKlub extends Klub{
    /*
    Napraviti klasu OdbojkaškiKlub koja nasleđuje klasu Klub, i dodati metodu:
- odbrambeniAs() -> vraća ime igrača koji ima najvise poena, ali je igrao manje od 3 godine.
     */
    public OdbojkaškiKlub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    @Override
    public double vrednostTima() {
        double vrednost=0;
        for (Igrac i:getListaIgraca()){
            vrednost+=i.getBrojPoena()*100;
        }
        return vrednost;
    }

    public void odbrambeniAs(){
        String ime=" ";
        int max=Integer.MIN_VALUE;
        for (Igrac i:getListaIgraca()){
            if (max<i.getBrojPoena() && i.getGodinaIskustva()<3){
                max=i.getBrojPoena();
                ime=i.getIme();
            }
        }
        if (ime.equalsIgnoreCase(" ")){
            System.out.println("Nemamo u timu odbrambenog asa.");
        } else {
            System.out.println("Najbolji odbrambeni as je: "+ime);
        }
    }

}
