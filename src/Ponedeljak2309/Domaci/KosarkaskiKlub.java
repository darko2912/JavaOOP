package Ponedeljak2309.Domaci;

import java.util.ArrayList;

public class KosarkaskiKlub extends Klub{
    /*
    Napraviti klasu KosarkaskiKlub koja nasleđuje klasu Klub, i dodati specifičnu metodu:
- sampionTima() -> vraća ime igraca koji ima više od 1000 postignutih poena.
     */
    public KosarkaskiKlub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    @Override
    public double vrednostTima() {
        double vrednost=0;
        for (Igrac i:getListaIgraca()){
            vrednost+=i.getBrojPoena()*50;
        }
        return vrednost;
    }

    public void sampionTima(){
        System.out.println("Igrači koji imaju više od 1000 poena: ");
        for (Igrac i:getListaIgraca()){
            if (i.getBrojPoena()>1000){
                System.out.println(i.getIme());
            }
        }
    }


}
