package Ponedeljak2309.Domaci;

import java.util.ArrayList;

public class FudbalskiKlub extends Klub {
    /*
    Napraviti klasu FudbalskiKlub koja nasleđuje klasu Klub, i dodati metodu:
- najboljiStrelac() -> vraca ime igraca sa najvise postignutih golova
(golove cemo interpretirati kao postignute poene).
     */

    public FudbalskiKlub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    @Override
    public double vrednostTima() {
        double vrednost = 0;
        for (Igrac i : getListaIgraca()) {
            vrednost += i.getBrojPoena() * 1000;
        }
        return vrednost;
    }

    public String najboljiStrelac() {
        Igrac strelac = getListaIgraca().get(0);
        for (Igrac i : getListaIgraca()) {
            if (strelac.getBrojPoena() < i.getBrojPoena()) {
                strelac = i;
            }
        }
        return strelac.getIme();
    }
}